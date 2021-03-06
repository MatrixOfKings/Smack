package com.almoalm.kinan.smack.Controllers

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.almoalm.kinan.smack.R
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View){
        val random = Random()
        val avatarColor = random.nextInt(2)
        val avatarNum = random.nextInt(28)

        if(avatarColor == 0){
            userAvatar = "light$avatarNum"
        }else{
            userAvatar = "dark$avatarNum"
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)
    }

    fun createBackgroundColorBtnClicked(view: View){
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        val saveR = r.toDouble() / 255
        val saveG = g.toDouble() / 255
        val saveB = b.toDouble() / 255
        avatarColor = "[$saveR, $saveG, $saveB, 1]"
    }

    fun createUserBtnClicked(view: View){

    }
}

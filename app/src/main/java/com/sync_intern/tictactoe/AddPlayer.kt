package com.sync_intern.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddPlayer : AppCompatActivity() {
    private lateinit var etPlayerXName :EditText
    private lateinit var etPlayerOName :EditText
    lateinit var btnStartGame : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_player)
        etPlayerXName =findViewById(R.id.et_player_x_name)
        etPlayerOName =findViewById(R.id.et_player_o_name)
        btnStartGame=findViewById(R.id.btn_start_game)
        btnStartGame.setOnClickListener {
            val player1name=etPlayerXName.text.toString()
            val player2name=etPlayerOName.text.toString()
            if (player1name.isEmpty() || player2name.isEmpty()){
                Toast.makeText(this,"Please Enter Player Name",Toast.LENGTH_SHORT).show()
            }else{
                Intent(this,MainActivity::class.java).also {
                    it.putExtra("player1name",player1name)
                    it.putExtra("player2name",player2name)
                startActivity(it)
                }

                }
            }

        }

    }

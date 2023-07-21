package com.sync_intern.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var tvplayer1Name: TextView
    lateinit var tvplayer2Name: TextView
    lateinit var btn1: ImageView
    lateinit var btn2: ImageView
    lateinit var btn3: ImageView
    lateinit var btn4: ImageView
    lateinit var btn5: ImageView
    lateinit var btn6: ImageView
    lateinit var btn7: ImageView
    lateinit var btn8: ImageView
    lateinit var btn9: ImageView
    private lateinit var playerOneLayout: LinearLayout
    private lateinit var playerTwoLayout: LinearLayout
    private var playerTurn = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvplayer1Name = findViewById(R.id.tvPlayer1Name)
        tvplayer2Name = findViewById(R.id.tvPlayer2Name)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        playerOneLayout = findViewById(R.id.playerOneLayout)
        playerTwoLayout = findViewById(R.id.playerTwoLayout)
        val intent = intent
        val player1 = intent.getStringExtra("player1name")
        val player2 = intent.getStringExtra("player2name")
        tvplayer1Name.text = player1
        tvplayer2Name.text = player2

        btn1.setOnClickListener {
            if (playerTurn == 1) {
                btn1.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)

            } else {
                btn1.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn1.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()

        }
        btn2.setOnClickListener {
            if (playerTurn == 1) {
                btn2.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn2.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn2.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn3.setOnClickListener {
            if (playerTurn == 1) {
                btn3.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn3.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn3.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn4.setOnClickListener {
            if (playerTurn == 1) {
                btn4.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn4.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn4.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn5.setOnClickListener {
            if (playerTurn == 1) {
                btn5.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn5.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn5.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn6.setOnClickListener {
            if (playerTurn == 1) {
                btn6.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn6.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn6.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn7.setOnClickListener {
            if (playerTurn == 1) {
                btn7.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn7.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn7.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn8.setOnClickListener {
            if (playerTurn == 1) {
                btn8.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn8.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn8.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }
        btn9.setOnClickListener {
            if (playerTurn == 1) {
                btn9.setBackgroundResource(R.drawable.img_x)
                playerTurn = 2
                changePlayerTurn(playerTurn)
            } else {
                btn9.setBackgroundResource(R.drawable.img_o)
                playerTurn = 1
                changePlayerTurn(playerTurn)
            }
            btn9.tag = if (playerTurn == 1) "x" else "o"
            checkWinner()
        }

        val btnResetGame =findViewById<AppCompatButton>(R.id.reset_game)
        btnResetGame.setOnClickListener{
            Toast.makeText(this,"Game Reset",Toast.LENGTH_SHORT).show()
          resetGame()
        }

    }
    private fun resetGame() {
        val buttons = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for (button in buttons) {
            button.setBackgroundResource(R.color.white)
            button.tag = null
        }
        playerTurn = 1
    }


    private fun changePlayerTurn(playerTurn: Int) {
        if (playerTurn == 2) {
            playerOneLayout.setBackgroundResource(R.drawable.white_border)
            playerTwoLayout.setBackgroundResource(R.drawable.rounded_rectangle)
        } else {
            playerOneLayout.setBackgroundResource(R.drawable.rounded_rectangle)
            playerTwoLayout.setBackgroundResource(R.drawable.white_border)

        }
    }

    private fun checkWinner() {
        val playerSymbol = if (playerTurn == 1) "x" else "o"

        if (checkCombination(btn1, btn2, btn3, symbol = playerSymbol) ||
            checkCombination(btn4, btn5, btn6, symbol = playerSymbol) ||
            checkCombination(btn7, btn8, btn9, symbol = playerSymbol) ||
            checkCombination(btn1, btn4, btn7, symbol = playerSymbol) ||
            checkCombination(btn2, btn5, btn8, symbol = playerSymbol) ||
            checkCombination(btn3, btn6, btn9, symbol = playerSymbol) ||
            checkCombination(btn1, btn5, btn9, symbol = playerSymbol) ||
            checkCombination(btn3, btn5, btn7, symbol = playerSymbol)
        ) {
            if (playerTurn == 1) {
                showWinner(tvplayer2Name.text.toString())
            } else {
                showWinner(tvplayer1Name.text.toString())
            }
        } else if (areAllButtonsClicked()) {
            showDraw()
        }
    }


    private fun checkCombination(vararg buttons: ImageView, symbol: String = "x"): Boolean {
        for (button in buttons) {
            if (button.tag != symbol) {
                return false
            }
        }
        return true
    }


    private fun areAllButtonsClicked(): Boolean {
        val buttons = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for (button in buttons) {
            if (button.tag == null || button.tag == "") {
                return false
            }
        }
        return true
    }

    private fun showWinner(winnerName: String) {
        Toast.makeText(this, "$winnerName is the winner!", Toast.LENGTH_SHORT).show()

    }

    private fun showDraw() {
        Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show()
    }
}

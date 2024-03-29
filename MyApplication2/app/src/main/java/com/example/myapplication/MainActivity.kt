package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MessageCard(Message(author = "Android", body = "JetPack Compose"))
            }
        }
}

data class Message(val author:String, val body:String)
@Composable
fun MessageCard(msg: com.example.myapplication.Message){
    //Text(text = msg.author)
    //Text(text = msg.body)
    Column {

    }
        Row (modifier = Modifier.padding(all = 36.dp)){
            Image(painter = painterResource(R.drawable.pinguim),
                contentDescription = "Contact Profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
                    }
        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(msg = Message(author = "Android", body = "JetPackCompose"))
}

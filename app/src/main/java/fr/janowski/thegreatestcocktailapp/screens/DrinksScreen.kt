package fr.janowski.thegreatestcocktailapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun DrinksScreen(modifier: Modifier, onDrinkClick: (String) -> Unit) {
    val list = listOf( "Manathan", "Pina colada")
    val context = LocalContext.current
    LazyColumn(modifier
        .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(list){ drink ->
            Card(Modifier.clickable {
                // Ugly way
//                val activity = context as? ComponentActivity
//                val intent = Intent(context, DrinksActivity::class.java)
//                activity?.startActivity(intent)
                onDrinkClick(drink)
            }) {
                Text("${drink}",
                    Modifier
                        .padding(8.dp)
                        .fillMaxWidth())
            }
        }
    }
}
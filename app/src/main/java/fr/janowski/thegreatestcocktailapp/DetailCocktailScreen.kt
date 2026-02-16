package fr.janowski.thegreatestcocktailapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class Category {
    BEER,
    COCKTAIL,
    COCOA,
    COFFE,
    LIQUOR,
    DRINK,
    PUNCH,
    SHAKE,
    SHOT,
    SOFT,
    ALCOHOLIC,
    NON_ALCOHOLIC,
    OTHER;

    companion object {
        fun allObjects(): List<Category> {
            return listOf(
                BEER,
                COCKTAIL,
                COCOA,
                COFFE,
                LIQUOR,
                DRINK,
                PUNCH,
                SHAKE,
                SHOT,
                SOFT,
                OTHER
            )
        }
        fun toString(category: Category): String {
            return when(category) {
                ALCOHOLIC -> "Alcoholic"
                NON_ALCOHOLIC -> "Non alcoholic"
                OTHER -> "Other / Unknown"
                BEER -> "Beer"
                COCKTAIL -> "Cocktail"
                COCOA -> "Cocoa"
                COFFE -> "Coffe"
                LIQUOR -> "Homemade Liquor"
                DRINK -> "Ordinary Drink"
                PUNCH -> "Punch / Party Drink"
                SHAKE -> "Shake"
                SHOT -> "Shot"
                SOFT -> "Soft Drink"
            }
        }

        @Composable
        fun colors(category: Category): List<Color> {
            return when(category) {
                ALCOHOLIC -> listOf(
                    colorResource(R.color.orange_200),
                    colorResource(R.color.orange_700)
                )

                NON_ALCOHOLIC -> listOf(
                    colorResource(R.color.orange_200),
                    colorResource(R.color.orange_700)
                )

                OTHER -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                BEER -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                COCKTAIL -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                COCOA -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                COFFE -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                LIQUOR -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                DRINK -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                PUNCH -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                SHAKE -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                SHOT -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
                SOFT -> listOf(
                    colorResource(R.color.teal_200),
                    colorResource(R.color.teal_700)
                )
            }
        }
    }
}

@Composable
fun DetailCocktailScreen(modifier: Modifier) {
    Box(
        Modifier.background(
        brush = Brush.verticalGradient(
            listOf(
                colorResource(R.color.purple_500),
                colorResource(R.color.purple_700)
            )
        ))
            .fillMaxSize()) {
        Column(
            modifier = modifier.fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp),) {
            Image(
                painterResource(R.drawable.cocktail),
                "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .clip(CircleShape)
                    .border(
                        1.dp,
                        colorResource(R.color.teal_200),
                        CircleShape
                    )
            )
            Text("Yoghurt Cooler",
                fontSize = 40.sp,
                color = colorResource(R.color.white))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
//                Text("Other / Unknown")
//                Text("Non alcoholic")
                CategoryView(Category.OTHER)
                CategoryView(Category.NON_ALCOHOLIC)
            }
            Text(
                "Cocktail glass",
                color = colorResource(R.color.grey)
            ) // Kind of glass
            Card() {
                Column(
                    Modifier.padding(16.dp)
                        .fillMaxWidth()) {
                    Text(stringResource(R.string.igrendient))
                    Text("Coca-cola")
                    Text("Lemon juice")
                }
            }
            Card() {
                Column(
                    Modifier.padding(16.dp)
                        .fillMaxWidth()) {
                    Text(stringResource(R.string.preparation))
                    Text("Take a glass, pourthe coke in the glass, then you take 7 drops of lemon juice")
                }
            }
        }
    }
}


@Composable
fun CategoryView(catogory: Category) {
    Box(Modifier
        .clip(CircleShape)
        .background(
            Brush.horizontalGradient(
                Category.colors(catogory)
            )
        )
    ) {
        Text(
            Category.toString(catogory),
            fontSize = 20.sp,
            color = colorResource(R.color.white),
            modifier = Modifier.padding(8.dp)
        )
    }
}
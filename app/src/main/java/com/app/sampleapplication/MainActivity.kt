package com.app.sampleapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.github.typeratingbar.RatingType
import io.github.typeratingbar.TypeRatingBar
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {

    lateinit var type0RatingView : TypeRatingBar
    lateinit var type1RatingView : TypeRatingBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Type 0(Text type)---> Default Type
        type0RatingView=findViewById(R.id.type0)
        type0RatingView.setRatingBarType(RatingType.RATING_BAR_SYMBOLIC_TYPE)
        type0RatingView.setText("$")
        type0RatingView.setTextNormalColor(Color.BLACK)
        type0RatingView.setTextSelectedColor(Color.GREEN)
        type0RatingView.setHorizontalPadding(10)
        type0RatingView.setTextSize(40)


        type1RatingView = findViewById(R.id.type1)
        type1RatingView.setRatingBarType(RatingType.RATING_BAR_IMAGE_TYPE)
        type1RatingView.setDrawableNormalDrawable(getDrawable(io.github.typeratingbar.R.drawable.ic_star_normal)) ///--> default normal image
        type1RatingView.setDrawableSelectedDrawable(getDrawable(io.github.typeratingbar.R.drawable.ic_star_selected)) /// default selected image
        type1RatingView.setStarTintColor(Color.BLACK)
        type1RatingView.setTotalStar(5)
        type1RatingView.setHorizontalPadding(5)







    }
}
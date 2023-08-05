package com.example.affirmation.model

import android.graphics.drawable.AnimatedImageDrawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.sql.RowId

data class Affirmation (
     @StringRes val stringRes: Int,
    @DrawableRes val imageResId: Int
 )

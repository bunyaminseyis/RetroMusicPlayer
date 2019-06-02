/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic.views

import android.content.Context
import android.util.AttributeSet

import com.google.android.material.card.MaterialCardView

/**
 * Created by hemanths on 3/18/19
 */
class WidthFitSquareCardView : MaterialCardView {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    fun forceSquare(z: Boolean) {
        this.forceSquare = z
        requestLayout()
    }

    override fun onMeasure(i: Int, i2: Int) {
        var i2Final = i2
        if (this.forceSquare) {
            i2Final = i
        }
        super.onMeasure(i, i2Final)
    }

    private var forceSquare = true
}

@file:JvmName("GridlayoutV7ViewsKt")
package org.jetbrains.anko.gridlayout.v7

import org.jetbrains.anko.custom.*
import org.jetbrains.anko.AnkoViewDslMarker
import android.view.ViewManager
import android.view.ViewGroup.LayoutParams
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Build
import android.widget.*

@PublishedApi
internal object `$$Anko$Factories$GridlayoutV7ViewGroup` {
    val GRID_LAYOUT = { ctx: Context -> _GridLayout(ctx) }
}

inline fun ViewManager.gridLayout(theme: Int = 0): android.support.v7.widget.GridLayout = gridLayout(theme) {}
inline fun ViewManager.gridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): android.support.v7.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}

inline fun Context.gridLayout(theme: Int = 0): android.support.v7.widget.GridLayout = gridLayout(theme) {}
inline fun Context.gridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): android.support.v7.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}

inline fun Activity.gridLayout(theme: Int = 0): android.support.v7.widget.GridLayout = gridLayout(theme) {}
inline fun Activity.gridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): android.support.v7.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}


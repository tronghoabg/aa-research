package com.google.android.material.card;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends InsetDrawable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, Drawable drawable, int i2, int i3, int i4, int i5) {
        super(drawable, i2, i3, i4, i5);
        Objects.requireNonNull(cVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}

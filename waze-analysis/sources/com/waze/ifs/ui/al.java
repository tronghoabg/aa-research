package com.waze.ifs.ui;

import android.content.Context;
import android.support.v7.widget.fa;
import android.util.DisplayMetrics;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class al extends fa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(at atVar, Context context) {
        super(context);
        Objects.requireNonNull(atVar);
    }

    @Override // android.support.v7.widget.fa
    protected final float a(DisplayMetrics displayMetrics) {
        return super.a(displayMetrics) * 3.0f;
    }

    @Override // android.support.v7.widget.fa
    public final int m(int i2, int i3, int i4, int i5, int i6) {
        return (((i5 - i4) / 2) + i4) - (((i3 - i2) / 2) + i2);
    }
}

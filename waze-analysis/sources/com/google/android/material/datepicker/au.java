package com.google.android.material.datepicker;

import android.content.Context;
import android.support.v7.widget.fa;
import android.util.DisplayMetrics;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class au extends fa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(av avVar, Context context) {
        super(context);
        Objects.requireNonNull(avVar);
    }

    @Override // android.support.v7.widget.fa
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}

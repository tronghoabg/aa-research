package com.airbnb.lottie.d.c;

import android.graphics.Paint;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class i extends Paint {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, byte[] bArr) {
        super(1);
        Objects.requireNonNull(kVar);
        setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar) {
        super(1);
        Objects.requireNonNull(kVar);
        setStyle(Paint.Style.STROKE);
    }
}

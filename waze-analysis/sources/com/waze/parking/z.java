package com.waze.parking;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        h.g.b.x.f(layoutDirection, "layoutDirection");
        h.g.b.x.f(density, "density");
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(32.0f);
        float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(24.0f);
        float fMo2127toPx0680j_43 = density.mo2127toPx0680j_4(12.0f);
        Path Path = AndroidPath_androidKt.Path();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - fMo2127toPx0680j_43;
        Path.moveTo(fMo2127toPx0680j_4, 0.0f);
        float f2 = fIntBitsToFloat - fMo2127toPx0680j_4;
        Path.lineTo(f2, 0.0f);
        Path.quadraticTo(fIntBitsToFloat, 0.0f, fIntBitsToFloat, fMo2127toPx0680j_4);
        float f3 = fIntBitsToFloat2 - fMo2127toPx0680j_4;
        Path.lineTo(fIntBitsToFloat, f3);
        Path.quadraticTo(fIntBitsToFloat, fIntBitsToFloat2, f2, fIntBitsToFloat2);
        Path.lineTo((fMo2127toPx0680j_42 + fIntBitsToFloat) / 2.0f, fIntBitsToFloat2);
        Path.lineTo(fIntBitsToFloat / 2.0f, fMo2127toPx0680j_43 + fIntBitsToFloat2);
        Path.lineTo((fIntBitsToFloat - fMo2127toPx0680j_42) / 2.0f, fIntBitsToFloat2);
        Path.lineTo(fMo2127toPx0680j_4, fIntBitsToFloat2);
        Path.quadraticTo(0.0f, fIntBitsToFloat2, 0.0f, f3);
        Path.lineTo(0.0f, fMo2127toPx0680j_4);
        Path.quadraticTo(0.0f, 0.0f, fMo2127toPx0680j_4, 0.0f);
        Path.close();
        return new Outline.Generic(Path);
    }
}

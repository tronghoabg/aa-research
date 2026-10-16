package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m10869toAndroidCapBeK7IIE(int i2) {
        return StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8633getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8634getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m10870toAndroidJoinWw9F2mQ(int i2) {
        return StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8643getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8644getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8642getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}

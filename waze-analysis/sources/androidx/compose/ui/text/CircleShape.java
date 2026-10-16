package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(j2) / 2.0f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM8048getMinDimensionimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM8048getMinDimensionimpl);
        Rect rectM8070toRectuvyYCjk = SizeKt.m8070toRectuvyYCjk(j2);
        long j3 = (jFloatToRawIntBits << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits2);
        return new Outline.Rounded(RoundRectKt.m8032RoundRectZAM2FJo(rectM8070toRectuvyYCjk, j3, j3, j3, j3));
    }
}

package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.b.x;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = DrawStyle.$stable;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    public CustomBulletSpan(Shape shape, float f2, float f3, float f4, Brush brush, float f5, DrawStyle drawStyle, Density density, float f6) {
        this.shape = shape;
        this.bulletWidthPx = f2;
        this.bulletHeightPx = f3;
        this.brush = brush;
        this.alpha = f5;
        this.drawStyle = drawStyle;
        this.density = density;
        int iB = a.b(f2 + f4);
        this.minimumRequiredIndent = iB;
        this.diff = a.b(f6) - iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab drawLeadingMargin$lambda$0$0(CustomBulletSpan customBulletSpan, long j2, int i2, Canvas canvas, Paint paint, int i3, float f2) {
        BulletSpan_androidKt.draw(customBulletSpan.shape.mo2037createOutlinePq9zytI(j2, i2 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density), canvas, paint, i3, f2, i2);
        return ab.f48028a;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i2, final int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        int i9 = i4 + i6;
        int i10 = i2 - this.minimumRequiredIndent;
        x.d(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i7 || paint == null) {
            return;
        }
        float f2 = i9;
        final int iH = n.h(i10, 0);
        DrawStyle drawStyle = this.drawStyle;
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, drawStyle);
        float f3 = this.bulletWidthPx;
        float f4 = this.bulletHeightPx;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        Brush brush = this.brush;
        float f5 = this.alpha;
        final long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        final float f6 = f2 / 2.0f;
        BulletSpan_androidKt.m10867setBrushAndDrawyzxVdVo(paint, brush, f5, j2, new h.g.a.a() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CustomBulletSpan.drawLeadingMargin$lambda$0$0(this.f$0, j2, i3, canvas, paint, iH, f6);
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        int i2 = this.diff;
        if (i2 >= 0) {
            return 0;
        }
        return Math.abs(i2);
    }
}

package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Shadow {
    public static final int $stable = 0;
    private final float alpha;
    private final int blendMode;
    private final Brush brush;
    private final long color;
    private final long offset;
    private final float radius;
    private final float spread;

    public /* synthetic */ Shadow(float f2, long j2, float f3, long j3, float f4, int i2, int i3, o oVar) {
        this(f2, (i3 & 2) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j2, (i3 & 4) != 0 ? 0.0f : f3, (i3 & 8) != 0 ? DpOffset.Companion.m11235getZeroRKDOV3M() : j3, (i3 & 16) != 0 ? 1.0f : f4, (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2, (o) null);
    }

    public final Shadow copyWithoutOffset$ui_graphics() {
        return new Shadow(this.radius, this.spread, DpOffset.Companion.m11235getZeroRKDOV3M(), this.color, this.brush, this.alpha, this.blendMode, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Dp.m11169equalsimpl0(this.radius, shadow.radius) && Dp.m11169equalsimpl0(this.spread, shadow.spread) && DpOffset.m11224equalsimpl0(this.offset, shadow.offset) && this.alpha == shadow.alpha && BlendMode.m8137equalsimpl0(this.blendMode, shadow.blendMode) && Color.m8229equalsimpl0(this.color, shadow.color) && x.n(this.brush, shadow.brush);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8982getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m8983getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-RKDOV3M, reason: not valid java name */
    public final long m8984getOffsetRKDOV3M() {
        return this.offset;
    }

    /* renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final float m8985getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* renamed from: getSpread-D9Ej5fM, reason: not valid java name */
    public final float m8986getSpreadD9Ej5fM() {
        return this.spread;
    }

    public int hashCode() {
        int iM11170hashCodeimpl = (((((Dp.m11170hashCodeimpl(this.radius) * 31) + Dp.m11170hashCodeimpl(this.spread)) * 31) + DpOffset.m11229hashCodeimpl(this.offset)) * 31) + Float.floatToIntBits(this.alpha);
        Color.Companion companion = Color.Companion;
        Brush brush = this.brush;
        return (((((iM11170hashCodeimpl * 31) + this.blendMode) * 31) + Color.m8235hashCodeimpl(this.color)) * 31) + (brush != null ? brush.hashCode() : 0);
    }

    public String toString() {
        return "Shadow(radius=" + ((Object) Dp.m11175toStringimpl(this.radius)) + ", spread=" + ((Object) Dp.m11175toStringimpl(this.spread)) + ", offset=" + ((Object) DpOffset.m11232toStringimpl(this.offset)) + ", alpha=" + this.alpha + ", blendMode=" + ((Object) BlendMode.m8139toStringimpl(this.blendMode)) + ", color=" + ((Object) Color.m8236toStringimpl(this.color)) + ", brush=" + this.brush + ')';
    }

    public final Shadow transparentCopy$ui_graphics() {
        return new Shadow(this.radius, Color.Companion.m8263getTransparent0d7_KjU(), this.spread, this.offset, this.alpha, this.blendMode, (o) null);
    }

    public /* synthetic */ Shadow(float f2, long j2, float f3, long j3, float f4, int i2, o oVar) {
        this(f2, j2, f3, j3, f4, i2);
    }

    public /* synthetic */ Shadow(float f2, Brush brush, float f3, long j2, float f4, int i2, o oVar) {
        this(f2, brush, f3, j2, f4, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[PHI: r1
  0x0024: PHI (r1v4 float) = (r1v2 float), (r1v3 float) binds: [B:7:0x0022, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Shadow(float r1, float r2, long r3, long r5, androidx.compose.ui.graphics.Brush r7, float r8, int r9) {
        /*
            r0 = this;
            r0.<init>()
            r0.radius = r1
            r0.spread = r2
            r0.offset = r3
            r0.blendMode = r9
            boolean r1 = r7 instanceof androidx.compose.ui.graphics.SolidColor
            if (r1 == 0) goto L1b
            androidx.compose.ui.graphics.SolidColor r7 = (androidx.compose.ui.graphics.SolidColor) r7
            long r1 = r7.m8614getValue0d7_KjU()
            r0.color = r1
            r1 = 0
            r0.brush = r1
            goto L1f
        L1b:
            r0.color = r5
            r0.brush = r7
        L1f:
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L26
        L24:
            r8 = r1
            goto L2d
        L26:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L2d
            goto L24
        L2d:
            r0.alpha = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.shadow.Shadow.<init>(float, float, long, long, androidx.compose.ui.graphics.Brush, float, int):void");
    }

    private Shadow(float f2, long j2, float f3, long j3, float f4, int i2) {
        this(f2, f3, j3, j2 != 16 ? j2 : Color.Companion.m8254getBlack0d7_KjU(), (Brush) null, f4, i2, (o) null);
    }

    private Shadow(float f2, Brush brush, float f3, long j2, float f4, int i2) {
        this(f2, f3, j2, Color.Companion.m8254getBlack0d7_KjU(), brush, f4, i2, (o) null);
    }

    public /* synthetic */ Shadow(float f2, float f3, long j2, long j3, Brush brush, float f4, int i2, o oVar) {
        this(f2, f3, j2, j3, brush, f4, i2);
    }

    public /* synthetic */ Shadow(float f2, Brush brush, float f3, long j2, float f4, int i2, int i3, o oVar) {
        this(f2, brush, (i3 & 4) != 0 ? 0.0f : f3, (i3 & 8) != 0 ? DpOffset.Companion.m11235getZeroRKDOV3M() : j2, (i3 & 16) != 0 ? 1.0f : f4, (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2, (o) null);
    }
}

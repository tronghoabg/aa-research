package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InnerShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final InnerShadowRendererProvider renderCreator;
    private final Shadow shadow;
    private final Shape shape;

    public InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = innerShadowRendererProvider;
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f2) {
        this.alpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo8959getIntrinsicSizeNHjbRc() {
        return Size.Companion.m8057getUnspecifiedNHjbRc();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0034 A[PHI: r1
  0x0034: PHI (r1v5 float) = (r1v3 float), (r1v4 float) binds: [B:3:0x0032, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.ui.graphics.painter.Painter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope r19) {
        /*
            r18 = this;
            r0 = r18
            androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider r1 = r0.renderCreator
            androidx.compose.ui.graphics.Shape r2 = r0.shape
            long r3 = r19.mo8751getSizeNHjbRc()
            androidx.compose.ui.unit.LayoutDirection r5 = r19.getLayoutDirection()
            r6 = r19
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.ui.graphics.shadow.Shadow r7 = r0.shadow
            androidx.compose.ui.graphics.shadow.InnerShadowRenderer r8 = r1.mo8967obtainInnerShadowRenderereZhPAX0(r2, r3, r5, r6, r7)
            androidx.compose.ui.graphics.ColorFilter r10 = r0.colorFilter
            long r11 = r19.mo8751getSizeNHjbRc()
            androidx.compose.ui.graphics.shadow.Shadow r1 = r0.shadow
            long r13 = r1.m8983getColor0d7_KjU()
            androidx.compose.ui.graphics.Brush r15 = r1.getBrush()
            float r2 = r0.alpha
            float r1 = r1.getAlpha()
            float r2 = r2 * r1
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L37
        L34:
            r16 = r1
            goto L40
        L37:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L3e
            goto L34
        L3e:
            r16 = r2
        L40:
            androidx.compose.ui.graphics.shadow.Shadow r0 = r0.shadow
            int r17 = r0.m8982getBlendMode0nO6VwU()
            r9 = r19
            r8.m8988drawShadowerFMhIw(r9, r10, r11, r13, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.shadow.InnerShadowPainter.onDraw(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    public InnerShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, InnerShadowRendererProvider.Companion.getDefault());
    }

    public /* synthetic */ InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider, int i2, o oVar) {
        this(shape, shadow, (i2 & 4) != 0 ? InnerShadowRendererProvider.Companion.getDefault() : innerShadowRendererProvider);
    }
}

package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DropShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final DropShadowRendererProvider renderCreator;
    private final Shadow shadow;
    private final Shape shape;

    public DropShadowPainter(Shape shape, Shadow shadow, DropShadowRendererProvider dropShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = dropShadowRendererProvider;
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

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        DropShadowRenderer dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0 = this.renderCreator.mo8966obtainDropShadowRenderereZhPAX0(this.shape, drawScope.mo8751getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.shadow);
        float f2 = drawScope.mo2127toPx0680j_4(DpOffset.m11225getXD9Ej5fM(this.shadow.m8984getOffsetRKDOV3M()));
        float f3 = -f2;
        float f4 = drawScope.mo2127toPx0680j_4(DpOffset.m11227getYD9Ej5fM(this.shadow.m8984getOffsetRKDOV3M()));
        float f5 = -f4;
        drawScope.getDrawContext().getTransform().translate(f2, f4);
        try {
            ColorFilter colorFilter = this.colorFilter;
            long jMo8751getSizeNHjbRc = drawScope.mo8751getSizeNHjbRc();
            long jM8983getColor0d7_KjU = dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0.getShadow().m8983getColor0d7_KjU();
            Brush brush = dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0.getShadow().getBrush();
            float alpha = this.alpha * dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0.getShadow().getAlpha();
            float f6 = 0.0f;
            if (alpha < 0.0f) {
                alpha = f6;
            } else {
                f6 = 1.0f;
                if (alpha > 1.0f) {
                    alpha = f6;
                }
            }
            dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0.m8988drawShadowerFMhIw(drawScope, colorFilter, jMo8751getSizeNHjbRc, jM8983getColor0d7_KjU, brush, alpha, dropShadowRendererMo8966obtainDropShadowRenderereZhPAX0.getShadow().m8982getBlendMode0nO6VwU());
        } finally {
            drawScope.getDrawContext().getTransform().translate(f3, f5);
        }
    }

    public DropShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, DropShadowRendererProvider.Companion.getDefault());
    }
}

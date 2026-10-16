package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Bullet implements AnnotatedString.Annotation {
    private static final Bullet Default;
    private static final long DefaultPadding;
    private static final long DefaultSize;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long height;
    private final long padding;
    private final Shape shape;
    private final long width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = DrawStyle.$stable;
    private static final long DefaultIndentation = TextUnitKt.getEm(1);

    static {
        long em = TextUnitKt.getEm(0.25d);
        DefaultSize = em;
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultPadding = em2;
        Default = new Bullet(CircleShape.INSTANCE, em, em, em2, null, 0.0f, null, 112, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Bullet(Shape shape, long j2, long j3, long j4, Brush brush, float f2, DrawStyle drawStyle, int i2, o oVar) {
        DrawStyle drawStyle2 = (i2 & 64) != 0 ? Fill.INSTANCE : drawStyle;
        int i3 = i2 & 16;
        this(shape, j2, j3, j4, i3 != 0 ? null : brush, (i2 & 32) != 0 ? Float.NaN : f2, drawStyle2, null);
    }

    /* renamed from: copy-w_4Rhrw$default, reason: not valid java name */
    public static /* synthetic */ Bullet m10385copyw_4Rhrw$default(Bullet bullet, Shape shape, long j2, long j3, long j4, Brush brush, float f2, DrawStyle drawStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i2 & 2) != 0) {
            j2 = bullet.width;
        }
        if ((i2 & 4) != 0) {
            j3 = bullet.height;
        }
        if ((i2 & 8) != 0) {
            j4 = bullet.padding;
        }
        if ((i2 & 16) != 0) {
            brush = bullet.brush;
        }
        if ((i2 & 32) != 0) {
            f2 = bullet.alpha;
        }
        if ((i2 & 64) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j5 = j4;
        long j6 = j3;
        return bullet.m10386copyw_4Rhrw(shape, j2, j6, j5, brush2, f2, drawStyle2);
    }

    /* renamed from: copy-w_4Rhrw, reason: not valid java name */
    public final Bullet m10386copyw_4Rhrw(Shape shape, long j2, long j3, long j4, Brush brush, float f2, DrawStyle drawStyle) {
        return new Bullet(shape, j2, j3, j4, brush, f2, drawStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return x.n(this.shape, bullet.shape) && TextUnit.m11359equalsimpl0(this.width, bullet.width) && TextUnit.m11359equalsimpl0(this.height, bullet.height) && TextUnit.m11359equalsimpl0(this.padding, bullet.padding) && x.n(this.brush, bullet.brush) && this.alpha == bullet.alpha && x.n(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m10387getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m10388getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m10389getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode() * 31;
        TextUnit.Companion companion = TextUnit.Companion;
        Brush brush = this.brush;
        return ((((((((((iHashCode + TextUnit.m11363hashCodeimpl(this.width)) * 31) + TextUnit.m11363hashCodeimpl(this.height)) * 31) + TextUnit.m11363hashCodeimpl(this.padding)) * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=(" + ((Object) TextUnit.m11369toStringimpl(this.width)) + ", " + ((Object) TextUnit.m11369toStringimpl(this.height)) + "), padding=" + ((Object) TextUnit.m11369toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bullet getDefault() {
            return Bullet.Default;
        }

        /* renamed from: getDefaultIndentation-XSAIIZE, reason: not valid java name */
        public final long m10390getDefaultIndentationXSAIIZE() {
            return Bullet.DefaultIndentation;
        }

        /* renamed from: getDefaultPadding-XSAIIZE, reason: not valid java name */
        public final long m10391getDefaultPaddingXSAIIZE() {
            return Bullet.DefaultPadding;
        }

        /* renamed from: getDefaultSize-XSAIIZE, reason: not valid java name */
        public final long m10392getDefaultSizeXSAIIZE() {
            return Bullet.DefaultSize;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Bullet(Shape shape, long j2, long j3, long j4, Brush brush, float f2, DrawStyle drawStyle, o oVar) {
        this(shape, j2, j3, j4, brush, f2, drawStyle);
    }

    private Bullet(Shape shape, long j2, long j3, long j4, Brush brush, float f2, DrawStyle drawStyle) {
        this.shape = shape;
        this.width = j2;
        this.height = j3;
        this.padding = j4;
        this.brush = brush;
        this.alpha = f2;
        this.drawStyle = drawStyle;
    }
}

package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = RectangleShapeKt.getRectangleShape();
    private static final Shape Unbounded = null;
    private final Shape shape;

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m7749boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7751equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && x.n(shape, ((BlurredEdgeTreatment) obj).m7755unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7752equalsimpl0(Shape shape, Shape shape2) {
        return x.n(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7753hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7754toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m7751equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m7753hashCodeimpl(this.shape);
    }

    public String toString() {
        return m7754toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m7755unboximpl() {
        return this.shape;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m7756getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m7757getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m7750constructorimpl(Shape shape) {
        return shape;
    }
}

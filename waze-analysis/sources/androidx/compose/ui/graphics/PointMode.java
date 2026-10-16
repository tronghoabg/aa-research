package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = 0;
    private static final int Lines = 1;
    private static final int Polygon = 2;

    private /* synthetic */ PointMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m8570boximpl(int i2) {
        return new PointMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8572equalsimpl(int i2, Object obj) {
        return (obj instanceof PointMode) && i2 == ((PointMode) obj).m8576unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8573equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8575toStringimpl(int i2) {
        return m8573equalsimpl0(i2, Points) ? "Points" : m8573equalsimpl0(i2, Lines) ? "Lines" : m8573equalsimpl0(i2, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8572equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8575toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8576unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m8577getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m8578getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m8579getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8571constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8574hashCodeimpl(int i2) {
        return i2;
    }
}

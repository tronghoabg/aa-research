package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = 0;
    private static final int TriangleStrip = 1;
    private static final int TriangleFan = 2;

    private /* synthetic */ VertexMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m8673boximpl(int i2) {
        return new VertexMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8675equalsimpl(int i2, Object obj) {
        return (obj instanceof VertexMode) && i2 == ((VertexMode) obj).m8679unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8676equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8678toStringimpl(int i2) {
        return m8676equalsimpl0(i2, Triangles) ? "Triangles" : m8676equalsimpl0(i2, TriangleStrip) ? "TriangleStrip" : m8676equalsimpl0(i2, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8675equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8678toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8679unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m8680getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m8681getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m8682getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8674constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8677hashCodeimpl(int i2) {
        return i2;
    }
}

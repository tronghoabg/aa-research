package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = 0;
    private static final int Stroke = 1;
    private final int value;

    private /* synthetic */ PaintingStyle(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m8531boximpl(int i2) {
        return new PaintingStyle(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8533equalsimpl(int i2, Object obj) {
        return (obj instanceof PaintingStyle) && i2 == ((PaintingStyle) obj).m8537unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8534equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8536toStringimpl(int i2) {
        return m8534equalsimpl0(i2, Fill) ? "Fill" : m8534equalsimpl0(i2, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8533equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8536toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8537unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m8538getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m8539getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8532constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8535hashCodeimpl(int i2) {
        return i2;
    }
}

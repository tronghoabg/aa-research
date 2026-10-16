package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = 0;
    private static final int Round = 1;
    private static final int Bevel = 2;

    private /* synthetic */ StrokeJoin(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m8635boximpl(int i2) {
        return new StrokeJoin(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8637equalsimpl(int i2, Object obj) {
        return (obj instanceof StrokeJoin) && i2 == ((StrokeJoin) obj).m8641unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8638equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8640toStringimpl(int i2) {
        return m8638equalsimpl0(i2, Miter) ? "Miter" : m8638equalsimpl0(i2, Round) ? "Round" : m8638equalsimpl0(i2, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8637equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8640toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8641unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m8642getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m8643getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m8644getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8636constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8639hashCodeimpl(int i2) {
        return i2;
    }
}

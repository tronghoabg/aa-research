package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = 0;
    private static final int Rotate = 1;
    private static final int Morph = 2;

    private /* synthetic */ StampedPathEffectStyle(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m8615boximpl(int i2) {
        return new StampedPathEffectStyle(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8617equalsimpl(int i2, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i2 == ((StampedPathEffectStyle) obj).m8621unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8618equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8620toStringimpl(int i2) {
        return m8618equalsimpl0(i2, Translate) ? "Translate" : m8618equalsimpl0(i2, Rotate) ? "Rotate" : m8618equalsimpl0(i2, Morph) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8617equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8620toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8621unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m8622getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m8623getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m8624getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8616constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8619hashCodeimpl(int i2) {
        return i2;
    }
}

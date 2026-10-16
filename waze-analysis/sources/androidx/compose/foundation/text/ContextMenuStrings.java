package androidx.compose.foundation.text;

import android.R;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ContextMenuStrings {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ ContextMenuStrings(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuStrings m3256boximpl(int i2) {
        return new ContextMenuStrings(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3258equalsimpl(int i2, Object obj) {
        return (obj instanceof ContextMenuStrings) && i2 == ((ContextMenuStrings) obj).m3262unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3259equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3261toStringimpl(int i2) {
        return "ContextMenuStrings(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3258equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3261toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3262unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAutofill-9Hzcbyc, reason: not valid java name */
        public final int m3263getAutofill9Hzcbyc() {
            return R.string.autofill;
        }

        /* renamed from: getCopy-9Hzcbyc, reason: not valid java name */
        public final int m3264getCopy9Hzcbyc() {
            return R.string.copy;
        }

        /* renamed from: getCut-9Hzcbyc, reason: not valid java name */
        public final int m3265getCut9Hzcbyc() {
            return R.string.cut;
        }

        /* renamed from: getPaste-9Hzcbyc, reason: not valid java name */
        public final int m3266getPaste9Hzcbyc() {
            return R.string.paste;
        }

        /* renamed from: getSelectAll-9Hzcbyc, reason: not valid java name */
        public final int m3267getSelectAll9Hzcbyc() {
            return R.string.selectAll;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3257constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3260hashCodeimpl(int i2) {
        return i2;
    }
}

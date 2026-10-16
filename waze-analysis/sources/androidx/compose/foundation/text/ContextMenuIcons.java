package androidx.compose.foundation.text;

import android.R;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ContextMenuIcons {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ ContextMenuIcons(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuIcons m3244boximpl(int i2) {
        return new ContextMenuIcons(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3246equalsimpl(int i2, Object obj) {
        return (obj instanceof ContextMenuIcons) && i2 == ((ContextMenuIcons) obj).m3250unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3247equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3249toStringimpl(int i2) {
        return "ContextMenuIcons(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3246equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3249toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3250unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getActionModeCopyDrawable-3I4p1mQ, reason: not valid java name */
        public final int m3251getActionModeCopyDrawable3I4p1mQ() {
            return R.attr.actionModeCopyDrawable;
        }

        /* renamed from: getActionModeCutDrawable-3I4p1mQ, reason: not valid java name */
        public final int m3252getActionModeCutDrawable3I4p1mQ() {
            return R.attr.actionModeCutDrawable;
        }

        /* renamed from: getActionModePasteDrawable-3I4p1mQ, reason: not valid java name */
        public final int m3253getActionModePasteDrawable3I4p1mQ() {
            return R.attr.actionModePasteDrawable;
        }

        /* renamed from: getActionModeSelectAllDrawable-3I4p1mQ, reason: not valid java name */
        public final int m3254getActionModeSelectAllDrawable3I4p1mQ() {
            return R.attr.actionModeSelectAllDrawable;
        }

        /* renamed from: getID_NULL-3I4p1mQ, reason: not valid java name */
        public final int m3255getID_NULL3I4p1mQ() {
            return 0;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3245constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3248hashCodeimpl(int i2) {
        return i2;
    }
}

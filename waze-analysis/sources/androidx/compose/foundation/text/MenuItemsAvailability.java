package androidx.compose.foundation.text;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;

    private /* synthetic */ MenuItemsAvailability(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m3349boximpl(int i2) {
        return new MenuItemsAvailability(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3351constructorimpl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return (z ? 1 : 0) | (true != z2 ? 0 : 2) | (true != z3 ? 0 : 4) | (true != z4 ? 0 : 8) | (true == z5 ? 16 : 0);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3352equalsimpl(int i2, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i2 == ((MenuItemsAvailability) obj).m3361unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3353equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m3354getCanAutofillimpl(int i2) {
        return (i2 & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m3355getCanCopyimpl(int i2) {
        return (i2 & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m3356getCanCutimpl(int i2) {
        return (i2 & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m3357getCanPasteimpl(int i2) {
        return (i2 & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m3358getCanSelectAllimpl(int i2) {
        return (i2 & 8) == 8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3360toStringimpl(int i2) {
        return "MenuItemsAvailability(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3352equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3360toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3361unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m3362getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3359hashCodeimpl(int i2) {
        return i2;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3350constructorimpl(int i2) {
        return i2;
    }
}

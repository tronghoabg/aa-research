package androidx.compose.foundation.text;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class KeyModifiers {
    private static final int ALT_FLAG = 1;
    private static final int CTRL_FLAG = 2;
    private static final int META_FLAG = 4;
    private static final int SHIFT_FLAG = 8;
    private final int flags;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int Alt = 1;
    private static final int Ctrl = 2;
    private static final int Meta = 4;
    private static final int Shift = 8;
    private static final int AltShift = m3295plus1uj4btU(1, 8);
    private static final int CtrlShift = m3295plus1uj4btU(2, 8);
    private static final int ShiftMeta = m3295plus1uj4btU(4, 8);
    private static final int CtrlAlt = m3295plus1uj4btU(2, 1);
    private static final int CtrlMeta = m3295plus1uj4btU(2, 4);
    private static final int AltMeta = m3295plus1uj4btU(4, 8);

    private /* synthetic */ KeyModifiers(int i2) {
        this.flags = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyModifiers m3277boximpl(int i2) {
        return new KeyModifiers(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3279constructorimpl(boolean z, boolean z2, boolean z3, boolean z4) {
        return (z ? 1 : 0) | (true != z2 ? 0 : 2) | (true != z3 ? 0 : 4) | (true == z4 ? 8 : 0);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3281equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyModifiers) && i2 == ((KeyModifiers) obj).m3297unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3282equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getAlt-AuQ4EfA, reason: not valid java name */
    public static final int m3283getAltAuQ4EfA() {
        return Companion.m3309getAltAuQ4EfA();
    }

    /* renamed from: getAltMeta-AuQ4EfA, reason: not valid java name */
    public static final int m3284getAltMetaAuQ4EfA() {
        return Companion.m3310getAltMetaAuQ4EfA();
    }

    /* renamed from: getAltShift-AuQ4EfA, reason: not valid java name */
    public static final int m3285getAltShiftAuQ4EfA() {
        return Companion.m3311getAltShiftAuQ4EfA();
    }

    /* renamed from: getCtrl-AuQ4EfA, reason: not valid java name */
    public static final int m3286getCtrlAuQ4EfA() {
        return Companion.m3312getCtrlAuQ4EfA();
    }

    /* renamed from: getCtrlAlt-AuQ4EfA, reason: not valid java name */
    public static final int m3287getCtrlAltAuQ4EfA() {
        return Companion.m3313getCtrlAltAuQ4EfA();
    }

    /* renamed from: getCtrlMeta-AuQ4EfA, reason: not valid java name */
    public static final int m3288getCtrlMetaAuQ4EfA() {
        return Companion.m3314getCtrlMetaAuQ4EfA();
    }

    /* renamed from: getCtrlShift-AuQ4EfA, reason: not valid java name */
    public static final int m3289getCtrlShiftAuQ4EfA() {
        return Companion.m3315getCtrlShiftAuQ4EfA();
    }

    /* renamed from: getMeta-AuQ4EfA, reason: not valid java name */
    public static final int m3290getMetaAuQ4EfA() {
        return Companion.m3316getMetaAuQ4EfA();
    }

    /* renamed from: getNone-AuQ4EfA, reason: not valid java name */
    public static final int m3291getNoneAuQ4EfA() {
        return Companion.m3317getNoneAuQ4EfA();
    }

    /* renamed from: getShift-AuQ4EfA, reason: not valid java name */
    public static final int m3292getShiftAuQ4EfA() {
        return Companion.m3318getShiftAuQ4EfA();
    }

    /* renamed from: getShiftMeta-AuQ4EfA, reason: not valid java name */
    public static final int m3293getShiftMetaAuQ4EfA() {
        return Companion.m3319getShiftMetaAuQ4EfA();
    }

    /* renamed from: plus-1uj4btU, reason: not valid java name */
    public static final int m3295plus1uj4btU(int i2, int i3) {
        return i2 | i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3296toStringimpl(int i2) {
        return "KeyModifiers(flags=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3281equalsimpl(this.flags, obj);
    }

    public int hashCode() {
        return this.flags;
    }

    public String toString() {
        return m3296toStringimpl(this.flags);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3297unboximpl() {
        return this.flags;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAlt-AuQ4EfA, reason: not valid java name */
        public final int m3309getAltAuQ4EfA() {
            return KeyModifiers.Alt;
        }

        /* renamed from: getAltMeta-AuQ4EfA, reason: not valid java name */
        public final int m3310getAltMetaAuQ4EfA() {
            return KeyModifiers.AltMeta;
        }

        /* renamed from: getAltShift-AuQ4EfA, reason: not valid java name */
        public final int m3311getAltShiftAuQ4EfA() {
            return KeyModifiers.AltShift;
        }

        /* renamed from: getCtrl-AuQ4EfA, reason: not valid java name */
        public final int m3312getCtrlAuQ4EfA() {
            return KeyModifiers.Ctrl;
        }

        /* renamed from: getCtrlAlt-AuQ4EfA, reason: not valid java name */
        public final int m3313getCtrlAltAuQ4EfA() {
            return KeyModifiers.CtrlAlt;
        }

        /* renamed from: getCtrlMeta-AuQ4EfA, reason: not valid java name */
        public final int m3314getCtrlMetaAuQ4EfA() {
            return KeyModifiers.CtrlMeta;
        }

        /* renamed from: getCtrlShift-AuQ4EfA, reason: not valid java name */
        public final int m3315getCtrlShiftAuQ4EfA() {
            return KeyModifiers.CtrlShift;
        }

        /* renamed from: getMeta-AuQ4EfA, reason: not valid java name */
        public final int m3316getMetaAuQ4EfA() {
            return KeyModifiers.Meta;
        }

        /* renamed from: getNone-AuQ4EfA, reason: not valid java name */
        public final int m3317getNoneAuQ4EfA() {
            return KeyModifiers.None;
        }

        /* renamed from: getShift-AuQ4EfA, reason: not valid java name */
        public final int m3318getShiftAuQ4EfA() {
            return KeyModifiers.Shift;
        }

        /* renamed from: getShiftMeta-AuQ4EfA, reason: not valid java name */
        public final int m3319getShiftMetaAuQ4EfA() {
            return KeyModifiers.ShiftMeta;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getAlt-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3298getAltAuQ4EfA$annotations() {
        }

        /* renamed from: getAltMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3299getAltMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getAltShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3300getAltShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrl-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3301getCtrlAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlAlt-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3302getCtrlAltAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3303getCtrlMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3304getCtrlShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3305getMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getNone-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3306getNoneAuQ4EfA$annotations() {
        }

        /* renamed from: getShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3307getShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getShiftMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3308getShiftMetaAuQ4EfA$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3278constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3294hashCodeimpl(int i2) {
        return i2;
    }
}

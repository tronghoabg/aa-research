package androidx.camera.camera2.pipe;

import h.a.i;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class AwbMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int OFF = 0;
    private static final int AUTO = 1;
    private static final int CLOUDY_DAYLIGHT = 6;
    private static final int DAYLIGHT = 5;
    private static final int INCANDESCENT = 2;
    private static final int FLUORESCENT = 3;
    private static final int SHADE = 8;
    private static final int TWILIGHT = 7;
    private static final List<AwbMode> values = i.i(m340boximpl(0), m340boximpl(1), m340boximpl(6), m340boximpl(5), m340boximpl(2), m340boximpl(3), m340boximpl(8), m340boximpl(7));

    private /* synthetic */ AwbMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AwbMode m340boximpl(int i2) {
        return new AwbMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m342equalsimpl(int i2, Object obj) {
        return (obj instanceof AwbMode) && i2 == ((AwbMode) obj).m348unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m343equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: fromIntOrNull--SaEiwI, reason: not valid java name */
    public static final AwbMode m344fromIntOrNullSaEiwI(int i2) {
        return Companion.m349fromIntOrNullSaEiwI(i2);
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m346isOnimpl(int i2) {
        return i2 != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m347toStringimpl(int i2) {
        return a.a(i2, "AwbMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m342equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m347toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m348unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromIntOrNull--SaEiwI, reason: not valid java name */
        public final AwbMode m349fromIntOrNullSaEiwI(int i2) {
            Object next;
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AwbMode) next).m348unboximpl() == i2) {
                    break;
                }
            }
            return (AwbMode) next;
        }

        /* renamed from: getAUTO-3hxnlF8, reason: not valid java name */
        public final int m350getAUTO3hxnlF8() {
            return AwbMode.AUTO;
        }

        /* renamed from: getCLOUDY_DAYLIGHT-3hxnlF8, reason: not valid java name */
        public final int m351getCLOUDY_DAYLIGHT3hxnlF8() {
            return AwbMode.CLOUDY_DAYLIGHT;
        }

        /* renamed from: getDAYLIGHT-3hxnlF8, reason: not valid java name */
        public final int m352getDAYLIGHT3hxnlF8() {
            return AwbMode.DAYLIGHT;
        }

        /* renamed from: getFLUORESCENT-3hxnlF8, reason: not valid java name */
        public final int m353getFLUORESCENT3hxnlF8() {
            return AwbMode.FLUORESCENT;
        }

        /* renamed from: getINCANDESCENT-3hxnlF8, reason: not valid java name */
        public final int m354getINCANDESCENT3hxnlF8() {
            return AwbMode.INCANDESCENT;
        }

        /* renamed from: getOFF-3hxnlF8, reason: not valid java name */
        public final int m355getOFF3hxnlF8() {
            return AwbMode.OFF;
        }

        /* renamed from: getSHADE-3hxnlF8, reason: not valid java name */
        public final int m356getSHADE3hxnlF8() {
            return AwbMode.SHADE;
        }

        /* renamed from: getTWILIGHT-3hxnlF8, reason: not valid java name */
        public final int m357getTWILIGHT3hxnlF8() {
            return AwbMode.TWILIGHT;
        }

        public final List<AwbMode> getValues() {
            return AwbMode.values;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m341constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m345hashCodeimpl(int i2) {
        return i2;
    }
}

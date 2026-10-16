package androidx.camera.camera2.pipe;

import h.a.i;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class AfMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int OFF = 0;
    private static final int AUTO = 1;
    private static final int MACRO = 2;
    private static final int CONTINUOUS_VIDEO = 3;
    private static final int CONTINUOUS_PICTURE = 4;
    private static final int EDOF = 5;
    private static final List<AfMode> values = i.i(m313boximpl(0), m313boximpl(1), m313boximpl(2), m313boximpl(3), m313boximpl(4), m313boximpl(5));

    private /* synthetic */ AfMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AfMode m313boximpl(int i2) {
        return new AfMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m315equalsimpl(int i2, Object obj) {
        return (obj instanceof AfMode) && i2 == ((AfMode) obj).m322unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m316equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: fromIntOrNull-MKXwA8g, reason: not valid java name */
    public static final AfMode m317fromIntOrNullMKXwA8g(int i2) {
        return Companion.m323fromIntOrNullMKXwA8g(i2);
    }

    /* renamed from: isContinuous-impl, reason: not valid java name */
    public static final boolean m319isContinuousimpl(int i2) {
        return i2 == 3 || i2 == 4;
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m320isOnimpl(int i2) {
        return i2 != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m321toStringimpl(int i2) {
        return a.a(i2, "AfMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m315equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m321toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m322unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromIntOrNull-MKXwA8g, reason: not valid java name */
        public final AfMode m323fromIntOrNullMKXwA8g(int i2) {
            Object next;
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AfMode) next).m322unboximpl() == i2) {
                    break;
                }
            }
            return (AfMode) next;
        }

        /* renamed from: getAUTO-vHZNRtE, reason: not valid java name */
        public final int m324getAUTOvHZNRtE() {
            return AfMode.AUTO;
        }

        /* renamed from: getCONTINUOUS_PICTURE-vHZNRtE, reason: not valid java name */
        public final int m325getCONTINUOUS_PICTUREvHZNRtE() {
            return AfMode.CONTINUOUS_PICTURE;
        }

        /* renamed from: getCONTINUOUS_VIDEO-vHZNRtE, reason: not valid java name */
        public final int m326getCONTINUOUS_VIDEOvHZNRtE() {
            return AfMode.CONTINUOUS_VIDEO;
        }

        /* renamed from: getEDOF-vHZNRtE, reason: not valid java name */
        public final int m327getEDOFvHZNRtE() {
            return AfMode.EDOF;
        }

        /* renamed from: getMACRO-vHZNRtE, reason: not valid java name */
        public final int m328getMACROvHZNRtE() {
            return AfMode.MACRO;
        }

        /* renamed from: getOFF-vHZNRtE, reason: not valid java name */
        public final int m329getOFFvHZNRtE() {
            return AfMode.OFF;
        }

        public final List<AfMode> getValues() {
            return AfMode.values;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m314constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m318hashCodeimpl(int i2) {
        return i2;
    }
}

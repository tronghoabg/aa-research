package androidx.camera.camera2.pipe;

import h.a.i;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class AeMode {
    public static final Companion Companion = new Companion(null);
    private static final int OFF = 0;
    private static final int ON = 1;
    private static final int ON_ALWAYS_FLASH = 3;
    private static final int ON_AUTO_FLASH = 2;
    private static final int ON_AUTO_FLASH_REDEYE = 4;
    private static final int ON_EXTERNAL_FLASH = 5;
    private static final int ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY = 6;
    private static final List<AeMode> values = i.i(m294boximpl(0), m294boximpl(1), m294boximpl(2), m294boximpl(3), m294boximpl(4), m294boximpl(5), m294boximpl(6));
    private final int value;

    private /* synthetic */ AeMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AeMode m294boximpl(int i2) {
        return new AeMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m296equalsimpl(int i2, Object obj) {
        return (obj instanceof AeMode) && i2 == ((AeMode) obj).m303unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m297equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: fromInt-IwILmM0, reason: not valid java name */
    public static final int m298fromIntIwILmM0(int i2) {
        return Companion.m304fromIntIwILmM0(i2);
    }

    /* renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
    public static final AeMode m299fromIntOrNullkQd0u18(int i2) {
        return Companion.m305fromIntOrNullkQd0u18(i2);
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m301isOnimpl(int i2) {
        return i2 != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m302toStringimpl(int i2) {
        return a.a(i2, "AeMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m296equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m302toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m303unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromInt-IwILmM0, reason: not valid java name */
        public final int m304fromIntIwILmM0(int i2) {
            return i2 == m306getOFFbOjpiJc() ? m306getOFFbOjpiJc() : i2 == m307getONbOjpiJc() ? m307getONbOjpiJc() : i2 == m309getON_AUTO_FLASHbOjpiJc() ? m309getON_AUTO_FLASHbOjpiJc() : i2 == m308getON_ALWAYS_FLASHbOjpiJc() ? m308getON_ALWAYS_FLASHbOjpiJc() : i2 == m310getON_AUTO_FLASH_REDEYEbOjpiJc() ? m310getON_AUTO_FLASH_REDEYEbOjpiJc() : i2 == m311getON_EXTERNAL_FLASHbOjpiJc() ? m311getON_EXTERNAL_FLASHbOjpiJc() : i2 == m312getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc() ? m312getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc() : m307getONbOjpiJc();
        }

        /* renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
        public final AeMode m305fromIntOrNullkQd0u18(int i2) {
            Object next;
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AeMode) next).m303unboximpl() == i2) {
                    break;
                }
            }
            return (AeMode) next;
        }

        /* renamed from: getOFF-bOjpiJc, reason: not valid java name */
        public final int m306getOFFbOjpiJc() {
            return AeMode.OFF;
        }

        /* renamed from: getON-bOjpiJc, reason: not valid java name */
        public final int m307getONbOjpiJc() {
            return AeMode.ON;
        }

        /* renamed from: getON_ALWAYS_FLASH-bOjpiJc, reason: not valid java name */
        public final int m308getON_ALWAYS_FLASHbOjpiJc() {
            return AeMode.ON_ALWAYS_FLASH;
        }

        /* renamed from: getON_AUTO_FLASH-bOjpiJc, reason: not valid java name */
        public final int m309getON_AUTO_FLASHbOjpiJc() {
            return AeMode.ON_AUTO_FLASH;
        }

        /* renamed from: getON_AUTO_FLASH_REDEYE-bOjpiJc, reason: not valid java name */
        public final int m310getON_AUTO_FLASH_REDEYEbOjpiJc() {
            return AeMode.ON_AUTO_FLASH_REDEYE;
        }

        /* renamed from: getON_EXTERNAL_FLASH-bOjpiJc, reason: not valid java name */
        public final int m311getON_EXTERNAL_FLASHbOjpiJc() {
            return AeMode.ON_EXTERNAL_FLASH;
        }

        /* renamed from: getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY-bOjpiJc, reason: not valid java name */
        public final int m312getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc() {
            return AeMode.ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY;
        }

        public final List<AeMode> getValues() {
            return AeMode.values;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m295constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m300hashCodeimpl(int i2) {
        return i2;
    }
}

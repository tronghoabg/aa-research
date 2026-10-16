package androidx.camera.camera2.pipe;

import h.a.i;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class ControlMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int OFF = 0;
    private static final int AUTO = 1;
    private static final int USE_SCENE_MODE = 2;
    private static final int OFF_KEEP_STATE = 3;
    private static final int USE_EXTENDED_SCENE_MODE = 4;
    private static final List<ControlMode> values = i.i(m606boximpl(0), m606boximpl(1), m606boximpl(2), m606boximpl(3), m606boximpl(4));

    private /* synthetic */ ControlMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ControlMode m606boximpl(int i2) {
        return new ControlMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m608equalsimpl(int i2, Object obj) {
        return (obj instanceof ControlMode) && i2 == ((ControlMode) obj).m613unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m609equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: fromIntOrNull-hARtdkc, reason: not valid java name */
    public static final ControlMode m610fromIntOrNullhARtdkc(int i2) {
        return Companion.m614fromIntOrNullhARtdkc(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m612toStringimpl(int i2) {
        return a.a(i2, "ControlMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m608equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m612toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m613unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromIntOrNull-hARtdkc, reason: not valid java name */
        public final ControlMode m614fromIntOrNullhARtdkc(int i2) {
            Object next;
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ControlMode) next).m613unboximpl() == i2) {
                    break;
                }
            }
            return (ControlMode) next;
        }

        /* renamed from: getAUTO-0mNivPE, reason: not valid java name */
        public final int m615getAUTO0mNivPE() {
            return ControlMode.AUTO;
        }

        /* renamed from: getOFF-0mNivPE, reason: not valid java name */
        public final int m616getOFF0mNivPE() {
            return ControlMode.OFF;
        }

        /* renamed from: getOFF_KEEP_STATE-0mNivPE, reason: not valid java name */
        public final int m617getOFF_KEEP_STATE0mNivPE() {
            return ControlMode.OFF_KEEP_STATE;
        }

        /* renamed from: getUSE_EXTENDED_SCENE_MODE-0mNivPE, reason: not valid java name */
        public final int m618getUSE_EXTENDED_SCENE_MODE0mNivPE() {
            return ControlMode.USE_EXTENDED_SCENE_MODE;
        }

        /* renamed from: getUSE_SCENE_MODE-0mNivPE, reason: not valid java name */
        public final int m619getUSE_SCENE_MODE0mNivPE() {
            return ControlMode.USE_SCENE_MODE;
        }

        public final List<ControlMode> getValues() {
            return ControlMode.values;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m607constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m611hashCodeimpl(int i2) {
        return i2;
    }
}

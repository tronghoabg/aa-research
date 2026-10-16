package androidx.camera.camera2.pipe;

import h.a.i;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class FlashMode {
    public static final Companion Companion = new Companion(null);
    private static final int OFF = 0;
    private static final int SINGLE = 1;
    private static final int TORCH = 2;
    private static final List<FlashMode> values = i.i(m629boximpl(0), m629boximpl(1), m629boximpl(2));
    private final int value;

    private /* synthetic */ FlashMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlashMode m629boximpl(int i2) {
        return new FlashMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m631equalsimpl(int i2, Object obj) {
        return (obj instanceof FlashMode) && i2 == ((FlashMode) obj).m636unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m632equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: fromIntOrNull-2-3f5tw, reason: not valid java name */
    public static final FlashMode m633fromIntOrNull23f5tw(int i2) {
        return Companion.m637fromIntOrNull23f5tw(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m635toStringimpl(int i2) {
        return a.a(i2, "FlashMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m631equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m635toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m636unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromIntOrNull-2-3f5tw, reason: not valid java name */
        public final FlashMode m637fromIntOrNull23f5tw(int i2) {
            Object next;
            Iterator it = FlashMode.values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((FlashMode) next).m636unboximpl() == i2) {
                    break;
                }
            }
            return (FlashMode) next;
        }

        /* renamed from: getOFF-Le5xUZU, reason: not valid java name */
        public final int m638getOFFLe5xUZU() {
            return FlashMode.OFF;
        }

        /* renamed from: getSINGLE-Le5xUZU, reason: not valid java name */
        public final int m639getSINGLELe5xUZU() {
            return FlashMode.SINGLE;
        }

        /* renamed from: getTORCH-Le5xUZU, reason: not valid java name */
        public final int m640getTORCHLe5xUZU() {
            return FlashMode.TORCH;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m630constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m634hashCodeimpl(int i2) {
        return i2;
    }
}

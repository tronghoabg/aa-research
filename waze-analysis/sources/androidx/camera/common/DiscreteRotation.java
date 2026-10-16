package androidx.camera.common;

import com.waze.strings.DisplayStrings;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class DiscreteRotation {
    private final int degrees;
    public static final Companion Companion = new Companion(null);
    private static final int ROTATION_0 = 0;
    private static final int ROTATION_90 = 90;
    private static final int ROTATION_180 = 180;
    private static final int ROTATION_270 = DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN;

    private /* synthetic */ DiscreteRotation(int i2) {
        this.degrees = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DiscreteRotation m1284boximpl(int i2) {
        return new DiscreteRotation(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1286equalsimpl(int i2, Object obj) {
        return (obj instanceof DiscreteRotation) && i2 == ((DiscreteRotation) obj).m1294unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1287equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: minus-4Qa-4Hw, reason: not valid java name */
    public static final int m1289minus4Qa4Hw(int i2, int i3) {
        return ((i2 - i3) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    /* renamed from: minus-REjC-m4, reason: not valid java name */
    public static final int m1290minusREjCm4(int i2, int i3) {
        Companion.m1299fromREjCm4(i3);
        return ((i2 - i3) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    /* renamed from: plus-4Qa-4Hw, reason: not valid java name */
    public static final int m1291plus4Qa4Hw(int i2, int i3) {
        return (i2 + i3) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    /* renamed from: plus-REjC-m4, reason: not valid java name */
    public static final int m1292plusREjCm4(int i2, int i3) {
        Companion.m1299fromREjCm4(i3);
        return (i2 + i3) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1293toStringimpl(int i2) {
        return i2 + "°";
    }

    public boolean equals(Object obj) {
        return m1286equalsimpl(this.degrees, obj);
    }

    public final int getDegrees() {
        return this.degrees;
    }

    public int hashCode() {
        return this.degrees;
    }

    public String toString() {
        return m1293toStringimpl(this.degrees);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1294unboximpl() {
        return this.degrees;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: from-REjC-m4, reason: not valid java name */
        public final int m1299fromREjCm4(int i2) {
            DiscreteRotationMath.requireDiscreteRotation(i2);
            return i2;
        }

        /* renamed from: fromSurfaceRotation-REjC-m4, reason: not valid java name */
        public final int m1300fromSurfaceRotationREjCm4(int i2) {
            return DiscreteRotationMath.fromSurfaceRotation(i2);
        }

        /* renamed from: getROTATION_0-4VhhBrY, reason: not valid java name */
        public final int m1301getROTATION_04VhhBrY() {
            return DiscreteRotation.ROTATION_0;
        }

        /* renamed from: getROTATION_180-4VhhBrY, reason: not valid java name */
        public final int m1302getROTATION_1804VhhBrY() {
            return DiscreteRotation.ROTATION_180;
        }

        /* renamed from: getROTATION_270-4VhhBrY, reason: not valid java name */
        public final int m1303getROTATION_2704VhhBrY() {
            return DiscreteRotation.ROTATION_270;
        }

        /* renamed from: getROTATION_90-4VhhBrY, reason: not valid java name */
        public final int m1304getROTATION_904VhhBrY() {
            return DiscreteRotation.ROTATION_90;
        }

        /* renamed from: round-REjC-m4, reason: not valid java name */
        public final int m1306roundREjCm4(int i2) {
            return DiscreteRotationMath.round(i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: round-REjC-m4, reason: not valid java name */
        public final int m1305roundREjCm4(float f2) {
            return DiscreteRotationMath.round(f2);
        }

        /* renamed from: getROTATION_0-4VhhBrY$annotations, reason: not valid java name */
        public static /* synthetic */ void m1295getROTATION_04VhhBrY$annotations() {
        }

        /* renamed from: getROTATION_180-4VhhBrY$annotations, reason: not valid java name */
        public static /* synthetic */ void m1296getROTATION_1804VhhBrY$annotations() {
        }

        /* renamed from: getROTATION_270-4VhhBrY$annotations, reason: not valid java name */
        public static /* synthetic */ void m1297getROTATION_2704VhhBrY$annotations() {
        }

        /* renamed from: getROTATION_90-4VhhBrY$annotations, reason: not valid java name */
        public static /* synthetic */ void m1298getROTATION_904VhhBrY$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1285constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1288hashCodeimpl(int i2) {
        return i2;
    }
}

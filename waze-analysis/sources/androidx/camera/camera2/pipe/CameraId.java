package androidx.camera.camera2.pipe;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class CameraId {
    public static final Companion Companion = new Companion(null);
    private final String value;

    private /* synthetic */ CameraId(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CameraId m546boximpl(String str) {
        return new CameraId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m547constructorimpl(String str) {
        x.f(str, "value");
        if (o.G(str)) {
            throw new IllegalArgumentException("CameraId cannot be null or blank!");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m548equalsimpl(String str, Object obj) {
        return (obj instanceof CameraId) && x.n(str, ((CameraId) obj).m553unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m549equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m550hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toCamera1Id-impl, reason: not valid java name */
    public static final Integer m551toCamera1Idimpl(String str) {
        return o.f(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m552toStringimpl(String str) {
        return "CameraId-".concat(String.valueOf(str));
    }

    public boolean equals(Object obj) {
        return m548equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m550hashCodeimpl(this.value);
    }

    public String toString() {
        return m552toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m553unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromCamera1Id-c9D3src, reason: not valid java name */
        public final String m554fromCamera1Idc9D3src(int i2) {
            String strValueOf = String.valueOf(i2);
            CameraId.m547constructorimpl(strValueOf);
            return strValueOf;
        }

        /* renamed from: fromCamera2Id-c9D3src, reason: not valid java name */
        public final String m555fromCamera2Idc9D3src(String str) {
            x.f(str, "value");
            CameraId.m547constructorimpl(str);
            return str;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}

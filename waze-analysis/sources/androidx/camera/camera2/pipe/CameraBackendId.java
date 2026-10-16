package androidx.camera.camera2.pipe;

import h.g.b.x;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class CameraBackendId {
    private final String value;

    private /* synthetic */ CameraBackendId(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CameraBackendId m382boximpl(String str) {
        return new CameraBackendId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m383constructorimpl(String str) {
        x.f(str, "value");
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m384equalsimpl(String str, Object obj) {
        return (obj instanceof CameraBackendId) && x.n(str, ((CameraBackendId) obj).m388unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m385equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m386hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m387toStringimpl(String str) {
        return "CameraBackendId(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m384equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m386hashCodeimpl(this.value);
    }

    public String toString() {
        return m387toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m388unboximpl() {
        return this.value;
    }
}

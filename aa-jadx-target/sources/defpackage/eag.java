package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eag {
    public final android.view.DisplayCutout a;

    public eag(android.view.DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final defpackage.dvl a() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.dvl.f(bgp$.ExternalSyntheticApiModelOutline0.m(this.a)) : defpackage.dvl.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j$.util.Objects.equals(this.a, ((defpackage.eag) obj).a);
    }

    public final int hashCode() {
        return hh$.ExternalSyntheticApiModelOutline0.m(this.a);
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

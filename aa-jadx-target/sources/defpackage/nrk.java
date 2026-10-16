package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nrk implements defpackage.nrl {
    public final boolean a;

    public nrk(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.nrk) && this.a == ((defpackage.nrk) obj).a;
    }

    public final int hashCode() {
        return defpackage.a.e(this.a);
    }

    public final java.lang.String toString() {
        return "ImmersiveModeEnabledState(setVerticalRail=" + this.a + ")";
    }
}

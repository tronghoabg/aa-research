package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkw implements defpackage.dlf {
    private final long a;

    public dkw(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        defpackage.dki.c("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.dlf
    public final float a() {
        return defpackage.ckd.a(this.a);
    }

    @Override // defpackage.dlf
    public final long b() {
        return this.a;
    }

    @Override // defpackage.dlf
    public final /* synthetic */ defpackage.dlf c(defpackage.dlf dlfVar) {
        return defpackage.dln.v(this, dlfVar);
    }

    @Override // defpackage.dlf
    public final /* synthetic */ defpackage.dlf d(defpackage.afer aferVar) {
        return defpackage.dln.w(this, aferVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dkw) && this.a == ((defpackage.dkw) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "ColorStyle(value=" + defpackage.ckd.g(this.a) + ")";
    }

    @Override // defpackage.dlf
    public final void e() {
    }
}

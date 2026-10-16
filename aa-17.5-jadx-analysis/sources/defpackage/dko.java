package defpackage;

/* loaded from: classes.dex */
public final class dko implements dkx {
    private final long a;

    public dko(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        dka.c("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.dkx
    public final float a() {
        return cjv.a(this.a);
    }

    @Override // defpackage.dkx
    public final long b() {
        return this.a;
    }

    @Override // defpackage.dkx
    public final /* synthetic */ dkx c(dkx dkxVar) {
        return dlf.y(this, dkxVar);
    }

    @Override // defpackage.dkx
    public final /* synthetic */ dkx d(afdr afdrVar) {
        return dlf.z(this, afdrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dko) && this.a == ((dko) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ColorStyle(value=" + cjv.g(this.a) + ")";
    }

    @Override // defpackage.dkx
    public final void e() {
    }
}

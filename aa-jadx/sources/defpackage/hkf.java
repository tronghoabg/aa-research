package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkf {
    public static final defpackage.hkf a;
    public static final defpackage.hkf b;
    public static final defpackage.hkf c;
    public static final defpackage.hkf d;
    public final long e;
    public final long f;

    static {
        long jH = defpackage.gvh.h();
        defpackage.wog wogVar = defpackage.hjj.a;
        a = new defpackage.hkf(jH, defpackage.cjv.j(defpackage.hjj.a.a(40)));
        b = new defpackage.hkf(defpackage.gvh.g(), defpackage.cjv.j(defpackage.hjj.b.a(40)));
        c = new defpackage.hkf(defpackage.gvh.f(), defpackage.cjv.j(defpackage.hjj.c.a(40)));
        d = new defpackage.hkf(defpackage.gvh.i(), defpackage.cjv.j(defpackage.hjj.d.a(40)));
        defpackage.cjv.c();
    }

    public hkf(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    public final long a(boolean z, defpackage.bve bveVar, int i) {
        return (((z ? 1 : 0) | i) ^ (defpackage.ca.bl(bveVar) ? 1 : 0)) != 0 ? this.f : this.e;
    }

    public final java.util.List b(defpackage.bve bveVar) {
        return defpackage.ca.bl(bveVar) ? defpackage.afga.ac(new defpackage.ckd(this.e), new defpackage.ckd(this.f)) : defpackage.afga.ac(new defpackage.ckd(this.f), new defpackage.ckd(this.e));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hkf)) {
            return false;
        }
        defpackage.hkf hkfVar = (defpackage.hkf) obj;
        return defpackage.a.i(this.e, hkfVar.e) && defpackage.a.i(this.f, hkfVar.f);
    }

    public final int hashCode() {
        return (defpackage.a.f(this.e) * 31) + defpackage.a.f(this.f);
    }

    public final java.lang.String toString() {
        long j = this.f;
        return "CarColorUiModel(lightVariant=" + defpackage.ckd.g(this.e) + ", darkVariant=" + defpackage.ckd.g(j) + ")";
    }
}

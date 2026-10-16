package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujo implements defpackage.ulj {
    private defpackage.pku a;
    private defpackage.tpx b;
    private final defpackage.abho c;
    private final defpackage.ulk d;

    public ujo(defpackage.pku pkuVar, defpackage.abho abhoVar, defpackage.ulk ulkVar, defpackage.tpx tpxVar) {
        this.a = pkuVar;
        this.b = tpxVar;
        this.c = abhoVar;
        this.d = ulkVar;
    }

    @Override // defpackage.ulj
    public final int a() {
        return 0;
    }

    @Override // defpackage.ulj
    public final synchronized defpackage.pku b() {
        return this.a;
    }

    @Override // defpackage.ulj
    public final synchronized defpackage.tpx c() {
        return this.b;
    }

    @Override // defpackage.ulj
    public final defpackage.abho d() {
        return this.c;
    }

    @Override // defpackage.ulj
    public final synchronized void e(defpackage.pku pkuVar) {
        this.a = pkuVar;
    }

    public final synchronized boolean equals(java.lang.Object obj) {
        defpackage.pku pkuVar;
        defpackage.tpx tpxVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ujo)) {
            return false;
        }
        defpackage.ujo ujoVar = (defpackage.ujo) obj;
        synchronized (ujoVar) {
            pkuVar = ujoVar.a;
            tpxVar = ujoVar.b;
        }
        return j$.util.Objects.equals(this.a, pkuVar) && j$.util.Objects.equals(this.b, tpxVar) && j$.util.Objects.equals(this.c, ujoVar.c) && j$.util.Objects.equals(this.d, ujoVar.d);
    }

    @Override // defpackage.ulj
    public final synchronized void f(defpackage.tpx tpxVar) {
        this.b = tpxVar;
    }

    public final synchronized int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, this.d);
    }
}

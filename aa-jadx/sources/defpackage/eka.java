package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class eka {
    protected volatile defpackage.ekm a;
    public volatile defpackage.eix b;
    private volatile boolean c;

    public final int a() {
        int iH;
        if (this.b != null) {
            iH = this.b.c();
        } else {
            iH = this.a != null ? this.a.h() : 0;
        }
        boolean z = defpackage.eje.e;
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iH) * 9)) >>> 6) + iH;
    }

    public final defpackage.eix b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = defpackage.eix.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    public final defpackage.ekm c(defpackage.ekm ekmVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ekmVar;
                        this.b = defpackage.eix.b;
                    } catch (defpackage.ejx unused) {
                        this.c = true;
                        this.a = ekmVar;
                        this.b = defpackage.eix.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eka)) {
            return false;
        }
        defpackage.eka ekaVar = (defpackage.eka) obj;
        defpackage.ekm ekmVar = this.a;
        defpackage.ekm ekmVar2 = ekaVar.a;
        if (ekmVar == null && ekmVar2 == null) {
            return b().equals(ekaVar.b());
        }
        if (ekmVar == null || ekmVar2 == null) {
            return ekmVar != null ? ekmVar.equals(ekaVar.c(ekmVar.f())) : c(ekmVar2.f()).equals(ekmVar2);
        }
        return ekmVar.equals(ekmVar2);
    }

    public int hashCode() {
        return 1;
    }
}

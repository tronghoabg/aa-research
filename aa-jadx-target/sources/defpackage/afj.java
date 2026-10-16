package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afj implements defpackage.aej {
    private final defpackage.aey a;
    private final long b = 0;
    private final int c;

    public afj(defpackage.aey aeyVar, int i) {
        this.a = aeyVar;
        this.c = i;
        if (aeyVar instanceof defpackage.ags) {
            defpackage.ags agsVar = (defpackage.ags) aeyVar;
            if (agsVar.a != 0 || agsVar.b != 0) {
                return;
            }
        } else if (aeyVar instanceof defpackage.afy) {
            if (((defpackage.afy) aeyVar).a != 0) {
                return;
            }
        } else {
            if (!(aeyVar instanceof defpackage.afr)) {
                if (aeyVar instanceof defpackage.afs) {
                    throw null;
                }
                if (aeyVar instanceof defpackage.aer) {
                    throw null;
                }
                return;
            }
            if (((defpackage.afr) aeyVar).a.a != 0) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // defpackage.aej
    /* JADX INFO: renamed from: a */
    public final defpackage.agu c(defpackage.bil bilVar) {
        return new defpackage.ahc(this.a.c(bilVar), this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afj)) {
            return false;
        }
        defpackage.afj afjVar = (defpackage.afj) obj;
        if (!defpackage.afga.f(afjVar.a, this.a) || afjVar.c != this.c) {
            return false;
        }
        long j = afjVar.b;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        defpackage.a.aV(i);
        return (iHashCode + i) * 31;
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkd {
    public final defpackage.dfb a;
    public final long b;
    public final defpackage.dgc c;

    public dkd(defpackage.dfb dfbVar, long j, defpackage.dgc dgcVar) {
        this.a = dfbVar;
        this.b = defpackage.dax.h(j, a().length());
        this.c = dgcVar != null ? new defpackage.dgc(defpackage.dax.h(dgcVar.b, a().length())) : null;
    }

    public static /* synthetic */ defpackage.dkd b(defpackage.dkd dkdVar, defpackage.dfb dfbVar, long j, int i) {
        if ((i & 1) != 0) {
            dfbVar = dkdVar.a;
        }
        if ((i & 2) != 0) {
            j = dkdVar.b;
        }
        return new defpackage.dkd(dfbVar, j, (i & 4) != 0 ? dkdVar.c : null);
    }

    public final java.lang.String a() {
        return this.a.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dkd)) {
            return false;
        }
        long j = this.b;
        defpackage.dkd dkdVar = (defpackage.dkd) obj;
        long j2 = dkdVar.b;
        long j3 = defpackage.dgc.a;
        return j == j2 && defpackage.afga.f(this.c, dkdVar.c) && defpackage.afga.f(this.a, dkdVar.a);
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.a.hashCode() * 31;
        long j = defpackage.dgc.a;
        defpackage.dgc dgcVar = this.c;
        if (dgcVar != null) {
            long j2 = dgcVar.b;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        long j3 = this.b;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + i;
    }

    public final java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.a) + "', selection=" + defpackage.dgc.f(this.b) + ", composition=" + this.c + ")";
    }

    public /* synthetic */ dkd(java.lang.String str, long j, int i) {
        this(new defpackage.dfb(1 == (i & 1) ? "" : str), (i & 2) != 0 ? defpackage.dgc.a : j, (defpackage.dgc) null);
    }
}

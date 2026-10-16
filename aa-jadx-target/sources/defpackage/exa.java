package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class exa {
    private final defpackage.exb a;
    private final java.util.List b;
    private final java.util.List c;
    private final int d;
    private java.util.List e;

    public exa(defpackage.exb exbVar, java.util.List list, java.util.List list2, int i) {
        this.a = exbVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final java.util.List a() {
        java.util.List listF = this.e;
        if (listF == null) {
            defpackage.afct afctVar = new defpackage.afct(10);
            afctVar.addAll(this.b);
            defpackage.exb exbVar = this.a;
            if (exbVar != null) {
                afctVar.add(exbVar);
            }
            afctVar.addAll(this.c);
            listF = afctVar.f();
            this.e = listF;
        }
        listF.getClass();
        return listF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.exa exaVar = (defpackage.exa) obj;
        return this.d == exaVar.d && defpackage.afga.f(a(), exaVar.a());
    }

    public final int hashCode() {
        return (this.d * 31) + a().hashCode();
    }

    public final java.lang.String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ")";
    }

    public exa() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ exa(byte[] bArr) {
        defpackage.afce afceVar = defpackage.afce.a;
        this(null, afceVar, afceVar, -1);
    }
}

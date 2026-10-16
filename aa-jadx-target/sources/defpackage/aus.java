package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aus {
    public defpackage.ctx a;
    public defpackage.ctx b;
    public final int c = 2;
    private final int d = 0;
    private final int e = 0;

    public final void a(defpackage.csy csyVar, defpackage.csy csyVar2, long j) {
        long jD = defpackage.dln.d(defpackage.dlm.d(j), defpackage.dlm.b(j), defpackage.dlm.c(j), defpackage.dlm.a(j));
        if (csyVar != null) {
            csyVar.e(csyVar.f(defpackage.dlm.a(jD)));
            this.a = csyVar instanceof defpackage.ctx ? (defpackage.ctx) csyVar : null;
        }
        if (csyVar2 != null) {
            csyVar2.e(csyVar2.f(defpackage.dlm.a(jD)));
            this.b = csyVar2 instanceof defpackage.ctx ? (defpackage.ctx) csyVar2 : null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aus)) {
            return false;
        }
        defpackage.aus ausVar = (defpackage.aus) obj;
        int i = ausVar.c;
        int i2 = ausVar.d;
        int i3 = ausVar.e;
        return true;
    }

    public final int hashCode() {
        return 1922;
    }

    public final java.lang.String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}

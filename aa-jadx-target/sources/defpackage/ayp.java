package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ayp extends defpackage.cge implements defpackage.cwu {
    public defpackage.azi a;

    public ayp(defpackage.azi aziVar) {
        this.a = aziVar;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        java.util.List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.azf azfVar = (defpackage.azf) list.get(i);
            defpackage.cmq cmqVar = azfVar.k;
            if (cmqVar != null) {
                long j = azfVar.i;
                long j2 = cmqVar.m;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                cxnVar.r().c.l(f, f2);
                float f3 = -f;
                float f4 = -f2;
                try {
                    defpackage.dai.S(cxnVar, cmqVar);
                    cxnVar.r().c.l(f3, f4);
                } catch (java.lang.Throwable th) {
                    cxnVar.r().c.l(f3, f4);
                    throw th;
                }
            }
        }
        cxnVar.q();
    }

    @Override // defpackage.cge
    public final void dz() {
        this.a.b = this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ayp) && defpackage.afga.f(this.a, ((defpackage.ayp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cge
    public final void q() {
        this.a.c();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ")";
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}

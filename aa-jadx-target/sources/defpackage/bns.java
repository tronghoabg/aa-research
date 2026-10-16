package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bns implements defpackage.ckg {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bns(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [cwm, java.lang.Object] */
    @Override // defpackage.ckg
    public final long a() {
        int i = this.b;
        if (i == 0) {
            ?? r5 = this.a;
            long jA = ((defpackage.bnt) r5).d.a();
            if (jA != 16) {
                return jA;
            }
            defpackage.bpi bpiVar = (defpackage.bpi) defpackage.cjv.y(r5, defpackage.bpk.b);
            if (bpiVar != null) {
                long j = bpiVar.a;
                if (j != 16) {
                    return j;
                }
            }
            return ((defpackage.ckd) defpackage.cjv.y(r5, defpackage.bnq.a)).a;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                throw null;
            }
            return ((defpackage.bpl) this.a).a;
        }
        defpackage.ajd ajdVar = (defpackage.ajd) this.a;
        long j2 = ajdVar.a;
        if (j2 == 16) {
            return 16L;
        }
        return defpackage.ckd.h(j2, defpackage.ckd.a(j2) * ajdVar.b);
    }
}

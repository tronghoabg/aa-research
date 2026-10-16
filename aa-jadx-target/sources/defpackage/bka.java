package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bka implements defpackage.dob {
    private final defpackage.cfu a;
    private final defpackage.bkc b;
    private long c = 0;

    public bka(defpackage.cfu cfuVar, defpackage.bkc bkcVar) {
        this.a = cfuVar;
        this.b = bkcVar;
    }

    @Override // defpackage.dob
    public final long a(defpackage.dlx dlxVar, long j, defpackage.dlz dlzVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return defpackage.dlw.d(defpackage.dlw.d(dlxVar.d(), defpackage.dlv.d(jA)), this.a.a(j2, 0L, dlzVar));
    }
}

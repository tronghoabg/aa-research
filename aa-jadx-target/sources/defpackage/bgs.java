package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bgs implements defpackage.dob {
    private final defpackage.dob a;
    private defpackage.dly b;
    private defpackage.dlz c;
    private defpackage.dly d;
    private defpackage.dlw e;

    public bgs(defpackage.dob dobVar) {
        this.a = dobVar;
    }

    @Override // defpackage.dob
    public final long a(defpackage.dlx dlxVar, long j, defpackage.dlz dlzVar, long j2) {
        defpackage.dly dlyVar;
        defpackage.dly dlyVar2;
        defpackage.dlw dlwVar = this.e;
        if (dlwVar != null && (dlyVar = this.b) != null && defpackage.a.i(dlyVar.a, j) && this.c == dlzVar && (dlyVar2 = this.d) != null && defpackage.a.i(dlyVar2.a, j2)) {
            return dlwVar.a;
        }
        long jA = this.a.a(dlxVar, j, dlzVar, j2);
        this.b = new defpackage.dly(j);
        this.c = dlzVar;
        this.d = new defpackage.dly(j2);
        this.e = new defpackage.dlw(jA);
        return jA;
    }
}

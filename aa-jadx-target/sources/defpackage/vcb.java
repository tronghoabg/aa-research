package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vcb implements adjz {
    private static defpackage.vcb a;

    public static synchronized defpackage.vcb a() {
        defpackage.vcb vcbVar;
        vcbVar = a;
        if (vcbVar == null) {
            vcbVar = new defpackage.vcb();
            a = vcbVar;
        }
        return vcbVar;
    }

    public final defpackage.adrq b(defpackage.adng adngVar, defpackage.adjw adjwVar, defpackage.adjx adjxVar) {
        defpackage.vca vcaVar;
        java.lang.Boolean.TRUE.booleanValue();
        defpackage.vlu vluVar = (defpackage.vlu) adjwVar.g(defpackage.vbv.a);
        if (vluVar == null) {
            vcaVar = new defpackage.vca(new defpackage.vwp(null, "https://" + adjxVar.a() + "/" + adngVar.b, false, android.os.SystemClock.elapsedRealtime()));
        } else {
            vcaVar = new defpackage.vca(new defpackage.vwp(adjxVar.a(), defpackage.vlu.e(vluVar), true, android.os.SystemClock.elapsedRealtime()));
        }
        return new defpackage.vby(adjxVar.d(adngVar, adjwVar.i(vcaVar)), vcaVar);
    }
}

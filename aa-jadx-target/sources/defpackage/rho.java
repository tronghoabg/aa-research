package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rho {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT");
    public final defpackage.rxs b;
    public final defpackage.yhx c;
    public final defpackage.rib d;
    public final boolean e;

    public rho(defpackage.rxs rxsVar, defpackage.rib ribVar) {
        this.b = rxsVar;
        this.d = ribVar;
        defpackage.acoo acooVar = defpackage.acoo.a;
        defpackage.yhx yhxVarN = defpackage.yhx.n(acooVar.fF().a().b);
        this.c = yhxVarN;
        this.e = acooVar.fF().e();
        a.l().ai(8095).y("FsmTelemetry will monitoring for states: %s", yhxVarN);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sxm extends defpackage.slw implements defpackage.sma {
    public sxm(android.content.Context context, defpackage.sxp sxpVar) {
        super(context, null, defpackage.sxq.a, sxpVar, defpackage.slv.a);
    }

    public final defpackage.swx a() {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.sxi();
        snyVar.c = 4501;
        return super.u(0, snyVar.a());
    }

    public final void b(sxr sxrVar) {
        sno snoVarD = sqg.d(sxrVar, this.g, "sxr");
        sxh sxhVar = new sxh(this, snoVarD, ((defpackage.sxp) this.e).a);
        qqu qquVar = new qqu(this, 17);
        snu snuVar = new snu();
        snuVar.a = sxhVar;
        snuVar.b = qquVar;
        snuVar.c = snoVarD;
        snuVar.d = new com.google.android.gms.common.Feature[]{defpackage.sxg.a};
        snuVar.f = 4507;
        x(snuVar.a());
    }
}

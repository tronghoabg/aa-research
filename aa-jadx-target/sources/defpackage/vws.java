package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vws implements defpackage.zgm {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vws(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r6v26, types: [afak, java.lang.Object] */
    @Override // defpackage.zgm
    public final defpackage.zhs a() {
        int i = this.b;
        if (i == 0) {
            return ((defpackage.vwt) this.a).c();
        }
        if (i != 1) {
            if (i == 2) {
                java.lang.Object obj = this.a;
                defpackage.zgn zgnVarB = defpackage.xvx.b(new defpackage.key(obj, 14));
                defpackage.whs whsVar = (defpackage.whs) obj;
                return defpackage.ysr.cq(defpackage.zgh.g(whsVar.a, zgnVarB, whsVar.b));
            }
            if (i != 3) {
                if (i == 4) {
                    return this.a;
                }
                int i2 = ziy.a;
                return defpackage.ysr.cp((org.chromium.net.CronetEngine) ((uq) this.a).d.a());
            }
            java.lang.Object obj2 = this.a;
            defpackage.whs whsVar2 = (defpackage.whs) obj2;
            try {
                return defpackage.ysr.cp(((defpackage.whs) obj2).b((android.net.Uri) defpackage.ysr.cw(whsVar2.a)));
            } catch (java.io.IOException e) {
                defpackage.wha whrVar = new whr(whsVar2);
                defpackage.xyn xynVar = whsVar2.c;
                if (xynVar.f()) {
                    return ((e instanceof wgc) || (e.getCause() instanceof wgc)) ? new defpackage.zif(e) : defpackage.zgh.g(((defpackage.kwv) xynVar.b()).x(e, whrVar), defpackage.xvx.b(new defpackage.key(obj2, 13)), whsVar2.b);
                }
                return new defpackage.zif(e);
            }
        }
        defpackage.vtm vtmVar = (defpackage.vtm) this.a;
        defpackage.xyn xynVar2 = (defpackage.xyn) vtmVar.c.fF();
        boolean zF = xynVar2.f();
        java.lang.Object objFF = vtmVar.d.fF();
        if (zF) {
            defpackage.xyn xynVar3 = (defpackage.xyn) objFF;
            if (xynVar3.f()) {
                vtl vtlVar = new vtl((java.io.File) xynVar2.b(), (java.lang.String) xynVar3.b());
                int iA = vtlVar.a();
                vtlVar.b().delete();
                vtlVar.b = 0;
                vtlVar.c = true;
                if (iA < ((defpackage.vtn) vtmVar.a.a()).c) {
                    return defpackage.zho.a;
                }
                java.lang.Object obj3 = vtmVar.f;
                defpackage.vsp vspVarA = defpackage.vsq.a();
                defpackage.abor aborVarN = ajht.a.n();
                defpackage.abor aborVarN2 = ajhq.a.n();
                aborVarN2.t();
                ajhq ajhqVar = aborVarN2.b;
                ajhqVar.c = 6;
                ajhqVar.b = 1 | ajhqVar.b;
                aborVarN.t();
                ajht ajhtVar = aborVarN.b;
                ajhq ajhqVarQ = aborVarN2.q();
                ajhqVarQ.getClass();
                ajhtVar.A = ajhqVarQ;
                ajhtVar.b |= 8388608;
                vspVarA.g((ajht) aborVarN.q());
                return ((defpackage.vsu) obj3).a(vspVarA.a());
            }
        }
        return defpackage.zho.a;
    }
}

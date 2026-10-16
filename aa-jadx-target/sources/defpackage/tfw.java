package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfw implements defpackage.afak {
    private final defpackage.ldv a;

    public tfw(defpackage.ldv ldvVar) {
        this.a = ldvVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        defpackage.abot abotVar = (defpackage.abot) ajfx.a.n();
        defpackage.aboj abojVar = ajfy.d;
        defpackage.abor aborVarN = ajfv.a.n();
        defpackage.ldv ldvVar = this.a;
        boolean zE = ldvVar.e();
        aborVarN.t();
        ajfv ajfvVar = aborVarN.b;
        ajfvVar.b |= 64;
        ajfvVar.h = zE;
        java.lang.Boolean boolB = ldvVar.b();
        if (boolB != null) {
            boolean zBooleanValue = boolB.booleanValue();
            aborVarN.t();
            ajfv ajfvVar2 = aborVarN.b;
            ajfvVar2.b |= 128;
            ajfvVar2.i = zBooleanValue;
        }
        defpackage.tex texVarA = ldvVar.a();
        if (texVarA != null) {
            aborVarN.t();
            ajfv ajfvVar3 = aborVarN.b;
            java.lang.String str = texVarA.a;
            str.getClass();
            ajfvVar3.b |= 1;
            ajfvVar3.c = str;
            aborVarN.t();
            ajfv ajfvVar4 = aborVarN.b;
            java.lang.String str2 = texVarA.b;
            str2.getClass();
            ajfvVar4.b |= 2;
            ajfvVar4.d = str2;
            aborVarN.t();
            ajfv ajfvVar5 = aborVarN.b;
            java.lang.String str3 = texVarA.c;
            str3.getClass();
            ajfvVar5.b |= 4;
            ajfvVar5.e = str3;
            aborVarN.t();
            ajfv ajfvVar6 = aborVarN.b;
            java.lang.String str4 = texVarA.d;
            str4.getClass();
            ajfvVar6.b |= 8;
            ajfvVar6.f = str4;
            aborVarN.t();
            ajfv ajfvVar7 = aborVarN.b;
            java.lang.String str5 = texVarA.e;
            str5.getClass();
            ajfvVar7.b |= 16;
            ajfvVar7.g = str5;
        }
        defpackage.yzn yznVarG = defpackage.ldv.g();
        if (yznVarG != null && !defpackage.yzn.UNKNOWN.equals(yznVarG)) {
            int i = yznVarG.f;
            aborVarN.t();
            ajfv ajfvVar8 = aborVarN.b;
            ajfvVar8.b |= 512;
            ajfvVar8.j = i;
        }
        defpackage.abor aborVarN2 = ajfy.a.n();
        ajfv ajfvVarQ = aborVarN.q();
        aborVarN2.t();
        ajfy ajfyVar = aborVarN2.b;
        ajfvVarQ.getClass();
        ajfyVar.c = ajfvVarQ;
        ajfyVar.b |= 1;
        abotVar.bc(abojVar, aborVarN2.q());
        return abotVar.q();
    }
}

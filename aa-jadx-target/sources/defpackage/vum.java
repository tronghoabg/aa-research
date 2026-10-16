package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vum {
    public final android.content.Context a;
    final defpackage.afak b;
    final defpackage.afak c;
    final defpackage.afak d;
    public final defpackage.afak e;
    public final defpackage.afak f;
    public final defpackage.afak g;
    public final defpackage.afak h;
    public final defpackage.afak i;
    public final defpackage.afak j;
    public final defpackage.afak k;
    public final defpackage.afak l;
    public final defpackage.afak m;
    public final defpackage.afak n;
    public final defpackage.vpq o;

    public vum(android.content.Context context, defpackage.vpq vpqVar, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4, defpackage.afak afakVar5, defpackage.afak afakVar6, defpackage.afak afakVar7, defpackage.afak afakVar8, defpackage.afak afakVar9, defpackage.afak afakVar10, defpackage.afak afakVar11, defpackage.afak afakVar12, defpackage.afak afakVar13) {
        this.a = context;
        this.o = vpqVar;
        this.b = afakVar;
        this.c = afakVar2;
        this.d = afakVar3;
        this.e = afakVar4;
        this.h = afakVar7;
        this.i = afakVar8;
        this.j = afakVar9;
        this.f = afakVar5;
        this.g = afakVar6;
        this.k = afakVar10;
        this.l = afakVar11;
        this.m = afakVar12;
        this.n = afakVar13;
    }

    public static defpackage.ygw a(acau acauVar, java.util.Map map, long j) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        long j2 = 0;
        for (acas acasVar : acauVar.c) {
            if (j >= 0) {
                long j3 = 1 + j2;
                if (j2 >= j) {
                    break;
                }
                j2 = j3;
            }
            defpackage.abor aborVarN = abtr.a.n();
            long j4 = acasVar.b;
            aborVarN.t();
            abtr abtrVar = aborVarN.b;
            abtrVar.b |= 1;
            abtrVar.c = j4;
            if (!acasVar.c.isEmpty()) {
                java.lang.String str = acasVar.c;
                aborVarN.t();
                abtr abtrVar2 = aborVarN.b;
                str.getClass();
                abtrVar2.b |= 2;
                abtrVar2.d = str;
            }
            acku ackuVar = (acku) map.get(acasVar.e);
            if (ackuVar != null) {
                aborVarN.t();
                abtr abtrVar3 = aborVarN.b;
                abtrVar3.b |= 4;
                abtrVar3.e = ackuVar.a;
            }
            ygrVar.i(aborVarN.q());
        }
        return ygrVar.g();
    }
}

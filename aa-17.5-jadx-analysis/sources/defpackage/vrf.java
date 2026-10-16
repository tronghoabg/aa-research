package defpackage;

/* loaded from: classes3.dex */
final class vrf extends vri {
    public static final vrf a = new vrf();

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ abow a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        abnp abnpVarN = ajen.a.n();
        abnpVarN.t();
        ajen ajenVar = (ajen) abnpVarN.b;
        ajenVar.b |= 1;
        ajenVar.c = iIntValue;
        if (str != null) {
            ajeo ajeoVarP = vuf.p(str);
            abnpVarN.t();
            ajen ajenVar2 = (ajen) abnpVarN.b;
            ajeoVarP.getClass();
            ajenVar2.d = ajeoVarP;
            ajenVar2.b |= 2;
        }
        return (ajen) abnpVarN.q();
    }

    @Override // defpackage.vri
    public final /* synthetic */ abow b(abow abowVar, abow abowVar2) {
        int i;
        ajen ajenVar = (ajen) abowVar;
        ajen ajenVar2 = (ajen) abowVar2;
        if (ajenVar == null || ajenVar2 == null) {
            return ajenVar;
        }
        if ((ajenVar.b & 1) == 0 || (i = ajenVar.c - ajenVar2.c) == 0) {
            return null;
        }
        abnp abnpVarN = ajen.a.n();
        if ((ajenVar.b & 2) != 0) {
            ajeo ajeoVar = ajenVar.d;
            if (ajeoVar == null) {
                ajeoVar = ajeo.a;
            }
            abnpVarN.t();
            ajen ajenVar3 = (ajen) abnpVarN.b;
            ajeoVar.getClass();
            ajenVar3.d = ajeoVar;
            ajenVar3.b |= 2;
        }
        abnpVarN.t();
        ajen ajenVar4 = (ajen) abnpVarN.b;
        ajenVar4.b |= 1;
        ajenVar4.c = i;
        return (ajen) abnpVarN.q();
    }

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ String c(abow abowVar) {
        ajeo ajeoVar = ((ajen) abowVar).d;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        return ajeoVar.d;
    }
}

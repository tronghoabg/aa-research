package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tci implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ tci(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            bool.booleanValue();
            defpackage.afdo afdoVar = defpackage.tcu.a;
            return bool;
        }
        if (i == 1) {
            defpackage.ygw ygwVar = (defpackage.ygw) obj;
            defpackage.ogl oglVar = defpackage.ogm.a;
            ygwVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : ygwVar) {
                if (((nuv) obj2).c.x == defpackage.nve.e) {
                    arrayList.add(obj2);
                }
            }
            return defpackage.afga.aW(arrayList, new defpackage.azq(9));
        }
        if (i == 2) {
            java.lang.Boolean bool2 = (java.lang.Boolean) obj;
            defpackage.afdo afdoVar2 = defpackage.tcu.a;
            if (bool2 != null) {
                return java.lang.Boolean.valueOf(!bool2.booleanValue());
            }
            return null;
        }
        if (i == 3) {
            defpackage.afdo afdoVar3 = defpackage.tcu.a;
            return java.lang.Boolean.valueOf(obj != null);
        }
        if (i == 4) {
            ((defpackage.teh) obj).getClass();
            return new java.util.ArrayList();
        }
        if (i != 5) {
            aivy aivyVar = (defpackage.afdm) obj;
            if (aivyVar instanceof aivy) {
                return aivyVar;
            }
            return null;
        }
        aiut aiutVar = (defpackage.afdm) obj;
        if (aiutVar instanceof aiut) {
            return aiutVar;
        }
        return null;
    }
}

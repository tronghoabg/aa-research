package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class whl implements defpackage.zgn {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ whl(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zgn
    public final defpackage.zhs a(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            return ((defpackage.who) this.a).e.a();
        }
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                return ((defpackage.whw) this.a).b.h();
            }
            return ((defpackage.whw) this.a).c.a();
        }
        defpackage.ygw ygwVar = (defpackage.ygw) obj;
        if (ygwVar.isEmpty()) {
            return defpackage.zho.a;
        }
        defpackage.vup vupVar = (defpackage.vup) this.a;
        ajfj ajfjVar = (ajfj) vupVar.g.a();
        defpackage.abor aborVarN = ajfi.a.n();
        int size = ygwVar.size();
        aborVarN.t();
        ajfi ajfiVar = aborVarN.b;
        ajfiVar.b = 2 | ajfiVar.b;
        ajfiVar.e = size;
        aborVarN.t();
        ajfi ajfiVar2 = aborVarN.b;
        ajfjVar.getClass();
        ajfiVar2.d = ajfjVar;
        ajfiVar2.b |= 1;
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 0; i3 < ajfjVar.b.size(); i3++) {
            int iS = afzh.S(ajfjVar.b.e(i3));
            if (iS == 0) {
                iS = 1;
            }
            hashSet.add(java.lang.Integer.valueOf(iS - 1));
        }
        int size2 = ygwVar.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ajfh ajfhVar = (ajfh) ygwVar.get(i4);
            int iS2 = afzh.S(ajfhVar.d);
            if (iS2 == 0) {
                iS2 = 1;
            }
            if (hashSet.contains(java.lang.Integer.valueOf(iS2 - 1))) {
                aborVarN.t();
                ajfi ajfiVar3 = aborVarN.b;
                ajfhVar.getClass();
                defpackage.abpj abpjVar = ajfiVar3.c;
                if (!abpjVar.c()) {
                    int size3 = abpjVar.size();
                    ajfiVar3.c = abpjVar.d(size3 + size3);
                }
                ajfiVar3.c.add(ajfhVar);
            }
        }
        ajfi ajfiVarQ = aborVarN.q();
        defpackage.vsu vsuVar = vupVar.a;
        defpackage.vsp vspVarA = defpackage.vsq.a();
        defpackage.abor aborVarN2 = ajht.a.n();
        aborVarN2.t();
        ajht ajhtVar = aborVarN2.b;
        ajfiVarQ.getClass();
        ajhtVar.r = ajfiVarQ;
        ajhtVar.b |= 65536;
        vspVarA.g((ajht) aborVarN2.q());
        defpackage.zhs zhsVarA = vsuVar.a(vspVarA.a());
        defpackage.wdc wdcVar = new defpackage.wdc(vupVar, ygwVar, i2);
        java.util.concurrent.Executor executor = vupVar.c;
        int i5 = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(zhsVarA, wdcVar);
        zhsVarA.c(zggVar, defpackage.ysr.ch(executor, zggVar));
        return zggVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bmo implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ bmo(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.a;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
        int i2 = 0;
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cxs cxsVar = (defpackage.cxs) obj;
                cxsVar.o(bmq.b, (int) (cxsVar.n().h() >> 32));
                cxsVar.o(bmq.a, 0.0f);
                return defpackage.afbk.a;
            case 1:
                android.content.res.Resources resources = (android.content.res.Resources) obj;
                resources.getClass();
                return java.lang.Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                float f = bnj.a;
                defpackage.dbb.j((defpackage.dek) obj, 1);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.dbb.j((defpackage.dek) obj, 0);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                bot botVar = (bot) obj;
                btg[] btgVarArr = new btg[3];
                btgVarArr[0] = bti.a;
                btgVarArr[1] = bti.b;
                defpackage.dlx dlxVar = botVar.a;
                int iA = defpackage.dlw.a(dlxVar.c());
                long j = botVar.b;
                btgVarArr[2] = iA < ((int) (j >> 32)) / 2 ? bti.c : bti.d;
                java.util.List listAc = defpackage.afga.ac(btgVarArr);
                long j2 = botVar.c >> 32;
                defpackage.dlz dlzVar = botVar.d;
                defpackage.zm zmVar = new defpackage.zm(listAc.size());
                int size = listAc.size();
                while (i2 < size) {
                    defpackage.dlz dlzVar2 = dlzVar;
                    zmVar.e(((btg) listAc.get(i2)).a(dlxVar, j, (int) j2, dlzVar2));
                    i2++;
                    dlzVar = dlzVar2;
                }
                return zmVar;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                bot botVar2 = (bot) obj;
                bth[] bthVarArr = new bth[4];
                bthVarArr[0] = bti.e;
                bthVarArr[1] = bti.f;
                bthVarArr[2] = bti.g;
                defpackage.dlx dlxVar2 = botVar2.a;
                int iB = defpackage.dlw.b(dlxVar2.c());
                long j3 = botVar2.b;
                bthVarArr[3] = iB < ((int) (j3 & 4294967295L)) / 2 ? bti.h : bti.i;
                java.util.List listAc2 = defpackage.afga.ac(bthVarArr);
                long j4 = botVar2.c & 4294967295L;
                defpackage.zm zmVar2 = new defpackage.zm(listAc2.size());
                int size2 = listAc2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    zmVar2.e(((bth) listAc2.get(i3)).a(dlxVar2, j3, (int) j4));
                }
                return zmVar2;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.skb skbVar = (defpackage.skb) obj;
                defpackage.aeu aeuVar = bpf.a;
                skbVar.a = 1750;
                skbVar.h(fValueOf2, 0).b = bpf.a;
                skbVar.h(fValueOf, 1000);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.skb skbVar2 = (defpackage.skb) obj;
                defpackage.aeu aeuVar2 = bpf.a;
                skbVar2.a = 1750;
                skbVar2.h(fValueOf2, 250).b = bpf.a;
                skbVar2.h(fValueOf, 1250);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.skb skbVar3 = (defpackage.skb) obj;
                defpackage.aeu aeuVar3 = bpf.a;
                skbVar3.a = 6000;
                skbVar3.h(java.lang.Float.valueOf(0.87f), 3000).b = bpf.b;
                skbVar3.h(java.lang.Float.valueOf(0.1f), 6000);
                return defpackage.afbk.a;
            case 9:
                defpackage.skb skbVar4 = (defpackage.skb) obj;
                defpackage.aeu aeuVar4 = bpf.a;
                skbVar4.a = 6000;
                java.lang.Float fValueOf3 = java.lang.Float.valueOf(90.0f);
                defpackage.afq afqVarH = skbVar4.h(fValueOf3, 300);
                defpackage.aeu aeuVar5 = bui.a;
                afqVarH.b = bui.b;
                skbVar4.h(fValueOf3, 1500);
                java.lang.Float fValueOf4 = java.lang.Float.valueOf(180.0f);
                skbVar4.h(fValueOf4, 1800);
                skbVar4.h(fValueOf4, 3000);
                java.lang.Float fValueOf5 = java.lang.Float.valueOf(270.0f);
                skbVar4.h(fValueOf5, 3300);
                skbVar4.h(fValueOf5, 4500);
                java.lang.Float fValueOf6 = java.lang.Float.valueOf(360.0f);
                skbVar4.h(fValueOf6, 4800);
                skbVar4.h(fValueOf6, 6000);
                return defpackage.afbk.a;
            case 10:
                defpackage.skb skbVar5 = (defpackage.skb) obj;
                defpackage.aeu aeuVar6 = bpf.a;
                skbVar5.a = 1750;
                skbVar5.h(fValueOf2, 650).b = bpf.a;
                skbVar5.h(fValueOf, 1500);
                return defpackage.afbk.a;
            case 11:
                defpackage.skb skbVar6 = (defpackage.skb) obj;
                defpackage.aeu aeuVar7 = bpf.a;
                skbVar6.a = 1750;
                skbVar6.h(fValueOf2, 900).b = bpf.a;
                skbVar6.h(fValueOf, 1750);
                return defpackage.afbk.a;
            case 12:
                defpackage.bvm bvmVar = defpackage.bqv.a;
                ((defpackage.dek) obj).a(defpackage.def.m, java.lang.Boolean.TRUE);
                return defpackage.afbk.a;
            case 13:
                return defpackage.afbk.a;
            case 14:
                defpackage.dbb.j((defpackage.dek) obj, 1);
                return defpackage.afbk.a;
            case 15:
                defpackage.cgf cgfVar = bsk.a;
                return defpackage.afbk.a;
            case 16:
                defpackage.cgf cgfVar2 = bsk.a;
                return defpackage.afbk.a;
            case 17:
                ((defpackage.czh) obj).getClass();
                throw null;
            case 18:
                int i4 = defpackage.cgx.h;
                return java.lang.Boolean.valueOf(defpackage.vx.d((defpackage.dec) obj));
            case 19:
                defpackage.chb chbVar = (defpackage.chb) obj;
                if (!chbVar.q.A) {
                    return defpackage.czg.b;
                }
                defpackage.chb chbVar2 = chbVar.d;
                chbVar.d = null;
                chbVar.b = null;
                return defpackage.czg.a;
            default:
                return defpackage.afbk.a;
        }
    }
}

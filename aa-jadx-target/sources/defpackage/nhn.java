package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nhn implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ nhn(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws wfo {
        boolean z;
        byte[] bArr = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.nif.a;
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            case 1:
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.nje.a, defpackage.bxv.c);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar3 = defpackage.nif.a;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nke nkeVar = defpackage.nkj.a;
                defpackage.ntb ntbVarB = defpackage.nte.c().b();
                defpackage.mmi.c();
                defpackage.yhe yheVarK = defpackage.mmi.h() ? defpackage.yhe.k(ntbVarB.r(defpackage.muj.h.a().e()), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772045, false, null, 0)) : defpackage.ync.a;
                defpackage.rcx rcxVar = new defpackage.rcx();
                rcxVar.e(defpackage.yhe.l(com.google.android.gms.car.display.CarRegionId.a, 1, ntbVarB.r(defpackage.muj.h.a().e()), 0));
                rcxVar.f(yheVarK);
                rcxVar.a = true;
                return rcxVar.a();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.nkj();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.nod nodVar = defpackage.nod.a;
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar4 = defpackage.non.a;
                if (((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().g("key_settings_show_rail_widget", false)) {
                    defpackage.yqm yqmVar5 = defpackage.nte.a;
                    z = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().L();
                }
                return java.lang.Boolean.valueOf(z);
            case 10:
                return new defpackage.nvq(bArr);
            case 11:
                return new defpackage.nza();
            case 12:
                int i = defpackage.nzs.a;
                return defpackage.afbk.a;
            case 13:
                defpackage.yhx yhxVar = defpackage.obg.a;
                return new defpackage.obf();
            case 14:
                defpackage.yqm yqmVar6 = defpackage.ocl.a;
                return (android.os.PowerManager) defpackage.mkp.a.c.getSystemService(android.os.PowerManager.class);
            case 15:
                int i2 = defpackage.nuz.b;
                defpackage.wfp.c();
                return new defpackage.ogm(((defpackage.nuz) defpackage.mkp.a.i(defpackage.nuz.class)).a());
            case 16:
                defpackage.ogl oglVar = defpackage.ogm.a;
                defpackage.ogv ogvVarA = defpackage.ogv.a.a();
                defpackage.qsh qshVarE = defpackage.kit.b().e();
                qshVarE.getClass();
                defpackage.ygw ygwVarB = ogvVarA.b(qshVarE, defpackage.nze.b());
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ygwVarB, 10));
                java.util.Iterator<E> it = ygwVarB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.mqj) it.next()).a.a);
                }
                return arrayList;
            case 17:
                defpackage.ogu oguVar = defpackage.ogv.a;
                return new defpackage.ths(defpackage.mkp.a.c, defpackage.acrf.i());
            case 18:
                return new defpackage.ogv();
            case 19:
                return new defpackage.oja();
            default:
                return new defpackage.ojd();
        }
    }
}

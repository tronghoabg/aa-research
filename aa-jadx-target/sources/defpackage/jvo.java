package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jvo {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("ComposeVoicePlate");

    public static final void a(defpackage.cgf cgfVar, defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.bve bveVar, int i) {
        int i2;
        eqpVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1784540101);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(eqpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(eqpVar2) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, bool, bveVarC);
            defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVar2, 0, bveVarC);
            boolean zC = ((java.lang.Boolean) bysVarM.a()).booleanValue() ? defpackage.lek.a.a().c() : defpackage.lek.a.a().b();
            boolean z = ((java.lang.Number) bysVarM2.a()).intValue() == 2;
            defpackage.yqm yqmVar = b;
            ((defpackage.yqj) yqmVar.f()).R("Compose Voice Plate: demandSpaceState=%s, useCalVoicePlate=%s, voicePlateVisible=%s", java.lang.Integer.valueOf(((java.lang.Number) bysVarM2.a()).intValue()), java.lang.Boolean.valueOf(zC), java.lang.Boolean.valueOf(z));
            if (!zC) {
                ((defpackage.yqj) yqmVar.f()).u("Not showing Compose Voice Plate due to CAL Voice Plate disabled");
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.alz(cgfVar, eqpVar, eqpVar2, i, 10, null);
                    return;
                }
                return;
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            if (((java.lang.Number) bysVarM2.a()).intValue() == 2 || (defpackage.acyc.aA() && ((java.lang.Number) bysVarM2.a()).intValue() == 1)) {
                bwxVar.b(java.lang.Boolean.TRUE);
            }
            if (!((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                defpackage.bxl bxlVarJ2 = bveVarC.J();
                if (bxlVarJ2 != null) {
                    bxlVarJ2.c = new guf(cgfVar, eqpVar, eqpVar2, i, 18);
                    return;
                }
                return;
            }
            android.view.View view = (android.view.View) bveVarC.f(defpackage.daj.f);
            boolean zC2 = bveVarC.C(view);
            java.lang.Object objS2 = bwcVar.S();
            if (zC2 || objS2 == obj) {
                view.getClass();
                objS2 = defpackage.bt.g(view);
                if (objS2 == null) {
                    throw new java.lang.IllegalStateException(defpackage.a.bl(view, "View ", " does not have a Fragment set"));
                }
                bwcVar.ad(objS2);
            }
            defpackage.bt childFragmentManager = ((android.support.v4.app.Fragment) objS2).getChildFragmentManager();
            childFragmentManager.getClass();
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                android.support.v4.app.Fragment fragmentF = childFragmentManager.f("VoicePlateFragment");
                objS3 = fragmentF instanceof jvs ? (jvs) fragmentF : null;
                if (objS3 == null) {
                    objS3 = new jvs(true);
                }
                bwcVar.ad(objS3);
            }
            jvs jvsVar = (jvs) objS3;
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                objS4 = new gru(19);
                bwcVar.ad(objS4);
            }
            int iIntValue = ((java.lang.Number) defpackage.bxi.j(java.util.Arrays.copyOf(objArr, 0), defpackage.cea.a, (defpackage.afer) objS4, bveVarC, 3456)).intValue();
            defpackage.cgf cgfVarA = cgfVar.a(new defpackage.ajc(defpackage.kfp.i(bveVarC).a(), defpackage.cky.a));
            boolean zA = bveVarC.A(iIntValue);
            java.lang.Object objS5 = bwcVar.S();
            if (zA || objS5 == obj) {
                objS5 = new defpackage.cii(iIntValue, 5);
                bwcVar.ad(objS5);
            }
            defpackage.affc affcVar = (defpackage.affc) objS5;
            boolean zE = bveVarC.E(childFragmentManager) | bveVarC.E(jvsVar) | bveVarC.A(iIntValue) | bveVarC.D(z);
            java.lang.Object objS6 = bwcVar.S();
            if (zE || objS6 == obj) {
                objS6 = new jvn(childFragmentManager, jvsVar, z, iIntValue);
                bwcVar.ad(objS6);
            }
            jus.d(affcVar, cgfVarA, (defpackage.affc) objS6, bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ3 = bveVarC.J();
        if (bxlVarJ3 != null) {
            bxlVarJ3.c = new guf(cgfVar, eqpVar, eqpVar2, i, 19);
        }
    }
}

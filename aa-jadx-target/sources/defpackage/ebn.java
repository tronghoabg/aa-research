package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ebn {
    public static void a(android.view.View view, android.view.PointerIcon pointerIcon) {
        a$.ExternalSyntheticApiModelOutline2.m(view, pointerIcon);
    }

    public static final aisp b(android.view.View view) {
        return afsg.f(view.getParent(), defpackage.ebz.a);
    }

    public static final defpackage.bys c(defpackage.epy epyVar, defpackage.bve bveVar) {
        return defpackage.dai.aw(epyVar.b(), defpackage.afdp.a, defpackage.bxv.c, bveVar, 0);
    }

    public static final defpackage.bys d(aizj aizjVar, java.lang.Object obj, defpackage.bve bveVar) {
        defpackage.eqg eqgVar = (defpackage.eqg) bveVar.f(defpackage.esf.a);
        defpackage.epx epxVar = defpackage.epx.d;
        defpackage.afdp afdpVar = defpackage.afdp.a;
        defpackage.epy lifecycle = eqgVar.getLifecycle();
        java.lang.Object[] objArr = {aizjVar, lifecycle, epxVar, afdpVar};
        boolean zE = bveVar.E(lifecycle) | bveVar.A(epxVar.ordinal()) | bveVar.E(afdpVar) | bveVar.E(aizjVar);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zE || objS == defpackage.bvd.a) {
            esb esbVar = new esb(lifecycle, epxVar, afdpVar, aizjVar, (defpackage.afdk) null);
            bwcVar.ad(esbVar);
            objS = esbVar;
        }
        defpackage.affg affgVar = (defpackage.affg) objS;
        java.lang.Object objS2 = bwcVar.S();
        java.lang.Object obj2 = defpackage.bvd.a;
        if (objS2 == obj2) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
            bwcVar.ad(parcelableSnapshotMutableState);
            objS2 = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objS2;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 4);
        boolean zE2 = bveVar.E(affgVar);
        java.lang.Object objS3 = bwcVar.S();
        if (zE2 || objS3 == obj2) {
            defpackage.amx amxVar = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 10, (int[]) null);
            bwcVar.ad(amxVar);
            objS3 = amxVar;
        }
        defpackage.bvx.h(objArrCopyOf, (defpackage.affg) objS3, bveVar);
        return bwxVar;
    }
}

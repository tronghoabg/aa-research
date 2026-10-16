package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bmt implements aizk {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bmt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        int i = this.b;
        if (i == 0) {
            defpackage.asi asiVar = (defpackage.asi) obj;
            if (asiVar instanceof defpackage.asf) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
            } else if (asiVar instanceof defpackage.asg) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asg) asiVar).a);
            } else if (asiVar instanceof defpackage.asd) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
            } else if (asiVar instanceof defpackage.ase) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.ase) asiVar).a);
            } else if (asiVar instanceof defpackage.asn) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
            } else if (asiVar instanceof defpackage.aso) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.aso) asiVar).a);
            } else if (asiVar instanceof defpackage.asm) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asm) asiVar).a);
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                defpackage.bil bilVar = (defpackage.bil) this.a;
                ag$.ExternalSyntheticApiModelOutline0.m(bilVar.a(), (android.view.View) bilVar.a);
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.egk egkVar = (defpackage.egk) this.a;
            if (egkVar.g.A() instanceof defpackage.egv) {
                return defpackage.afbk.a;
            }
            java.lang.Object objG = egkVar.g(true, afdkVar);
            return objG != defpackage.afdr.a ? defpackage.afbk.a : objG;
        }
        odl odlVar = ((defpackage.odw) this.a).e.a;
        if (odlVar != null) {
            defpackage.odw.a.l().u("Dismissing tooltip due to click on anchor");
            defpackage.mcl.v(odlVar, defpackage.zbd.lL);
            odlVar.a();
        }
        return defpackage.afbk.a;
    }
}

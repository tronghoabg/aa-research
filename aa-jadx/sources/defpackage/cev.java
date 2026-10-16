package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cev {
    public static final java.lang.Object a = new java.lang.Object();

    public static final int a(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList) {
        defpackage.cfe cfeVar = snapshotStateList.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.e(cfeVar, snapshotStateList)).c;
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static final boolean c(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.affc affcVar) {
        int i;
        defpackage.cbl cblVar;
        java.lang.Object objInvoke;
        defpackage.cej cejVarB;
        boolean z;
        do {
            java.lang.Object obj = a;
            synchronized (obj) {
                defpackage.cfe cfeVar = snapshotStateList.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, snapshotStateList);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbr cbrVarJ = cblVar.j();
            objInvoke = affcVar.invoke(cbrVarJ);
            defpackage.cbl cblVarC = cbrVarJ.c();
            if (defpackage.afga.f(cblVarC, cblVar)) {
                break;
            }
            defpackage.cfe cfeVar2 = snapshotStateList.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, snapshotStateList, cejVarB);
                synchronized (obj) {
                    int i2 = cfbVar2.b;
                    if (i2 == i) {
                        cfbVar2.a = cblVarC;
                        z = true;
                        cfbVar2.c++;
                        cfbVar2.b = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.cer.q(cejVarB, snapshotStateList);
        } while (!z);
        return ((java.lang.Boolean) objInvoke).booleanValue();
    }

    public static final void d() {
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
    }
}

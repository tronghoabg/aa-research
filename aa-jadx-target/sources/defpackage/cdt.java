package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdt implements defpackage.bvu {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public cdt(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, java.lang.Object obj, defpackage.abr abrVar, int i) {
        this.d = i;
        this.c = snapshotStateList;
        this.a = obj;
        this.b = abrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eqf, java.lang.Object] */
    @Override // defpackage.bvu
    public final void a() {
        int i = this.d;
        if (i == 0) {
            java.lang.Object obj = this.c;
            java.lang.Object obj2 = this.a;
            defpackage.cdu cduVar = (defpackage.cdu) this.b;
            if (cduVar.c.i(obj2) == obj) {
                cduVar.a.put(obj2, ((defpackage.cdy) obj).b());
                return;
            }
            return;
        }
        if (i != 1) {
            this.c.getLifecycle().d(this.b);
        } else {
            java.lang.Object obj3 = this.a;
            ((androidx.compose.runtime.snapshots.SnapshotStateList) this.c).remove(obj3);
            ((defpackage.abr) this.b).f.i(obj3);
        }
    }

    public cdt(defpackage.cdu cduVar, java.lang.Object obj, defpackage.cdy cdyVar, int i) {
        this.d = i;
        this.b = cduVar;
        this.a = obj;
        this.c = cdyVar;
    }

    public cdt(defpackage.eqg eqgVar, defpackage.eqe eqeVar, defpackage.afgv afgvVar, int i) {
        this.d = i;
        this.c = eqgVar;
        this.b = eqeVar;
        this.a = afgvVar;
    }
}

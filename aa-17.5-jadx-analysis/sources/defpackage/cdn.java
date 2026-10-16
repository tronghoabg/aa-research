package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class cdn implements bvn {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public cdn(SnapshotStateList snapshotStateList, Object obj, abk abkVar, int i) {
        this.d = i;
        this.c = snapshotStateList;
        this.a = obj;
        this.b = abkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [epz, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        int i = this.d;
        if (i == 0) {
            Object obj = this.c;
            Object obj2 = this.a;
            cdo cdoVar = (cdo) this.b;
            if (cdoVar.c.i(obj2) == obj) {
                cdoVar.a.put(obj2, ((cds) obj).b());
                return;
            }
            return;
        }
        if (i != 1) {
            this.c.getLifecycle().d(this.b);
        } else {
            Object obj3 = this.a;
            ((SnapshotStateList) this.c).remove(obj3);
            ((abk) this.b).f.i(obj3);
        }
    }

    public cdn(cdo cdoVar, Object obj, cds cdsVar, int i) {
        this.d = i;
        this.b = cdoVar;
        this.a = obj;
        this.c = cdsVar;
    }

    public cdn(eqa eqaVar, epy epyVar, affv affvVar, int i) {
        this.d = i;
        this.c = eqaVar;
        this.b = epyVar;
        this.a = affvVar;
    }
}

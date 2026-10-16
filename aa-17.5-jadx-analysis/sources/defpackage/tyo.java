package defpackage;

import android.util.LongSparseArray;

/* loaded from: classes3.dex */
final class tyo implements tza {
    private final typ a;
    private final LongSparseArray b = new LongSparseArray();
    private final gjv c;

    public tyo(typ typVar) {
        this.a = typVar;
        this.c = new gjv(typVar);
    }

    @Override // defpackage.tqt
    public final int a() {
        return 2;
    }

    @Override // defpackage.tqt
    public final tqo b(long j) {
        twh twhVar;
        synchronized (this) {
            LongSparseArray longSparseArray = this.b;
            twhVar = (twh) longSparseArray.get(j);
            if (twhVar == null) {
                twhVar = new twh((int) j, this.c);
                longSparseArray.put(j, twhVar);
            }
        }
        return twhVar;
    }

    @Override // defpackage.ujx
    public final ukf c(int i) {
        ukh ukhVarL = this.a.l();
        return ukhVarL != null ? ukhVarL.b(i) : ukf.a;
    }

    @Override // defpackage.ujx
    public final ukf d(int i, aekf aekfVar) {
        return typ.r(i, (wnq) this.a.i.get(), aekfVar);
    }

    @Override // defpackage.ujx
    public final ukf i(long j) {
        return this.a.k(j);
    }

    @Override // defpackage.ujx
    public final ukf j(int i) {
        return ukf.a;
    }
}

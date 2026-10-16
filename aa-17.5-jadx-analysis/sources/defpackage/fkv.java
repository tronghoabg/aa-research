package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
final class fkv extends afde implements afei {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public fkv(afck afckVar) {
        super(4, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            fjo.a();
            Log.e(fkx.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(j * 30000, fkx.b);
            this.a = 1;
            if (aiow.c(jMin, this) == afcrVar) {
                return afcrVar;
            }
        }
        return true;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        fkv fkvVar = new fkv((afck) obj4);
        fkvVar.b = (Throwable) obj2;
        fkvVar.c = jLongValue;
        return fkvVar.hT(afak.a);
    }
}

package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class gqy extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqy(long j, afck afckVar) {
        super(2, afckVar);
        this.b = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        gqy gqyVar = new gqy(this.b, afckVar);
        gqyVar.a = obj;
        return gqyVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return Boolean.valueOf(Math.abs(((Duration) this.a).toMillis() - this.b) < 500);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gqy) b((Duration) obj, (afck) obj2)).hT(afak.a);
    }
}

package defpackage;

/* loaded from: classes.dex */
final class ack extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ adb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ack(boolean z, boolean z2, adb adbVar, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = z2;
        this.d = adbVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ack(this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0 && this.b && !this.c) {
            adb adbVar = this.d;
            this.a = 1;
            if (adbVar.f(this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ack) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

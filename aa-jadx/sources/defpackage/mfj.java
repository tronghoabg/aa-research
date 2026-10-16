package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mfj implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mfj(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.c;
        if (i == 0) {
            defpackage.to toVar = (defpackage.to) obj;
            toVar.getClass();
            toVar.a(androidx.car.app.model.CarColor.createCustom(this.a, this.b));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.to toVar2 = (defpackage.to) obj;
            toVar2.getClass();
            toVar2.a(androidx.car.app.model.CarColor.createCustom(this.a, this.b));
            return defpackage.afbk.a;
        }
        defpackage.skb skbVar = (defpackage.skb) obj;
        skbVar.getClass();
        int i2 = this.a;
        skbVar.a = i2;
        skbVar.h(java.lang.Float.valueOf(-0.3f), 0);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.3f);
        skbVar.h(fValueOf, this.b);
        skbVar.h(fValueOf, i2);
        return defpackage.afbk.a;
    }
}

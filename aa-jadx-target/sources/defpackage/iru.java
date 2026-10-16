package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iru implements java.util.function.Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ iru(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            ((isb) obj).p.b(this.a);
            return;
        }
        if (i != 1) {
            ((isb) obj).f = this.a;
        } else {
            defpackage.yqm yqmVar = defpackage.imr.a;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT, defpackage.zbd.us);
            rrvVarH.k(this.a);
            ((defpackage.jfo) obj).b(rrvVarH.l());
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class irv implements java.util.function.Consumer {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ irv(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            defpackage.isb isbVar = (defpackage.isb) obj;
            defpackage.isk iskVar = isbVar.n;
            long j = this.a;
            iskVar.b(j);
            isbVar.w.c(j, 1);
            return;
        }
        if (i == 1) {
            ((defpackage.isb) obj).o.b(this.a);
            return;
        }
        defpackage.isb isbVar2 = (defpackage.isb) obj;
        defpackage.isk iskVar2 = isbVar2.m;
        long j2 = this.a;
        iskVar2.b(j2);
        isbVar2.v.c(j2, 1);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer$CC.$default$andThen(this, consumer) : j$.util.function.Consumer$CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }
}

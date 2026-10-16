package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afad implements defpackage.aezs {
    public final /* synthetic */ java.util.function.Consumer a;

    public /* synthetic */ afad(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.aezs
    public final /* synthetic */ defpackage.aezs a(defpackage.aezs aezsVar) {
        return defpackage.adrs.W(this, aezsVar);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        defpackage.adrs.Y(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // defpackage.aezs
    public final /* synthetic */ void b(java.lang.Short sh) {
        defpackage.adrs.aa(this, sh);
    }

    @Override // defpackage.aezs
    public final void c(short s) {
        this.a.accept(java.lang.Short.valueOf(s));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        b((java.lang.Short) obj);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return defpackage.adrs.X(this, intConsumer);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aell implements java.util.function.IntConsumer {
    public final /* synthetic */ java.util.function.Consumer a;

    public /* synthetic */ aell(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a.accept(java.lang.Integer.valueOf(i));
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}

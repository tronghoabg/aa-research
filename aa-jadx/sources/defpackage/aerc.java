package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aerc implements java.util.function.LongConsumer {
    public final /* synthetic */ java.util.function.Consumer a;

    public /* synthetic */ aerc(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(java.lang.Long.valueOf(j));
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}

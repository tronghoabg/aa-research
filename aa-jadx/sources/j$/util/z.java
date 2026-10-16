package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements java.util.function.IntConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ z(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        byte b = this.a;
        java.util.function.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(java.lang.Integer.valueOf(i));
                break;
            default:
                ((j$.util.stream.z2) consumer).accept(i);
                break;
        }
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}

package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.IntConsumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IntConsumer$CC {
    public static java.util.function.IntConsumer $default$andThen(final java.util.function.IntConsumer intConsumer, final java.util.function.IntConsumer intConsumer2) {
        intConsumer2.getClass();
        return new java.util.function.IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer3) {
                return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer3);
            }
        };
    }
}

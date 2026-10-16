package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.LongConsumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LongConsumer$CC {
    public static java.util.function.LongConsumer $default$andThen(final java.util.function.LongConsumer longConsumer, final java.util.function.LongConsumer longConsumer2) {
        longConsumer2.getClass();
        return new java.util.function.LongConsumer() { // from class: j$.util.function.g
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer3) {
                return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer3);
            }
        };
    }
}

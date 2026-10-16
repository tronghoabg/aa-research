package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class q4 extends j$.util.stream.o4 implements java.util.function.IntConsumer, j$.util.Spliterator.OfInt {
    public int b;
    public j$.util.stream.n3 c;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            this.b = i;
            this.a = i2 + 1;
        } else {
            if (i2 <= 0) {
                throw new java.lang.IllegalStateException();
            }
            if (this.c == null) {
                j$.util.stream.n3 n3Var = new j$.util.stream.n3();
                this.c = n3Var;
                n3Var.accept(this.b);
                this.a++;
            }
            this.c.accept(i);
        }
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a == -2) {
            intConsumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a != -2) {
            return false;
        }
        intConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.stream.o4, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return null;
    }

    @Override // j$.util.stream.o4, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Spliterator.OfInt.CC.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Spliterator.OfInt.CC.b(this, consumer);
    }
}

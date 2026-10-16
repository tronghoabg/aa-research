package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class n3 extends j$.util.stream.r3 implements java.util.function.IntConsumer {
    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public j$.util.Spliterator.OfInt spliterator() {
        return new j$.util.stream.m3(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        z();
        int[] iArr = (int[]) this.d;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            e((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.stream.v4.a) {
                j$.util.stream.v4.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.Spliterator.OfInt.CC.a((j$.util.stream.m3) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.util.o0(spliterator());
    }

    @Override // j$.util.stream.r3
    public final java.lang.Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.r3
    public final void t(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        int[] iArr = (int[]) obj;
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    public final java.lang.String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.b), java.util.Arrays.toString(iArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.b), java.util.Arrays.toString(java.util.Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.r3
    public final int v(java.lang.Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.r3
    public final java.lang.Object[] y() {
        return new int[8][];
    }
}

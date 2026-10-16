package j$.util.stream;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2927a2 extends AbstractC2932b2 {
    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f38155b);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38155b += ((AbstractC2932b2) v1).f38155b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38155b++;
    }
}

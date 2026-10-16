package j$.util.stream;

/* loaded from: classes2.dex */
abstract class M0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    protected final K0 f38034a;

    /* renamed from: b, reason: collision with root package name */
    protected final K0 f38035b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38036c;

    @Override // j$.util.stream.K0
    public final int q() {
        return 2;
    }

    M0(K0 k02, K0 k03) {
        this.f38034a = k02;
        this.f38035b = k03;
        this.f38036c = k02.count() + k03.count();
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i5) {
        if (i5 == 0) {
            return this.f38034a;
        }
        if (i5 == 1) {
            return this.f38035b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38036c;
    }

    @Override // j$.util.stream.K0
    public /* bridge */ /* synthetic */ J0 b(int i5) {
        return (J0) b(i5);
    }
}

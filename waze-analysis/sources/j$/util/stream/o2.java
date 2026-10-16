package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class o2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f50552a;

    /* renamed from: b, reason: collision with root package name */
    public final m2 f50553b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50554c;

    public o2(m2 m2Var, m2 m2Var2) {
        this.f50552a = m2Var;
        this.f50553b = m2Var2;
        this.f50554c = m2Var2.count() + m2Var.count();
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        if (i2 == 0) {
            return this.f50552a;
        }
        if (i2 == 1) {
            return this.f50553b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50554c;
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 2;
    }

    @Override // j$.util.stream.m2
    public /* bridge */ /* synthetic */ l2 a(int i2) {
        return (l2) a(i2);
    }
}

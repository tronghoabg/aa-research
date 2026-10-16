package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class k1 extends l1 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f50486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(a aVar, int i2, int i3) {
        super(aVar, i2);
        this.f50486l = i3;
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        switch (this.f50486l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final IntStream parallel() {
        switch (this.f50486l) {
            case 0:
                this.f50311a.f50321k = true;
                break;
            default:
                this.f50311a.f50321k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final IntStream sequential() {
        switch (this.f50486l) {
            case 0:
                this.f50311a.f50321k = false;
                break;
            default:
                this.f50311a.f50321k = false;
                break;
        }
        return this;
    }
}

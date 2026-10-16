package E5;

/* renamed from: E5.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0473x implements u6.g, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3561c;

    public /* synthetic */ C0473x(int i5, int i10, int i11) {
        this.f3559a = i11;
        this.f3560b = i5;
        this.f3561c = i10;
    }

    @Override // u6.g
    public final void invoke(Object obj) {
        switch (this.f3559a) {
            case 0:
                ((u0) obj).g(this.f3560b, this.f3561c);
                break;
            default:
                ((N1.H) obj).g(this.f3560b, this.f3561c);
                break;
        }
    }
}

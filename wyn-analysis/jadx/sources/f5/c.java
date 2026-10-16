package F5;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements u6.g, L8.e, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3885b;

    public /* synthetic */ c(Object obj) {
        this.f3884a = 1;
        this.f3885b = obj;
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f3884a) {
            case 0:
                ((j) obj).getClass();
                break;
            default:
                ((V1.i) obj).getClass();
                break;
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return this.f3885b;
    }

    public /* synthetic */ c(Object obj, Object obj2, long j8, int i5) {
        this.f3884a = i5;
        this.f3885b = obj2;
    }
}

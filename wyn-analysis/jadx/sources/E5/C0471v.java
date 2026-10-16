package E5;

/* renamed from: E5.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0471v implements u6.g, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3546b;

    public /* synthetic */ C0471v(int i5, int i10) {
        this.f3545a = i10;
        this.f3546b = i5;
    }

    @Override // u6.g
    public final void invoke(Object obj) {
        switch (this.f3545a) {
            case 0:
                ((u0) obj).k(this.f3546b);
                break;
            case 1:
                F5.j jVar = (F5.j) obj;
                jVar.getClass();
                int i5 = this.f3546b;
                if (i5 == 1) {
                    jVar.f3935u = true;
                }
                jVar.k = i5;
                break;
            case 2:
                ((N1.H) obj).k(this.f3546b);
                break;
            default:
                V1.i iVar = (V1.i) obj;
                iVar.getClass();
                int i10 = this.f3546b;
                if (i10 == 1) {
                    iVar.f12944u = true;
                }
                iVar.k = i10;
                break;
        }
    }

    public /* synthetic */ C0471v(int i5, int i10, Object obj, Object obj2, Object obj3) {
        this.f3545a = i10;
        this.f3546b = i5;
    }
}

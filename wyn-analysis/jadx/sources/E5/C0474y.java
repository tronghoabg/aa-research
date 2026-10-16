package E5;

/* renamed from: E5.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0474y implements u6.g, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3563b;

    public /* synthetic */ C0474y(boolean z2, int i5) {
        this.f3562a = i5;
        this.f3563b = z2;
    }

    @Override // u6.g
    public final void invoke(Object obj) {
        switch (this.f3562a) {
            case 0:
                ((u0) obj).c(this.f3563b);
                break;
            case 1:
                ((u0) obj).e(this.f3563b);
                break;
            case 2:
                ((N1.H) obj).e(this.f3563b);
                break;
            case 3:
                ((N1.H) obj).c(this.f3563b);
                break;
            default:
                ((N1.H) obj).e(this.f3563b);
                break;
        }
    }
}

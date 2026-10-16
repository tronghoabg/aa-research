package E5;

import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements u6.g, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3012b;

    public /* synthetic */ C(int i5, List list) {
        this.f3011a = i5;
        this.f3012b = list;
    }

    @Override // u6.g
    public final void invoke(Object obj) {
        switch (this.f3011a) {
            case 0:
                ((u0) obj).f(this.f3012b);
                break;
            case 1:
                ((F5.j) obj).getClass();
                break;
            case 2:
                ((N1.H) obj).f(this.f3012b);
                break;
            default:
                ((V1.i) obj).getClass();
                break;
        }
    }

    public /* synthetic */ C(Object obj, List list, int i5) {
        this.f3011a = i5;
        this.f3012b = list;
    }
}

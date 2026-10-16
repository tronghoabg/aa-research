package N;

/* renamed from: N.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7821b;

    public /* synthetic */ C0738n(Object obj, int i5) {
        this.f7820a = i5;
        this.f7821b = obj;
    }

    public final void a() {
        switch (this.f7820a) {
            case 0:
                C0740o c0740o = (C0740o) this.f7821b;
                c0740o.f7869z--;
                break;
            default:
                X.t tVar = (X.t) this.f7821b;
                tVar.f15750j--;
                break;
        }
    }

    public final void b() {
        switch (this.f7820a) {
            case 0:
                ((C0740o) this.f7821b).f7869z++;
                break;
            default:
                ((X.t) this.f7821b).f15750j++;
                break;
        }
    }
}

package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final F f18575a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18576b;

    /* renamed from: c, reason: collision with root package name */
    public int f18577c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f18578d;

    public C(D d3, F f10) {
        this.f18578d = d3;
        this.f18575a = f10;
    }

    public final void a(boolean z2) {
        if (z2 == this.f18576b) {
            return;
        }
        this.f18576b = z2;
        int i5 = z2 ? 1 : -1;
        D d3 = this.f18578d;
        int i10 = d3.f18581c;
        d3.f18581c = i5 + i10;
        if (!d3.f18582d) {
            d3.f18582d = true;
            while (true) {
                try {
                    int i11 = d3.f18581c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        d3.f();
                    } else if (z11) {
                        d3.g();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    d3.f18582d = false;
                    throw th;
                }
            }
            d3.f18582d = false;
        }
        if (this.f18576b) {
            d3.c(this);
        }
    }

    public void b() {
    }

    public boolean c(InterfaceC1457v interfaceC1457v) {
        return false;
    }

    public abstract boolean d();
}

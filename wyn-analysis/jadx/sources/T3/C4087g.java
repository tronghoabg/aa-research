package t3;

import android.view.View;

/* renamed from: t3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4087g extends AbstractC4097q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45678a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45679b;

    public /* synthetic */ C4087g() {
        this.f45678a = 2;
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        switch (this.f45678a) {
            case 0:
                y yVar = AbstractC4104x.f45735a;
                yVar.J((View) this.f45679b, 1.0f);
                yVar.getClass();
                abstractC4096p.w(this);
                break;
            case 1:
                ((AbstractC4096p) this.f45679b).z();
                abstractC4096p.w(this);
                break;
            default:
                C4101u c4101u = (C4101u) this.f45679b;
                int i5 = c4101u.f45728z - 1;
                c4101u.f45728z = i5;
                if (i5 == 0) {
                    c4101u.f45724A = false;
                    c4101u.n();
                }
                abstractC4096p.w(this);
                break;
        }
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public void e(AbstractC4096p abstractC4096p) {
        switch (this.f45678a) {
            case 2:
                C4101u c4101u = (C4101u) this.f45679b;
                if (!c4101u.f45724A) {
                    c4101u.H();
                    c4101u.f45724A = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C4087g(Object obj, int i5) {
        this.f45678a = i5;
        this.f45679b = obj;
    }
}

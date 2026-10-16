package G9;

import A6.h;
import D9.k;
import android.app.Application;
import android.view.LayoutInflater;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class f implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4688a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4689b;

    public /* synthetic */ f(int i5, e eVar) {
        this.f4688a = i5;
        this.f4689b = eVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f4688a) {
            case 0:
                k kVar = (k) this.f4689b.f4686c;
                h.j(kVar);
                return kVar;
            case 1:
                N9.h hVar = (N9.h) this.f4689b.f4685b;
                h.j(hVar);
                return hVar;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) ((Application) this.f4689b.f4687d).getSystemService("layout_inflater");
                h.j(layoutInflater);
                return layoutInflater;
        }
    }
}

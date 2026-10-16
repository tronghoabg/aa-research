package eb;

import uc.C4271h;
import uc.C4273j;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4270g {

    /* renamed from: a, reason: collision with root package name */
    public C4271h f34629a;

    public d(InterfaceC4269f interfaceC4269f, String str) {
        new C4273j(interfaceC4269f, str).a(new Wa.d(this, 1));
    }

    @Override // uc.InterfaceC4270g
    public final void a(Object obj) {
        C4271h c4271h = this.f34629a;
        if (c4271h != null) {
            c4271h.a(obj);
        }
    }

    public final void b() {
        C4271h c4271h = this.f34629a;
        if (c4271h != null) {
            c4271h.b();
        }
    }
}

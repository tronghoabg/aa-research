package Ja;

import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes4.dex */
public class a implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f5996a;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "google_mlkit_commons");
        this.f5996a = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f5996a.b(null);
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        ((g) interfaceC4280q).c();
    }
}

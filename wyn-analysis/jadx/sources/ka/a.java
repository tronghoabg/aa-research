package Ka;

import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4281r;

/* loaded from: classes4.dex */
public class a implements InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f6710a;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "google_mlkit_text_recognizer");
        this.f6710a = c4281r;
        c4281r.b(new c(c3884a.f44186a));
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f6710a.b(null);
    }
}

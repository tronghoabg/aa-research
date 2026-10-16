package eb;

import android.content.Context;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4281r;
import uc.InterfaceC4269f;

/* loaded from: classes4.dex */
public class f implements InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f34632a;

    /* renamed from: b, reason: collision with root package name */
    public Dd.c f34633b;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        Context context = c3884a.f44186a;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        this.f34633b = new Dd.c(interfaceC4269f, context);
        C4281r c4281r = new C4281r(interfaceC4269f, "com.ryanheise.just_audio.methods");
        this.f34632a = c4281r;
        c4281r.b(this.f34633b);
        c3884a.f44187b.f40269t.add(new e(this, 0));
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f34633b.B();
        this.f34633b = null;
        this.f34632a.b(null);
    }
}

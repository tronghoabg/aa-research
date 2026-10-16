package Ge;

import ce.InterfaceC1606a;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.flutter.sdk.qonversion_flutter_sdk.NoCodesPlugin;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.Map;

/* loaded from: classes5.dex */
public final class f implements InterfaceC1606a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NoCodesPlugin f4745a;

    public f(NoCodesPlugin noCodesPlugin) {
        this.f4745a = noCodesPlugin;
    }

    @Override // ce.InterfaceC1606a
    public final void a(String str) {
        Map mapE = AbstractC2641B.E(new C2527k(ScreenActivity.INTENT_SCREEN_ID, str));
        this.f4745a.onNoCodesEvent(d.f4738a, mapE);
    }

    @Override // ce.InterfaceC1606a
    public final void b(ae.f fVar) {
        this.f4745a.onNoCodesEvent(d.f4742e, c.c(fVar));
    }

    @Override // ce.InterfaceC1606a
    public final void c() {
        this.f4745a.onNoCodesEvent(d.f4739b, null);
    }

    @Override // ce.InterfaceC1606a
    public final void d(G9.e eVar) {
        this.f4745a.onNoCodesEvent(d.f4743f, c.b(eVar));
    }

    @Override // ce.InterfaceC1606a
    public final void e(ae.f fVar) {
        this.f4745a.onNoCodesEvent(d.f4741d, c.c(fVar));
    }

    @Override // ce.InterfaceC1606a
    public final void f(ae.f fVar) {
        this.f4745a.onNoCodesEvent(d.f4740c, c.c(fVar));
    }
}

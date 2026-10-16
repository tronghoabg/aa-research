package Va;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class Rb extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13666c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Activity f13667d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Bundle f13668e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Tb f13669f;

    public /* synthetic */ Rb(int i5) {
        this.f13666c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13666c) {
            case 0:
                Tb tb = this.f13669f;
                if (Tb.S(tb, this.f13667d)) {
                    InterfaceC0948db interfaceC0948dbO = Tb.O(tb);
                    Bundle bundle = this.f13668e;
                    interfaceC0948dbO.getClass();
                    Tb.f13727s = (Tb.f13728t + 45) % 128;
                    Tb.H(tb, false);
                    if (bundle == null) {
                        Tb.K(tb, false);
                        break;
                    } else {
                        Tb.f13727s = (Tb.f13728t + 97) % 128;
                        Tb.K(tb, bundle.getBoolean(Tb.f13726r));
                        if (Tb.N(tb)) {
                            Tb.H(tb, true);
                        }
                        Tb.P(tb, true);
                        break;
                    }
                }
                break;
            default:
                Tb tb2 = this.f13669f;
                if (Tb.S(tb2, this.f13667d)) {
                    InterfaceC0948db interfaceC0948dbO2 = Tb.O(tb2);
                    Bundle bundle2 = this.f13668e;
                    interfaceC0948dbO2.getClass();
                    if (bundle2 != null) {
                        Tb.f13727s = (Tb.f13728t + 97) % 128;
                        bundle2.putBoolean(Tb.f13726r, Tb.N(tb2));
                    }
                    int i5 = Tb.f13727s + 31;
                    Tb.f13728t = i5 % 128;
                    int i10 = i5 % 2;
                    tb2.f13732o = true;
                    if (i10 == 0) {
                        int i11 = 97 / 0;
                        break;
                    }
                }
                break;
        }
    }
}

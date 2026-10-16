package Va;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;

/* loaded from: classes4.dex */
public final class Hb implements ISAdQualityInitListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Ga f13421a;

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
        Kb.x((Kb) this.f13421a.f13389h, iSAdQualityInitError, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitSuccess() {
        Kb kb2 = (Kb) this.f13421a.f13389h;
        Kb.f13489w = (Kb.f13490x + 87) % 128;
        kb2.getClass();
        C1169v c1169v = new C1169v(24);
        c1169v.f14690d = kb2;
        Cb.g(c1169v);
        int i5 = Kb.f13490x + 111;
        Kb.f13489w = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 16 / 0;
        }
    }
}

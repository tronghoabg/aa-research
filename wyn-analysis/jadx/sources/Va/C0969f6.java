package Va;

import com.smaato.sdk.core.ad.AdInteractor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.ArrayList;

/* renamed from: Va.f6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0969f6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdInteractor adInteractor = (AdInteractor) arrayList.get(0);
        StateMachine.Listener listener = (StateMachine.Listener) arrayList.get(1);
        C0995h6.f14246U = (C0995h6.f14245T + 111) % 128;
        C0995h6.W0(adInteractor, listener);
        int i5 = C0995h6.f14245T + 71;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }
}

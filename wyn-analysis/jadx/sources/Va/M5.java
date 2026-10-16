package Va;

import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdEventListenerNotifications;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class M5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardedAdEventListenerNotifications rewardedAdEventListenerNotifications = (RewardedAdEventListenerNotifications) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        C0995h6.f14246U = (C0995h6.f14245T + 65) % 128;
        C0995h6.X0(rewardedAdEventListenerNotifications, eventListener);
        int i5 = C0995h6.f14246U + 69;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}

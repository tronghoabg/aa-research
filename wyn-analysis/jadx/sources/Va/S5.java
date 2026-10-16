package Va;

import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class S5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        EventListenerNotificationsInterface eventListenerNotificationsInterface = (EventListenerNotificationsInterface) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        int i5 = C0995h6.f14245T + 11;
        C0995h6.f14246U = i5 % 128;
        int i10 = i5 % 2;
        C0995h6.c1(eventListenerNotificationsInterface, eventListener);
        if (i10 == 0) {
            int i11 = 91 / 0;
        }
        C0995h6.f14245T = (C0995h6.f14246U + 97) % 128;
        return null;
    }
}

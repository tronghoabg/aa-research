package Va;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) arrayList.get(0);
        K3.f13477T = (K3.f13478U + 103) % 128;
        InneractiveContentController.EventsListener eventsListenerQ0 = K3.Q0(inneractiveFullscreenVideoContentController);
        K3.f13477T = (K3.f13478U + 31) % 128;
        return eventsListenerQ0;
    }
}

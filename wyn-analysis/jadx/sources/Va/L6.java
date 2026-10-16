package Va;

import com.unity3d.ads.IUnityAdsListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class L6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        P6.f13595T = (P6.f13596U + 111) % 128;
        P6.E0(iUnityAdsListener);
        int i5 = P6.f13596U + 115;
        P6.f13595T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}

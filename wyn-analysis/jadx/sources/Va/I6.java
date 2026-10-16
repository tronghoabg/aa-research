package Va;

import com.unity3d.ads.IUnityAdsListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class I6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        int i5 = P6.f13595T + 81;
        P6.f13596U = i5 % 128;
        int i10 = i5 % 2;
        P6.K0(iUnityAdsListener);
        if (i10 != 0) {
            return null;
        }
        int i11 = 49 / 0;
        return null;
    }
}

package Va;

import com.unity3d.ads.IUnityAdsListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class J6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        int i5 = P6.f13596U + 103;
        P6.f13595T = i5 % 128;
        int i10 = i5 % 2;
        P6.J0(iUnityAdsListener);
        if (i10 != 0) {
            throw null;
        }
        int i11 = P6.f13596U + 27;
        P6.f13595T = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 9 / 0;
        }
        return null;
    }
}

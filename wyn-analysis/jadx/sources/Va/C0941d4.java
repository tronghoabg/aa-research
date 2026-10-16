package Va;

import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* renamed from: Va.d4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0941d4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MBridgeIds mBridgeIds = (MBridgeIds) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 5) % 128;
        String strX0 = C1223z4.X0(mBridgeIds);
        int i5 = C1223z4.f14834W + 41;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return strX0;
        }
        throw null;
    }
}

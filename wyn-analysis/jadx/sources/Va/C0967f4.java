package Va;

import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* renamed from: Va.f4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0967f4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MBridgeIds mBridgeIds = (MBridgeIds) arrayList.get(0);
        int i5 = C1223z4.f14834W + 7;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            C1223z4.Y0(mBridgeIds);
            throw null;
        }
        String strY0 = C1223z4.Y0(mBridgeIds);
        int i10 = C1223z4.f14835X + 71;
        C1223z4.f14834W = i10 % 128;
        if (i10 % 2 == 0) {
            return strY0;
        }
        throw null;
    }
}

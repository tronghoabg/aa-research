package Va;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.ArrayList;

/* renamed from: Va.s3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1134s3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionDataListener impressionDataListener = (ImpressionDataListener) arrayList.get(0);
        C1186w3.f14728T = (C1186w3.f14729U + 123) % 128;
        C1186w3.G0(impressionDataListener);
        C1186w3.f14729U = (C1186w3.f14728T + 9) % 128;
        return null;
    }
}

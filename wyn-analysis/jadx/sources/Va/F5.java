package Va;

import com.smaato.sdk.video.ad.VastParsingResult;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class F5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastParsingResult vastParsingResult = (VastParsingResult) arrayList.get(0);
        int i5 = C0995h6.f14245T + 41;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return C0995h6.M0(vastParsingResult);
        }
        C0995h6.M0(vastParsingResult);
        throw null;
    }
}

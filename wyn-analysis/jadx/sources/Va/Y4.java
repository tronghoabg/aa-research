package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;

/* loaded from: classes4.dex */
public final class Y4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MediaFile mediaFile = (MediaFile) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 55) % 128;
        String strT0 = C1098p5.T0(mediaFile);
        C1098p5.f14473U = (C1098p5.f14472T + 53) % 128;
        return strT0;
    }
}

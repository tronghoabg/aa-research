package Va;

import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class G5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        StaticResource staticResource = (StaticResource) arrayList.get(0);
        int i5 = C0995h6.f14246U + 107;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 == 0) {
            return C0995h6.o1(staticResource);
        }
        C0995h6.o1(staticResource);
        throw null;
    }
}

package Va;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class F3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveContentController inneractiveContentController = (InneractiveContentController) arrayList.get(0);
        VideoContentListener videoContentListener = (VideoContentListener) arrayList.get(1);
        int i5 = K3.f13477T + 97;
        K3.f13478U = i5 % 128;
        int i10 = i5 % 2;
        K3.R0(inneractiveContentController, videoContentListener);
        if (i10 != 0) {
            return null;
        }
        throw null;
    }
}

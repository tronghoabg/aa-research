package Va;

import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.ArrayList;

/* renamed from: Va.u5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1162u5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) arrayList.get(0);
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) arrayList.get(1);
        int i5 = C1175v5.f14697T + 47;
        C1175v5.f14698U = i5 % 128;
        int i10 = i5 % 2;
        C1175v5.E0(presageOptinVideo, presageOptinVideoCallback);
        if (i10 != 0) {
            return null;
        }
        int i11 = 86 / 0;
        return null;
    }
}

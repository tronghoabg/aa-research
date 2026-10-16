package Va;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class Ka extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f13484c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ C1206y f13485d;

    @Override // Va.Ba
    public final void c() {
        boolean z2;
        int iOptInt;
        r rVar = (r) this.f13485d.f14798d;
        int i5 = C1194x.f14742s + 79;
        C1194x.f14741r = i5 % 128;
        int i10 = i5 % 2;
        int i11 = this.f13484c;
        C1194x c1194x = rVar.f14548a;
        if (i10 != 0) {
            z2 = c1194x.z(i11);
            int i12 = 97 / 0;
        } else {
            z2 = c1194x.z(i11);
        }
        int i13 = C1194x.f14741r;
        int i14 = i13 + 43;
        C1194x.f14742s = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 31 / 0;
        }
        if (z2) {
            iOptInt = 0;
        } else {
            C1194x.f14742s = (i13 + 101) % 128;
            c1194x.getClass();
            C1194x.f14741r = (C1194x.f14742s + 39) % 128;
            if (c1194x.c() == null || G.S().P()) {
                iOptInt = 100;
            } else {
                C1194x.f14742s = (C1194x.f14741r + 81) % 128;
                D dC = c1194x.c();
                dC.getClass();
                int i16 = D.f13267i + 109;
                D.f13268j = i16 % 128;
                iOptInt = dC.e().optInt((i16 % 2 == 0 ? D.u((char) ((ViewConfiguration.getFadingEdgeLength() << 60) * 33683), "た㟦錯힃", "\uebfa啤귧", 792192560 >> (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1))) : D.u((char) (33683 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "た㟦錯힃", "\uebfa啤귧", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 792192560)).intern(), dC.f13269g);
                D.f13267i = (D.f13268j + 39) % 128;
                C1194x.f14741r = (C1194x.f14742s + 9) % 128;
            }
            int i17 = C1194x.f14742s + 47;
            C1194x.f14741r = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
        }
        C1194x.f14742s = (C1194x.f14741r + 21) % 128;
        c1194x.C(iOptInt);
        int i18 = C1194x.f14742s + 43;
        C1194x.f14741r = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 54 / 0;
        }
    }
}

package Va;

import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: Va.o5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1085o5 extends VideoAdListener implements H9 {

    /* renamed from: b, reason: collision with root package name */
    public static int f14452b;

    /* renamed from: a, reason: collision with root package name */
    public final VideoAdListener f14453a;

    public C1085o5(VideoAdListener videoAdListener) {
        this.f14453a = videoAdListener;
    }

    @Override // Va.H9
    public final Object d() {
        VideoAdListener videoAdListener;
        int i5 = f14452b + 31;
        int i10 = i5 % 128;
        if (i5 % 2 == 0) {
            videoAdListener = this.f14453a;
            int i11 = 43 / 0;
        } else {
            videoAdListener = this.f14453a;
        }
        f14452b = (i10 + 101) % 128;
        return videoAdListener;
    }
}

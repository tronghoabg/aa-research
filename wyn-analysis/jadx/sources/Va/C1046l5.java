package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: Va.l5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1046l5 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1098p5 f14351a;

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(0);
        int i5 = C1098p5.f14472T + 5;
        C1098p5.f14473U = i5 % 128;
        int i10 = i5 % 2;
        this.f14351a.getClass();
        if (i10 != 0) {
            C1085o5 c1085o5 = new C1085o5(videoAdListener);
            int i11 = C1098p5.f14473U + 57;
            C1098p5.f14472T = i11 % 128;
            if (i11 % 2 == 0) {
                return c1085o5;
            }
            throw null;
        }
        new C1085o5(videoAdListener);
        int i12 = C1098p5.f14473U + 57;
        C1098p5.f14472T = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        throw null;
    }
}

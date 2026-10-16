package Va;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final class P7 implements P9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P9 f13597a;

    public P7(P9 p92) {
        this.f13597a = p92;
    }

    @Override // Va.P9
    public final void a(Q9 q92, MediaPlayer mediaPlayer) {
        Da da2 = new Da(15);
        da2.f13291f = this;
        da2.f13289d = q92;
        da2.f13290e = mediaPlayer;
        Cb.j(da2);
    }
}

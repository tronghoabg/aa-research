package Va;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final class O7 implements T9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T9 f13569a;

    public O7(T9 t92) {
        this.f13569a = t92;
    }

    @Override // Va.T9
    public final void a(U9 u92, MediaPlayer mediaPlayer) {
        Da da2 = new Da(12);
        da2.f13291f = this;
        da2.f13289d = u92;
        da2.f13290e = mediaPlayer;
        Cb.j(da2);
    }
}

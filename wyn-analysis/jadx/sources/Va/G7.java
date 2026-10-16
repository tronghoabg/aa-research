package Va;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final class G7 implements N9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N9 f13377a;

    public G7(N9 n92) {
        this.f13377a = n92;
    }

    @Override // Va.N9
    public final void a(O9 o92, MediaPlayer mediaPlayer) {
        Da da2 = new Da(13);
        da2.f13291f = this;
        da2.f13289d = o92;
        da2.f13290e = mediaPlayer;
        Cb.j(da2);
    }
}

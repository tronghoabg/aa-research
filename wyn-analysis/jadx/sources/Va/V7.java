package Va;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final class V7 implements L9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L9 f13787a;

    public V7(L9 l92) {
        this.f13787a = l92;
    }

    @Override // Va.L9
    public final boolean a(M9 m92, MediaPlayer mediaPlayer, int i5, int i10) {
        U7 u72 = new U7();
        u72.f13753g = this;
        u72.f13749c = m92;
        u72.f13750d = mediaPlayer;
        u72.f13751e = i5;
        u72.f13752f = i10;
        Cb.j(u72);
        return false;
    }
}

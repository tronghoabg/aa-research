package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.List;

/* loaded from: classes2.dex */
final class llz extends dl {
    final /* synthetic */ llu d;

    public llz(llu lluVar) {
        this.d = lluVar;
    }

    @Override // defpackage.dl
    public final void a(dn dnVar) {
        this.d.N((llu) spu.aT(dnVar, new llx(4)));
    }

    @Override // defpackage.dl
    public final void b(Bundle bundle) {
        this.d.t((Bundle) new ntn(bundle).i(Bundle.EMPTY));
    }

    @Override // defpackage.dl
    public final void c(MediaMetadataCompat mediaMetadataCompat) {
        this.d.u((lmd) spu.aT(mediaMetadataCompat, new llx(3)));
    }

    @Override // defpackage.dl
    public final void d(PlaybackStateCompat playbackStateCompat) {
        this.d.d((AaPlaybackState) spu.aT(playbackStateCompat, new llx(5)));
    }

    @Override // defpackage.dl
    public final void e(List list) {
        this.d.v(llu.g(list, new lka(5)));
    }

    @Override // defpackage.dl
    public final void f() {
        this.d.w();
    }
}

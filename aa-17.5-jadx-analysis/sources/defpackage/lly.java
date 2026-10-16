package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class lly extends dl {
    final /* synthetic */ lmb d;

    public lly(lmb lmbVar) {
        this.d = lmbVar;
    }

    @Override // defpackage.dl
    public final void a(dn dnVar) {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).a(dnVar);
        }
    }

    @Override // defpackage.dl
    public final void b(Bundle bundle) {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).b(bundle);
        }
    }

    @Override // defpackage.dl
    public final void c(MediaMetadataCompat mediaMetadataCompat) {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).c(mediaMetadataCompat);
        }
    }

    @Override // defpackage.dl
    public final void d(PlaybackStateCompat playbackStateCompat) {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).d(playbackStateCompat);
        }
    }

    @Override // defpackage.dl
    public final void e(List list) {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).e(list);
        }
    }

    @Override // defpackage.dl
    public final void f() {
        Iterator it = this.d.a.iterator();
        while (it.hasNext()) {
            ((dl) ((llu) it.next()).b).f();
        }
    }
}

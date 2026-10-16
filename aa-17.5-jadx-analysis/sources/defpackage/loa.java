package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
final class loa extends eqj {
    public final ComponentName a;
    private final lmb h;
    private final llu i = new lnz(this);

    public loa(lmb lmbVar, ComponentName componentName) {
        this.h = lmbVar;
        this.a = componentName;
    }

    @Override // defpackage.eqj
    protected final void c() {
        lmb lmbVar = this.h;
        AaPlaybackState aaPlaybackStateP = lmbVar.P();
        ype ypeVar = (ype) lod.a.l().ai(4096);
        String strFlattenToShortString = this.a.flattenToShortString();
        zjc zjcVar = zjc.a;
        ypeVar.R("PlaybackStateLiveData#onActive: componentName=%s state=%s (%s)", new zjd(zjcVar, strFlattenToShortString), new zjd(zjcVar, lkb.a(aaPlaybackStateP)), aaPlaybackStateP);
        m(aaPlaybackStateP);
        lmbVar.W(this.i);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.X(this.i);
    }
}

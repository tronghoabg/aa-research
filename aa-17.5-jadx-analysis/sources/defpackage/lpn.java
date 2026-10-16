package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
final class lpn extends eqj {
    public final lmb a;
    private final llu h = new lpm(this);

    public lpn(lmb lmbVar) {
        this.a = lmbVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        lmb lmbVar = this.a;
        AaPlaybackState aaPlaybackStateP = lmbVar.P();
        yph yphVar = lpq.a;
        lmbVar.R();
        m(aaPlaybackStateP);
        lmbVar.W(this.h);
    }

    @Override // defpackage.eqj
    protected final void d() {
        yph yphVar = lpq.a;
        lmb lmbVar = this.a;
        lmbVar.R();
        lmbVar.X(this.h);
    }
}

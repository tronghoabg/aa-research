package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class ttc extends ttg {
    static final Interpolator a = pig.a;
    private final ttd r;

    public ttc(std stdVar, usy usyVar) {
        super(stdVar);
        ttd ttdVar = new ttd(new tmo(), usyVar);
        this.r = ttdVar;
        Interpolator interpolator = a;
        tmo tmoVar = ttdVar.b;
        new wqk(interpolator, 1, null);
    }

    @Override // defpackage.ttg, defpackage.tti
    public final boolean d() {
        return true;
    }

    public final boolean l() {
        return super.p(1);
    }
}

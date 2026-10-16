package defpackage;

import android.location.Location;

/* loaded from: classes.dex */
public abstract class liy extends liz {
    Location a = null;
    private yyv d = yyv.UNKNOWN_ACTION;
    private final float e = (float) acok.b();

    protected liy() {
    }

    private final void l(Float f) {
        yyv yyvVarB = b(f);
        if (this.d != yyvVarB) {
            ebf.j().x(10, yyvVarB);
            this.d = yyvVarB;
        }
    }

    @Override // defpackage.liz
    public final float a() {
        return this.e;
    }

    protected abstract yyv b(Float f);

    final void c(Location location) {
        this.a = location;
        if (location == null) {
            l(null);
            return;
        }
        location.hasSpeed();
        Float fValueOf = location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null;
        l(fValueOf);
        g(fValueOf, location.getElapsedRealtimeNanos());
    }
}

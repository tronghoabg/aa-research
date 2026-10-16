package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ljf extends defpackage.ljg {
    android.location.Location a = null;
    private defpackage.zaa d = defpackage.zaa.UNKNOWN_ACTION;
    private final float e = (float) defpackage.acpm.b();

    protected ljf() {
    }

    private final void l(java.lang.Float f) {
        defpackage.zaa zaaVarB = b(f);
        if (this.d != zaaVarB) {
            defpackage.omf.u().x(10, zaaVarB);
            this.d = zaaVarB;
        }
    }

    @Override // defpackage.ljg
    public final float a() {
        return this.e;
    }

    protected abstract defpackage.zaa b(java.lang.Float f);

    final void c(android.location.Location location) {
        this.a = location;
        if (location == null) {
            l(null);
            return;
        }
        location.hasSpeed();
        java.lang.Float fValueOf = location.hasSpeed() ? java.lang.Float.valueOf(location.getSpeed()) : null;
        l(fValueOf);
        g(fValueOf, location.getElapsedRealtimeNanos());
    }
}

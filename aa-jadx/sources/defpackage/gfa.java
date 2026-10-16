package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gfa extends android.content.MutableContextWrapper {
    private final java.util.Map a;

    public gfa(android.content.Context context) {
        super(context);
        this.a = new java.util.HashMap();
    }

    public abstract defpackage.nbh A();

    public abstract defpackage.wtg B();

    public abstract defpackage.jto C();

    public abstract defpackage.usc D();

    public abstract defpackage.fwb E();

    public final defpackage.hew F(java.lang.Class cls) {
        defpackage.hew hewVarL = l(cls);
        if (hewVarL != null) {
            return hewVarL;
        }
        throw new java.lang.NullPointerException("Missing AppHostService ".concat(java.lang.String.valueOf(cls.getName())));
    }

    public abstract android.content.Context a();

    public abstract androidx.car.app.SessionInfo b();

    public abstract defpackage.gdx c();

    public abstract defpackage.geb d();

    public abstract defpackage.ged e();

    public abstract defpackage.geh f();

    public abstract defpackage.get g();

    public abstract defpackage.gey h();

    public abstract defpackage.ggr i();

    public abstract defpackage.glb j();

    public abstract defpackage.gnz k();

    public defpackage.hew l(java.lang.Class cls) {
        return (defpackage.hew) this.a.get(cls);
    }

    public abstract void m();

    public abstract void n();

    public abstract void o(android.content.res.Configuration configuration);

    public void p() {
        throw null;
    }

    public abstract boolean q();

    public abstract boolean r();

    public boolean s(java.lang.Class cls, defpackage.hew hewVar) {
        java.util.Map map = this.a;
        if (map.containsKey(cls)) {
            return false;
        }
        map.put(cls, hewVar);
        return true;
    }

    public abstract defpackage.glw t();

    public abstract defpackage.kdj u();

    public abstract defpackage.jyp v();

    public abstract defpackage.jwq w();

    public abstract defpackage.jsk x();

    public abstract defpackage.gkc y();

    public abstract defpackage.jrw z();

    public void G(java.io.PrintWriter printWriter) {
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class jmc {
    public final String a;
    public int b;
    public jlr c;
    public jmh d;
    public final jmk e;
    final /* synthetic */ jme f;
    private final aezr g;
    private final tel h;

    public jmc(jme jmeVar, String str, int i) {
        this.f = jmeVar;
        this.a = str;
        aezy aezyVar = new aezy(new bws(this, jmeVar, 14));
        this.g = aezyVar;
        this.b = i;
        this.h = (tel) aezyVar.a();
        this.e = new jmk(new bws(this, jmeVar, 10), jmb.a);
    }

    public final jmd a() {
        return (jmd) this.h.b();
    }

    public final void b(jlr jlrVar) {
        if (a() == jmd.b) {
            if (this.c != null) {
                throw new IllegalStateException("Cannot overwrite nonnull appearedCallback.");
            }
            this.c = jlrVar;
            c(jmd.c);
            return;
        }
        throw new IllegalStateException("Cannot call sendDeviceAppeared unless in state ABSENT, but state is " + a() + ".");
    }

    public final void c(jmd jmdVar) {
        this.h.c(jmdVar);
    }
}

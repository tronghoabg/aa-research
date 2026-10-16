package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ag extends al implements h.l.n {
    public ag() {
    }

    @Override // h.g.b.j
    protected h.l.b computeReflected() {
        int i2 = ar.f48106a;
        return this;
    }

    @Override // h.l.n
    public Object getDelegate() {
        return ((h.l.n) getReflected()).getDelegate();
    }

    @Override // h.l.n
    public h.l.m getGetter() {
        return ((h.l.n) getReflected()).getGetter();
    }

    @Override // h.g.a.a
    public Object invoke() {
        return get();
    }

    public ag(Object obj) {
        super(obj);
    }

    public ag(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}

package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ac extends ae implements h.l.k {
    public ac() {
    }

    @Override // h.g.b.j
    protected h.l.b computeReflected() {
        int i2 = ar.f48106a;
        return this;
    }

    @Override // h.l.p
    public Object getDelegate(Object obj) {
        return ((h.l.k) getReflected()).getDelegate(obj);
    }

    @Override // h.l.p
    public h.l.o getGetter() {
        return ((h.l.k) getReflected()).getGetter();
    }

    @Override // h.l.k
    public h.l.j getSetter() {
        return ((h.l.k) getReflected()).getSetter();
    }

    @Override // h.g.a.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public ac(Object obj) {
        super(obj);
    }

    public ac(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}

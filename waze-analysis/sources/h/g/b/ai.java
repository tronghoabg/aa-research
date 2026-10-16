package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ai extends al implements h.l.p {
    public ai() {
    }

    @Override // h.g.b.j
    protected h.l.b computeReflected() {
        int i2 = ar.f48106a;
        return this;
    }

    @Override // h.l.p
    public Object getDelegate(Object obj) {
        return ((h.l.p) getReflected()).getDelegate(obj);
    }

    @Override // h.l.p
    public h.l.o getGetter() {
        return ((h.l.p) getReflected()).getGetter();
    }

    @Override // h.g.a.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public ai(Object obj) {
        super(obj);
    }

    public ai(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}

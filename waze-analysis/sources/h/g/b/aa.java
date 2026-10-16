package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class aa extends ae implements h.l.i {
    public aa() {
    }

    @Override // h.g.b.j
    protected h.l.b computeReflected() {
        int i2 = ar.f48106a;
        return this;
    }

    @Override // h.l.n
    public Object getDelegate() {
        return ((h.l.i) getReflected()).getDelegate();
    }

    @Override // h.l.n
    public h.l.m getGetter() {
        return ((h.l.i) getReflected()).getGetter();
    }

    @Override // h.l.i
    public h.l.h getSetter() {
        return ((h.l.i) getReflected()).getSetter();
    }

    @Override // h.g.a.a
    public Object invoke() {
        return get();
    }

    public aa(Object obj) {
        super(obj);
    }

    public aa(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}

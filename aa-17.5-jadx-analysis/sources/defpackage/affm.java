package defpackage;

/* loaded from: classes.dex */
public abstract class affm extends affp implements afhx {
    public affm() {
    }

    @Override // defpackage.afeq
    protected afhd computeReflected() {
        return affw.a.property1(this);
    }

    @Override // defpackage.afhx
    public Object getDelegate(Object obj) {
        return ((afhx) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.afia
    public afhw getGetter() {
        return ((afhx) getReflected()).getGetter();
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return get(obj);
    }

    public affm(Object obj) {
        super(obj);
    }

    public affm(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}

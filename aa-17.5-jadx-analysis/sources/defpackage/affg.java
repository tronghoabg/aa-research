package defpackage;

/* loaded from: classes.dex */
public abstract class affg extends affj implements afhm {
    public affg() {
    }

    @Override // defpackage.afeq
    protected afhd computeReflected() {
        return affw.a.mutableProperty1(this);
    }

    @Override // defpackage.afhx
    public Object getDelegate(Object obj) {
        return ((afhm) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.afia
    public afhw getGetter() {
        return ((afhm) getReflected()).getGetter();
    }

    @Override // defpackage.afhp
    public afhl getSetter() {
        return ((afhm) getReflected()).getSetter();
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return get(obj);
    }

    public affg(Object obj) {
        super(obj);
    }

    public affg(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}

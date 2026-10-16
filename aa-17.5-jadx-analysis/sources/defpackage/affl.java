package defpackage;

/* loaded from: classes.dex */
public class affl extends affp implements afhv {
    public affl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // defpackage.afeq
    protected final afhd computeReflected() {
        return affw.a.property0(this);
    }

    @Override // defpackage.afhv
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // defpackage.afhv
    public final Object getDelegate() {
        return ((afhv) getReflected()).getDelegate();
    }

    @Override // defpackage.afia
    public final afhu getGetter() {
        return ((afhv) getReflected()).getGetter();
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.afia
    public final /* bridge */ /* synthetic */ afht getGetter() {
        throw null;
    }
}

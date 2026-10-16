package defpackage;

/* loaded from: classes.dex */
public final class affo extends affp implements afhz {
    public affo(Class cls, String str, String str2) {
        super(NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.afeq
    protected final afhd computeReflected() {
        return affw.a.property2(this);
    }

    @Override // defpackage.afia
    public final afhy getGetter() {
        return ((afhz) getReflected()).getGetter();
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // defpackage.afia
    public final /* bridge */ /* synthetic */ afht getGetter() {
        throw null;
    }
}

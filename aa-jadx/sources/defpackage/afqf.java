package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqf extends defpackage.afqi {
    private final java.lang.reflect.Method method;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqf(java.lang.reflect.Method method) {
        super(null);
        method.getClass();
        this.method = method;
    }

    @Override // defpackage.afqi
    public java.lang.String asString() {
        return defpackage.afwj.getJvmSignature(this.method);
    }

    public final java.lang.reflect.Method getMethod() {
        return this.method;
    }
}

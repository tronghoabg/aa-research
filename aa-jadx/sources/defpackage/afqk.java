package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqk extends defpackage.afqn {
    private final java.lang.reflect.Method getterMethod;
    private final java.lang.reflect.Method setterMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqk(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        super(null);
        method.getClass();
        this.getterMethod = method;
        this.setterMethod = method2;
    }

    @Override // defpackage.afqn
    public java.lang.String asString() {
        return defpackage.afwj.getJvmSignature(this.getterMethod);
    }

    public final java.lang.reflect.Method getGetterMethod() {
        return this.getterMethod;
    }

    public final java.lang.reflect.Method getSetterMethod() {
        return this.setterMethod;
    }
}

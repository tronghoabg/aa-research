package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afpk extends afpn {
    private final Method getterMethod;
    private final Method setterMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpk(Method method, Method method2) {
        super(null);
        method.getClass();
        this.getterMethod = method;
        this.setterMethod = method2;
    }

    @Override // defpackage.afpn
    public String asString() {
        return afvj.getJvmSignature(this.getterMethod);
    }

    public final Method getGetterMethod() {
        return this.getterMethod;
    }

    public final Method getSetterMethod() {
        return this.setterMethod;
    }
}

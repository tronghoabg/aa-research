package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afpf extends afpi {
    private final Method method;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpf(Method method) {
        super(null);
        method.getClass();
        this.method = method;
    }

    @Override // defpackage.afpi
    public String asString() {
        return afvj.getJvmSignature(this.method);
    }

    public final Method getMethod() {
        return this.method;
    }
}

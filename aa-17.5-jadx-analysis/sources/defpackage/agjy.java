package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class agjy {
    private final Method getName;
    private final Method getParameters;

    public agjy(Method method, Method method2) {
        this.getParameters = method;
        this.getName = method2;
    }

    public final Method getGetName() {
        return this.getName;
    }

    public final Method getGetParameters() {
        return this.getParameters;
    }
}

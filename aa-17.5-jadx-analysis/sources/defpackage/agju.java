package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class agju {
    private final Method getAccessor;
    private final Method getType;

    public agju(Method method, Method method2) {
        this.getType = method;
        this.getAccessor = method2;
    }

    public final Method getGetAccessor() {
        return this.getAccessor;
    }

    public final Method getGetType() {
        return this.getType;
    }
}

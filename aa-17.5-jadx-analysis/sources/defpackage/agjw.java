package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class agjw {
    private final Method getPermittedSubclasses;
    private final Method getRecordComponents;
    private final Method isRecord;
    private final Method isSealed;

    public agjw(Method method, Method method2, Method method3, Method method4) {
        this.isSealed = method;
        this.getPermittedSubclasses = method2;
        this.isRecord = method3;
        this.getRecordComponents = method4;
    }

    public final Method getGetPermittedSubclasses() {
        return this.getPermittedSubclasses;
    }

    public final Method getGetRecordComponents() {
        return this.getRecordComponents;
    }

    public final Method isRecord() {
        return this.isRecord;
    }

    public final Method isSealed() {
        return this.isSealed;
    }
}

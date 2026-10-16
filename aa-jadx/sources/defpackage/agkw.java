package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agkw {
    private final java.lang.reflect.Method getPermittedSubclasses;
    private final java.lang.reflect.Method getRecordComponents;
    private final java.lang.reflect.Method isRecord;
    private final java.lang.reflect.Method isSealed;

    public agkw(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4) {
        this.isSealed = method;
        this.getPermittedSubclasses = method2;
        this.isRecord = method3;
        this.getRecordComponents = method4;
    }

    public final java.lang.reflect.Method getGetPermittedSubclasses() {
        return this.getPermittedSubclasses;
    }

    public final java.lang.reflect.Method getGetRecordComponents() {
        return this.getRecordComponents;
    }

    public final java.lang.reflect.Method isRecord() {
        return this.isRecord;
    }

    public final java.lang.reflect.Method isSealed() {
        return this.isSealed;
    }
}

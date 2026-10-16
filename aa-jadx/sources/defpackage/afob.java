package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afob {
    private final java.util.List<java.lang.Class<?>> parameters;
    private final java.lang.Class<?> returnType;

    /* JADX WARN: Multi-variable type inference failed */
    public afob(java.util.List<? extends java.lang.Class<?>> list, java.lang.Class<?> cls) {
        list.getClass();
        this.parameters = list;
        this.returnType = cls;
    }

    public final java.util.List<java.lang.Class<?>> getParameters() {
        return this.parameters;
    }

    public final java.lang.Class<?> getReturnType() {
        return this.returnType;
    }
}

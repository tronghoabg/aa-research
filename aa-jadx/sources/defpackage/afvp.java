package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class afvp<T> extends defpackage.afvr<T> implements defpackage.afer<T> {
    private final defpackage.afer<T> initializer;
    private volatile java.lang.ref.SoftReference<java.lang.Object> value;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
    }

    public afvp(T t, defpackage.afer<T> aferVar) {
        if (aferVar == null) {
            $$$reportNull$$$0(0);
        }
        this.value = null;
        this.initializer = aferVar;
        if (t != null) {
            this.value = new java.lang.ref.SoftReference<>(escape(t));
        }
    }

    @Override // defpackage.afvr, defpackage.afer
    public T invoke() {
        java.lang.Object obj;
        java.lang.ref.SoftReference<java.lang.Object> softReference = this.value;
        if (softReference != null && (obj = softReference.get()) != null) {
            return unescape(obj);
        }
        T tInvoke = this.initializer.invoke();
        this.value = new java.lang.ref.SoftReference<>(escape(tInvoke));
        return tInvoke;
    }
}

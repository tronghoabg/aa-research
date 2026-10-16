package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afke<V> extends java.lang.ClassValue<java.lang.ref.SoftReference<V>> {
    public final defpackage.affc<java.lang.Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public afke(defpackage.affc<? super java.lang.Class<?>, ? extends V> affcVar) {
        affcVar.getClass();
        this.compute = affcVar;
    }

    @Override // java.lang.ClassValue
    protected java.lang.ref.SoftReference<V> computeValue(java.lang.Class<?> cls) {
        cls.getClass();
        return new java.lang.ref.SoftReference<>(this.compute.invoke(cls));
    }

    public final defpackage.afke<V> createNewCopy() {
        return new defpackage.afke<>(this.compute);
    }

    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ java.lang.Object computeValue(java.lang.Class cls) {
        return computeValue((java.lang.Class<?>) cls);
    }
}

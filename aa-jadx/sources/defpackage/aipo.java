package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aipo<K, V> {
    private final j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> idPerType = new j$.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.atomic.AtomicInteger idCounter = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getId$lambda$0(defpackage.aipo aipoVar, java.lang.String str) {
        str.getClass();
        return aipoVar.idCounter.getAndIncrement();
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> allValuesThreadUnsafeForRendering() {
        return this.idPerType;
    }

    public abstract int customComputeIfAbsent(j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap, java.lang.String str, defpackage.affc<? super java.lang.String, java.lang.Integer> affcVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> defpackage.aioy<K, V, T> generateNullableAccessor(defpackage.afie<KK> afieVar) {
        afieVar.getClass();
        return new defpackage.aioy<>(getId(afieVar));
    }

    public final int getId(java.lang.String str) {
        str.getClass();
        return customComputeIfAbsent(this.idPerType, str, new defpackage.aipn(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.util.Collection<java.lang.Integer> getIndices() {
        java.util.Collection<java.lang.Integer> collectionValues = this.idPerType.values();
        collectionValues.getClass();
        return collectionValues;
    }

    public final <T extends K> int getId(defpackage.afie<T> afieVar) {
        afieVar.getClass();
        java.lang.String qualifiedName = afieVar.getQualifiedName();
        qualifiedName.getClass();
        return getId(qualifiedName);
    }
}

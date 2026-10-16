package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class aioo<K, V> {
    private final ConcurrentHashMap<String, Integer> idPerType = new ConcurrentHashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getId$lambda$0(aioo aiooVar, String str) {
        str.getClass();
        return aiooVar.idCounter.getAndIncrement();
    }

    public final Map<String, Integer> allValuesThreadUnsafeForRendering() {
        return this.idPerType;
    }

    public abstract int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, afec<? super String, Integer> afecVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> ainy<K, V, T> generateNullableAccessor(afhe<KK> afheVar) {
        afheVar.getClass();
        return new ainy<>(getId(afheVar));
    }

    public final int getId(String str) {
        str.getClass();
        return customComputeIfAbsent(this.idPerType, str, new aion(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<Integer> getIndices() {
        Collection<Integer> collectionValues = this.idPerType.values();
        collectionValues.getClass();
        return collectionValues;
    }

    public final <T extends K> int getId(afhe<T> afheVar) {
        afheVar.getClass();
        String qualifiedName = afheVar.getQualifiedName();
        qualifiedName.getClass();
        return getId(qualifiedName);
    }
}

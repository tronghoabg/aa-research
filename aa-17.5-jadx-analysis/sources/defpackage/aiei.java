package defpackage;

/* loaded from: classes3.dex */
public interface aiei {
    <T> T compute(afdr<? extends T> afdrVar);

    <K, V> aidd<K, V> createCacheWithNotNullValues();

    <K, V> aide<K, V> createCacheWithNullableValues();

    <T> aiec<T> createLazyValue(afdr<? extends T> afdrVar);

    <T> aiec<T> createLazyValueWithPostCompute(afdr<? extends T> afdrVar, afec<? super Boolean, ? extends T> afecVar, afec<? super T, afak> afecVar2);

    <K, V> aiea<K, V> createMemoizedFunction(afec<? super K, ? extends V> afecVar);

    <K, V> aieb<K, V> createMemoizedFunctionWithNullableValues(afec<? super K, ? extends V> afecVar);

    <T> aied<T> createNullableLazyValue(afdr<? extends T> afdrVar);

    <T> aiec<T> createRecursionTolerantLazyValue(afdr<? extends T> afdrVar, T t);
}

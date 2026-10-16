package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface aifi {
    <T> T compute(defpackage.afer<? extends T> aferVar);

    <K, V> defpackage.aied<K, V> createCacheWithNotNullValues();

    <K, V> defpackage.aiee<K, V> createCacheWithNullableValues();

    <T> defpackage.aifc<T> createLazyValue(defpackage.afer<? extends T> aferVar);

    <T> defpackage.aifc<T> createLazyValueWithPostCompute(defpackage.afer<? extends T> aferVar, defpackage.affc<? super java.lang.Boolean, ? extends T> affcVar, defpackage.affc<? super T, defpackage.afbk> affcVar2);

    <K, V> defpackage.aifa<K, V> createMemoizedFunction(defpackage.affc<? super K, ? extends V> affcVar);

    <K, V> defpackage.aifb<K, V> createMemoizedFunctionWithNullableValues(defpackage.affc<? super K, ? extends V> affcVar);

    <T> defpackage.aifd<T> createNullableLazyValue(defpackage.afer<? extends T> aferVar);

    <T> defpackage.aifc<T> createRecursionTolerantLazyValue(defpackage.afer<? extends T> aferVar, T t);
}

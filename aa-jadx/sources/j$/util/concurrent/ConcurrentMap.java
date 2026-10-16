package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface ConcurrentMap<K, V> extends j$.util.Map<K, V> {

    /* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$compute(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            java.lang.Object objApply;
            loop0: while (true) {
                java.lang.Object objPutIfAbsent = concurrentMap.get(obj);
                do {
                    objApply = biFunction.apply(obj, objPutIfAbsent);
                    if (objApply != null) {
                        if (objPutIfAbsent == null) {
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                        } else if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            break;
                        }
                    } else if (objPutIfAbsent == null || concurrentMap.remove(obj, objPutIfAbsent)) {
                        return null;
                    }
                } while (objPutIfAbsent != null);
            }
            return objApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.util.function.Function function) {
            java.lang.Object objApply;
            function.getClass();
            java.lang.Object obj2 = concurrentMap.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            java.lang.Object objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
            return objPutIfAbsent == null ? objApply : objPutIfAbsent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            while (true) {
                java.lang.Object obj2 = concurrentMap.get(obj);
                if (obj2 == null) {
                    return null;
                }
                java.lang.Object objApply = biFunction.apply(obj, obj2);
                if (objApply == null) {
                    if (concurrentMap.remove(obj, obj2)) {
                        return objApply;
                    }
                } else if (concurrentMap.replace(obj, obj2, objApply)) {
                    return objApply;
                }
            }
        }

        public static void $default$forEach(java.util.concurrent.ConcurrentMap concurrentMap, java.util.function.BiConsumer biConsumer) {
            biConsumer.getClass();
            for (java.util.Map.Entry<K, V> entry : concurrentMap.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (java.lang.IllegalStateException unused) {
                }
            }
        }

        public static java.lang.Object $default$getOrDefault(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = concurrentMap.get(obj);
            return obj3 != null ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            while (true) {
                java.lang.Object objPutIfAbsent = concurrentMap.get(obj);
                while (objPutIfAbsent == null) {
                    objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                    if (objPutIfAbsent == null) {
                        return obj2;
                    }
                }
                java.lang.Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                if (objApply != null) {
                    if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                        return objApply;
                    }
                } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                    return null;
                }
            }
        }

        public static void $default$replaceAll(java.util.concurrent.ConcurrentMap concurrentMap, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            j$.nio.file.h0 h0Var = new j$.nio.file.h0((java.lang.Object) concurrentMap, (java.lang.Object) biFunction, (byte) 1);
            if (concurrentMap instanceof j$.util.concurrent.ConcurrentMap) {
                ((j$.util.concurrent.ConcurrentMap) concurrentMap).forEach(h0Var);
            } else {
                $default$forEach(concurrentMap, h0Var);
            }
        }
    }

    /* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class EL {
        public static /* synthetic */ java.lang.Object compute(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            return concurrentMap instanceof j$.util.concurrent.ConcurrentMap ? ((j$.util.concurrent.ConcurrentMap) concurrentMap).compute(obj, biFunction) : j$.util.concurrent.ConcurrentMap.CC.$default$compute(concurrentMap, obj, biFunction);
        }

        public static /* synthetic */ java.lang.Object computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.util.function.Function function) {
            return concurrentMap instanceof j$.util.concurrent.ConcurrentMap ? ((j$.util.concurrent.ConcurrentMap) concurrentMap).computeIfAbsent(obj, function) : j$.util.concurrent.ConcurrentMap.CC.$default$computeIfAbsent(concurrentMap, obj, function);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V compute(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfAbsent(K k, java.util.function.Function<? super K, ? extends V> function);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfPresent(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    void forEach(java.util.function.BiConsumer<? super K, ? super V> biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V getOrDefault(java.lang.Object obj, V v);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V merge(K k, V v, java.util.function.BiFunction<? super V, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);
}

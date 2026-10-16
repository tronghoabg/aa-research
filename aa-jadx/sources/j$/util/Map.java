package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Map<K, V> {

    /* JADX INFO: renamed from: j$.util.Map$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class EL {
        public static /* synthetic */ java.lang.Object computeIfAbsent(java.util.Map map, java.lang.Object obj, java.util.function.Function function) {
            if (map instanceof j$.util.Map) {
                return ((j$.util.Map) map).computeIfAbsent(obj, function);
            }
            return map instanceof java.util.concurrent.ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$computeIfAbsent((java.util.concurrent.ConcurrentMap) map, obj, function) : j$.util.Map.CC.$default$computeIfAbsent(map, obj, function);
        }

        public static /* synthetic */ void forEach(java.util.Map map, java.util.function.BiConsumer biConsumer) {
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).forEach(biConsumer);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                j$.util.concurrent.ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
            } else {
                j$.util.Map.CC.$default$forEach(map, biConsumer);
            }
        }

        public static /* synthetic */ java.lang.Object getOrDefault(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            if (map instanceof j$.util.Map) {
                return ((j$.util.Map) map).getOrDefault(obj, obj2);
            }
            return map instanceof java.util.concurrent.ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$getOrDefault((java.util.concurrent.ConcurrentMap) map, obj, obj2) : j$.util.Map.CC.$default$getOrDefault(map, obj, obj2);
        }

        public static /* synthetic */ java.lang.Object merge(java.util.Map map, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
            if (map instanceof j$.util.Map) {
                return ((j$.util.Map) map).merge(obj, obj2, biFunction);
            }
            return map instanceof java.util.concurrent.ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : j$.util.Map.CC.$default$merge(map, obj, obj2, biFunction);
        }

        public static /* synthetic */ java.lang.Object putIfAbsent(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            return map instanceof j$.util.Map ? ((j$.util.Map) map).putIfAbsent(obj, obj2) : j$.util.Map.CC.$default$putIfAbsent(map, obj, obj2);
        }

        public static /* synthetic */ boolean remove(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            return map instanceof j$.util.Map ? ((j$.util.Map) map).remove(obj, obj2) : j$.util.Map.CC.$default$remove(map, obj, obj2);
        }

        public static /* synthetic */ void replaceAll(java.util.Map map, java.util.function.BiFunction biFunction) {
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).replaceAll(biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                j$.util.concurrent.ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                j$.util.Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    V compute(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k, java.util.function.Function<? super K, ? extends V> function);

    V computeIfPresent(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    void forEach(java.util.function.BiConsumer<? super K, ? super V> biConsumer);

    V getOrDefault(java.lang.Object obj, V v);

    V merge(K k, V v, java.util.function.BiFunction<? super V, ? super V, ? extends V> biFunction);

    V putIfAbsent(K k, V v);

    boolean remove(java.lang.Object obj, java.lang.Object obj2);

    V replace(K k, V v);

    boolean replace(K k, V v, V v2);

    void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    /* JADX INFO: renamed from: j$.util.Map$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$compute(java.util.Map map, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            java.lang.Object obj2 = map.get(obj);
            java.lang.Object objApply = biFunction.apply(obj, obj2);
            if (objApply != null) {
                map.put(obj, objApply);
                return objApply;
            }
            if (obj2 == null && !map.containsKey(obj)) {
                return null;
            }
            map.remove(obj);
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfAbsent(java.util.Map map, java.lang.Object obj, java.util.function.Function function) {
            java.lang.Object objApply;
            function.getClass();
            java.lang.Object obj2 = map.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            map.put(obj, objApply);
            return objApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfPresent(java.util.Map map, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            java.lang.Object obj2 = map.get(obj);
            if (obj2 != null) {
                java.lang.Object objApply = biFunction.apply(obj, obj2);
                if (objApply != null) {
                    map.put(obj, objApply);
                    return objApply;
                }
                map.remove(obj);
            }
            return null;
        }

        public static void $default$forEach(java.util.Map map, java.util.function.BiConsumer biConsumer) {
            biConsumer.getClass();
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (java.lang.IllegalStateException e) {
                    throw new java.util.ConcurrentModificationException(e);
                }
            }
        }

        public static java.lang.Object $default$getOrDefault(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$merge(java.util.Map map, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            java.lang.Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.apply(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
                return obj2;
            }
            map.put(obj, obj2);
            return obj2;
        }

        public static java.lang.Object $default$putIfAbsent(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            if (!j$.util.Objects.equals(obj3, obj2)) {
                return false;
            }
            if (obj3 == null && !map.containsKey(obj)) {
                return false;
            }
            map.remove(obj);
            return true;
        }

        public static boolean $default$replace(java.util.Map map, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            java.lang.Object obj4 = map.get(obj);
            if (!j$.util.Objects.equals(obj4, obj2)) {
                return false;
            }
            if (obj4 == null && !map.containsKey(obj)) {
                return false;
            }
            map.put(obj, obj3);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$replaceAll(java.util.Map map, java.util.function.BiFunction biFunction) {
            biFunction.getClass();
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                    } catch (java.lang.IllegalStateException e) {
                        throw new java.util.ConcurrentModificationException(e);
                    }
                } catch (java.lang.IllegalStateException e2) {
                    throw new java.util.ConcurrentModificationException(e2);
                }
            }
        }

        public static java.lang.Object $default$replace(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }
    }
}

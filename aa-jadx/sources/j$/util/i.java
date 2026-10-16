package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements java.util.Map, java.io.Serializable, j$.util.Map {
    private static final long serialVersionUID = 1978198479659022715L;
    public final java.util.Map a;
    public final j$.util.i b;
    public transient j$.util.k c;
    public transient j$.util.k d;
    public transient j$.util.g e;

    public i(java.util.Map map) {
        map.getClass();
        this.a = map;
        this.b = this;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj$default$compute;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof j$.util.Map) {
                obj$default$compute = ((j$.util.Map) map).compute(obj, biFunction);
            } else {
                obj$default$compute = map instanceof java.util.concurrent.ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : j$.util.Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        java.lang.Object objComputeIfAbsent;
        synchronized (this.b) {
            objComputeIfAbsent = j$.util.Map.EL.computeIfAbsent(this.a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj$default$computeIfPresent;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof j$.util.Map) {
                obj$default$computeIfPresent = ((j$.util.Map) map).computeIfPresent(obj, biFunction);
            } else {
                obj$default$computeIfPresent = map instanceof java.util.concurrent.ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : j$.util.Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        boolean zContainsValue;
        synchronized (this.b) {
            zContainsValue = this.a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        j$.util.k kVar;
        synchronized (this.b) {
            try {
                kVar = this.d;
                if (kVar == null) {
                    kVar = new j$.util.k(this.a.entrySet(), this.b);
                    this.d = kVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        synchronized (this.b) {
            j$.util.Map.EL.forEach(this.a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object orDefault;
        synchronized (this.b) {
            orDefault = j$.util.Map.EL.getOrDefault(this.a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        j$.util.k kVar;
        synchronized (this.b) {
            try {
                kVar = this.c;
                if (kVar == null) {
                    kVar = new j$.util.k(this.a.keySet(), this.b);
                    this.c = kVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        java.lang.Object objMerge;
        synchronized (this.b) {
            objMerge = j$.util.Map.EL.merge(this.a, obj, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objPut;
        synchronized (this.b) {
            objPut = this.a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objPutIfAbsent;
        synchronized (this.b) {
            objPutIfAbsent = j$.util.Map.EL.putIfAbsent(this.a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object objRemove;
        synchronized (this.b) {
            objRemove = this.a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean zReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            zReplace = map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2, obj3) : j$.util.Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        synchronized (this.b) {
            j$.util.Map.EL.replaceAll(this.a, biFunction);
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        j$.util.g gVar;
        synchronized (this.b) {
            try {
                gVar = this.e;
                if (gVar == null) {
                    gVar = new j$.util.g(this.a.values(), this.b);
                    this.e = gVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = j$.util.Map.EL.remove(this.a, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            objReplace = map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2) : j$.util.Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }
}

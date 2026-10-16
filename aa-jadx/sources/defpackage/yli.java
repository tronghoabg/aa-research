package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yli<K, V, E extends defpackage.yke<K, V, E>, S extends defpackage.yki<K, V, E, S>> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable, j$.util.concurrent.ConcurrentMap<K, V> {
    static final defpackage.ylf a = new defpackage.yjw();
    public static final /* synthetic */ int k = 0;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient defpackage.yki[] d;
    final int e;
    final defpackage.xyc f;
    final transient defpackage.ykf g;
    transient java.util.Set h;
    transient java.util.Collection i;
    transient java.util.Set j;

    public yli(defpackage.yjv yjvVar, defpackage.ykf ykfVar) {
        this.e = java.lang.Math.min(yjvVar.a(), 65536);
        this.f = (defpackage.xyc) defpackage.ysr.bz(yjvVar.f, yjvVar.c().a());
        this.g = ykfVar;
        int iMin = java.lang.Math.min(yjvVar.b(), 1073741824);
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.e) {
            i4++;
            i3 += i3;
        }
        this.c = 32 - i4;
        this.b = i3 - 1;
        this.d = new defpackage.yki[i3];
        int i5 = iMin / i3;
        while (i < (i3 * i5 < iMin ? i5 + 1 : i5)) {
            i += i;
        }
        while (true) {
            defpackage.yki[] ykiVarArr = this.d;
            if (i2 >= ykiVarArr.length) {
                return;
            }
            ykiVarArr[i2] = this.g.c(this, i);
            i2++;
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializationProxy");
    }

    public final int a(java.lang.Object obj) {
        int iC = this.f.c(obj);
        int i = iC + ((iC << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final defpackage.xyc b() {
        return this.g.e().a();
    }

    public final defpackage.yki c(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (defpackage.yki ykiVar : this.d) {
            if (ykiVar.b != 0) {
                ykiVar.lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVar.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    ykiVar.g();
                    ykiVar.f.set(0);
                    ykiVar.c++;
                    ykiVar.b = 0;
                    ykiVar.unlock();
                } catch (java.lang.Throwable th) {
                    ykiVar.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        defpackage.yke ykeVarB;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        try {
            if (ykiVarC.b != 0 && (ykeVarB = ykiVarC.b(obj, iA)) != null && ykeVarB.d() != null) {
                z = true;
            }
            return z;
        } finally {
            ykiVarC.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.lang.Object objD;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        defpackage.yki[] ykiVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = ykiVarArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                defpackage.yki ykiVar = ykiVarArr[r10];
                int i2 = ykiVar.b;
                ?? r12 = ykiVar.e;
                for (?? r13 = z; r13 < r12.length(); r13++) {
                    defpackage.yke ykeVarB = (defpackage.yke) r12.get(r13);
                    while (ykeVarB != null) {
                        if (ykeVarB.c() == null || (objD = ykeVarB.d()) == null) {
                            ykiVar.l();
                            objD = null;
                        }
                        boolean z2 = z;
                        if (objD != null && b().d(obj, objD)) {
                            return true;
                        }
                        ykeVarB = ykeVarB.b();
                        z = z2;
                    }
                }
                j2 += (long) ykiVar.c;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        defpackage.ykc ykcVar = new defpackage.ykc(this);
        this.j = ykcVar;
        return ykcVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.concurrent.ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        try {
            defpackage.yke ykeVarB = ykiVarC.b(obj, iA);
            if (ykeVarB != null && (v = (V) ykeVarB.d()) == null) {
                ykiVarC.l();
            }
            return v;
        } finally {
            ykiVarC.i();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        int i = 0;
        long j = 0;
        while (true) {
            defpackage.yki[] ykiVarArr = this.d;
            if (i >= ykiVarArr.length) {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < ykiVarArr.length; i2++) {
                    if (ykiVarArr[i2].b != 0) {
                        return false;
                    }
                    j -= (long) ykiVarArr[i2].c;
                }
                return j == 0;
            }
            if (ykiVarArr[i].b != 0) {
                return false;
            }
            j += (long) ykiVarArr[i].c;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set = this.h;
        if (set != null) {
            return set;
        }
        defpackage.ykh ykhVar = new defpackage.ykh(this);
        this.h = ykhVar;
        return ykhVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        k2.getClass();
        v.getClass();
        int iA = a(k2);
        return (V) c(iA).d(k2, iA, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).d(obj, iA, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        ykiVarC.lock();
        try {
            ykiVarC.j();
            int i = ykiVarC.b;
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(length);
            for (defpackage.yke ykeVarB = ykeVar; ykeVarB != null; ykeVarB = ykeVarB.b()) {
                java.lang.Object objC = ykeVarB.c();
                if (ykeVarB.a() == iA && objC != null) {
                    defpackage.yli yliVar = ykiVarC.a;
                    if (yliVar.f.d(obj, objC)) {
                        if (!yliVar.b().d(obj2, ykeVarB.d())) {
                            if (!defpackage.yki.m(ykeVarB)) {
                                break;
                            }
                            break;
                        }
                        z = true;
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar, ykeVarB);
                        int i2 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i2;
                        break;
                    }
                }
            }
            return z;
        } finally {
            ykiVarC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        ykiVarC.lock();
        try {
            ykiVarC.j();
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(length);
            for (defpackage.yke ykeVarB = ykeVar; ykeVarB != null; ykeVarB = ykeVarB.b()) {
                java.lang.Object objC = ykeVarB.c();
                if (ykeVarB.a() == iA && objC != null) {
                    defpackage.yli yliVar = ykiVarC.a;
                    if (yliVar.f.d(obj, objC)) {
                        java.lang.Object objD = ykeVarB.d();
                        if (objD != null) {
                            if (!yliVar.b().d(obj2, objD)) {
                                break;
                            }
                            ykiVarC.c++;
                            ykiVarC.k(ykeVarB, obj3);
                            z = true;
                            break;
                        }
                        if (!defpackage.yki.m(ykeVarB)) {
                            break;
                        }
                        int i = ykiVarC.b;
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar, ykeVarB);
                        int i2 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i2;
                        break;
                    }
                }
            }
            return z;
        } finally {
            ykiVarC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.concurrent.ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 0;
        long j = 0;
        while (true) {
            defpackage.yki[] ykiVarArr = this.d;
            if (i >= ykiVarArr.length) {
                return defpackage.ysr.cO(j);
            }
            j += (long) ykiVarArr[i].b;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.i;
        if (collection != null) {
            return collection;
        }
        defpackage.yku ykuVar = new defpackage.yku(this);
        this.i = ykuVar;
        return ykuVar;
    }

    java.lang.Object writeReplace() {
        defpackage.ykf ykfVar = this.g;
        defpackage.ykk ykkVarD = ykfVar.d();
        defpackage.ykk ykkVarE = ykfVar.e();
        ykfVar.e().a();
        return new defpackage.ykj(ykkVarD, ykkVarE, this.f, this.e, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        ykiVarC.lock();
        try {
            ykiVarC.j();
            int i = ykiVarC.b;
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(length);
            for (defpackage.yke ykeVarB = ykeVar; ykeVarB != null; ykeVarB = ykeVarB.b()) {
                java.lang.Object objC = ykeVarB.c();
                if (ykeVarB.a() == iA && objC != null && ykiVarC.a.f.d(obj, objC)) {
                    java.lang.Object objD = ykeVarB.d();
                    if (objD != null || defpackage.yki.m(ykeVarB)) {
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar, ykeVarB);
                        int i2 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i2;
                        v = (V) objD;
                        break;
                    }
                    break;
                }
            }
            return v;
        } finally {
            ykiVarC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        defpackage.yki ykiVarC = c(iA);
        ykiVarC.lock();
        try {
            ykiVarC.j();
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(length);
            defpackage.yke ykeVarB = ykeVar;
            while (true) {
                obj3 = null;
                if (ykeVarB == null) {
                    break;
                }
                java.lang.Object objC = ykeVarB.c();
                if (ykeVarB.a() == iA && objC != null && ykiVarC.a.f.d(obj, objC)) {
                    java.lang.Object objD = ykeVarB.d();
                    if (objD == null) {
                        if (!defpackage.yki.m(ykeVarB)) {
                            break;
                        }
                        int i = ykiVarC.b;
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar, ykeVarB);
                        int i2 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i2;
                        break;
                    }
                    ykiVarC.c++;
                    ykiVarC.k(ykeVarB, obj2);
                    obj3 = objD;
                    break;
                }
                ykeVarB = ykeVarB.b();
            }
            return obj3;
        } finally {
            ykiVarC.unlock();
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yep<E> extends defpackage.ydb<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private transient defpackage.yep a;
    public final transient java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap;

    public yep(java.util.concurrent.ConcurrentMap concurrentMap) {
        this.countMap = concurrentMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.List f() {
        java.util.ArrayList arrayListT = defpackage.ysr.T(size());
        for (defpackage.ymg ymgVar : l()) {
            java.lang.Object objB = ymgVar.b();
            for (int iA = ymgVar.a(); iA > 0; iA--) {
                arrayListT.add(objB);
            }
        }
        return arrayListT;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        java.lang.Object object = objectInputStream.readObject();
        object.getClass();
        this.a = new defpackage.yep((java.util.concurrent.ConcurrentMap) object);
    }

    private java.lang.Object readResolve() {
        defpackage.yep yepVar = this.a;
        yepVar.getClass();
        return yepVar;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // defpackage.ymh
    public final int a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) defpackage.ysr.J(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // defpackage.ydb
    public final int b() {
        return this.countMap.size();
    }

    @Override // defpackage.ydb, defpackage.ymh
    public final int c(java.lang.Object obj, int i) {
        int i2;
        int iMax;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) defpackage.ysr.J(this.countMap, obj);
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    iMax = java.lang.Math.max(0, i2 - i);
                }
            } while (!atomicInteger.compareAndSet(i2, iMax));
            if (iMax == 0) {
                this.countMap.remove(obj, atomicInteger);
            }
            return i2;
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.countMap.clear();
    }

    @Override // defpackage.ydb
    public final java.util.Iterator d() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // defpackage.ydb
    public final java.util.Iterator e() {
        return new defpackage.yen(this, new defpackage.yem(this));
    }

    @Override // defpackage.ydb, defpackage.ymh
    public final boolean g(java.lang.Object obj, int i) {
        obj.getClass();
        defpackage.ysr.aL(i, "oldCount");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) defpackage.ysr.J(this.countMap, obj);
        if (atomicInteger == null) {
            return i == 0;
        }
        int i2 = atomicInteger.get();
        if (i2 == i) {
            if (i2 == 0) {
                this.countMap.remove(obj, atomicInteger);
                return true;
            }
            if (atomicInteger.compareAndSet(i2, 0)) {
                this.countMap.remove(obj, atomicInteger);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ydb, defpackage.ymh
    public final void h(java.lang.Object obj, int i) {
        java.util.concurrent.atomic.AtomicInteger atomicIntegerPutIfAbsent;
        int i2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i3;
        obj.getClass();
        if (i == 0) {
            a(obj);
            return;
        }
        defpackage.ysr.aK(i, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (java.util.concurrent.atomic.AtomicInteger) defpackage.ysr.J(this.countMap, obj);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(obj, new java.util.concurrent.atomic.AtomicInteger(i))) == null) {
                return;
            }
            do {
                i2 = atomicIntegerPutIfAbsent.get();
                if (i2 != 0) {
                    long j = ((long) i2) + ((long) i);
                    i3 = (int) j;
                    if (j != i3) {
                        throw new java.lang.ArithmeticException();
                    }
                    try {
                    } catch (java.lang.ArithmeticException unused) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Overflow adding ", " occurrences to a count of "));
                    }
                    throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Overflow adding ", " occurrences to a count of "));
                }
                atomicInteger = new java.util.concurrent.atomic.AtomicInteger(i);
                if (this.countMap.putIfAbsent(obj, atomicInteger) == null) {
                    return;
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i2, i3));
            return;
        } while (!this.countMap.replace(obj, atomicIntegerPutIfAbsent, atomicInteger));
    }

    @Override // defpackage.ydb
    public final java.util.Set i() {
        return new defpackage.yel(this.countMap.keySet());
    }

    @Override // defpackage.ydb, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return defpackage.ytn.h(this);
    }

    @Override // defpackage.ydb
    @java.lang.Deprecated
    public final java.util.Set j() {
        return new defpackage.yeo(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ymh
    public final int size() {
        java.util.Iterator<java.util.concurrent.atomic.AtomicInteger> it = this.countMap.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return defpackage.ysr.cO(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return f().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f().toArray(tArr);
    }
}

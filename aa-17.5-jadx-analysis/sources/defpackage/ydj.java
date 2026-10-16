package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ydj<E> extends ybv<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private transient ydj a;
    public final transient ConcurrentMap<E, AtomicInteger> countMap;

    public ydj(ConcurrentMap concurrentMap) {
        this.countMap = concurrentMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List f() {
        ArrayList arrayListT = yrm.T(size());
        for (ylb ylbVar : l()) {
            Object objB = ylbVar.b();
            for (int iA = ylbVar.a(); iA > 0; iA--) {
                arrayListT.add(objB);
            }
        }
        return arrayListT;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.a = new ydj((ConcurrentMap) object);
    }

    private Object readResolve() {
        ydj ydjVar = this.a;
        ydjVar.getClass();
        return ydjVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // defpackage.ylc
    public final int a(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) yrm.J(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // defpackage.ybv
    public final int b() {
        return this.countMap.size();
    }

    @Override // defpackage.ybv, defpackage.ylc
    public final int c(Object obj, int i) {
        int i2;
        int iMax;
        AtomicInteger atomicInteger = (AtomicInteger) yrm.J(this.countMap, obj);
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    iMax = Math.max(0, i2 - i);
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

    @Override // defpackage.ybv
    public final Iterator d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ybv
    public final Iterator e() {
        return new ydh(this, new ydg(this));
    }

    @Override // defpackage.ybv, defpackage.ylc
    public final boolean g(Object obj, int i) {
        obj.getClass();
        wub.G(i, "oldCount");
        AtomicInteger atomicInteger = (AtomicInteger) yrm.J(this.countMap, obj);
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

    @Override // defpackage.ybv, defpackage.ylc
    public final void h(Object obj, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i2;
        AtomicInteger atomicInteger;
        int i3;
        obj.getClass();
        if (i == 0) {
            a(obj);
            return;
        }
        wub.F(i, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) yrm.J(this.countMap, obj);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(obj, new AtomicInteger(i))) == null) {
                return;
            }
            do {
                i2 = atomicIntegerPutIfAbsent.get();
                if (i2 != 0) {
                    long j = i2 + i;
                    i3 = (int) j;
                    if (j != i3) {
                        throw new ArithmeticException();
                    }
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException(a.bo(i2, i, "Overflow adding ", " occurrences to a count of "));
                    }
                    throw new IllegalArgumentException(a.bo(i2, i, "Overflow adding ", " occurrences to a count of "));
                }
                atomicInteger = new AtomicInteger(i);
                if (this.countMap.putIfAbsent(obj, atomicInteger) == null) {
                    return;
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i2, i3));
            return;
        } while (!this.countMap.replace(obj, atomicIntegerPutIfAbsent, atomicInteger));
    }

    @Override // defpackage.ybv
    public final Set i() {
        return new ydf(this.countMap.keySet());
    }

    @Override // defpackage.ybv, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return ysi.h(this);
    }

    @Override // defpackage.ybv
    @Deprecated
    public final Set j() {
        return new ydi(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ylc
    public final int size() {
        long j = 0;
        while (this.countMap.values().iterator().hasNext()) {
            j += r4.next().get();
        }
        return wub.aw(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return f().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f().toArray(tArr);
    }
}

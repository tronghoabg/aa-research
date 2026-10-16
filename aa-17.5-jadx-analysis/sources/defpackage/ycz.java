package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class ycz<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    ycz() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objB = wub.B(i2);
        if (i4 != 0) {
            wub.D(objB, i3 & i5, i4 + 1);
        }
        Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iA = wub.A(objJ, i6);
            while (iA != 0) {
                int i7 = iA - 1;
                int i8 = iArrL[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iA2 = wub.A(objB, i10);
                wub.D(objB, i10, iA);
                iArrL[i7] = ((~i5) & i9) | (iA2 & i5);
                iA = i8 & i;
            }
        }
        this.c = objB;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.b & (-32));
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bp(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int iMin;
        if (g()) {
            woy.aa(g(), "Arrays already allocated");
            int i = this.b;
            int iMax = Math.max(4, wub.y(i + 1));
            this.c = wub.B(iMax);
            k(iMax - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set setD = d();
        if (setD != null) {
            return setD.add(e);
        }
        int[] iArrL = l();
        Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iX = wub.x(e);
        int iH = h();
        int i4 = iX & iH;
        int iA = wub.A(j(), i4);
        if (iA != 0) {
            int i5 = ~iH;
            int i6 = iX & i5;
            boolean z = false;
            int i7 = 0;
            while (true) {
                int i8 = iA - 1;
                int i9 = iArrL[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && Objects.equals(e, objArrM[i8])) {
                    return z;
                }
                int i11 = i9 & iH;
                int i12 = i7 + 1;
                if (i11 != 0) {
                    iA = i11;
                    i7 = i12;
                    z = false;
                } else {
                    if (i12 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int iA2 = a();
                        while (iA2 >= 0) {
                            linkedHashSet.add(c(iA2));
                            iA2 = b(iA2);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(e);
                    }
                    if (i3 > iH) {
                        iH = i(iH, (iH < 32 ? 4 : 2) * (iH + 1), iX, i2);
                    } else {
                        iArrL[i8] = i10 | (i3 & iH);
                    }
                }
            }
        } else if (i3 > iH) {
            iH = i(iH, (iH >= 32 ? 2 : 4) * (iH + 1), iX, i2);
        } else {
            wub.D(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), iMin);
            this.a = Arrays.copyOf(m(), iMin);
        }
        l()[i2] = (~iH) & iX;
        m()[i2] = e;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set setD = d();
        if (setD != null) {
            this.b = wub.as(size(), 3, 1073741823);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        wub.C(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iX = wub.x(obj);
        int iH = h();
        int iA = wub.A(j(), iX & iH);
        if (iA != 0) {
            int i = ~iH;
            int i2 = iX & i;
            do {
                int i3 = iA - 1;
                int i4 = l()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, c(i3))) {
                    return true;
                }
                iA = i4 & iH;
            } while (iA != 0);
        }
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        this.b = Math.min(Math.max(i, 1), 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set setD = d();
        return setD != null ? setD.iterator() : new ycy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set setD = d();
            if (setD != null) {
                return setD.remove(obj);
            }
            int iH = h();
            int iZ = wub.z(obj, null, iH, j(), l(), m(), null);
            if (iZ != -1) {
                Object objJ = j();
                int[] iArrL = l();
                Object[] objArrM = m();
                int size = size();
                int i3 = size - 1;
                if (iZ < i3) {
                    int i4 = iZ + 1;
                    Object obj2 = objArrM[i3];
                    objArrM[iZ] = obj2;
                    objArrM[i3] = null;
                    iArrL[iZ] = iArrL[i3];
                    iArrL[i3] = 0;
                    int iX = wub.x(obj2) & iH;
                    int iA = wub.A(objJ, iX);
                    if (iA == size) {
                        wub.D(objJ, iX, i4);
                    } else {
                        while (true) {
                            i = iA - 1;
                            i2 = iArrL[i];
                            int i5 = i2 & iH;
                            if (i5 == size) {
                                break;
                            }
                            iA = i5;
                        }
                        iArrL[i] = (i2 & (~iH)) | (i4 & iH);
                    }
                } else {
                    objArrM[iZ] = null;
                    iArrL[iZ] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (g()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set setD = d();
        if (setD != null) {
            return (T[]) setD.toArray(tArr);
        }
        Object[] objArrM = m();
        int i = this.e;
        woy.Y(0, i, objArrM.length);
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) yrm.y(tArr, i);
        } else if (length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArrM, 0, tArr, 0, i);
        return tArr;
    }

    public ycz(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set setD = d();
        return setD != null ? setD.toArray() : Arrays.copyOf(m(), this.e);
    }
}

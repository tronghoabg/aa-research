package com.bytedance.adsdk.oa;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class uef<E> implements Collection<E>, Set<E> {
    private static int bcc;
    private static int ivm;
    private static Object[] lw;
    private static Object[] xs;
    private int[] cz;

    /* renamed from: oa, reason: collision with root package name */
    int f24575oa;
    Object[] uef;
    private wk<E, E> zjm;
    private static final int[] yo = new int[0];
    private static final Object[] moa = new Object[0];

    public uef() {
        this(0);
    }

    private void moa(int i5) {
        if (i5 == 8) {
            synchronized (uef.class) {
                Object[] objArr = xs;
                if (objArr != null) {
                    this.uef = objArr;
                    xs = (Object[]) objArr[0];
                    this.cz = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    bcc--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (uef.class) {
                Object[] objArr2 = lw;
                if (objArr2 != null) {
                    this.uef = objArr2;
                    lw = (Object[]) objArr2[0];
                    this.cz = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    ivm--;
                    return;
                }
            }
        }
        this.cz = new int[i5];
        this.uef = new Object[i5];
    }

    private int uef(Object obj, int i5) {
        int i10 = this.f24575oa;
        if (i10 == 0) {
            return -1;
        }
        int iUef = oa.uef(this.cz, i10, i5);
        if (iUef < 0 || obj.equals(this.uef[iUef])) {
            return iUef;
        }
        int i11 = iUef + 1;
        while (i11 < i10 && this.cz[i11] == i5) {
            if (obj.equals(this.uef[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iUef - 1; i12 >= 0 && this.cz[i12] == i5; i12--) {
            if (obj.equals(this.uef[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e7) {
        int i5;
        int iUef;
        if (e7 == null) {
            iUef = uef();
            i5 = 0;
        } else {
            int iHashCode = e7.hashCode();
            i5 = iHashCode;
            iUef = uef(e7, iHashCode);
        }
        if (iUef >= 0) {
            return false;
        }
        int i10 = ~iUef;
        int i11 = this.f24575oa;
        int[] iArr = this.cz;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.uef;
            moa(i12);
            int[] iArr2 = this.cz;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.uef, 0, objArr.length);
            }
            uef(iArr, objArr, this.f24575oa);
        }
        int i13 = this.f24575oa;
        if (i10 < i13) {
            int[] iArr3 = this.cz;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.uef;
            System.arraycopy(objArr2, i10, objArr2, i14, this.f24575oa - i10);
        }
        this.cz[i10] = i5;
        this.uef[i10] = e7;
        this.f24575oa++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        uef(collection.size() + this.f24575oa);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i5 = this.f24575oa;
        if (i5 != 0) {
            uef(this.cz, this.uef, i5);
            this.cz = yo;
            this.uef = moa;
            this.f24575oa = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return uef(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f24575oa; i5++) {
                try {
                    if (!set.contains(oa(i5))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.cz;
        int i5 = this.f24575oa;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f24575oa <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return oa().moa().iterator();
    }

    public E oa(int i5) {
        return (E) this.uef[i5];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iUef = uef(obj);
        if (iUef < 0) {
            return false;
        }
        yo(iUef);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i5 = this.f24575oa - 1; i5 >= 0; i5--) {
            if (!collection.contains(this.uef[i5])) {
                yo(i5);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f24575oa;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i5 = this.f24575oa;
        Object[] objArr = new Object[i5];
        System.arraycopy(this.uef, 0, objArr, 0, i5);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f24575oa * 14);
        sb2.append('{');
        for (int i5 = 0; i5 < this.f24575oa; i5++) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            E eOa = oa(i5);
            if (eOa != this) {
                sb2.append(eOa);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public E yo(int i5) {
        Object[] objArr = this.uef;
        E e7 = (E) objArr[i5];
        int i10 = this.f24575oa;
        if (i10 <= 1) {
            uef(this.cz, objArr, i10);
            this.cz = yo;
            this.uef = moa;
            this.f24575oa = 0;
            return e7;
        }
        int[] iArr = this.cz;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            int i11 = i10 - 1;
            this.f24575oa = i11;
            if (i5 < i11) {
                int i12 = i5 + 1;
                System.arraycopy(iArr, i12, iArr, i5, i11 - i5);
                Object[] objArr2 = this.uef;
                System.arraycopy(objArr2, i12, objArr2, i5, this.f24575oa - i5);
            }
            this.uef[this.f24575oa] = null;
            return e7;
        }
        moa(i10 > 8 ? i10 + (i10 >> 1) : 8);
        this.f24575oa--;
        if (i5 > 0) {
            System.arraycopy(iArr, 0, this.cz, 0, i5);
            System.arraycopy(objArr, 0, this.uef, 0, i5);
        }
        int i13 = this.f24575oa;
        if (i5 < i13) {
            int i14 = i5 + 1;
            System.arraycopy(iArr, i14, this.cz, i5, i13 - i5);
            System.arraycopy(objArr, i14, this.uef, i5, this.f24575oa - i5);
        }
        return e7;
    }

    public uef(int i5) {
        if (i5 == 0) {
            this.cz = yo;
            this.uef = moa;
        } else {
            moa(i5);
        }
        this.f24575oa = 0;
    }

    private wk<E, E> oa() {
        if (this.zjm == null) {
            this.zjm = new wk<E, E>() { // from class: com.bytedance.adsdk.oa.uef.1
                @Override // com.bytedance.adsdk.oa.wk
                public Map<E, E> oa() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.oa.wk
                public int uef() {
                    return uef.this.f24575oa;
                }

                @Override // com.bytedance.adsdk.oa.wk
                public void yo() {
                    uef.this.clear();
                }

                @Override // com.bytedance.adsdk.oa.wk
                public Object uef(int i5, int i10) {
                    return uef.this.uef[i5];
                }

                @Override // com.bytedance.adsdk.oa.wk
                public int uef(Object obj) {
                    return uef.this.uef(obj);
                }

                @Override // com.bytedance.adsdk.oa.wk
                public void uef(int i5) {
                    uef.this.yo(i5);
                }
            };
        }
        return this.zjm;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f24575oa) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f24575oa));
        }
        System.arraycopy(this.uef, 0, tArr, 0, this.f24575oa);
        int length = tArr.length;
        int i5 = this.f24575oa;
        if (length > i5) {
            tArr[i5] = null;
        }
        return tArr;
    }

    private int uef() {
        int i5 = this.f24575oa;
        if (i5 == 0) {
            return -1;
        }
        int iUef = oa.uef(this.cz, i5, 0);
        if (iUef < 0 || this.uef[iUef] == null) {
            return iUef;
        }
        int i10 = iUef + 1;
        while (i10 < i5 && this.cz[i10] == 0) {
            if (this.uef[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iUef - 1; i11 >= 0 && this.cz[i11] == 0; i11--) {
            if (this.uef[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    private static void uef(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (uef.class) {
                try {
                    if (bcc < 10) {
                        objArr[0] = xs;
                        objArr[1] = iArr;
                        for (int i10 = i5 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        xs = objArr;
                        bcc++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (uef.class) {
                try {
                    if (ivm < 10) {
                        objArr[0] = lw;
                        objArr[1] = iArr;
                        for (int i11 = i5 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        lw = objArr;
                        ivm++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void uef(int i5) {
        int[] iArr = this.cz;
        if (iArr.length < i5) {
            Object[] objArr = this.uef;
            moa(i5);
            int i10 = this.f24575oa;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.cz, 0, i10);
                System.arraycopy(objArr, 0, this.uef, 0, this.f24575oa);
            }
            uef(iArr, objArr, this.f24575oa);
        }
    }

    public int uef(Object obj) {
        return obj == null ? uef() : uef(obj, obj.hashCode());
    }
}

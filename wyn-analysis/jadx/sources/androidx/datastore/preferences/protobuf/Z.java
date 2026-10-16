package androidx.datastore.preferences.protobuf;

import Va.M6;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Z extends AbstractC1384b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f18178d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18179b;

    /* renamed from: c, reason: collision with root package name */
    public int f18180c;

    static {
        Z z2 = new Z(new Object[0], 0);
        f18178d = z2;
        z2.f18185a = false;
    }

    public Z(Object[] objArr, int i5) {
        this.f18179b = objArr;
        this.f18180c = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1384b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f18180c;
        Object[] objArr = this.f18179b;
        if (i5 == objArr.length) {
            this.f18179b = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18179b;
        int i10 = this.f18180c;
        this.f18180c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f18180c) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f18180c);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f18179b[i5];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1406x
    public final InterfaceC1406x mutableCopyWithCapacity(int i5) {
        if (i5 >= this.f18180c) {
            return new Z(Arrays.copyOf(this.f18179b, i5), this.f18180c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f18179b;
        Object obj = objArr[i5];
        if (i5 < this.f18180c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f18180c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f18179b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18180c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 >= 0 && i5 <= (i10 = this.f18180c)) {
            Object[] objArr = this.f18179b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
            } else {
                Object[] objArr2 = new Object[M6.C(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i5);
                System.arraycopy(this.f18179b, i5, objArr2, i5 + 1, this.f18180c - i5);
                this.f18179b = objArr2;
            }
            this.f18179b[i5] = obj;
            this.f18180c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
        sbL.append(this.f18180c);
        throw new IndexOutOfBoundsException(sbL.toString());
    }
}

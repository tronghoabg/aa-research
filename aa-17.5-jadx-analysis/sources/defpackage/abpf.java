package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class abpf<E> extends abmf<E> implements RandomAccess {
    public static final Object[] a;
    public static final abpf b;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new abpf(objArr, 0, false);
    }

    abpf() {
        this(a, 0, true);
    }

    private final String f(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        hn();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aboh
    public final /* bridge */ /* synthetic */ aboh d(int i) {
        if (i >= this.d) {
            return new abpf(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    final void e(int i) {
        int length = this.c.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.c = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.c = Arrays.copyOf(this.c, length);
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abpf) {
            abpf abpfVar = (abpf) obj;
            int i = this.d;
            if (i != abpfVar.d) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.c[i2].equals(abpfVar.c[i2])) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i3 = this.d;
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!this.c[i4].equals(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        g(i);
        return (E) this.c[i];
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.c[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        hn();
        g(i);
        Object[] objArr = this.c;
        E e = (E) objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        hn();
        g(i);
        Object[] objArr = this.c;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public abpf(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.abmf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        hn();
        int i = this.d;
        Object[] objArrCopyOf = this.c;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.c, Math.max(((length * 3) / 2) + 1, 10));
            this.c = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = e;
        this.modCount++;
        return true;
    }
}

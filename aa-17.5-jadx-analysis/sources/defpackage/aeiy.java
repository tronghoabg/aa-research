package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
public final class aeiy extends aegq implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public transient int[] a;
    public int b;

    public aeiy() {
        this.a = aejc.b;
    }

    private final void M(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        if (iArr != aejc.b) {
            i = (int) Math.max(Math.min(length + (length >> 1), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(this.a, 0, iArr2, 0, this.b);
        this.a = iArr2;
    }

    private static final int[] N(int[] iArr, int i) {
        return i == 0 ? aejc.a : Arrays.copyOf(iArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.b];
        this.a = iArr;
        for (int i = 0; i < this.b; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void H(aejj aejjVar) {
        int[] iArr = this.a;
        int i = this.b;
        if (aejjVar == null) {
            aejc.f(iArr, i);
        } else {
            aejc.b(iArr, 0, i, aejjVar, null);
        }
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void J() {
        aejc.f(this.a, this.b);
    }

    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final aeiy clone() {
        if (getClass() == aeiy.class) {
            aeiy aeiyVar = new aeiy(N(this.a, this.b));
            aeiyVar.b = this.b;
            return aeiyVar;
        }
        try {
            aeiy aeiyVar2 = (aeiy) super.clone();
            aeiyVar2.a = N(this.a, this.b);
            return aeiyVar2;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public final int[] L(int[] iArr) {
        int length = iArr.length;
        int i = this.b;
        if (length < i) {
            iArr = Arrays.copyOf(iArr, i);
        }
        System.arraycopy(this.a, 0, iArr, 0, this.b);
        return iArr;
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    public final aekm b() {
        return new aeja(this, 1);
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    public final boolean c(int i) {
        M(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // defpackage.aegq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aegq, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aegq, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof aeiy)) {
            return obj instanceof aeix ? ((aeix) obj).equals(this) : super.equals(obj);
        }
        aeiy aeiyVar = (aeiy) obj;
        if (aeiyVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aeiyVar.b;
        if (i != i2) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = aeiyVar.a;
        if (iArr == iArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    public final boolean g(int i) {
        int iW = w(i);
        if (iW == -1) {
            return false;
        }
        n(iW);
        return true;
    }

    @Override // defpackage.aegj
    public final boolean h(aejf aejfVar) {
        int i;
        int[] iArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aejfVar.e(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean i(IntPredicate intPredicate) {
        int i;
        int[] iArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!intPredicate.test(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aegq
    /* renamed from: l */
    public final aeka subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        E(i);
        E(i2);
        if (i <= i2) {
            return new aeix(this, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aegq, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeka
    public final int m(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int n(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.b = i4;
        if (i != i4) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int o(int i, int i2) {
        int i3 = this.b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException(a.bB(i3, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        int[] iArr = this.a;
        int i4 = iArr[i];
        iArr[i] = i2;
        return i4;
    }

    @Override // defpackage.aegq, defpackage.aeka
    /* renamed from: p */
    public final aekb listIterator(int i) {
        E(i);
        return new aeiu(this, i);
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void q(int i, int i2) {
        E(i);
        M(this.b + 1);
        int i3 = this.b;
        if (i != i3) {
            int[] iArr = this.a;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.a[i] = i2;
        this.b++;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void r(int i, int[] iArr, int i2, int i3) {
        aejc.a(iArr, i2, i3);
        System.arraycopy(this.a, i, iArr, i2, i3);
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void s(int i, int i2) {
        adqs.r(this.b, i, i2);
        int[] iArr = this.a;
        System.arraycopy(iArr, i2, iArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aegq, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeja(this, 1);
    }

    @Override // defpackage.aegq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aegq
    public final boolean t(int i, aejf aejfVar) {
        if (aejfVar instanceof aeka) {
            aeka aekaVar = (aeka) aejfVar;
            E(i);
            int size = aekaVar.size();
            if (size == 0) {
                return false;
            }
            M(this.b + size);
            int[] iArr = this.a;
            System.arraycopy(iArr, i, iArr, i + size, this.b - i);
            aekaVar.r(0, this.a, i, size);
            this.b += size;
            return true;
        }
        E(i);
        int size2 = aejfVar.size();
        if (size2 == 0) {
            return false;
        }
        M(this.b + size2);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i + size2, this.b - i);
        aejr aejrVarM = aejfVar.m();
        this.b += size2;
        while (size2 != 0) {
            size2--;
            this.a[i] = aejrVarM.nextInt();
            i++;
        }
        return true;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void u(int i, int[] iArr, int i2) {
        E(i);
        aejc.a(iArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new IndexOutOfBoundsException(a.bB(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        System.arraycopy(iArr, 0, this.a, i, i2);
    }

    @Override // defpackage.aegq
    /* renamed from: v */
    public final int compareTo(List list) {
        if (!(list instanceof aeiy)) {
            return list instanceof aeix ? -((aeix) list).compareTo(this) : super.compareTo(list);
        }
        aeiy aeiyVar = (aeiy) list;
        int i = this.b;
        int i2 = aeiyVar.b;
        int[] iArr = this.a;
        int[] iArr2 = aeiyVar.a;
        if (iArr == iArr2 && i == i2) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i && i3 < i2) {
            int iCompare = Integer.compare(iArr[i3], iArr2[i3]);
            if (iCompare != 0) {
                return iCompare;
            }
            i3++;
        }
        if (i3 < i2) {
            return -1;
        }
        return i3 < i ? 1 : 0;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int w(int i) {
        int[] iArr = this.a;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int x(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        while (i2 != 0) {
            i2--;
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public aeiy(int i) {
        this.a = new int[i];
    }

    protected aeiy(int[] iArr) {
        this.a = iArr;
    }
}

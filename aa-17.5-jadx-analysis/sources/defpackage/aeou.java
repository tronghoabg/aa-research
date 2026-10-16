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
import java.util.function.LongPredicate;

/* loaded from: classes3.dex */
public final class aeou extends aelk implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    protected transient long[] a;
    protected int b;

    public aeou(byte[] bArr) {
        this.a = new long[2];
    }

    private final void L(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (i <= length) {
            return;
        }
        if (jArr != aeoy.b) {
            i = (int) Math.max(Math.min(length + (length >> 1), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        long[] jArr2 = new long[i];
        System.arraycopy(this.a, 0, jArr2, 0, this.b);
        this.a = jArr2;
    }

    private static final long[] M(long[] jArr, int i) {
        return i == 0 ? aeoy.a : Arrays.copyOf(jArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.b];
        this.a = jArr;
        for (int i = 0; i < this.b; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void H(aepf aepfVar) {
        long[] jArr = this.a;
        int i = this.b;
        if (aepfVar == null) {
            aeoy.f(jArr, i);
        } else {
            aeoy.b(jArr, 0, i, aepfVar, null);
        }
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void J() {
        aeoy.f(this.a, this.b);
    }

    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final aeou clone() {
        if (getClass() == aeou.class) {
            aeou aeouVar = new aeou(M(this.a, this.b));
            aeouVar.b = this.b;
            return aeouVar;
        }
        try {
            aeou aeouVar2 = (aeou) super.clone();
            aeouVar2.a = M(this.a, this.b);
            return aeouVar2;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aeow(this, 1);
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    public final boolean c(long j) {
        L(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // defpackage.aelk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aelk, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aelk, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof aeou)) {
            return obj instanceof aeot ? ((aeot) obj).equals(this) : super.equals(obj);
        }
        aeou aeouVar = (aeou) obj;
        if (aeouVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aeouVar.b;
        if (i != i2) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = aeouVar.a;
        if (jArr == jArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    public final boolean g(long j) {
        int iW = w(j);
        if (iW == -1) {
            return false;
        }
        n(iW);
        return true;
    }

    @Override // defpackage.aeld
    public final boolean h(aepb aepbVar) {
        int i;
        long[] jArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aepbVar.e(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean i(LongPredicate longPredicate) {
        int i;
        long[] jArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!longPredicate.test(jArr[i2])) {
                jArr[i3] = jArr[i2];
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

    @Override // defpackage.aelk
    /* renamed from: l */
    public final aeps subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        E(i);
        E(i2);
        if (i <= i2) {
            return new aeot(this, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aelk, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeps
    public final long m(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final long n(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        long[] jArr = this.a;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (i != i3) {
            System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        }
        return j;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final long o(int i, long j) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // defpackage.aelk, defpackage.aeps
    /* renamed from: p */
    public final aept listIterator(int i) {
        E(i);
        return new aeoq(this, i);
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void q(int i, long j) {
        E(i);
        L(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            long[] jArr = this.a;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.a[i] = j;
        this.b++;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void r(int i, long[] jArr, int i2, int i3) {
        aeoy.a(jArr, i2, i3);
        System.arraycopy(this.a, i, jArr, i2, i3);
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void s(int i, int i2) {
        adqs.r(this.b, i, i2);
        long[] jArr = this.a;
        System.arraycopy(jArr, i2, jArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aelk, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeow(this, 1);
    }

    @Override // defpackage.aelk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aelk
    public final boolean t(int i, aepb aepbVar) {
        if (aepbVar instanceof aeps) {
            aeps aepsVar = (aeps) aepbVar;
            E(i);
            int size = aepsVar.size();
            if (size == 0) {
                return false;
            }
            L(this.b + size);
            long[] jArr = this.a;
            System.arraycopy(jArr, i, jArr, i + size, this.b - i);
            aepsVar.r(0, this.a, i, size);
            this.b += size;
            return true;
        }
        E(i);
        int size2 = aepbVar.size();
        if (size2 == 0) {
            return false;
        }
        L(this.b + size2);
        long[] jArr2 = this.a;
        System.arraycopy(jArr2, i, jArr2, i + size2, this.b - i);
        aepm aepmVarM = aepbVar.m();
        this.b += size2;
        while (size2 != 0) {
            size2--;
            this.a[i] = aepmVarM.nextLong();
            i++;
        }
        return true;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void u(int i, long[] jArr, int i2) {
        E(i);
        aeoy.a(jArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new IndexOutOfBoundsException(a.bB(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        System.arraycopy(jArr, 0, this.a, i, i2);
    }

    @Override // defpackage.aelk
    /* renamed from: v */
    public final int compareTo(List list) {
        if (!(list instanceof aeou)) {
            return list instanceof aeot ? -((aeot) list).compareTo(this) : super.compareTo(list);
        }
        aeou aeouVar = (aeou) list;
        int i = this.b;
        int i2 = aeouVar.b;
        long[] jArr = this.a;
        long[] jArr2 = aeouVar.a;
        if (jArr == jArr2 && i == i2) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i && i3 < i2) {
            int iCompare = Long.compare(jArr[i3], jArr2[i3]);
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

    @Override // defpackage.aelk, defpackage.aeps
    public final int w(long j) {
        long[] jArr = this.a;
        for (int i = 0; i < this.b; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final int x(long j) {
        long[] jArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public aeou() {
        this.a = aeoy.b;
    }

    protected aeou(long[] jArr) {
        this.a = jArr;
    }
}

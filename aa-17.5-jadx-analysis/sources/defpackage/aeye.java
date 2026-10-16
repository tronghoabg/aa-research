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

/* loaded from: classes3.dex */
public final class aeye extends aexx implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public transient short[] a;
    public int b;

    public aeye(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.a = aeyf.a;
        } else {
            this.a = new short[i];
        }
    }

    private final void J(int i) {
        short[] sArr = this.a;
        int length = sArr.length;
        if (i <= length) {
            return;
        }
        if (sArr != aeyf.b) {
            i = (int) Math.max(Math.min(length + (length >> 1), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        short[] sArr2 = new short[i];
        System.arraycopy(this.a, 0, sArr2, 0, this.b);
        this.a = sArr2;
    }

    private static final short[] K(short[] sArr, int i) {
        return i == 0 ? aeyf.a : Arrays.copyOf(sArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        short[] sArr = new short[this.b];
        this.a = sArr;
        for (int i = 0; i < this.b; i++) {
            sArr[i] = objectInputStream.readShort();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        short[] sArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeShort(sArr[i]);
        }
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void F(aeyk aeykVar) {
        short[] sArr = this.a;
        int i = this.b;
        if (aeykVar == null) {
            aeyf.f(sArr, i);
        } else {
            aeyf.b(sArr, 0, i, aeykVar, null);
        }
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void H() {
        aeyf.f(this.a, this.b);
    }

    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final aeye clone() {
        if (getClass() == aeye.class) {
            aeye aeyeVar = new aeye(K(this.a, this.b));
            aeyeVar.b = this.b;
            return aeyeVar;
        }
        try {
            aeye aeyeVar2 = (aeye) super.clone();
            aeyeVar2.a = K(this.a, this.b);
            return aeyeVar2;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final aeze b() {
        return new aeya(this);
    }

    @Override // defpackage.aexx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aexx, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final boolean e(short s) {
        int iU = u(s);
        if (iU == -1) {
            return false;
        }
        m(iU);
        return true;
    }

    @Override // defpackage.aexx, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof aeye)) {
            return obj instanceof aeyd ? ((aeyd) obj).equals(this) : super.equals(obj);
        }
        aeye aeyeVar = (aeye) obj;
        if (aeyeVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aeyeVar.b;
        if (i != i2) {
            return false;
        }
        short[] sArr = this.a;
        short[] sArr2 = aeyeVar.a;
        if (sArr == sArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (sArr[i] != sArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aexq
    public final boolean f(aeyi aeyiVar) {
        int i;
        short[] sArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aeyiVar.d(sArr[i2])) {
                sArr[i3] = sArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public final boolean g(aezc aezcVar) {
        int i;
        short[] sArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aezcVar.d(sArr[i2])) {
                sArr[i3] = sArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final void i(short s) {
        J(this.b + 1);
        short[] sArr = this.a;
        int i = this.b;
        this.b = i + 1;
        sArr[i] = s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aexx
    /* renamed from: j */
    public final aeyx subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        C(i);
        C(i2);
        if (i <= i2) {
            return new aeyd(this, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aexx, defpackage.aeyx
    /* renamed from: k */
    public final aeyy listIterator(int i) {
        C(i);
        return new aexz(this, i);
    }

    @Override // defpackage.aeyx
    public final short l(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aexx, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final short m(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        short[] sArr = this.a;
        short s = sArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (i != i3) {
            System.arraycopy(sArr, i + 1, sArr, i, i3 - i);
        }
        return s;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final short n(int i, short s) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        short[] sArr = this.a;
        short s2 = sArr[i];
        sArr[i] = s;
        return s2;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void o(int i, short s) {
        C(i);
        J(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            short[] sArr = this.a;
            System.arraycopy(sArr, i, sArr, i + 1, i2 - i);
        }
        this.a[i] = s;
        this.b++;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void p(int i, short[] sArr, int i2, int i3) {
        aeyf.a(sArr, i2, i3);
        System.arraycopy(this.a, i, sArr, i2, i3);
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void q(int i, int i2) {
        adqs.r(this.b, i, i2);
        short[] sArr = this.a;
        System.arraycopy(sArr, i2, sArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // defpackage.aexx
    public final boolean r(int i, aeyi aeyiVar) {
        if (aeyiVar instanceof aeyx) {
            aeyx aeyxVar = (aeyx) aeyiVar;
            C(i);
            int size = aeyxVar.size();
            if (size == 0) {
                return false;
            }
            J(this.b + size);
            short[] sArr = this.a;
            System.arraycopy(sArr, i, sArr, i + size, this.b - i);
            aeyxVar.p(0, this.a, i, size);
            this.b += size;
            return true;
        }
        C(i);
        int size2 = aeyiVar.size();
        if (size2 == 0) {
            return false;
        }
        J(this.b + size2);
        short[] sArr2 = this.a;
        System.arraycopy(sArr2, i, sArr2, i + size2, this.b - i);
        aeyu it = aeyiVar.iterator();
        this.b += size2;
        while (size2 != 0) {
            size2--;
            this.a[i] = it.d();
            i++;
        }
        return true;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void s(int i, short[] sArr, int i2) {
        C(i);
        aeyf.a(sArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new IndexOutOfBoundsException(a.bB(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        System.arraycopy(sArr, 0, this.a, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aexx, defpackage.aexq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeya(this);
    }

    @Override // defpackage.aexx, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aexx
    /* renamed from: t */
    public final int compareTo(List list) {
        if (!(list instanceof aeye)) {
            return list instanceof aeyd ? -((aeyd) list).compareTo(this) : super.compareTo(list);
        }
        aeye aeyeVar = (aeye) list;
        int i = this.b;
        int i2 = aeyeVar.b;
        short[] sArr = this.a;
        short[] sArr2 = aeyeVar.a;
        if (sArr == sArr2 && i == i2) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i && i3 < i2) {
            int iCompare = Short.compare(sArr[i3], sArr2[i3]);
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

    @Override // defpackage.aexx, defpackage.aeyx
    public final int u(short s) {
        short[] sArr = this.a;
        for (int i = 0; i < this.b; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final int v(short s) {
        short[] sArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public aeye() {
        this.a = aeyf.b;
    }

    protected aeye(short[] sArr) {
        this.a = sArr;
    }
}

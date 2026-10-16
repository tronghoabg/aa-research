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
public final class aeev extends aeen implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    protected transient byte[] a;
    protected int b;

    public aeev(byte[] bArr) {
        this.a = new byte[2];
    }

    private final void K(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (i <= length) {
            return;
        }
        if (bArr != aeew.b) {
            i = (int) Math.max(Math.min(length + (length >> 1), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(this.a, 0, bArr2, 0, this.b);
        this.a = bArr2;
    }

    private static final byte[] L(byte[] bArr, int i) {
        return i == 0 ? aeew.a : Arrays.copyOf(bArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = new byte[this.b];
        this.a = bArr;
        for (int i = 0; i < this.b; i++) {
            bArr[i] = objectInputStream.readByte();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        byte[] bArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeByte(bArr[i]);
        }
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void G(aefb aefbVar) {
        byte[] bArr = this.a;
        int i = this.b;
        if (aefbVar == null) {
            Arrays.sort(bArr, 0, i);
        } else {
            aeew.b(bArr, 0, i, aefbVar, null);
        }
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void I() {
        Arrays.sort(this.a, 0, this.b);
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final aeev clone() {
        if (getClass() == aeev.class) {
            aeev aeevVar = new aeev(L(this.a, this.b), null);
            aeevVar.b = this.b;
            return aeevVar;
        }
        try {
            aeev aeevVar2 = (aeev) super.clone();
            aeevVar2.a = L(this.a, this.b);
            return aeevVar2;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final aefz b() {
        return new aeer(this);
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final boolean c(byte b) {
        K(this.b + 1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
        return true;
    }

    @Override // defpackage.aeen, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aeen, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aeen, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof aeev)) {
            return obj instanceof aeeu ? ((aeeu) obj).equals(this) : super.equals(obj);
        }
        aeev aeevVar = (aeev) obj;
        if (aeevVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aeevVar.b;
        if (i != i2) {
            return false;
        }
        byte[] bArr = this.a;
        byte[] bArr2 = aeevVar.a;
        if (bArr == bArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final boolean g(byte b) {
        int iV = v(b);
        if (iV == -1) {
            return false;
        }
        m(iV);
        return true;
    }

    @Override // defpackage.aeeg
    public final boolean h(aeez aeezVar) {
        int i;
        byte[] bArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aeezVar.e(bArr[i2])) {
                bArr[i3] = bArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public final boolean i(aefw aefwVar) {
        int i;
        byte[] bArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aefwVar.c(bArr[i2])) {
                bArr[i3] = bArr[i2];
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

    @Override // defpackage.aeen
    /* renamed from: k */
    public final aefo subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        D(i);
        D(i2);
        if (i <= i2) {
            return new aeeu(this, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aefo
    public final byte l(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aeen, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final byte m(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        byte[] bArr = this.a;
        byte b = bArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (i != i3) {
            System.arraycopy(bArr, i + 1, bArr, i, i3 - i);
        }
        return b;
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final byte n(int i, byte b) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        byte[] bArr = this.a;
        byte b2 = bArr[i];
        bArr[i] = b;
        return b2;
    }

    @Override // defpackage.aeen, defpackage.aefo
    /* renamed from: o */
    public final aefp listIterator(int i) {
        D(i);
        return new aeeq(this, i);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void p(int i, byte b) {
        D(i);
        K(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            byte[] bArr = this.a;
            System.arraycopy(bArr, i, bArr, i + 1, i2 - i);
        }
        this.a[i] = b;
        this.b++;
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void q(int i, byte[] bArr, int i2, int i3) {
        aeew.a(bArr, i2, i3);
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void r(int i, int i2) {
        adqs.r(this.b, i, i2);
        byte[] bArr = this.a;
        System.arraycopy(bArr, i2, bArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // defpackage.aeen
    public final boolean s(int i, aeez aeezVar) {
        if (aeezVar instanceof aefo) {
            aefo aefoVar = (aefo) aeezVar;
            D(i);
            int size = aefoVar.size();
            if (size == 0) {
                return false;
            }
            K(this.b + size);
            byte[] bArr = this.a;
            System.arraycopy(bArr, i, bArr, i + size, this.b - i);
            aefoVar.q(0, this.a, i, size);
            this.b += size;
            return true;
        }
        D(i);
        int size2 = aeezVar.size();
        if (size2 == 0) {
            return false;
        }
        K(this.b + size2);
        byte[] bArr2 = this.a;
        System.arraycopy(bArr2, i, bArr2, i + size2, this.b - i);
        aefl it = aeezVar.iterator();
        this.b += size2;
        while (size2 != 0) {
            size2--;
            this.a[i] = it.c();
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aeen, defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeer(this);
    }

    @Override // defpackage.aeen, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void t(int i, byte[] bArr, int i2) {
        D(i);
        aeew.a(bArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new IndexOutOfBoundsException(a.bB(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        System.arraycopy(bArr, 0, this.a, i, i2);
    }

    @Override // defpackage.aeen
    /* renamed from: u */
    public final int compareTo(List list) {
        if (!(list instanceof aeev)) {
            return list instanceof aeeu ? -((aeeu) list).compareTo(this) : super.compareTo(list);
        }
        aeev aeevVar = (aeev) list;
        int i = this.b;
        int i2 = aeevVar.b;
        byte[] bArr = this.a;
        byte[] bArr2 = aeevVar.a;
        if (bArr == bArr2 && i == i2) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i && i3 < i2) {
            int iCompare = Byte.compare(bArr[i3], bArr2[i3]);
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

    @Override // defpackage.aeen, defpackage.aefo
    public final int v(byte b) {
        byte[] bArr = this.a;
        for (int i = 0; i < this.b; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final int w(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public aeev() {
        this.a = aeew.b;
    }

    protected aeev(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
    }
}

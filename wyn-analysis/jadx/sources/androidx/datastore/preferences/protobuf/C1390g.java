package androidx.datastore.preferences.protobuf;

import A7.AbstractC0279p0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1390g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C1390g f18203c = new C1390g(AbstractC1407y.f18275b);

    /* renamed from: d, reason: collision with root package name */
    public static final C1389f f18204d;

    /* renamed from: a, reason: collision with root package name */
    public int f18205a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18206b;

    static {
        f18204d = AbstractC1386c.a() ? new C1389f(1) : new C1389f(0);
    }

    public C1390g(byte[] bArr) {
        bArr.getClass();
        this.f18206b = bArr;
    }

    public static C1390g a(int i5, int i10, byte[] bArr) {
        byte[] bArrCopyOfRange;
        int i11 = i5 + i10;
        int length = bArr.length;
        if (((i11 - i5) | i5 | i11 | (length - i11)) < 0) {
            if (i5 < 0) {
                throw new IndexOutOfBoundsException(AbstractC0279p0.i(i5, "Beginning index: ", " < 0"));
            }
            if (i11 < i5) {
                throw new IndexOutOfBoundsException(R8.v.e(i5, i11, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(R8.v.e(i11, length, "End index: ", " >= "));
        }
        switch (f18204d.f18202a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i10 + i5);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i5, bArrCopyOfRange, 0, i10);
                break;
        }
        return new C1390g(bArrCopyOfRange);
    }

    public int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1390g) || size() != ((C1390g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1390g)) {
            return obj.equals(this);
        }
        C1390g c1390g = (C1390g) obj;
        int i5 = this.f18205a;
        int i10 = c1390g.f18205a;
        if (i5 != 0 && i10 != 0 && i5 != i10) {
            return false;
        }
        int size = size();
        if (size > c1390g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1390g.size()) {
            StringBuilder sbL = pd.f.l(size, "Ran off end of other: 0, ", ", ");
            sbL.append(c1390g.size());
            throw new IllegalArgumentException(sbL.toString());
        }
        int iB = b() + size;
        int iB2 = b();
        int iB3 = c1390g.b();
        while (iB2 < iB) {
            if (this.f18206b[iB2] != c1390g.f18206b[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    public final int hashCode() {
        int i5 = this.f18205a;
        if (i5 != 0) {
            return i5;
        }
        int size = size();
        int iB = b();
        int i10 = size;
        for (int i11 = iB; i11 < iB + size; i11++) {
            i10 = (i10 * 31) + this.f18206b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f18205a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1388e(this);
    }

    public int size() {
        return this.f18206b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}

package Qf;

import Va.M6;
import ff.m;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import pd.f;

/* loaded from: classes5.dex */
public final class a implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f10003c = new a(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f10004d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10005a;

    /* renamed from: b, reason: collision with root package name */
    public int f10006b;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC3340k.d(charArray, "toCharArray(...)");
        f10004d = charArray;
    }

    public a(byte[] bArr) {
        this.f10005a = bArr;
    }

    public final byte a(int i5) {
        byte[] bArr = this.f10005a;
        if (i5 < 0 || i5 >= bArr.length) {
            throw new IndexOutOfBoundsException(M6.r(f.l(i5, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        }
        return bArr[i5];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        AbstractC3340k.e(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f10005a;
        int length = bArr.length;
        byte[] bArr2 = other.f10005a;
        int iMin = Math.min(length, bArr2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int iG = AbstractC3340k.g(bArr[i5] & ForkServer.ERROR, bArr2[i5] & ForkServer.ERROR);
            if (iG != 0) {
                return iG;
            }
        }
        return AbstractC3340k.g(bArr.length, bArr2.length);
    }

    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f10005a;
        int length = bArr.length;
        byte[] bArr2 = this.f10005a;
        if (length != bArr2.length) {
            return false;
        }
        int i10 = aVar.f10006b;
        if (i10 == 0 || (i5 = this.f10006b) == 0 || i10 == i5) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f10006b;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = Arrays.hashCode(this.f10005a);
        this.f10006b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f10005a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb2 = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb2.append("ByteString(size=");
        sb2.append(strValueOf);
        sb2.append(" hex=");
        for (byte b5 : bArr) {
            char[] cArr = f10004d;
            sb2.append(cArr[(b5 >>> 4) & 15]);
            sb2.append(cArr[b5 & 15]);
        }
        sb2.append(')');
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] data, int i5, int i10) {
        this(m.k0(i5, i10, data));
        AbstractC3340k.e(data, "data");
    }
}

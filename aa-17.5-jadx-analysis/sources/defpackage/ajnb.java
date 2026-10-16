package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ajnb implements Serializable, Comparable {
    public static final ajnb a = new ajnb(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public ajnb(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        ajnb ajnbVar = new ajnb(bArr);
        Field declaredField = ajnb.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, ajnbVar.b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ajnb ajnbVar) {
        ajnbVar.getClass();
        int iC = c();
        int iC2 = ajnbVar.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = ajnbVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC >= iC2 ? 1 : -1;
    }

    public int c() {
        return this.b.length;
    }

    public final int d(ajnb ajnbVar, int i) {
        ajnbVar.getClass();
        return e(ajnbVar.b, i);
    }

    public int e(byte[] bArr, int i) {
        bArr.getClass();
        int length = this.b.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!ahfd.h(this.b, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnb) {
            ajnb ajnbVar = (ajnb) obj;
            int iC = ajnbVar.c();
            byte[] bArr = this.b;
            int length = bArr.length;
            return iC == length && ajnbVar.l(0, bArr, 0, length);
        }
        return false;
    }

    public final String f() {
        int length;
        int i;
        byte[] bArr = ajmr.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i6 == 2) {
            int i7 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i7];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return ahfp.b(bArr3);
    }

    public String g() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = ajoh.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public String h(Charset charset) {
        charset.getClass();
        return new String(this.b, charset);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public final String i() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strB = ahfp.b(n());
        this.d = strB;
        return strB;
    }

    public ajnb j(int i, int i2) {
        int iD = ahfd.d(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.b;
        int length = bArr.length;
        if (iD > length) {
            throw new IllegalArgumentException(a.bn(length, "endIndex > length(", ")"));
        }
        if (iD - i >= 0) {
            return (i == 0 && iD == length) ? this : new ajnb(woy.cG(bArr, i, iD));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public ajnb k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf.getClass();
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new ajnb(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ahfd.h(bArr2, i, bArr, i2, i3);
    }

    public final boolean m(ajnb ajnbVar) {
        ajnbVar.getClass();
        return p(0, ajnbVar, ajnbVar.c());
    }

    public byte[] n() {
        return this.b;
    }

    public byte[] o() {
        byte[] bArr = this.b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public boolean p(int i, ajnb ajnbVar, int i2) {
        ajnbVar.getClass();
        return ajnbVar.l(0, this.b, i, i2);
    }

    public void q(ajmy ajmyVar, int i) {
        char[] cArr = ajoh.a;
        ajmyVar.L(this.b, 0, i);
    }

    public final ajnb r() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(this.b, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ajnb(bArrDigest);
    }

    public final int s(ajnb ajnbVar) {
        ajnbVar.getClass();
        return t(ajnbVar.b);
    }

    public int t(byte[] bArr) {
        bArr.getClass();
        for (int iMin = Math.min(ahfd.d(this, -1234567890), this.b.length - bArr.length); iMin >= 0; iMin--) {
            if (ahfd.h(this.b, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
  0x0087: PHI (r4v9 int) = (r4v6 int), (r4v10 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
  0x008a: PHI (r4v7 int) = (r4v6 int), (r4v10 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnb.toString():java.lang.String");
    }
}

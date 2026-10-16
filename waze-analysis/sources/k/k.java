package k;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class k implements Serializable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final k f50843a = new k(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f50844b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f50845c;

    /* renamed from: d, reason: collision with root package name */
    private transient String f50846d;

    public k(byte[] bArr) {
        h.g.b.x.f(bArr, "data");
        this.f50844b = bArr;
    }

    public static final k j(byte... bArr) {
        h.g.b.x.f(bArr, "data");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        h.g.b.x.e(bArrCopyOf, "copyOf(...)");
        return new k(bArrCopyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i2 = objectInputStream.readInt();
        ObjectInputStream objectInputStream2 = objectInputStream;
        h.g.b.x.f(objectInputStream2, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i2);
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = objectInputStream2.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 += i4;
        }
        k kVar = new k(bArr);
        Field declaredField = k.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, kVar.f50844b);
    }

    public static /* synthetic */ int u(k kVar, k kVar2) {
        h.g.b.x.f(kVar2, "other");
        return kVar.z(kVar2.f50844b);
    }

    public static /* synthetic */ k w(k kVar, int i2, int i3, int i4) {
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = -1234567890;
        }
        return kVar.k(i2, i3);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f50844b.length);
        objectOutputStream.write(this.f50844b);
    }

    public byte a(int i2) {
        return this.f50844b[i2];
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        h.g.b.x.f(kVar, "other");
        int iD = d();
        int iD2 = kVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iA = a(i2) & 255;
            int iA2 = kVar.a(i2) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD >= iD2 ? 1 : -1;
    }

    public final int c() {
        return this.f50845c;
    }

    public int d() {
        return this.f50844b.length;
    }

    public final int e(k kVar, int i2) {
        h.g.b.x.f(kVar, "other");
        return f(kVar.f50844b, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            int iD = kVar.d();
            byte[] bArr = this.f50844b;
            int length = bArr.length;
            return iD == length && kVar.o(0, bArr, 0, length);
        }
        return false;
    }

    public int f(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "other");
        int length = this.f50844b.length - bArr.length;
        int iMax = Math.max(i2, 0);
        if (iMax > length) {
            return -1;
        }
        while (!okhttp3.internal.publicsuffix.a.h(this.f50844b, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public final String g() {
        return a.a(this.f50844b);
    }

    public String h() {
        byte[] bArr = this.f50844b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b2 : bArr) {
            cArr[i2] = k.a.b.a()[(b2 >> 4) & 15];
            cArr[i2 + 1] = k.a.b.a()[b2 & StylePropertiesKt.RightId];
            i2 += 2;
        }
        return h.n.o.i(cArr);
    }

    public int hashCode() {
        int i2 = this.f50845c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f50844b);
        this.f50845c = iHashCode;
        return iHashCode;
    }

    public final String i() {
        String str = this.f50846d;
        if (str != null) {
            return str;
        }
        String strA = aq.a(r());
        this.f50846d = strA;
        return strA;
    }

    public k k(int i2, int i3) {
        int iE = okhttp3.internal.publicsuffix.a.e(this, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f50844b;
        int length = bArr.length;
        if (iE <= length) {
            if (iE - i2 >= 0) {
                return (i2 == 0 && iE == length) ? this : new k(h.a.c.l(bArr, i2, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("endIndex > length(" + length + ")");
    }

    public k l() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f50844b;
            int length = bArr.length;
            if (i2 >= length) {
                return this;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                h.g.b.x.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i2] = (byte) (b2 + StylePropertiesKt.ZIndexId);
                while (i3 < bArrCopyOf.length) {
                    int i4 = i3 + 1;
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + StylePropertiesKt.ZIndexId);
                    }
                    i3 = i4;
                }
                return new k(bArrCopyOf);
            }
            i2 = i3;
        }
    }

    public final void m(int i2) {
        this.f50845c = i2;
    }

    public final void n(String str) {
        this.f50846d = str;
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        h.g.b.x.f(bArr, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.f50844b;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && okhttp3.internal.publicsuffix.a.h(bArr2, i2, bArr, i3, i4);
    }

    public final boolean p(k kVar) {
        h.g.b.x.f(kVar, "prefix");
        return v(0, kVar, kVar.d());
    }

    public final byte[] q() {
        return this.f50844b;
    }

    public byte[] r() {
        return this.f50844b;
    }

    public byte[] s() {
        byte[] bArr = this.f50844b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        h.g.b.x.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
  0x0087: PHI (r4v10 int) = (r4v7 int), (r4v11 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
  0x008a: PHI (r4v8 int) = (r4v7 int), (r4v11 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.k.toString():java.lang.String");
    }

    public boolean v(int i2, k kVar, int i3) {
        h.g.b.x.f(kVar, "other");
        return kVar.o(0, this.f50844b, i2, i3);
    }

    public void x(h hVar, int i2) {
        h.g.b.x.f(hVar, "buffer");
        int i3 = k.a.b.f50746a;
        h.g.b.x.f(this, "<this>");
        h.g.b.x.f(hVar, "buffer");
        hVar.aa(this.f50844b, 0, i2);
    }

    public final k y() throws NoSuchAlgorithmException {
        h.g.b.x.f("SHA-256", "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(this.f50844b, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        h.g.b.x.c(bArrDigest);
        return new k(bArrDigest);
    }

    public int z(byte[] bArr) {
        h.g.b.x.f(bArr, "other");
        for (int iMin = Math.min(okhttp3.internal.publicsuffix.a.e(this, -1234567890), this.f50844b.length - bArr.length); iMin >= 0; iMin--) {
            if (okhttp3.internal.publicsuffix.a.h(this.f50844b, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }
}

package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class akfs extends akcl {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final akfq i;

    private akfs(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, akfq akfqVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = akfqVar;
    }

    public static akfs n(DataInput dataInput, String str) throws IOException {
        int unsignedByte;
        int unsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int i2 = dataInput.readInt();
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        String[] strArr2 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = ahlg.a(dataInput);
            iArr[i3] = (int) ahlg.a(dataInput);
            iArr2[i3] = (int) ahlg.a(dataInput);
            if (unsignedShort < 256) {
                try {
                    unsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                unsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i3] = strArr[unsignedByte];
        }
        return new akfs(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new akfq(str, (int) ahlg.a(dataInput), akft.c(dataInput), akft.c(dataInput)) : null);
    }

    @Override // defpackage.akcl
    public final int a(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.f[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            akfq akfqVar = this.i;
            return akfqVar == null ? this.f[i - 1] : akfqVar.a(j);
        }
        if (i > 0) {
            return this.f[i - 1];
        }
        return 0;
    }

    @Override // defpackage.akcl
    public final int c(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.g[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            akfq akfqVar = this.i;
            return akfqVar == null ? this.g[i - 1] : akfqVar.e;
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.akcl
    public final long e(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        akfq akfqVar = this.i;
        if (akfqVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return akfqVar.e(j);
    }

    @Override // defpackage.akcl
    public final boolean equals(Object obj) {
        akfq akfqVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof akfs) {
            akfs akfsVar = (akfs) obj;
            if (this.c.equals(akfsVar.c) && Arrays.equals(this.e, akfsVar.e) && Arrays.equals(this.h, akfsVar.h) && Arrays.equals(this.f, akfsVar.f) && Arrays.equals(this.g, akfsVar.g) && ((akfqVar = this.i) != null ? akfqVar.equals(akfsVar.i) : akfsVar.i == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akcl
    public final long f(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return Long.MIN_VALUE;
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            akfq akfqVar = this.i;
            if (akfqVar != null) {
                long jF = akfqVar.f(j);
                if (jF < j) {
                    return jF;
                }
            }
            long j2 = jArr[i - 1];
            if (j2 > Long.MIN_VALUE) {
                return j2 - 1;
            }
        } else if (i > 0) {
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
        }
        return j;
    }

    @Override // defpackage.akcl
    public final String g(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.h[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        akfq akfqVar = this.i;
        return akfqVar == null ? this.h[i - 1] : akfqVar.g(j);
    }

    @Override // defpackage.akcl
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.akcl
    public final boolean k() {
        return false;
    }
}

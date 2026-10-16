package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgs extends defpackage.akdl {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final java.lang.String[] h;
    private final defpackage.akgq i;

    private akgs(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, java.lang.String[] strArr, defpackage.akgq akgqVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = akgqVar;
    }

    public static defpackage.akgs n(java.io.DataInput dataInput, java.lang.String str) throws java.io.IOException {
        int unsignedByte;
        int unsignedShort = dataInput.readUnsignedShort();
        java.lang.String[] strArr = new java.lang.String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int i2 = dataInput.readInt();
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        java.lang.String[] strArr2 = new java.lang.String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = defpackage.agxp.a(dataInput);
            iArr[i3] = (int) defpackage.agxp.a(dataInput);
            iArr2[i3] = (int) defpackage.agxp.a(dataInput);
            if (unsignedShort < 256) {
                try {
                    unsignedByte = dataInput.readUnsignedByte();
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    throw new java.io.IOException("Invalid encoding");
                }
            } else {
                unsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i3] = strArr[unsignedByte];
        }
        return new defpackage.akgs(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new defpackage.akgq(str, (int) defpackage.agxp.a(dataInput), defpackage.akgt.c(dataInput), defpackage.akgt.c(dataInput)) : null);
    }

    @Override // defpackage.akdl
    public final int a(long j) {
        long[] jArr = this.e;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.f[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            defpackage.akgq akgqVar = this.i;
            return akgqVar == null ? this.f[i - 1] : akgqVar.a(j);
        }
        if (i > 0) {
            return this.f[i - 1];
        }
        return 0;
    }

    @Override // defpackage.akdl
    public final int c(long j) {
        long[] jArr = this.e;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.g[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            defpackage.akgq akgqVar = this.i;
            return akgqVar == null ? this.g[i - 1] : akgqVar.e;
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.akdl
    public final long e(long j) {
        long[] jArr = this.e;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        defpackage.akgq akgqVar = this.i;
        if (akgqVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return akgqVar.e(j);
    }

    @Override // defpackage.akdl
    public final boolean equals(java.lang.Object obj) {
        defpackage.akgq akgqVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgs) {
            defpackage.akgs akgsVar = (defpackage.akgs) obj;
            if (this.c.equals(akgsVar.c) && java.util.Arrays.equals(this.e, akgsVar.e) && java.util.Arrays.equals(this.h, akgsVar.h) && java.util.Arrays.equals(this.f, akgsVar.f) && java.util.Arrays.equals(this.g, akgsVar.g) && ((akgqVar = this.i) != null ? akgqVar.equals(akgsVar.i) : akgsVar.i == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akdl
    public final long f(long j) {
        long[] jArr = this.e;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return Long.MIN_VALUE;
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            defpackage.akgq akgqVar = this.i;
            if (akgqVar != null) {
                long jF = akgqVar.f(j);
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

    @Override // defpackage.akdl
    public final java.lang.String g(long j) {
        long[] jArr = this.e;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.h[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        defpackage.akgq akgqVar = this.i;
        return akgqVar == null ? this.h[i - 1] : akgqVar.g(j);
    }

    @Override // defpackage.akdl
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.akdl
    public final boolean k() {
        return false;
    }
}

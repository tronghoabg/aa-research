package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ahlv {
    public static final defpackage.ahlu Companion = new defpackage.ahlu(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final java.util.List<java.lang.Integer> rest;

    public ahlv(int... iArr) {
        java.util.List<java.lang.Integer> listAZ;
        iArr.getClass();
        this.numbers = iArr;
        java.lang.Integer numBL = defpackage.afga.bL(iArr, 0);
        this.major = numBL != null ? numBL.intValue() : -1;
        java.lang.Integer numBL2 = defpackage.afga.bL(iArr, 1);
        this.minor = numBL2 != null ? numBL2.intValue() : -1;
        java.lang.Integer numBL3 = defpackage.afga.bL(iArr, 2);
        this.patch = numBL3 != null ? numBL3.intValue() : -1;
        int length = iArr.length;
        if (length <= 3) {
            listAZ = defpackage.afce.a;
        } else {
            if (length > 1024) {
                throw new java.lang.IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            iArr.getClass();
            listAZ = defpackage.afga.aZ(new defpackage.afbq(new defpackage.afca(iArr), 3, length));
        }
        this.rest = listAZ;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !defpackage.afga.f(getClass(), obj.getClass())) {
            return false;
        }
        defpackage.ahlv ahlvVar = (defpackage.ahlv) obj;
        return this.major == ahlvVar.major && this.minor == ahlvVar.minor && this.patch == ahlvVar.patch && defpackage.afga.f(this.rest, ahlvVar.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        java.util.List<java.lang.Integer> list = this.rest;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + list.hashCode();
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.patch <= i3;
    }

    protected final boolean isCompatibleTo(defpackage.ahlv ahlvVar) {
        ahlvVar.getClass();
        int i = this.major;
        if (i == 0) {
            return ahlvVar.major == 0 && this.minor == ahlvVar.minor;
        }
        return i == ahlvVar.major && this.minor <= ahlvVar.minor;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public java.lang.String toString() {
        int[] array = toArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : defpackage.afga.bo(arrayList, ".", null, null, null, 62);
    }

    public final boolean isAtLeast(defpackage.ahlv ahlvVar) {
        ahlvVar.getClass();
        return isAtLeast(ahlvVar.major, ahlvVar.minor, ahlvVar.patch);
    }
}

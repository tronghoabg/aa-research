package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agro implements java.lang.Comparable<defpackage.agro> {
    private final int major;
    private final int minor;
    private final int patch;
    public static final defpackage.agrn Companion = new defpackage.agrn(null);
    public static final defpackage.agro LATEST_STABLE_SUPPORTED = new defpackage.agro(defpackage.ahmc.INSTANCE.toArray());
    public static final defpackage.agro HIGHEST_ALLOWED_TO_WRITE = new defpackage.agro(defpackage.ahmc.INSTANCE_NEXT.toArray());

    public agro(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Major version should be not less than 0");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(defpackage.agro agroVar) {
        agroVar.getClass();
        int iB = defpackage.afga.b(this.major, agroVar.major);
        if (iB != 0) {
            return iB;
        }
        int iB2 = defpackage.afga.b(this.minor, agroVar.minor);
        return iB2 != 0 ? iB2 : defpackage.afga.b(this.patch, agroVar.patch);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.agro agroVar = (defpackage.agro) obj;
        return this.major == agroVar.major && this.minor == agroVar.minor && this.patch == agroVar.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agro(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}

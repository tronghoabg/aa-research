package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agps {
    private final int major;
    private final int minor;
    private final int patch;

    public agps(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.agps)) {
            return false;
        }
        defpackage.agps agpsVar = (defpackage.agps) obj;
        return this.major == agpsVar.major && this.minor == agpsVar.minor && this.patch == agpsVar.patch;
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
}

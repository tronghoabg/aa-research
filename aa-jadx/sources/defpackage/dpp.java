package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dpp implements java.lang.Cloneable {
    private final char[] a;
    protected defpackage.dpo d;
    private int f;
    protected long b = -1;
    protected long c = Long.MAX_VALUE;
    int e = 0;

    public dpp(char[] cArr) {
        this.a = cArr;
    }

    public final boolean A() {
        char[] cArr = this.a;
        return cArr != null && cArr.length > 0;
    }

    public final void B() {
        this.b = 0L;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dpp)) {
            return false;
        }
        defpackage.dpp dppVar = (defpackage.dpp) obj;
        if (this.b != dppVar.b || this.c != dppVar.c) {
            return false;
        }
        int i = dppVar.f;
        if (java.util.Arrays.equals(this.a, dppVar.a)) {
            return j$.util.Objects.equals(this.d, dppVar.d);
        }
        return false;
    }

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public defpackage.dpp clone() {
        try {
            return (defpackage.dpp) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public int hashCode() {
        int iHashCode = java.util.Arrays.hashCode(this.a) * 31;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        defpackage.dpo dpoVar = this.d;
        return (((((iHashCode + ((int) j2)) * 31) + ((int) j4)) * 31) + (dpoVar != null ? dpoVar.hashCode() : 0)) * 31;
    }

    public java.lang.String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return java.lang.String.valueOf(getClass()) + " (INVALID, " + this.b + "-" + this.c + ")";
        }
        int i = (int) ((j2 - j) + 1);
        if (i > 1000) {
            i = 1000;
        }
        java.lang.String str = new java.lang.String(this.a, (int) j, i);
        return y() + " (" + this.b + " : " + this.c + ") <<" + str + ">>";
    }

    public float v() {
        if (this instanceof defpackage.dpr) {
            return ((defpackage.dpr) this).v();
        }
        return Float.NaN;
    }

    public int w() {
        if (this instanceof defpackage.dpr) {
            return ((defpackage.dpr) this).w();
        }
        return 0;
    }

    public final java.lang.String x() {
        char[] cArr = this.a;
        if (cArr == null || cArr.length == 0 || this.b == -1) {
            return "";
        }
        long j = this.c;
        if (j == Long.MAX_VALUE || j < 0) {
            return new java.lang.String(cArr, 0, 1);
        }
        int i = (int) (j + 1);
        if (i > 1000) {
            i = 1000;
        }
        return new java.lang.String(cArr, 0, i);
    }

    public final java.lang.String y() {
        java.lang.String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void z(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        defpackage.dpo dpoVar = this.d;
        if (dpoVar != null) {
            dpoVar.q(this);
        }
    }
}

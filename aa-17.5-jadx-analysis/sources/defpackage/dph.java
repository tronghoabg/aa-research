package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class dph implements Cloneable {
    private final char[] a;
    protected dpg d;
    private int f;
    protected long b = -1;
    protected long c = Long.MAX_VALUE;
    int e = 0;

    public dph(char[] cArr) {
        this.a = cArr;
    }

    public final boolean A() {
        char[] cArr = this.a;
        return cArr != null && cArr.length > 0;
    }

    public final void B() {
        this.b = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dph)) {
            return false;
        }
        dph dphVar = (dph) obj;
        if (this.b != dphVar.b || this.c != dphVar.c) {
            return false;
        }
        int i = dphVar.f;
        if (Arrays.equals(this.a, dphVar.a)) {
            return Objects.equals(this.d, dphVar.d);
        }
        return false;
    }

    @Override // 
    public dph g() {
        try {
            return (dph) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        dpg dpgVar = this.d;
        return (((((iHashCode + ((int) j2)) * 31) + ((int) j4)) * 31) + (dpgVar != null ? dpgVar.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return String.valueOf(getClass()) + " (INVALID, " + this.b + "-" + this.c + ")";
        }
        int i = (int) ((j2 - j) + 1);
        if (i > 1000) {
            i = 1000;
        }
        String str = new String(this.a, (int) j, i);
        return y() + " (" + this.b + " : " + this.c + ") <<" + str + ">>";
    }

    public float v() {
        if (this instanceof dpj) {
            return ((dpj) this).v();
        }
        return Float.NaN;
    }

    public int w() {
        if (this instanceof dpj) {
            return ((dpj) this).w();
        }
        return 0;
    }

    public final String x() {
        char[] cArr = this.a;
        if (cArr == null || cArr.length == 0 || this.b == -1) {
            return "";
        }
        long j = this.c;
        if (j == Long.MAX_VALUE || j < 0) {
            return new String(cArr, 0, 1);
        }
        int i = (int) (j + 1);
        if (i > 1000) {
            i = 1000;
        }
        return new String(cArr, 0, i);
    }

    public final String y() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void z(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        dpg dpgVar = this.d;
        if (dpgVar != null) {
            dpgVar.q(this);
        }
    }
}

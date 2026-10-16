package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class akec extends defpackage.akdy {
    public static final defpackage.akdf A;
    public static final defpackage.akdf B;
    public static final defpackage.akdf C;
    public static final defpackage.akdf D;
    public static final defpackage.akdf E;
    public static final defpackage.akdf F;
    public static final defpackage.akdm o;
    public static final defpackage.akdm p;
    public static final defpackage.akdm q;
    public static final defpackage.akdm r;
    public static final defpackage.akdm s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final defpackage.akdm t;
    public static final defpackage.akdm u;
    public static final defpackage.akdf v;
    public static final defpackage.akdf w;
    public static final defpackage.akdf x;
    public static final defpackage.akdf y;
    public static final defpackage.akdf z;
    public final int G;
    private final transient defpackage.akeb[] H;

    static {
        defpackage.akdm akdmVar = defpackage.akfe.a;
        o = akdmVar;
        defpackage.akfi akfiVar = new defpackage.akfi(defpackage.akdo.k, 1000L);
        p = akfiVar;
        defpackage.akfi akfiVar2 = new defpackage.akfi(defpackage.akdo.j, 60000L);
        q = akfiVar2;
        defpackage.akfi akfiVar3 = new defpackage.akfi(defpackage.akdo.i, 3600000L);
        r = akfiVar3;
        defpackage.akfi akfiVar4 = new defpackage.akfi(defpackage.akdo.h, 43200000L);
        s = akfiVar4;
        defpackage.akfi akfiVar5 = new defpackage.akfi(defpackage.akdo.g, 86400000L);
        t = akfiVar5;
        u = new defpackage.akfi(defpackage.akdo.f, 604800000L);
        v = new defpackage.akfg(defpackage.akdh.x, akdmVar, akfiVar);
        w = new defpackage.akfg(defpackage.akdh.w, akdmVar, akfiVar5);
        x = new defpackage.akfg(defpackage.akdh.v, akfiVar, akfiVar2);
        y = new defpackage.akfg(defpackage.akdh.u, akfiVar, akfiVar5);
        z = new defpackage.akfg(defpackage.akdh.t, akfiVar2, akfiVar3);
        A = new defpackage.akfg(defpackage.akdh.s, akfiVar2, akfiVar5);
        defpackage.akfg akfgVar = new defpackage.akfg(defpackage.akdh.r, akfiVar3, akfiVar5);
        B = akfgVar;
        defpackage.akfg akfgVar2 = new defpackage.akfg(defpackage.akdh.o, akfiVar3, akfiVar4);
        C = akfgVar2;
        D = new defpackage.akfn(akfgVar, defpackage.akdh.q);
        E = new defpackage.akfn(akfgVar2, defpackage.akdh.p);
        F = new defpackage.akea();
    }

    public akec(defpackage.akdd akddVar, int i) {
        super(akddVar, null);
        this.H = new defpackage.akeb[1024];
        this.G = i;
    }

    @Override // defpackage.akdy
    protected void M(defpackage.akdx akdxVar) {
        throw null;
    }

    final int N(long j, int i, int i2) {
        return ((int) ((j - (ac(i) + ab(i, i2))) / 86400000)) + 1;
    }

    final int O(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    final int P(long j, int i) {
        return ((int) ((j - ac(i)) / 86400000)) + 1;
    }

    final int Q(long j) {
        int iY = Y(j);
        return R(iY, T(j, iY));
    }

    public abstract int R(int i, int i2);

    final int S(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int T(long j, int i);

    final int U(long j) {
        return V(j, Y(j));
    }

    final int V(long j, int i) {
        long jAa = aa(i);
        if (j < jAa) {
            return W(i - 1);
        }
        if (j >= aa(i + 1)) {
            return 1;
        }
        return ((int) ((j - jAa) / 604800000)) + 1;
    }

    final int W(int i) {
        return (int) ((aa(i + 1) - aa(i)) / 604800000);
    }

    final int X(long j) {
        int iY = Y(j);
        int iV = V(j, iY);
        if (iV == 1) {
            return Y(j + 604800000);
        }
        return iV > 51 ? Y(j - 1209600000) : iY;
    }

    final int Y(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long jAc = ac(i);
        long j4 = j - jAc;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return jAc + (true == ag(i) ? 31622400000L : 31536000000L) > j ? i : i + 1;
        }
        return i;
    }

    public abstract long Z(int i);

    final long aa(int i) {
        long jAc = ac(i);
        int iO = O(jAc);
        return iO > 8 - this.G ? jAc + (((long) (8 - iO)) * 86400000) : jAc - (((long) (iO - 1)) * 86400000);
    }

    public abstract long ab(int i, int i2);

    final long ac(int i) {
        defpackage.akeb[] akebVarArr = this.H;
        int i2 = i & 1023;
        defpackage.akeb akebVar = akebVarArr[i2];
        if (akebVar == null || akebVar.a != i) {
            defpackage.akeb akebVar2 = new defpackage.akeb(i, Z(i));
            akebVarArr[i2] = akebVar2;
            akebVar = akebVar2;
        }
        return akebVar.b;
    }

    final long ad(int i, int i2, int i3) {
        return ac(i) + ab(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    public abstract long ae(long j, int i);

    public boolean af(long j) {
        throw null;
    }

    public abstract boolean ag(int i);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.akec akecVar = (defpackage.akec) obj;
            if (this.G == akecVar.G && z().equals(akecVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(60);
        java.lang.String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        defpackage.akdl akdlVarZ = z();
        if (akdlVarZ != null) {
            sb.append(akdlVarZ.c);
        }
        int i = this.G;
        if (i != 4) {
            sb.append(",mdfw=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.akdy, defpackage.akdd
    public final defpackage.akdl z() {
        defpackage.akdd akddVar = this.a;
        return akddVar != null ? akddVar.z() : defpackage.akdl.a;
    }
}

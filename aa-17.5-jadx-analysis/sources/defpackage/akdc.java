package defpackage;

/* loaded from: classes2.dex */
abstract class akdc extends akcy {
    public static final akcf A;
    public static final akcf B;
    public static final akcf C;
    public static final akcf D;
    public static final akcf E;
    public static final akcf F;
    public static final akcm o;
    public static final akcm p;
    public static final akcm q;
    public static final akcm r;
    public static final akcm s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final akcm t;
    public static final akcm u;
    public static final akcf v;
    public static final akcf w;
    public static final akcf x;
    public static final akcf y;
    public static final akcf z;
    public final int G;
    private final transient akdb[] H;

    static {
        akcm akcmVar = akee.a;
        o = akcmVar;
        akei akeiVar = new akei(akco.k, 1000L);
        p = akeiVar;
        akei akeiVar2 = new akei(akco.j, 60000L);
        q = akeiVar2;
        akei akeiVar3 = new akei(akco.i, 3600000L);
        r = akeiVar3;
        akei akeiVar4 = new akei(akco.h, 43200000L);
        s = akeiVar4;
        akei akeiVar5 = new akei(akco.g, 86400000L);
        t = akeiVar5;
        u = new akei(akco.f, 604800000L);
        v = new akeg(akch.x, akcmVar, akeiVar);
        w = new akeg(akch.w, akcmVar, akeiVar5);
        x = new akeg(akch.v, akeiVar, akeiVar2);
        y = new akeg(akch.u, akeiVar, akeiVar5);
        z = new akeg(akch.t, akeiVar2, akeiVar3);
        A = new akeg(akch.s, akeiVar2, akeiVar5);
        akeg akegVar = new akeg(akch.r, akeiVar3, akeiVar5);
        B = akegVar;
        akeg akegVar2 = new akeg(akch.o, akeiVar3, akeiVar4);
        C = akegVar2;
        D = new aken(akegVar, akch.q);
        E = new aken(akegVar2, akch.p);
        F = new akda();
    }

    public akdc(akcd akcdVar, int i) {
        super(akcdVar, null);
        this.H = new akdb[1024];
        this.G = i;
    }

    @Override // defpackage.akcy
    protected void M(akcx akcxVar) {
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
        return iV == 1 ? Y(j + 604800000) : iV > 51 ? Y(j - 1209600000) : iY;
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
        return O(jAc) > 8 - this.G ? jAc + ((8 - r5) * 86400000) : jAc - ((r5 - 1) * 86400000);
    }

    public abstract long ab(int i, int i2);

    final long ac(int i) {
        akdb[] akdbVarArr = this.H;
        int i2 = i & 1023;
        akdb akdbVar = akdbVarArr[i2];
        if (akdbVar == null || akdbVar.a != i) {
            akdb akdbVar2 = new akdb(i, Z(i));
            akdbVarArr[i2] = akdbVar2;
            akdbVar = akdbVar2;
        }
        return akdbVar.b;
    }

    final long ad(int i, int i2, int i3) {
        return ac(i) + ab(i, i2) + ((i3 - 1) * 86400000);
    }

    public abstract long ae(long j, int i);

    public boolean af(long j) {
        throw null;
    }

    public abstract boolean ag(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            akdc akdcVar = (akdc) obj;
            if (this.G == akdcVar.G && z().equals(akdcVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        akcl akclVarZ = z();
        if (akclVarZ != null) {
            sb.append(akclVarZ.c);
        }
        int i = this.G;
        if (i != 4) {
            sb.append(",mdfw=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.akcy, defpackage.akcd
    public final akcl z() {
        akcd akcdVar = this.a;
        return akcdVar != null ? akcdVar.z() : akcl.a;
    }
}

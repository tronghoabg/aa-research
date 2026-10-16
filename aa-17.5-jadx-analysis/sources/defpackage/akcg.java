package defpackage;

/* loaded from: classes2.dex */
public final class akcg extends akch {
    private static final long serialVersionUID = -9937958251642L;
    public final transient akco a;
    private final byte z;

    public akcg(String str, byte b, akco akcoVar) {
        super(str);
        this.z = b;
        this.a = akcoVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return akch.b;
            case 2:
                return akch.c;
            case 3:
                return akch.d;
            case 4:
                return akch.e;
            case 5:
                return akch.f;
            case 6:
                return akch.g;
            case 7:
                return akch.h;
            case 8:
                return akch.i;
            case 9:
                return akch.j;
            case 10:
                return akch.k;
            case 11:
                return akch.l;
            case 12:
                return akch.m;
            case 13:
                return akch.n;
            case 14:
                return akch.o;
            case 15:
                return akch.p;
            case 16:
                return akch.q;
            case 17:
                return akch.r;
            case 18:
                return akch.s;
            case 19:
                return akch.t;
            case 20:
                return akch.u;
            case 21:
                return akch.v;
            case 22:
                return akch.w;
            default:
                return akch.x;
        }
    }

    @Override // defpackage.akch
    public final akcf a(akcd akcdVar) {
        byte b = this.z;
        akcd akcdVarB = akci.b(akcdVar);
        switch (b) {
            case 1:
                return akcdVarB.i();
            case 2:
                return akcdVarB.y();
            case 3:
                return akcdVarB.c();
            case 4:
                return akcdVarB.x();
            case 5:
                return akcdVarB.w();
            case 6:
                return akcdVarB.h();
            case 7:
                return akcdVarB.q();
            case 8:
                return akcdVarB.f();
            case 9:
                return akcdVarB.v();
            case 10:
                return akcdVarB.u();
            case 11:
                return akcdVarB.t();
            case 12:
                return akcdVarB.g();
            case 13:
                return akcdVarB.j();
            case 14:
                return akcdVarB.l();
            case 15:
                return akcdVarB.e();
            case 16:
                return akcdVarB.d();
            case 17:
                return akcdVarB.k();
            case 18:
                return akcdVarB.o();
            case 19:
                return akcdVarB.p();
            case 20:
                return akcdVarB.r();
            case 21:
                return akcdVarB.s();
            case 22:
                return akcdVarB.m();
            default:
                return akcdVarB.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akcg) && this.z == ((akcg) obj).z;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}

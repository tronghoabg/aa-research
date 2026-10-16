package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akdg extends defpackage.akdh {
    private static final long serialVersionUID = -9937958251642L;
    public final transient defpackage.akdo a;
    private final byte z;

    public akdg(java.lang.String str, byte b, defpackage.akdo akdoVar) {
        super(str);
        this.z = b;
        this.a = akdoVar;
    }

    private java.lang.Object readResolve() {
        switch (this.z) {
            case 1:
                return defpackage.akdh.b;
            case 2:
                return defpackage.akdh.c;
            case 3:
                return defpackage.akdh.d;
            case 4:
                return defpackage.akdh.e;
            case 5:
                return defpackage.akdh.f;
            case 6:
                return defpackage.akdh.g;
            case 7:
                return defpackage.akdh.h;
            case 8:
                return defpackage.akdh.i;
            case 9:
                return defpackage.akdh.j;
            case 10:
                return defpackage.akdh.k;
            case 11:
                return defpackage.akdh.l;
            case 12:
                return defpackage.akdh.m;
            case 13:
                return defpackage.akdh.n;
            case 14:
                return defpackage.akdh.o;
            case 15:
                return defpackage.akdh.p;
            case 16:
                return defpackage.akdh.q;
            case 17:
                return defpackage.akdh.r;
            case 18:
                return defpackage.akdh.s;
            case 19:
                return defpackage.akdh.t;
            case 20:
                return defpackage.akdh.u;
            case 21:
                return defpackage.akdh.v;
            case 22:
                return defpackage.akdh.w;
            default:
                return defpackage.akdh.x;
        }
    }

    @Override // defpackage.akdh
    public final defpackage.akdf a(defpackage.akdd akddVar) {
        byte b = this.z;
        defpackage.akdd akddVarB = defpackage.akdi.b(akddVar);
        switch (b) {
            case 1:
                return akddVarB.i();
            case 2:
                return akddVarB.y();
            case 3:
                return akddVarB.c();
            case 4:
                return akddVarB.x();
            case 5:
                return akddVarB.w();
            case 6:
                return akddVarB.h();
            case 7:
                return akddVarB.q();
            case 8:
                return akddVarB.f();
            case 9:
                return akddVarB.v();
            case 10:
                return akddVarB.u();
            case 11:
                return akddVarB.t();
            case 12:
                return akddVarB.g();
            case 13:
                return akddVarB.j();
            case 14:
                return akddVarB.l();
            case 15:
                return akddVarB.e();
            case 16:
                return akddVarB.d();
            case 17:
                return akddVarB.k();
            case 18:
                return akddVarB.o();
            case 19:
                return akddVarB.p();
            case 20:
                return akddVarB.r();
            case 21:
                return akddVarB.s();
            case 22:
                return akddVarB.m();
            default:
                return akddVarB.n();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.akdg) && this.z == ((defpackage.akdg) obj).z;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}

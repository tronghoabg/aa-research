package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class abmx {
    public final abmw a;
    public int b;
    public int c = 0;
    private int d;

    public abmx(abmw abmwVar) {
        this.a = abmwVar;
        abmwVar.k = this;
    }

    private final void P(Object obj, abpl abplVar, abnj abnjVar) throws IOException {
        abmw abmwVar = this.a;
        abmwVar.K();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        abmwVar.h++;
        try {
            abplVar.i(obj, this, abnjVar);
            if (this.b == this.d) {
            } else {
                throw new abon("Failed to parse the message.");
            }
        } finally {
            abmw abmwVar2 = this.a;
            abmwVar2.h--;
            this.d = i;
        }
    }

    private final void Q(Object obj, abpl abplVar, abnj abnjVar) throws IOException {
        abmw abmwVar = this.a;
        int iK = abmwVar.k();
        abmwVar.K();
        int iF = abmwVar.f(iK);
        abmwVar.g++;
        abplVar.i(obj, this, abnjVar);
        abmwVar.C(0);
        abmwVar.g--;
        if (abmwVar.d() != 0) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        abmwVar.D(iF);
    }

    private final void R(int i) throws IOException {
        if (this.a.e() != i) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void S(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new abon("Failed to parse the message.");
        }
    }

    private static final void T(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new abon("Failed to parse the message.");
        }
    }

    public final void A(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i == 2) {
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                S(iR);
                int iE = abmwVar.e() + iR;
                do {
                    abnwVar.g(abmwVar.h());
                } while (abmwVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.h());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                S(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Integer.valueOf(abmwVar3.h()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.h()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void B(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abor) {
            abor aborVar = (abor) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                T(iR);
                int iE = abmwVar.e() + iR;
                do {
                    aborVar.f(abmwVar.s());
                } while (abmwVar.e() < iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                aborVar.f(abmwVar2.s());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                T(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Long.valueOf(abmwVar3.s()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Long.valueOf(abmwVar4.s()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void C(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnn) {
            abnn abnnVar = (abnn) list;
            int i = this.b & 7;
            if (i == 2) {
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                S(iR);
                int iE = abmwVar.e() + iR;
                do {
                    abnnVar.g(abmwVar.c());
                } while (abmwVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar2 = this.a;
                abnnVar.g(abmwVar2.c());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                S(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Float.valueOf(abmwVar3.c()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Float.valueOf(abmwVar4.c()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void D(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    abnwVar.g(abmwVar.i());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.i());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Integer.valueOf(abmwVar3.i()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.i()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void E(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abor) {
            abor aborVar = (abor) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    aborVar.f(abmwVar.t());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                aborVar.f(abmwVar2.t());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Long.valueOf(abmwVar3.t()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Long.valueOf(abmwVar4.t()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void F(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i == 2) {
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                S(iR);
                int iE = abmwVar.e() + iR;
                do {
                    abnwVar.g(abmwVar.o());
                } while (abmwVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.o());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                S(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Integer.valueOf(abmwVar3.o()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new abom();
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.o()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void G(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abor) {
            abor aborVar = (abor) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                T(iR);
                int iE = abmwVar.e() + iR;
                do {
                    aborVar.f(abmwVar.w());
                } while (abmwVar.e() < iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                aborVar.f(abmwVar2.w());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                T(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Long.valueOf(abmwVar3.w()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Long.valueOf(abmwVar4.w()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void H(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    abnwVar.g(abmwVar.p());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.p());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Integer.valueOf(abmwVar3.p()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.p()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void I(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abor) {
            abor aborVar = (abor) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    aborVar.f(abmwVar.x());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                aborVar.f(abmwVar2.x());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Long.valueOf(abmwVar3.x()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Long.valueOf(abmwVar4.x()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void J(List list, boolean z) throws IOException {
        int iQ;
        int iQ2;
        if ((this.b & 7) != 2) {
            throw new abom();
        }
        if ((list instanceof aboq) && !z) {
            aboq aboqVar = (aboq) list;
            do {
                o();
                aboqVar.b();
                abmw abmwVar = this.a;
                if (abmwVar.F()) {
                    return;
                } else {
                    iQ2 = abmwVar.q();
                }
            } while (iQ2 == this.b);
        } else {
            do {
                list.add(z ? u() : t());
                abmw abmwVar2 = this.a;
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ = abmwVar2.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void K(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    abnwVar.g(abmwVar.r());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.r());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Integer.valueOf(abmwVar3.r()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.r()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void L(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abor) {
            abor aborVar = (abor) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    aborVar.f(abmwVar.y());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                aborVar.f(abmwVar2.y());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Long.valueOf(abmwVar3.y()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Long.valueOf(abmwVar4.y()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void M(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw new abom();
        }
    }

    public final boolean N() throws IOException {
        M(0);
        return this.a.G();
    }

    public final boolean O() throws IOException {
        int i;
        abmw abmwVar = this.a;
        if (abmwVar.F() || (i = this.b) == this.d) {
            return false;
        }
        return abmwVar.H(i);
    }

    public final double a() throws IOException {
        M(1);
        return this.a.b();
    }

    public final float b() throws IOException {
        M(5);
        return this.a.c();
    }

    public final int c() throws IOException {
        int iQ = this.c;
        if (iQ != 0) {
            this.b = iQ;
            this.c = 0;
        } else {
            iQ = this.a.q();
            this.b = iQ;
        }
        return (iQ == 0 || iQ == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : iQ >>> 3;
    }

    public final int d() throws IOException {
        M(0);
        return this.a.g();
    }

    public final int e() throws IOException {
        M(5);
        return this.a.h();
    }

    public final int f() throws IOException {
        M(0);
        return this.a.i();
    }

    public final int g() throws IOException {
        M(5);
        return this.a.o();
    }

    public final int h() throws IOException {
        M(0);
        return this.a.p();
    }

    public final int i() throws IOException {
        M(0);
        return this.a.r();
    }

    public final long j() throws IOException {
        M(1);
        return this.a.s();
    }

    public final long k() throws IOException {
        M(0);
        return this.a.t();
    }

    public final long l() throws IOException {
        M(1);
        return this.a.w();
    }

    public final long m() throws IOException {
        M(0);
        return this.a.x();
    }

    public final long n() throws IOException {
        M(0);
        return this.a.y();
    }

    public final abms o() throws IOException {
        M(2);
        return this.a.z();
    }

    public final Object p(abqd abqdVar, Class cls, abnj abnjVar) throws IOException {
        abqd abqdVar2 = abqd.DOUBLE;
        switch (abqdVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(N());
            case STRING:
                return u();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return s(cls, abnjVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object q(abpl abplVar, abnj abnjVar) throws IOException {
        Object objE = abplVar.e();
        P(objE, abplVar, abnjVar);
        abplVar.g(objE);
        return objE;
    }

    public final Object r(abpl abplVar, abnj abnjVar) throws IOException {
        Object objE = abplVar.e();
        Q(objE, abplVar, abnjVar);
        abplVar.g(objE);
        return objE;
    }

    public final Object s(Class cls, abnj abnjVar) throws IOException {
        M(2);
        return r(abpe.a.b(cls), abnjVar);
    }

    public final String t() throws IOException {
        M(2);
        return this.a.A();
    }

    public final String u() throws IOException {
        M(2);
        return this.a.B();
    }

    public final void v(Object obj, abpl abplVar, abnj abnjVar) throws IOException {
        M(3);
        P(obj, abplVar, abnjVar);
    }

    public final void w(Object obj, abpl abplVar, abnj abnjVar) throws IOException {
        M(2);
        Q(obj, abplVar, abnjVar);
    }

    public final void x(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abmj) {
            abmj abmjVar = (abmj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    abmjVar.e(abmwVar.G());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abmjVar.e(abmwVar2.G());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Boolean.valueOf(abmwVar3.G()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Boolean.valueOf(abmwVar4.G()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void y(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abne) {
            abne abneVar = (abne) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iR = abmwVar.r();
                T(iR);
                int iE = abmwVar.e() + iR;
                do {
                    abneVar.g(abmwVar.b());
                } while (abmwVar.e() < iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abneVar.g(abmwVar2.b());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iR2 = abmwVar3.r();
                T(iR2);
                int iE2 = abmwVar3.e() + iR2;
                do {
                    list.add(Double.valueOf(abmwVar3.b()));
                } while (abmwVar3.e() < iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Double.valueOf(abmwVar4.b()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }

    public final void z(List list) throws IOException {
        int iQ;
        int iQ2;
        if (list instanceof abnw) {
            abnw abnwVar = (abnw) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abom();
                }
                abmw abmwVar = this.a;
                int iE = abmwVar.e() + abmwVar.r();
                do {
                    abnwVar.g(abmwVar.g());
                } while (abmwVar.e() < iE);
                R(iE);
                return;
            }
            do {
                abmw abmwVar2 = this.a;
                abnwVar.g(abmwVar2.g());
                if (abmwVar2.F()) {
                    return;
                } else {
                    iQ2 = abmwVar2.q();
                }
            } while (iQ2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abom();
                }
                abmw abmwVar3 = this.a;
                int iE2 = abmwVar3.e() + abmwVar3.r();
                do {
                    list.add(Integer.valueOf(abmwVar3.g()));
                } while (abmwVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                abmw abmwVar4 = this.a;
                list.add(Integer.valueOf(abmwVar4.g()));
                if (abmwVar4.F()) {
                    return;
                } else {
                    iQ = abmwVar4.q();
                }
            } while (iQ == this.b);
            iQ2 = iQ;
        }
        this.c = iQ2;
    }
}

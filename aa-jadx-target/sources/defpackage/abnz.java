package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abnz {
    public final defpackage.abny a;
    public int b;
    public int c = 0;
    private int d;

    public abnz(defpackage.abny abnyVar) {
        this.a = abnyVar;
        abnyVar.k = this;
    }

    private final void P(java.lang.Object obj, defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        defpackage.abny abnyVar = this.a;
        abnyVar.I();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        abnyVar.h++;
        try {
            abqnVar.i(obj, this, abolVar);
            if (this.b != this.d) {
                throw new defpackage.abpp("Failed to parse the message.");
            }
            this.a.h--;
            this.d = i;
        } catch (java.lang.Throwable th) {
            this.a.h--;
            this.d = i;
            throw th;
        }
    }

    private final void Q(java.lang.Object obj, defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        defpackage.abny abnyVar = this.a;
        int iK = abnyVar.k();
        abnyVar.I();
        int iF = abnyVar.f(iK);
        abnyVar.g++;
        abqnVar.i(obj, this, abolVar);
        abnyVar.z(0);
        abnyVar.g--;
        if (abnyVar.d() != 0) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        abnyVar.A(iF);
    }

    private final void R(int i) throws java.io.IOException {
        if (this.a.e() != i) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void S(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw new defpackage.abpp("Failed to parse the message.");
        }
    }

    private static final void T(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw new defpackage.abpp("Failed to parse the message.");
        }
    }

    public final void A(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                S(iO);
                int iE = abnyVar.e() + iO;
                do {
                    aboyVar.g(abnyVar.h());
                } while (abnyVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.h());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                S(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.h()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.h()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void B(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.abpt) {
            defpackage.abpt abptVar = (defpackage.abpt) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                T(iO);
                int iE = abnyVar.e() + iO;
                do {
                    abptVar.f(abnyVar.p());
                } while (abnyVar.e() < iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abptVar.f(abnyVar2.p());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                T(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Long.valueOf(abnyVar3.p()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Long.valueOf(abnyVar4.p()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void C(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof abop) {
            abop abopVar = (abop) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                S(iO);
                int iE = abnyVar.e() + iO;
                do {
                    abopVar.g(abnyVar.c());
                } while (abnyVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abopVar.g(abnyVar2.c());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                S(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Float.valueOf(abnyVar3.c()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Float.valueOf(abnyVar4.c()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void D(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    aboyVar.g(abnyVar.i());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.i());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.i()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.i()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void E(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.abpt) {
            defpackage.abpt abptVar = (defpackage.abpt) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    abptVar.f(abnyVar.q());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abptVar.f(abnyVar2.q());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Long.valueOf(abnyVar3.q()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Long.valueOf(abnyVar4.q()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void F(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                S(iO);
                int iE = abnyVar.e() + iO;
                do {
                    aboyVar.g(abnyVar.l());
                } while (abnyVar.e() < iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.l());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                S(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.l()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.abpo();
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.l()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void G(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.abpt) {
            defpackage.abpt abptVar = (defpackage.abpt) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                T(iO);
                int iE = abnyVar.e() + iO;
                do {
                    abptVar.f(abnyVar.t());
                } while (abnyVar.e() < iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abptVar.f(abnyVar2.t());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                T(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Long.valueOf(abnyVar3.t()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Long.valueOf(abnyVar4.t()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void H(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    aboyVar.g(abnyVar.m());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.m());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.m()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.m()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void I(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.abpt) {
            defpackage.abpt abptVar = (defpackage.abpt) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    abptVar.f(abnyVar.u());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abptVar.f(abnyVar2.u());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Long.valueOf(abnyVar3.u()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Long.valueOf(abnyVar4.u()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void J(java.util.List list, boolean z) throws java.io.IOException {
        int iN;
        int iN2;
        if ((this.b & 7) != 2) {
            throw new defpackage.abpo();
        }
        if ((list instanceof defpackage.abps) && !z) {
            defpackage.abps abpsVar = (defpackage.abps) list;
            do {
                o();
                abpsVar.b();
                defpackage.abny abnyVar = this.a;
                if (abnyVar.C()) {
                    return;
                } else {
                    iN2 = abnyVar.n();
                }
            } while (iN2 == this.b);
        } else {
            do {
                list.add(z ? u() : t());
                defpackage.abny abnyVar2 = this.a;
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN = abnyVar2.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void K(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    aboyVar.g(abnyVar.o());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.o());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.o()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.o()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void L(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.abpt) {
            defpackage.abpt abptVar = (defpackage.abpt) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    abptVar.f(abnyVar.v());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abptVar.f(abnyVar2.v());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Long.valueOf(abnyVar3.v()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Long.valueOf(abnyVar4.v()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void M(int i) throws java.io.IOException {
        if ((this.b & 7) != i) {
            throw new defpackage.abpo();
        }
    }

    public final boolean N() throws java.io.IOException {
        M(0);
        return this.a.D();
    }

    public final boolean O() throws java.io.IOException {
        int i;
        defpackage.abny abnyVar = this.a;
        if (abnyVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return abnyVar.E(i);
    }

    public final double a() throws java.io.IOException {
        M(1);
        return this.a.b();
    }

    public final float b() throws java.io.IOException {
        M(5);
        return this.a.c();
    }

    public final int c() throws java.io.IOException {
        int iN = this.c;
        if (iN != 0) {
            this.b = iN;
            this.c = 0;
        } else {
            iN = this.a.n();
            this.b = iN;
        }
        if (iN == 0 || iN == this.d) {
            return Integer.MAX_VALUE;
        }
        return iN >>> 3;
    }

    public final int d() throws java.io.IOException {
        M(0);
        return this.a.g();
    }

    public final int e() throws java.io.IOException {
        M(5);
        return this.a.h();
    }

    public final int f() throws java.io.IOException {
        M(0);
        return this.a.i();
    }

    public final int g() throws java.io.IOException {
        M(5);
        return this.a.l();
    }

    public final int h() throws java.io.IOException {
        M(0);
        return this.a.m();
    }

    public final int i() throws java.io.IOException {
        M(0);
        return this.a.o();
    }

    public final long j() throws java.io.IOException {
        M(1);
        return this.a.p();
    }

    public final long k() throws java.io.IOException {
        M(0);
        return this.a.q();
    }

    public final long l() throws java.io.IOException {
        M(1);
        return this.a.t();
    }

    public final long m() throws java.io.IOException {
        M(0);
        return this.a.u();
    }

    public final long n() throws java.io.IOException {
        M(0);
        return this.a.v();
    }

    public final defpackage.abnv o() throws java.io.IOException {
        M(2);
        return this.a.w();
    }

    public final java.lang.Object p(defpackage.abrf abrfVar, java.lang.Class cls, defpackage.abol abolVar) throws java.io.IOException {
        defpackage.abrf abrfVar2 = defpackage.abrf.DOUBLE;
        switch (abrfVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Double.valueOf(a());
            case 1:
                return java.lang.Float.valueOf(b());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Long.valueOf(k());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Long.valueOf(n());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(f());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Long.valueOf(j());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(e());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(N());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return u();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                return s(cls, abolVar);
            case 11:
                return o();
            case 12:
                return java.lang.Integer.valueOf(i());
            case 13:
                return java.lang.Integer.valueOf(d());
            case 14:
                return java.lang.Integer.valueOf(g());
            case 15:
                return java.lang.Long.valueOf(l());
            case 16:
                return java.lang.Integer.valueOf(h());
            case 17:
                return java.lang.Long.valueOf(m());
        }
    }

    public final java.lang.Object q(defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        java.lang.Object objE = abqnVar.e();
        P(objE, abqnVar, abolVar);
        abqnVar.g(objE);
        return objE;
    }

    public final java.lang.Object r(defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        java.lang.Object objE = abqnVar.e();
        Q(objE, abqnVar, abolVar);
        abqnVar.g(objE);
        return objE;
    }

    public final java.lang.Object s(java.lang.Class cls, defpackage.abol abolVar) throws java.io.IOException {
        M(2);
        return r(defpackage.abqg.a.b(cls), abolVar);
    }

    public final java.lang.String t() throws java.io.IOException {
        M(2);
        return this.a.x();
    }

    public final java.lang.String u() throws java.io.IOException {
        M(2);
        return this.a.y();
    }

    public final void v(java.lang.Object obj, defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        M(3);
        P(obj, abqnVar, abolVar);
    }

    public final void w(java.lang.Object obj, defpackage.abqn abqnVar, defpackage.abol abolVar) throws java.io.IOException {
        M(2);
        Q(obj, abqnVar, abolVar);
    }

    public final void x(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof abnm) {
            abnm abnmVar = (abnm) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    abnmVar.e(abnyVar.D());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abnmVar.e(abnyVar2.D());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Boolean.valueOf(abnyVar3.D()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Boolean.valueOf(abnyVar4.D()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void y(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof abog) {
            abog abogVar = (abog) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iO = abnyVar.o();
                T(iO);
                int iE = abnyVar.e() + iO;
                do {
                    abogVar.g(abnyVar.b());
                } while (abnyVar.e() < iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                abogVar.g(abnyVar2.b());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iO2 = abnyVar3.o();
                T(iO2);
                int iE2 = abnyVar3.e() + iO2;
                do {
                    list.add(java.lang.Double.valueOf(abnyVar3.b()));
                } while (abnyVar3.e() < iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Double.valueOf(abnyVar4.b()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void z(java.util.List list) throws java.io.IOException {
        int iN;
        int iN2;
        if (list instanceof defpackage.aboy) {
            defpackage.aboy aboyVar = (defpackage.aboy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar = this.a;
                int iE = abnyVar.e() + abnyVar.o();
                do {
                    aboyVar.g(abnyVar.g());
                } while (abnyVar.e() < iE);
                R(iE);
                return;
            }
            do {
                defpackage.abny abnyVar2 = this.a;
                aboyVar.g(abnyVar2.g());
                if (abnyVar2.C()) {
                    return;
                } else {
                    iN2 = abnyVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.abpo();
                }
                defpackage.abny abnyVar3 = this.a;
                int iE2 = abnyVar3.e() + abnyVar3.o();
                do {
                    list.add(java.lang.Integer.valueOf(abnyVar3.g()));
                } while (abnyVar3.e() < iE2);
                R(iE2);
                return;
            }
            do {
                defpackage.abny abnyVar4 = this.a;
                list.add(java.lang.Integer.valueOf(abnyVar4.g()));
                if (abnyVar4.C()) {
                    return;
                } else {
                    iN = abnyVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }
}

package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes3.dex */
public final class wld {
    public int a;
    public int b;
    public final Object c;
    private int d;

    public wld(eis eisVar) {
        this.a = 0;
        Charset charset = ejn.a;
        this.c = eisVar;
        eisVar.h = this;
    }

    public static /* synthetic */ void N(wld wldVar, List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejj) {
            ejj ejjVar = (ejj) list;
            int i = wldVar.b & 7;
            if (i == 2) {
                Object obj = wldVar.c;
                eir eirVar = (eir) obj;
                int iJ = eirVar.j();
                R(iJ);
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + iJ;
                do {
                    ejjVar.f(eirVar.f());
                } while (eisVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new ejo();
            }
            do {
                Object obj2 = wldVar.c;
                ejjVar.f(((eir) obj2).f());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == wldVar.b);
        } else {
            int i2 = wldVar.b & 7;
            if (i2 == 2) {
                Object obj3 = wldVar.c;
                eir eirVar2 = (eir) obj3;
                int iJ2 = eirVar2.j();
                R(iJ2);
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + iJ2;
                do {
                    list.add(Integer.valueOf(eirVar2.f()));
                } while (eisVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new ejo();
            }
            do {
                Object obj4 = wldVar.c;
                list.add(Integer.valueOf(((eir) obj4).f()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == wldVar.b);
            iG2 = iG;
        }
        wldVar.a = iG2;
    }

    public static /* synthetic */ void O(wld wldVar, List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejv) {
            ejv ejvVar = (ejv) list;
            int i = wldVar.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = wldVar.c;
                eir eirVar = (eir) obj;
                int iJ = eirVar.j();
                S(iJ);
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + iJ;
                do {
                    ejvVar.f(eirVar.n());
                } while (eisVar.d() < iD);
                return;
            }
            do {
                Object obj2 = wldVar.c;
                ejvVar.f(((eir) obj2).n());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == wldVar.b);
        } else {
            int i2 = wldVar.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = wldVar.c;
                eir eirVar2 = (eir) obj3;
                int iJ2 = eirVar2.j();
                S(iJ2);
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + iJ2;
                do {
                    list.add(Long.valueOf(eirVar2.n()));
                } while (eisVar3.d() < iD2);
                return;
            }
            do {
                Object obj4 = wldVar.c;
                list.add(Long.valueOf(((eir) obj4).n()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == wldVar.b);
            iG2 = iG;
        }
        wldVar.a = iG2;
    }

    private final void P(Object obj, ekp ekpVar, eja ejaVar) throws IOException {
        Object obj2 = this.c;
        int iJ = ((eir) obj2).j();
        eis eisVar = (eis) obj2;
        eisVar.v();
        int iE = eisVar.e(iJ);
        eisVar.e++;
        ekpVar.h(obj, this, ejaVar);
        eisVar.h(0);
        eisVar.e--;
        eisVar.i(iE);
    }

    private final void Q(int i) throws IOException {
        if (((eis) this.c).d() != i) {
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void R(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new ejp("Failed to parse the message.");
        }
    }

    private static final void S(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new ejp("Failed to parse the message.");
        }
    }

    public final void A(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof eix) {
            eix eixVar = (eix) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                int iJ = ((eir) obj).j();
                S(iJ);
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + iJ;
                do {
                    eixVar.f(eisVar.b());
                } while (eisVar.d() < iD);
                return;
            }
            do {
                eis eisVar2 = (eis) this.c;
                eixVar.f(eisVar2.b());
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj2 = this.c;
                int iJ2 = ((eir) obj2).j();
                S(iJ2);
                eis eisVar3 = (eis) obj2;
                int iD2 = eisVar3.d() + iJ2;
                do {
                    list.add(Double.valueOf(eisVar3.b()));
                } while (eisVar3.d() < iD2);
                return;
            }
            do {
                eis eisVar4 = (eis) this.c;
                list.add(Double.valueOf(eisVar4.b()));
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void B(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejj) {
            ejj ejjVar = (ejj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    ejjVar.f(eirVar.j());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                ejjVar.f(((eir) obj2).j());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    list.add(Integer.valueOf(eirVar2.j()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((eir) obj4).j()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void C(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof eje) {
            eje ejeVar = (eje) list;
            int i = this.b & 7;
            if (i == 2) {
                Object obj = this.c;
                int iJ = ((eir) obj).j();
                R(iJ);
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + iJ;
                do {
                    ejeVar.f(eisVar.c());
                } while (eisVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new ejo();
            }
            do {
                eis eisVar2 = (eis) this.c;
                ejeVar.f(eisVar2.c());
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                Object obj2 = this.c;
                int iJ2 = ((eir) obj2).j();
                R(iJ2);
                eis eisVar3 = (eis) obj2;
                int iD2 = eisVar3.d() + iJ2;
                do {
                    list.add(Float.valueOf(eisVar3.c()));
                } while (eisVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new ejo();
            }
            do {
                eis eisVar4 = (eis) this.c;
                list.add(Float.valueOf(eisVar4.c()));
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void D(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejj) {
            ejj ejjVar = (ejj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    ejjVar.f(eirVar.j());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                ejjVar.f(((eir) obj2).j());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    list.add(Integer.valueOf(eirVar2.j()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((eir) obj4).j()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void E(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejv) {
            ejv ejvVar = (ejv) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    ejvVar.f(eirVar.o());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                ejvVar.f(((eir) obj2).o());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    list.add(Long.valueOf(eirVar2.o()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Long.valueOf(((eir) obj4).o()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void F(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejj) {
            ejj ejjVar = (ejj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    int iJ = eirVar.j();
                    ejjVar.f((-(iJ & 1)) ^ (iJ >>> 1));
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                int iJ2 = ((eir) obj2).j();
                ejjVar.f((-(iJ2 & 1)) ^ (iJ2 >>> 1));
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    int iJ3 = eirVar2.j();
                    list.add(Integer.valueOf((-(iJ3 & 1)) ^ (iJ3 >>> 1)));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                int iJ4 = ((eir) obj4).j();
                list.add(Integer.valueOf((-(iJ4 & 1)) ^ (iJ4 >>> 1)));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void G(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejv) {
            ejv ejvVar = (ejv) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    long jO = eirVar.o();
                    ejvVar.f((-(jO & 1)) ^ (jO >>> 1));
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                long jO2 = ((eir) obj2).o();
                ejvVar.f((-(jO2 & 1)) ^ (jO2 >>> 1));
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    long jO3 = eirVar2.o();
                    list.add(Long.valueOf((-(jO3 & 1)) ^ (jO3 >>> 1)));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                long jO4 = ((eir) obj4).o();
                list.add(Long.valueOf((-(jO4 & 1)) ^ (jO4 >>> 1)));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void H(List list, boolean z) throws IOException {
        int iG;
        int iG2;
        if ((this.b & 7) != 2) {
            throw new ejo();
        }
        if ((list instanceof ejt) && !z) {
            ejt ejtVar = (ejt) list;
            do {
                r();
                ejtVar.b();
                eis eisVar = (eis) this.c;
                if (eisVar.k()) {
                    return;
                } else {
                    iG2 = eisVar.g();
                }
            } while (iG2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                eis eisVar2 = (eis) this.c;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG = eisVar2.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void I(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejj) {
            ejj ejjVar = (ejj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    ejjVar.f(eirVar.j());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                ejjVar.f(((eir) obj2).j());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    list.add(Integer.valueOf(eirVar2.j()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((eir) obj4).j()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void J(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof ejv) {
            ejv ejvVar = (ejv) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                eir eirVar = (eir) obj;
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + eirVar.j();
                do {
                    ejvVar.f(eirVar.o());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                ejvVar.f(((eir) obj2).o());
                eis eisVar2 = (eis) obj2;
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj3 = this.c;
                eir eirVar2 = (eir) obj3;
                eis eisVar3 = (eis) obj3;
                int iD2 = eisVar3.d() + eirVar2.j();
                do {
                    list.add(Long.valueOf(eirVar2.o()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Long.valueOf(((eir) obj4).o()));
                eis eisVar4 = (eis) obj4;
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public final void K(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw new ejo();
        }
    }

    public final boolean L() throws IOException {
        K(0);
        return ((eis) this.c).l();
    }

    public final boolean M() throws IOException {
        int i;
        eis eisVar = (eis) this.c;
        if (eisVar.k() || (i = this.b) == this.d) {
            return false;
        }
        return eisVar.m(i);
    }

    public final void a() {
        View view = (View) this.c;
        int top = this.b - (view.getTop() - this.a);
        int[] iArr = ebm.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.d));
    }

    public final void b() {
        View view = (View) this.c;
        this.a = view.getTop();
        this.d = view.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }

    public final double d() throws IOException {
        K(1);
        return ((eis) this.c).b();
    }

    public final float e() throws IOException {
        K(5);
        return ((eis) this.c).c();
    }

    public final int f() throws IOException {
        int iG = this.a;
        if (iG != 0) {
            this.b = iG;
            this.a = 0;
        } else {
            iG = ((eis) this.c).g();
            this.b = iG;
        }
        return (iG == 0 || iG == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : iG >>> 3;
    }

    public final int g() throws IOException {
        K(0);
        return ((eir) this.c).j();
    }

    public final int h() throws IOException {
        K(5);
        return ((eir) this.c).f();
    }

    public final int i() throws IOException {
        K(0);
        return ((eir) this.c).j();
    }

    public final int j() throws IOException {
        K(5);
        return ((eir) this.c).f();
    }

    public final int k() throws IOException {
        K(0);
        int iJ = ((eir) this.c).j();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    public final int l() throws IOException {
        K(0);
        return ((eir) this.c).j();
    }

    public final long m() throws IOException {
        K(1);
        return ((eir) this.c).n();
    }

    public final long n() throws IOException {
        K(0);
        return ((eir) this.c).o();
    }

    public final long o() throws IOException {
        K(1);
        return ((eir) this.c).n();
    }

    public final long p() throws IOException {
        K(0);
        long jO = ((eir) this.c).o();
        return (-(jO & 1)) ^ (jO >>> 1);
    }

    public final long q() throws IOException {
        K(0);
        return ((eir) this.c).o();
    }

    public final eip r() throws IOException {
        K(2);
        eir eirVar = (eir) this.c;
        int iJ = eirVar.j();
        int i = eirVar.b;
        int i2 = eirVar.c;
        if (iJ <= i - i2 && iJ > 0) {
            eip eipVarJ = eip.j(eirVar.a, i2, iJ);
            eirVar.c += iJ;
            return eipVarJ;
        }
        if (iJ == 0) {
            return eip.b;
        }
        if (iJ < 0) {
            throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrT = eirVar.t(iJ);
        if (bArrT != null) {
            return eip.i(bArrT);
        }
        int i3 = eirVar.c;
        int i4 = eirVar.b;
        int i5 = i4 - i3;
        eirVar.d += i4;
        eirVar.c = 0;
        eirVar.b = 0;
        List<byte[]> listQ = eirVar.q(iJ - i5);
        byte[] bArr = new byte[iJ];
        System.arraycopy(eirVar.a, i3, bArr, 0, i5);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        eip eipVar = eip.b;
        return new ein(bArr);
    }

    public final Object s(ell ellVar, Class cls, eja ejaVar) throws IOException {
        ell ellVar2 = ell.DOUBLE;
        switch (ellVar) {
            case DOUBLE:
                return Double.valueOf(d());
            case FLOAT:
                return Float.valueOf(e());
            case INT64:
                return Long.valueOf(n());
            case UINT64:
                return Long.valueOf(q());
            case INT32:
                return Integer.valueOf(i());
            case FIXED64:
                return Long.valueOf(m());
            case FIXED32:
                return Integer.valueOf(h());
            case BOOL:
                return Boolean.valueOf(L());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                K(2);
                return t(ekm.a.a(cls), ejaVar);
            case BYTES:
                return r();
            case UINT32:
                return Integer.valueOf(l());
            case ENUM:
                return Integer.valueOf(g());
            case SFIXED32:
                return Integer.valueOf(j());
            case SFIXED64:
                return Long.valueOf(o());
            case SINT32:
                return Integer.valueOf(k());
            case SINT64:
                return Long.valueOf(p());
        }
    }

    public final Object t(ekp ekpVar, eja ejaVar) throws IOException {
        Object objC = ekpVar.c();
        P(objC, ekpVar, ejaVar);
        ekpVar.d(objC);
        return objC;
    }

    public final String u() throws IOException {
        K(2);
        eir eirVar = (eir) this.c;
        int iJ = eirVar.j();
        if (iJ > 0) {
            int i = eirVar.b;
            int i2 = eirVar.c;
            if (iJ <= i - i2) {
                String str = new String(eirVar.a, i2, iJ, ejn.a);
                eirVar.c += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > eirVar.b) {
            return new String(eirVar.u(iJ), ejn.a);
        }
        eirVar.r(iJ);
        String str2 = new String(eirVar.a, eirVar.c, iJ, ejn.a);
        eirVar.c += iJ;
        return str2;
    }

    public final String v() throws IOException {
        byte[] bArrU;
        K(2);
        eir eirVar = (eir) this.c;
        int iJ = eirVar.j();
        int i = eirVar.c;
        int i2 = eirVar.b;
        if (iJ <= i2 - i && iJ > 0) {
            bArrU = eirVar.a;
            eirVar.c = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iJ <= i2) {
                eirVar.r(iJ);
                bArrU = eirVar.a;
                eirVar.c = iJ;
            } else {
                bArrU = eirVar.u(iJ);
            }
        }
        return elk.a.b(bArrU, i, iJ);
    }

    public final void w(Object obj, ekp ekpVar, eja ejaVar) throws IOException {
        K(3);
        x(obj, ekpVar, ejaVar);
    }

    public final void x(Object obj, ekp ekpVar, eja ejaVar) throws IOException {
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        try {
            ekpVar.h(obj, this, ejaVar);
            if (this.b == this.d) {
            } else {
                throw new ejp("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    public final void y(Object obj, ekp ekpVar, eja ejaVar) throws IOException {
        K(2);
        P(obj, ekpVar, ejaVar);
    }

    public final void z(List list) throws IOException {
        int iG;
        int iG2;
        if (list instanceof eih) {
            eih eihVar = (eih) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new ejo();
                }
                Object obj = this.c;
                int iJ = ((eir) obj).j();
                eis eisVar = (eis) obj;
                int iD = eisVar.d() + iJ;
                do {
                    eihVar.e(eisVar.l());
                } while (eisVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                eis eisVar2 = (eis) this.c;
                eihVar.e(eisVar2.l());
                if (eisVar2.k()) {
                    return;
                } else {
                    iG2 = eisVar2.g();
                }
            } while (iG2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new ejo();
                }
                Object obj2 = this.c;
                int iJ2 = ((eir) obj2).j();
                eis eisVar3 = (eis) obj2;
                int iD2 = eisVar3.d() + iJ2;
                do {
                    list.add(Boolean.valueOf(eisVar3.l()));
                } while (eisVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                eis eisVar4 = (eis) this.c;
                list.add(Boolean.valueOf(eisVar4.l()));
                if (eisVar4.k()) {
                    return;
                } else {
                    iG = eisVar4.g();
                }
            } while (iG == this.b);
            iG2 = iG;
        }
        this.a = iG2;
    }

    public wld(View view) {
        this.c = view;
    }
}

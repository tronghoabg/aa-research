package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class eqc extends ept {
    public boolean c;
    public eps e;
    private final boolean f;
    private int g;
    private boolean h;
    private final ajab i;
    private final lds j;
    public epk b = new epk();
    public final List d = new ArrayList();

    public eqc(eqa eqaVar, boolean z) {
        this.f = z;
        this.j = new lds(eqaVar);
        eps epsVar = eps.b;
        this.e = epsVar;
        this.i = ajac.a(epsVar);
    }

    private final eps g(epz epzVar) {
        eps epsVar;
        epj epjVar = (epj) ((aan) this.b.c).a(epzVar);
        epj epjVar2 = epjVar != null ? epjVar.c : null;
        if (epjVar2 == null || (epsVar = ((eqb) epjVar2.a).a) == null) {
            epsVar = eps.e;
        }
        eps epsVar2 = (eps) woy.bL(this.d);
        if (epsVar2 == null) {
            epsVar2 = eps.e;
        }
        eps epsVar3 = this.e;
        epsVar3.getClass();
        epsVar.getClass();
        return (eps) affa.z(epsVar3, affa.z(epsVar, epsVar2));
    }

    private final void h(String str) {
        if (this.f && !pk.bn().bo()) {
            throw new IllegalStateException(a.bq(str, "Method ", " must be called on the main thread"));
        }
    }

    private final void i(eps epsVar) {
        if (this.e == epsVar) {
            return;
        }
        eqa eqaVar = (eqa) this.j.P();
        eps epsVar2 = this.e;
        if (epsVar2 == eps.b && epsVar == eps.a) {
            throw new IllegalStateException("State must be at least '" + eps.c + "' to be moved to '" + epsVar + "' in component " + eqaVar);
        }
        eps epsVar3 = eps.a;
        if (epsVar2 == epsVar3 && epsVar2 != epsVar) {
            throw new IllegalStateException("State is '" + epsVar3 + "' and cannot be moved to `" + epsVar + "` in component " + eqaVar);
        }
        this.e = epsVar;
        if (this.h || this.g != 0) {
            this.c = true;
            return;
        }
        this.h = true;
        j();
        this.h = false;
        if (this.e == epsVar3) {
            this.b = new epk();
        }
    }

    private final void j() {
        Object objP = this.j.P();
        if (objP == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        eqa eqaVar = (eqa) objP;
        while (true) {
            epk epkVar = this.b;
            if (((aan) epkVar.c).e == 0) {
                break;
            }
            eps epsVar = ((eqb) ((epj) epkVar.a()).a).a;
            epk epkVar2 = this.b;
            Object obj = epkVar2.b;
            if (obj == null) {
                throw new NoSuchElementException("Collection is empty.");
            }
            eps epsVar2 = ((eqb) ((epj) obj).a).a;
            if (epsVar == epsVar2 && this.e == epsVar2) {
                break;
            }
            this.c = false;
            if (this.e.compareTo(((eqb) ((epj) epkVar2.a()).a).a) < 0) {
                epk epkVar3 = this.b;
                bee beeVar = new bee(this, eqaVar, 20);
                Object obj2 = epkVar3.b;
                while (obj2 != null) {
                    epj epjVar = (epj) obj2;
                    if (!epjVar.d) {
                        beeVar.invoke(obj2);
                    }
                    obj2 = epjVar.c;
                }
            }
            Object obj3 = this.b.b;
            char[] cArr = null;
            eps epsVar3 = obj3 != null ? ((eqb) ((epj) obj3).a).a : null;
            if (!this.c && epsVar3 != null && this.e.compareTo(epsVar3) > 0) {
                epk epkVar4 = this.b;
                erl erlVar = new erl(this, eqaVar, 1, cArr);
                Object obj4 = epkVar4.a;
                while (obj4 != null) {
                    epj epjVar2 = (epj) obj4;
                    if (!epjVar2.d) {
                        erlVar.invoke(obj4);
                    }
                    obj4 = epjVar2.b;
                }
            }
        }
        this.c = false;
        this.i.d(this.e);
    }

    @Override // defpackage.ept
    public final eps a() {
        return this.e;
    }

    @Override // defpackage.ept
    public final aizz b() {
        return new aizl(this.i, null);
    }

    @Override // defpackage.ept
    public final void c(epz epzVar) {
        Object obj;
        eqa eqaVar;
        epzVar.getClass();
        h("addObserver");
        eps epsVar = this.e;
        eps epsVar2 = eps.a;
        if (epsVar != epsVar2) {
            epsVar2 = eps.b;
        }
        eqb eqbVar = new eqb(epzVar, epsVar2);
        epk epkVar = this.b;
        aan aanVar = (aan) epkVar.c;
        epj epjVar = (epj) aanVar.a(epzVar);
        if (epjVar != null) {
            obj = epjVar.a;
        } else {
            epj epjVar2 = new epj(epzVar, eqbVar);
            aanVar.m(epzVar, epjVar2);
            Object obj2 = epkVar.b;
            if (obj2 == null) {
                epkVar.a = epjVar2;
            } else {
                epj epjVar3 = (epj) obj2;
                epjVar3.b = epjVar2;
                epjVar2.c = epjVar3;
            }
            epkVar.b = epjVar2;
            obj = null;
        }
        if (obj == null && (eqaVar = (eqa) this.j.P()) != null) {
            boolean z = this.g != 0 || this.h;
            eps epsVarG = g(epzVar);
            this.g++;
            while (eqbVar.a.compareTo(epsVarG) < 0 && this.b.b(epzVar)) {
                List list = this.d;
                list.add(eqbVar.a);
                epq epqVar = epr.Companion;
                epr eprVarB = epq.b(eqbVar.a);
                if (eprVarB == null) {
                    eps epsVar3 = eqbVar.a;
                    Objects.toString(epsVar3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(epsVar3)));
                }
                eqbVar.a(eqaVar, eprVarB);
                woy.cA(list);
                epsVarG = g(epzVar);
            }
            if (!z) {
                j();
            }
            this.g--;
        }
    }

    @Override // defpackage.ept
    public final void d(epz epzVar) {
        epzVar.getClass();
        h("removeObserver");
        epk epkVar = this.b;
        epj epjVar = (epj) ((aan) epkVar.c).i(epzVar);
        if (epjVar == null) {
            return;
        }
        epj epjVar2 = epjVar.c;
        epj epjVar3 = epjVar.b;
        if (epjVar2 == null) {
            epkVar.a = epjVar3;
        } else {
            epjVar2.b = epjVar3;
        }
        epj epjVar4 = epjVar.b;
        if (epjVar4 == null) {
            epkVar.b = epjVar2;
        } else {
            epjVar4.c = epjVar2;
        }
        epjVar.d = true;
    }

    public final void e(epr eprVar) {
        eprVar.getClass();
        h("handleLifecycleEvent");
        fdk.a.a("androidx.lifecycle");
        fdf fdfVar = fdf.b;
        try {
            i(eprVar.a());
        } finally {
        }
    }

    public final void f(eps epsVar) {
        epsVar.getClass();
        h("setCurrentState");
        i(epsVar);
    }
}

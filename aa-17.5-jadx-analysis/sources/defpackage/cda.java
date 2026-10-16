package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class cda {
    public Set a;
    public final byw b;
    public byw c;
    public final byw d;
    public final byw e;
    public ArrayList f;
    public aap g;
    public aap h;
    public aap i;
    public aan j;
    private cff k;

    public cda() {
        byw bywVar = new byw(new bxr[16]);
        this.b = bywVar;
        aap aapVar = aaq.a;
        this.h = new aap(6);
        this.c = bywVar;
        this.d = new byw(new Object[16]);
        this.e = new byw(new afdr[16]);
    }

    private static final boolean i(bxr bxrVar, byw bywVar) {
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bxq bxqVarA = ((bxr) objArr[i2]).a();
            if (bxqVarA instanceof ccv) {
                byw bywVar2 = ((ccv) bxqVarA).a;
                if (bywVar2.m(bxrVar) || i(bxrVar, bywVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.k = null;
        byw bywVar = this.b;
        bywVar.g();
        this.h.d();
        this.c = bywVar;
        this.d.g();
        this.e.g();
        this.i = null;
        this.j = null;
        this.f = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        aac aacVar = new aac((aad) set, 0);
        while (aacVar.hasNext()) {
            bxq bxqVar = (bxq) aacVar.next();
            aacVar.remove();
            bxqVar.eW();
        }
    }

    public final void c() {
        Set set;
        Set set2 = this.a;
        if (set2 == null) {
            return;
        }
        this.g = null;
        byw bywVar = this.d;
        int i = bywVar.b;
        if (i != 0) {
            aap aapVar = this.i;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                Object obj = bywVar.a[i];
                try {
                    if (obj instanceof bxr) {
                        bxq bxqVarA = ((bxr) obj).a();
                        set2.remove(bxqVarA);
                        bxqVarA.eX();
                    }
                    if (obj instanceof bur) {
                        if (aapVar == null || !aapVar.a(obj)) {
                            ((bur) obj).b();
                        } else {
                            ((bur) obj).c();
                        }
                    }
                } catch (Throwable th) {
                    cff cffVar = this.k;
                    if (cffVar != null) {
                        cffVar.c(th, obj);
                    }
                    throw th;
                }
            }
        }
        byw bywVar2 = this.b;
        int i2 = bywVar2.b;
        if (i2 == 0 || (set = this.a) == null) {
            return;
        }
        Object[] objArr = bywVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            bxr bxrVar = (bxr) objArr[i3];
            bxq bxqVarA2 = bxrVar.a();
            set.remove(bxqVarA2);
            try {
                bxqVarA2.eo();
            } catch (Throwable th2) {
                cff cffVar2 = this.k;
                if (cffVar2 != null) {
                    cffVar2.c(th2, bxrVar);
                }
                throw th2;
            }
        }
    }

    public final void d() {
        byw bywVar = this.e;
        int i = bywVar.b;
        if (i != 0) {
            Object[] objArr = bywVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((afdr) objArr[i2]).invoke();
            }
            bywVar.g();
        }
    }

    public final void e(bxr bxrVar) {
        if (!this.h.a(bxrVar)) {
            aap aapVar = this.g;
            if (aapVar == null || !aapVar.a(bxrVar)) {
                f(bxrVar);
                return;
            }
            return;
        }
        this.h.l(bxrVar);
        if (!this.c.m(bxrVar)) {
            byw bywVar = this.b;
            if (!bywVar.m(bxrVar)) {
                i(bxrVar, bywVar);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(bxrVar.a());
    }

    public final void f(Object obj) {
        this.d.n(obj);
    }

    public final void g(bxr bxrVar) {
        this.c.n(bxrVar);
        this.h.j(bxrVar);
    }

    public final void h(Set set, cff cffVar) {
        a();
        this.a = set;
        this.k = cffVar;
    }
}

package od;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.EnumC3545m;

/* renamed from: od.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3703l1 extends md.O {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3556y f42007f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC3537e f42008g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC3545m f42009h = EnumC3545m.f40695d;

    public C3703l1(AbstractC3556y abstractC3556y) {
        this.f42007f = abstractC3556y;
    }

    @Override // md.O
    public final md.k0 a(md.L l10) {
        Boolean bool;
        List list = l10.f40588a;
        if (list.isEmpty()) {
            md.k0 k0VarH = md.k0.f40682n.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + l10.f40589b);
            c(k0VarH);
            return k0VarH;
        }
        Object obj = l10.f40590c;
        if ((obj instanceof C3697j1) && (bool = ((C3697j1) obj).f41997a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC3537e abstractC3537e = this.f42008g;
        if (abstractC3537e == null) {
            md.J jL = Dd.c.L();
            jL.x(list);
            Dd.c cVarJ = jL.j();
            AbstractC3556y abstractC3556y = this.f42007f;
            AbstractC3537e abstractC3537eB = abstractC3556y.b(cVarJ);
            abstractC3537eB.q(new C3694i1(this, abstractC3537eB));
            this.f42008g = abstractC3537eB;
            EnumC3545m enumC3545m = EnumC3545m.f40692a;
            C3700k1 c3700k1 = new C3700k1(md.K.b(abstractC3537eB, null));
            this.f42009h = enumC3545m;
            abstractC3556y.l(enumC3545m, c3700k1);
            abstractC3537eB.o();
        } else {
            abstractC3537e.r(list);
        }
        return md.k0.f40674e;
    }

    @Override // md.O
    public final void c(md.k0 k0Var) {
        AbstractC3537e abstractC3537e = this.f42008g;
        if (abstractC3537e != null) {
            abstractC3537e.p();
            this.f42008g = null;
        }
        EnumC3545m enumC3545m = EnumC3545m.f40694c;
        C3700k1 c3700k1 = new C3700k1(md.K.a(k0Var));
        this.f42009h = enumC3545m;
        this.f42007f.l(enumC3545m, c3700k1);
    }

    @Override // md.O
    public final void e() {
        AbstractC3537e abstractC3537e = this.f42008g;
        if (abstractC3537e != null) {
            abstractC3537e.o();
        }
    }

    @Override // md.O
    public final void f() {
        AbstractC3537e abstractC3537e = this.f42008g;
        if (abstractC3537e != null) {
            abstractC3537e.p();
        }
    }
}

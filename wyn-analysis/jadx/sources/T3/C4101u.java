package t3;

import A7.AbstractC0279p0;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4101u extends AbstractC4096p {

    /* renamed from: z, reason: collision with root package name */
    public int f45728z;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f45726x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f45727y = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f45724A = false;

    /* renamed from: B, reason: collision with root package name */
    public int f45725B = 0;

    @Override // t3.AbstractC4096p
    public final void A(long j8) {
        ArrayList arrayList;
        this.f45700c = j8;
        if (j8 < 0 || (arrayList = this.f45726x) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).A(j8);
        }
    }

    @Override // t3.AbstractC4096p
    public final void C(android.support.v4.media.session.b bVar) {
        this.f45715s = bVar;
        this.f45725B |= 8;
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).C(bVar);
        }
    }

    @Override // t3.AbstractC4096p
    public final void D(TimeInterpolator timeInterpolator) {
        this.f45725B |= 1;
        ArrayList arrayList = this.f45726x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((AbstractC4096p) this.f45726x.get(i5)).D(timeInterpolator);
            }
        }
        this.f45701d = timeInterpolator;
    }

    @Override // t3.AbstractC4096p
    public final void E(ae.b bVar) {
        super.E(bVar);
        this.f45725B |= 4;
        if (this.f45726x != null) {
            for (int i5 = 0; i5 < this.f45726x.size(); i5++) {
                ((AbstractC4096p) this.f45726x.get(i5)).E(bVar);
            }
        }
    }

    @Override // t3.AbstractC4096p
    public final void F() {
        this.f45725B |= 2;
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).F();
        }
    }

    @Override // t3.AbstractC4096p
    public final void G(long j8) {
        this.f45699b = j8;
    }

    @Override // t3.AbstractC4096p
    public final String I(String str) {
        String strI = super.I(str);
        for (int i5 = 0; i5 < this.f45726x.size(); i5++) {
            StringBuilder sbQ = AbstractC0279p0.q(strI, "\n");
            sbQ.append(((AbstractC4096p) this.f45726x.get(i5)).I(str + "  "));
            strI = sbQ.toString();
        }
        return strI;
    }

    public final void J(AbstractC4096p abstractC4096p) {
        this.f45726x.add(abstractC4096p);
        abstractC4096p.f45706i = this;
        long j8 = this.f45700c;
        if (j8 >= 0) {
            abstractC4096p.A(j8);
        }
        if ((this.f45725B & 1) != 0) {
            abstractC4096p.D(this.f45701d);
        }
        if ((this.f45725B & 2) != 0) {
            abstractC4096p.F();
        }
        if ((this.f45725B & 4) != 0) {
            abstractC4096p.E(this.f45716t);
        }
        if ((this.f45725B & 8) != 0) {
            abstractC4096p.C(this.f45715s);
        }
    }

    @Override // t3.AbstractC4096p
    public final void b(View view) {
        for (int i5 = 0; i5 < this.f45726x.size(); i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).b(view);
        }
        this.f45703f.add(view);
    }

    @Override // t3.AbstractC4096p
    public final void cancel() {
        super.cancel();
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).cancel();
        }
    }

    @Override // t3.AbstractC4096p
    public final void d(C4103w c4103w) {
        if (t(c4103w.f45733b)) {
            Iterator it = this.f45726x.iterator();
            while (it.hasNext()) {
                AbstractC4096p abstractC4096p = (AbstractC4096p) it.next();
                if (abstractC4096p.t(c4103w.f45733b)) {
                    abstractC4096p.d(c4103w);
                    c4103w.f45734c.add(abstractC4096p);
                }
            }
        }
    }

    @Override // t3.AbstractC4096p
    public final void f(C4103w c4103w) {
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).f(c4103w);
        }
    }

    @Override // t3.AbstractC4096p
    public final void g(C4103w c4103w) {
        if (t(c4103w.f45733b)) {
            Iterator it = this.f45726x.iterator();
            while (it.hasNext()) {
                AbstractC4096p abstractC4096p = (AbstractC4096p) it.next();
                if (abstractC4096p.t(c4103w.f45733b)) {
                    abstractC4096p.g(c4103w);
                    c4103w.f45734c.add(abstractC4096p);
                }
            }
        }
    }

    @Override // t3.AbstractC4096p
    /* renamed from: k */
    public final AbstractC4096p clone() {
        C4101u c4101u = (C4101u) super.clone();
        c4101u.f45726x = new ArrayList();
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC4096p abstractC4096pClone = ((AbstractC4096p) this.f45726x.get(i5)).clone();
            c4101u.f45726x.add(abstractC4096pClone);
            abstractC4096pClone.f45706i = c4101u;
        }
        return c4101u;
    }

    @Override // t3.AbstractC4096p
    public final void m(ViewGroup viewGroup, W9.u uVar, W9.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j8 = this.f45699b;
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC4096p abstractC4096p = (AbstractC4096p) this.f45726x.get(i5);
            if (j8 > 0 && (this.f45727y || i5 == 0)) {
                long j10 = abstractC4096p.f45699b;
                if (j10 > 0) {
                    abstractC4096p.G(j10 + j8);
                } else {
                    abstractC4096p.G(j8);
                }
            }
            abstractC4096p.m(viewGroup, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // t3.AbstractC4096p
    public final void v(ViewGroup viewGroup) {
        super.v(viewGroup);
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).v(viewGroup);
        }
    }

    @Override // t3.AbstractC4096p
    public final void x(View view) {
        for (int i5 = 0; i5 < this.f45726x.size(); i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).x(view);
        }
        this.f45703f.remove(view);
    }

    @Override // t3.AbstractC4096p
    public final void y(View view) {
        super.y(view);
        int size = this.f45726x.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4096p) this.f45726x.get(i5)).y(view);
        }
    }

    @Override // t3.AbstractC4096p
    public final void z() {
        if (this.f45726x.isEmpty()) {
            H();
            n();
            return;
        }
        C4087g c4087g = new C4087g();
        c4087g.f45679b = this;
        Iterator it = this.f45726x.iterator();
        while (it.hasNext()) {
            ((AbstractC4096p) it.next()).a(c4087g);
        }
        this.f45728z = this.f45726x.size();
        if (this.f45727y) {
            Iterator it2 = this.f45726x.iterator();
            while (it2.hasNext()) {
                ((AbstractC4096p) it2.next()).z();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f45726x.size(); i5++) {
            ((AbstractC4096p) this.f45726x.get(i5 - 1)).a(new C4087g((AbstractC4096p) this.f45726x.get(i5), 1));
        }
        AbstractC4096p abstractC4096p = (AbstractC4096p) this.f45726x.get(0);
        if (abstractC4096p != null) {
            abstractC4096p.z();
        }
    }
}

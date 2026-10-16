package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class abnr extends abnp implements abnt, abcu {
    public abnr(abns abnsVar) {
        super(abnsVar);
    }

    private final abnl bl() {
        abnl abnlVar = ((abns) this.b).w;
        if (!abnlVar.c) {
            return abnlVar;
        }
        abnl abnlVarB = abnlVar.clone();
        ((abns) this.b).w = abnlVarB;
        return abnlVarB;
    }

    private final void bm(abnh abnhVar) {
        if (abnhVar.a != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.abnp, defpackage.abov
    /* renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final abns r() {
        if (!((abns) this.b).T()) {
            return (abns) this.b;
        }
        ((abns) this.b).w.e();
        return (abns) super.r();
    }

    @Override // defpackage.abnt
    public final Object aY(abnh abnhVar) {
        abns abnsVar = (abns) this.b;
        abnsVar.j(abnhVar);
        Object objJ = abnsVar.w.j(abnhVar.d);
        return objJ == null ? abnhVar.b : abnhVar.c(objJ);
    }

    @Override // defpackage.abnt
    public final boolean aZ(abnh abnhVar) {
        abns abnsVar = (abns) this.b;
        abnsVar.j(abnhVar);
        return abnsVar.w.m(abnhVar.d);
    }

    @Override // defpackage.abcu
    public final abco b() {
        abco abcoVar = ((abcs) this.b).c;
        return abcoVar == null ? abco.a : abcoVar;
    }

    public final void ba(abnh abnhVar, Object obj) {
        bm(abnhVar);
        t();
        bl().k(abnhVar.d, abnhVar.e(obj));
    }

    public final void bb(abnh abnhVar) {
        int i = abnv.am;
        bm(abnhVar);
        t();
        abnl abnlVarBl = bl();
        abnu abnuVar = abnhVar.d;
        abpq abpqVar = abnlVarBl.b;
        abpqVar.remove(abnuVar);
        if (abpqVar.isEmpty()) {
            abnlVarBl.d = false;
        }
    }

    public final void bc(abnh abnhVar, Object obj) {
        int i = abnv.am;
        bm(abnhVar);
        t();
        abnl abnlVarBl = bl();
        abnu abnuVar = abnhVar.d;
        if (!abnuVar.d) {
            obj = abnhVar.e(obj);
        } else if (abnuVar.a() == abqe.h) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(abnhVar.e(it.next()));
            }
            obj = arrayList;
        }
        abnlVarBl.l(abnuVar, obj);
    }

    public final void bd(abcn abcnVar) {
        t();
        abco abcoVar = (abco) this.b;
        abco abcoVar2 = abco.a;
        abcnVar.getClass();
        aboh abohVar = abcoVar.c;
        if (!abohVar.c()) {
            abcoVar.c = abnv.I(abohVar);
        }
        abcoVar.c.add(abcnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final abgd be(int i) {
        return (abgd) ((abgj) this.b).d.get(i);
    }

    public final void bf(abgt abgtVar) {
        t();
        abgj abgjVar = (abgj) this.b;
        abgj abgjVar2 = abgj.a;
        abgtVar.getClass();
        aboh abohVar = abgjVar.c;
        if (!abohVar.c()) {
            abgjVar.c = abnv.I(abohVar);
        }
        abgjVar.c.add(abgtVar);
    }

    public final void bg(abab ababVar) {
        abab ababVar2;
        t();
        abgj abgjVar = (abgj) this.b;
        abgj abgjVar2 = abgj.a;
        ababVar.getClass();
        abnv abnvVar = abgjVar.j;
        if (abnvVar != null && abnvVar != (ababVar2 = abab.a)) {
            abnr abnrVar = (abnr) ababVar2.o(abnvVar);
            abnrVar.w(ababVar);
            ababVar = (abab) abnrVar.r();
        }
        abgjVar.j = ababVar;
        abgjVar.b |= 2097152;
    }

    public final void bh(int i, abgd abgdVar) {
        t();
        abgj abgjVar = (abgj) this.b;
        abgj abgjVar2 = abgj.a;
        abgdVar.getClass();
        abgjVar.b();
        abgjVar.d.set(i, abgdVar);
    }

    public final void bi(abgz abgzVar) {
        t();
        abha abhaVar = (abha) this.b;
        abha abhaVar2 = abha.a;
        abgzVar.getClass();
        abhaVar.b();
        abhaVar.d.add(abgzVar);
    }

    public final void bj(abnr abnrVar) {
        t();
        abdr abdrVar = (abdr) this.b;
        abcf abcfVar = (abcf) abnrVar.q();
        abdr abdrVar2 = abdr.a;
        abcfVar.getClass();
        aboh abohVar = abdrVar.c;
        if (!abohVar.c()) {
            abdrVar.c = abnv.I(abohVar);
        }
        abdrVar.c.add(abcfVar);
    }

    @Deprecated
    public final void bk(abnp abnpVar) {
        t();
        abgd abgdVar = (abgd) this.b;
        abgc abgcVar = (abgc) abnpVar.q();
        abgd abgdVar2 = abgd.a;
        abgcVar.getClass();
        aboh abohVar = abgdVar.f;
        if (!abohVar.c()) {
            abgdVar.f = abnv.I(abohVar);
        }
        abgdVar.f.add(abgcVar);
    }

    @Override // defpackage.abcu
    public final abco c() {
        abco abcoVar = ((abcs) this.b).d;
        return abcoVar == null ? abco.a : abcoVar;
    }

    @Override // defpackage.abcu
    public final boolean d() {
        return (((abcs) this.b).b & 2) != 0;
    }

    @Override // defpackage.abnp
    protected final void u() {
        super.u();
        if (((abns) this.b).w != abnl.a) {
            abns abnsVar = (abns) this.b;
            abnsVar.w = abnsVar.w.clone();
        }
    }

    public abnr() {
        throw null;
    }
}

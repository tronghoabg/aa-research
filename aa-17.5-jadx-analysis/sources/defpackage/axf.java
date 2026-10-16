package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class axf implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ axf(afec afecVar, cyc cycVar, affq affqVar, int i) {
        this.d = i;
        this.b = afecVar;
        this.c = cycVar;
        this.a = affqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [amy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [cst, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        ane aneVar;
        Object objInvoke;
        cco ccoVar;
        int i;
        switch (this.d) {
            case 0:
                axd axdVar = (axd) this.a.a();
                axr axrVar = (axr) this.b;
                return new axe(axrVar, axdVar, (bii) this.c, new smv(axrVar.d.c.a(), axdVar));
            case 1:
                break;
            case 2:
                return new bbd((afei) this.c.a(), (afec) this.b.a(), ((Number) this.a.invoke()).intValue());
            case 3:
                ?? r0 = this.a;
                ?? r2 = this.b;
                bce bceVar = (bce) this.c;
                cjb cjbVarB = bce.b(bceVar, r2, r0);
                if (cjbVarB == null) {
                    return null;
                }
                ane aneVar2 = bceVar.a;
                if (aneVar2.g == -1) {
                    asl.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cjbVarB.f(aneVar2.f(cjbVarB, aneVar2.d(), 0L) ^ (-9223372034707292160L));
            case 4:
                ((ccp) this.c).a();
                int i2 = ((afft) this.a).a;
                do {
                    ccoVar = (cco) ((ccq) this.b).b;
                    i = ccoVar.get();
                } while (!ccoVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return afak.a;
            case 5:
                ?? r02 = this.b;
                cks cksVar = cyc.q;
                r02.invoke(cksVar);
                cyc cycVar = (cyc) this.c;
                boolean zF = affa.f(cycVar.A, cksVar.o);
                boolean z = cycVar.D;
                boolean z2 = cksVar.p;
                cksVar.x = cksVar.o.a(cksVar.r, cksVar.u, cksVar.t);
                cjb cjbVar = cycVar.C;
                ckm ckmVar = cksVar.x;
                cjb cjbVarA = ckmVar != null ? ckmVar.a() : null;
                Object obj = this.a;
                boolean z3 = z != z2;
                boolean zF2 = affa.f(cjbVar, cjbVarA);
                ((affq) obj).a = !zF2;
                if (!zF || z3 || !zF2) {
                    cycVar.A = cksVar.o;
                    cycVar.D = cksVar.p;
                    ckm ckmVar2 = cksVar.x;
                    cycVar.C = ckmVar2 != null ? ckmVar2.a() : cjb.a;
                    ckm ckmVar3 = cksVar.x;
                    cycVar.B = ckmVar3 != null ? dlf.o(dlf.q(ckmVar3.a())) : cjb.a;
                    if (cycVar.E && (z3 || (cycVar.D && !zF))) {
                        cycVar.t.J();
                    }
                }
                cycVar.E = true;
                return afak.a;
            case 6:
                ?? r03 = this.a;
                Object obj2 = this.c;
                ((czd) obj2).removeOnAttachStateChangeListener(r03);
                ((ArrayList) ebf.N((View) obj2).a).remove(this.b);
                return afak.a;
            default:
                nmm nmmVar = (nmm) this.c;
                if (nmmVar.a) {
                    this.b.invoke();
                }
                ?? r13 = this.a;
                nmmVar.a = false;
                if (r13 != 0) {
                    r13.invoke();
                }
                return afak.a;
        }
        while (true) {
            aneVar = (ane) this.b;
            byw bywVar = (byw) aneVar.i.a;
            int i3 = bywVar.b;
            if (i3 != 0) {
                if (i3 == 0) {
                    throw new NoSuchElementException("MutableVector is empty.");
                }
                Object objInvoke2 = ((anb) bywVar.a[i3 - 1]).a.invoke();
                if (objInvoke2 == null || ane.i(aneVar, (cjb) objInvoke2, 0L, 0L, 3)) {
                    ((anb) bywVar.c(bywVar.b - 1)).b.w(afak.a);
                }
            }
        }
        if (aneVar.f && (objInvoke = aneVar.e.invoke()) != null && ane.i(aneVar, (cjb) objInvoke, 0L, 0L, 3)) {
            aneVar.f = false;
        }
        ((arf) this.a).e = aneVar.b(this.c, 0L);
        return afak.a;
    }

    public /* synthetic */ axf(ane aneVar, arf arfVar, amy amyVar, int i) {
        this.d = i;
        this.b = aneVar;
        this.a = arfVar;
        this.c = amyVar;
    }

    public /* synthetic */ axf(bym bymVar, axr axrVar, bii biiVar, int i) {
        this.d = i;
        this.a = bymVar;
        this.b = axrVar;
        this.c = biiVar;
    }

    public /* synthetic */ axf(czd czdVar, cjh cjhVar, izj izjVar, int i) {
        this.d = i;
        this.c = czdVar;
        this.a = cjhVar;
        this.b = izjVar;
    }

    public /* synthetic */ axf(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}

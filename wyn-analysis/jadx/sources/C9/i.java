package c9;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19808a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19809b;

    /* renamed from: c, reason: collision with root package name */
    public g f19810c;

    /* renamed from: d, reason: collision with root package name */
    public final g f19811d;

    public i(Object obj, Object obj2, g gVar, g gVar2) {
        this.f19808a = obj;
        this.f19809b = obj2;
        f fVar = f.f19807a;
        this.f19810c = gVar == null ? fVar : gVar;
        this.f19811d = gVar2 == null ? fVar : gVar2;
    }

    @Override // c9.g
    public final g a() {
        return this.f19810c;
    }

    @Override // c9.g
    public final g b() {
        return this.f19811d;
    }

    @Override // c9.g
    public final g e(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f19808a);
        return (iCompare < 0 ? k(null, null, this.f19810c.e(obj, obj2, comparator), null) : iCompare == 0 ? k(obj, obj2, null, null) : k(null, null, null, this.f19811d.e(obj, obj2, comparator))).l();
    }

    @Override // c9.g
    public final g f(Object obj, Comparator comparator) {
        i iVarK;
        if (comparator.compare(obj, this.f19808a) < 0) {
            i iVarN = (this.f19810c.isEmpty() || this.f19810c.d() || ((i) this.f19810c).f19810c.d()) ? this : n();
            iVarK = iVarN.k(null, null, iVarN.f19810c.f(obj, comparator), null);
        } else {
            i iVarP = this.f19810c.d() ? p() : this;
            g gVar = iVarP.f19811d;
            if (!gVar.isEmpty() && !gVar.d() && !((i) gVar).f19810c.d()) {
                iVarP = iVarP.i();
                if (iVarP.f19810c.a().d()) {
                    iVarP = iVarP.p().i();
                }
            }
            if (comparator.compare(obj, iVarP.f19808a) == 0) {
                g gVar2 = iVarP.f19811d;
                if (gVar2.isEmpty()) {
                    return f.f19807a;
                }
                g gVarG = gVar2.g();
                iVarP = iVarP.k(gVarG.getKey(), gVarG.getValue(), null, ((i) gVar2).o());
            }
            iVarK = iVarP.k(null, null, null, iVarP.f19811d.f(obj, comparator));
        }
        return iVarK.l();
    }

    @Override // c9.g
    public final g g() {
        return this.f19810c.isEmpty() ? this : this.f19810c.g();
    }

    @Override // c9.g
    public final Object getKey() {
        return this.f19808a;
    }

    @Override // c9.g
    public final Object getValue() {
        return this.f19809b;
    }

    @Override // c9.g
    public final g h() {
        g gVar = this.f19811d;
        return gVar.isEmpty() ? this : gVar.h();
    }

    public final i i() {
        g gVar = this.f19810c;
        g gVarC = gVar.c(gVar.d() ? 2 : 1, null, null);
        g gVar2 = this.f19811d;
        return c(d() ? 2 : 1, gVarC, gVar2.c(gVar2.d() ? 2 : 1, null, null));
    }

    @Override // c9.g
    public final boolean isEmpty() {
        return false;
    }

    @Override // c9.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final i c(int i5, g gVar, g gVar2) {
        if (gVar == null) {
            gVar = this.f19810c;
        }
        if (gVar2 == null) {
            gVar2 = this.f19811d;
        }
        Object obj = this.f19808a;
        Object obj2 = this.f19809b;
        return i5 == 1 ? new h(obj, obj2, gVar, gVar2) : new e(obj, obj2, gVar, gVar2);
    }

    public abstract i k(Object obj, Object obj2, g gVar, g gVar2);

    public final i l() {
        g gVar = this.f19811d;
        i iVarP = (!gVar.d() || this.f19810c.d()) ? this : (i) gVar.c(m(), c(1, null, ((i) gVar).f19810c), null);
        if (iVarP.f19810c.d() && ((i) iVarP.f19810c).f19810c.d()) {
            iVarP = iVarP.p();
        }
        return (iVarP.f19810c.d() && iVarP.f19811d.d()) ? iVarP.i() : iVarP;
    }

    public abstract int m();

    public final i n() {
        i iVarI = i();
        g gVar = iVarI.f19811d;
        if (!gVar.a().d()) {
            return iVarI;
        }
        i iVarK = iVarI.k(null, null, null, ((i) gVar).p());
        g gVar2 = iVarK.f19811d;
        return ((i) gVar2.c(iVarK.m(), iVarK.c(1, null, ((i) gVar2).f19810c), null)).i();
    }

    public final g o() {
        if (this.f19810c.isEmpty()) {
            return f.f19807a;
        }
        i iVarN = (this.f19810c.d() || this.f19810c.a().d()) ? this : n();
        return iVarN.k(null, null, ((i) iVarN.f19810c).o(), null).l();
    }

    public final i p() {
        return (i) this.f19810c.c(m(), null, c(1, ((i) this.f19810c).f19811d, null));
    }

    public void q(i iVar) {
        this.f19810c = iVar;
    }
}

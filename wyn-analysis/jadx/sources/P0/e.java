package p0;

import E5.C0441b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3906k;
import t0.y;

/* loaded from: classes.dex */
public final class e extends a2.v {

    /* renamed from: c, reason: collision with root package name */
    public final n f43125c;

    /* renamed from: d, reason: collision with root package name */
    public final P.d f43126d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f43127e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3906k f43128f;

    /* renamed from: g, reason: collision with root package name */
    public f f43129g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43130h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f43131i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43132j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n pointerInputFilter) {
        super(18);
        AbstractC3340k.e(pointerInputFilter, "pointerInputFilter");
        this.f43125c = pointerInputFilter;
        this.f43126d = new P.d(new j[16]);
        this.f43127e = new LinkedHashMap();
        this.f43131i = true;
        this.f43132j = true;
    }

    public final void C() {
        P.d dVar = (P.d) this.f17322b;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                ((e) objArr[i10]).C();
                i10++;
            } while (i10 < i5);
        }
        this.f43125c.a();
    }

    public final boolean D(C0441b c0441b) {
        P.d dVar;
        int i5;
        LinkedHashMap linkedHashMap = this.f43127e;
        boolean z2 = false;
        int i10 = 0;
        z2 = false;
        if (!linkedHashMap.isEmpty()) {
            n nVar = this.f43125c;
            if (nVar.f43164b) {
                f fVar = this.f43129g;
                AbstractC3340k.b(fVar);
                InterfaceC3906k interfaceC3906k = this.f43128f;
                AbstractC3340k.b(interfaceC3906k);
                nVar.n(fVar, g.f43138c, ((y) interfaceC3906k).f44309c);
                if (nVar.f43164b && (i5 = (dVar = (P.d) this.f17322b).f8972c) > 0) {
                    Object[] objArr = dVar.f8970a;
                    do {
                        ((e) objArr[i10]).D(c0441b);
                        i10++;
                    } while (i10 < i5);
                }
                z2 = true;
            }
        }
        o(c0441b);
        linkedHashMap.clear();
        this.f43128f = null;
        return z2;
    }

    public final boolean G(Map changes, InterfaceC3906k parentCoordinates, C0441b c0441b, boolean z2) {
        P.d dVar;
        int i5;
        AbstractC3340k.e(changes, "changes");
        AbstractC3340k.e(parentCoordinates, "parentCoordinates");
        LinkedHashMap linkedHashMap = this.f43127e;
        int i10 = 0;
        if (!linkedHashMap.isEmpty()) {
            n nVar = this.f43125c;
            if (nVar.f43164b) {
                f fVar = this.f43129g;
                AbstractC3340k.b(fVar);
                InterfaceC3906k interfaceC3906k = this.f43128f;
                AbstractC3340k.b(interfaceC3906k);
                long j8 = ((y) interfaceC3906k).f44309c;
                nVar.n(fVar, g.f43136a, j8);
                if (nVar.f43164b && (i5 = (dVar = (P.d) this.f17322b).f8972c) > 0) {
                    Object[] objArr = dVar.f8970a;
                    do {
                        e eVar = (e) objArr[i10];
                        InterfaceC3906k interfaceC3906k2 = this.f43128f;
                        AbstractC3340k.b(interfaceC3906k2);
                        eVar.G(linkedHashMap, interfaceC3906k2, c0441b, z2);
                        i10++;
                    } while (i10 < i5);
                }
                if (nVar.f43164b) {
                    nVar.n(fVar, g.f43137b, j8);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01d8  */
    @Override // a2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.util.LinkedHashMap r33, t0.C4061i r34, E5.C0441b r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.e.n(java.util.LinkedHashMap, t0.i, E5.b, boolean):boolean");
    }

    @Override // a2.v
    public final void o(C0441b c0441b) {
        super.o(c0441b);
        f fVar = this.f43129g;
        if (fVar == null) {
            return;
        }
        this.f43130h = this.f43131i;
        List list = fVar.f43133a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) list.get(i5);
            if (!kVar.f43144d) {
                long j8 = kVar.f43141a;
                if (!c0441b.i(j8) || !this.f43131i) {
                    this.f43126d.k(new j(j8));
                }
            }
        }
        this.f43131i = false;
        this.f43132j = fVar.f43135c == 5;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f43125c + ", children=" + ((P.d) this.f17322b) + ", pointerIds=" + this.f43126d + ')';
    }
}

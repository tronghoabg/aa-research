package N;

import jf.InterfaceC3107g;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class P implements InterfaceC3107g, A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ P f7726b = new P(0);

    /* renamed from: c, reason: collision with root package name */
    public static final P f7727c = new P(1);

    /* renamed from: d, reason: collision with root package name */
    public static final P f7728d = new P(2);

    /* renamed from: e, reason: collision with root package name */
    public static final P f7729e = new P(3);

    /* renamed from: f, reason: collision with root package name */
    public static final P f7730f = new P(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7731a;

    public /* synthetic */ P(int i5) {
        this.f7731a = i5;
    }

    public static final void b(P p10) {
        Hf.x0 x0Var;
        Q.e eVar;
        T.b bVar;
        Hf.x0 x0Var2 = p0.f7880u;
        do {
            x0Var = p0.f7880u;
            eVar = (Q.e) x0Var.getValue();
            bVar = (T.b) eVar;
            S.c cVarC = bVar.f11132c;
            T.a aVar = (T.a) cVarC.get(p10);
            if (aVar != null) {
                int iHashCode = p10 != null ? p10.hashCode() : 0;
                S.n nVar = cVarC.f10800a;
                S.n nVarV = nVar.v(iHashCode, p10, 0);
                if (nVar != nVarV) {
                    cVarC = nVarV == null ? S.c.f10799c : new S.c(nVarV, cVarC.f10801b - 1);
                }
                U.b bVar2 = U.b.f11898a;
                Object obj = aVar.f11127a;
                boolean z2 = obj != bVar2;
                Object obj2 = aVar.f11128b;
                if (z2) {
                    Object obj3 = cVarC.get(obj);
                    AbstractC3340k.b(obj3);
                    cVarC = cVarC.c(obj, new T.a(((T.a) obj3).f11127a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarC.get(obj2);
                    AbstractC3340k.b(obj4);
                    cVarC = cVarC.c(obj2, new T.a(obj, ((T.a) obj4).f11128b));
                }
                Object obj5 = obj != bVar2 ? bVar.f11130a : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f11131b;
                }
                bVar = new T.b(obj5, obj, cVarC);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!x0Var.i(eVar, bVar));
    }

    @Override // N.A0
    public boolean a(Object obj, Object obj2) {
        switch (this.f7731a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return AbstractC3340k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f7731a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}

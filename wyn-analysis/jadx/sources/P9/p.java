package p9;

import java.util.ArrayList;
import ka.C1;

/* loaded from: classes4.dex */
public final class p extends C3789j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43390d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f43391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s9.j jVar, EnumC3788i enumC3788i, C1 c12) {
        super(jVar, enumC3788i, c12);
        this.f43390d = 2;
        A6.c.z(s9.p.i(c12), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f43391e = s9.h.c(c12.t());
    }

    public static ArrayList h(EnumC3788i enumC3788i, C1 c12) {
        A6.c.z(enumC3788i == EnumC3788i.IN || enumC3788i == EnumC3788i.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        A6.c.z(s9.p.f(c12), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C1 c13 : c12.m().getValuesList()) {
            A6.c.z(s9.p.i(c13), wg.b.c(new StringBuilder("Comparing on key with "), enumC3788i.f43370a, ", but an array value was not a ReferenceValue"), new Object[0]);
            arrayList.add(s9.h.c(c13.t()));
        }
        return arrayList;
    }

    @Override // p9.C3789j, p9.k
    public final boolean d(s9.k kVar) {
        switch (this.f43390d) {
            case 0:
                return ((ArrayList) this.f43391e).contains(kVar.f45380a);
            case 1:
                return !((ArrayList) this.f43391e).contains(kVar.f45380a);
            default:
                return g(kVar.f45380a.compareTo((s9.h) this.f43391e));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(s9.j jVar, C1 c12, int i5) {
        this.f43390d = i5;
        switch (i5) {
            case 1:
                EnumC3788i enumC3788i = EnumC3788i.NOT_IN;
                super(jVar, enumC3788i, c12);
                ArrayList arrayList = new ArrayList();
                this.f43391e = arrayList;
                arrayList.addAll(h(enumC3788i, c12));
                break;
            default:
                EnumC3788i enumC3788i2 = EnumC3788i.IN;
                super(jVar, enumC3788i2, c12);
                ArrayList arrayList2 = new ArrayList();
                this.f43391e = arrayList2;
                arrayList2.addAll(h(enumC3788i2, c12));
                break;
        }
    }
}

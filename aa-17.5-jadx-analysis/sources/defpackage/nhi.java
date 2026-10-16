package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class nhi extends afde implements afeg {
    final /* synthetic */ Map a;
    final /* synthetic */ bwq b;
    final /* synthetic */ byd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhi(byd bydVar, Map map, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.c = bydVar;
        this.a = map;
        this.b = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nhi(this.c, this.a, this.b, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        if (this.c.e() == 0) {
            nhm.a.l().u("All animations finished, requesting focus on HOME");
            Object obj2 = this.a.get(nii.b);
            obj2.getClass();
            ((cil) obj2).a(7);
            this.b.b(true);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nhi) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

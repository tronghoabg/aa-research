package defpackage;

/* loaded from: classes.dex */
final class zz extends afdd implements afeg {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ aaa f;
    final /* synthetic */ aac g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(aaa aaaVar, aac aacVar, afck afckVar) {
        super(afckVar);
        this.f = aaaVar;
        this.g = aacVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        zz zzVar = new zz(this.f, this.g, afckVar);
        zzVar.h = obj;
        return zzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        airr airrVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        afcr afcrVar = afcr.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            airrVar = (airr) this.h;
            woy.dF(obj);
            obj4 = obj5;
        } else {
            woy.dF(obj);
            airrVar = (airr) this.h;
            aaa aaaVar = this.f;
            obj2 = this.g;
            aaj aajVar = aaaVar.a;
            obj3 = aajVar.c;
            i = aajVar.e;
            obj4 = aaaVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((aac) obj2).a = i;
            Object obj6 = ((aaa) obj4).a.b[i];
            this.h = airrVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (airrVar.a(obj6, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zz) b((airr) obj, (afck) obj2)).hT(afak.a);
    }
}

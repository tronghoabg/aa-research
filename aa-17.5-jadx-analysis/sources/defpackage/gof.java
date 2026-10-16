package defpackage;

/* loaded from: classes2.dex */
final class gof extends afde implements afek {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ gog f;
    final /* synthetic */ gos g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gof(gog gogVar, gos gosVar, afck afckVar) {
        super(6, afckVar);
        this.f = gogVar;
        this.g = gosVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hju, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        gtl gtlVar;
        woy.dF(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        gva gvaVarF = null;
        if (obj4 != null && (gtlVar = ((gta) obj4).b) != null) {
            gvaVarF = gum.f(gtlVar, this.f.a, true);
        }
        gva gvaVar = gvaVarF;
        gos gosVar = this.g;
        gog gogVar = this.f;
        boolean z = obj2 == gid.a;
        gzc gzcVar = (gzc) obj3;
        boolean zA = gzcVar.a();
        geu geuVar = gogVar.a;
        return new gpa(r1, gjs.e(gosVar.b, geuVar, z, zA), hgg.c(geuVar, gzcVar), gzcVar.a(), gogVar.d, new gbz(gogVar, 10), gvaVar, (hgc) obj5);
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        gof gofVar = new gof(this.f, this.g, (afck) obj6);
        gofVar.a = (hju) obj;
        gofVar.b = (gid) obj2;
        gofVar.c = (gzc) obj3;
        gofVar.d = (gta) obj4;
        gofVar.e = (hgc) obj5;
        return gofVar.hT(afak.a);
    }
}

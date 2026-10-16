package defpackage;

/* loaded from: classes.dex */
final class blm extends afde implements afeg {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ dfv d;
    final /* synthetic */ blr e;
    final /* synthetic */ djn f;
    final /* synthetic */ bke g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blm(bke bkeVar, String str, long j, dfv dfvVar, blr blrVar, djn djnVar, afck afckVar) {
        super(2, afckVar);
        this.g = bkeVar;
        this.b = str;
        this.c = j;
        this.d = dfvVar;
        this.e = blrVar;
        this.f = djnVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new blm(this.g, this.b, this.c, this.d, this.e, this.f, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            bke bkeVar = this.g;
            String str = this.b;
            long j = this.c;
            this.a = 1;
            obj = (str.length() == 0 || dfv.i(j)) ? null : bkeVar.f(new bkd(str, j, bkeVar, null), this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        }
        dfv dfvVar = (dfv) obj;
        if (dfvVar != null) {
            djn djnVar = this.f;
            long j2 = dfvVar.b;
            long jT = czz.t(djnVar.b(dfv.e(j2)), djnVar.b(dfv.a(j2)));
            if (!dfv.h(jT, this.d)) {
                blr blrVar = this.e;
                if (affa.f(blrVar.f().a(), this.b) && djnVar == blrVar.b) {
                    blrVar.c.invoke(new djv(blrVar.f().a, jT, (dfv) null));
                    blrVar.o = new dfv(jT);
                }
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((blm) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

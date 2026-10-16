package defpackage;

/* loaded from: classes2.dex */
final class lnp extends llu {
    final /* synthetic */ lnq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnp(lnq lnqVar) {
        super((float[]) null);
        this.a = lnqVar;
    }

    @Override // defpackage.llu
    public final void e(String str, yfq yfqVar) {
        ype ypeVar = (ype) lnr.a.l().ai(4074);
        lnq lnqVar = this.a;
        ypeVar.R("onChildrenLoaded componentName=%s id=%s size=%d", new zjd(zjc.a, lnqVar.a.b.a.flattenToShortString()), str, Integer.valueOf(yfqVar.size()));
        lnqVar.m(new log(yfqVar));
    }

    @Override // defpackage.llu
    public final void f(String str) {
        ype ypeVar = (ype) ((ype) lnr.a.h()).ai(4075);
        lnq lnqVar = this.a;
        ypeVar.M("onError componentName=%s id=%s", new zjd(zjc.a, lnqVar.a.b.a.flattenToShortString()), str);
        lnqVar.m(lpb.b(3));
    }
}

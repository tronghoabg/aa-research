package defpackage;

import android.content.ComponentName;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class lnw extends eqj {
    public final ComponentName a;
    private final lmb h;
    private final llu i = new lnv(this);

    public lnw(lmb lmbVar, ComponentName componentName) {
        this.h = lmbVar;
        this.a = componentName;
    }

    public static boolean a(llu lluVar) {
        return Objects.equals(spu.aT(lluVar, new llx(8)), 2);
    }

    @Override // defpackage.eqj
    protected final void c() {
        lmb lmbVar = this.h;
        boolean zA = a(lmbVar.U());
        ype ypeVar = (ype) lod.a.l().ai(4089);
        String strFlattenToShortString = this.a.flattenToShortString();
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, strFlattenToShortString);
        Boolean boolValueOf = Boolean.valueOf(zA);
        ypeVar.M("IsRemoteLiveData#onActive componentName=%s isRemote=%s", zjdVar, new zjd(zjcVar, boolValueOf));
        m(boolValueOf);
        lmbVar.W(this.i);
    }

    @Override // defpackage.eqj
    protected final void d() {
        yph yphVar = lod.a;
        this.a.flattenToShortString();
        this.h.X(this.i);
    }
}

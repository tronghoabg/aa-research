package defpackage;

import android.content.ComponentName;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class lny extends eqj {
    public final ComponentName a;
    private final lmb h;
    private final llu i = new lnx(this);

    public lny(lmb lmbVar, ComponentName componentName) {
        this.h = lmbVar;
        this.a = componentName;
    }

    @Override // defpackage.eqj
    protected final void c() {
        lmb lmbVar = this.h;
        lmd lmdVarO = lmbVar.O();
        ((ype) lod.a.l().ai(4093)).S("MediaMetadataLiveData#onActive: componentName=%s %s hasIconBitmap=%b hasIconUri=%b", new zjd(zjc.a, this.a.flattenToShortString()), Objects.toString(lmdVarO), Boolean.valueOf(spu.aT(lmdVarO, new llx(9)) != null), Boolean.valueOf(spu.aT(lmdVarO, new llx(10)) != null));
        m(lmdVarO);
        lmbVar.W(this.i);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.X(this.i);
    }
}

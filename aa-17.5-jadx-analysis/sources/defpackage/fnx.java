package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fnx implements fnu {
    public final ezc a;
    public final eyn b = new fnw();

    public fnx(ezc ezcVar) {
        this.a = ezcVar;
    }

    @Override // defpackage.fnu
    public final /* synthetic */ fnt a(fny fnyVar) {
        return (fnt) ckf.m(this.a, true, false, new fof(fnyVar.a, fnyVar.b, 1));
    }

    @Override // defpackage.fnu
    public final List b() {
        return (List) ckf.m(this.a, true, false, new ewm(9));
    }

    @Override // defpackage.fnu
    public final void c(fnt fntVar) {
        ckf.m(this.a, false, true, new fnv(this, fntVar, 1));
    }

    @Override // defpackage.fnu
    public final void d(String str) {
        ckf.m(this.a, false, true, new fnv(str, 0));
    }
}

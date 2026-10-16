package defpackage;

import android.content.Context;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class kpp extends eql {
    public final Context a;

    public kpp(Context context) {
        this.a = context;
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        r(oqx.a(), new hlg(this, 20));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        s(oqx.a());
        p();
        super.d();
    }

    @Override // defpackage.eql, defpackage.eqj
    public final void p() {
        j(Optional.empty());
    }
}

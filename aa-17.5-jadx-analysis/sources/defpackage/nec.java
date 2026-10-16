package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class nec extends eql {
    public final Context a;
    public final Duration h;
    public final ned i;
    public final boolean j;
    public final ieq k;
    private final Uri l;
    private final Object m;
    private final aitx n;
    private aivh o;

    public nec(Context context, Uri uri, Object obj, Duration duration, aitx aitxVar, ned nedVar, boolean z) {
        duration.getClass();
        this.a = context;
        this.l = uri;
        this.m = obj;
        this.h = duration;
        this.n = aitxVar;
        this.i = nedVar;
        this.j = z;
        this.k = new neb(this);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        aivh aivhVar = this.o;
        if (aivhVar != null && aivhVar.t()) {
            aivhVar.s(null);
            return;
        }
        Context context = this.a;
        Uri uri = this.l;
        Object obj = this.m;
        ieq ieqVar = this.k;
        context.getClass();
        uri.getClass();
        ieqVar.getClass();
        hsq hsqVarF = hrt.c(context).b().f(uri);
        if (obj != null) {
            hsqVarF = hsqVarF.n(iek.e(new ifj(obj)));
        }
        hsqVarF.q(ieqVar);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        aitx aitxVar = this.n;
        if (aitxVar != null && ahni.g(aitxVar)) {
            this.o = ahnc.d(aitxVar, mkm.a.e().i(), 0, new nba(this, (afck) null, 3), 2);
            return;
        }
        ned nedVar = this.i;
        Context context = this.a;
        ieq ieqVar = this.k;
        Bitmap bitmap = (Bitmap) e();
        nedVar.a(context, ieqVar, bitmap != null ? Boolean.valueOf(bitmap.isRecycled()) : null);
    }
}

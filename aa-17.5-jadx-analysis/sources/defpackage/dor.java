package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dor implements bxq {
    public Handler a;
    public final ces b = new ces(new ddz(this, 15));
    public boolean c = true;
    public final afec d = new ddz(this, 16);
    public final List e = new ArrayList();
    public final dom f;

    public dor(dom domVar) {
        this.f = domVar;
    }

    public final void d() {
        this.c = true;
    }

    @Override // defpackage.bxq
    public final void eX() {
        ces cesVar = this.b;
        cesVar.d();
        cesVar.a();
    }

    @Override // defpackage.bxq
    public final void eo() {
        this.b.c();
    }

    @Override // defpackage.bxq
    public final void eW() {
    }
}

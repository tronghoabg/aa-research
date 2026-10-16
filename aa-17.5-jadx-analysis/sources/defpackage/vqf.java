package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class vqf extends vpx implements vqj {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final vqa c;
    private vky d;

    public vqf(vqa vqaVar) {
        this.c = vqaVar;
    }

    @Override // defpackage.vqj
    public final void a(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.vqj
    public final void c(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.vqj
    public final void d(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (vqs.c(applicationContext, vqs.d(applicationContext))) {
            l(vky.c(null, activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((ynz) ((ynz) vlj.a.h()).ai((char) 9786)).u("Activity started with background importance");
        }
    }

    @Override // defpackage.vqj
    public final void e(Activity activity) {
        vky vkyVarC = vky.c(null, activity.getClass());
        this.d = vkyVarC;
        Context applicationContext = activity.getApplicationContext();
        vqt vqtVarD = vqs.d(applicationContext);
        if (vqs.c(applicationContext, vqtVarD)) {
            return;
        }
        if (!vqtVarD.a) {
            ((ynz) ((ynz) vlj.a.f()).ai((char) 9787)).y("Signaling app backgrounded from stopped activity (%s) without known process importance", vkyVarC);
        }
        k(vkyVarC);
    }

    @Override // defpackage.vqj
    public final void f(int i) {
        vky vkyVar;
        if (i >= 20 && (vkyVar = this.d) != null) {
            k(vkyVar);
        }
        this.d = null;
    }

    @Override // defpackage.vpx
    public final void g(vky vkyVar) {
        this.c.g(vkyVar);
    }

    @Override // defpackage.vqj
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.vpx
    public final void j(vky vkyVar) {
        this.c.j(vkyVar);
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void b(Activity activity) {
    }
}

package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.io.IOException;
import k.y;
import okhttp3.al;
import okhttp3.ao;
import okhttp3.ap;
import okhttp3.aq;
import okhttp3.at;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final j f55999a;

    /* renamed from: b, reason: collision with root package name */
    private final f f56000b;

    /* renamed from: c, reason: collision with root package name */
    private final okhttp3.internal.d.e f56001c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f56002d;

    /* renamed from: e, reason: collision with root package name */
    private final m f56003e;

    public e(j jVar, w wVar, f fVar, okhttp3.internal.d.e eVar) {
        x.f(jVar, NotificationCompat.CATEGORY_CALL);
        x.f(wVar, "eventListener");
        x.f(fVar, "finder");
        x.f(eVar, "codec");
        this.f55999a = jVar;
        this.f56000b = fVar;
        this.f56001c = eVar;
        this.f56003e = eVar.c();
    }

    private final void s(IOException iOException) {
        this.f56002d = true;
        this.f56000b.c(iOException);
        this.f56001c.c().o(this.f55999a, iOException);
    }

    public final ap a(boolean z) throws IOException {
        try {
            ap apVarB = this.f56001c.b(z);
            if (apVarB != null) {
                apVarB.o(this);
            }
            return apVarB;
        } catch (IOException e2) {
            w.f(this.f55999a, e2);
            s(e2);
            throw e2;
        }
    }

    public final at b(aq aqVar) throws IOException {
        x.f(aqVar, "response");
        try {
            String strP = aq.p(aqVar, "Content-Type");
            okhttp3.internal.d.e eVar = this.f56001c;
            long jA = eVar.a(aqVar);
            return new okhttp3.internal.d.h(strP, jA, y.c(new d(this, eVar.e(aqVar), jA)));
        } catch (IOException e2) {
            w.f(this.f55999a, e2);
            s(e2);
            throw e2;
        }
    }

    public final f c() {
        return this.f56000b;
    }

    public final j d() {
        return this.f55999a;
    }

    public final m e() {
        return this.f56003e;
    }

    public final void f() {
        this.f56001c.f();
    }

    public final void g() {
        this.f56001c.f();
        this.f55999a.e(this, true, true, null);
    }

    public final void h() throws IOException {
        try {
            this.f56001c.g();
        } catch (IOException e2) {
            w.d(this.f55999a, e2);
            s(e2);
            throw e2;
        }
    }

    public final void i() throws IOException {
        try {
            this.f56001c.h();
        } catch (IOException e2) {
            w.d(this.f55999a, e2);
            s(e2);
            throw e2;
        }
    }

    public final void j() {
        this.f56001c.c().l();
    }

    public final void k() {
        this.f55999a.e(this, true, false, null);
    }

    public final void l(aq aqVar) {
        x.f(aqVar, "response");
        x.f(this.f55999a, NotificationCompat.CATEGORY_CALL);
        x.f(aqVar, "response");
    }

    public final void m() {
        x.f(this.f55999a, NotificationCompat.CATEGORY_CALL);
    }

    public final void n(al alVar) throws IOException {
        x.f(alVar, "request");
        try {
            j jVar = this.f55999a;
            x.f(jVar, NotificationCompat.CATEGORY_CALL);
            this.f56001c.i(alVar);
            x.f(jVar, NotificationCompat.CATEGORY_CALL);
            x.f(alVar, "request");
        } catch (IOException e2) {
            w.d(this.f55999a, e2);
            s(e2);
            throw e2;
        }
    }

    public final boolean o() {
        return this.f56002d;
    }

    public final boolean p() {
        return !x.n(this.f56000b.a().j().f(), this.f56003e.g().c().j().f());
    }

    public final IOException q(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            s(iOException);
        }
        if (z2) {
            j jVar = this.f55999a;
            if (iOException != null) {
                w.d(jVar, iOException);
            } else {
                x.f(jVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z) {
            j jVar2 = this.f55999a;
            if (iOException != null) {
                w.f(jVar2, iOException);
            } else {
                x.f(jVar2, NotificationCompat.CATEGORY_CALL);
            }
        }
        return this.f55999a.e(this, z2, z, iOException);
    }

    public final k.al r(al alVar) {
        x.f(alVar, "request");
        ao aoVarH = alVar.h();
        x.c(aoVarH);
        long jA = aoVarH.a();
        x.f(this.f55999a, NotificationCompat.CATEGORY_CALL);
        return new c(this, this.f56001c.d(alVar, jA), jA);
    }
}

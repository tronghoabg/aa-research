package okhttp3.internal.e;

import h.g.b.x;
import h.n.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import k.al;
import k.am;
import k.ao;
import k.i;
import k.j;
import k.s;
import okhttp3.ab;
import okhttp3.ai;
import okhttp3.ap;
import okhttp3.aq;
import okhttp3.internal.c.m;
import okhttp3.z;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g implements okhttp3.internal.d.e {

    /* renamed from: a, reason: collision with root package name */
    private final ai f56094a;

    /* renamed from: b, reason: collision with root package name */
    private final m f56095b;

    /* renamed from: c, reason: collision with root package name */
    private final j f56096c;

    /* renamed from: d, reason: collision with root package name */
    private final i f56097d;

    /* renamed from: e, reason: collision with root package name */
    private int f56098e;

    /* renamed from: f, reason: collision with root package name */
    private z f56099f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.k.f.b f56100g;

    public g(ai aiVar, m mVar, j jVar, i iVar) {
        x.f(mVar, "connection");
        x.f(jVar, "source");
        x.f(iVar, "sink");
        this.f56094a = aiVar;
        this.f56095b = mVar;
        this.f56096c = jVar;
        this.f56097d = iVar;
        this.f56100g = new com.google.android.gms.k.f.b(jVar);
    }

    public static final /* synthetic */ void s(s sVar) {
        ao aoVarE = sVar.e();
        sVar.i(ao.f50818c);
        aoVarE.w();
        aoVarE.r();
    }

    private final am u(long j2) {
        int i2 = this.f56098e;
        if (i2 == 4) {
            this.f56098e = 5;
            return new d(this, j2);
        }
        throw new IllegalStateException("state: " + i2);
    }

    private static final boolean v(aq aqVar) {
        return o.m("chunked", aq.p(aqVar, "Transfer-Encoding"), true);
    }

    @Override // okhttp3.internal.d.e
    public final long a(aq aqVar) {
        x.f(aqVar, "response");
        if (!okhttp3.internal.d.f.c(aqVar)) {
            return 0L;
        }
        if (v(aqVar)) {
            return -1L;
        }
        return okhttp3.internal.b.i(aqVar);
    }

    @Override // okhttp3.internal.d.e
    public final ap b(boolean z) {
        int i2 = this.f56098e;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException("state: " + i2);
        }
        try {
            com.google.android.gms.k.f.b bVar = this.f56100g;
            okhttp3.internal.d.j jVarF = com.waze.view.popups.b.b.f(bVar.c());
            ap apVarJ = new ap().j(jVarF.f56075a);
            int i3 = jVarF.f56076b;
            ap apVarF = apVarJ.d(i3).g(jVarF.f56077c).f(bVar.d());
            if (z && i3 == 100) {
                return null;
            }
            if (i3 != 100 && (i3 < 102 || i3 >= 200)) {
                this.f56098e = 4;
                return apVarF;
            }
            this.f56098e = 3;
            return apVarF;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(this.f56095b.g().c().j().g()), e2);
        }
    }

    @Override // okhttp3.internal.d.e
    public final m c() {
        return this.f56095b;
    }

    @Override // okhttp3.internal.d.e
    public final al d(okhttp3.al alVar, long j2) {
        x.f(alVar, "request");
        if (alVar.h() != null) {
            alVar.h();
        }
        if (o.m("chunked", alVar.b("Transfer-Encoding"), true)) {
            int i2 = this.f56098e;
            if (i2 == 1) {
                this.f56098e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + i2);
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i3 = this.f56098e;
        if (i3 == 1) {
            this.f56098e = 2;
            return new e(this);
        }
        throw new IllegalStateException("state: " + i3);
    }

    @Override // okhttp3.internal.d.e
    public final am e(aq aqVar) {
        x.f(aqVar, "response");
        if (!okhttp3.internal.d.f.c(aqVar)) {
            return u(0L);
        }
        if (v(aqVar)) {
            ab abVarG = aqVar.i().g();
            int i2 = this.f56098e;
            if (i2 == 4) {
                this.f56098e = 5;
                return new c(this, abVarG);
            }
            throw new IllegalStateException("state: " + i2);
        }
        long jI = okhttp3.internal.b.i(aqVar);
        if (jI != -1) {
            return u(jI);
        }
        int i3 = this.f56098e;
        if (i3 == 4) {
            this.f56098e = 5;
            this.f56095b.l();
            return new f(this);
        }
        throw new IllegalStateException("state: " + i3);
    }

    @Override // okhttp3.internal.d.e
    public final void f() {
        this.f56095b.i();
    }

    @Override // okhttp3.internal.d.e
    public final void g() {
        this.f56097d.flush();
    }

    @Override // okhttp3.internal.d.e
    public final void h() {
        this.f56097d.flush();
    }

    @Override // okhttp3.internal.d.e
    public final void i(okhttp3.al alVar) {
        x.f(alVar, "request");
        Proxy.Type type = this.f56095b.g().b().type();
        x.e(type, "type(...)");
        x.f(alVar, "request");
        x.f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(alVar.c());
        sb.append(' ');
        if (alVar.i() || type != Proxy.Type.HTTP) {
            sb.append(com.waze.view.popups.b.b.g(alVar.g()));
        } else {
            sb.append(alVar.g());
        }
        sb.append(" HTTP/1.1");
        r(alVar.f(), sb.toString());
    }

    public final void q(aq aqVar) {
        x.f(aqVar, "response");
        long jI = okhttp3.internal.b.i(aqVar);
        if (jI == -1) {
            return;
        }
        am amVarU = u(jI);
        okhttp3.internal.b.z(amVarU, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        amVarU.close();
    }

    public final void r(z zVar, String str) {
        x.f(zVar, "headers");
        x.f(str, "requestLine");
        int i2 = this.f56098e;
        if (i2 != 0) {
            throw new IllegalStateException("state: " + i2);
        }
        i iVar = this.f56097d;
        iVar.E(str).E("\r\n");
        int iA = zVar.a();
        for (int i3 = 0; i3 < iA; i3++) {
            iVar.E(zVar.c(i3)).E(": ").E(zVar.d(i3)).E("\r\n");
        }
        iVar.E("\r\n");
        this.f56098e = 1;
    }
}

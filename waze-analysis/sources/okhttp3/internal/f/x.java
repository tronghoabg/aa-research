package okhttp3.internal.f;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.al;
import k.am;
import k.ao;
import okhttp3.ap;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class x implements okhttp3.internal.d.e {

    /* renamed from: a, reason: collision with root package name */
    private static final List f56233a = okhttp3.internal.b.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: b, reason: collision with root package name */
    private static final List f56234b = okhttp3.internal.b.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: c, reason: collision with root package name */
    private final okhttp3.internal.c.m f56235c;

    /* renamed from: d, reason: collision with root package name */
    private final okhttp3.internal.d.g f56236d;

    /* renamed from: e, reason: collision with root package name */
    private final w f56237e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ad f56238f;

    /* renamed from: g, reason: collision with root package name */
    private final okhttp3.aj f56239g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f56240h;

    public x(okhttp3.ai aiVar, okhttp3.internal.c.m mVar, okhttp3.internal.d.g gVar, w wVar) {
        h.g.b.x.f(aiVar, "client");
        h.g.b.x.f(mVar, "connection");
        h.g.b.x.f(gVar, "chain");
        h.g.b.x.f(wVar, "http2Connection");
        this.f56235c = mVar;
        this.f56236d = gVar;
        this.f56237e = wVar;
        List listJ = aiVar.j();
        okhttp3.aj ajVar = okhttp3.aj.f55877e;
        this.f56239g = listJ.contains(ajVar) ? ajVar : okhttp3.aj.f55876d;
    }

    @Override // okhttp3.internal.d.e
    public final long a(aq aqVar) {
        h.g.b.x.f(aqVar, "response");
        if (okhttp3.internal.d.f.c(aqVar)) {
            return okhttp3.internal.b.i(aqVar);
        }
        return 0L;
    }

    @Override // okhttp3.internal.d.e
    public final ap b(boolean z) throws NumberFormatException, IOException {
        ad adVar = this.f56238f;
        if (adVar == null) {
            throw new IOException("stream wasn't created");
        }
        okhttp3.aj ajVar = this.f56239g;
        okhttp3.z zVarG = adVar.g();
        h.g.b.x.f(zVarG, "headerBlock");
        h.g.b.x.f(ajVar, "protocol");
        com.waze.shared_infra.coordinators.c cVar = new com.waze.shared_infra.coordinators.c((byte[]) null);
        int iA = zVarG.a();
        okhttp3.internal.d.j jVarF = null;
        for (int i2 = 0; i2 < iA; i2++) {
            String strC = zVarG.c(i2);
            String strD = zVarG.d(i2);
            if (h.g.b.x.n(strC, ":status")) {
                jVarF = com.waze.view.popups.b.b.f("HTTP/1.1 ".concat(String.valueOf(strD)));
            } else if (!f56234b.contains(strC)) {
                cVar.i(strC, strD);
            }
        }
        if (jVarF == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ap apVarF = new ap().j(ajVar).d(jVarF.f56076b).g(jVarF.f56077c).f(cVar.h());
        if (z && apVarF.a() == 100) {
            return null;
        }
        return apVarF;
    }

    @Override // okhttp3.internal.d.e
    public final okhttp3.internal.c.m c() {
        return this.f56235c;
    }

    @Override // okhttp3.internal.d.e
    public final al d(okhttp3.al alVar, long j2) {
        h.g.b.x.f(alVar, "request");
        ad adVar = this.f56238f;
        h.g.b.x.c(adVar);
        return adVar.n();
    }

    @Override // okhttp3.internal.d.e
    public final am e(aq aqVar) {
        h.g.b.x.f(aqVar, "response");
        ad adVar = this.f56238f;
        h.g.b.x.c(adVar);
        return adVar.k();
    }

    @Override // okhttp3.internal.d.e
    public final void f() {
        this.f56240h = true;
        ad adVar = this.f56238f;
        if (adVar != null) {
            adVar.u(b.f56147i);
        }
    }

    @Override // okhttp3.internal.d.e
    public final void g() {
        ad adVar = this.f56238f;
        h.g.b.x.c(adVar);
        adVar.n().close();
    }

    @Override // okhttp3.internal.d.e
    public final void h() {
        this.f56237e.y();
    }

    @Override // okhttp3.internal.d.e
    public final void i(okhttp3.al alVar) throws IOException {
        h.g.b.x.f(alVar, "request");
        if (this.f56238f != null) {
            return;
        }
        boolean z = alVar.h() != null;
        h.g.b.x.f(alVar, "request");
        okhttp3.z zVarF = alVar.f();
        ArrayList arrayList = new ArrayList(zVarF.a() + 4);
        arrayList.add(new c(c.f56153c, alVar.c()));
        arrayList.add(new c(c.f56154d, com.waze.view.popups.b.b.g(alVar.g())));
        String strB = alVar.b("Host");
        if (strB != null) {
            arrayList.add(new c(c.f56156f, strB));
        }
        arrayList.add(new c(c.f56155e, alVar.g().h()));
        int iA = zVarF.a();
        for (int i2 = 0; i2 < iA; i2++) {
            String strC = zVarF.c(i2);
            Locale locale = Locale.US;
            h.g.b.x.e(locale, "US");
            String lowerCase = strC.toLowerCase(locale);
            h.g.b.x.e(lowerCase, "toLowerCase(...)");
            if (!f56233a.contains(lowerCase) || (h.g.b.x.n(lowerCase, "te") && h.g.b.x.n(zVarF.d(i2), "trailers"))) {
                arrayList.add(new c(lowerCase, zVarF.d(i2)));
            }
        }
        this.f56238f = this.f56237e.o(arrayList, z);
        boolean z2 = this.f56240h;
        ad adVar = this.f56238f;
        if (z2) {
            h.g.b.x.c(adVar);
            adVar.u(b.f56147i);
            throw new IOException("Canceled");
        }
        h.g.b.x.c(adVar);
        ao aoVarO = adVar.o();
        okhttp3.internal.d.g gVar = this.f56236d;
        aoVarO.t(gVar.a(), TimeUnit.MILLISECONDS);
        ad adVar2 = this.f56238f;
        h.g.b.x.c(adVar2);
        adVar2.p().t(gVar.b(), TimeUnit.MILLISECONDS);
    }
}

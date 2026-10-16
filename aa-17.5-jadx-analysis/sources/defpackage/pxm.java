package defpackage;

import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class pxm implements puv {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/paintfe/PaintParametersListeningServerChannelManager");
    private final Executor b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final zhc e = new zhc();
    private final puw f;
    private final psj g;
    private final qsb h;

    public pxm(psj psjVar, qsb qsbVar, Executor executor, puw puwVar) {
        this.g = psjVar;
        this.h = qsbVar;
        this.b = executor;
        this.f = puwVar;
    }

    @Override // defpackage.puv
    public final zgp a() {
        if (!this.c.getAndSet(true)) {
            this.f.a();
            psj psjVar = this.g;
            yfy yfyVar = ylx.a;
            ygs ygsVar = new ygs();
            psb psbVar = psb.DANGEROUS_PUBLISHER_THREAD;
            ygsVar.b(pni.class, new pxn(pni.class, this, psbVar, pxn.b(psbVar, yfyVar)));
            psjVar.d(this, ygsVar.a());
            this.h.b().c(new pru(this, 12), this.b);
        }
        return wub.Z(this.e);
    }

    public final synchronized URL b() {
        return this.f.b();
    }

    public final void c() {
        puw puwVar = this.f;
        URL urlA = puwVar.c.a();
        synchronized (puwVar) {
            if (puwVar.e == null || !urlA.equals(puwVar.b)) {
                yob yobVar = puw.a;
                ((ynz) ((ynz) yobVar.f()).ai(6900)).M("Updating the server URL. Old URL: %s New URL: %s", puwVar.b, urlA);
                puwVar.b = urlA;
                synchronized (puwVar) {
                    ((ynz) ((ynz) yobVar.d()).ai(6898)).y("%s current server channel", puwVar.e == null ? "Initializing" : "Updating");
                    final puy puyVar = puwVar.d;
                    ((ynz) ((ynz) yobVar.f()).ai(6899)).M("Creating a new server channel with URL: %s, server channel factory class: %s", puwVar.b, puyVar.getClass());
                    final URL url = puwVar.b;
                    ((ynz) ((ynz) pva.a.d()).ai((char) 6904)).y("Using server %s", url);
                    if (!url.getProtocol().equals("https")) {
                        throw new IllegalStateException("Insecure server URLs are not allowed: ".concat(String.valueOf(String.valueOf(url))));
                    }
                    final CronetEngine cronetEngine = (CronetEngine) puyVar.c.a();
                    final boolean zContains = cronetEngine.getVersionString().contains("CronetHttpURLConnection");
                    if (zContains) {
                        ((ynz) ((ynz) puy.a.f()).ai((char) 6902)).u("Using OkHttp as gRPC transport");
                    } else {
                        ((ynz) ((ynz) puy.a.f()).ai((char) 6901)).u("Using Cronet as gRPC transport");
                    }
                    wub.L(new xyc() { // from class: pux
                        @Override // defpackage.xyc
                        public final Object gu() {
                            adlm adlmVarA;
                            Set setA = ((ackv) puyVar.b).a();
                            URL url2 = url;
                            if (zContains) {
                                adlmVarA = new aeau(url2.getHost(), url2.getPort()).a();
                            } else {
                                CronetEngine cronetEngine2 = cronetEngine;
                                int port = url2.getPort();
                                if (port == -1) {
                                    port = 80;
                                }
                                adlmVarA = adqw.c(url2.getHost(), port, cronetEngine2).a();
                            }
                            Iterator it = setA.iterator();
                            adix adixVarA = adlmVarA;
                            while (it.hasNext()) {
                                adixVarA = ((pus) it.next()).a(adixVarA);
                            }
                            return new put(adixVarA, adlmVarA);
                        }
                    });
                    puwVar.e = new lws();
                    puwVar.e.getClass();
                }
            }
        }
        this.e.o(null);
        if (this.d.getAndSet(true)) {
            return;
        }
        this.g.e(this);
    }
}

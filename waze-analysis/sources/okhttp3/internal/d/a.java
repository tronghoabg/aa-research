package okhttp3.internal.d;

import h.g.b.x;
import h.n.o;
import java.util.List;
import k.t;
import k.y;
import okhttp3.ac;
import okhttp3.ae;
import okhttp3.ak;
import okhttp3.al;
import okhttp3.ao;
import okhttp3.ap;
import okhttp3.aq;
import okhttp3.at;
import okhttp3.q;
import okhttp3.s;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final s f56058a;

    public a(s sVar) {
        x.f(sVar, "cookieJar");
        this.f56058a = sVar;
    }

    @Override // okhttp3.ac
    public final aq c(g gVar) {
        boolean z;
        at atVarM;
        x.f(gVar, "chain");
        al alVarF = gVar.f();
        ak akVar = new ak(alVarF);
        ao aoVarH = alVarF.h();
        if (aoVarH != null) {
            ae aeVarB = aoVarH.b();
            if (aeVarB != null) {
                akVar.c("Content-Type", aeVarB.toString());
            }
            long jA = aoVarH.a();
            if (jA != -1) {
                akVar.c("Content-Length", String.valueOf(jA));
                akVar.g("Transfer-Encoding");
            } else {
                akVar.c("Transfer-Encoding", "chunked");
                akVar.g("Content-Length");
            }
        }
        int i2 = 0;
        if (alVarF.b("Host") == null) {
            akVar.c("Host", okhttp3.internal.b.k(alVarF.g(), false));
        }
        if (alVarF.b("Connection") == null) {
            akVar.c("Connection", "Keep-Alive");
        }
        if (alVarF.b("Accept-Encoding") == null && alVarF.b("Range") == null) {
            akVar.c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        s sVar = this.f56058a;
        List listA = sVar.a(alVarF.g());
        if (!listA.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listA) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.i.p();
                }
                q qVar = (q) obj;
                if (i2 > 0) {
                    sb.append("; ");
                }
                sb.append(qVar.a());
                sb.append('=');
                sb.append(qVar.c());
                i2 = i3;
            }
            akVar.c("Cookie", sb.toString());
        }
        if (alVarF.b("User-Agent") == null) {
            akVar.c("User-Agent", "okhttp/4.12.0");
        }
        aq aqVarG = gVar.g(akVar.k());
        f.b(sVar, alVarF.g(), aqVarG.g());
        ap apVarL = new ap(aqVarG).l(alVarF);
        if (z && o.m("gzip", aq.p(aqVarG, "Content-Encoding"), true) && f.c(aqVarG) && (atVarM = aqVarG.m()) != null) {
            t tVar = new t(atVarM.c());
            apVarL.f(aqVarG.g().f().m("Content-Encoding").m("Content-Length").h());
            apVarL.b(new h(aq.p(aqVarG, "Content-Type"), -1L, y.c(tVar)));
        }
        return apVarL.n();
    }
}

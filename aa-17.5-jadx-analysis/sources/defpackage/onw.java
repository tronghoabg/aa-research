package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class onw {
    private static final yph a = yph.c("GH.SearchGrpcClient");
    private static final xyc b = wub.L(new joa(12));
    private final adlm c;
    private final xyc d;

    public onw(Context context) {
        List listB = adls.a().b();
        adlq adlqVar = listB.isEmpty() ? null : (adlq) listB.get(0);
        if (adlqVar == null) {
            throw new adlp();
        }
        adlm adlmVarA = adlqVar.b().a();
        ojk ojkVar = new ojk(context, 5);
        this.c = adlmVarA;
        this.d = ojkVar;
    }

    public static String b(Context context) {
        try {
            return (String) spu.aB(new suz(context, null, null).g(), ((Long) b.gu()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 6067)).y("Error while getting spatula header. Message: %s", e.getMessage());
            return null;
        }
    }

    private static void c(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SEARCH_API_CLIENT, yzyVar).l());
    }

    public final synchronized zkz a(zkx zkxVar) {
        aedl aedlVar;
        admf admfVarA;
        wer.b();
        woy.N((zkxVar.b & 2) != 0);
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        Object objGu = this.d.gu();
        zkz zkzVar = null;
        if (objGu == null) {
            aedlVar = null;
        } else {
            admc admcVar = new admc();
            adlu adluVar = admc.b;
            int i2 = adlx.d;
            admcVar.f(new adlt("X-Goog-Spatula", adluVar), objGu);
            aedlVar = new aedl(admcVar);
        }
        if (aedlVar == null) {
            c(yzy.Bx);
            return null;
        }
        yflVar.i(aedlVar);
        try {
            zks zksVar = (zks) zks.b(new zkr(0), adqq.E(this.c, yflVar.g()));
            try {
                adix adixVar = zksVar.a;
                admf admfVar = zkt.a;
                if (admfVar == null) {
                    synchronized (zkt.class) {
                        admfVarA = zkt.a;
                        if (admfVarA == null) {
                            xh xhVarC = admf.c();
                            xhVarC.b = adme.a;
                            xhVarC.d = admf.b("gws.mothership.api.knowledge.KnowledgeApiService", "Search");
                            xhVarC.b();
                            zkx zkxVar2 = zkx.a;
                            abnj abnjVar = aecu.a;
                            xhVarC.e = new aect(zkxVar2);
                            xhVarC.c = new aect(zkz.a);
                            admfVarA = xhVarC.a();
                            zkt.a = admfVarA;
                        }
                    }
                    admfVar = admfVarA;
                }
                zkz zkzVar2 = (zkz) aedi.a(adixVar, admfVar, zksVar.b, zkxVar);
                c(yzy.Bw);
                zkzVar = zkzVar2;
            } catch (adnt e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(6066)).y("Error while getting search result. Message: %s", e.getMessage());
                c(yzy.By);
            }
            return zkzVar;
        } finally {
            this.c.c();
        }
    }
}

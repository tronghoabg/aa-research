package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ulo {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/PaintNetworkTileFetcher");
    public final ydj b;
    public final zgt c;
    public final erb d;
    private final AtomicInteger e;
    private final pyh f;
    private final pwr g;
    private final Map h;
    private List i;
    private final tpd j;
    private final xyc k;
    private final xyc l;
    private final xyc m;
    private final qsb n;

    public ulo(pyh pyhVar, zgt zgtVar, pwr pwrVar, qsb qsbVar, uzw uzwVar, erb erbVar, aezk aezkVar, tpd tpdVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        woy.S(concurrentHashMap.isEmpty(), "the backing map (%s) must be empty", concurrentHashMap);
        this.b = new ydj(concurrentHashMap);
        this.e = new AtomicInteger(0);
        this.h = new HashMap();
        this.f = pyhVar;
        this.c = zgtVar;
        this.g = pwrVar;
        pwrVar.a().a(uzwVar);
        this.n = qsbVar;
        this.d = erbVar;
        this.i = new ArrayList();
        this.j = tpdVar;
        this.m = wub.L(new uai(aezkVar, 8));
        this.k = wub.L(new uai(aezkVar, 9));
        this.l = wub.L(new uai(aezkVar, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static abgl f(ulr ulrVar) {
        yfq yfqVar = ulrVar.b;
        woy.O(!yfqVar.isEmpty(), "No tile requests found in the batch.");
        return ((ulq) yfqVar.get(0)).a;
    }

    private final void i() {
        this.i.clear();
        this.i = new ArrayList();
    }

    private final void j(ulq ulqVar) {
        String strU = this.j.u(ulqVar.a);
        abnp abnpVarN = zbu.a.n();
        abnp abnpVarN2 = zqq.a.n();
        abnp abnpVarN3 = zqp.a.n();
        abnpVarN3.t();
        zqp zqpVar = (zqp) abnpVarN3.b;
        strU.getClass();
        zqpVar.b |= 1;
        zqpVar.c = strU;
        abnpVarN3.t();
        zqp zqpVar2 = (zqp) abnpVarN3.b;
        zqpVar2.d = 1;
        zqpVar2.b |= 2;
        abnpVarN2.t();
        zqq zqqVar = (zqq) abnpVarN2.b;
        zqp zqpVar3 = (zqp) abnpVarN3.q();
        zqpVar3.getClass();
        zqqVar.c = zqpVar3;
        zqqVar.b |= 64;
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqq zqqVar2 = (zqq) abnpVarN2.q();
        zqqVar2.getClass();
        zbuVar.s = zqqVar2;
        zbuVar.e |= 2;
    }

    private final void k(ulq ulqVar) {
        if (!((Boolean) this.m.gu()).booleanValue()) {
        } else {
            j(ulqVar);
        }
    }

    public final synchronized List a(xxi xxiVar) {
        List list;
        Map map = this.h;
        list = (List) map.get(xxiVar);
        list.getClass();
        map.remove(xxiVar);
        return list;
    }

    public final synchronized void b(String str, PrintWriter printWriter) {
        printWriter.println(str + "requestsForNextBatch.size(): " + this.i.size());
        printWriter.println(str + "sendRpcCount: " + this.e.get());
        printWriter.println(str + "responses: " + this.b.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x001b, B:9:0x0021, B:12:0x0026, B:18:0x0054, B:19:0x0057, B:21:0x005e, B:25:0x006e, B:27:0x007c, B:30:0x0085, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c2, B:47:0x00c7, B:51:0x00d6, B:53:0x00e3, B:55:0x00eb, B:56:0x0102, B:58:0x0110, B:50:0x00ce, B:34:0x0096, B:15:0x0042), top: B:66:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x001b, B:9:0x0021, B:12:0x0026, B:18:0x0054, B:19:0x0057, B:21:0x005e, B:25:0x006e, B:27:0x007c, B:30:0x0085, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c2, B:47:0x00c7, B:51:0x00d6, B:53:0x00e3, B:55:0x00eb, B:56:0x0102, B:58:0x0110, B:50:0x00ce, B:34:0x0096, B:15:0x0042), top: B:66:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x001b, B:9:0x0021, B:12:0x0026, B:18:0x0054, B:19:0x0057, B:21:0x005e, B:25:0x006e, B:27:0x007c, B:30:0x0085, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c2, B:47:0x00c7, B:51:0x00d6, B:53:0x00e3, B:55:0x00eb, B:56:0x0102, B:58:0x0110, B:50:0x00ce, B:34:0x0096, B:15:0x0042), top: B:66:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x001b, B:9:0x0021, B:12:0x0026, B:18:0x0054, B:19:0x0057, B:21:0x005e, B:25:0x006e, B:27:0x007c, B:30:0x0085, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c2, B:47:0x00c7, B:51:0x00d6, B:53:0x00e3, B:55:0x00eb, B:56:0x0102, B:58:0x0110, B:50:0x00ce, B:34:0x0096, B:15:0x0042), top: B:66:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110 A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x001b, B:9:0x0021, B:12:0x0026, B:18:0x0054, B:19:0x0057, B:21:0x005e, B:25:0x006e, B:27:0x007c, B:30:0x0085, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c2, B:47:0x00c7, B:51:0x00d6, B:53:0x00e3, B:55:0x00eb, B:56:0x0102, B:58:0x0110, B:50:0x00ce, B:34:0x0096, B:15:0x0042), top: B:66:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(defpackage.ulq r8) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulo.c(ulq):void");
    }

    public final void d(List list) {
        if (((Boolean) this.m.gu()).booleanValue()) {
            j((ulq) list.get(0));
            list.size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ackk, java.lang.Object] */
    public final void e(List list) {
        if (list.isEmpty()) {
            return;
        }
        qsb qsbVar = this.n;
        ulr ulrVar = new ulr(yfq.o(list), (yfq) qsbVar.a, (rjr) qsbVar.b, (plq) qsbVar.d.a());
        this.e.incrementAndGet();
        try {
            yfq yfqVar = ulrVar.b;
            woy.O(!yfqVar.isEmpty(), "No tile requests present in the batch. Can't create a PaintRequest.");
            abgj abgjVar = ulrVar.c;
            if (abgjVar == null) {
                throw new IllegalArgumentException("No paint request template found for given tile type: ".concat(String.valueOf(ulrVar.g.name())));
            }
            abnr abnrVar = (abnr) abgjVar.K();
            abnrVar.t();
            ((abgj) abnrVar.b).c = abpf.b;
            int size = yfqVar.size();
            for (int i = 0; i < size; i++) {
                ulq ulqVar = (ulq) yfqVar.get(i);
                abnp abnpVarN = abgt.a.n();
                abnp abnpVarN2 = abls.a.n();
                ukp ukpVar = ulqVar.b;
                int i2 = ukpVar.a;
                abnpVarN2.t();
                abls ablsVar = (abls) abnpVarN2.b;
                ablsVar.b |= 1;
                ablsVar.c = i2;
                int i3 = ukpVar.b;
                abnpVarN2.t();
                abls ablsVar2 = (abls) abnpVarN2.b;
                ablsVar2.b |= 2;
                ablsVar2.d = i3;
                int i4 = ukpVar.c;
                abnpVarN2.t();
                abls ablsVar3 = (abls) abnpVarN2.b;
                ablsVar3.b |= 4;
                ablsVar3.e = i4;
                abls ablsVar4 = (abls) abnpVarN2.q();
                abnpVarN.t();
                abgt abgtVar = (abgt) abnpVarN.b;
                ablsVar4.getClass();
                abgtVar.c = ablsVar4;
                abgtVar.b |= 1;
                String str = ulqVar.c;
                abnpVarN.t();
                abgt abgtVar2 = (abgt) abnpVarN.b;
                abgtVar2.b |= 64;
                abgtVar2.e = str;
                if (!ulqVar.d) {
                    abnpVarN.t();
                    abgt abgtVar3 = (abgt) abnpVarN.b;
                    abgtVar3.b |= 128;
                    abgtVar3.f = false;
                }
                abnrVar.bf((abgt) abnpVarN.q());
            }
            abgm abgmVar = ((abgj) abnrVar.b).e;
            if (abgmVar == null) {
                abgmVar = abgm.a;
            }
            abnp abnpVarK = abgmVar.K();
            String str2 = ulrVar.e;
            abnpVarK.t();
            abgm abgmVar2 = (abgm) abnpVarK.b;
            str2.getClass();
            abgmVar2.b |= 1;
            abgmVar2.c = str2;
            String str3 = ulrVar.f;
            abnpVarK.t();
            abgm abgmVar3 = (abgm) abnpVarK.b;
            str3.getClass();
            abgmVar3.b |= 2;
            abgmVar3.d = str3;
            abgm abgmVar4 = (abgm) abnpVarK.q();
            abnrVar.t();
            abgj abgjVar2 = (abgj) abnrVar.b;
            abgmVar4.getClass();
            abgjVar2.e = abgmVar4;
            abgjVar2.b |= 2;
            pxj pxjVar = null;
            tzy tzyVar = ulrVar.g == abgl.GMM_INDOOR ? ((ulq) yfqVar.get(0)).b.d : null;
            yfq yfqVar2 = ulrVar.d;
            int i5 = ((yls) yfqVar2).c;
            for (int i6 = 0; i6 < i5; i6++) {
                ((ulp) yfqVar2.get(i6)).b(tzyVar, abnrVar);
            }
            abgj abgjVar3 = (abgj) abnrVar.q();
            pwr pwrVar = this.g;
            pwo pwoVarA = pwrVar.a();
            pwoVarA.k = yfqVar.isEmpty() ? new vky("EMPTY") : vky.d(null, f(ulrVar));
            try {
                if (((Boolean) this.l.gu()).booleanValue()) {
                    abnp abnpVarK2 = new pwp(pwoVarA).b.K();
                    if (!yfqVar.isEmpty()) {
                        int i7 = ((ulq) yfqVar.get(0)).f;
                        int i8 = ((ulq) yfqVar.get(0)).f;
                    }
                    abnpVarK2.t();
                    uzv uzvVar = (uzv) abnpVarK2.b;
                    uzvVar.l = 0;
                    uzvVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                    pwoVarA.a = (uzv) abnpVarK2.q();
                }
                boolean z = !yfqVar.isEmpty() && Collection.EL.stream(yfqVar).anyMatch(new oly(20));
                if (((Boolean) this.k.gu()).booleanValue() && z) {
                    pxjVar = ((ulq) yfqVar.get(0)).e;
                }
                pwoVarA.l = pxjVar;
                pwrVar.b().a(abgjVar3, new uln(this, ulrVar, abgjVar3), this.c);
            } catch (IllegalArgumentException e) {
                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai((char) 9418)).u("Received error in creating the Paint request proto. Error:");
                pwu pwuVarC = pwu.c(e);
                g(ulrVar, pwuVarC);
                uqw.ai(this.d, f(ulrVar), pwuVarC.a());
                this.b.h(pwuVarC.a(), 1);
                d(ulrVar.b);
                h(abgjVar3, ulrVar);
            }
        } catch (IllegalArgumentException e2) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e2)).ai((char) 9419)).u("Received error in creating the Paint request proto. Refreshing client parameters. Error:");
            pwu pwuVar = pwu.o;
            g(ulrVar, pwuVar);
            uqw.ai(this.d, f(ulrVar), pwuVar.a());
            this.b.h(pwuVar.a(), 1);
            d(ulrVar.b);
        }
    }

    public final void g(ulr ulrVar, pwu pwuVar) {
        Iterator<E> it = ulrVar.b.iterator();
        while (it.hasNext()) {
            Iterator it2 = a(((ulq) it.next()).a()).iterator();
            while (it2.hasNext()) {
                urg urgVar = ((ulq) it2.next()).g;
                Object obj = urgVar.a;
                ((unb) obj).j.execute(new rdz(urgVar, urgVar.b, pwuVar, 18));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(abgj abgjVar, ulr ulrVar) {
        if (((Boolean) this.m.gu()).booleanValue()) {
            j((ulq) ulrVar.b.get(0));
            abgjVar.e(null);
        }
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Parcelable;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class szh {
    public static final yph a = yph.c("CarAssistantClient");
    public static final adod b = adod.a(new ComponentName(RemoteApiConstants.NOW_PACKAGE, "com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.CarAssistantService"));
    public static final szb c = new szb();
    public final aezr d;
    public final aezr e;
    public final aezr f;
    public final wyd g;
    private syp h;
    private aedp i;
    private final szc j;
    private final szd k;
    private aedp l;
    private final Map m;
    private final szd n;

    public szh(final Context context, wyd wydVar, final Executor executor, final wyd wydVar2) {
        xyc xycVar = new xyc() { // from class: syz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.xyc
            public final Object gu() {
                yfq yfqVar;
                yph yphVar = szh.a;
                boolean zO = wydVar2.o();
                Context context2 = context;
                Executor executor2 = executor;
                if (!zO) {
                    return spu.ba(context2, executor2).a();
                }
                zhr zhrVar = new zhr();
                zhrVar.a();
                zhrVar.e = acmd.c();
                zhrVar.g = (byte) (zhrVar.g | 16);
                zhrVar.c = (float) acmd.d();
                zhrVar.g = (byte) (zhrVar.g | 4);
                zhrVar.b = (int) acmd.l();
                zhrVar.g = (byte) (zhrVar.g | 2);
                zhrVar.d = (float) acmd.e();
                zhrVar.g = (byte) (zhrVar.g | 8);
                zhrVar.f = yfq.q(adnn.UNAVAILABLE);
                zhrVar.a();
                if (zhrVar.g != 31 || (yfqVar = zhrVar.f) == null) {
                    StringBuilder sb = new StringBuilder();
                    if ((zhrVar.g & 1) == 0) {
                        sb.append(" enabled");
                    }
                    if ((zhrVar.g & 2) == 0) {
                        sb.append(" maxAttempts");
                    }
                    if ((zhrVar.g & 4) == 0) {
                        sb.append(" initialBackoffSeconds");
                    }
                    if ((zhrVar.g & 8) == 0) {
                        sb.append(" maxBackoffSeconds");
                    }
                    if ((zhrVar.g & 16) == 0) {
                        sb.append(" backoffMultiplier");
                    }
                    if (zhrVar.f == null) {
                        sb.append(" retryableStatusCodes");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                zhs zhsVar = new zhs(zhrVar.a, zhrVar.b, zhrVar.c, zhrVar.d, zhrVar.e, yfqVar);
                int i = zhsVar.b;
                woy.ab(i >= 2, "maxAttempts must be greater than or equal to 2. Was %s", i);
                double d = zhsVar.c;
                Double dValueOf = Double.valueOf(d);
                woy.ad(d > 0.0d, "Initial backoff seconds must be greater than 0. Was %s", dValueOf);
                double d2 = zhsVar.d;
                woy.af(d2 > d, "maxBackoffSeconds must be greater than initialBackoffSeconds. Were %s and %s, respectively", Double.valueOf(d2), dValueOf);
                double d3 = zhsVar.e;
                woy.ad(d3 >= 1.0d, "backoffMultiplier must be greater than or equal to 1. Was %s", Double.valueOf(d3));
                woy.aa(!zhsVar.f.isEmpty(), "retryableStatusCodes may not be empty.");
                zhu zhuVar = new zhu(new ymp(new zht(zhsVar)));
                yca ycaVar = new yca(12, 3);
                ygr ygrVar = zhuVar.a;
                yno it = ygrVar.iterator();
                while (it.hasNext()) {
                    String str = ((zht) it.next()).a;
                    woy.Z(!ycaVar.y(str, null));
                    ycaVar.t(str, null);
                }
                adoh adohVarBa = spu.ba(context2, executor2);
                yfl yflVar = new yfl(4);
                yno it2 = ygrVar.iterator();
                while (it2.hasNext()) {
                    zht zhtVar = (zht) it2.next();
                    yfu yfuVar = new yfu(4);
                    yfu yfuVar2 = new yfu(4);
                    yfuVar2.e("service", zhtVar.a);
                    yfuVar.e("name", yfq.q(yfuVar2.d(true)));
                    zhs zhsVar2 = zhtVar.b;
                    if (zhsVar2 != null && zhsVar2.a) {
                        yfu yfuVar3 = new yfu(4);
                        yfuVar3.e("maxAttempts", Double.valueOf(zhsVar2.b));
                        yfuVar3.e("initialBackoff", zhsVar2.c + "s");
                        yfuVar3.e("maxBackoff", zhsVar2.d + "s");
                        yfuVar3.e("backoffMultiplier", Double.valueOf(zhsVar2.e));
                        yfuVar3.e("retryableStatusCodes", yrm.V(zhsVar2.f, new ykz(4)));
                        yfuVar.h(yfy.k("retryPolicy", yfuVar3.d(true)));
                    }
                    yflVar.i(yfuVar.d(true));
                }
                yfy yfyVarK = yfy.k("methodConfig", yflVar.g());
                adwb adwbVar = adohVarBa.a;
                adwbVar.s = adwb.c(yfyVarK);
                adwbVar.q = true;
                return adohVarBa.a();
            }
        };
        this.g = wydVar;
        this.d = new aezy(new ngz(xycVar, 16));
        this.e = new aezy(new ngz(this, 17));
        this.f = new aezy(new ngz(this, 18));
        this.n = new szd(this, 1);
        this.j = new szc();
        this.k = new szd(this, 0);
        this.m = new LinkedHashMap();
    }

    private final synchronized void m(szy szyVar) {
        admf admfVarA;
        aecv aecvVar = (aecv) this.e.a();
        adix adixVar = aecvVar.a;
        admf admfVar = szp.f;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.f;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "SendGearheadSignal");
                    xhVarC.b();
                    szy szyVar2 = szy.a;
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(szyVar2);
                    xhVarC.c = new aect(szz.a);
                    admfVarA = xhVarC.a();
                    szp.f = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(adixVar.d(admfVar, aecvVar.b), szyVar, this.j);
    }

    public final synchronized void a() {
        ((ype) a.f()).u("#closeConnection");
        aedp aedpVar = this.i;
        if (aedpVar != null) {
            abnp abnpVarN = szs.a.n();
            abnpVarN.getClass();
            abnp abnpVarN2 = szr.a.n();
            abnpVarN2.getClass();
            abnv abnvVarQ = abnpVarN2.q();
            abnvVarQ.getClass();
            abnpVarN.t();
            szs szsVar = (szs) abnpVarN.b;
            szsVar.c = (szr) abnvVarQ;
            szsVar.b = 2;
            aedpVar.c(szp.b(abnpVarN));
            aedpVar.a();
            lau.b(ywj.SERVICE_CLOSED_DODGEBOOST);
        }
        this.i = null;
    }

    public final synchronized void b(syp sypVar) {
        admf admfVarA;
        this.h = sypVar;
        aecv aecvVar = (aecv) this.e.a();
        tae taeVar = tae.a;
        abnp abnpVarN = taeVar.n();
        abnpVarN.getClass();
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        tae taeVar2 = (tae) abnvVarQ;
        sza szaVar = new sza(this, sypVar);
        adix adixVar = aecvVar.a;
        admf admfVar = szp.a;
        if (admfVar == null) {
            synchronized (szp.class) {
                admf admfVar2 = szp.a;
                if (admfVar2 == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetAssistantFeatureFlags");
                    xhVarC.b();
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(taeVar);
                    xhVarC.c = new aect(taf.a);
                    admfVarA = xhVarC.a();
                    szp.a = admfVarA;
                } else {
                    admfVarA = admfVar2;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(adixVar.d(admfVar, aecvVar.b), taeVar2, szaVar);
    }

    public final void c(boolean z) {
        syp sypVar;
        synchronized (this) {
            this.i = null;
            if (z && (sypVar = this.h) != null) {
                syp sypVar2 = ((syx) sypVar).b;
                synchronized (((syx) sypVar).a) {
                    wer.e(new shd(sypVar2, 7));
                }
            }
            this.h = null;
            ((adlm) this.d.a()).b();
        }
    }

    public final synchronized void d() {
        aedp aedpVar = this.l;
        if (aedpVar != null) {
            aedpVar.a();
        }
        this.l = null;
    }

    public final synchronized void e() {
        admf admfVarA;
        if (this.l != null) {
            ((ype) a.e()).u("Skip starting media rec callback stream.");
            return;
        }
        ((ype) a.e()).u("#startMediaRecommendationCallbackStream");
        aecv aecvVar = (aecv) this.e.a();
        szd szdVar = this.k;
        adix adixVar = aecvVar.a;
        admf admfVar = szp.h;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.h;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.d;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "MediaRecommendationCallbacks");
                    xhVarC.b();
                    szx szxVar = szx.a;
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(szxVar);
                    xhVarC.c = new aect(tai.a);
                    admfVarA = xhVarC.a();
                    szp.h = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        adqq adqqVarD = adixVar.d(admfVar, aecvVar.b);
        adiv adivVar = aedi.b;
        szdVar.getClass();
        aedp aedpVarC = aedi.c(adqqVarD, szdVar, true);
        abnp abnpVarN = szx.a.n();
        abnpVarN.getClass();
        abnp abnpVarN2 = tam.a.n();
        abnpVarN2.getClass();
        abnv abnvVarQ = abnpVarN2.q();
        abnvVarQ.getClass();
        abnpVarN.t();
        szx szxVar2 = (szx) abnpVarN.b;
        szxVar2.c = (tam) abnvVarQ;
        szxVar2.b = 1 | szxVar2.b;
        abnv abnvVarQ2 = abnpVarN.q();
        abnvVarQ2.getClass();
        aedpVarC.c((szx) abnvVarQ2);
        this.l = aedpVarC;
    }

    public final synchronized void f(szq szqVar, int i) {
        admf admfVarA;
        aecv aecvVar = (aecv) this.e.a();
        adix adixVar = aecvVar.a;
        admf admfVar = szp.b;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.b;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.b;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "Connection");
                    xhVarC.b();
                    szs szsVar = szs.a;
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(szsVar);
                    xhVarC.c = new aect(szt.a);
                    admfVarA = xhVarC.a();
                    szp.b = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        szd szdVar = this.n;
        adqq adqqVarD = adixVar.d(admfVar, aecvVar.b);
        adiv adivVar = aedi.b;
        szdVar.getClass();
        aedp aedpVarC = aedi.c(adqqVarD, szdVar, false);
        abnp abnpVarN = szs.a.n();
        abnpVarN.getClass();
        abnp abnpVarN2 = tal.a.n();
        abnpVarN2.getClass();
        abnpVarN2.t();
        tal talVar = (tal) abnpVarN2.b;
        talVar.c = szqVar;
        talVar.b |= 1;
        abnpVarN2.t();
        tal talVar2 = (tal) abnpVarN2.b;
        talVar2.b |= 2;
        talVar2.d = i;
        abnv abnvVarQ = abnpVarN2.q();
        abnvVarQ.getClass();
        abnpVarN.t();
        szs szsVar2 = (szs) abnpVarN.b;
        szsVar2.c = (tal) abnvVarQ;
        szsVar2.b = 1;
        aedpVarC.c(szp.b(abnpVarN));
        this.i = aedpVarC;
    }

    public final synchronized void g(osw oswVar) {
        abnp abnpVarN = szy.a.n();
        abnpVarN.getClass();
        abnpVarN.t();
        szy szyVar = (szy) abnpVarN.b;
        szyVar.c = oswVar;
        szyVar.b = 1;
        m(tss.v(abnpVarN));
    }

    public final synchronized void h(tak takVar, afec afecVar, boolean z) {
        admf admfVarA;
        szm szmVar = szm.a;
        abnp abnpVarN = szmVar.n();
        abnpVarN.getClass();
        szm szmVarW = tss.w(abnpVarN);
        aecv aecvVar = (aecv) this.e.a();
        Integer numValueOf = Integer.valueOf(takVar.c);
        Map map = this.m;
        if (map.containsKey(numValueOf)) {
            int i = takVar.d;
            Object obj = map.get(Integer.valueOf(takVar.c));
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List list = (List) obj;
            if (i > 0 && i < list.size()) {
                admc admcVar = new admc();
                if (z) {
                    tbe tbeVarA = szk.a((MessagingInfo) list.get(i));
                    abnp abnpVarK = szmVarW.K();
                    abnpVarK.getClass();
                    tss.x(tbeVarA.a, abnpVarK);
                    tss.A(abnpVarK);
                    NotificationInfoParcelables notificationInfoParcelables = tbeVarA.b;
                    szmVarW = tss.w(abnpVarK);
                    zkt.w(szl.b, notificationInfoParcelables, admcVar);
                } else {
                    abnp abnpVarK2 = szmVarW.K();
                    abnpVarK2.getClass();
                    tss.z(abnpVarK2);
                    szmVarW = tss.w(abnpVarK2);
                    zkt.w(szl.a, (Parcelable) list.get(i), admcVar);
                }
                aecvVar = (aecv) aecvVar.c(new aedl(admcVar));
                int i2 = i + 1;
                if (i2 < list.size()) {
                    abnp abnpVarK3 = szmVarW.K();
                    abnpVarK3.getClass();
                    abnp abnpVarN2 = tak.a.n();
                    abnpVarN2.getClass();
                    szp.h(takVar.c, abnpVarN2);
                    szp.g(i2, abnpVarN2);
                    tss.y(szp.f(abnpVarN2), abnpVarK3);
                    szmVarW = tss.w(abnpVarK3);
                } else {
                    map.remove(Integer.valueOf(takVar.c));
                }
            }
        }
        sze szeVar = new sze(this, afecVar, z);
        admf admfVar = szp.e;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.e;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "SendActiveNotification");
                    xhVarC.b();
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(szmVar);
                    xhVarC.c = new aect(taj.a);
                    admfVarA = xhVarC.a();
                    szp.e = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(aecvVar.a.d(admfVar, aecvVar.b), szmVarW, szeVar);
    }

    public final synchronized void i(osa osaVar) {
        abnp abnpVarN = szy.a.n();
        abnpVarN.getClass();
        abnpVarN.t();
        szy szyVar = (szy) abnpVarN.b;
        szyVar.c = osaVar;
        szyVar.b = 3;
        m(tss.v(abnpVarN));
    }

    public final synchronized void j(osb osbVar) {
        abnp abnpVarN = szy.a.n();
        abnpVarN.getClass();
        abnpVarN.t();
        szy szyVar = (szy) abnpVarN.b;
        szyVar.c = osbVar;
        szyVar.b = 2;
        m(tss.v(abnpVarN));
    }

    public final synchronized void k(orn ornVar, ork orkVar, List list, boolean z, afec afecVar, boolean z2, Runnable runnable) {
        admf admfVarA;
        szm szmVarW;
        Map map = this.m;
        map.clear();
        aecv aecvVar = (aecv) this.e.a();
        tav tavVar = tav.a;
        abnp abnpVarN = tavVar.n();
        abnpVarN.getClass();
        abnpVarN.t();
        tav tavVar2 = (tav) abnpVarN.b;
        tavVar2.c = ornVar;
        tavVar2.b |= 1;
        abnpVarN.t();
        tav tavVar3 = (tav) abnpVarN.b;
        tavVar3.d = orkVar;
        tavVar3.b |= 2;
        abnpVarN.t();
        tav tavVar4 = (tav) abnpVarN.b;
        tavVar4.b |= 8;
        tavVar4.f = z;
        abnp abnpVarN2 = tad.a.n();
        abnpVarN2.getClass();
        abpt abptVar = ornVar.i;
        if (abptVar == null) {
            abptVar = abpt.a;
        }
        abptVar.getClass();
        abnpVarN2.t();
        tad tadVar = (tad) abnpVarN2.b;
        tadVar.c = abptVar;
        tadVar.b |= 1;
        abnpVarN2.t();
        tad tadVar2 = (tad) abnpVarN2.b;
        tadVar2.d = aclh.d(3);
        tadVar2.b |= 4;
        abnv abnvVarQ = abnpVarN2.q();
        abnvVarQ.getClass();
        abnpVarN.t();
        tav tavVar5 = (tav) abnpVarN.b;
        tavVar5.g = (tad) abnvVarQ;
        tavVar5.b |= 16;
        tav tavVarO = szp.o(abnpVarN);
        if (!list.isEmpty()) {
            abnp abnpVarN3 = szm.a.n();
            abnpVarN3.getClass();
            szm szmVarW2 = tss.w(abnpVarN3);
            admc admcVar = new admc();
            if (z2) {
                tbe tbeVarA = szk.a((MessagingInfo) list.get(0));
                zkt.w(szl.b, tbeVarA.b, admcVar);
                abnp abnpVarK = szmVarW2.K();
                abnpVarK.getClass();
                tss.x(tbeVarA.a, abnpVarK);
                tss.A(abnpVarK);
                szmVarW = tss.w(abnpVarK);
            } else {
                zkt.w(szl.a, (Parcelable) list.get(0), admcVar);
                abnp abnpVarK2 = szmVarW2.K();
                abnpVarK2.getClass();
                tss.z(abnpVarK2);
                szmVarW = tss.w(abnpVarK2);
            }
            aecvVar = (aecv) aecvVar.c(new aedl(admcVar));
            if (list.size() > 1) {
                int iNextInt = xxq.a.nextInt();
                map.put(Integer.valueOf(iNextInt), list);
                abnp abnpVarK3 = szmVarW.K();
                abnpVarK3.getClass();
                abnp abnpVarN4 = tak.a.n();
                abnpVarN4.getClass();
                szp.h(iNextInt, abnpVarN4);
                szp.g(1, abnpVarN4);
                tss.y(szp.f(abnpVarN4), abnpVarK3);
                szmVarW = tss.w(abnpVarK3);
            }
            abnp abnpVarK4 = tavVarO.K();
            abnpVarK4.getClass();
            abnpVarK4.t();
            tav tavVar6 = (tav) abnpVarK4.b;
            tavVar6.e = szmVarW;
            tavVar6.b |= 4;
            tavVarO = szp.o(abnpVarK4);
        }
        szg szgVar = new szg(this, afecVar, z2, runnable);
        admf admfVar = szp.c;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.c;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "StartAssistantSession");
                    xhVarC.b();
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(tavVar);
                    xhVarC.c = new aect(taw.a);
                    admfVarA = xhVarC.a();
                    szp.c = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(aecvVar.a.d(admfVar, aecvVar.b), tavVarO, szgVar);
    }

    public final void l() {
        this.l = null;
    }
}

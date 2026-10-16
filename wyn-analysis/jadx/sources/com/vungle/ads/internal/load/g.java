package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33047a;

    /* renamed from: b, reason: collision with root package name */
    public final VungleApiClient f33048b;

    /* renamed from: c, reason: collision with root package name */
    public final com.vungle.ads.internal.executor.a f33049c;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.omsdk.c f33050d;

    /* renamed from: e, reason: collision with root package name */
    public final com.vungle.ads.internal.downloader.m f33051e;

    /* renamed from: f, reason: collision with root package name */
    public final PathProvider f33052f;

    /* renamed from: g, reason: collision with root package name */
    public final b f33053g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f33054h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f33055i;

    /* renamed from: j, reason: collision with root package name */
    public a f33056j;
    public AtomicBoolean k;

    /* renamed from: l, reason: collision with root package name */
    public AtomicBoolean f33057l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f33058m;

    /* renamed from: n, reason: collision with root package name */
    public h0 f33059n;

    /* renamed from: o, reason: collision with root package name */
    public AtomicBoolean f33060o;

    /* renamed from: p, reason: collision with root package name */
    public AtomicBoolean f33061p;

    /* renamed from: q, reason: collision with root package name */
    public final n2 f33062q;

    /* renamed from: r, reason: collision with root package name */
    public m2 f33063r;

    /* renamed from: s, reason: collision with root package name */
    public m2 f33064s;

    /* renamed from: t, reason: collision with root package name */
    public n2 f33065t;

    /* renamed from: u, reason: collision with root package name */
    public n2 f33066u;

    /* renamed from: v, reason: collision with root package name */
    public n2 f33067v;

    /* renamed from: w, reason: collision with root package name */
    public n2 f33068w;

    /* renamed from: x, reason: collision with root package name */
    public s f33069x;

    /* renamed from: y, reason: collision with root package name */
    public long f33070y;

    public g(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(vungleApiClient, "vungleApiClient");
        AbstractC3340k.e(sdkExecutors, "sdkExecutors");
        AbstractC3340k.e(omInjector, "omInjector");
        AbstractC3340k.e(downloader, "downloader");
        AbstractC3340k.e(pathProvider, "pathProvider");
        AbstractC3340k.e(adRequest, "adRequest");
        this.f33047a = context;
        this.f33048b = vungleApiClient;
        this.f33049c = sdkExecutors;
        this.f33050d = omInjector;
        this.f33051e = downloader;
        this.f33052f = pathProvider;
        this.f33053g = adRequest;
        this.f33054h = new AtomicLong(0L);
        this.f33055i = new LinkedHashSet();
        this.k = new AtomicBoolean(false);
        this.f33057l = new AtomicBoolean(false);
        this.f33058m = new ArrayList();
        this.f33060o = new AtomicBoolean(true);
        this.f33061p = new AtomicBoolean(true);
        this.f33062q = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.f33063r = new m2(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.f33064s = new m2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.f33065t = new n2(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.f33066u = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.f33067v = new n2(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.f33068w = new n2(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    public final com.vungle.ads.internal.executor.a g() {
        return this.f33049c;
    }

    public final VungleApiClient h() {
        return this.f33048b;
    }

    public abstract void i();

    public final void j() {
        h0 h0Var = this.f33059n;
        if (h0Var == null || this.f33057l.get() || !this.k.compareAndSet(false, true)) {
            return;
        }
        if (h0Var.G()) {
            this.f33068w.e();
            String strValueOf = String.valueOf(h0Var.p());
            boolean z2 = u.f33874a;
            t.c("BaseAdLoader", "start preloading");
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f33070y;
            ReentrantLock reentrantLock = e0.f33519a;
            e0.a(this.f33047a, h0Var, this.f33053g.c(), strValueOf, h0Var.v(), new e(this, h0Var), Long.valueOf(jCurrentTimeMillis));
        } else {
            i();
            a aVar = this.f33056j;
            if (aVar != null) {
                aVar.onSuccess(h0Var);
            }
        }
        ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) Fe.c.y(EnumC2526j.f34667a, new f(this.f33047a)).getValue())).a(com.vungle.ads.internal.task.k.a());
    }

    public abstract void k();

    public static final void a(g gVar, b bVar) throws Throwable {
        gVar.getClass();
        boolean z2 = u.f33874a;
        t.a("BaseAdLoader", "All download completed " + bVar);
        h0 h0Var = gVar.f33059n;
        if (h0Var != null) {
            h0Var.f33182f = true;
        }
        gVar.j();
        gVar.f33065t.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, gVar.f33065t, gVar.f33069x, 4);
        gVar.f33067v.d();
        AnalyticsClient.a(analyticsClient, gVar.f33067v, gVar.f33069x, 4);
    }

    public static final void g(g gVar) throws Throwable {
        gVar.f33066u.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, gVar.f33066u, gVar.f33069x, 4);
        gVar.j();
    }

    public static final void h(g this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.f33062q.e();
        this$0.k();
    }

    public final b b() {
        return this.f33053g;
    }

    public final h0 c() {
        return this.f33059n;
    }

    public final Context d() {
        return this.f33047a;
    }

    public final s e() {
        return this.f33069x;
    }

    public final PathProvider f() {
        return this.f33052f;
    }

    public static final boolean a(g gVar, com.vungle.ads.internal.model.b bVar, h0 h0Var) {
        gVar.getClass();
        if (h0Var != null && bVar.i() && bVar.f33115c.length() != 0) {
            File file = new File(bVar.f33115c);
            if (file.exists() && file.length() == bVar.f33120h) {
                File fileB = gVar.f33052f.b(h0Var.h());
                if (fileB != null && fileB.isDirectory()) {
                    com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.f33857a;
                    return true;
                }
                boolean z2 = u.f33874a;
                t.b("BaseAdLoader", "Unable to access Destination Directory");
            }
        }
        return false;
    }

    public final void a(s sVar) {
        this.f33069x = sVar;
    }

    public final void a(com.vungle.ads.internal.s adLoaderCallback) {
        AbstractC3340k.e(adLoaderCallback, "adLoaderCallback");
        this.f33056j = adLoaderCallback;
        this.f33070y = System.currentTimeMillis();
        ((com.vungle.ads.internal.executor.d) this.f33049c).b().execute(new C8.g(this, 1));
    }

    public final void a() {
        com.vungle.ads.internal.downloader.h hVar = (com.vungle.ads.internal.downloader.h) this.f33051e;
        Iterator it = hVar.f32956d.iterator();
        while (it.hasNext()) {
            com.vungle.ads.internal.downloader.k kVar = (com.vungle.ads.internal.downloader.k) it.next();
            if (kVar != null && !kVar.f32965e.get()) {
                kVar.f32965e.set(true);
            }
        }
        hVar.f32956d.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[EDGE_INSN: B:54:0x0096->B:40:0x0096 BREAK  A[LOOP:1: B:35:0x0083->B:56:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.vungle.ads.VungleError r8) {
        /*
            r7 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.AbstractC3340k.e(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.k
            boolean r0 = r0.get()
            if (r0 != 0) goto Laa
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f33057l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Laa
            com.vungle.ads.internal.model.h0 r0 = r7.f33059n
            if (r0 == 0) goto La3
            boolean r0 = r0.A()
            if (r0 != r2) goto La3
            java.util.ArrayList r0 = r7.f33058m
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.vungle.ads.internal.model.b r6 = (com.vungle.ads.internal.model.b) r6
            boolean r6 = r6.k()
            if (r6 == 0) goto L48
            r3.add(r5)
            goto L31
        L48:
            r4.add(r5)
            goto L31
        L4c:
            java.util.List r3 = (java.util.List) r3
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L5b
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L5b
            goto L73
        L5b:
            java.util.Iterator r0 = r3.iterator()
        L5f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r0.next()
            com.vungle.ads.internal.model.b r3 = (com.vungle.ads.internal.model.b) r3
            boolean r3 = r3.i()
            if (r3 == 0) goto L5f
            r0 = r2
            goto L74
        L73:
            r0 = r1
        L74:
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L7f
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L7f
            goto L96
        L7f:
            java.util.Iterator r3 = r4.iterator()
        L83:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r3.next()
            com.vungle.ads.internal.model.b r4 = (com.vungle.ads.internal.model.b) r4
            boolean r4 = r4.i()
            if (r4 != 0) goto L83
            r2 = r1
        L96:
            if (r0 == 0) goto La3
            if (r2 == 0) goto La3
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f33057l
            r8.set(r1)
            r7.j()
            return
        La3:
            com.vungle.ads.internal.load.a r0 = r7.f33056j
            if (r0 == 0) goto Laa
            r0.onFailure(r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.load.g.a(com.vungle.ads.VungleError):void");
    }

    public final void a(h0 advertisement, m2 m2Var) throws Throwable {
        com.vungle.ads.internal.downloader.j jVar;
        com.vungle.ads.internal.model.i iVarC;
        Integer numF;
        List listE;
        AbstractC3340k.e(advertisement, "advertisement");
        this.f33059n = advertisement;
        advertisement.E();
        advertisement.a(this.f33069x);
        s sVar = this.f33069x;
        if (sVar != null) {
            sVar.d(advertisement.h());
        }
        s sVar2 = this.f33069x;
        if (sVar2 != null) {
            sVar2.c(advertisement.n());
        }
        s sVar3 = this.f33069x;
        if (sVar3 != null) {
            sVar3.b(advertisement.l());
        }
        s sVar4 = this.f33069x;
        if (sVar4 != null) {
            sVar4.f(advertisement.t());
        }
        s sVar5 = this.f33069x;
        if (sVar5 != null) {
            sVar5.h(advertisement.u());
        }
        s sVar6 = this.f33069x;
        if (sVar6 != null) {
            sVar6.c(Boolean.valueOf(advertisement.B()));
        }
        s sVar7 = this.f33069x;
        if (sVar7 != null) {
            sVar7.b(Boolean.valueOf(advertisement.b()));
        }
        s sVar8 = this.f33069x;
        if (sVar8 != null) {
            sVar8.a(Boolean.valueOf(advertisement.y()));
        }
        s sVar9 = this.f33069x;
        if (sVar9 != null) {
            sVar9.e(advertisement.o());
        }
        this.f33062q.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33062q, this.f33069x, 4);
        v2 v2VarF = advertisement.f();
        int iIntValue = 0;
        if (v2VarF != null) {
            ConfigManager.INSTANCE.a(this.f33047a, v2VarF, false, m2Var);
        }
        VungleError vungleErrorA = a(advertisement);
        if (vungleErrorA != null) {
            a(vungleErrorA.setLogEntry$vungle_ads_release(this.f33069x).logError$vungle_ads_release());
            return;
        }
        File fileB = this.f33052f.b(advertisement.h());
        if (fileB != null && fileB.isDirectory() && fileB.exists()) {
            h0 h0Var = this.f33059n;
            if (h0Var != null && h0Var.C()) {
                try {
                    this.f33050d.b();
                    this.f33050d.a(this.f33052f.getVmDir());
                } catch (Exception e7) {
                    boolean z2 = u.f33874a;
                    StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ");
                    sbA.append(e7.getMessage());
                    t.b("BaseAdLoader", sbA.toString());
                    Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED;
                    StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ");
                    sbA2.append(e7.getMessage());
                    new OmSdkJsError(reason, sbA2.toString()).setLogEntry$vungle_ads_release(this.f33069x).logErrorNoReturnValue$vungle_ads_release();
                }
            }
            InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new d(this.f33047a));
            com.vungle.ads.internal.model.i iVarC2 = advertisement.c();
            if (iVarC2 != null && (listE = iVarC2.e()) != null) {
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    ((r) interfaceC2525iY.getValue()).a(new p((String) it.next()).b("load_ad").a(this.f33069x).a(), false);
                }
            }
            if (!this.f33058m.isEmpty()) {
                this.f33058m.clear();
            }
            this.f33058m.addAll(advertisement.a(fileB));
            if (this.f33058m.isEmpty()) {
                j();
                return;
            }
            this.f33065t.e();
            this.f33066u.e();
            this.f33067v.e();
            this.f33054h.set(this.f33058m.size());
            h0 h0Var2 = this.f33059n;
            if (h0Var2 != null && (iVarC = h0Var2.c()) != null && (numF = iVarC.f()) != null) {
                iIntValue = numF.intValue();
            }
            if (iIntValue > 5) {
                iIntValue = 5;
            }
            Iterator it2 = this.f33058m.iterator();
            while (it2.hasNext()) {
                com.vungle.ads.internal.model.b bVar = (com.vungle.ads.internal.model.b) it2.next();
                if (bVar.f33116d) {
                    jVar = com.vungle.ads.internal.downloader.j.CRITICAL;
                } else {
                    jVar = com.vungle.ads.internal.downloader.j.HIGHEST;
                }
                com.vungle.ads.internal.downloader.k kVar = new com.vungle.ads.internal.downloader.k(jVar, bVar, this.f33069x, iIntValue);
                if (bVar.j()) {
                    kVar.g();
                }
                if (bVar.n()) {
                    this.f33055i.add(bVar.h());
                }
                ((com.vungle.ads.internal.downloader.h) this.f33051e).a(kVar, new c(this));
            }
            return;
        }
        a(new AssetWriteError("Invalid directory. " + fileB).setLogEntry$vungle_ads_release(this.f33069x).logError$vungle_ads_release());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vungle.ads.VungleError a(com.vungle.ads.internal.model.h0 r6) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.load.g.a(com.vungle.ads.internal.model.h0):com.vungle.ads.VungleError");
    }
}

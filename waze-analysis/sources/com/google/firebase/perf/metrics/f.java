package com.google.firebase.perf.metrics;

import com.google.firebase.perf.f.aa;
import com.google.firebase.perf.f.ab;
import com.google.firebase.perf.f.ah;
import com.google.firebase.perf.f.x;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.firebase.perf.a.d implements com.google.firebase.perf.session.c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10524a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final List f10525b;

    /* renamed from: c, reason: collision with root package name */
    private final GaugeManager f10526c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.d.f f10527d;

    /* renamed from: e, reason: collision with root package name */
    private final x f10528e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f10529f;

    /* renamed from: g, reason: collision with root package name */
    private String f10530g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10531h;

    /* JADX WARN: Illegal instructions before constructor call */
    private f(com.google.firebase.perf.d.f fVar) {
        com.google.firebase.perf.a.c cVarA = com.google.firebase.perf.a.c.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(cVarA);
        this.f10528e = ab.newBuilder();
        this.f10529f = new WeakReference(this);
        this.f10527d = fVar;
        this.f10526c = gaugeManager;
        this.f10525b = DesugarCollections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static f b(com.google.firebase.perf.d.f fVar) {
        return new f(fVar);
    }

    public final long a() {
        return this.f10528e.a();
    }

    @Override // com.google.firebase.perf.session.c
    public final void c(com.google.firebase.perf.session.b bVar) {
        if (bVar == null) {
            f10524a.i("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        x xVar = this.f10528e;
        if (!xVar.b() || xVar.d()) {
            return;
        }
        this.f10525b.add(bVar);
    }

    public final boolean d() {
        return this.f10528e.c();
    }

    public final void e() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f10529f);
        unregisterForAppState();
        List<com.google.firebase.perf.session.b> list = this.f10525b;
        synchronized (list) {
            ArrayList arrayList = new ArrayList();
            for (com.google.firebase.perf.session.b bVar : list) {
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        ah[] ahVarArrG = com.google.firebase.perf.session.b.g(listUnmodifiableList);
        if (ahVarArrG != null) {
            this.f10528e.e(Arrays.asList(ahVarArrG));
        }
        ab abVarBuild = this.f10528e.build();
        if (!com.google.firebase.perf.network.h.d(this.f10530g)) {
            f10524a.b("Dropping network request from a 'User-Agent' that is not allowed");
        } else {
            if (this.f10531h) {
                return;
            }
            this.f10527d.j(abVarBuild, getAppState());
            this.f10531h = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L79
            java.lang.String r2 = r2.toUpperCase()
            int r0 = r2.hashCode()
            switch(r0) {
                case -531492226: goto L67;
                case 70454: goto L5c;
                case 79599: goto L51;
                case 2213344: goto L46;
                case 2461856: goto L3b;
                case 75900968: goto L30;
                case 80083237: goto L25;
                case 1669334218: goto L1a;
                case 2012838315: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L72
        Lf:
            java.lang.String r0 = "DELETE"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.DELETE
            goto L74
        L1a:
            java.lang.String r0 = "CONNECT"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.CONNECT
            goto L74
        L25:
            java.lang.String r0 = "TRACE"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.TRACE
            goto L74
        L30:
            java.lang.String r0 = "PATCH"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.PATCH
            goto L74
        L3b:
            java.lang.String r0 = "POST"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.POST
            goto L74
        L46:
            java.lang.String r0 = "HEAD"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.HEAD
            goto L74
        L51:
            java.lang.String r0 = "PUT"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.PUT
            goto L74
        L5c:
            java.lang.String r0 = "GET"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.GET
            goto L74
        L67:
            java.lang.String r0 = "OPTIONS"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L72
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.OPTIONS
            goto L74
        L72:
            com.google.firebase.perf.f.z r2 = com.google.firebase.perf.f.z.HTTP_METHOD_UNKNOWN
        L74:
            com.google.firebase.perf.f.x r1 = r1.f10528e
            r1.h(r2)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.f.f(java.lang.String):void");
    }

    public final void g(int i2) {
        this.f10528e.i(i2);
    }

    public final void h() {
        this.f10528e.j(aa.GENERIC_CLIENT_ERROR);
    }

    public final void i(long j2) {
        this.f10528e.k(j2);
    }

    public final void j(long j2) {
        com.google.firebase.perf.session.b bVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f10529f);
        this.f10528e.g(j2);
        c(bVarPerfSession);
        if (bVarPerfSession.e()) {
            this.f10526c.collectGaugeMetricOnce(bVarPerfSession.b());
        }
    }

    public final void k(String str) {
        if (str == null) {
            this.f10528e.f();
            return;
        }
        if (str.length() <= 128) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            this.f10528e.l(str);
            return;
        }
        f10524a.i("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void l(long j2) {
        this.f10528e.m(j2);
    }

    public final void m(long j2) {
        this.f10528e.n(j2);
    }

    public final void n(long j2) {
        this.f10528e.o(j2);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f10526c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b());
        }
    }

    public final void o(long j2) {
        this.f10528e.p(j2);
    }

    public final void p(String str) {
        okhttp3.ab abVarO;
        int iLastIndexOf;
        if (str != null) {
            okhttp3.ab abVarO2 = okhttp3.ab.o(str);
            if (abVarO2 != null) {
                str = abVarO2.m().t().r().s().p().toString();
            }
            x xVar = this.f10528e;
            if (str.length() > 2000) {
                str = (str.charAt(2000) != '/' && (abVarO = okhttp3.ab.o(str)) != null && abVarO.c().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, DisplayStrings.DS_AUDIO_SDK_SETTINGS_SDK_DISABLED_DESCRIPTION)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
            }
            xVar.q(str);
        }
    }

    public final void q(String str) {
        this.f10530g = str;
    }
}

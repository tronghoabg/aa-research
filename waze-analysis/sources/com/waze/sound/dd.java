package com.waze.sound;

import com.waze.navigate.DriveToNativeManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final cx f39749a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39750b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.gx f39751c;

    /* renamed from: d, reason: collision with root package name */
    private final ik f39752d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sound.a.c f39753e;

    /* renamed from: f, reason: collision with root package name */
    private final bs f39754f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.navigate.dg f39755g;

    /* renamed from: h, reason: collision with root package name */
    private final DriveToNativeManager f39756h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39757i;

    /* renamed from: j, reason: collision with root package name */
    private final ca f39758j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39759k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.af f39760l;
    private String m;
    private com.waze.av.b.n n;
    private com.waze.navigate.em o;
    private boolean p;
    private final Map q;

    public dd(cx cxVar, com.waze.shared_infra.i.e eVar, com.waze.navigate.gx gxVar, ik ikVar, com.waze.sound.a.c cVar, bs bsVar, com.waze.navigate.dg dgVar, DriveToNativeManager driveToNativeManager, com.waze.shared_infra.i.b bVar, ca caVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(cxVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(gxVar, "visualActiveRouteProvider");
        h.g.b.x.f(ikVar, "dataSource");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(caVar, "localPromptGenerator");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f39749a = cxVar;
        this.f39750b = eVar;
        this.f39751c = gxVar;
        this.f39752d = ikVar;
        this.f39753e = cVar;
        this.f39754f = bsVar;
        this.f39755g = dgVar;
        this.f39756h = driveToNativeManager;
        this.f39757i = bVar;
        this.f39758j = caVar;
        this.f39759k = kotlinx.coroutines.b.ck.b(null);
        this.f39760l = kotlinx.coroutines.aj.e(abVar);
        this.p = true;
        this.q = new LinkedHashMap();
    }

    public static final /* synthetic */ Object h(dd ddVar, h.c.e eVar) {
        if (!h.g.b.x.n(ddVar.o, com.waze.navigate.ej.f31313a)) {
            ddVar.f39750b.a("onSettingChanged - not navigating, skipping");
            return h.ab.f48028a;
        }
        Object objD = ddVar.f39751c.Z().d();
        com.waze.modules.c.du duVar = objD instanceof com.waze.modules.c.du ? (com.waze.modules.c.du) objD : null;
        if (duVar != null) {
            ddVar.f39750b.a("onSettingChanged, offline route - recalculating instructions");
            ddVar.s(duVar.a().b(), duVar.a().a());
            ddVar.f39759k.e(new du(ddVar.r(duVar.a().a()), gq.f40099a, duVar.a().a()));
            return h.ab.f48028a;
        }
        if (ddVar.m == null || ddVar.n == null) {
            return h.ab.f48028a;
        }
        ddVar.f39750b.a("onSettingChanged, online route - getting new instructions");
        Object objQ = ddVar.q(ddVar.n, true, eVar);
        return objQ != h.c.a.a.f48038a ? h.ab.f48028a : objQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0192, code lost:
    
        if (r8.q(r10, false, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object p(com.waze.sound.dd r8, com.waze.modules.c.eb r9, com.waze.av.b.n r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dd.p(com.waze.sound.dd, com.waze.modules.c.eb, com.waze.av.b.n, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(com.waze.av.b.n r10, boolean r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dd.q(com.waze.av.b.n, boolean, h.c.e):java.lang.Object");
    }

    private final Map r(String str) {
        bp bpVar = (bp) this.f39754f.b().d();
        if (bpVar == bp.f39558e || bpVar == bp.f39557d) {
            return h.a.r.j();
        }
        Map map = (Map) this.q.get(str);
        return map != null ? h.a.r.g(map) : h.a.r.j();
    }

    private final void s(List list, String str) {
        this.q.put(str, this.f39758j.a(list, this.f39749a.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        this.f39750b.a("Clearing existing instructions");
        this.f39759k.e(null);
        this.q.clear();
    }

    private static final gr u(com.waze.modules.c.du duVar) {
        return duVar.a().c() ? gq.f40099a : gp.f40098a;
    }

    public final kotlinx.coroutines.b.ch k() {
        return kotlinx.coroutines.b.ai.U(this.f39759k);
    }

    public final void n() {
        aj ajVar = new aj(this, (h.c.e) null, 2);
        kotlinx.coroutines.af afVar = this.f39760l;
        kotlinx.coroutines.aj.z(afVar, null, null, ajVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 4, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 3, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 2), 3);
    }
}

package com.waze.network;

import android.content.Context;
import android.net.ConnectivityManager;
import com.waze.NativeManager;
import java.net.CookieManager;
import java.net.CookiePolicy;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class o implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32400a;

    public /* synthetic */ o(int i2) {
        this.f32400a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        byte[] bArr = null;
        switch (this.f32400a) {
            case 0:
                int i2 = r.f32404a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new okhttp3.ad(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
            case 1:
                int i3 = r.f32404a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new ay();
            case 2:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i4 = r.f32404a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                int i5 = h.g.b.ar.f48106a;
                com.waze.network.b.bg bgVar = (com.waze.network.b.bg) bVar.a(new h.g.b.m(com.waze.network.b.bg.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeNetwork.Dispatcher");
                h.g.b.x.e(eVarD, "create(...)");
                return new com.waze.network.b.x(abVarB, bgVar, eVarD);
            case 3:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i6 = r.f32404a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                kotlinx.coroutines.af afVarF = kotlinx.coroutines.aj.f();
                int i7 = h.g.b.ar.f48106a;
                Object systemService = ((Context) bVar2.a(new h.g.b.m(Context.class), null, null)).getSystemService((Class<Object>) ConnectivityManager.class);
                h.g.b.x.e(systemService, "getSystemService(...)");
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("WazeNetwork");
                h.g.b.x.e(eVarD2, "create(...)");
                return new y(afVarF, (ConnectivityManager) systemService, eVarD2);
            case 4:
                int i8 = r.f32404a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new e();
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i9 = r.f32404a;
                h.g.b.x.f(bVar3, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                ch chVarC = ((z) bVar3.a(new h.g.b.m(z.class), null, null)).c();
                am amVar = (am) bVar3.a(new h.g.b.m(am.class), null, null);
                l lVar = new l();
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("WazeNetwork");
                h.g.b.x.e(eVarD3, "create(...)");
                return new bl(eVarD3, chVarC, amVar, lVar);
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i11 = r.f32404a;
                h.g.b.x.f(bVar4, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = h.g.b.ar.f48106a;
                return new ar((ba) bVar4.a(new h.g.b.m(ba.class), null, null), ((com.waze.perf.tracer.h) bVar4.a(new h.g.b.m(com.waze.perf.tracer.h.class), null, null)).a(), new com.waze.realtime_report_feedback.c());
            case 7:
                int i13 = r.f32404a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.network.f.ad();
            case 8:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i14 = r.f32404a;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i15 = h.g.b.ar.f48106a;
                return new com.waze.network.f.d((com.waze.network.f.ag) bVar5.a(new h.g.b.m(com.waze.network.f.ag.class), null, null));
            case 9:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i16 = r.f32404a;
                h.g.b.x.f(bVar6, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i17 = h.g.b.ar.f48106a;
                return new com.waze.network.f.ab((com.waze.network.f.x) bVar6.a(new h.g.b.m(com.waze.network.f.x.class), null, null), (com.waze.network.f.d) bVar6.a(new h.g.b.m(com.waze.network.f.d.class), null, null));
            case 10:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i18 = r.f32404a;
                h.g.b.x.f(bVar7, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i19 = h.g.b.ar.f48106a;
                ch chVarA = ((com.waze.shared_infra.r.y) bVar7.a(new h.g.b.m(com.waze.shared_infra.r.y.class), null, null)).a();
                com.waze.network.f.ag agVar = (com.waze.network.f.ag) bVar7.a(new h.g.b.m(com.waze.network.f.ag.class), null, null);
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("WazeNetwork");
                h.g.b.x.e(eVarD4, "create(...)");
                return new com.waze.network.f.l(eVarD4, chVarA, agVar);
            case 11:
                int i20 = r.f32404a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new c();
            case 12:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i21 = r.f32404a;
                h.g.b.x.f(bVar8, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i22 = h.g.b.ar.f48106a;
                return new com.waze.network.c.b((NativeManager) bVar8.a(new h.g.b.m(NativeManager.class), null, null));
            case 13:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar9, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i23 = h.g.b.ar.f48106a;
                com.waze.network.f.ag agVar2 = (com.waze.network.f.ag) bVar9.a(new h.g.b.m(com.waze.network.f.ag.class), null, null);
                com.waze.network.b.bl blVar = (com.waze.network.b.bl) bVar9.a(new h.g.b.m(com.waze.network.b.bl.class), null, null);
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("WazeNetwork");
                h.g.b.x.e(eVarD5, "create(...)");
                return new com.waze.network.e.m(agVar2, blVar, eVarD5, 0);
            case 14:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.network.e.j(bArr);
            case 15:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar10, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                com.waze.g.d dVar = (com.waze.g.d) bVar10.a(new h.g.b.m(com.waze.g.d.class), null, null);
                com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("WazeNetwork");
                h.g.b.x.e(eVarD6, "create(...)");
                return new com.waze.network.e.o(dVar, eVarD6);
            case 16:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar11, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i25 = h.g.b.ar.f48106a;
                com.waze.aq.o oVar = (com.waze.aq.o) bVar11.a(new h.g.b.m(com.waze.aq.o.class), null, null);
                com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("IntegrityApiInterceptor");
                h.g.b.x.e(eVarD7, "create(...)");
                return new com.waze.network.e.m(oVar, eVarD7, new com.waze.network.e.b(), 1);
            case 17:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.network.e.b();
            case 18:
                int i26 = com.waze.notifications.g.f32616a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.notifications.b.g();
            case 19:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i27 = com.waze.notifications.g.f32616a;
                h.g.b.x.f(bVar12, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i28 = h.g.b.ar.f48106a;
                com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar12.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("PushNotificationDisplayedSender");
                h.g.b.x.e(eVarD8, "create(...)");
                return new com.waze.notifications.a.c(kVar, eVarD8);
            default:
                int i29 = com.waze.perf.t.f33065a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                h.g.b.x.f(com.google.firebase.b.f8908a, "<this>");
                com.google.firebase.perf.d dVarA = com.google.firebase.perf.d.a();
                h.g.b.x.e(dVarA, "getInstance(...)");
                return dVarA;
        }
    }
}

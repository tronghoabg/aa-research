package com.waze.modules.d;

import android.content.Context;
import androidx.room.Room;
import com.waze.audit.WazeAuditReporterNativeManager;
import com.waze.config.ConfigValues;
import com.waze.crash.CrashNativeManager;
import com.waze.favorites.FavoritesNativeManager;
import com.waze.gas.GasNativeManager;
import com.waze.lm;
import com.waze.mywaze.ai;
import com.waze.n.ac;
import com.waze.n.aq;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import com.waze.realtime_report_feedback.ReportFeedbackServiceProvider;
import com.waze.reports.WazeReportNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.stats.AdEventsReporterNativeManager;
import com.waze.stats.StatsReporterNativeManager;
import com.waze.stats.ax;
import com.waze.stats.storage.StatsDatabase;
import com.waze.system.SystemNativeManager;
import com.waze.view.bottom.BottomNotificationNativeManager;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f30229a;

    public /* synthetic */ j(int i2) {
        this.f30229a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2;
        com.waze.shared_infra.i.e eVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f30229a) {
            case 0:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new d();
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new e(bVar);
            case 2:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                Long lB = ConfigValues.CONFIG_VALUE_STATS_PAYLOAD_SIZE_THRESHOLD_IN_BYTES.b();
                h.g.b.x.e(lB, "getValue(...)");
                return new com.waze.perf.w(lB.longValue());
            case 3:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                Long lB2 = ConfigValues.CONFIG_VALUE_AD_EVENTS_PAYLOAD_SIZE_THRESHOLD_IN_BYTES.b();
                h.g.b.x.e(lB2, "getValue(...)");
                return new com.waze.perf.a(lB2.longValue());
            case 4:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar2, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                return new g((com.waze.sharedui.e.g) bVar2.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null), (com.waze.shared_infra.q.e) bVar2.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (com.waze.z) bVar2.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.g.d) bVar2.a(new h.g.b.m(com.waze.g.d.class), null, null));
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar3, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                Context contextH = k.a.k.h(bVar3);
                h.g.b.x.f(contextH, "context");
                return (StatsDatabase) Room.databaseBuilder(contextH, StatsDatabase.class, StatsDatabase.DB_NAME).fallbackToDestructiveMigration(false).build();
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar4, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i4 = ar.f48106a;
                return ac.k(((com.waze.modules.b.h) bVar4.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b());
            case 7:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return aq.c(((com.waze.modules.b.i) bVar5.a(new h.g.b.m(com.waze.modules.b.i.class), null, null)).a());
            case 8:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar6, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i6 = ar.f48106a;
                return com.waze.ch.a.a.f.a(((com.waze.modules.b.h) bVar6.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b());
            case 9:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                com.waze.mywaze.b bVar8 = com.waze.mywaze.b.f30576a;
                h.g.b.x.f(bVar7, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                return new ai((ax) bVar7.a(new h.g.b.m(ax.class), null, null));
            case 10:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i8 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar9, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                return new SettingsNativeManager((lm) bVar9.a(new h.g.b.m(lm.class), null, null), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            case 11:
                int i10 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new ShareNativeManager();
            case 12:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i11 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar10, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new SystemNativeManager(k.a.k.h(bVar10));
            case 13:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i12 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                return new StatsReporterNativeManager((ax) bVar11.a(new h.g.b.m(ax.class), null, null), (com.waze.native_managers.j) bVar11.a(new h.g.b.m(com.waze.native_managers.j.class), null, null));
            case 14:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i14 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar12, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                return new AdEventsReporterNativeManager((ax) bVar12.a(new h.g.b.m(ax.class), null, null), (com.waze.native_managers.j) bVar12.a(new h.g.b.m(com.waze.native_managers.j.class), null, null));
            case 15:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i16 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new WazeAuditReporterNativeManager(k.a.k.h(bVar13), eVar, i2, objArr3 == true ? 1 : 0);
            case 16:
                int i17 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new GasNativeManager();
            case 17:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i18 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar14, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                return new WazeReportNativeManager((com.waze.native_managers.j) bVar14.a(new h.g.b.m(com.waze.native_managers.j.class), null, null), (WazeNativeLooperDispatcher) bVar14.a(new h.g.b.m(WazeNativeLooperDispatcher.class), null, null));
            case 18:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i20 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar15, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i21 = ar.f48106a;
                return new BottomNotificationNativeManager((ReportFeedbackServiceProvider) bVar15.a(new h.g.b.m(ReportFeedbackServiceProvider.class), null, null));
            case 19:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i22 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f(bVar16, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i23 = ar.f48106a;
                return new CrashNativeManager((com.waze.crash.c) bVar16.a(new h.g.b.m(com.waze.crash.c.class), null, null), (com.waze.shared_infra.i.b) bVar16.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
            default:
                int i24 = com.waze.native_managers.g.f30689a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new FavoritesNativeManager();
        }
    }
}

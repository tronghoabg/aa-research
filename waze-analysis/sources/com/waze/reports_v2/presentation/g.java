package com.waze.reports_v2.presentation;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35044d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f35045e;

    public /* synthetic */ g(com.waze.reports_v2.a.a.a.a aVar, com.waze.reports_v2.a.a.a.b bVar, ManagedActivityResultLauncher managedActivityResultLauncher, Context context, int i2) {
        this.f35045e = i2;
        this.f35041a = aVar;
        this.f35042b = bVar;
        this.f35043c = managedActivityResultLauncher;
        this.f35044d = context;
    }

    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, k.j] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i2 = this.f35045e;
        if (i2 == 0) {
            return bx.d((com.waze.reports_v2.a.a.a.a) this.f35041a, (com.waze.reports_v2.a.a.a.b) this.f35042b, (ManagedActivityResultLauncher) this.f35043c, (Context) this.f35044d, (Composer) obj, ((Integer) obj2).intValue());
        }
        if (i2 == 1) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1456912225, iIntValue, -1, "com.waze.trip_overview.views.RouteHeader.bindVehicleTypeSelector.<anonymous>.<anonymous> (RouteHeader.kt:79)");
                }
                ?? r7 = this.f35041a;
                ?? r6 = this.f35043c;
                ?? r2 = this.f35042b;
                com.waze.trip_overview.br brVar = (com.waze.trip_overview.br) this.f35044d;
                com.waze.trip_overview.views.l.a(brVar.b(), brVar.a(), r2, null, brVar.c(), brVar.d(), r6, r7, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            Composer composer2 = (Composer) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(824109275, iIntValue2, -1, "com.waze.trip_overview.views.RouteHeader.bindVehicleTypeSelector.<anonymous> (RouteHeader.kt:78)");
                }
                com.waze.car_lib.r.cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1456912225, true, new g(this.f35044d, this.f35042b, this.f35043c, this.f35041a, 1), composer2, 54), composer2, 196608);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            int iIntValue3 = ((Integer) obj).intValue();
            long jLongValue = ((Long) obj2).longValue();
            if (iIntValue3 == 1) {
                h.g.b.aq aqVar = (h.g.b.aq) this.f35044d;
                if (aqVar.f48105a != null) {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                }
                if (jLongValue != 24) {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                Object obj3 = this.f35041a;
                Object obj4 = this.f35043c;
                ?? r13 = this.f35042b;
                aqVar.f48105a = Long.valueOf(r13.p());
                ((h.g.b.aq) obj4).f48105a = Long.valueOf(r13.p());
                ((h.g.b.aq) obj3).f48105a = Long.valueOf(r13.p());
            }
            return h.ab.f48028a;
        }
        int iIntValue4 = ((Integer) obj).intValue();
        long jLongValue2 = ((Long) obj2).longValue();
        if (iIntValue4 == 21589) {
            if (jLongValue2 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            ?? r22 = this.f35042b;
            byte bC = r22.c();
            boolean z = (bC & 2) == 2;
            boolean z2 = (bC & 4) == 4;
            int i3 = 1 & bC;
            long j2 = i3 != 0 ? 5L : 1L;
            if (z) {
                j2 += 4;
            }
            if (z2) {
                j2 += 4;
            }
            if (jLongValue2 < j2) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (i3 != 0) {
                ((h.g.b.aq) this.f35044d).f48105a = Integer.valueOf(r22.f());
            }
            if (z) {
                ((h.g.b.aq) this.f35043c).f48105a = Integer.valueOf(r22.f());
            }
            if (z2) {
                ((h.g.b.aq) this.f35041a).f48105a = Integer.valueOf(r22.f());
            }
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f35045e = i2;
        this.f35044d = obj;
        this.f35042b = obj2;
        this.f35043c = obj3;
        this.f35041a = obj4;
    }

    public /* synthetic */ g(k.j jVar, h.g.b.aq aqVar, h.g.b.aq aqVar2, h.g.b.aq aqVar3, int i2) {
        this.f35045e = i2;
        this.f35042b = jVar;
        this.f35044d = aqVar;
        this.f35043c = aqVar2;
        this.f35041a = aqVar3;
    }
}

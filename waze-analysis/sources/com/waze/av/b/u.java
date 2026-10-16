package com.waze.av.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import com.waze.lm;
import com.waze.modules.navigation.bp;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NavigateNativeManager;
import com.waze.navigate.bu;
import com.waze.navigate.cs;
import com.waze.places.PlacesNativeManager;
import com.waze.planned_drive.PlannedDriveNativeManager;
import com.waze.planned_drive.bj;
import com.waze.search.v2.gb;
import com.waze.strings.DisplayStrings;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16005a;

    /* renamed from: b, reason: collision with root package name */
    private final bp f16006b;

    /* renamed from: c, reason: collision with root package name */
    private final DriveToNativeManager f16007c;

    public u(com.waze.shared_infra.i.e eVar, bp bpVar, DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f16005a = eVar;
        this.f16006b = bpVar;
        this.f16007c = driveToNativeManager;
    }

    private static final void G(Context context, boolean z, AddressItem addressItem, h.g.a.a aVar, h.g.a.a aVar2) {
        com.waze.favorites.u uVar = new com.waze.favorites.u(addressItem);
        uVar.a(z);
        uVar.c(new com.waze.ads.f(aVar, 2));
        uVar.b(new com.waze.ads.f(aVar2, 3));
        uVar.d(context);
    }

    private static final void H(AddressItem addressItem, h.g.a.a aVar, h.g.a.a aVar2) {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null) {
            return;
        }
        G(eVarE, false, addressItem, aVar, aVar2);
    }

    public static /* synthetic */ void n(u uVar, n nVar, h.g.a.a aVar, h.g.a.a aVar2, boolean z) {
        if (z) {
            uVar.f16007c.addDangerZoneStat(com.waze.ac.e.p(nVar).getLongitudeInt(), com.waze.ac.e.p(nVar).getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
        } else {
            H(com.waze.ac.e.p(nVar), aVar2, aVar);
            uVar.f16007c.addDangerZoneStat(com.waze.ac.e.p(nVar).getLongitudeInt(), com.waze.ac.e.p(nVar).getLatitudeInt(), alx.CONFIRM, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
        }
    }

    static final void t(final u uVar, final n nVar, final h.g.a.a aVar, final h.g.a.a aVar2, DriveTo.DangerZoneType dangerZoneType) {
        if (dangerZoneType == DriveTo.DangerZoneType.NOT_DANGER_ZONE) {
            H(com.waze.ac.e.p(nVar), aVar, aVar2);
            return;
        }
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(com.waze.navigate.as.d(dangerZoneType));
        oVar.P(com.waze.navigate.as.c(dangerZoneType));
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.av.b.s
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                u.n(this.f15997a, nVar, aVar2, aVar, z);
            }
        };
        oVar.M(aVarA.c(R.string.CANCEL, new Object[0]));
        oVar.N(aVarA.c(R.string.DANGEROUS_ADDRESS_SAVE_BUTTON, new Object[0]));
        oVar.F(R.drawable.dangerous_zone_icon);
        oVar.H(new com.waze.google_assistant.aj(uVar, nVar, 2));
        oVar.R(true);
        com.waze.z.a.d.ai.q(oVar);
    }

    static final void z(u uVar, j jVar, PlannedDriveResponse plannedDriveResponse) {
        if (plannedDriveResponse != null && plannedDriveResponse.getSuccess()) {
            uVar.f16005a.a("planned drive removed eventId=".concat(String.valueOf(jVar.g())));
            return;
        }
        uVar.f16005a.g("planned drive removal failed eventId=" + jVar.g() + ", status=" + (plannedDriveResponse != null ? plannedDriveResponse.getErrorMessage() : null));
    }

    @Override // com.waze.av.b.v
    public final void A(k kVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(kVar, "genericPlace");
        h.g.b.x.f(aVar, "onFinished");
        h.g.b.x.f(aVar2, "onCancelled");
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null) {
            return;
        }
        B(eVarE, kVar, aVar, aVar2);
    }

    @Override // com.waze.av.b.v
    public final void B(Context context, k kVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(kVar, "genericPlace");
        h.g.b.x.f(aVar, "onFinished");
        h.g.b.x.f(aVar2, "onCancelled");
        G(context, true, com.waze.ac.e.p(kVar), aVar, aVar2);
    }

    @Override // com.waze.av.b.v
    public final com.waze.app_nav.p D(n nVar) {
        h.g.b.x.f(nVar, "genericPlace");
        return com.waze.planned_drive.r.f33352a.a().d(com.waze.ac.e.p(nVar)).e(true).c(bj.f33259d).b();
    }

    @Override // com.waze.av.b.v
    public final void E(n nVar, boolean z, com.waze.modules.navigation.ah ahVar) {
        h.g.b.x.f(nVar, "destination");
        h.g.b.x.f(ahVar, "caller");
        com.waze.modules.navigation.ai aiVar = new com.waze.modules.navigation.ai(nVar);
        this.f16006b.b(new com.waze.modules.navigation.ao(ahVar, aiVar, null, false, z ? com.waze.modules.navigation.at.f30322b : com.waze.modules.navigation.at.f30323c, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4));
    }

    @Override // com.waze.av.b.v
    public final void F(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.d(context, "null cannot be cast to non-null type com.waze.sharedui.activities.WazeFragmentActivity");
        new com.waze.share.v((com.waze.sharedui.a.e) context, com.waze.share.z.f37756c, com.waze.ac.e.p(nVar)).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.av.b.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.av.b.t
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.av.b.t r0 = (com.waze.av.b.t) r0
            int r1 = r0.f16004d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16004d = r1
            goto L18
        L13:
            com.waze.av.b.t r0 = new com.waze.av.b.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f16002b
            h.c.a.a r6 = h.c.a.a.f48038a
            int r1 = r0.f16004d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            int r5 = r0.f16001a
            e.b.c.b(r4)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r4)
            com.waze.places.PlacesNativeManager r4 = com.waze.places.PlacesNativeManager.INSTANCE
            com.waze.places.ab r4 = (com.waze.places.ab) r4
            r0.f16001a = r5
            r0.f16004d = r2
            java.lang.Object r4 = com.waze.perf.tracer.a.e(r4, r0)
            if (r4 == r6) goto L7f
        L42:
            com.waze.jni.protos.places.GenericPlaces r4 = (com.waze.jni.protos.places.GenericPlaces) r4
            r6 = 0
            if (r4 == 0) goto L6f
            java.util.List r4 = r4.getGenericPlacesList()
            if (r4 == 0) goto L6f
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r4.next()
            r1 = r0
            com.waze.jni.protos.places.GenericPlace r1 = (com.waze.jni.protos.places.GenericPlace) r1
            com.waze.jni.protos.places.RecentPlace r1 = r1.getRecentPlace()
            int r1 = r1.getId()
            if (r1 != r5) goto L53
            goto L6c
        L6b:
            r0 = r6
        L6c:
            com.waze.jni.protos.places.GenericPlace r0 = (com.waze.jni.protos.places.GenericPlace) r0
            goto L70
        L6f:
            r0 = r6
        L70:
            if (r0 == 0) goto L77
            com.waze.av.b.n r4 = com.waze.ac.e.m(r0)
            goto L78
        L77:
            r4 = r6
        L78:
            boolean r5 = r4 instanceof com.waze.av.b.l
            if (r5 == 0) goto L7f
            com.waze.av.b.l r4 = (com.waze.av.b.l) r4
            return r4
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.u.a(int, h.c.e):java.lang.Object");
    }

    @Override // com.waze.av.b.o
    public final void b(j jVar) {
        h.g.b.x.f(jVar, "eventPlace");
        this.f16007c.removeEvent(jVar.g(), false);
    }

    @Override // com.waze.av.b.o
    public final void c(n nVar) {
        h.g.b.x.f(nVar, "genericPlace");
        this.f16007c.convertFavoriteToRecent(com.waze.ac.e.r(nVar), new com.waze.main_screen.ag.a(11));
    }

    @Override // com.waze.av.b.o
    public final void d(n nVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(nVar, "genericPlace");
        PlacesNativeManager.INSTANCE.eraseAddressItem(com.waze.ac.e.r(nVar), com.waze.ac.e.n(nVar), com.waze.ac.e.p(nVar).getTitle(), new com.waze.main_screen.ag.a(10));
    }

    @Override // com.waze.av.b.o
    public final void e(final j jVar) {
        h.g.b.x.f(jVar, "eventPlace");
        this.f16005a.a("removing planned drive eventId=".concat(String.valueOf(jVar.g())));
        DeletePlannedDriveRequest.Builder builderNewBuilder = DeletePlannedDriveRequest.newBuilder();
        builderNewBuilder.setMeetingId(jVar.g());
        DeletePlannedDriveRequest deletePlannedDriveRequestBuild = builderNewBuilder.build();
        h.g.b.x.e(deletePlannedDriveRequestBuild, "build(...)");
        PlannedDriveNativeManager.getInstance().deletePlannedDrive(deletePlannedDriveRequestBuild, new com.waze.jni.a() { // from class: com.waze.av.b.p
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                u.z(this.f15989a, jVar, (PlannedDriveResponse) obj);
            }
        });
    }

    @Override // com.waze.av.b.o
    public final void f(n nVar) {
        Integer numG;
        h.g.b.x.f(nVar, "genericPlace");
        boolean z = nVar instanceof k;
        String strR = (!z || (numG = ((k) nVar).g()) == null) ? com.waze.ac.e.r(nVar) : com.waze.ac.e.t(numG.intValue(), 2);
        PlacesNativeManager.INSTANCE.eraseAddressItem(strR, (z && ((k) nVar).g() == null) ? 150 : com.waze.ac.e.n(nVar), com.waze.ac.e.p(nVar).getTitle(), new com.waze.main_screen.ag.a(12));
    }

    @Override // com.waze.av.b.v
    public final Intent g(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        Intent intentA = new cs(com.waze.ac.e.p(nVar)).a(context);
        h.g.b.x.e(intentA, "build(...)");
        return intentA;
    }

    @Override // com.waze.av.b.v
    public final Intent h(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        cs csVar = new cs(com.waze.ac.e.p(nVar));
        csVar.g();
        Intent intentA = csVar.a(context);
        h.g.b.x.e(intentA, "build(...)");
        return intentA;
    }

    @Override // com.waze.av.b.v
    public final Intent i(n nVar, Context context) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(context, "context");
        cs csVar = new cs(com.waze.ac.e.p(nVar));
        String venueId = com.waze.ac.e.p(nVar).getVenueId();
        h.g.b.x.e(venueId, "getVenueId(...)");
        csVar.e(venueId.length() > 0);
        Intent intentA = csVar.a(context);
        h.g.b.x.e(intentA, "build(...)");
        return intentA;
    }

    @Override // com.waze.av.b.v
    public final Intent j(Context context, n nVar, com.waze.j.n nVar2, boolean z, com.waze.modules.navigation.ah ahVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(ahVar, "caller");
        AddressItem addressItemP = com.waze.ac.e.p(nVar);
        if (nVar2 != null && nVar2.a() > 0) {
            addressItemP.distanceMeters = nVar2.a();
        }
        cs csVar = new cs(addressItemP);
        String strC = nVar.e().c().c();
        boolean z2 = false;
        if (strC != null && strC.length() != 0) {
            z2 = true;
        }
        csVar.e(z2);
        csVar.l(z);
        csVar.c(ahVar);
        if (context instanceof Activity) {
            return csVar.a(context);
        }
        return null;
    }

    @Override // com.waze.av.b.v
    public final Intent k(Context context, n nVar, boolean z) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        return com.waze.planned_drive.r.f33352a.a().d(com.waze.ac.e.p(nVar)).e(z).a(context);
    }

    @Override // com.waze.av.b.v
    public final Intent l(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        return new com.waze.search.t().f(com.waze.ac.e.p(nVar)).a(context);
    }

    @Override // com.waze.av.b.v
    public final com.waze.share.v m(com.waze.ifs.ui.a aVar, n nVar) {
        h.g.b.x.f(aVar, "activity");
        h.g.b.x.f(nVar, "genericPlace");
        return new com.waze.share.v(aVar, com.waze.share.z.f37756c, com.waze.ac.e.p(nVar));
    }

    @Override // com.waze.av.b.v
    public final void o(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        context.startActivity(h(context, nVar));
    }

    @Override // com.waze.av.b.v
    public final void p(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        ((Activity) context).startActivity(new cs(com.waze.ac.e.p(nVar)).a(context));
    }

    @Override // com.waze.av.b.v
    public final void q(Context context, ActivityResultLauncher activityResultLauncher, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(activityResultLauncher, "activityLauncher");
        h.g.b.x.f(nVar, "genericPlace");
        activityResultLauncher.launch(gb.c(context, com.waze.ac.e.x(nVar), true));
    }

    @Override // com.waze.av.b.v
    public final void r(n nVar) {
        h.g.b.x.f(nVar, "genericPlace");
        com.waze.planned_drive.r.f33352a.a().d(com.waze.ac.e.p(nVar)).e(true).c(bj.f33259d).h();
    }

    @Override // com.waze.av.b.v
    public final void s(n nVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(aVar, "onFinished");
        h.g.b.x.f(aVar2, "onCancelled");
        this.f16007c.getDangerZoneType(com.waze.ac.e.p(nVar).getLongitudeInt(), com.waze.ac.e.p(nVar).getLatitudeInt(), new r(this, nVar, aVar, aVar2, 0));
    }

    @Override // com.waze.places.a.c
    public final void u(n nVar, final h.g.a.l lVar, boolean z, boolean z2, boolean z3) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(lVar, "callback");
        this.f16007c.navigate(com.waze.ac.e.q(nVar, false), new bu() { // from class: com.waze.av.b.q
            @Override // com.waze.navigate.bu
            public final void a() {
                lVar.invoke(0);
            }
        }, false, z, z2, z3);
    }

    @Override // com.waze.places.a.c
    public final void v(n nVar, n nVar2) {
        h.g.b.x.f(nVar, "original");
        h.g.b.x.f(nVar2, "parkingPlace");
        NavigateNativeManager.instance().navigateToParking(com.waze.ac.e.p(nVar2).getVenueData(), com.waze.ac.e.p(nVar).getVenueData());
    }

    @Override // com.waze.av.b.v
    public final void w() {
        com.waze.bs.a.f("settings_main.notifications_and_reminders.planned_drive", "MAP", false);
    }

    @Override // com.waze.av.b.v
    public final void x(Context context, n nVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(nVar, "genericPlace");
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            new com.waze.search.t().f(com.waze.ac.e.p(nVar)).h(eVarE, 0);
        }
    }

    @Override // com.waze.av.b.v
    public final void y(n nVar) {
        h.g.b.x.f(nVar, "genericPlace");
        if (com.waze.ac.e.p(nVar).getType() == 8 && com.waze.ac.e.p(nVar).getMeetingId() != null) {
            NativeManager.getInstance().autoCompleteVenueGet(null, com.waze.ac.e.p(nVar).getVenueId(), com.waze.ac.e.p(nVar).getMeetingId(), null, true, 0, null, null);
            return;
        }
        cs csVar = new cs(com.waze.ac.e.p(nVar));
        String venueId = com.waze.ac.e.p(nVar).getVenueId();
        h.g.b.x.e(venueId, "getVenueId(...)");
        csVar.e(venueId.length() > 0);
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            csVar.b(eVarE, 1);
        }
    }
}

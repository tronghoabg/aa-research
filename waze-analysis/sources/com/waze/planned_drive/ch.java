package com.waze.planned_drive;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ch extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final s f33307a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.j f33308b;

    /* renamed from: c, reason: collision with root package name */
    private final PlannedDriveNativeManager f33309c;

    /* renamed from: d, reason: collision with root package name */
    private final DriveToNativeManager f33310d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33311e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f33312f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33313g;

    /* renamed from: h, reason: collision with root package name */
    private final bk f33314h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33315i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f33316j;

    public ch(s sVar, com.waze.navigate.j jVar, PlannedDriveNativeManager plannedDriveNativeManager, DriveToNativeManager driveToNativeManager, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.i.e eVar2, bk bkVar) {
        h.g.b.x.f(sVar, "input");
        h.g.b.x.f(jVar, "addressItemsRepo");
        h.g.b.x.f(plannedDriveNativeManager, "plannedDriveNativeManager");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(bkVar, "plannedDriveStatsSender");
        this.f33307a = sVar;
        this.f33308b = jVar;
        this.f33309c = plannedDriveNativeManager;
        this.f33310d = driveToNativeManager;
        this.f33311e = aVar;
        this.f33312f = eVar;
        this.f33313g = eVar2;
        this.f33314h = bkVar;
        String[] strArr = {"", aVar.c(R.string.PLAN_SUNDAY, new Object[0]), aVar.c(R.string.PLAN_MONDAY, new Object[0]), aVar.c(R.string.PLAN_TUESDAY, new Object[0]), aVar.c(R.string.PLAN_WEDNESDAY, new Object[0]), aVar.c(R.string.PLAN_THURSDAY, new Object[0]), aVar.c(R.string.PLAN_FRIDAY, new Object[0]), aVar.c(R.string.PLAN_SATURDAY, new Object[0])};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new bx(0, aVar.c(R.string.TODAY_CAP, new Object[0])));
        arrayList2.add(new bx(1, aVar.c(R.string.TOMORROW, new Object[0])));
        Calendar calendarC = eVar.c();
        calendarC.add(5, 2);
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList2.add(new bx(((bx) h.a.i.T(arrayList)).a() + 1, strArr[calendarC.get(7)]));
            calendarC.add(5, 1);
        }
        this.f33316j = ck.b(new by(new bs(null), new bs(arrayList, h.a.i.P(arrayList)), false, false, ce.f33304a, new bu(this.f33307a.b(), false, false), new bt(this.f33307a.a(), Integer.MIN_VALUE), this.f33307a.d() ? bv.f33281a : null, false));
    }

    private static final void L(ch chVar, CreatePlannedDriveRequest createPlannedDriveRequest) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        chVar.f33309c.createPlannedDrive(createPlannedDriveRequest, new bo(0));
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_PLAN_DRIVE_SAVED_COUNT;
        cVar.d(Long.valueOf(cVar.b().longValue() + 1));
        chVar.f33308b.a();
        do {
            bnVar = chVar.f33316j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, by.j((by) objD, null, null, false, false, cc.f33300a, null, null, null, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i2, boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        com.waze.shared_infra.o.a aVar;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            aVar = this.f33311e;
        } while (!bnVar.f(objD, by.j((by) objD, null, null, false, false, new cd(aVar.c(R.string.FUTURE_DRIVES_ERROR_TITLE, new Object[0]), aVar.c(i2, new Object[0]), z), null, null, null, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL)));
    }

    public static final /* synthetic */ void o(ch chVar, CreatePlannedDriveRequest createPlannedDriveRequest, ca caVar) {
        if (caVar == ca.f33294a) {
            L(chVar, createPlannedDriveRequest);
        }
    }

    static final void u(ch chVar, CreatePlannedDriveRequest createPlannedDriveRequest, DriveTo.DangerZoneType dangerZoneType) {
        Object objD;
        if (dangerZoneType == null || dangerZoneType == DriveTo.DangerZoneType.NOT_DANGER_ZONE) {
            chVar.f33313g.a("no danger zone, saving immediately");
            L(chVar, createPlannedDriveRequest);
        } else {
            chVar.f33313g.a("danger zone found, asking for confirmation");
            kotlinx.coroutines.b.bn bnVar = chVar.f33316j;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, by.j((by) objD, null, null, false, false, new cb(dangerZoneType, new cg(chVar, createPlannedDriveRequest)), null, null, null, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL)));
        }
    }

    public final void A(AddressItem addressItem, boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
            byVar.d();
        } while (!bnVar.f(objD, by.j(byVar, null, null, false, false, null, new bu(addressItem, false, z), null, null, false, DisplayStrings.DS_GAS_PRICE_UPDATE_EDIT_PRICES)));
    }

    public final void B(List list) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        bs bsVarB;
        boolean z;
        h.g.b.x.f(list, "newModels");
        this.f33313g.a("updating to " + list.size() + " models, first one is " + h.a.i.R(list));
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
            bsVarB = byVar.b().b(list);
            z = true;
            if (!byVar.i() && list.isEmpty()) {
                z = false;
            }
        } while (!bnVar.f(objD, by.j(byVar, bsVarB, null, false, false, null, null, null, null, z, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2)));
        if (list.isEmpty() || byVar.i()) {
            return;
        }
        this.f33314h.c(this.f33307a.c());
    }

    public final void C(UpdatePlannedDriveRequest updatePlannedDriveRequest) {
        Object objD;
        h.g.b.x.f(updatePlannedDriveRequest, "request");
        Objects.toString(updatePlannedDriveRequest);
        String strConcat = "got request ".concat(String.valueOf(updatePlannedDriveRequest));
        com.waze.shared_infra.i.e eVar = this.f33313g;
        eVar.a(strConcat);
        kotlinx.coroutines.b.bn bnVar = this.f33316j;
        if (h.g.b.x.n(((by) bnVar.d()).f(), ce.f33304a)) {
            this.f33309c.updatePlannedDrive(updatePlannedDriveRequest, new bo(1));
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, by.j((by) objD, null, null, false, false, cc.f33300a, null, null, null, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL)));
        } else {
            cf cfVarF = ((by) bnVar.d()).f();
            Objects.toString(cfVarF);
            eVar.b("ignoring request, screen is busy: ".concat(String.valueOf(cfVarF)));
        }
    }

    public final void D(bx bxVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        h.g.b.x.f(bxVar, "day");
        Objects.toString(bxVar);
        this.f33313g.a("updating to new selected day: ".concat(String.valueOf(bxVar)));
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
        } while (!bnVar.f(objD, by.j(byVar, null, byVar.a().c(bxVar), false, false, null, null, null, null, false, 505)));
    }

    public final boolean E(LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse) {
        h.g.b.x.f(loadPlannedDriveOptionsResponse, "response");
        if (loadPlannedDriveOptionsResponse.getCode() == LoadPlannedDriveOptionsResponse.ResponseCode.OK) {
            return false;
        }
        int iOrdinal = loadPlannedDriveOptionsResponse.getCode().ordinal();
        if (iOrdinal == 1) {
            M(R.string.FUTURE_DRIVES_ERROR_MISC, true);
        } else if (iOrdinal == 2) {
            M(R.string.FUTURE_DRIVES_ERROR_NO_NETWORK, true);
        } else if (iOrdinal == 3) {
            M(R.string.FUTURE_DRIVES_ERROR_ROUTE_TOO_LONG, true);
        } else if (iOrdinal == 4) {
            M(R.string.FUTURE_DRIVES_ERROR_TOO_MANY_REQUESTS, true);
        } else {
            if (iOrdinal != 5) {
                this.f33313g.b("unknown error " + loadPlannedDriveOptionsResponse.getCode() + ", can't consume it");
                return false;
            }
            M(R.string.FUTURE_DRIVES_ERROR_NO_CURRENT_LOCATION, false);
        }
        return true;
    }

    public final boolean F(long j2) {
        return com.waze.realtime_report_feedback.e.c(j2, (bx) ((by) this.f33316j.d()).a().d(), this.f33312f);
    }

    public final boolean G() {
        return ((by) this.f33316j.d()).g();
    }

    public final boolean H() {
        return ((by) this.f33316j.d()).d().c();
    }

    public final boolean I() {
        com.waze.planned_drive.histogram.f fVar;
        kotlinx.coroutines.b.bn bnVar = this.f33316j;
        if (!((by) bnVar.d()).d().b() || (fVar = (com.waze.planned_drive.histogram.f) h.a.i.R(((by) bnVar.d()).b().f())) == null) {
            return false;
        }
        bx bxVar = (bx) ((by) bnVar.d()).a().d();
        com.waze.shared_infra.q.e eVar = this.f33312f;
        if (!com.waze.realtime_report_feedback.e.c(fVar.c(), bxVar, eVar)) {
            return false;
        }
        if (bxVar.a() > 0) {
            return true;
        }
        return eVar.a() < fVar.c() - fVar.b();
    }

    public final boolean J() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
        } while (!bnVar.f(objD, by.j(byVar, null, null, false, false, null, null, null, null, false, 507)));
        return byVar.h();
    }

    public final int a() {
        return ((bx) ((by) this.f33316j.d()).a().d()).a();
    }

    public final LiveData b() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(0))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final LiveData c() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(2))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final LiveData d() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(3))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final LiveData e() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(1))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final LiveData f() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(4))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final LiveData g() {
        return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new br(this.f33316j, new bn(5))), (h.c.j) null, 0L, 3, (Object) null);
    }

    public final AddressItem h() {
        return (AddressItem) ((by) this.f33316j.d()).c().c();
    }

    public final AddressItem i() {
        return ((by) this.f33316j.d()).d().a();
    }

    public final s j() {
        return this.f33307a;
    }

    public final bw k() {
        return ((by) this.f33316j.d()).e();
    }

    public final bx l(long j2) {
        Object next;
        Iterator it = ((by) this.f33316j.d()).a().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (com.waze.realtime_report_feedback.e.c(j2, (bx) next, this.f33312f)) {
                break;
            }
        }
        return (bx) next;
    }

    public final com.waze.planned_drive.histogram.f m() {
        return (com.waze.planned_drive.histogram.f) ((by) this.f33316j.d()).b().e();
    }

    public final List n() {
        return ((by) this.f33316j.d()).b().f();
    }

    public final void p() {
        kotlinx.coroutines.b.bn bnVar = this.f33316j;
        D((bx) ((by) bnVar.d()).a().f().get(((by) bnVar.d()).a().a() < ((by) bnVar.d()).a().f().size() + (-1) ? ((by) bnVar.d()).a().a() + 1 : 0));
    }

    public final void q() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, by.j((by) objD, null, null, false, false, ce.f33304a, null, null, null, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL)));
    }

    public final void r() {
        B(h.a.i.h());
    }

    public final void s(bw bwVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        bw bwVarE;
        h.g.b.x.f(bwVar, "request");
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
            bwVarE = byVar.e();
            if (true == h.g.b.x.n(bwVarE, bwVar)) {
                bwVarE = null;
            }
        } while (!bnVar.f(objD, by.j(byVar, null, null, false, false, null, null, null, bwVarE, false, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_START_LISTENING_SEARCH)));
    }

    public final void t(com.waze.shared_infra.h.c cVar, final CreatePlannedDriveRequest createPlannedDriveRequest) {
        h.g.b.x.f(cVar, "destination");
        h.g.b.x.f(createPlannedDriveRequest, "request");
        Objects.toString(createPlannedDriveRequest);
        String strConcat = "got request ".concat(String.valueOf(createPlannedDriveRequest));
        com.waze.shared_infra.i.e eVar = this.f33313g;
        eVar.a(strConcat);
        kotlinx.coroutines.b.bn bnVar = this.f33316j;
        if (!h.g.b.x.n(((by) bnVar.d()).f(), ce.f33304a)) {
            cf cfVarF = ((by) bnVar.d()).f();
            Objects.toString(cfVarF);
            eVar.b("rejecting request, screen is busy: ".concat(String.valueOf(cfVarF)));
        } else if (this.f33315i) {
            L(this, createPlannedDriveRequest);
        } else {
            eVar.a("checking for danger zone...");
            this.f33310d.getDangerZoneType(cVar.d(), cVar.c(), new com.waze.jni.a() { // from class: com.waze.planned_drive.bm
                @Override // com.waze.jni.a
                public final void a(Object obj) {
                    ch.u(this.f33263a, createPlannedDriveRequest, (DriveTo.DangerZoneType) obj);
                }
            });
        }
    }

    public final void v(AddressItem addressItem) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVarJ;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVarJ = (by) objD;
            if (h.g.b.x.n(byVarJ.d().a(), addressItem)) {
                byVarJ = by.j(byVarJ, null, null, false, false, null, bu.d(byVarJ.d()), null, null, false, DisplayStrings.DS_GAS_PRICE_UPDATE_EDIT_PRICES);
            }
        } while (!bnVar.f(objD, byVarJ));
    }

    public final void w(boolean z) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.f33316j;
            Object objD = bnVar.d();
            boolean z2 = z;
            if (bnVar.f(objD, by.j((by) objD, null, null, false, z2, null, null, null, null, false, 503))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void x(com.waze.planned_drive.histogram.f fVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        h.g.b.x.f(fVar, "model");
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
        } while (!bnVar.f(objD, by.j(byVar, byVar.b().c(fVar), null, false, false, null, null, byVar.c().b(new com.waze.car_lib.screens.am(fVar, 7)), null, false, DisplayStrings.DS_MAJOR)));
    }

    public final void y() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, by.j((by) objD, null, null, true, false, null, null, null, null, false, 507)));
    }

    public final void z(AddressItem addressItem, boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by byVar;
        do {
            bnVar = this.f33316j;
            objD = bnVar.d();
            byVar = (by) objD;
        } while (!bnVar.f(objD, by.j(byVar, null, null, false, false, null, null, byVar.c().a(addressItem), null, false, DisplayStrings.DS_PILE_UP)));
        this.f33315i = z;
    }
}

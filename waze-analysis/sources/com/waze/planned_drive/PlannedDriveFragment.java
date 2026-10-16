package com.waze.planned_drive;

import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.cz;
import com.waze.da;
import com.waze.dc;
import com.waze.dw;
import com.waze.il;
import com.waze.ix;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.places.Address;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;
import com.waze.location.LocationSensorListener;
import com.waze.navigate.AddressItem;
import com.waze.navigate.eo;
import com.waze.navigate.gn;
import com.waze.planned_drive.histogram.HistogramRecyclerView;
import com.waze.reports.cx;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.a.aqz;
import l.a.arb;
import l.a.axj;
import l.a.axk;
import l.a.axl;
import l.a.axm;
import l.a.brd;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class PlannedDriveFragment extends com.waze.app_nav.a.b<com.waze.shared_infra.coordinators.s<?>> implements f, org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f33166a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f33167b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f33168c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f33169d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33170e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f33171f;

    /* renamed from: g, reason: collision with root package name */
    private HistogramRecyclerView f33172g;

    /* renamed from: h, reason: collision with root package name */
    private int f33173h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.shared_infra.s.d f33174i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.shared_infra.s.d f33175j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33176k;

    /* renamed from: l, reason: collision with root package name */
    private PlannedDriveNativeManager f33177l;
    private com.waze.ah.b m;
    private com.waze.af.e n;
    private NativeManager o;
    private ConfigManager p;
    private com.waze.app_nav.hub.b.c q;
    private ch r;
    private final z s;
    private com.waze.shared_infra.o.a t;
    private final eo u;
    private final ActivityResultLauncher v;

    public PlannedDriveFragment() {
        this.f33166a = com.waze.z.a.a.h.e(this);
        this.f33174i = null;
        this.f33175j = null;
        this.u = (eo) com.waze.web.r.h(eo.class);
        this.v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 3));
        this.s = new z() { // from class: com.waze.planned_drive.w
            @Override // com.waze.planned_drive.z
            public final void a(android.support.v4.app.ar arVar, y yVar) {
                ((com.waze.app_nav.w) com.waze.web.r.t((org.a.d.k.b) this.f33372a.f33166a.getValue(), com.waze.app_nav.w.class)).c();
            }
        };
    }

    private final VenueData D() {
        AddressItem addressItemH = this.r.h();
        VenueData.Builder builderNewBuilder = VenueData.newBuilder();
        builderNewBuilder.setName(addressItemH.getTitle());
        Position.IntPosition.Builder builderNewBuilder2 = Position.IntPosition.newBuilder();
        builderNewBuilder2.setLongitude(addressItemH.getLongitudeInt());
        builderNewBuilder2.setLatitude(addressItemH.getLatitudeInt());
        builderNewBuilder.setPosition(builderNewBuilder2);
        Address.Builder builderNewBuilder3 = Address.newBuilder();
        builderNewBuilder3.setHouseNumber(addressItemH.getHouseNumber());
        builderNewBuilder3.setStreet(addressItemH.getStreet());
        builderNewBuilder3.setCity(addressItemH.getCity());
        builderNewBuilder3.setState(addressItemH.getState());
        builderNewBuilder3.setCountry(addressItemH.getCountry());
        builderNewBuilder.setAddress(builderNewBuilder3);
        builderNewBuilder.setId(addressItemH.getVenueId());
        builderNewBuilder.setRoutingContext(addressItemH.getRoutingContext());
        return builderNewBuilder.build();
    }

    private final com.waze.shared_infra.s.d E(int i2) {
        return com.waze.sharedui.api.i.a(this.q, "PlannedDriveActivity:showProgressPopup", i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(y yVar) {
        this.s.a(this, yVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PlannedDriveFragmentResultValue", yVar == y.f33374a);
        getParentFragmentManager().aD("PlannedDriveFragmentResult", bundle);
    }

    private final void G() {
        if (this.r.h() != null) {
            if (this.r.I()) {
                com.waze.shared_infra.i.h.a("Planned drive model data still fresh. Re-using.");
                J();
                return;
            }
            this.r.r();
            AddressItem addressItemI = this.r.i();
            LoadPlannedDriveOptionsRequest.Builder builderNewBuilder = LoadPlannedDriveOptionsRequest.newBuilder();
            builderNewBuilder.setDaysFromNow(this.r.a());
            builderNewBuilder.setOrigin(N(addressItemI));
            builderNewBuilder.setDestination(D());
            LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequestBuild = builderNewBuilder.build();
            M(true);
            NativeManager.runOnNativeManagerReady(new android.support.v4.app.n(this, loadPlannedDriveOptionsRequestBuild, addressItemI, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(boolean z) {
        if (z && !ix.m(getContext()) && !this.p.getConfigValueBool(ConfigValues.CONFIG_VALUE_PRIVACY_USE_LOCATION_IN_BG_DIALOG_DONT_SHOW_AGAIN)) {
            this.v.launch(RequestAlwaysLocationDialogActivity.l(getContext(), com.waze.view.popups.n.f45327a));
            this.f33176k = true;
            return;
        }
        if (this.r.j().e() && this.u.T()) {
            NativeManager.Post(new com.waze.ads.f(this, 14));
        }
        com.waze.planned_drive.histogram.f fVarM = this.r.m();
        if (fVarM == null) {
            this.f33173h++;
            com.waze.shared_infra.i.h.j("PlannedDrive: Invalid null model, size: " + this.r.n().size() + ". Save clicked too soon? Doing nothing, retry " + this.f33173h);
            if (this.f33173h <= 5) {
                requireView().postDelayed(new com.waze.ads.f(this, 15), 200L);
                return;
            } else {
                com.waze.shared_infra.i.h.c("PlannedDrive: too many retries on save, giving up");
                this.f33173h = 0;
                return;
            }
        }
        K(axj.SAVE, this.r.i() == null ? axl.CURRENT : axl.CHANGED, Integer.valueOf(this.r.a()));
        AddressItem addressItemH = this.r.h();
        if (addressItemH == null || TextUtils.isEmpty(addressItemH.getMeetingId())) {
            AddressItem addressItemH2 = this.r.h();
            CreatePlannedDriveRequest.Builder builderNewBuilder = CreatePlannedDriveRequest.newBuilder();
            builderNewBuilder.setDestination(D());
            builderNewBuilder.setStartTimeSec(fVarM.c() / 1000);
            if (this.r.H()) {
                AddressItem addressItemI = this.r.i();
                VenueData.Builder builderNewBuilder2 = VenueData.newBuilder();
                builderNewBuilder2.setPosition(N(addressItemI));
                if (addressItemI != null) {
                    builderNewBuilder2.setName(addressItemI.getTitle().isEmpty() ? addressItemI.getAddress() : addressItemI.getTitle());
                    Address.Builder builderNewBuilder3 = Address.newBuilder();
                    builderNewBuilder3.setHouseNumber(addressItemI.getHouseNumber());
                    builderNewBuilder3.setStreet(addressItemI.getStreet());
                    builderNewBuilder3.setCity(addressItemI.getCity());
                    builderNewBuilder3.setState(addressItemI.getState());
                    builderNewBuilder3.setCountry(addressItemI.getCountry());
                    builderNewBuilder2.setAddress(builderNewBuilder3);
                    builderNewBuilder2.setId(addressItemI.getVenueId());
                    builderNewBuilder2.setRoutingContext(addressItemI.getRoutingContext());
                }
                builderNewBuilder.setOrigin(builderNewBuilder2.build());
            }
            this.r.t(new com.waze.shared_infra.h.c(addressItemH2.getLatitudeInt(), addressItemH2.getLongitudeInt()), builderNewBuilder.build());
        } else {
            AddressItem addressItemH3 = this.r.h();
            ch chVar = this.r;
            UpdatePlannedDriveRequest.Builder builderNewBuilder4 = UpdatePlannedDriveRequest.newBuilder();
            builderNewBuilder4.setMeetingId(addressItemH3.getMeetingId());
            builderNewBuilder4.setNewStartTimeSec(fVarM.c() / 1000);
            chVar.C(builderNewBuilder4.build());
        }
        this.f33173h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(com.waze.bt.e eVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("mode", eVar);
        android.support.v4.app.ch chVarU = getChildFragmentManager().u();
        chVarU.G(R.id.plannedDriveEndpoint, com.waze.bt.f.class, bundle, null);
        chVarU.a();
    }

    private final void J() {
        View view = getView();
        if (view == null) {
            return;
        }
        view.post(new com.google.firebase.appcheck.debug.a.a(this, view, 6));
    }

    private static void K(axj axjVar, axl axlVar, Integer num) {
        axk axkVarNewBuilder = axm.newBuilder();
        axkVarNewBuilder.a(axjVar);
        if (axlVar != null) {
            axkVarNewBuilder.c(axlVar);
        }
        if (num != null) {
            axkVarNewBuilder.b(num.intValue());
        }
        aqz aqzVarNewBuilder = arb.newBuilder();
        aqzVarNewBuilder.c(axkVarNewBuilder.build());
        arb arbVarBuild = aqzVarNewBuilder.build();
        com.waze.stats.ax axVarA = com.waze.stats.ax.f40550a.a();
        h.g.b.x.f(axVarA, "<this>");
        h.g.b.x.f(arbVarBuild, "wrapper");
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.H(arbVarBuild);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(axVarA, brfVarBuild);
    }

    private final void L() {
        AddressItem addressItemH = this.r.h();
        if (addressItemH == null) {
            F(y.f33375b);
            return;
        }
        AddressItem addressItemI = this.r.i();
        TextView textView = this.f33169d;
        if (addressItemI != null) {
            textView.setText(TextUtils.isEmpty(addressItemI.getTitle()) ? addressItemI.getAddress() : addressItemI.getTitle());
        } else {
            textView.setText(this.t.c(R.string.FUTURE_DRIVES_PLAN_CURRENT_LOCATION, new Object[0]));
            if (ConfigValues.CONFIG_VALUE_PLAN_DRIVE_SHOW_ORIGIN_NAME.b().booleanValue()) {
                final Position.IntPosition intPositionN = N(null);
                com.waze.shared_infra.h.c cVarI = com.waze.notifications.c.k.i(intPositionN);
                final Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
                com.waze.ae.e.a(this.m.a(cVarI, com.waze.ah.a.f14058a), lifecycle, new com.waze.ae.a() { // from class: com.waze.planned_drive.t
                    @Override // com.waze.ae.a
                    public final void a(Object obj) {
                        PlannedDriveFragment.p(this.f33365a, lifecycle, intPositionN, (com.waze.av.a.p) obj);
                    }
                });
            }
        }
        this.f33171f.setText(this.t.c(R.string.HISTOGRAM_HEADER_SUBTITLE_TEXT_PS, TextUtils.isEmpty(addressItemH.getTitle()) ? addressItemH.getAddress() : addressItemH.getTitle()));
    }

    private final void M(boolean z) {
        com.waze.shared_infra.s.d dVar = this.f33174i;
        if (z == (dVar != null)) {
            return;
        }
        if (z) {
            this.f33174i = E(R.string.PLEASE_WAIT___);
        } else {
            dVar.a();
            this.f33174i = null;
        }
    }

    private static final Position.IntPosition N(AddressItem addressItem) {
        int longitudeInt;
        int latitudeInt;
        if (addressItem == null) {
            Location lastLocation = com.waze.location.z.a().getLastLocation();
            if (lastLocation != null) {
                com.waze.location.bi biVarGetNativeLocation = LocationSensorListener.GetNativeLocation(lastLocation);
                longitudeInt = biVarGetNativeLocation.d();
                latitudeInt = biVarGetNativeLocation.c();
            } else {
                longitudeInt = 0;
                latitudeInt = 0;
            }
        } else {
            longitudeInt = addressItem.getLongitudeInt();
            latitudeInt = addressItem.getLatitudeInt();
        }
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        builderNewBuilder.setLongitude(longitudeInt);
        builderNewBuilder.setLatitude(latitudeInt);
        return builderNewBuilder.build();
    }

    public static /* synthetic */ void c(PlannedDriveFragment plannedDriveFragment, int i2) {
        HistogramRecyclerView histogramRecyclerView = plannedDriveFragment.f33172g;
        if (histogramRecyclerView != null) {
            histogramRecyclerView.ao(i2);
        }
    }

    public static /* synthetic */ void d(PlannedDriveFragment plannedDriveFragment, cf cfVar) {
        com.waze.shared_infra.s.d dVar = plannedDriveFragment.f33175j;
        if (dVar != null) {
            dVar.a();
            plannedDriveFragment.f33175j = null;
        }
        if (cfVar instanceof bz) {
            plannedDriveFragment.f33175j = plannedDriveFragment.E(R.string.PLEASE_WAIT___);
            return;
        }
        int i2 = 3;
        int i3 = 6;
        int i4 = 0;
        if (cfVar instanceof cb) {
            cb cbVar = (cb) cfVar;
            DriveTo.DangerZoneType dangerZoneTypeA = cbVar.a();
            h.g.a.l lVarB = cbVar.b();
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(com.waze.navigate.as.d(dangerZoneTypeA));
            oVar.P(com.waze.navigate.as.c(dangerZoneTypeA));
            oVar.f13808a = new dc(lVarB, 5);
            oVar.M(plannedDriveFragment.t.c(R.string.CANCEL, new Object[0]));
            oVar.N(plannedDriveFragment.t.c(R.string.DANGEROUS_ADDRESS_SAVE_BUTTON, new Object[0]));
            oVar.F(R.drawable.dangerous_zone_icon);
            oVar.H(new com.waze.design_components.c.f(lVarB, i3));
            oVar.R(true);
            Dialog dialogR = com.waze.z.a.d.ai.r(oVar, (com.waze.sharedui.a.e) plannedDriveFragment.getActivity());
            Objects.requireNonNull(dialogR);
            plannedDriveFragment.f33175j = new com.waze.map.b.am(dialogR, i2);
            return;
        }
        if (!(cfVar instanceof cd)) {
            if (cfVar instanceof cc) {
                plannedDriveFragment.F(y.f33374a);
                return;
            }
            return;
        }
        cd cdVar = (cd) cfVar;
        String strB = cdVar.b();
        String strA = cdVar.a();
        boolean zC = cdVar.c();
        com.waze.ab.o oVar2 = new com.waze.ab.o();
        if (TextUtils.isEmpty(strB)) {
            strB = plannedDriveFragment.t.c(R.string.FUTURE_DRIVES_ERROR_TITLE, new Object[0]);
        }
        oVar2.Q(strB);
        if (TextUtils.isEmpty(strA)) {
            strA = plannedDriveFragment.t.c(R.string.FUTURE_DRIVES_ERROR_MISC, new Object[0]);
        }
        oVar2.P(strA);
        oVar2.M(plannedDriveFragment.t.c(zC ? R.string.FUTURE_DRIVES_ERROR_BACK : R.string.OKAY, new Object[0]));
        oVar2.y(!zC);
        if (zC) {
            oVar2.f13808a = new dc(plannedDriveFragment, i3);
            oVar2.G(new v(plannedDriveFragment, i4));
        } else {
            oVar2.f13808a = new dc(plannedDriveFragment, 7);
            oVar2.G(new v(plannedDriveFragment, 2));
        }
        com.waze.ab.s sVar = new com.waze.ab.s((com.waze.sharedui.a.e) plannedDriveFragment.requireActivity(), oVar2);
        sVar.show();
        Objects.requireNonNull(sVar);
        plannedDriveFragment.f33175j = new com.waze.map.b.am(sVar, i2);
    }

    public static /* synthetic */ void f(PlannedDriveFragment plannedDriveFragment, com.waze.planned_drive.histogram.f fVar, boolean z) {
        if (z) {
            plannedDriveFragment.r.x(fVar);
        }
    }

    public static /* synthetic */ void g(PlannedDriveFragment plannedDriveFragment, LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse) {
        ch chVar;
        ArrayList arrayListH;
        List<Long> list;
        com.waze.planned_drive.histogram.f fVar;
        List<Long> list2;
        int i2 = 0;
        plannedDriveFragment.M(false);
        if (plannedDriveFragment.r.E(loadPlannedDriveOptionsResponse)) {
            return;
        }
        if (loadPlannedDriveOptionsResponse.hasIsTooLate() && loadPlannedDriveOptionsResponse.getIsTooLate()) {
            plannedDriveFragment.r.p();
            plannedDriveFragment.r.r();
            plannedDriveFragment.r.w(true);
            plannedDriveFragment.f33174i = plannedDriveFragment.E(R.string.FUTURE_DRIVES_PLAN_DAY_CHANGED_MESSAGE);
            plannedDriveFragment.G();
            return;
        }
        com.waze.shared_infra.i.h.a("Planned drive options loaded.");
        ch chVar2 = plannedDriveFragment.r;
        List<Integer> etasList = loadPlannedDriveOptionsResponse.getEtasList();
        List<Long> timesList = loadPlannedDriveOptionsResponse.getTimesList();
        Parcelable.Creator<com.waze.planned_drive.histogram.f> creator = com.waze.planned_drive.histogram.f.CREATOR;
        h.g.b.x.f(etasList, "etas");
        h.g.b.x.f(timesList, "times");
        List<Integer> list3 = etasList;
        Integer num = (Integer) h.a.i.K(list3);
        Integer num2 = (Integer) h.a.i.J(list3);
        if (num == null || num2 == null || timesList.size() != etasList.size()) {
            chVar = chVar2;
            arrayListH = h.a.i.h();
        } else {
            ArrayList arrayList = new ArrayList(h.a.i.q(list3, 10));
            int i3 = 0;
            for (Object obj : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.i.p();
                }
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = etasList.get(h.k.n.h(i3 - 1, i2)).intValue();
                int iIntValue3 = etasList.get(h.k.n.i(i4, etasList.size() - 1)).intValue();
                ch chVar3 = chVar2;
                long jLongValue = timesList.get(i3).longValue();
                int iIntValue4 = num.intValue();
                int iIntValue5 = num2.intValue();
                long millis = TimeUnit.SECONDS.toMillis(jLongValue);
                long millis2 = TimeUnit.SECONDS.toMillis(iIntValue);
                if (iIntValue4 == iIntValue5) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int i5 = 0;
                    for (int i6 = 10; i5 < i6; i6 = 10) {
                        arrayList2.add(Float.valueOf(0.5f));
                        i5++;
                    }
                    fVar = new com.waze.planned_drive.histogram.f(arrayList2, millis, millis2);
                    list = timesList;
                } else {
                    int i7 = iIntValue2 - iIntValue4;
                    int i8 = iIntValue3 - iIntValue4;
                    int i9 = iIntValue - iIntValue4;
                    ArrayList arrayList3 = new ArrayList(10);
                    int i10 = 0;
                    for (int i11 = 10; i10 < i11; i11 = 10) {
                        arrayList3.add(Float.valueOf(0.0f));
                        i10++;
                    }
                    ArrayList arrayList4 = arrayList3;
                    int i12 = 0;
                    while (i12 < 10) {
                        float f2 = iIntValue5 - iIntValue4;
                        float f3 = i9 / f2;
                        if (i12 < 5) {
                            list2 = timesList;
                            float f4 = i7 / f2;
                            arrayList4.set(i12, Float.valueOf(f4 + (com.waze.view.anim.d.f44973a.getInterpolation((i12 / 10.0f) + 0.5f) * (f3 - f4))));
                        } else {
                            list2 = timesList;
                            arrayList4.set(i12, Float.valueOf(f3 + (com.waze.view.anim.d.f44973a.getInterpolation((i12 - 5) / 10.0f) * ((i8 / f2) - f3))));
                        }
                        i12++;
                        timesList = list2;
                    }
                    list = timesList;
                    fVar = new com.waze.planned_drive.histogram.f(arrayList4, millis, millis2);
                }
                arrayList.add(fVar);
                i2 = 0;
                i3 = i4;
                chVar2 = chVar3;
                timesList = list;
            }
            chVar = chVar2;
            arrayListH = arrayList;
        }
        chVar.B(arrayListH);
        plannedDriveFragment.J();
    }

    public static /* synthetic */ void j(PlannedDriveFragment plannedDriveFragment, Position.IntPosition intPosition, String str) {
        if (TextUtils.isEmpty(str) || str.equals(plannedDriveFragment.t.c(R.string.STREETSROAD_WITHOUT_A_NAME, new Object[0]))) {
            return;
        }
        plannedDriveFragment.f33169d.setText(str);
        if (plannedDriveFragment.r.i() == null) {
            plannedDriveFragment.r.A(new AddressItem(intPosition.getLongitude(), intPosition.getLatitude(), str), false);
        }
    }

    public static /* synthetic */ void n(PlannedDriveFragment plannedDriveFragment, LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, AddressItem addressItem) {
        plannedDriveFragment.f33177l.loadPlannedDriveOptions(loadPlannedDriveOptionsRequest, new il(plannedDriveFragment, 19));
        plannedDriveFragment.r.v(addressItem);
    }

    public static /* synthetic */ void p(final PlannedDriveFragment plannedDriveFragment, Lifecycle lifecycle, final Position.IntPosition intPosition, com.waze.av.a.p pVar) {
        if (pVar == null) {
            return;
        }
        com.waze.ae.e.a(plannedDriveFragment.n.a(pVar), lifecycle, new com.waze.ae.a() { // from class: com.waze.planned_drive.u
            @Override // com.waze.ae.a
            public final void a(Object obj) {
                PlannedDriveFragment.j(this.f33368a, intPosition, (String) obj);
            }
        });
    }

    public static /* synthetic */ void q(PlannedDriveFragment plannedDriveFragment, View view) {
        AddressItem addressItemH = plannedDriveFragment.r.h();
        long startTimeMillis = addressItemH.getStartTimeMillis();
        if (true != plannedDriveFragment.r.F(addressItemH.getStartTimeMillis())) {
            startTimeMillis = -1;
        }
        boolean zG = plannedDriveFragment.r.G();
        List listN = plannedDriveFragment.r.n();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= listN.size()) {
                i2 = i3;
                break;
            }
            if (startTimeMillis == -1) {
                if (!zG && ((com.waze.planned_drive.histogram.f) listN.get(i2)).a() >= 8) {
                    zG = false;
                    break;
                }
            } else if (startTimeMillis == ((com.waze.planned_drive.histogram.f) listN.get(i2)).c()) {
                i3 = i2;
            }
            i2++;
        }
        int i4 = 2;
        if (!zG && i2 < 2) {
            i2 = 2;
        }
        view.post(new da(plannedDriveFragment, i2, i4));
    }

    static /* bridge */ /* synthetic */ void s(PlannedDriveFragment plannedDriveFragment) {
        K(axj.BACK, null, null);
        if (plannedDriveFragment.r.J()) {
            return;
        }
        plannedDriveFragment.F(y.f33375b);
    }

    public static /* synthetic */ void t(PlannedDriveFragment plannedDriveFragment, Lifecycle.Event event) {
        com.waze.shared_infra.s.d dVar;
        if (event != Lifecycle.Event.ON_STOP || (dVar = plannedDriveFragment.f33175j) == null) {
            return;
        }
        dVar.a();
    }

    public static /* synthetic */ void u(PlannedDriveFragment plannedDriveFragment) {
        K(axj.BACK, null, null);
        plannedDriveFragment.F(y.f33375b);
    }

    public static /* synthetic */ void x(PlannedDriveFragment plannedDriveFragment, Bundle bundle) {
        int i2 = bundle.getInt("RESULT_CODE", 0);
        Intent intentD = null;
        if (i2 == -1) {
            AddressItem addressItem = (AddressItem) BundleCompat.getParcelable(bundle, "RESULT_ADDRESS_ITEM", AddressItem.class);
            com.waze.bt.e eVar = (com.waze.bt.e) BundleCompat.getSerializable(bundle, "RESULT_EDIT_ENDPOINT_MODE", com.waze.bt.e.class);
            if (eVar != null) {
                intentD = com.waze.realtime_report_feedback.e.d(eVar == com.waze.bt.e.f17463b, addressItem);
            }
            i2 = -1;
        }
        if (i2 == -1 && intentD != null) {
            if (intentD.hasExtra("com.waze.planned_drive.PlannedDriveUtils.kt.origin")) {
                plannedDriveFragment.r.A((AddressItem) intentD.getParcelableExtra("com.waze.planned_drive.PlannedDriveUtils.kt.origin"), true);
            }
            boolean booleanExtra = intentD.getBooleanExtra("com.waze.planned_drive.PlannedDriveUtils.kt.dangerZoneConfirmed", false);
            if (intentD.hasExtra("com.waze.planned_drive.PlannedDriveUtils.kt.destination")) {
                plannedDriveFragment.r.z((AddressItem) intentD.getParcelableExtra("com.waze.planned_drive.PlannedDriveUtils.kt.destination"), booleanExtra);
            }
            plannedDriveFragment.L();
            plannedDriveFragment.G();
        }
        if (plannedDriveFragment.r.i() == null && plannedDriveFragment.r.h() == null) {
            plannedDriveFragment.F(y.f33375b);
        }
        android.support.v4.app.ar arVarG = plannedDriveFragment.getChildFragmentManager().g(R.id.plannedDriveEndpoint);
        if (arVarG != null) {
            android.support.v4.app.ch chVarU = plannedDriveFragment.getChildFragmentManager().u();
            chVarU.n(arVarG);
            chVarU.a();
        }
    }

    @Override // com.waze.planned_drive.f
    public final void a(bx bxVar) {
        this.r.D(bxVar);
        this.r.w(false);
        G();
    }

    @Override // com.waze.app_nav.a.b, org.a.d.a.a
    public final org.a.d.a getKoin() {
        return com.waze.web.r.k();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f33166a.getValue();
    }

    @Override // org.a.a.b.a
    public final void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = getResources().getConfiguration().orientation;
        if (getArguments() != null) {
            i2 = getArguments().getInt("forcedOrientation", i2);
        }
        View viewInflate = i2 == 1 ? layoutInflater.inflate(R.layout.planned_drive, viewGroup, false) : layoutInflater.inflate(R.layout.planned_drive_landscape, viewGroup, false);
        com.waze.shared_infra.g.e.c(viewInflate.findViewById(R.id.plannedDriveLayout));
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f33167b = null;
        this.f33168c = null;
        this.f33169d = null;
        this.f33170e = null;
        this.f33171f = null;
        this.f33172g = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        if (this.f33176k) {
            this.f33176k = false;
            return;
        }
        bw bwVarK = this.r.k();
        boolean z = bwVarK instanceof bv;
        ch chVar = this.r;
        if (z) {
            chVar.s(bwVarK);
            if (this.r.h() != null) {
                com.waze.shared_infra.i.h.c("Flag to select destination is true but destination is already given! Setting to null.");
                this.r.z(null, false);
            }
            I(com.waze.bt.e.f17464c);
            return;
        }
        AddressItem addressItemH = chVar.h();
        if (addressItemH == null) {
            return;
        }
        if (this.r.j().f()) {
            if (!TextUtils.isEmpty(addressItemH.getMeetingId())) {
                this.f33167b.setText(this.t.c(R.string.NAVLIST_OPTIONS_EDIT_PLANNED_DRIVE, new Object[0]));
                L();
                if (addressItemH.getStartTimeMillis() == -1) {
                    G();
                    return;
                }
                bx bxVarL = this.r.l(addressItemH.getStartTimeMillis());
                if (bxVarL != null) {
                    a(bxVarL);
                    return;
                }
                com.waze.shared_infra.i.h.c("Unable to edit planned drive because timestamp out of range: " + addressItemH.getStartTimeMillis());
                F(y.f33375b);
                return;
            }
            com.waze.shared_infra.i.h.c("Unable to edit planned drive because it has no meeting id. Treating as new drive.");
        }
        addressItemH.setMeetingId(null);
        L();
        G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [h.g.a.a, org.a.d.i.a] */
    /* JADX WARN: Type inference failed for: r2v51 */
    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        ?? r2;
        h.g.b.m mVar;
        org.a.d.k.b bVar;
        this.f33167b = (TextView) view.findViewById(R.id.lblTitle);
        this.f33168c = (TextView) view.findViewById(R.id.linkSave);
        this.f33169d = (TextView) view.findViewById(R.id.lblChangeFrom);
        this.f33170e = (TextView) view.findViewById(R.id.lblChangeWhen);
        this.f33171f = (TextView) view.findViewById(R.id.lblDestination);
        this.f33172g = (HistogramRecyclerView) view.findViewById(R.id.plannedDriveRecycler);
        TextView textView = (TextView) view.findViewById(R.id.tvFooterText);
        ImageView imageView = (ImageView) view.findViewById(R.id.btnBack);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.btnChangeFrom);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.btnChangeWhen);
        TextView textView2 = (TextView) view.findViewById(R.id.lblFrom);
        TextView textView3 = (TextView) view.findViewById(R.id.lblWhen);
        TextView textView4 = (TextView) view.findViewById(R.id.lblArriveAt);
        TextView textView5 = (TextView) view.findViewById(R.id.lblTraffic);
        PlannedDriveDayPicker plannedDriveDayPicker = (PlannedDriveDayPicker) view.findViewById(R.id.plannedDriveDayPicker);
        org.a.d.k.b bVar2 = (org.a.d.k.b) this.f33166a.getValue();
        this.f33177l = (PlannedDriveNativeManager) com.waze.web.r.t(bVar2, PlannedDriveNativeManager.class);
        this.m = (com.waze.ah.b) com.waze.web.r.t(bVar2, com.waze.ah.b.class);
        this.n = (com.waze.af.e) com.waze.web.r.t(bVar2, com.waze.af.e.class);
        this.o = (NativeManager) com.waze.web.r.t(bVar2, NativeManager.class);
        this.p = (ConfigManager) com.waze.web.r.t(bVar2, ConfigManager.class);
        this.q = (com.waze.app_nav.hub.b.c) com.waze.web.r.t(bVar2, com.waze.app_nav.hub.b.c.class);
        this.t = (com.waze.shared_infra.o.a) com.waze.web.r.t(bVar2, com.waze.shared_infra.o.a.class);
        h.g.b.x.f(this, "<this>");
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("no data in the Intent. Did you open the flow using [new PlannedDriveFlowBuilder()]?");
        }
        s sVar = (s) BundleCompat.getParcelable(arguments, "PLANNED_DRIVE_FLOW_INPUT_INTENT_EXTRA", s.class);
        PlannedDriveFragment plannedDriveFragment = this;
        this.r = (ch) h.g.b(h.h.f48132c, new ab(plannedDriveFragment, new aa(plannedDriveFragment), sVar != null ? new gn(sVar, 12) : null)).getValue();
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new x(this));
        getChildFragmentManager().aE("EDIT_ENDPOINT_RESULT_KEY", getViewLifecycleOwner(), new com.waze.app_nav.i(this, 1));
        this.f33167b.setText(this.t.c(R.string.HISTOGRAM_HEADER_TITLE_TEXT, new Object[0]));
        textView.setText(this.t.c(R.string.HISTOGRAM_FOOTER_TEXT, new Object[0]));
        imageView.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 1));
        this.f33168c.setText(this.t.c(R.string.SAVE, new Object[0]));
        this.f33168c.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 2));
        this.r.e().observe(getViewLifecycleOwner(), new cz(this, 10));
        linearLayout.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 3));
        linearLayout2.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 4));
        this.r.f().observe(getViewLifecycleOwner(), new cz(this, 5));
        textView2.setText(this.t.c(R.string.FUTURE_DRIVES_PLAN_FROM_LABEL, new Object[0]));
        textView3.setText(this.t.c(R.string.FUTURE_DRIVES_PLAN_DAY_LABEL, new Object[0]));
        textView4.setText(this.t.c(R.string.FUTURE_DRIVES_PLAN_TIME_LABEL, new Object[0]));
        textView5.setText(this.t.c(R.string.TRAFFIC, new Object[0]));
        com.waze.planned_drive.histogram.b bVar3 = (com.waze.planned_drive.histogram.b) com.waze.web.r.t(bVar2, com.waze.planned_drive.histogram.b.class);
        LiveData liveDataD = this.r.d();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Objects.requireNonNull(bVar3);
        liveDataD.observe(viewLifecycleOwner, new cz(bVar3, 6));
        this.f33172g.aH(bVar3);
        this.f33172g.aI(new cx(this));
        plannedDriveDayPicker.c(this);
        LiveData liveDataB = this.r.b();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Objects.requireNonNull(plannedDriveDayPicker);
        liveDataB.observe(viewLifecycleOwner2, new cz(plannedDriveDayPicker, 7));
        LiveData liveDataC = this.r.c();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Objects.requireNonNull(plannedDriveDayPicker);
        liveDataC.observe(viewLifecycleOwner3, new cz(plannedDriveDayPicker, 8));
        this.r.g().observe(getViewLifecycleOwner(), new cz(this, 9));
        getLifecycle().addObserver(new com.waze.car_lib.screens.t(this, 1));
        org.a.d.a.a aVar = com.waze.stats.b.d.f40563a;
        if (aVar instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.stats.b.d.class);
            r2 = 0;
            bVar = bVarL;
        } else {
            r2 = 0;
            org.a.d.k.b bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.stats.b.d.class);
            bVar = bVarC;
        }
        ((com.waze.stats.b.d) bVar.a(mVar, r2, r2)).a();
    }

    public PlannedDriveFragment(z zVar) {
        this.f33166a = com.waze.z.a.a.h.e(this);
        this.f33174i = null;
        this.f33175j = null;
        this.u = (eo) com.waze.web.r.h(eo.class);
        this.v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 3));
        this.s = zVar;
    }
}

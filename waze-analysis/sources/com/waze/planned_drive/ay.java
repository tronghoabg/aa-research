package com.waze.planned_drive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.ix;
import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import com.waze.lh;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.cs;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ci;
import com.waze.settings.cj;
import com.waze.settings.cr;
import com.waze.sharedui.views.WazeSwitchView;
import com.waze.strings.DisplayStrings;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import com.waze.view.title.TitleBar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay extends com.waze.app_nav.a.b implements com.waze.menus.d, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33212a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f33213b;
    private TextView A;
    private LinearLayout B;
    private ap C;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f33214c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f33215d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f33216e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f33217f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f33218g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f33219h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f33220i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f33221j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f33222k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f33223l;
    private final com.waze.shared_infra.i.e m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private final h.f r;
    private final h.f s;
    private final List t;
    private final MutableLiveData u;
    private TitleBar v;
    private RecyclerView w;
    private ImageButton x;
    private WazeSwitchView y;
    private TextView z;

    static {
        h.o.c cVar = h.o.a.f48264a;
        f33213b = h.o.a.m(h.o.c.i(2, h.o.d.f48275f));
    }

    public ay() {
        ay ayVar = this;
        h.h hVar = h.h.f48130a;
        this.f33214c = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 3));
        this.f33215d = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 4));
        this.f33216e = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 5));
        this.f33217f = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 6));
        this.f33218g = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 7));
        this.f33219h = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 8));
        this.f33220i = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 9));
        this.f33221j = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 10));
        this.f33222k = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 11));
        this.f33223l = h.g.b(hVar, new ae((org.a.d.a.a) ayVar, 2));
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PlannedDriveListFragment");
        h.g.b.x.e(eVarD, "create(...)");
        this.m = eVarD;
        this.r = h.g.a(new ae((Object) this, 1));
        this.s = h.g.a(new ae((Object) this, 0));
        this.t = new ArrayList();
        this.u = new MutableLiveData(h.a.i.h());
    }

    static final void A(ay ayVar) {
        AddressItem[] plannedDriveEvents = ((DriveToNativeManager) ayVar.f33216e.getValue()).getPlannedDriveEvents();
        Context context = ayVar.getContext();
        ayVar.o = (!ayVar.F().calendarAuthUndetermined() && ayVar.F().calendarAuthorized() && (context != null ? ayVar.F().calendarAccessEnabled(context) : false)) ? false : true;
        ArrayList arrayListR = plannedDriveEvents != null ? h.a.c.R(plannedDriveEvents) : h.a.i.h();
        if (ayVar.o) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListR) {
                AddressItem addressItem = (AddressItem) obj;
                Integer category = addressItem.getCategory();
                if (category == null || category.intValue() != 7) {
                    Integer category2 = addressItem.getCategory();
                    if (category2 == null || category2.intValue() != 6) {
                        arrayList.add(obj);
                    }
                }
            }
            arrayListR = arrayList;
        }
        ayVar.u.postValue(arrayListR);
    }

    static final void C(ay ayVar) {
        com.waze.bs.a.f("settings_main.notifications_and_reminders.planned_drive", null, false);
        ayVar.I().a(bh.f33250g);
    }

    static final void D(ay ayVar) {
        ayVar.I().a(bh.f33245b);
        r.f33352a.a().f().c(bj.f33258c).h();
    }

    static final void E(ay ayVar) {
        ayVar.I().a(bh.f33248e);
        WazeSwitchView wazeSwitchView = ayVar.y;
        if (wazeSwitchView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (wazeSwitchView.d() || ayVar.R()) {
            ayVar.P();
        } else {
            RequestAlwaysLocationDialogActivity.n((com.waze.sharedui.a.e) ayVar.requireActivity(), com.waze.view.popups.n.f45328b, 1031);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeManager F() {
        return (NativeManager) this.f33218g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.app_nav.w G() {
        return (com.waze.app_nav.w) this.f33222k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlannedDriveNativeManager H() {
        return (PlannedDriveNativeManager) this.f33217f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bk I() {
        return (bk) this.f33220i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsNativeManager J() {
        return (SettingsNativeManager) this.f33215d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.shared_infra.o.a K() {
        return (com.waze.shared_infra.o.a) this.f33214c.getValue();
    }

    private final SimpleDateFormat L() {
        return (SimpleDateFormat) this.r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        G().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        O();
        ((com.waze.navigate.j) this.f33219h.getValue()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        NativeManager.Post(new Runnable() { // from class: com.waze.planned_drive.ag
            @Override // java.lang.Runnable
            public final void run() {
                ay.A(this.f33189a);
            }
        });
    }

    private final void P() {
        WazeSwitchView wazeSwitchView = this.y;
        if (wazeSwitchView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wazeSwitchView.c();
        SettingsNativeManager settingsNativeManagerJ = J();
        WazeSwitchView wazeSwitchView2 = this.y;
        if (wazeSwitchView2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cr.setNotificationPreferences$default(settingsNativeManagerJ, "events", wazeSwitchView2.d(), null, 4, null);
        WazeSwitchView wazeSwitchView3 = this.y;
        if (wazeSwitchView3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (wazeSwitchView3.d()) {
            ConfigValues.CONFIG_VALUE_CALENDAR_RECEIVE_EARLY_REMINDERS.d(true);
        }
    }

    private final boolean Q() {
        return ix.n(requireContext());
    }

    private final boolean R() {
        return ix.m(requireContext());
    }

    public static final /* synthetic */ com.waze.places.g g(ay ayVar) {
        return (com.waze.places.g) ayVar.f33223l.getValue();
    }

    public static final /* synthetic */ String m(ay ayVar, int i2) {
        int i3 = lh.f25149a;
        int i4 = i2 > 0 ? (i2 / 60) / 60 : 0;
        int i5 = i2 > 0 ? (i2 / 60) % 60 : 0;
        return i4 > 0 ? i5 == 0 ? ayVar.K().c(R.string.FUTURE_DRIVES_LIST_ITEM_DRIVE_HOURS_PS, Integer.valueOf(i4)) : ayVar.K().c(R.string.FUTURE_DRIVES_LIST_ITEM_DRIVE_HOURS_MINUTES, Integer.valueOf(i4), Integer.valueOf(i5)) : ayVar.K().c(R.string.FUTURE_DRIVES_LIST_ITEM_DRIVE_MINUTES_PD, Integer.valueOf(i5));
    }

    public static final /* synthetic */ SimpleDateFormat n(ay ayVar) {
        return (SimpleDateFormat) ayVar.s.getValue();
    }

    static final SimpleDateFormat o(ay ayVar) {
        return new SimpleDateFormat("EEE, dd MMM yyyy", ayVar.F().getLocale());
    }

    static final SimpleDateFormat p(ay ayVar) {
        return new SimpleDateFormat(true != ayVar.F().is24HrClock() ? "hh:mm a" : "HH:mm", ayVar.F().getLocale());
    }

    public static final /* synthetic */ void t(ay ayVar, cj cjVar) {
        if (!(cjVar instanceof com.waze.settings.ch)) {
            if (!h.g.b.x.n(cjVar, ci.f36968a)) {
                throw new h.i();
            }
            cr.getNotificationPreferences$default(ayVar.J(), null, 1, null);
            return;
        }
        for (com.waze.settings.ah ahVar : ((com.waze.settings.ch) cjVar).a()) {
            if (h.g.b.x.n("events", ahVar.f36767a)) {
                boolean z = ahVar.f36768b;
                ayVar.n = z;
                WazeSwitchView wazeSwitchView = ayVar.y;
                if (wazeSwitchView == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z2 = false;
                if (z && ayVar.R()) {
                    z2 = true;
                }
                wazeSwitchView.b(z2);
            }
        }
    }

    public static final /* synthetic */ void u(ay ayVar, AddressItem addressItem) {
        if (addressItem.getType() == 11) {
            ayVar.I().a(bh.f33247d);
        } else if (addressItem.isPlannedDrive()) {
            ayVar.I().a(bh.f33249f);
        } else if (addressItem.getType() == 9) {
            ayVar.I().a(bh.f33244a);
        }
        if (addressItem.getType() != 11) {
            if ((addressItem.getIsValidate() || addressItem.isFutureDrive()) && addressItem.hasLocation()) {
                if (addressItem.isFutureDrive()) {
                    ((com.waze.navigate.b.g) ayVar.f33221j.getValue()).a(com.waze.navigate.b.b.f31029b, addressItem.getMeetingId());
                }
                ayVar.B(addressItem);
                return;
            } else {
                com.waze.shared_infra.i.e eVar = ayVar.m;
                Objects.toString(addressItem);
                eVar.b("invalid address item: ".concat(String.valueOf(addressItem)));
                return;
            }
        }
        if (addressItem.getIsValidate() && addressItem.hasLocation()) {
            ayVar.B(addressItem);
            return;
        }
        String address = addressItem.getAddress();
        h.g.b.x.e(address, "getAddress(...)");
        if (address.length() != 0) {
            addressItem.setTitle(addressItem.getAddress());
        }
        android.support.v4.app.av activity = ayVar.getActivity();
        if (activity != null) {
            new cs(addressItem).b(activity, 32789);
        }
    }

    public static final /* synthetic */ void v(ay ayVar, FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse) {
        String meetingId = fetchPlannedDriveTimeResponse.getMeetingId();
        h.g.b.x.e(meetingId, "getMeetingId(...)");
        int driveTimeSec = fetchPlannedDriveTimeResponse.getDriveTimeSec();
        if (ayVar.getView() == null || !ayVar.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        for (ao aoVar : ayVar.t) {
            if (aoVar instanceof ah) {
                ah ahVar = (ah) aoVar;
                if (ahVar.a().getMeetingId() != null && h.g.b.x.n(ahVar.a().getMeetingId(), meetingId)) {
                    LifecycleOwner viewLifecycleOwner = ayVar.getViewLifecycleOwner();
                    h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new as(ayVar, aoVar, driveTimeSec, null), 3);
                    return;
                }
            }
        }
    }

    public static final /* synthetic */ void w(ay ayVar, List list) {
        List list2 = ayVar.t;
        list2.clear();
        if (list.isEmpty()) {
            com.waze.menus.h.f29724a = 0;
            list2.add(al.f33194a);
        } else {
            com.waze.menus.h.f29724a = list.size();
            list2.add(an.f33196a);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ayVar.p = ayVar.L().format(Long.valueOf(System.currentTimeMillis()));
            SimpleDateFormat simpleDateFormatL = ayVar.L();
            long jCurrentTimeMillis = System.currentTimeMillis();
            h.o.c cVar = h.o.a.f48264a;
            ayVar.q = simpleDateFormatL.format(Long.valueOf(jCurrentTimeMillis + h.o.a.m(h.o.c.i(1, h.o.d.f48276g))));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AddressItem addressItem = (AddressItem) it.next();
                String strC = ayVar.L().format(Long.valueOf(addressItem.getStartTimeMillis()));
                if (h.g.b.x.n(strC, ayVar.p)) {
                    strC = ayVar.K().c(R.string.TODAY_CAP, new Object[0]);
                } else if (h.g.b.x.n(strC, ayVar.q)) {
                    strC = ayVar.K().c(R.string.TOMORROW, new Object[0]);
                }
                h.g.b.x.c(strC);
                if (!linkedHashSet.contains(strC)) {
                    linkedHashSet.add(strC);
                    list2.add(new ak(strC));
                }
                list2.add(new ah(addressItem));
            }
        }
        if (ayVar.o) {
            list2.add(aj.f33192a);
            list2.add(ai.f33191a);
            list2.add(am.f33195a);
        }
        ap apVar = ayVar.C;
        if (apVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        apVar.notifyDataSetChanged();
        boolean z = ayVar.Q() && com.waze.menus.h.f29724a > 0;
        LinearLayout linearLayout = ayVar.B;
        if (linearLayout == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        linearLayout.setVisibility(true != z ? 8 : 0);
        int i2 = com.waze.menus.h.f29724a;
        LinearLayout linearLayout2 = ayVar.B;
        if (linearLayout2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ayVar.I().b(i2 > 0 ? bi.f33253a : bi.f33254b, linearLayout2.getVisibility() != 0 ? bg.f33240a : ayVar.n ? bg.f33242c : bg.f33241b);
    }

    static final void z(ay ayVar, PlannedDriveResponse plannedDriveResponse) {
        if (plannedDriveResponse != null) {
            h.g.b.x.f(plannedDriveResponse, "response");
            if (plannedDriveResponse.getSuccess()) {
                ayVar.N();
            } else {
                ayVar.m.b("onPlannedDriveDeleted: deletion failed");
            }
        }
    }

    public final void B(AddressItem addressItem) {
        h.g.b.x.f(addressItem, "destination");
        com.waze.shared_infra.s.c cVarB = ((com.waze.modules.navigation.bp) com.waze.web.r.m(com.waze.modules.navigation.bp.class)).b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.f30285a, new com.waze.modules.navigation.ai(addressItem), null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5).c(true));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ar(cVarB, this, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.menus.d
    public final void b(AddressItem addressItem, com.waze.menus.f fVar) {
        h.g.b.x.f(addressItem, "addressItem");
        h.g.b.x.f(fVar, "option");
        com.waze.menus.f fVar2 = com.waze.menus.f.ADD_FAVORITE;
        switch (fVar) {
            case ADD_FAVORITE:
            case REMOVE_FAVORITE:
            case EDIT_HOME:
            case EDIT_WORK:
            case SET_START_POINT:
            case RENAME_FAVORITE:
                return;
            case CHANGE_LOCATION:
                android.support.v4.app.av activity = getActivity();
                if (activity != null) {
                    cs csVar = new cs(addressItem);
                    csVar.g();
                    csVar.b(activity, 1032);
                    return;
                }
                return;
            case PARKING:
                com.waze.search.t tVarF = new com.waze.search.t().f(addressItem);
                ay ayVar = this;
                h.g.b.x.f(ayVar, "fragment");
                android.support.v4.app.av avVarRequireActivity = ayVar.requireActivity();
                h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
                ayVar.startActivityForResult(tVarF.a(avVarRequireActivity), 0);
                return;
            case CALENDAR_SETTINGS:
                com.waze.bs.a.f("settings_main.notifications_and_reminders.planned_drive", "MAP", false);
                return;
            case INFO:
                h.g.b.x.f(addressItem, "addressItem");
                cs csVar2 = new cs(addressItem);
                String venueId = addressItem.getVenueId();
                h.g.b.x.e(venueId, "getVenueId(...)");
                csVar2.e(venueId.length() > 0);
                android.support.v4.app.av activity2 = getActivity();
                if (activity2 != null) {
                    csVar2.b(activity2, 1);
                    return;
                }
                return;
            case SEND_LOCATION:
                com.waze.share.aa.e(requireActivity(), com.waze.share.z.f37756c, addressItem);
                return;
            case ROUTES:
                F().setShowRoutesWhenNavigationStarts(true);
                B(addressItem);
                M();
                return;
            case SET_LOCATION:
                android.support.v4.app.av activity3 = getActivity();
                if (activity3 == null || addressItem.getType() != 11) {
                    return;
                }
                new cs(addressItem).b(activity3, 32789);
                return;
            case DELETE:
                h.g.b.x.f(addressItem, "addressItem");
                if (addressItem.getType() == 11) {
                    LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                    h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ar(this, addressItem, (h.c.e) null, 0), 3);
                    return;
                } else {
                    DeletePlannedDriveRequest.Builder builderNewBuilder = DeletePlannedDriveRequest.newBuilder();
                    builderNewBuilder.setMeetingId(addressItem.getMeetingId());
                    DeletePlannedDriveRequest deletePlannedDriveRequestBuild = builderNewBuilder.build();
                    h.g.b.x.e(deletePlannedDriveRequestBuild, "build(...)");
                    H().deletePlannedDrive(deletePlannedDriveRequestBuild, new bb(this, 1));
                    return;
                }
            case EDIT_PLANNED_DRIVE:
                r.f33352a.a().d(addressItem).e(true).c(bj.f33258c).h();
                return;
            default:
                throw new h.i();
        }
    }

    @Override // android.support.v4.app.ar
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1031) {
            if (i2 != 1032) {
                return;
            }
            O();
        } else if (ix.m(requireContext())) {
            P();
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        getParentFragmentManager().aE("PlannedDriveFragmentResult", this, new com.waze.app_nav.i(this, 2));
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.planned_drive_list_layout, viewGroup, false);
        this.v = (TitleBar) viewInflate.findViewById(R.id.titleBar);
        this.w = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.x = (ImageButton) viewInflate.findViewById(R.id.btnPlanDrive);
        this.y = (WazeSwitchView) viewInflate.findViewById(R.id.notificationSettingsToggle);
        this.z = (TextView) viewInflate.findViewById(R.id.notificationSettingsText);
        this.A = (TextView) viewInflate.findViewById(R.id.notificationSettingsDescription);
        this.B = (LinearLayout) viewInflate.findViewById(R.id.notificationSettingsContainer);
        int i2 = 1;
        if (viewInflate.getResources().getConfiguration().orientation == 1) {
            ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new com.waze.view.title.a(i2));
        }
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        O();
        cr.getNotificationPreferences$default(J(), null, 1, null);
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        int i2 = 1;
        int i3 = 0;
        if (Q()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ax(this, null, 0), 3);
            TextView textView = this.z;
            if (textView == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            textView.setText(K().c(R.string.FUTURE_DRIVES_LIST_NOTIFY_ME_SETTINGS, new Object[0]));
            TextView textView2 = this.A;
            if (textView2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            textView2.setText(K().c(R.string.FUTURE_DRIVES_LIST_NOTIFY_ME_DESCRIPTION, new Object[0]));
            WazeSwitchView wazeSwitchView = this.y;
            if (wazeSwitchView == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            wazeSwitchView.setOnClickListener(new af(this, i2));
            cr.getNotificationPreferences$default(J(), null, 1, null);
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner2, new at(this));
        ap apVar = new ap(this);
        this.C = apVar;
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        recyclerView.ak(apVar);
        this.u.observe(getViewLifecycleOwner(), new av(new au(this)));
        TitleBar titleBar = this.v;
        if (titleBar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar.p(K().c(R.string.FUTURE_DRIVES_LIST_TITLE, new Object[0]));
        TitleBar titleBar2 = this.v;
        if (titleBar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar2.e(K().c(R.string.FUTURE_DRIVES_LIST_TITLE, new Object[0]), true);
        TitleBar titleBar3 = this.v;
        if (titleBar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar3.i(K().c(R.string.SETTINGS, new Object[0]));
        TitleBar titleBar4 = this.v;
        if (titleBar4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar4.k(ContextCompat.getColor(requireContext(), R.color.on_primary));
        TitleBar titleBar5 = this.v;
        if (titleBar5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar5.j(ContextCompat.getColor(requireContext(), R.color.primary));
        TitleBar titleBar6 = this.v;
        if (titleBar6 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar6.n(new af(this, i3));
        TitleBar titleBar7 = this.v;
        if (titleBar7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        titleBar7.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 5));
        af afVar = new af(this, 2);
        ImageButton imageButton = this.x;
        if (imageButton == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        imageButton.setOnClickListener(afVar);
        if (requireArguments().getBoolean("search", false)) {
            ImageButton imageButton2 = this.x;
            if (imageButton2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            imageButton2.performClick();
        }
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ax(this, null, 1, null), 3);
    }
}

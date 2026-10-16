package com.waze.navbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.a.y;
import com.waze.config.ConfigValues;
import com.waze.gp;
import com.waze.jni.protos.VenueImage;
import com.waze.jni.protos.navigate.DangerZoneEod;
import com.waze.lm;
import com.waze.location.bg;
import com.waze.main.navigate.LocationData;
import com.waze.mg;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NavigateNativeManager;
import com.waze.navigate.cw;
import com.waze.navigate.eo;
import com.waze.navigate.fk;
import com.waze.navigate.location_preview.ba;
import com.waze.reports.bx;
import com.waze.reports.bz;
import com.waze.reports.cm;
import com.waze.reports.ed;
import com.waze.sharedui.g.s;
import com.waze.sharedui.g.t;
import com.waze.sharedui.utils.RequestPermissionActivity;
import com.waze.ui.x.u;
import com.waze.z.a.d.ai;
import h.ab;
import h.g.b.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    DriveToNativeManager f30902a;

    /* renamed from: b, reason: collision with root package name */
    NativeManager f30903b;

    /* renamed from: c, reason: collision with root package name */
    LocationData f30904c;

    /* renamed from: d, reason: collision with root package name */
    protected final Handler f30905d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.q.a.b f30906e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnClickListener f30907f;

    /* renamed from: g, reason: collision with root package name */
    private String f30908g;

    /* renamed from: h, reason: collision with root package name */
    private ed f30909h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30910i;

    /* renamed from: j, reason: collision with root package name */
    private DriveToNativeManager.AddressItemAppData f30911j;

    /* renamed from: k, reason: collision with root package name */
    private cm f30912k;

    /* renamed from: l, reason: collision with root package name */
    private AddressItem f30913l;
    private boolean m;
    private Bitmap n;
    private final com.waze.shared_infra.o.a o;
    private final eo p;
    private final fk q;
    private n r;
    private com.waze.ui.r.a.e.b.a s;
    private Consumer t;

    public p(Context context) {
        super(context);
        this.f30906e = (com.waze.main_screen.q.a.b) com.waze.web.r.h(com.waze.main_screen.q.a.b.class);
        this.o = com.waze.shared_infra.o.b.a();
        this.p = (eo) com.waze.web.r.h(eo.class);
        this.q = (fk) com.waze.web.r.h(fk.class);
        this.r = new j(this);
        o oVar = new o(this);
        this.f30905d = oVar;
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        if (!isInEditMode()) {
            this.f30903b = NativeManager.getInstance();
            this.f30902a = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
        }
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.navbar_nearing_dest_photo, this);
        this.f30903b.addParkingUpdates(oVar);
    }

    public static /* synthetic */ void E(p pVar) {
        pVar.f30911j.bNearingMinimized = true;
        pVar.q();
    }

    public static /* synthetic */ void F(final p pVar, final com.waze.parking.d dVar) {
        String strC;
        dVar.d(pVar.f30908g);
        s[] sVarArr = new s[2];
        byte[] destinationVenueDataNTV = NativeManager.getInstance().getDestinationVenueDataNTV();
        ed edVar = destinationVenueDataNTV == null ? null : new ed(destinationVenueDataNTV);
        if (edVar != null) {
            for (String str : edVar.E()) {
                if (str != null && NavigateNativeManager.instance().isVenueCategoryWithImplicitParking(str)) {
                    strC = pVar.o.c(R.string.NEARING_PARKING_MENU_CHANGE, new Object[0]);
                    break;
                }
            }
            strC = pVar.o.c(R.string.NEARING_PARKING_MENU_FIND, new Object[0]);
        } else {
            strC = pVar.o.c(R.string.NEARING_PARKING_MENU_FIND, new Object[0]);
        }
        sVarArr[0] = new s(0, strC, ContextCompat.getDrawable(pVar.getContext(), true != "latam".equals(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b()) ? R.drawable.search_parking : R.drawable.search_parking_latam));
        com.waze.shared_infra.o.a aVar = pVar.o;
        sVarArr[1] = new s(1, aVar.c(R.string.NEARING_PARKING_MENU_MARK, new Object[0]), ContextCompat.getDrawable(pVar.getContext(), R.drawable.park_here));
        final t tVar = new t(lm.d().e(), com.waze.sharedui.g.f.COLUMN_TEXT_ICON, aVar.c(R.string.NEARING_PARKING_MENU_TITLE, new Object[0]), sVarArr, null);
        tVar.q(new com.waze.sharedui.g.q() { // from class: com.waze.navbar.h
            @Override // com.waze.sharedui.g.q
            public final void a(s sVar) {
                p.h(this.f30888a, dVar, tVar, sVar);
            }
        });
        tVar.show();
    }

    public static /* synthetic */ void H(p pVar) {
        pVar.f30911j.bNearingMinimized = true;
        pVar.w();
    }

    private final void J(String str) {
        ((TextView) findViewById(R.id.navBarNearingDestLabelArriving)).setText(str);
        ((TextView) findViewById(R.id.navBarNearingDestLabelArrivingMinimized)).setText(str);
    }

    private final void K(String str) {
        ((TextView) findViewById(R.id.navBarNearingDestNameText)).setText(str);
        ((TextView) findViewById(R.id.navBarNearingDestNameTextMinimized)).setText(str);
    }

    private final void L() {
        ImageView imageView = (ImageView) findViewById(R.id.navBarNearingDestButtonMinimize);
        imageView.setImageResource(R.drawable.nearing_close);
        imageView.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 7));
    }

    private final void M() {
        if (R()) {
            q();
            ImageView imageView = (ImageView) findViewById(R.id.navBarNearingDestButtonPark);
            imageView.setAlpha(0.3f);
            imageView.setOnClickListener(null);
            imageView.setImageResource(true != "latam".equals(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b()) ? R.drawable.nearing_parking_options : R.drawable.nearing_parking_options_latam);
            L();
        }
    }

    private final void N() {
        AddressItem addressItem = this.f30913l;
        if (addressItem == null || !addressItem.hasVenueData()) {
            return;
        }
        ed venueData = this.f30913l.getVenueData();
        this.f30909h = venueData;
        this.f30906e.g(venueData);
        ArrayList arrayList = new ArrayList(this.f30909h.d());
        Iterator it = this.f30909h.F().iterator();
        while (it.hasNext()) {
            arrayList.add(new bx((VenueImage) it.next()));
        }
        O(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(ArrayList arrayList) {
        if (this.f30912k == null) {
            return;
        }
        if (this.f30909h.d() <= 0 || arrayList.isEmpty()) {
            this.f30912k.dismiss();
            return;
        }
        ((bx) arrayList.get(0)).f33746i = this.n;
        this.f30912k.q(arrayList);
    }

    private final void P() {
        AddressItem addressItem = this.f30913l;
        if (addressItem == null || !addressItem.hasVenueData()) {
            return;
        }
        String venueId = this.f30913l.getVenueId();
        this.f30908g = venueId;
        com.waze.main_screen.q.a.b bVar = this.f30906e;
        bVar.f(venueId);
        ed venueData = this.f30913l.getVenueData();
        this.f30909h = venueData;
        bVar.g(venueData);
        Q(this.f30909h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(ed edVar) {
        findViewById(R.id.navBarNearingDestPhotoFrameContainer).setVisibility(true != this.f30911j.bNearingMinimized ? 0 : 8);
        if (edVar == null || edVar.d() <= 0) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.navBarNearingDestPhoto);
        imageView.setImageDrawable(null);
        if (lm.d().c() != null) {
            com.waze.utils.i.a().e(((VenueImage) edVar.F().get(0)).getThumbnailUrl(), new m(this, imageView), null, 0, 0, false);
        }
        findViewById(R.id.navBarNearingDestPhotoFrameMore).setVisibility(edVar.d() > 1 ? 0 : 8);
    }

    private final boolean R() {
        return this.q.getParkedState().d() != null;
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i a(p pVar, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = pVar.o;
        oVar.Q(aVar.c(R.string.CANNOT_REPORT_WHILE_INVISIBLE_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.CANNOT_REPORT_WHILE_INVISIBLE, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ ab d(p pVar, LocationData locationData) {
        pVar.f30904c = locationData;
        pVar.f30906e.e(locationData);
        pVar.f30902a.setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, pVar.f30905d);
        pVar.f30903b.venueGet(pVar.f30908g, 0, false);
        return ab.f48028a;
    }

    public static /* synthetic */ ab e(p pVar, DangerZoneEod dangerZoneEod) {
        if (dangerZoneEod.getShowDangerZoneEod()) {
            com.waze.shared_infra.o.a aVar = pVar.o;
            pVar.K(aVar.c(R.string.NEARING_DISTANCE_TO_DESTINATION_PS, com.waze.sharedui.utils.f.e(aVar, (int) dangerZoneEod.getEodToDestinationDistance())));
            pVar.J(aVar.c(R.string.NEARING_NAVIGATION_ENDED, new Object[0]));
        } else {
            pVar.J(pVar.o.c(R.string.NEARING_ARRIVED_AT, new Object[0]));
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab f(p pVar, DriveToNativeManager.AddressItemAppData addressItemAppData) {
        if (addressItemAppData != null) {
            pVar.f30911j = addressItemAppData;
            pVar.f30906e.c(addressItemAppData);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab g(p pVar, DangerZoneEod dangerZoneEod) {
        String strB;
        if (dangerZoneEod.getShowDangerZoneEod()) {
            pVar.K(pVar.o.c(R.string.NEARING_END_OF_NAVIGATION, new Object[0]));
        } else {
            LocationData locationData = pVar.f30904c;
            if (locationData == null || (strB = locationData.destinationName) == null || strB.isEmpty()) {
                strB = " ";
            } else {
                com.waze.shared_infra.o.a aVar = pVar.o;
                if (strB.equalsIgnoreCase(aVar.c(R.string.HOME, new Object[0])) || strB.equalsIgnoreCase(aVar.c(R.string.TO_HOME, new Object[0]))) {
                    strB = aVar.c(R.string.HOME, new Object[0]);
                } else if (strB.equalsIgnoreCase(aVar.c(R.string.WORK, new Object[0])) || strB.equalsIgnoreCase(aVar.c(R.string.TO_WORK, new Object[0]))) {
                    strB = aVar.c(R.string.WORK, new Object[0]);
                }
            }
            if (strB.equalsIgnoreCase("home") || strB.equalsIgnoreCase("work")) {
                strB = pVar.o.b(strB);
            }
            if (strB.isEmpty() || a.a.y(strB)) {
                strB = pVar.o.c(R.string.DESTINATION_CELL_UNKNOWN_ROAD, new Object[0]);
            }
            pVar.K(strB);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ void h(p pVar, com.waze.parking.d dVar, t tVar, s sVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if (sVar.f39006a != 0) {
            com.waze.sharedui.a.e eVarE = lm.d().e();
            if (eVarE == null) {
                return;
            }
            Location locationD = bg.d(eVarE);
            long jCurrentTimeMillis = System.currentTimeMillis();
            NativeManager.Post(new i(pVar, locationD, jCurrentTimeMillis, 0));
            org.a.d.a.a aVar = com.waze.stats.b.a.f40557a;
            if (aVar instanceof org.a.d.a.b) {
                bVarC = ((org.a.d.a.b) aVar).l();
                int i2 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.stats.b.a.class);
            } else {
                bVarC = aVar.getKoin().a().c();
                int i3 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.stats.b.a.class);
            }
            ((com.waze.stats.b.a) bVarC.a(mVar, null, null)).a(new com.waze.shared_infra.h.c(locationD.getLatitude(), locationD.getLongitude()), null, null, jCurrentTimeMillis);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - locationD.getTime();
            if ((!com.waze.ap.b.o.e(locationD.getProvider()) || jCurrentTimeMillis2 > 15000) && !ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_PARKING_LAST_LOCATION_DONT_SHOW_AGAIN)) {
                com.waze.ab.o oVar = new com.waze.ab.o();
                com.waze.shared_infra.o.a aVar2 = pVar.o;
                oVar.Q(aVar2.c(R.string.NEARING_PARKING_NO_GPS_TITLE, new Object[0]));
                oVar.P(aVar2.c(R.string.NEARING_PARKING_NO_GPS_TEXT, new Object[0]));
                oVar.J(new cw(1));
                oVar.z(aVar2.c(R.string.DONT_SHOW_AGAIN, new Object[0]));
                oVar.M(aVar2.c(R.string.NEARING_PARKING_NO_GPS_CLOSE, new Object[0]));
                oVar.w(30);
                ai.q(oVar);
            }
        } else if (pVar.s == com.waze.ui.r.a.e.b.a.f43359a) {
            Consumer consumer = pVar.t;
            if (consumer != null) {
                consumer.u(pVar.o.c(R.string.LOCK_SCREEN_NAVIGATION_BANNER_CLICK_MESSAGE, new Object[0]));
            } else {
                com.waze.shared_infra.i.h.a("NearingDest: mLockedWarningCallback is null, can't display WazeToast to user");
            }
        } else {
            NativeManager.getInstance().OpenParkingSearchPublic();
            dVar.c();
        }
        tVar.dismiss();
    }

    public static /* synthetic */ void i(p pVar) {
        if (pVar.f30910i) {
            return;
        }
        pVar.t();
    }

    public static /* synthetic */ void j(p pVar, Location location, long j2) {
        NativeManager.getInstance().StopFollow();
        NativeManager.getInstance().stopNavigation();
        pVar.q.setParking(bg.b(location.getLongitude()), bg.b(location.getLatitude()), j2, "", false);
    }

    public static /* synthetic */ void k(p pVar, View view) {
        ed edVar;
        if (pVar.s == com.waze.ui.r.a.e.b.a.f43359a) {
            Consumer consumer = pVar.t;
            if (consumer != null) {
                consumer.u(pVar.o.c(R.string.LOCK_SCREEN_NAVIGATION_BANNER_CLICK_MESSAGE, new Object[0]));
                return;
            } else {
                com.waze.shared_infra.i.h.a("NearingDest: mLockedWarningCallback is null, can't display WazeToast to user");
                return;
            }
        }
        if (u.n()) {
            if (view.getId() == R.id.navBarNearingDestPhotoFrameContainer && (edVar = pVar.f30909h) != null && edVar.d() > 0) {
                if (pVar.f30909h.aj()) {
                    DriveToNativeManager driveToNativeManager = pVar.f30902a;
                    Handler handler = pVar.f30905d;
                    driveToNativeManager.unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, handler);
                    pVar.f30902a.setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, handler);
                    pVar.f30903b.venueGet(pVar.f30909h.s(), 1, true);
                }
                ArrayList arrayList = new ArrayList(pVar.f30909h.d());
                Iterator it = pVar.f30909h.F().iterator();
                while (it.hasNext()) {
                    arrayList.add(new bx((VenueImage) it.next()));
                }
                ((bx) arrayList.get(0)).f33746i = pVar.n;
                cm cmVarE = bz.e(view, arrayList, 0, new k(pVar, arrayList));
                pVar.f30912k = cmVarE;
                cmVarE.p(new com.waze.main_screen.bottom_bars.a.a(pVar, 10));
                return;
            }
            if (MyWazeNativeManager.getInstance().isInvisible()) {
                com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("reportWhileInvisible", new gp(pVar, 8)));
                return;
            }
            com.waze.sharedui.utils.h hVar = new com.waze.sharedui.utils.h();
            LocationData locationData = pVar.f30904c;
            if (locationData != null) {
                hVar.i(locationData.destinationName);
                hVar.k(pVar.f30904c.mStreet);
                hVar.h(pVar.f30904c.mCity);
                hVar.m(Integer.valueOf(pVar.f30904c.locationX));
                hVar.n(Integer.valueOf(pVar.f30904c.locationY));
            }
            AddressItem addressItem = pVar.f30913l;
            if (addressItem != null && addressItem.hasVenueData()) {
                hVar.l(pVar.f30913l.getVenueId());
            }
            Intent intent = new Intent(pVar.getContext(), (Class<?>) RequestPermissionActivity.class);
            intent.putExtra("needed_permissions", new String[]{"android.permission.CAMERA"});
            intent.putExtra("on_granted", hVar);
            if (lm.d().c() != null) {
                com.waze.shared_infra.i.h.j("NearingDest: nearingDestinationSetup: Requesting permission CAMERA");
                lm.d().c().startActivityForResult(intent, 32785);
            }
        }
    }

    static /* bridge */ /* synthetic */ void m(p pVar, Message message) {
        int i2 = message.what;
        int i3 = DriveToNativeManager.UH_SEARCH_ADD_RESULT;
        if (i2 != i3) {
            if (message.what == NativeManager.UH_PARKING_CHANGED) {
                pVar.M();
                return;
            }
            return;
        }
        pVar.f30902a.unsetUpdateHandler(i3, pVar.f30905d);
        Bundle data = message.getData();
        cm cmVar = pVar.f30912k;
        if (cmVar != null && cmVar.isShowing()) {
            AddressItem addressItem = (AddressItem) data.getParcelable("address_item");
            pVar.f30913l = addressItem;
            pVar.f30906e.d(addressItem);
            pVar.N();
            return;
        }
        pVar.f30910i = true;
        AddressItem addressItem2 = (AddressItem) data.getParcelable("address_item");
        pVar.f30913l = addressItem2;
        pVar.f30906e.d(addressItem2);
        pVar.P();
        if (pVar.m) {
            pVar.t();
        } else {
            pVar.t();
            pVar.r.b();
        }
    }

    public final void A(com.waze.ui.r.a.e.b.a aVar) {
        this.s = aVar;
    }

    public final void B() {
        View viewFindViewById = findViewById(R.id.navBarNearingDestinationRegularLayout);
        View viewFindViewById2 = findViewById(R.id.navBarNearingDestinationMinimizedLayout);
        viewFindViewById.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.always_dark_background_default));
        viewFindViewById2.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.always_dark_background_default));
    }

    public final void C(boolean z) {
        if (getResources().getConfiguration().orientation == 2) {
            View viewFindViewById = findViewById(R.id.navBarNearingDestinationRegularLayout);
            View viewFindViewById2 = findViewById(R.id.navBarNearingDestinationMinimizedLayout);
            int i2 = R.drawable.takeover_bg_ls_nested;
            viewFindViewById.setBackgroundResource(z ? R.drawable.takeover_bg_ls_nested : R.drawable.takeover_bg_ls_standalone);
            if (true != z) {
                i2 = R.drawable.takeover_bg_ls_standalone;
            }
            viewFindViewById2.setBackgroundResource(i2);
        }
    }

    public final void I() {
        J("");
        this.f30902a.getDangerZoneEod(new com.waze.car_lib.f.u(this, 5));
        L();
    }

    public final void p() {
        View viewFindViewById = findViewById(R.id.navBarNearingDestinationRegularLayout);
        View viewFindViewById2 = findViewById(R.id.navBarNearingDestinationMinimizedLayout);
        if (mg.a().getResources().getConfiguration().orientation != 2) {
            viewFindViewById.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.always_dark_background_default));
            return;
        }
        boolean zT = this.p.T();
        int i2 = R.drawable.takeover_bg_ls_nested;
        viewFindViewById.setBackgroundResource(zT ? R.drawable.takeover_bg_ls_nested : R.drawable.takeover_bg_ls_standalone);
        if (true != zT) {
            i2 = R.drawable.takeover_bg_ls_standalone;
        }
        viewFindViewById2.setBackgroundResource(i2);
    }

    public final void q() {
        findViewById(R.id.navBarNearingDestinationRegularLayout).setVisibility(8);
        findViewById(R.id.navBarNearingDestinationMinimizedLayout).setVisibility(0);
    }

    public final void r() {
        com.waze.parking.d dVarA = com.waze.parking.d.f32954a.a();
        this.f30907f = new com.waze.main_screen.bottom_bars.a.a(this, 10);
        findViewById(R.id.navBarNearingDestPhotoFrameContainer).setOnClickListener(this.f30907f);
        findViewById(R.id.navBarNearingDestButtonMinimize).setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 8));
        int i2 = 9;
        findViewById(R.id.navBarNearingDestButtonExpand).setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, i2));
        ImageView imageView = (ImageView) findViewById(R.id.navBarNearingDestButtonPark);
        imageView.setImageResource(true != "latam".equals(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b()) ? R.drawable.nearing_parking_options : R.drawable.nearing_parking_options_latam);
        byte[] bArr = null;
        if (R()) {
            imageView.setAlpha(0.3f);
            imageView.setOnClickListener(null);
        } else {
            imageView.setAlpha(1.0f);
            imageView.setOnClickListener(new y(this, dVarA, i2, bArr));
        }
        ((ImageView) findViewById(R.id.navBarNearingDestPhoto)).setImageResource(R.drawable.nearing_pic_placeholder);
        String strC = this.o.c(R.string.NEARING_ARRIVING_AT, new Object[0]);
        ((TextView) findViewById(R.id.navBarNearingDestLabelArriving)).setText(strC);
        ((TextView) findViewById(R.id.navBarNearingDestLabelArrivingMinimized)).setText(strC);
    }

    public final void s() {
        if (this.f30911j.bNearingMinimized) {
            w();
        } else {
            q();
        }
        this.f30911j.bNearingMinimized = !r0.bNearingMinimized;
        String destinationId = this.f30902a.getDestinationId();
        if (destinationId != null) {
            this.f30902a.updateAddressItemAppData(destinationId, this.f30911j);
        } else {
            com.waze.shared_infra.i.h.j("NearingDest: onMinimize: destinationId is null");
        }
    }

    public final void t() {
        boolean z = this.m;
        this.m = true;
        AddressItem addressItem = this.f30913l;
        int numberOfImages = addressItem != null ? addressItem.getNumberOfImages() : 0;
        Map mapI = com.waze.ab.a.l.i(getContext());
        String str = (String) mapI.get("dest_lon");
        String str2 = (String) mapI.get("dest_lat");
        String str3 = (String) mapI.get("dest_venueId");
        com.waze.shared_infra.h.c cVar = null;
        if (str2 != null && !str2.isEmpty() && str != null && !str.isEmpty()) {
            cVar = new com.waze.shared_infra.h.c(Double.parseDouble(str2), Double.parseDouble(str));
        }
        com.waze.shared_infra.h.c cVar2 = cVar;
        if (!z && this.m) {
            ba.e().g(this.f30911j.bNearingMinimized, cVar2, numberOfImages, str3);
        }
        l lVar = new l(this);
        setOnTouchListener(lVar);
        findViewById(R.id.navBarNearingDestPhotoFrameContainer).setOnTouchListener(lVar);
        K("");
        this.f30902a.getDangerZoneEod(new com.waze.car_lib.f.u(this, 6));
        TextView textView = (TextView) findViewById(R.id.navBarNearingDestEvDirections);
        ed edVar = this.f30909h;
        if (edVar == null || edVar.f() == null || this.f30909h.f().a() == null || a.a.y(this.f30909h.f().a())) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(this.f30909h.f().a());
        ((ImageView) findViewById(R.id.navBarNearingDestButtonPark)).setVisibility(8);
    }

    public final void u() {
        this.f30913l = null;
        this.f30909h = null;
        this.f30908g = null;
        DriveToNativeManager.AddressItemAppData addressItemAppData = new DriveToNativeManager.AddressItemAppData();
        this.f30911j = addressItemAppData;
        addressItemAppData.bNearingMinimized = false;
        this.f30906e.c(addressItemAppData);
        String destinationId = this.f30902a.getDestinationId();
        if (destinationId != null) {
            this.f30902a.getAddressItemAppData(destinationId, new com.waze.car_lib.f.u(this, 7));
        } else {
            com.waze.shared_infra.i.h.j("NearingDest: onShow: destinationId is null");
        }
        Q(null);
        this.f30902a.getLocationData(1, 0, 0, null, new com.waze.car_lib.f.u(this, 4));
        this.f30910i = false;
        postDelayed(new com.waze.ads.f(this, 12), this.f30903b.getVenueGetTimeout());
    }

    public final void v(LocationData locationData, String str, DriveToNativeManager.AddressItemAppData addressItemAppData, AddressItem addressItem, ed edVar) {
        this.f30904c = locationData;
        this.f30908g = str;
        if (addressItemAppData == null) {
            addressItemAppData = new DriveToNativeManager.AddressItemAppData();
        }
        this.f30911j = addressItemAppData;
        this.f30913l = addressItem;
        this.f30909h = edVar;
        addressItemAppData.bNearingMinimized = false;
        Q(this.f30909h);
        this.f30910i = false;
        N();
        P();
        M();
        t();
    }

    public final void w() {
        findViewById(R.id.navBarNearingDestinationRegularLayout).setVisibility(0);
        findViewById(R.id.navBarNearingDestinationMinimizedLayout).setVisibility(8);
    }

    public final void x(n nVar) {
        this.r = nVar;
    }

    public final void y(Consumer consumer) {
        this.t = consumer;
    }

    public final void z(boolean z) {
        this.m = z;
    }
}

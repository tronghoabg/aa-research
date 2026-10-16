package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ResultStruct;
import com.waze.gp;
import com.waze.location.LocationSensorListener;
import com.waze.settings.gw;
import com.waze.sharedui.utils.RequestPermissionActivity;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class AddPlaceFlowActivity extends com.waze.ifs.ui.a implements dz, com.waze.ifs.ui.s, m {

    /* renamed from: f, reason: collision with root package name */
    private static final String f33530f = "com.waze.reports.AddPlaceFlowActivity";
    private boolean A;
    private NativeManager.AddressStrings B;
    private int C;

    /* renamed from: g, reason: collision with root package name */
    private int f33531g;

    /* renamed from: h, reason: collision with root package name */
    private String f33532h;

    /* renamed from: k, reason: collision with root package name */
    private String f33533k;

    /* renamed from: l, reason: collision with root package name */
    private String f33534l;
    private String m;
    private Parcelable[] n;
    private ed o;
    private ec t;
    private ed p = null;
    private ed q = null;
    private String r = null;
    private String s = null;
    private boolean u = false;
    private boolean v = false;
    private boolean z = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private final com.waze.shared_infra.o.a H = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ void F(AddPlaceFlowActivity addPlaceFlowActivity) {
        ed edVar = addPlaceFlowActivity.p;
        edVar.f33905a = false;
        edVar.aq(0);
        Intent intent = new Intent(addPlaceFlowActivity, (Class<?>) EditPlaceFlowActivity.class);
        intent.putExtra(ed.class.getName(), (Parcelable) addPlaceFlowActivity.p);
        intent.putExtra("continue_edit", true);
        addPlaceFlowActivity.startActivity(intent);
        addPlaceFlowActivity.A = true;
        addPlaceFlowActivity.finish();
    }

    private final void H() {
        com.waze.dc dcVar = new com.waze.dc(this, 8);
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = this.H;
        oVar.Q(aVar.c(R.string.ARE_YOU_SURE_Q, new Object[0]));
        oVar.P(aVar.c(R.string.RESIDENTIAL_PLACE_CONFIRM_DIALOG_BODY, new Object[0]));
        oVar.f13808a = dcVar;
        oVar.M(aVar.c(R.string.RESIDENTIAL_PLACE_CONFIRM_DIALOG_YES, new Object[0]));
        oVar.N(aVar.c(R.string.CANCEL, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    private final void I() {
        Parcelable[] parcelableArr;
        int length;
        this.f33531g = 2;
        com.waze.ifs.ui.w wVar = new com.waze.ifs.ui.w();
        com.waze.shared_infra.o.a aVar = this.H;
        wVar.q(aVar.c(R.string.SELECT_PLACE, new Object[0]));
        wVar.k(aVar.c(R.string.ENTER_PLACE_NAME, new Object[0]));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            parcelableArr = this.n;
            length = parcelableArr.length;
            if (i2 >= length) {
                break;
            }
            ed edVar = (ed) parcelableArr[i2];
            if (this.r != null && edVar.s().contentEquals(this.r) && i2 != 0) {
                Parcelable[] parcelableArr2 = this.n;
                Parcelable parcelable = parcelableArr2[0];
                parcelableArr2[0] = parcelableArr2[i2];
                parcelableArr2[i2] = parcelable;
            }
            if (edVar.t() != null && !edVar.t().isEmpty()) {
                Parcelable[] parcelableArr3 = this.n;
                parcelableArr3[i3] = parcelableArr3[i2];
                i3++;
            }
            i2++;
        }
        if (i3 < length) {
            this.n = (Parcelable[]) Arrays.copyOf(parcelableArr, i3);
        }
        gw[] gwVarArr = new gw[i3];
        wVar.B(aVar.c(R.string.PLACE_IS_RESIDENCE, new Object[0]));
        int i4 = 0;
        for (Parcelable parcelable2 : this.n) {
            ed edVar2 = (ed) parcelable2;
            if (edVar2.t() != null && !edVar2.t().isEmpty()) {
                gw gwVar = new gw(edVar2.t(), edVar2.t(), false);
                gwVarArr[i4] = gwVar;
                gwVar.f37351d = edVar2.l();
                gwVarArr[i4].f37355h = (String[]) edVar2.f33906b.getAliasesList().toArray(new String[0]);
                if (i4 == 0) {
                    if (this.r != null && edVar2.s().contentEquals(this.r)) {
                        gwVarArr[0].f37348a = true;
                    }
                    i4 = 0;
                }
                i4++;
            }
        }
        wVar.s(gwVarArr);
        wVar.p(true);
        wVar.m(true);
        wVar.r(true, aVar.c(R.string.ADD_PS, new Object[0]));
        wVar.A();
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, wVar);
        chVarU.a();
    }

    private final void J(boolean z) {
        this.f33531g = 5;
        this.p.f33905a = false;
        f fVar = new f();
        fVar.f33922a = this.p;
        fVar.f33923b = z;
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.x(R.id.container, fVar, "AddPlaceNewFragment");
        chVarU.a();
    }

    private final void K(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i3 < 0 && (i3 = this.C) <= 0) {
            i3 = bc.b(1);
        }
        int i8 = i3;
        this.C = i8;
        this.D = true;
        boolean z = this.u;
        if (z) {
            boolean z2 = this.z;
            i4 = R.string.NO_THANKS;
            if (z2) {
                i5 = R.string.THANK_YOU_BODY_EXISTING;
                i6 = -1;
                i7 = R.string.EDIT_DETAILS;
            } else {
                i5 = R.string.THANK_YOU_BODY_NEW;
                i7 = R.string.ADD_MORE_DETAILS;
                i6 = R.string.THANK_YOU_TITLE_NEW;
            }
        } else {
            i4 = R.string.OKAY;
            i5 = R.string.THANK_YOU_BODY_RESIDENTIAL;
            i6 = -1;
            i7 = -1;
        }
        ec ecVar = new ec(this, i8, z, new com.waze.ads.f(this, 19), new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 9), i6, i5, i7, i4, i2 == 1);
        this.t = ecVar;
        ecVar.show();
    }

    public static Intent n(Context context) {
        com.waze.sharedui.utils.h hVar = new com.waze.sharedui.utils.h();
        Intent intent = new Intent(context, (Class<?>) RequestPermissionActivity.class);
        intent.putExtra("needed_permissions", new String[]{"android.permission.CAMERA"});
        intent.putExtra("on_granted", hVar);
        return intent;
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i o(AddPlaceFlowActivity addPlaceFlowActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = addPlaceFlowActivity.H;
        oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
        oVar.P(aVar.c(R.string.YOUVE_BEEN_FLAGGED, new Object[0]));
        oVar.N(aVar.c(R.string.OK, new Object[0]));
        oVar.C(false);
        oVar.f13808a = new com.waze.dc(addPlaceFlowActivity, 10);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i p(AddPlaceFlowActivity addPlaceFlowActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = addPlaceFlowActivity.H;
        oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
        oVar.P(aVar.c(R.string.NETWORK_CONNECTION_PROBLEMS__PLEASE_TRY_AGAIN_LATER_, new Object[0]));
        oVar.N(aVar.c(R.string.OK, new Object[0]));
        oVar.C(false);
        oVar.f13808a = new com.waze.dc(addPlaceFlowActivity, 9);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i q(AddPlaceFlowActivity addPlaceFlowActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = addPlaceFlowActivity.H;
        oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
        oVar.P(aVar.c(R.string.PLACE_ADD_LOCATION_ERROR, new Object[0]));
        oVar.N(aVar.c(R.string.BACK, new Object[0]));
        oVar.C(false);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i r(AddPlaceFlowActivity addPlaceFlowActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = addPlaceFlowActivity.H;
        oVar.Q(aVar.c(R.string.SORRYE, new Object[0]));
        oVar.P(aVar.c(R.string.PLACE_ADD_ERROR, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ void s(AddPlaceFlowActivity addPlaceFlowActivity) {
        if (addPlaceFlowActivity.n != null || addPlaceFlowActivity.isFinishing()) {
            return;
        }
        com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("photoTaken", new gp(addPlaceFlowActivity, 12)));
    }

    public static /* synthetic */ void v(AddPlaceFlowActivity addPlaceFlowActivity, boolean z) {
        if (z) {
            addPlaceFlowActivity.J(true);
        }
        addPlaceFlowActivity.G = false;
    }

    public static /* synthetic */ void w(AddPlaceFlowActivity addPlaceFlowActivity) {
        ar.d();
        bc.c();
        NativeManager nativeManager = NativeManager.getInstance();
        int i2 = NativeManager.UH_VENUE_ADD_IMAGE_RESULT;
        com.waze.sharedui.a.d dVar = addPlaceFlowActivity.y;
        nativeManager.setUpdateHandler(i2, dVar);
        NativeManager.getInstance().setUpdateHandler(NativeManager.UH_VENUE_STATUS, dVar);
        NativeManager.Post(new com.waze.ads.f(addPlaceFlowActivity, 18));
        if (addPlaceFlowActivity.n == null) {
            NativeManager.getInstance().setUpdateHandler(NativeManager.UH_SEARCH_VENUES, dVar);
            NativeManager.getInstance().venueSearch(addPlaceFlowActivity.o.b(), addPlaceFlowActivity.o.a());
        }
        if (addPlaceFlowActivity.G) {
            addPlaceFlowActivity.H();
            return;
        }
        if (addPlaceFlowActivity.D) {
            addPlaceFlowActivity.K(0, addPlaceFlowActivity.C);
        } else if (addPlaceFlowActivity.v) {
            NativeManager.getInstance().OpenProgressPopup(addPlaceFlowActivity.H.c(R.string.PLEASE_WAIT___, new Object[0]));
        }
    }

    public final void A() {
        this.f33531g = 6;
        com.waze.ifs.ui.w wVar = new com.waze.ifs.ui.w();
        wVar.q(this.H.c(R.string.ADD_A_CATEGORY, new Object[0]));
        wVar.s(ar.e());
        wVar.l(true);
        wVar.z();
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, wVar);
        chVarU.u(null);
        chVarU.a();
    }

    final void B() {
        String str = true != this.E ? "NEARING" : "REPORT";
        if (this.z) {
            NativeManager.getInstance().venueUpdate(this.p, this.q, str, this.s);
        } else {
            NativeManager.getInstance().venueCreate(this.p, str, this.s, this.F);
        }
    }

    final void C() {
        this.v = true;
        NativeManager.getInstance().OpenProgressPopup(this.H.c(R.string.PLEASE_WAIT___, new Object[0]));
        if (this.f33533k != null) {
            this.p.J(this.f33534l, this.m, "");
            this.p.K(this.f33533k);
            B();
        }
    }

    @Override // com.waze.sharedui.a.e
    protected final boolean D(Message message) {
        ed edVar;
        if (message.what == NativeManager.UH_SEARCH_VENUES) {
            this.n = message.getData().getParcelableArray("venue_data");
            NativeManager.getInstance().unsetUpdateHandler(NativeManager.UH_SEARCH_VENUES, this.y);
            if (this.f33532h != null) {
                I();
            }
            NativeManager.getInstance().CloseProgressPopup();
            return true;
        }
        if (message.what != NativeManager.UH_VENUE_STATUS) {
            if (message.what != NativeManager.UH_VENUE_ADD_IMAGE_RESULT) {
                return false;
            }
            NativeManager.getInstance().unsetUpdateHandler(NativeManager.UH_VENUE_ADD_IMAGE_RESULT, this.y);
            Bundle data = message.getData();
            String string = data.getString("path");
            String string2 = data.getString(TtmlNode.ATTR_ID);
            String string3 = data.getString("image_url");
            String string4 = data.getString("image_thumbnail_url");
            boolean z = data.getBoolean("res");
            String str = this.f33532h;
            if (str != null && str.equals(string) && z) {
                this.f33533k = string2;
                this.f33534l = string3;
                this.m = string4;
                if (this.v) {
                    this.p.J(string3, string4, "");
                    this.p.K(this.f33533k);
                    B();
                }
            }
            return true;
        }
        this.v = false;
        NativeManager.getInstance().unsetUpdateHandler(NativeManager.UH_VENUE_STATUS, this.y);
        NativeManager.getInstance().CloseProgressPopup();
        Bundle data2 = message.getData();
        int i2 = data2.getInt("res");
        int i3 = data2.getInt("points");
        String string5 = data2.getString(TtmlNode.ATTR_ID);
        ResultStruct resultStructFromBundle = ResultStruct.fromBundle(data2);
        if (i2 >= 0) {
            if (!this.z && (edVar = this.p) != null) {
                edVar.U(string5);
            }
            Intent intent = new Intent();
            intent.putExtra("destination_venue_id", string5);
            setResult(-1, intent);
            K(i2, i3);
        } else if (i2 == -2) {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("accountFlaggedPopup", new gp(this, 9)));
        } else if (i2 == -3) {
            this.F = true;
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("issueWithPlaceLocation", new gp(this, 10)));
        } else if (resultStructFromBundle == null || !resultStructFromBundle.hasServerError()) {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("AddPlaceFlowActivity", new gp(this, 11)));
        } else {
            resultStructFromBundle.showError(null);
        }
        return true;
    }

    final void E(ed edVar, int i2) {
        this.p = edVar;
        this.C = i2;
        C();
    }

    @Override // com.waze.reports.dz
    public final void G(String str) {
        this.f33532h = str;
        this.f33533k = null;
        this.m = null;
        this.f33534l = null;
        NativeManager.getInstance().venueAddImage(this.f33532h);
        com.waze.location.bi biVarGetNativeLocation = LocationSensorListener.GetNativeLocation(com.waze.location.z.a().getLastLocation());
        if (biVarGetNativeLocation != null) {
            this.o.Z(biVarGetNativeLocation.c(), biVarGetNativeLocation.d());
        }
        if (this.n != null) {
            I();
            return;
        }
        NativeManager.getInstance().OpenProgressPopup(this.H.c(R.string.PLEASE_WAIT___, new Object[0]));
        aG(new com.waze.ads.f(this, 20), NativeManager.getInstance().getVenueGetTimeout());
    }

    @Override // com.waze.ifs.ui.s
    public final void bF(int i2, String str, String str2, boolean z) {
        int i3 = this.f33531g;
        if (i3 != 2) {
            if (i3 == 6) {
                ee.a(this.p, str);
                ed edVar = this.p;
                edVar.O(ar.b(edVar.E()));
                this.f33531g = 5;
                bv().av();
                ((f) bv().h("AddPlaceNewFragment")).f();
                return;
            }
            if (i3 == 4) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    boolean zHas = jSONObject.has("CITY");
                    ed edVar2 = this.p;
                    if (zHas) {
                        edVar2.P(jSONObject.getString("CITY"));
                    } else {
                        edVar2.P("");
                    }
                    boolean zHas2 = jSONObject.has("STREET");
                    ed edVar3 = this.p;
                    if (zHas2) {
                        edVar3.af(jSONObject.getString("STREET"));
                    } else {
                        edVar3.af("");
                    }
                } catch (JSONException unused) {
                }
                this.f33531g = 5;
                bv().av();
                return;
            }
            return;
        }
        if (!z && i2 != -1) {
            this.u = true;
            this.z = true;
            ed edVar4 = (ed) this.n[i2];
            this.p = edVar4;
            this.q = edVar4.clone();
            C();
            return;
        }
        this.u = z;
        this.z = false;
        this.o.L();
        ed edVar5 = this.o;
        if (z) {
            edVar5.W(str);
            this.o.V(false);
        } else {
            edVar5.W("");
            this.o.V(true);
        }
        NativeManager.AddressStrings addressStrings = this.B;
        if (addressStrings != null && addressStrings.numResults > 0) {
            if (TextUtils.isEmpty(this.o.z())) {
                this.o.af(this.B.street[0]);
            }
            if (TextUtils.isEmpty(this.o.n())) {
                this.o.P(this.B.city[0]);
            }
        }
        this.p = this.o;
        com.waze.ui.x.u.j(this, findViewById(R.id.container));
        if (z) {
            J(false);
            return;
        }
        boolean z2 = ConfigManager.getInstance().checkConfigDisplayCounter(0, true) > 0;
        this.G = z2;
        if (z2) {
            H();
        } else {
            J(true);
        }
    }

    @Override // com.waze.reports.m
    public final void l(l lVar) {
        int iB = this.p.b();
        int i2 = lVar.f33942a;
        if (iB == i2) {
            this.p.a();
        }
        this.p.Z(lVar.f33943b, i2);
        this.p.f33905a = true;
        this.f33531g = 5;
        bv().av();
        ((f) bv().h("AddPlaceNewFragment")).f33922a = this.p;
    }

    @Override // com.waze.ifs.ui.s
    public final void m() {
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        switch (this.f33531g) {
            case 1:
                super.onBackPressed();
                break;
            case 2:
                com.waze.ui.x.u.j(this, findViewById(R.id.container));
                this.f33531g = 1;
                eb ebVar = new eb();
                ebVar.t(this);
                android.support.v4.app.ch chVarU = bv().u();
                chVarU.F(R.id.container, ebVar);
                chVarU.a();
                break;
            case 3:
                this.f33531g = 5;
                bv().av();
                break;
            case 4:
                this.f33531g = 5;
                bv().av();
                break;
            case 5:
                I();
                break;
            case 6:
                this.f33531g = 5;
                bv().av();
                break;
            default:
                super.onBackPressed();
                break;
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.o = new ed();
        int i2 = 1;
        if (intent != null) {
            if (intent.hasExtra("QuestionID")) {
                this.s = intent.getStringExtra("QuestionID");
            }
            if (intent.hasExtra("destination_venue_id")) {
                this.r = intent.getStringExtra("destination_venue_id");
            }
            if (intent.hasExtra("city")) {
                this.o.P(intent.getStringExtra("city"));
            }
            if (intent.hasExtra("street")) {
                this.o.af(intent.getStringExtra("street"));
            }
            if (intent.hasExtra("x") && intent.hasExtra("y")) {
                this.o.Z(intent.getIntExtra("y", 0), intent.getIntExtra("x", 0));
                this.o.f33905a = true;
            } else {
                this.E = true;
                Location lastLocation = com.waze.location.z.a().getLastLocation();
                if (lastLocation == null) {
                    finish();
                    return;
                } else {
                    com.waze.location.bi biVarGetNativeLocation = LocationSensorListener.GetNativeLocation(lastLocation);
                    this.o.Z(biVarGetNativeLocation.c(), biVarGetNativeLocation.d());
                    this.o.f33905a = true;
                }
            }
            if (intent.hasExtra("venue_data")) {
                this.n = intent.getParcelableArrayExtra("venue_data");
            }
        }
        getWindow().setSoftInputMode(3);
        setContentView(R.layout.fragment_activity_empty);
        aE();
        if (bundle == null) {
            this.f33531g = 1;
            eb ebVar = new eb();
            ebVar.t(this);
            android.support.v4.app.ch chVarU = bv().u();
            chVarU.q(R.id.container, ebVar);
            chVarU.a();
        } else {
            String str = f33530f;
            this.f33531g = bundle.getInt(String.valueOf(str).concat(".mState"));
            this.C = bundle.getInt(String.valueOf(str).concat(".mPoints"));
            this.u = bundle.getBoolean(String.valueOf(str).concat(".mIsPublic"));
            this.E = bundle.getBoolean(String.valueOf(str).concat(".mFromReportMenu"));
            this.F = bundle.getBoolean(String.valueOf(str).concat(".mForceHouseNumber"));
            this.D = bundle.getBoolean(String.valueOf(str).concat(".mSayThankYou"));
            this.G = bundle.getBoolean(String.valueOf(str).concat(".mbConfirmResidential"));
            this.v = bundle.getBoolean(String.valueOf(str).concat(".mIsSending"));
            this.z = bundle.getBoolean(String.valueOf(str).concat(".mIsUpdate"));
            this.o = (ed) bundle.getParcelable(String.valueOf(str).concat(".mVenue"));
            this.p = (ed) bundle.getParcelable(String.valueOf(str).concat(".mSelectedVenue"));
            this.q = (ed) bundle.getParcelable(String.valueOf(str).concat(".mOrigVenue"));
            this.n = bundle.getParcelableArray(String.valueOf(str).concat(".mSearchVenueResults"));
            this.f33532h = bundle.getString(String.valueOf(str).concat(".mPhotoPath"));
            this.f33533k = bundle.getString(String.valueOf(str).concat(".mPhotoId"));
            this.f33534l = bundle.getString(String.valueOf(str).concat(".mPhotoUrl"));
            this.m = bundle.getString(String.valueOf(str).concat(".mPhotoThumbnailUrl"));
            this.s = bundle.getString(String.valueOf(str).concat(".mQuestionId"));
            android.support.v4.app.ar arVarG = bv().g(R.id.container);
            if (arVarG != null && (arVarG instanceof eb)) {
                ((eb) arVarG).t(this);
            }
        }
        this.A = false;
        NativeManager.runOnNativeManagerReady(new com.waze.g.f(this, i2));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        ec ecVar = this.t;
        if (ecVar != null) {
            ecVar.dismiss();
        }
        if (!this.A) {
            ee.b();
        }
        NativeManager nativeManager = NativeManager.getInstance();
        if (nativeManager != null) {
            com.waze.sharedui.a.d dVar = this.y;
            nativeManager.unsetUpdateHandler(NativeManager.UH_SEARCH_VENUES, dVar);
            nativeManager.unsetUpdateHandler(NativeManager.UH_VENUE_STATUS, dVar);
            nativeManager.unsetUpdateHandler(NativeManager.UH_VENUE_ADD_IMAGE_RESULT, dVar);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = f33530f;
        bundle.putInt(String.valueOf(str).concat(".mState"), this.f33531g);
        bundle.putInt(String.valueOf(str).concat(".mPoints"), this.C);
        bundle.putBoolean(String.valueOf(str).concat(".mIsPublic"), this.u);
        bundle.putBoolean(String.valueOf(str).concat(".mFromReportMenu"), this.E);
        bundle.putBoolean(String.valueOf(str).concat(".mForceHouseNumber"), this.F);
        bundle.putBoolean(String.valueOf(str).concat(".mSayThankYou"), this.D);
        bundle.putBoolean(String.valueOf(str).concat(".mbConfirmResidential"), this.G);
        bundle.putBoolean(String.valueOf(str).concat(".mIsSending"), this.v);
        bundle.putBoolean(String.valueOf(str).concat(".mIsUpdate"), this.z);
        bundle.putParcelable(String.valueOf(str).concat(".mVenue"), this.o);
        bundle.putParcelable(String.valueOf(str).concat(".mSelectedVenue"), this.p);
        bundle.putParcelable(String.valueOf(str).concat(".mOrigVenue"), this.q);
        bundle.putParcelableArray(String.valueOf(str).concat(".mSearchVenueResults"), this.n);
        bundle.putString(String.valueOf(str).concat(".mPhotoPath"), this.f33532h);
        bundle.putString(String.valueOf(str).concat(".mPhotoId"), this.f33533k);
        bundle.putString(String.valueOf(str).concat(".mPhotoUrl"), this.f33534l);
        bundle.putString(String.valueOf(str).concat(".mPhotoThumbnailUrl"), this.m);
        bundle.putString(String.valueOf(str).concat(".mQuestionId"), this.s);
        this.A = true;
    }

    public final void y() {
        this.f33531g = 3;
        n nVar = new n();
        nVar.f(this.o.b(), this.o.a());
        nVar.g(R.string.LOCATION);
        nVar.e(this.p.al());
        if (this.p.al()) {
            nVar.d(R.string.MOVE_THE_MAP_TO_ADJUST_PIN_LOCATION_RESIDENTIAL);
        } else {
            nVar.d(R.string.MOVE_THE_MAP_TO_ADJUST_PIN_LOCATION_NON_RESIDENTIAL);
        }
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, nVar);
        chVarU.u(null);
        chVarU.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: JSONException -> 0x00b1, TryCatch #0 {JSONException -> 0x00b1, blocks: (B:5:0x003c, B:8:0x004a, B:10:0x005d, B:16:0x0091, B:19:0x009c, B:11:0x0075, B:13:0x007f), top: B:36:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[EDGE_INSN: B:41:0x00c0->B:24:0x00c0 BREAK  A[LOOP:0: B:3:0x0033->B:23:0x00bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.AddPlaceFlowActivity.z():void");
    }
}

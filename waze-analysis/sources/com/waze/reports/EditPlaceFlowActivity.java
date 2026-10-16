package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ResultStruct;
import com.waze.gp;
import com.waze.jni.protos.OpeningHours;
import com.waze.settings.gw;
import com.waze.sharedui.utils.RequestPermissionActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class EditPlaceFlowActivity extends com.waze.ifs.ui.a implements dz, com.waze.ifs.ui.s, com.waze.ifs.ui.g, m {

    /* renamed from: g, reason: collision with root package name */
    private static final String f33540g = "com.waze.reports.EditPlaceFlowActivity";
    private Bundle B;

    /* renamed from: f, reason: collision with root package name */
    ax f33541f;

    /* renamed from: h, reason: collision with root package name */
    private int f33542h;

    /* renamed from: k, reason: collision with root package name */
    private NativeManager f33543k;

    /* renamed from: l, reason: collision with root package name */
    private ec f33544l;
    private ed m;
    private ed n;
    private int r;
    private boolean s;
    private int t;
    private String u;
    private NativeManager.AddressStrings v;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private final com.waze.shared_infra.o.a z = com.waze.shared_infra.o.b.a();
    private Runnable A = null;

    public static /* synthetic */ void J(EditPlaceFlowActivity editPlaceFlowActivity, int[] iArr, int i2) {
        int i3 = iArr[i2];
        editPlaceFlowActivity.r = i3;
        if (i3 == 1) {
            editPlaceFlowActivity.f33542h = 4;
            com.waze.ifs.ui.h hVar = new com.waze.ifs.ui.h();
            hVar.g(R.string.PLACE_CLOSED_MOVED);
            hVar.f(R.string.WHAT_HAPPENEDQ);
            hVar.d(R.string.ADD_COMMENT);
            hVar.k();
            hVar.j();
            hVar.l();
            hVar.h();
            android.support.v4.app.ch chVarU = editPlaceFlowActivity.bv().u();
            chVarU.F(R.id.container, hVar);
            chVarU.u(null);
            chVarU.a();
            return;
        }
        if (i3 == 3) {
            com.waze.dc dcVar = new com.waze.dc(editPlaceFlowActivity, 11);
            com.waze.ab.o oVar = new com.waze.ab.o();
            com.waze.shared_infra.o.a aVar = editPlaceFlowActivity.z;
            oVar.Q(aVar.c(R.string.ARE_YOU_SURE_Q, new Object[0]));
            oVar.P(aVar.c(R.string.RESIDENTIAL_PLACE_CONFIRM_DIALOG_BODY, new Object[0]));
            oVar.f13808a = dcVar;
            oVar.M(aVar.c(R.string.RESIDENTIAL_PLACE_CONFIRM_DIALOG_YES, new Object[0]));
            oVar.N(aVar.c(R.string.CANCEL, new Object[0]));
            com.waze.z.a.d.ai.q(oVar);
            return;
        }
        if (i3 == 4) {
            editPlaceFlowActivity.f33543k.OpenProgressPopup(editPlaceFlowActivity.z.c(R.string.PLEASE_WAIT___, new Object[0]));
            editPlaceFlowActivity.f33543k.setUpdateHandler(NativeManager.UH_SEARCH_VENUES, editPlaceFlowActivity.y);
            editPlaceFlowActivity.f33543k.venueSearch(editPlaceFlowActivity.m.b(), editPlaceFlowActivity.m.a());
            return;
        }
        if (i3 == 5) {
            editPlaceFlowActivity.O(true);
        } else {
            if (i3 != 6) {
                return;
            }
            editPlaceFlowActivity.O(false);
        }
    }

    private final void O(boolean z) {
        this.f33542h = 4;
        com.waze.ifs.ui.h hVar = new com.waze.ifs.ui.h();
        hVar.g(z ? R.string.PLACE_INAPPROPRIATE : R.string.PLACE_WRONG);
        hVar.f(R.string.TELL_US_MORE);
        hVar.d(true != z ? R.string.THE_DETAILS_ARE_WRONG_BECAUSE___ : R.string.THIS_PLACE_IS_INAPPROPRIATE_BECAUSE___);
        hVar.k();
        hVar.j();
        hVar.l();
        hVar.h();
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, hVar);
        chVarU.u(null);
        chVarU.a();
    }

    private final void P() {
        this.f33543k.closeAndOpenProgressPopup(this.z.c(R.string.REPORT_PLACE_THANK_YOU, new Object[0]), R.drawable.flag_verified);
        aG(new as(this, 1, null), 4000L);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i o(EditPlaceFlowActivity editPlaceFlowActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = editPlaceFlowActivity.z;
        oVar.Q(aVar.c(R.string.SORRYE, new Object[0]));
        oVar.P(aVar.c(R.string.PLACE_ADD_ERROR, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ void v(EditPlaceFlowActivity editPlaceFlowActivity, boolean z) {
        if (z) {
            editPlaceFlowActivity.f33543k.venueFlag(editPlaceFlowActivity.m.s(), editPlaceFlowActivity.r, null, null);
            editPlaceFlowActivity.P();
        }
    }

    public final void A() {
        this.f33542h = 6;
        n nVar = new n();
        nVar.f(this.m.b(), this.m.a());
        nVar.g(R.string.LOCATION);
        nVar.e(this.m.al());
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, nVar);
        chVarU.u(null);
        chVarU.a();
    }

    public final void B() {
        this.f33542h = 5;
        ArrayList arrayList = new ArrayList(this.m.f33906b.getOpeningHoursCount());
        Iterator it = this.m.G().iterator();
        while (it.hasNext()) {
            arrayList.add(new br((OpeningHours) it.next()));
        }
        aq aqVar = new aq();
        aqVar.j(arrayList);
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, aqVar);
        chVarU.u(null);
        chVarU.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: JSONException -> 0x00b2, TryCatch #0 {JSONException -> 0x00b2, blocks: (B:5:0x003d, B:8:0x004b, B:10:0x005e, B:16:0x0092, B:19:0x009d, B:11:0x0076, B:13:0x0080), top: B:34:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[EDGE_INSN: B:39:0x00c1->B:24:0x00c1 BREAK  A[LOOP:0: B:3:0x0034->B:23:0x00bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.EditPlaceFlowActivity.C():void");
    }

    @Override // com.waze.sharedui.a.e
    protected final boolean D(Message message) {
        int i2;
        int i3;
        int length;
        if (message.what == NativeManager.UH_SEARCH_VENUES) {
            ed[] edVarArr = (ed[]) message.getData().getParcelableArray("venue_data");
            this.f33543k.unsetUpdateHandler(NativeManager.UH_SEARCH_VENUES, this.y);
            this.f33543k.CloseProgressPopup();
            if (edVarArr != null && (length = edVarArr.length) != 0) {
                this.f33542h = 7;
                com.waze.ifs.ui.w wVar = new com.waze.ifs.ui.w();
                com.waze.shared_infra.o.a aVar = this.z;
                wVar.q(aVar.c(R.string.PLACE_DUPLICATE, new Object[0]));
                wVar.k(aVar.c(R.string.SEARCH_PLACE_TO_MERGE, new Object[0]));
                gw[] gwVarArr = new gw[length];
                int i4 = 0;
                for (ed edVar : edVarArr) {
                    if (!this.m.s().equals(edVar.s()) && !TextUtils.isEmpty(edVar.t())) {
                        gw gwVar = new gw(edVar.s(), edVar.t(), false);
                        gwVarArr[i4] = gwVar;
                        gwVar.f37351d = edVar.l();
                        i4++;
                    }
                }
                if (i4 < length) {
                    gwVarArr = (gw[]) Arrays.copyOf(gwVarArr, i4);
                }
                wVar.s(gwVarArr);
                wVar.p(true);
                wVar.m(true);
                android.support.v4.app.ch chVarU = bv().u();
                chVarU.F(R.id.container, wVar);
                chVarU.u(null);
                chVarU.a();
            }
            return true;
        }
        if (message.what != NativeManager.UH_VENUE_STATUS) {
            int i5 = message.what;
            int i6 = NativeManager.UH_VENUE_ADD_IMAGE_RESULT;
            if (i5 != i6) {
                return false;
            }
            this.f33543k.unsetUpdateHandler(i6, this.y);
            Bundle data = message.getData();
            String string = data.getString("path");
            String string2 = data.getString(TtmlNode.ATTR_ID);
            String string3 = data.getString("image_url");
            String string4 = data.getString("image_thumbnail_url");
            boolean z = data.getBoolean("res");
            String str = true != this.o ? "PREVIEW" : "CONTINUE";
            String str2 = this.u;
            if (str2 != null && str2.equals(string)) {
                this.q = false;
                if (z) {
                    av avVar = new av(this, str, string, string3, string4, string2, new au(this, string3, string4, string2));
                    this.A = avVar;
                    aG(avVar, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } else {
                    String str3 = str;
                    if (this.p) {
                        this.f33543k.venueUpdate(this.m, this.n, str3, null);
                    }
                }
            }
            return true;
        }
        this.p = false;
        this.f33543k.CloseProgressPopup();
        Bundle data2 = message.getData();
        int i7 = data2.getInt("res");
        int i8 = data2.getInt("points");
        data2.getString(TtmlNode.ATTR_ID);
        ResultStruct resultStructFromBundle = ResultStruct.fromBundle(data2);
        if (i7 >= 0) {
            if (i8 < 0) {
                i8 = this.t;
            }
            if (i8 == 0) {
                i2 = R.string.THANK_YOU_BODY_ZERO_POINTS;
                i3 = R.string.THANK_YOU_TITLE_ZERO_POINTS;
                i8 = 0;
            } else {
                i2 = R.string.THANK_YOU_BODY_FULL_EDIT;
                i3 = R.string.THANK_YOU_TITLE_FULL_EDIT;
            }
            ec ecVar = new ec(this, i8, false, new com.waze.g.f(this, 4), null, i3, i2, -1, R.string.OKAY, i7 == 1);
            this.f33544l = ecVar;
            ecVar.show();
        } else if (resultStructFromBundle == null || !resultStructFromBundle.hasServerError()) {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("EditPlaceFlowActivity", new gp(this, 13)));
        } else {
            resultStructFromBundle.showError(null);
        }
        return true;
    }

    public final void E() {
        this.f33542h = 10;
        HashSet hashSet = new HashSet(this.m.I());
        bd bdVar = new bd();
        bdVar.h(hashSet);
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, bdVar);
        chVarU.u(null);
        chVarU.a();
    }

    public final void F(Bundle bundle) {
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            this.B = bundle;
            Intent intent = new Intent(this, (Class<?>) RequestPermissionActivity.class);
            intent.putExtra("needed_permissions", new String[]{"android.permission.CAMERA"});
            startActivityForResult(intent, 1);
            return;
        }
        this.f33542h = 2;
        eb ebVar = new eb();
        ebVar.t(this);
        ebVar.s(bundle);
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, ebVar);
        chVarU.u(null);
        chVarU.a();
    }

    @Override // com.waze.reports.dz
    public final void G(String str) throws NoSuchMethodException, SecurityException {
        this.u = str;
        this.m.J(str, "", "");
        this.q = true;
        this.f33543k.setUpdateHandler(NativeManager.UH_VENUE_ADD_IMAGE_RESULT, this.y);
        this.f33543k.venueAddImage(this.u);
        this.f33541f.u(this.m);
        this.f33542h = 1;
        bv().av();
    }

    public final void H() {
        com.waze.shared_infra.o.a aVar = this.z;
        String strC = aVar.c(R.string.WHATS_WRONG_WITH_THIS_PLACEQ, new Object[0]);
        this.r = -1;
        com.waze.sharedui.d.a.b bVar = new com.waze.sharedui.d.a.b(this);
        bVar.k(strC);
        bVar.e(new String[]{aVar.c(R.string.PLACE_CLOSED_MOVED, new Object[0]), aVar.c(R.string.PLACE_DUPLICATE, new Object[0]), aVar.c(R.string.PLACE_INAPPROPRIATE, new Object[0]), aVar.c(R.string.RESIDENTIAL_PLACE, new Object[0]), aVar.c(R.string.PLACE_WRONG, new Object[0])}, new cw(this, new int[]{1, 4, 5, 3, 6}, 1));
        bVar.d();
        bVar.c();
        com.waze.sharedui.d.a.c cVarB = bVar.b();
        cVarB.b();
        cVarB.a();
    }

    public final void M() {
        this.f33542h = 3;
        com.waze.ifs.ui.h hVar = new com.waze.ifs.ui.h();
        hVar.g(R.string.EDIT_PLACE);
        hVar.f(R.string.ABOUT2);
        hVar.d(R.string.DESCRIBE_PLACE_HINT);
        hVar.c(this.z.c(R.string.MAX_PD_CHARACTERS, 300));
        hVar.k();
        hVar.l();
        hVar.i();
        hVar.j();
        hVar.e(this.m.k());
        hVar.h();
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, hVar);
        chVarU.u(null);
        chVarU.a();
    }

    public final void N(ed edVar, ed edVar2, int i2) {
        this.p = true;
        this.m = edVar;
        this.n = edVar2;
        this.t = i2;
        if (this.q) {
            return;
        }
        this.f33543k.venueUpdate(edVar, edVar2, true != this.o ? "PREVIEW" : "CONTINUE", null);
    }

    @Override // com.waze.ifs.ui.g
    public final void a(String str) {
        int i2 = this.f33542h;
        if (i2 == 3) {
            this.m.N(str);
            this.f33541f.z(this.m);
        } else if (i2 == 4) {
            this.f33543k.venueFlag(this.m.s(), this.r, str, null);
            P();
        }
        this.f33542h = 1;
        bv().av();
    }

    @Override // com.waze.ifs.ui.s
    public final void bF(int i2, String str, String str2, boolean z) throws NoSuchMethodException, SecurityException {
        int i3 = this.f33542h;
        if (i3 == 8) {
            ee.a(this.m, str);
            ed edVar = this.m;
            edVar.O(ar.b(edVar.E()));
            this.f33541f.B(this.m);
        } else if (i3 == 7) {
            this.f33543k.venueFlag(this.m.s(), this.r, null, str);
            P();
        } else if (i3 == 11) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean zHas = jSONObject.has("CITY");
                ed edVar2 = this.m;
                if (zHas) {
                    edVar2.P(jSONObject.getString("CITY"));
                } else {
                    edVar2.P("");
                }
                boolean zHas2 = jSONObject.has("STREET");
                ed edVar3 = this.m;
                if (zHas2) {
                    edVar3.af(jSONObject.getString("STREET"));
                } else {
                    edVar3.af("");
                }
                this.f33541f.A(this.m);
            } catch (JSONException unused) {
            }
        }
        this.f33542h = 1;
        bv().av();
    }

    @Override // com.waze.reports.m
    public final void l(l lVar) throws NoSuchMethodException, SecurityException {
        int iB = this.m.b();
        int i2 = lVar.f33942a;
        if (i2 != iB || lVar.f33943b != this.m.a()) {
            this.m.Z(lVar.f33943b, i2);
            this.m.f33905a = true;
        }
        this.f33541f.C(this.m);
        this.f33542h = 1;
        bv().av();
    }

    @Override // com.waze.ifs.ui.s
    public final void m() {
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1) {
            F(this.B);
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        bd.i();
        ar.d();
        bc.c();
        be.c();
        if (getIntent().hasExtra(ed.class.getName())) {
            this.m = (ed) getIntent().getParcelableExtra(ed.class.getName());
        } else {
            this.m = new ed();
        }
        if (getIntent().hasExtra("continue_edit")) {
            this.o = true;
        }
        if (bundle != null) {
            this.m = (ed) bundle.getParcelable(String.valueOf(f33540g).concat(".mVenue"));
        }
        getWindow().setSoftInputMode(3);
        this.f33543k = NativeManager.getInstance();
        NativeManager.Post(new as(this, 0));
        setContentView(R.layout.fragment_activity_empty);
        if (bundle == null) {
            this.f33542h = 1;
            ax axVar = new ax();
            this.f33541f = axVar;
            axVar.y(this.m);
            android.support.v4.app.ch chVarU = bv().u();
            chVarU.r(R.id.container, this.f33541f, "EditPlaceFragment");
            chVarU.a();
        } else {
            String str = f33540g;
            this.f33542h = bundle.getInt(String.valueOf(str).concat(".mState"));
            this.r = bundle.getInt(String.valueOf(str).concat(".mFlagType"));
            this.m = (ed) bundle.getParcelable(String.valueOf(str).concat(".mVenue"));
            this.o = bundle.getBoolean(String.valueOf(str).concat(".mIsContinueEdit"));
            this.p = bundle.getBoolean(String.valueOf(str).concat(".mIsSending"));
            this.q = bundle.getBoolean(String.valueOf(str).concat(".mIsWaitingForImage"));
            this.u = bundle.getString(String.valueOf(str).concat(".mPhotoPath"));
            this.f33541f = (ax) bv().h("EditPlaceFragment");
        }
        this.s = false;
        NativeManager nativeManager = this.f33543k;
        com.waze.sharedui.a.d dVar = this.y;
        nativeManager.setUpdateHandler(NativeManager.UH_VENUE_STATUS, dVar);
        if (!this.q || this.u == null) {
            return;
        }
        this.f33543k.setUpdateHandler(NativeManager.UH_VENUE_ADD_IMAGE_RESULT, dVar);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        ec ecVar = this.f33544l;
        if (ecVar != null) {
            ecVar.dismiss();
        }
        if (!this.s) {
            ee.b();
        }
        NativeManager nativeManager = this.f33543k;
        com.waze.sharedui.a.d dVar = this.y;
        nativeManager.unsetUpdateHandler(NativeManager.UH_VENUE_STATUS, dVar);
        this.f33543k.unsetUpdateHandler(NativeManager.UH_SEARCH_VENUES, dVar);
        this.f33543k.unsetUpdateHandler(NativeManager.UH_VENUE_ADD_IMAGE_RESULT, dVar);
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = f33540g;
        bundle.putInt(String.valueOf(str).concat(".mState"), this.f33542h);
        bundle.putInt(String.valueOf(str).concat(".mFlagType"), this.r);
        bundle.putParcelable(String.valueOf(str).concat(".mVenue"), this.m);
        bundle.putBoolean(String.valueOf(str).concat(".mIsContinueEdit"), this.o);
        bundle.putBoolean(String.valueOf(str).concat(".mIsSending"), this.p);
        bundle.putBoolean(String.valueOf(str).concat(".mIsWaitingForImage"), this.q);
        bundle.putString(String.valueOf(str).concat(".mPhotoPath"), this.u);
        this.s = true;
    }

    public final void x(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((br) arrayList.get(i2)).a());
        }
        this.m.X(arrayList2);
        this.f33541f.w(this.m);
        this.f33542h = 1;
        bv().av();
    }

    public final void y(List list) {
        this.m.ad(list);
        this.f33541f.x(this.m);
        this.f33542h = 1;
        bv().av();
    }

    public final void z() {
        this.f33542h = 8;
        com.waze.ifs.ui.w wVar = new com.waze.ifs.ui.w();
        wVar.q(this.z.c(R.string.CATEGORIES, new Object[0]));
        wVar.s(ar.e());
        wVar.l(true);
        wVar.z();
        android.support.v4.app.ch chVarU = bv().u();
        chVarU.F(R.id.container, wVar);
        chVarU.u(null);
        chVarU.a();
    }
}

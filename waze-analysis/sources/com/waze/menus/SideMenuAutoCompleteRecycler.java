package com.waze.menus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.bs;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.api.internal.bc;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.il;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.lm;
import com.waze.modules.navigation.ah;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.HistoryActivity;
import com.waze.search.SearchNativeManager;
import com.waze.sharedui.utils.RequestPermissionActivity;
import com.waze.ui.z.as;
import com.waze.z.a.d.ai;
import java.util.ArrayList;
import java.util.List;
import l.a.alx;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class SideMenuAutoCompleteRecycler extends RecyclerView implements o {
    public static final /* synthetic */ int Q = 0;
    public Lifecycle P;
    private y R;
    private u S;
    private final List T;
    private final List U;
    private com.waze.jni.a V;
    private boolean W;
    private String aa;
    private boolean ab;
    private AddressItem[] ac;
    private l ad;
    private com.waze.shared_infra.o.a ae;
    private boolean af;
    private final com.waze.ifs.a.c ag;
    private v ah;
    private w ai;

    public SideMenuAutoCompleteRecycler(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.T = new ArrayList();
        this.U = new ArrayList();
        int i3 = 1;
        this.ab = true;
        this.ad = null;
        this.af = true;
        this.ag = new com.waze.ifs.a.c(this);
        Context context2 = getContext();
        int i4 = lm.f25154a;
        Activity activityS = com.waze.shared_infra.i.h.s(context2);
        this.ah = activityS != null ? new s(activityS) : new r();
        Activity activityS2 = com.waze.shared_infra.i.h.s(getContext());
        this.ai = activityS2 != null ? new t(activityS2) : new aa(i3);
        this.P = null;
        if (isInEditMode()) {
            as.j(getResources());
        }
        this.W = true;
        this.aa = "";
        getContext();
        al(new LinearLayoutManager());
        this.R = new y(this);
        this.ae = com.waze.design_components.g.b.d(this);
        u uVar = new u();
        this.S = uVar;
        uVar.b();
        ak(new bs(this.R, this.S));
        this.V = new il(this, 16);
    }

    public static /* synthetic */ void aL(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler, AddressItem addressItem, DriveTo.DangerZoneType dangerZoneType) {
        if (dangerZoneType == DriveTo.DangerZoneType.NOT_DANGER_ZONE) {
            com.waze.realtime_report_feedback.e.e(addressItem, false, sideMenuAutoCompleteRecycler.ah);
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(com.waze.navigate.as.d(dangerZoneType));
        oVar.P(com.waze.navigate.as.b(dangerZoneType));
        oVar.f13808a = new com.waze.navigate.f(sideMenuAutoCompleteRecycler, addressItem, 1, null);
        oVar.M(sideMenuAutoCompleteRecycler.ae.c(R.string.CANCEL, new Object[0]));
        oVar.N(sideMenuAutoCompleteRecycler.ae.c(R.string.KEEP_DRIVE, new Object[0]));
        oVar.F(R.drawable.dangerous_zone_icon);
        oVar.H(new com.waze.design_components.c.f(addressItem, 2));
        oVar.R(true);
        ai.q(oVar);
    }

    public static /* synthetic */ void aM(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler, AddressItem addressItem, boolean z) {
        if (z) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).addDangerZoneStat(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED);
        } else {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).addDangerZoneStat(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), alx.CONFIRM, DriveTo.DangerZoneStatType.NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED);
            com.waze.realtime_report_feedback.e.e(addressItem, true, sideMenuAutoCompleteRecycler.ah);
        }
    }

    public static /* synthetic */ void aN(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler, Intent intent) {
        if (intent != null) {
            sideMenuAutoCompleteRecycler.ai.a(intent, 1);
        }
    }

    public static /* synthetic */ void aO(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler, i iVar, boolean z) {
        if (z) {
            if (ActivityCompat.checkSelfPermission(sideMenuAutoCompleteRecycler.getContext(), "android.permission.READ_CONTACTS") == 0) {
                sideMenuAutoCompleteRecycler.bf(iVar);
                return;
            }
            RequestPermissionActivity.b(new com.google.firebase.appcheck.debug.a.a(sideMenuAutoCompleteRecycler, iVar, 3));
            Intent intent = new Intent(sideMenuAutoCompleteRecycler.getContext(), (Class<?>) RequestPermissionActivity.class);
            intent.putExtra("needed_permissions", new String[]{"android.permission.READ_CONTACTS"});
            lm.d().e().startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bf(i iVar) {
        NativeManager.getInstance().closeAndOpenProgressPopup(this.ae.c(R.string.REQUEST_CONTACTS_DONE, new Object[0]), R.drawable.bigblue_v_icon);
        this.ag.postDelayed(new bc(16), 1000L);
        this.T.remove(iVar);
        bg();
    }

    private final void bg() {
        this.R.notifyDataSetChanged();
    }

    @Override // com.waze.menus.o
    public final void a(String str, List list, int i2) {
        if (TextUtils.equals(str, this.aa)) {
            boolean z = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b().booleanValue() && !list.isEmpty();
            com.waze.search.d.a.b.f().e(this.aa.length(), list.size() - 1, i2, null, Boolean.valueOf(z), null, null, bjz.MOBILE_ANDROID);
            this.ad = null;
            this.W = false;
            this.ab = false;
            List list2 = this.U;
            list2.clear();
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.waze.j.d dVar = (com.waze.j.d) list.get(i3);
                String strD = dVar.d();
                if (strD.contains(this.aa)) {
                    strD.indexOf(this.aa);
                }
                if (strD.contains(this.aa)) {
                    this.aa.length();
                }
                q qVar = new q(dVar, i3);
                if (dVar.e() == 4) {
                    com.waze.ads.c.e.h(i3, this.aa, dVar.n(), dVar.m());
                }
                list2.add(qVar);
            }
            bg();
            this.S.a(z);
        }
    }

    public final void aQ(String str) {
        SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler;
        if (TextUtils.isEmpty(str) && (this.ad != null || !this.W)) {
            this.ab = true;
            this.W = true;
            this.aa = "";
            this.U.clear();
            l lVar = this.ad;
            if (lVar != null) {
                lVar.cancel(true);
                this.ad = null;
            }
            bg();
            this.S.a(false);
            com.waze.search.d.a.b.f().f();
            return;
        }
        if (TextUtils.isEmpty(str) || this.aa.equals(str)) {
            return;
        }
        this.aa = str;
        l lVar2 = this.ad;
        if (lVar2 == null || !lVar2.a().equals(this.aa)) {
            l lVar3 = this.ad;
            if (lVar3 != null && !lVar3.a().equals(this.aa)) {
                this.ad.cancel(true);
            }
            sideMenuAutoCompleteRecycler = this;
            l lVar4 = new l(new p(this.aa, this.ac, 65535, this.ab, false, sideMenuAutoCompleteRecycler));
            sideMenuAutoCompleteRecycler.ad = lVar4;
            lVar4.execute(new Void[0]);
        } else {
            sideMenuAutoCompleteRecycler = this;
        }
        sideMenuAutoCompleteRecycler.bg();
    }

    public final synchronized void aR(Message message) {
        if (message.what == DriveToNativeManager.UH_SEARCH_ADD_RESULT) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.ag);
            NativeManager.getInstance().CloseProgressPopup();
            AddressItem addressItem = (AddressItem) message.getData().getParcelable("address_item");
            if (addressItem == null) {
                com.waze.shared_infra.i.h.c("SideMenuAutoCompleteRecycler: onChangeLocation: received null AI for UH_SEARCH_ADD_RESULT");
                return;
            }
            if (lm.d().e() != null) {
                if (!this.af) {
                    ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getDangerZoneType(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), new com.waze.car_lib.r.d.f(this, addressItem, 1));
                    return;
                }
                v vVar = this.ah;
                h.g.b.x.f(vVar, "resultListener");
                Intent intent = new Intent();
                intent.putExtra("com.waze.planned_drive.PlannedDriveUtils.kt.origin", addressItem);
                vVar.a(intent);
            }
        }
    }

    public final void aS() {
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getAutoCompleteData(this.V);
    }

    public final void aT(AddressItem addressItem) {
        this.ah.a(com.waze.realtime_report_feedback.e.d(this.af, addressItem));
    }

    public final void aU() {
        this.ah.a(com.waze.realtime_report_feedback.e.d(this.af, null));
    }

    public final void aV() {
        com.waze.bt.e eVar = this.af ? com.waze.bt.e.f17463b : com.waze.bt.e.f17464c;
        w wVar = this.ai;
        com.waze.web.c cVar = new com.waze.web.c();
        cVar.f(eVar);
        cVar.e(ah.f30286b);
        wVar.a(cVar.d(getContext()), 1);
    }

    public final void aW() {
        w wVar = this.ai;
        boolean z = this.af;
        ah ahVar = ah.f30287c;
        int i2 = HistoryActivity.f30924g;
        Intent intent = new Intent(lm.d().e(), (Class<?>) HistoryActivity.class);
        if (z) {
            intent.putExtra("mode", com.waze.bt.e.f17463b);
        } else {
            intent.putExtra("mode", com.waze.bt.e.f17464c);
        }
        if (ahVar != null) {
            intent.putExtra("caller", ahVar.name());
        }
        wVar.a(intent, 5004);
    }

    public final void aX(AddressItem addressItem) {
        this.ah.a(com.waze.realtime_report_feedback.e.d(this.af, addressItem));
    }

    public final void aY() {
        NativeManager.getInstance().OpenProgressPopup(this.ae.c(R.string.PLEASE_WAIT___, new Object[0]));
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.ag);
    }

    public final void aZ() {
        String str = this.aa;
        Context context = getContext();
        SearchNativeManager.getInstance().techCodeHandle(str, new com.waze.ads.c((Object) new com.waze.share.w(this, 1), (Object) str, (Object) context, 11, (short[]) null));
    }

    public final void ba(w wVar) {
        this.ai = wVar;
    }

    public final void bb(List list) {
        List list2 = this.T;
        list2.clear();
        list2.addAll(list);
        bg();
    }

    public final void bc(boolean z) {
        this.af = z;
    }

    public final void bd(v vVar) {
        this.ah = vVar;
    }

    public SideMenuAutoCompleteRecycler(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideMenuAutoCompleteRecycler(Context context) {
        this(context, null);
    }
}

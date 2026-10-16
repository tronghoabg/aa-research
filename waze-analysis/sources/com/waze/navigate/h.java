package com.waze.navigate;

import android.content.Intent;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.lm;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class h extends com.waze.ifs.ui.a implements com.waze.menus.d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31467f = 0;

    public static /* synthetic */ void C(h hVar, AddressItem addressItem, com.waze.shared_infra.o.a aVar, DriveTo.DangerZoneType dangerZoneType) {
        if (dangerZoneType == DriveTo.DangerZoneType.NOT_DANGER_ZONE) {
            bx(addressItem);
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(as.d(dangerZoneType));
        oVar.P(as.c(dangerZoneType));
        oVar.f13808a = new f(hVar, addressItem, 0);
        oVar.M(aVar.c(R.string.CANCEL, new Object[0]));
        oVar.N(aVar.c(R.string.DANGEROUS_ADDRESS_SAVE_BUTTON, new Object[0]));
        oVar.F(R.drawable.dangerous_zone_icon);
        oVar.H(new com.waze.design_components.c.f(addressItem, 4));
        oVar.R(true);
        com.waze.z.a.d.ai.q(oVar);
    }

    public static /* synthetic */ void E(AddressItem addressItem, boolean z) {
        if (z) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).addDangerZoneStat(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
        } else {
            bx(addressItem);
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).addDangerZoneStat(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), alx.CONFIRM, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
        }
    }

    private static final void bx(AddressItem addressItem) {
        new com.waze.favorites.u(addressItem).d(lm.d().e());
    }

    @Override // com.waze.menus.d
    public final void b(AddressItem addressItem, com.waze.menus.f fVar) {
        com.waze.menus.f fVar2 = com.waze.menus.f.ADD_FAVORITE;
        int iOrdinal = fVar.ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getDangerZoneType(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), new com.waze.view.popups.a.c(this, addressItem, com.waze.shared_infra.o.b.a(), i2));
            return;
        }
        boolean z = false;
        z = false;
        if (iOrdinal == 1) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).convertFavoriteToRecent(addressItem.getId(), new g(this, 0));
            return;
        }
        if (iOrdinal == 3) {
            com.waze.sharedui.a.e eVarE = lm.d().e();
            if (eVarE != null) {
                new com.waze.search.t().f(addressItem).h(eVarE, 0);
                return;
            }
            return;
        }
        if (iOrdinal == 11) {
            com.waze.places.o.a().b(addressItem, new g(this, 1));
            return;
        }
        if (iOrdinal == 13) {
            com.waze.favorites.u uVar = new com.waze.favorites.u(addressItem);
            uVar.a(true);
            uVar.c(new e(this, z ? 1 : 0));
            uVar.d(this);
            return;
        }
        switch (iOrdinal) {
            case 5:
                if (addressItem.getType() != 13) {
                    cs csVar = new cs(addressItem);
                    if (addressItem.getVenueId() != null && !addressItem.getVenueId().isEmpty()) {
                        z = true;
                    }
                    csVar.e(z);
                    csVar.b(this, 1);
                    break;
                } else {
                    ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).initMeeting(addressItem.getMeetingId());
                    break;
                }
                break;
            case 6:
                com.waze.share.aa.e(lm.d().e(), com.waze.share.z.f37756c, addressItem);
                break;
            case 7:
                NativeManager.getInstance().setShowRoutesWhenNavigationStarts(true);
                ((com.waze.modules.navigation.bp) com.waze.web.r.h(com.waze.modules.navigation.bp.class)).b(new com.waze.modules.navigation.ao(q(), new com.waze.modules.navigation.ai(addressItem)));
                break;
            case 8:
            case 9:
                AddHomeWorkActivity.p(addressItem.getType(), 1001);
                break;
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 32783) {
            y();
        }
    }

    protected abstract com.waze.modules.navigation.ah q();

    protected abstract void y();
}

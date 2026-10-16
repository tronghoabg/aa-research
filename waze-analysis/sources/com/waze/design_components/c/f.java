package com.waze.design_components.c;

import android.content.DialogInterface;
import android.support.v4.app.ar;
import com.waze.favorites.v;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.modules.navigation.w;
import com.waze.modules.navigation.x;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.fv;
import com.waze.planned_drive.ca;
import com.waze.sdk.bi;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import com.waze.web.r;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23390a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23391b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f23391b = i2;
        this.f23390a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [com.waze.navigate.fy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23391b) {
            case 0:
                i.f((i) this.f23390a);
                break;
            case 1:
                ((v) this.f23390a).k();
                break;
            case 2:
                int i2 = SideMenuAutoCompleteRecycler.Q;
                DriveToNativeManager driveToNativeManager = (DriveToNativeManager) r.h(DriveToNativeManager.class);
                AddressItem addressItem = (AddressItem) this.f23390a;
                driveToNativeManager.addDangerZoneStat(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED);
                break;
            case 3:
                this.f23390a.a(x.f30503a);
                break;
            case 4:
                int i3 = com.waze.navigate.h.f31467f;
                DriveToNativeManager driveToNativeManager2 = (DriveToNativeManager) r.h(DriveToNativeManager.class);
                AddressItem addressItem2 = (AddressItem) this.f23390a;
                driveToNativeManager2.addDangerZoneStat(addressItem2.getLongitudeInt(), addressItem2.getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
                break;
            case 5:
                this.f23390a.a(fv.f31381a);
                break;
            case 6:
                this.f23390a.invoke(ca.f33296c);
                break;
            case 7:
                int i4 = bi.f35330a;
                this.f23390a.run();
                break;
            case 8:
                com.waze.sharedui.g.i.n((com.waze.sharedui.g.i) this.f23390a);
                break;
            case 9:
                ?? r3 = this.f23390a;
                if (r3 != 0) {
                    r3.onCancel(dialogInterface);
                    break;
                }
                break;
            case 10:
                ?? r32 = this.f23390a;
                if (r32 != 0) {
                    r32.run();
                    break;
                }
                break;
            case 11:
                this.f23390a.invoke();
                break;
            case 12:
                ((ar) this.f23390a).requireActivity().onBackPressed();
                break;
            case 13:
                ((RequestAlwaysLocationDialogActivity) this.f23390a).r();
                break;
            default:
                this.f23390a.invoke(w.f30501c);
                break;
        }
    }
}

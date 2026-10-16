package com.waze.profile;

import android.view.View;
import com.waze.navigate.DriveToNativeManager;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.share.ViewShareDriveActivity;
import com.waze.sharedui.views.WazeValidatedEditText;
import com.waze.sharedui.views.ac;
import com.waze.sharedui.views.ad;
import com.waze.trip_overview.c.a.ab;
import com.waze.trip_overview.dw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33402a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33403b;

    public /* synthetic */ m(Object obj, int i2) {
        this.f33403b = i2;
        this.f33402a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33403b) {
            case 0:
                TempUserProfileActivity.p((TempUserProfileActivity) this.f33402a);
                break;
            case 1:
                TempUserProfileActivity.o((TempUserProfileActivity) this.f33402a);
                break;
            case 2:
                ((WazeSettingsView) this.f33402a).performClick();
                break;
            case 3:
                ((WazeSettingsView) this.f33402a).performClick();
                break;
            case 4:
                com.waze.share.f.h((com.waze.share.f) this.f33402a);
                break;
            case 5:
                com.waze.share.f.g((com.waze.share.f) this.f33402a);
                break;
            case 6:
                ViewShareDriveActivity.s((ViewShareDriveActivity) this.f33402a);
                break;
            case 7:
                ViewShareDriveActivity viewShareDriveActivity = (ViewShareDriveActivity) this.f33402a;
                ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getAddressFromMeetingId(viewShareDriveActivity.p, new com.waze.r.d(viewShareDriveActivity, 4));
                break;
            case 8:
                ((ViewShareDriveActivity) this.f33402a).finish();
                break;
            case 9:
                ((com.waze.sharedui.g.i) this.f33402a).cancel();
                break;
            case 10:
                ((com.waze.sharedui.g.i) this.f33402a).cancel();
                break;
            case 11:
                ((com.waze.sharedui.d.a.d) this.f33402a).cancel();
                break;
            case 12:
                this.f33402a.onClick(view);
                break;
            case 13:
                ?? r2 = this.f33402a;
                if (r2 != 0) {
                    r2.onClick(view);
                    break;
                }
                break;
            case 14:
                ad.y((ad) this.f33402a);
                break;
            case 15:
                ((ad) this.f33402a).l();
                break;
            case 16:
                ad adVar = (ad) this.f33402a;
                adVar.g().setText("");
                adVar.g().requestFocus();
                break;
            case 17:
                ((ad) this.f33402a).l();
                break;
            case 18:
                Object obj = this.f33402a;
                ad adVar2 = (ad) obj;
                if (adVar2.h() != ac.DISABLED) {
                    if (!adVar2.x()) {
                        adVar2.k(true);
                        break;
                    } else {
                        ((WazeValidatedEditText) obj).A();
                        break;
                    }
                }
                break;
            case 19:
                ((ab) this.f33402a).h().l(new dw(com.waze.trip_overview.a.f40977a));
                break;
            default:
                ((com.waze.trip_overview.views.trip_details_container.h) this.f33402a).d().invoke();
                break;
        }
    }
}

package com.waze;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Observer;
import com.waze.feedback.FeedbackActivity;
import com.waze.planned_drive.PlannedDriveDayPicker;
import com.waze.planned_drive.PlannedDriveFragment;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cz implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23247a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23248b;

    public /* synthetic */ cz(Object obj, int i2) {
        this.f23248b = i2;
        this.f23247a = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f23248b) {
            case 0:
                ((MainActivity) this.f23247a).q.c(((com.waze.calendar.b) obj) == et.f23667a);
                break;
            case 1:
                ca caVar = (ca) obj;
                if (caVar != ca.f18721a) {
                    Object obj2 = this.f23247a;
                    ca caVar2 = ca.f18722b;
                    FreeMapAppActivity freeMapAppActivity = (FreeMapAppActivity) obj2;
                    if (freeMapAppActivity.getIntent() != null) {
                        com.waze.shared_infra.i.h.k("FreeMap", "handleIntent data=" + String.valueOf(freeMapAppActivity.getIntent().getData()) + ", flags=" + freeMapAppActivity.getIntent().getFlags());
                    }
                    Intent intent = freeMapAppActivity.getIntent();
                    Context context = (Context) obj2;
                    Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
                    Uri data = intent.getData();
                    if (((jg) com.waze.web.r.h(jg.class)).b()) {
                        intent2.setDataAndType(data, intent.getType());
                    } else {
                        intent2.setData(data);
                    }
                    if (intent.getExtras() != null) {
                        intent2.putExtras(intent.getExtras());
                    }
                    Uri referrer = ActivityCompat.getReferrer((Activity) obj2);
                    if (referrer != null && !TextUtils.isEmpty(referrer.getHost())) {
                        intent2.putExtra("referrer", referrer.getHost());
                    }
                    intent2.putExtra("waze.isLaunchIntent", true);
                    if (caVar == caVar2) {
                        freeMapAppActivity.startActivity(intent2, ActivityOptions.makeCustomAnimation(context, 0, R.anim.fade_out).toBundle());
                    } else {
                        freeMapAppActivity.startActivity(intent2);
                    }
                    freeMapAppActivity.finish();
                    break;
                }
                break;
            case 2:
                MainActivity.u((MainActivity) this.f23247a, (com.waze.planned_drive.o) obj);
                break;
            case 3:
                MainActivity.r((MainActivity) this.f23247a, (com.waze.app_nav.g) obj);
                break;
            case 4:
                if (h.g.b.x.n((Boolean) obj, true)) {
                    ((FeedbackActivity) this.f23247a).finish();
                    break;
                }
                break;
            case 5:
                ((PlannedDriveFragment) this.f23247a).f33170e.setText(((com.waze.planned_drive.bx) obj).b());
                break;
            case 6:
                ((com.waze.planned_drive.histogram.b) this.f23247a).c((List) obj);
                break;
            case 7:
                ((PlannedDriveDayPicker) this.f23247a).d((List) obj);
                break;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.f23247a;
                if (!zBooleanValue) {
                    PlannedDriveDayPicker plannedDriveDayPicker = (PlannedDriveDayPicker) obj3;
                    if (plannedDriveDayPicker.getVisibility() == 0) {
                        plannedDriveDayPicker.setAlpha(1.0f);
                        View view = (View) obj3;
                        com.waze.view.anim.g.d(view).alpha(0.0f).setListener(com.waze.view.anim.g.b(view)).start();
                        break;
                    }
                } else {
                    PlannedDriveDayPicker plannedDriveDayPicker2 = (PlannedDriveDayPicker) obj3;
                    if (plannedDriveDayPicker2.getVisibility() != 0) {
                        plannedDriveDayPicker2.setVisibility(0);
                        plannedDriveDayPicker2.setAlpha(0.0f);
                        com.waze.view.anim.g.d((View) obj3).alpha(1.0f).setListener(null).start();
                        break;
                    }
                }
                break;
            case 9:
                PlannedDriveFragment.d((PlannedDriveFragment) this.f23247a, (com.waze.planned_drive.cf) obj);
                break;
            case 10:
                ((PlannedDriveFragment) this.f23247a).f33168c.setClickable(((Boolean) obj).booleanValue());
                break;
            default:
                com.waze.uid.c.bt.k((com.waze.uid.c.bt) this.f23247a, (com.waze.uid.c.bb) obj);
                break;
        }
    }
}

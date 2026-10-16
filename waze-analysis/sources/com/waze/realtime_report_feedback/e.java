package com.waze.realtime_report_feedback;

import android.content.Intent;
import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.w;
import com.waze.menus.v;
import com.waze.navigate.AddressItem;
import com.waze.planned_drive.ac;
import com.waze.planned_drive.ad;
import com.waze.planned_drive.bx;
import h.g.b.x;
import java.util.Calendar;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {
    public static final ReportFeedbackServiceProvider a() {
        return (ReportFeedbackServiceProvider) ReportFeedbackServiceProvider.instance$delegate.getValue();
    }

    public static final /* synthetic */ boolean c(long j2, bx bxVar, com.waze.shared_infra.q.e eVar) {
        Calendar calendarC = eVar.c();
        calendarC.set(11, 0);
        calendarC.set(12, 0);
        calendarC.set(13, 0);
        calendarC.set(14, 0);
        calendarC.add(5, bxVar.a());
        long timeInMillis = calendarC.getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        x.e(calendar, "getInstance(...)");
        calendar.setTime(new Date(j2));
        Calendar calendar2 = Calendar.getInstance();
        x.e(calendar2, "getInstance(...)");
        calendar2.setTime(new Date(timeInMillis));
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static final Intent d(boolean z, AddressItem addressItem) {
        Intent intent = new Intent();
        if (z) {
            intent.putExtra("com.waze.planned_drive.PlannedDriveUtils.kt.origin", addressItem);
            return intent;
        }
        intent.putExtra("com.waze.planned_drive.PlannedDriveUtils.kt.destination", addressItem);
        return intent;
    }

    public static final void e(AddressItem addressItem, boolean z, v vVar) {
        x.f(addressItem, "destination");
        x.f(vVar, "resultListener");
        Intent intent = new Intent();
        intent.putExtra("com.waze.planned_drive.PlannedDriveUtils.kt.destination", addressItem);
        intent.putExtra("com.waze.planned_drive.PlannedDriveUtils.kt.dangerZoneConfirmed", z);
        vVar.a(intent);
    }

    public static final void f(w wVar, boolean z) {
        x.f(wVar, "mainScreenFlowController");
        ad adVar = ad.f33183a;
        ac acVar = new ac();
        acVar.b(z);
        k.c(wVar, acVar.a(), new ah(false, null, new com.waze.app_nav.f(com.waze.app_nav.g.f15207c)));
    }
}

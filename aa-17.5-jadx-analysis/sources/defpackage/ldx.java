package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class ldx implements ohv {
    @Override // defpackage.ohv
    public final void a(TelemetryEvent telemetryEvent) throws Resources.NotFoundException {
        yph yphVar = FirstDriveNotificationManager.a;
        yyz yyzVar = telemetryEvent.b.p;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        if (yyzVar.d == 201) {
            FirstDriveNotificationManager firstDriveNotificationManagerA = FirstDriveNotificationManager.a();
            ((ype) ((ype) FirstDriveNotificationManager.a.f()).ai((char) 3807)).u("Marked eligible for FDC");
            firstDriveNotificationManagerA.c = true;
            return;
        }
        yyz yyzVar2 = telemetryEvent.b.p;
        if (yyzVar2 == null) {
            yyzVar2 = yyz.a;
        }
        if (yyzVar2.d == 252) {
            FirstDriveNotificationManager firstDriveNotificationManagerA2 = FirstDriveNotificationManager.a();
            if (firstDriveNotificationManagerA2.c) {
                ((ype) ((ype) FirstDriveNotificationManager.a.f()).ai((char) 3808)).u("Eligible for FDC");
                Context context = mki.a.c;
                String string = context.getString(R.string.first_drive_congrats_notification_title);
                String string2 = context.getString(R.string.first_drive_congrats_notification_body);
                String string3 = context.getString(R.string.first_drive_congrats_action);
                int color = context.getResources().getColor(R.color.gearhead_sdk_light_blue_500);
                mas.c();
                dsx dsxVar = new dsx(context, "gearhead_tips_and_tricks");
                dsxVar.n(2131231121);
                dsxVar.i(string);
                dsxVar.h(string2);
                dsxVar.t = color;
                dsxVar.l();
                dsxVar.e(16, true);
                dsxVar.g = FirstDriveNotificationManager.e(context);
                Intent intent = new Intent(mki.a.c, (Class<?>) FirstDriveNotificationManager.Receiver.class);
                intent.setAction("ACTION_DELETE");
                ClipData clipData = wdu.a;
                dsxVar.j(wdu.c(context, 0, intent, 335544320));
                dsxVar.f(0, string3, FirstDriveNotificationManager.e(context));
                dsw dswVar = new dsw();
                dswVar.d(string2);
                dsxVar.o(dswVar);
                new dug(context).b(null, 377361654, dsxVar.a());
                FirstDriveNotificationManager.b(yzy.BN);
                firstDriveNotificationManagerA2.c = false;
            }
        }
    }
}

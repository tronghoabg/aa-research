package defpackage;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity;
import com.google.android.projection.gearhead.companion.settings.LegalInfoActivity;

/* loaded from: classes.dex */
public final class wym implements lhg {
    public final dug a;
    public final Context b;
    private final Handler c = new Handler(new wyl(this, 0));

    public wym(Context context) {
        this.b = context;
        this.a = new dug(context);
    }

    public static wym a() {
        return wyg.a.b;
    }

    public final void b(int i, int i2, int i3, int i4, Intent intent, long j) {
        mas.c();
        Context context = this.b;
        dsx dsxVar = new dsx(context, "gearhead_alerts");
        dsxVar.n(i2);
        dsxVar.t = context.getColor(R.color.gearhead_sdk_light_blue_700);
        dsxVar.e(16, true);
        dsxVar.l();
        dsxVar.e(8, true);
        dsxVar.i(context.getText(i3));
        dsxVar.h(context.getText(i4));
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addParentStack(intent.getComponent());
        taskStackBuilderCreate.addNextIntent(intent);
        dsxVar.g = taskStackBuilderCreate.getPendingIntent(0, 201326592);
        this.a.b(null, i, dsxVar.a());
        if (j > 0) {
            this.c.sendEmptyMessageDelayed(i, j);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        if (lgv.c().m()) {
            return;
        }
        Context context = this.b;
        b(2, 2131231483, R.string.app_name, R.string.permission_notification_subtitle, new Intent(context, (Class<?>) RequestNotificationAccessActivity.class), 600000L);
        if (jri.a()) {
            nuj nujVarB = nuj.b();
            if (RequestNotificationAccessActivity.a == null) {
                Intent intent = new Intent(context, (Class<?>) RequestNotificationAccessActivity.class);
                TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
                taskStackBuilderCreate.addParentStack(intent.getComponent());
                taskStackBuilderCreate.addNextIntent(intent);
                PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(0, 201326592);
                num numVar = new num();
                numVar.b = GhIcon.q(context.getResources(), 2131231483);
                numVar.m = context.getText(R.string.permission_notification_access_name).toString();
                numVar.n = context.getText(R.string.permission_notification_subtitle).toString();
                numVar.c = pendingIntent;
                numVar.j = false;
                numVar.f = "com.google.android.projection.gearhead";
                RequestNotificationAccessActivity.a = numVar.b();
            }
            nujVarB.j("NOTIFICATION_ACCESS", 1001L, RequestNotificationAccessActivity.a);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        ono onoVar = new ono(kio.b().e());
        if (!onoVar.b() || onoVar.e("car_tos_data") >= 2) {
            return;
        }
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) LegalInfoActivity.class);
        String string = context.getString(R.string.companion_legal_data_notice_title);
        String string2 = context.getString(R.string.data_notice_content);
        intent.putExtra("legal_title_key", string);
        intent.putExtra("legal_body_key", string2);
        intent.putExtra("data_notice_notification", true);
        b(3, 2131231121, R.string.data_notice_updated_title, R.string.data_notice_updated_notification, intent, 0L);
        onoVar.g("car_tos_data", 2);
        ebf.j().o(yzz.DATA_NOTICE_NOTIFICATION, yzy.iF);
    }
}

package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.apps.auto.components.carhome.ProjectedHomeActivity;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class xfj implements qkq {
    public static final yph a = yph.c("GH.PassengerModeUiContr");
    public sab d;
    public final rzz b = new rzz() { // from class: xfh
        @Override // defpackage.rzz
        public final void i(boolean z) {
            this.a.b(z);
        }
    };
    private final Runnable g = new wxj(this, 12);
    private final Handler h = new Handler();
    public boolean c = true;
    public final eqm e = new eqm();
    public final kfn f = new xfi(this);

    public final void a() {
        ((ype) a.l().ai((char) 10232)).u("cancelling notification");
        this.h.removeCallbacks(this.g);
        NotificationManager notificationManager = (NotificationManager) mki.a.c.getSystemService("notification");
        mas.c();
        notificationManager.cancel("gearhead_alerts", 87859647);
    }

    public final void b(boolean z) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 10234)).y("video focus changed: %b", Boolean.valueOf(z));
        sab sabVar = this.d;
        if (sabVar == null) {
            tss.q("GH.PassengerModeUiContr", "onVideoFocusChanged called but CarWindowManager was null", new Object[0]);
            return;
        }
        if (z) {
            a();
            this.d.h(this.b);
            kio.b().w(this.f);
            ((ype) ((ype) yphVar.f()).ai((char) 10233)).u("lock screen user disabled");
            mox.b().e();
            this.e.m(mow.c);
            return;
        }
        sabVar.e(this.b);
        if (!this.c) {
            this.e.m(mow.b);
            Context context = mki.a.c;
            Intent intent = new Intent(context, (Class<?>) ProjectedHomeActivity.class);
            intent.setFlags(335544320);
            context.startActivity(intent, luk.c());
            return;
        }
        ((ype) yphVar.l().ai((char) 10236)).u("showing notification");
        Context context2 = mki.a.c;
        NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
        mas.c();
        dsx dsxVar = new dsx(context2, "gearhead_alerts");
        Notification notification = dsxVar.y;
        notification.defaults = -1;
        notification.flags |= 1;
        dsxVar.n(2131233012);
        Drawable drawable = context2.getResources().getDrawable(2131233012);
        dsxVar.k(kfl.b(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        dsxVar.i(context2.getResources().getString(R.string.notification_aa_connected_title));
        dsxVar.h(context2.getResources().getString(R.string.notification_aa_connected_body));
        dsxVar.i = 2;
        mas.c();
        notificationManager.notify("gearhead_alerts", 87859647, dsxVar.a());
        ebf.j().o(yzz.LOCK_SCREEN, yzy.js);
        this.h.postDelayed(this.g, 7000L);
    }
}

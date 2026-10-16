package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class maz extends lxr implements lhg {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.AlarmNotifHandler");
    private final AtomicInteger c;
    private final Map d;
    private final Context e;
    private final ygr f;

    public maz(Context context) {
        super(null);
        this.c = new AtomicInteger();
        this.d = new ConcurrentHashMap();
        this.e = context;
        this.f = tgx.c(new lyd(9), acxa.J());
    }

    @Override // defpackage.lxr
    public final void a() {
        ((ype) ((ype) b.f()).ai((char) 4666)).u("onListenerConnected");
    }

    @Override // defpackage.lxr
    public final void b(StatusBarNotification statusBarNotification) {
        nul nulVar;
        nul nulVar2;
        nul nulVar3;
        ygr ygrVar = this.f;
        String packageName = statusBarNotification.getPackageName();
        if (ygrVar.contains(packageName)) {
            yph yphVar = b;
            ((ype) ((ype) yphVar.f()).ai(4667)).M("onNotificationPosted: package=%s, category=%s", packageName, statusBarNotification.getNotification().category);
            Notification notification = statusBarNotification.getNotification();
            String str = notification.category;
            if (!Objects.equals("alarm", str)) {
                ((ype) ((ype) yphVar.f()).ai((char) 4668)).y("Ignored notification from clock app because category is not ALARM: %s", str);
                return;
            }
            ((ype) ((ype) yphVar.f()).ai((char) 4669)).y("Detected alarm notification from %s", packageName);
            String key = statusBarNotification.getKey();
            Map map = this.d;
            Integer numValueOf = (Integer) map.get(key);
            ((ype) ((ype) yphVar.f()).ai(4670)).M("Existing notificationId for key %s: %s", key, numValueOf);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.c.getAndIncrement() + 9502884);
                map.put(key, numValueOf);
                ((ype) ((ype) yphVar.f()).ai((char) 4671)).y("Generated new notificationId: %d", numValueOf);
            }
            int iIntValue = numValueOf.intValue();
            Handler handler = new Handler(Looper.getMainLooper());
            ((ype) ((ype) yphVar.f()).ai((char) 4673)).w("Posting dismissal notification with ID: %d", iIntValue);
            Notification.Action[] actionArr = notification.actions;
            nul nulVar4 = null;
            if (actionArr != null) {
                int length = actionArr.length;
                if (length > 0) {
                    aaew aaewVar = new aaew(null);
                    aaewVar.d = actionArr[0].title != null ? actionArr[0].title.toString() : "";
                    aaewVar.b = actionArr[0].actionIntent;
                    nulVar3 = new nul(aaewVar);
                } else {
                    nulVar3 = null;
                }
                if (length > 1) {
                    aaew aaewVar2 = new aaew(null);
                    aaewVar2.d = actionArr[1].title != null ? actionArr[1].title.toString() : "";
                    aaewVar2.b = actionArr[1].actionIntent;
                    nulVar2 = new nul(aaewVar2);
                } else {
                    nulVar2 = null;
                }
                if (length > 2) {
                    aaew aaewVar3 = new aaew(null);
                    aaewVar3.d = actionArr[2].title != null ? actionArr[2].title.toString() : "";
                    aaewVar3.b = actionArr[2].actionIntent;
                    nulVar4 = new nul(aaewVar3);
                }
                nulVar = nulVar4;
                nulVar4 = nulVar3;
            } else {
                nulVar = null;
                nulVar2 = null;
            }
            num numVar = new num();
            Context context = this.e;
            numVar.d = GhIcon.p(context, R.drawable.gs_alarm_wght500fill1rond100_vd_theme_24);
            numVar.k = true;
            numVar.f = context.getPackageName();
            numVar.m = context.getString(R.string.alarm_notification_title);
            numVar.p = nulVar4;
            numVar.q = nulVar2;
            numVar.r = nulVar;
            numVar.x = nuo.a;
            numVar.a = nup.HIGH;
            handler.postDelayed(new hhx(iIntValue, numVar.b(), 12), 0L);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) ((ype) b.f()).ai((char) 4674)).u("Starting AlarmNotificationHandler");
        mbs.a().f(this);
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) ((ype) b.f()).ai((char) 4675)).u("Stopping AlarmNotificationHandler");
        mbs.a().g(this);
    }

    @Override // defpackage.lxr
    public final void k(StatusBarNotification statusBarNotification) {
        ygr ygrVar = this.f;
        String packageName = statusBarNotification.getPackageName();
        if (ygrVar.contains(packageName) && Objects.equals("alarm", statusBarNotification.getNotification().category)) {
            ((ype) ((ype) b.f()).ai((char) 4672)).y("Alarm notification removed for %s", packageName);
            if (((Integer) this.d.remove(statusBarNotification.getKey())) != null) {
                nuj.b().g("AlarmNotificationHandler", r5.intValue(), this.e.getPackageName());
            }
        }
    }
}

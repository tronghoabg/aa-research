package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jyr extends mdd {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H.Not");
    private final ygr c;

    public jyr(ygr ygrVar) {
        this.c = ygrVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("TemplateBroadcastReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) throws PendingIntent.CanceledException {
        Object next;
        String stringExtra = intent.getStringExtra("TemplateAppPackageName");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("TemplateAppPendingIntent");
        int intExtra = intent.getIntExtra("TemplateAppActionType", 0);
        if (stringExtra == null) {
            ((ype) ((ype) b.h()).ai((char) 2851)).y("Broadcast received, missing the package name %s", intent);
            return;
        }
        kad.g(yzy.rR, stringExtra);
        jys jysVar = new jys(stringExtra);
        ygr ygrVar = this.c;
        jud judVar = new jud(stringExtra, 2);
        Iterator<E> it = ygrVar.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (judVar.a(next)) {
                    break;
                }
            }
        }
        ComponentName componentName = (ComponentName) next;
        yph yphVar = b;
        ((ype) yphVar.l().ai(2843)).K("Handling NotificationAction for package %s; action %s", componentName, intExtra);
        if (intExtra == 1) {
            if (pendingIntent == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 2847)).u("Custom action does not have a pending intent, will no-op");
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY", jysVar);
            try {
                pendingIntent.send(context, 0, new Intent().putExtras(bundle));
                ((ype) yphVar.l().ai(2845)).u("Fired 3p app PendingIntent for NotificationAction");
                return;
            } catch (PendingIntent.CanceledException e) {
                ((ype) ((ype) ((ype) b.f()).p(e)).ai((char) 2846)).y("Failed to send pending intent %s", pendingIntent);
                return;
            }
        }
        if (intExtra == 2) {
            if (componentName == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 2848)).u("Notification is not from a car app, will no-op");
                return;
            } else {
                jysVar.startCarApp(new Intent().setComponent(componentName));
                return;
            }
        }
        if (intExtra != 3) {
            ((ype) ((ype) yphVar.h()).ai((char) 2844)).u("Unknown action type, will no-op");
            return;
        }
        if (componentName == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 2850)).u("Notification is not from a car app, will no-op");
            return;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        IBinder binder = extras.getBinder("TemplateAppPendingAlertBinder");
        binder.getClass();
        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.apps.auto.components.apphost.notification.IAlertToNotificationEvent");
        try {
            (iInterfaceQueryLocalInterface instanceof jyp ? (jyp) iInterfaceQueryLocalInterface : new jyn(binder)).e();
        } catch (RemoteException e2) {
            ((ype) ((ype) b.l().p(e2)).ai(2849)).y("ActionType.ALERT_ACTION %s could not be triggered", intent);
        }
    }
}

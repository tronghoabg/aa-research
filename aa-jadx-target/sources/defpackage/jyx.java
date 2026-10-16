package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jyx extends defpackage.mdl {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Not");
    private final defpackage.yhx c;

    public jyx(defpackage.yhx yhxVar) {
        this.c = yhxVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("TemplateBroadcastReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        java.lang.Object next;
        java.lang.String stringExtra = intent.getStringExtra("TemplateAppPackageName");
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("TemplateAppPendingIntent");
        int intExtra = intent.getIntExtra("TemplateAppActionType", 0);
        if (stringExtra == null) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2854)).y("Broadcast received, missing the package name %s", intent);
            return;
        }
        defpackage.kag.g(defpackage.zbd.rT, stringExtra);
        android.os.IBinder jyyVar = new jyy(stringExtra);
        defpackage.yhx yhxVar = this.c;
        defpackage.juh juhVar = new defpackage.juh(stringExtra, 2);
        java.util.Iterator<E> it = yhxVar.iterator();
        it.getClass();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!juhVar.a(next));
        android.content.ComponentName componentName = (android.content.ComponentName) next;
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(2846)).K("Handling NotificationAction for package %s; action %s", componentName, intExtra);
        if (intExtra == 1) {
            if (pendingIntent == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2850)).u("Custom action does not have a pending intent, will no-op");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY", jyyVar);
            try {
                pendingIntent.send(context, 0, new android.content.Intent().putExtras(bundle));
                ((defpackage.yqj) yqmVar.l().ai(2848)).u("Fired 3p app PendingIntent for NotificationAction");
                return;
            } catch (android.app.PendingIntent.CanceledException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).p(e)).ai((char) 2849)).y("Failed to send pending intent %s", pendingIntent);
                return;
            }
        }
        if (intExtra == 2) {
            if (componentName == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2851)).u("Notification is not from a car app, will no-op");
                return;
            } else {
                jyyVar.startCarApp(new android.content.Intent().setComponent(componentName));
                return;
            }
        }
        if (intExtra != 3) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2847)).u("Unknown action type, will no-op");
            return;
        }
        if (componentName == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2853)).u("Notification is not from a car app, will no-op");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        extras.getClass();
        android.os.IBinder binder = extras.getBinder("TemplateAppPendingAlertBinder");
        binder.getClass();
        jyv jyvVarQueryLocalInterface = binder.queryLocalInterface("com.google.android.apps.auto.components.apphost.notification.IAlertToNotificationEvent");
        try {
            (jyvVarQueryLocalInterface instanceof jyv ? jyvVarQueryLocalInterface : new jyt(binder)).e();
        } catch (android.os.RemoteException e2) {
            ((defpackage.yqj) ((defpackage.yqj) b.l().p(e2)).ai(2852)).y("ActionType.ALERT_ACTION %s could not be triggered", intent);
        }
    }
}

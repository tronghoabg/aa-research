package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbg extends defpackage.lxy implements defpackage.lhn {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.AlarmNotifHandler");
    private final java.util.concurrent.atomic.AtomicInteger c;
    private final java.util.Map d;
    private final android.content.Context e;
    private final defpackage.yhx f;

    public mbg(android.content.Context context) {
        super(null);
        this.c = new java.util.concurrent.atomic.AtomicInteger();
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.e = context;
        this.f = defpackage.tht.c(new defpackage.lvg(10), defpackage.acyc.K());
    }

    @Override // defpackage.lxy
    public final void a() {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4669)).u("onListenerConnected");
    }

    @Override // defpackage.lxy
    public final void b(android.service.notification.StatusBarNotification statusBarNotification) {
        nvb nvbVar;
        nvb nvbVar2;
        nvb nvbVar3;
        defpackage.yhx yhxVar = this.f;
        java.lang.String packageName = statusBarNotification.getPackageName();
        if (yhxVar.contains(packageName)) {
            defpackage.yqm yqmVar = b;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(4670)).M("onNotificationPosted: package=%s, category=%s", packageName, statusBarNotification.getNotification().category);
            android.app.Notification notification = statusBarNotification.getNotification();
            java.lang.String str = notification.category;
            if (!j$.util.Objects.equals("alarm", str)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4671)).y("Ignored notification from clock app because category is not ALARM: %s", str);
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4672)).y("Detected alarm notification from %s", packageName);
            java.lang.String key = statusBarNotification.getKey();
            java.util.Map map = this.d;
            java.lang.Integer numValueOf = (java.lang.Integer) map.get(key);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(4673)).M("Existing notificationId for key %s: %s", key, numValueOf);
            if (numValueOf == null) {
                numValueOf = java.lang.Integer.valueOf(this.c.getAndIncrement() + 9502884);
                map.put(key, numValueOf);
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4674)).y("Generated new notificationId: %d", numValueOf);
            }
            int iIntValue = numValueOf.intValue();
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4676)).w("Posting dismissal notification with ID: %d", iIntValue);
            android.app.Notification.Action[] actionArr = notification.actions;
            nvb nvbVar4 = null;
            if (actionArr != null) {
                int length = actionArr.length;
                if (length > 0) {
                    aafz aafzVar = new aafz((byte[]) null);
                    aafzVar.d = actionArr[0].title != null ? actionArr[0].title.toString() : "";
                    aafzVar.b = actionArr[0].actionIntent;
                    nvbVar3 = new nvb(aafzVar);
                } else {
                    nvbVar3 = null;
                }
                if (length > 1) {
                    aafz aafzVar2 = new aafz((byte[]) null);
                    aafzVar2.d = actionArr[1].title != null ? actionArr[1].title.toString() : "";
                    aafzVar2.b = actionArr[1].actionIntent;
                    nvbVar2 = new nvb(aafzVar2);
                } else {
                    nvbVar2 = null;
                }
                if (length > 2) {
                    aafz aafzVar3 = new aafz((byte[]) null);
                    aafzVar3.d = actionArr[2].title != null ? actionArr[2].title.toString() : "";
                    aafzVar3.b = actionArr[2].actionIntent;
                    nvbVar4 = new nvb(aafzVar3);
                }
                nvbVar = nvbVar4;
                nvbVar4 = nvbVar3;
            } else {
                nvbVar = null;
                nvbVar2 = null;
            }
            nvc nvcVar = new nvc();
            android.content.Context context = this.e;
            nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131231570);
            nvcVar.k = true;
            nvcVar.f = context.getPackageName();
            nvcVar.m = context.getString(2132083092);
            nvcVar.p = nvbVar4;
            nvcVar.q = nvbVar2;
            nvcVar.r = nvbVar;
            nvcVar.x = defpackage.nve.a;
            nvcVar.a = nvf.d;
            handler.postDelayed(new defpackage.hif(iIntValue, nvcVar.b(), 13), 0L);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4678)).u("Stopping AlarmNotificationHandler");
        defpackage.mca.a().g(this);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4677)).u("Starting AlarmNotificationHandler");
        defpackage.mca.a().f(this);
    }

    @Override // defpackage.lxy
    public final void k(android.service.notification.StatusBarNotification statusBarNotification) {
        defpackage.yhx yhxVar = this.f;
        java.lang.String packageName = statusBarNotification.getPackageName();
        if (yhxVar.contains(packageName) && j$.util.Objects.equals("alarm", statusBarNotification.getNotification().category)) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4675)).y("Alarm notification removed for %s", packageName);
            java.lang.Integer num = (java.lang.Integer) this.d.remove(statusBarNotification.getKey());
            if (num != null) {
                defpackage.nuz.b().g("AlarmNotificationHandler", num.intValue(), this.e.getPackageName());
            }
        }
    }
}

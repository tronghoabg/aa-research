package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mod extends defpackage.mck {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.SDKNotifConverter");

    private static final mof b(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return new moc(intent);
    }

    @Override // defpackage.mnz
    public final /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        int i;
        boolean z;
        int i2;
        java.lang.Long l;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        android.graphics.Bitmap bitmap;
        android.content.Intent intent;
        moi moiVar;
        android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
        android.app.Notification notification = statusBarNotification.getNotification();
        android.app.Notification notification2 = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification2.extras == null ? null : notification2.extras.getBundle("android.car.EXTENSIONS");
        int i3 = 0;
        if (bundle != null) {
            bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z = bundle.getInt("type", 0) == 1;
            l = (java.lang.Long) bundle.getSerializable("content_id");
            charSequence = bundle.getCharSequence("android.title");
            charSequence2 = bundle.getCharSequence("subtitle");
            charSequence3 = bundle.getCharSequence("android.text");
            bitmap = (android.graphics.Bitmap) bundle.getParcelable("thumbnail");
            i2 = bundle.getInt("action_icon");
            intent = (android.content.Intent) bundle.getParcelable("content_intent");
            int i4 = bundle.getInt("app_color", 0);
            i3 = bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            bundle.getBoolean("heads_up_visibility");
            i = i4;
        } else {
            i = 0;
            z = false;
            i2 = 0;
            l = null;
            charSequence = null;
            charSequence2 = null;
            charSequence3 = null;
            bitmap = null;
            intent = null;
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            charSequence = notification.extras.getCharSequence("android.title");
        }
        if (android.text.TextUtils.isEmpty(charSequence3)) {
            charSequence3 = notification.extras.getCharSequence("android.text");
        }
        if (bitmap == null) {
            android.os.Parcelable parcelable = notification.extras.getParcelable("android.largeIcon");
            if (parcelable instanceof android.graphics.Bitmap) {
                bitmap = (android.graphics.Bitmap) parcelable;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5112)).u("No thumbnail and EXTRA_LARGE_ICON is not a bitmap");
            }
        }
        if (i == 0) {
            i = notification.color;
        }
        if (i3 == 0) {
            i3 = i;
        }
        if (intent != null) {
            intent.putExtra("android.intent.extra.PACKAGE_NAME", statusBarNotification.getPackageName());
        }
        if (z) {
            moh mohVar = new moh((byte[]) null);
            mohVar.h = n(statusBarNotification);
            mohVar.j = defpackage.zaw.NAV_NOTIFICATION_HERO;
            mohVar.i = statusBarNotification.getPackageName();
            mohVar.m = statusBarNotification.getPostTime();
            mohVar.s = charSequence;
            mohVar.t = charSequence2;
            mohVar.u = charSequence3;
            mohVar.v = i2;
            mohVar.y = notification.icon;
            mohVar.d(bitmap);
            mohVar.C = b(intent);
            mohVar.w = i;
            mohVar.x = i3;
            moiVar = new moi(mohVar);
        } else {
            moh mohVar2 = new moh();
            mohVar2.h = n(statusBarNotification);
            mohVar2.j = defpackage.zaw.SDK_NOTIFICATION;
            mohVar2.i = statusBarNotification.getPackageName();
            mohVar2.m = statusBarNotification.getPostTime();
            mohVar2.r = moe.c;
            mohVar2.s = charSequence;
            if (true == android.text.TextUtils.isEmpty(charSequence2)) {
                charSequence2 = charSequence3;
            }
            mohVar2.t = charSequence2;
            mohVar2.v = i2;
            mohVar2.y = notification.icon;
            mohVar2.d(bitmap);
            mohVar2.w = i;
            mohVar2.x = i3;
            mohVar2.B = defpackage.lxy.l().a(statusBarNotification);
            mohVar2.C = b(intent);
            moiVar = new moi(mohVar2);
        }
        moiVar.p = l;
        return moiVar;
    }

    @Override // defpackage.mck
    public final boolean i(android.content.Context context, android.service.notification.StatusBarNotification statusBarNotification) {
        boolean z;
        boolean z2;
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z2 = bundle.getInt("type", 0) == 1;
            bundle.getCharSequence("android.title");
            bundle.getCharSequence("subtitle");
            bundle.getCharSequence("android.text");
            bundle.getInt("action_icon");
            bundle.getInt("app_color", 0);
            bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            bundle.getBoolean("heads_up_visibility");
        } else {
            z = false;
            z2 = false;
        }
        if (z) {
            return !z2 || (defpackage.luq.a().i() && defpackage.luq.a().e().a().getPackageName().equals(statusBarNotification.getPackageName()));
        }
        return false;
    }

    @Override // defpackage.mck
    public final boolean k(android.service.notification.StatusBarNotification statusBarNotification) {
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return false;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
        bundle.getInt("type", 0);
        bundle.getCharSequence("android.title");
        bundle.getCharSequence("subtitle");
        bundle.getCharSequence("android.text");
        bundle.getInt("action_icon");
        bundle.getInt("app_color", 0);
        bundle.getInt("app_night_color", 0);
        bundle.getBoolean("stream_visibility", true);
        return bundle.getBoolean("heads_up_visibility");
    }

    @Override // defpackage.mck
    public final boolean l(android.service.notification.StatusBarNotification statusBarNotification) {
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return true;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
        bundle.getInt("type", 0);
        bundle.getCharSequence("android.title");
        bundle.getCharSequence("subtitle");
        bundle.getCharSequence("android.text");
        bundle.getInt("action_icon");
        bundle.getInt("app_color", 0);
        bundle.getInt("app_night_color", 0);
        boolean z = bundle.getBoolean("stream_visibility", true);
        bundle.getBoolean("heads_up_visibility");
        return z;
    }
}

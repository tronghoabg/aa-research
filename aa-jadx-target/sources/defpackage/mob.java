package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mob extends defpackage.mck {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NavigationConverter");

    @Override // defpackage.mnz
    public final /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        android.os.Bundle bundle;
        java.lang.Long l;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        android.graphics.Bitmap bitmap;
        int i;
        android.content.Intent intent;
        android.app.PendingIntent pendingIntent;
        boolean z;
        int i2;
        android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle2 = statusBarNotification.getNotification().extras;
        int i3 = 0;
        if (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null) {
            i2 = 0;
            z = false;
            i = 0;
            l = null;
            charSequence = null;
            charSequence2 = null;
            bitmap = null;
            intent = null;
            pendingIntent = null;
        } else {
            bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
            l = (java.lang.Long) bundle.getSerializable("content_id");
            bundle.getInt("type", 1);
            charSequence = bundle.getCharSequence("android.title");
            bundle.getCharSequence("android.title.night");
            charSequence2 = bundle.getCharSequence("android.text");
            bundle.getCharSequence("android.text.night");
            bundle.getCharSequence("sub_text");
            bundle.getCharSequence("sub_text.night");
            bitmap = (android.graphics.Bitmap) bundle.getParcelable("android.largeIcon");
            i = bundle.getInt("action_icon");
            bundle.getInt("action_icon.night");
            intent = (android.content.Intent) bundle.getParcelable("content_intent");
            pendingIntent = (android.app.PendingIntent) bundle.getParcelable("content_pending_intent");
            int i4 = bundle.getInt("app_color", 0);
            int i5 = bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            z = bundle.getBoolean("heads_up_visibility");
            bundle.getBoolean("ignore_in_stream");
            i2 = i5;
            i3 = i4;
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            charSequence = notification.extras.getCharSequence("android.title");
        }
        if (bitmap == null) {
            android.os.Parcelable parcelable = notification.extras.getParcelable("android.largeIcon");
            if (parcelable instanceof android.graphics.Bitmap) {
                bitmap = (android.graphics.Bitmap) parcelable;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5109)).u("No large icon in extension and EXTRA_LARGE_ICON is not a bitmap");
            }
        }
        if (i3 == 0) {
            i3 = notification.color;
        }
        moh mohVar = new moh((byte[]) null);
        int i6 = i3;
        mohVar.h = n(statusBarNotification);
        mohVar.j = defpackage.otn.K(statusBarNotification.getNotification()) != 0 ? defpackage.zaw.NAV_NOTIFICATION_NORMAL : defpackage.zaw.NAV_NOTIFICATION_HERO;
        mohVar.i = statusBarNotification.getPackageName();
        mohVar.m = statusBarNotification.getPostTime();
        mohVar.s = charSequence;
        mohVar.t = charSequence2;
        mohVar.v = i;
        mohVar.y = notification.icon;
        mohVar.d(bitmap);
        mohVar.w = i6;
        mohVar.x = i2;
        mohVar.B = defpackage.lxy.l().a(statusBarNotification);
        mohVar.C = (intent == null && pendingIntent == null) ? null : new moa(intent, pendingIntent);
        mohVar.o = z;
        moi moiVar = new moi(mohVar);
        moiVar.p = l;
        return moiVar;
    }

    @Override // defpackage.mck
    public final boolean i(android.content.Context context, android.service.notification.StatusBarNotification statusBarNotification) {
        android.os.Bundle bundle;
        if (!defpackage.slj.a(context).b(statusBarNotification.getPackageName())) {
            ((defpackage.yqj) ((defpackage.yqj) b.l().l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(5108)).u("not Google signed");
            return false;
        }
        if (!defpackage.luq.a().i()) {
            ((defpackage.yqj) ((defpackage.yqj) b.l().l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(5107)).u("not connected to a nav provider");
            return false;
        }
        if (!defpackage.luq.a().e().a().getPackageName().equals(statusBarNotification.getPackageName())) {
            ((defpackage.yqj) ((defpackage.yqj) b.l().l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(5106)).u("package mismatch");
            return false;
        }
        android.os.Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 != null && (bundle = bundle2.getBundle("android.car.EXTENSIONS")) != null) {
            boolean z = bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
            bundle.getInt("type", 1);
            bundle.getCharSequence("android.title");
            bundle.getCharSequence("android.title.night");
            bundle.getCharSequence("android.text");
            bundle.getCharSequence("android.text.night");
            bundle.getCharSequence("sub_text");
            bundle.getCharSequence("sub_text.night");
            bundle.getInt("action_icon");
            bundle.getInt("action_icon.night");
            bundle.getInt("app_color", 0);
            bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            bundle.getBoolean("heads_up_visibility");
            bundle.getBoolean("ignore_in_stream");
            if (z) {
                java.util.concurrent.TimeUnit.MINUTES.getClass();
                return true;
            }
        }
        java.util.concurrent.TimeUnit.MINUTES.getClass();
        return false;
    }

    @Override // defpackage.mck
    public final boolean k(android.service.notification.StatusBarNotification statusBarNotification) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null) {
            return false;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
        bundle.getInt("type", 1);
        bundle.getCharSequence("android.title");
        bundle.getCharSequence("android.title.night");
        bundle.getCharSequence("android.text");
        bundle.getCharSequence("android.text.night");
        bundle.getCharSequence("sub_text");
        bundle.getCharSequence("sub_text.night");
        bundle.getInt("action_icon");
        bundle.getInt("action_icon.night");
        bundle.getInt("app_color", 0);
        bundle.getInt("app_night_color", 0);
        bundle.getBoolean("stream_visibility", true);
        boolean z = bundle.getBoolean("heads_up_visibility");
        bundle.getBoolean("ignore_in_stream");
        return z;
    }

    @Override // defpackage.mck
    public final boolean l(android.service.notification.StatusBarNotification statusBarNotification) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null) {
            return true;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
        bundle.getInt("type", 1);
        bundle.getCharSequence("android.title");
        bundle.getCharSequence("android.title.night");
        bundle.getCharSequence("android.text");
        bundle.getCharSequence("android.text.night");
        bundle.getCharSequence("sub_text");
        bundle.getCharSequence("sub_text.night");
        bundle.getInt("action_icon");
        bundle.getInt("action_icon.night");
        bundle.getInt("app_color", 0);
        bundle.getInt("app_night_color", 0);
        boolean z = bundle.getBoolean("stream_visibility", true);
        bundle.getBoolean("heads_up_visibility");
        bundle.getBoolean("ignore_in_stream");
        return z;
    }
}

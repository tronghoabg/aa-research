package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mnv extends mcc {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.NavigationConverter");

    @Override // defpackage.mnt
    public final /* synthetic */ moa a(Context context, Object obj) {
        Bundle bundle;
        Long l;
        CharSequence charSequence;
        CharSequence charSequence2;
        Bitmap bitmap;
        int i;
        Intent intent;
        PendingIntent pendingIntent;
        boolean z;
        int i2;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle2 = statusBarNotification.getNotification().extras;
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
            l = (Long) bundle.getSerializable("content_id");
            bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 1);
            charSequence = bundle.getCharSequence("android.title");
            bundle.getCharSequence("android.title.night");
            charSequence2 = bundle.getCharSequence("android.text");
            bundle.getCharSequence("android.text.night");
            bundle.getCharSequence("sub_text");
            bundle.getCharSequence("sub_text.night");
            bitmap = (Bitmap) bundle.getParcelable("android.largeIcon");
            i = bundle.getInt("action_icon");
            bundle.getInt("action_icon.night");
            intent = (Intent) bundle.getParcelable("content_intent");
            pendingIntent = (PendingIntent) bundle.getParcelable("content_pending_intent");
            int i4 = bundle.getInt("app_color", 0);
            int i5 = bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            z = bundle.getBoolean("heads_up_visibility");
            bundle.getBoolean("ignore_in_stream");
            i2 = i5;
            i3 = i4;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = notification.extras.getCharSequence("android.title");
        }
        if (bitmap == null) {
            Parcelable parcelable = notification.extras.getParcelable("android.largeIcon");
            if (parcelable instanceof Bitmap) {
                bitmap = (Bitmap) parcelable;
            } else {
                ((ype) ((ype) b.h()).ai((char) 5107)).u("No large icon in extension and EXTRA_LARGE_ICON is not a bitmap");
            }
        }
        if (i3 == 0) {
            i3 = notification.color;
        }
        mob mobVar = new mob(null);
        int i6 = i3;
        mobVar.h = n(statusBarNotification);
        mobVar.j = osq.Q(statusBarNotification.getNotification()) != 0 ? yzr.NAV_NOTIFICATION_NORMAL : yzr.NAV_NOTIFICATION_HERO;
        mobVar.i = statusBarNotification.getPackageName();
        mobVar.m = statusBarNotification.getPostTime();
        mobVar.s = charSequence;
        mobVar.t = charSequence2;
        mobVar.v = i;
        mobVar.y = notification.icon;
        mobVar.d(bitmap);
        mobVar.w = i6;
        mobVar.x = i2;
        mobVar.B = lxr.l().a(statusBarNotification);
        mobVar.C = (intent == null && pendingIntent == null) ? null : new mnu(intent, pendingIntent);
        mobVar.o = z;
        moc mocVar = new moc(mobVar);
        mocVar.p = l;
        return mocVar;
    }

    @Override // defpackage.mcc
    public final boolean i(Context context, StatusBarNotification statusBarNotification) {
        Bundle bundle;
        if (!skn.a(context).b(statusBarNotification.getPackageName())) {
            ((ype) ((ype) b.l().l(1, TimeUnit.MINUTES)).ai(5106)).u("not Google signed");
            return false;
        }
        if (!luk.a().i()) {
            ((ype) ((ype) b.l().l(1, TimeUnit.MINUTES)).ai(5105)).u("not connected to a nav provider");
            return false;
        }
        if (!luk.a().e().a().getPackageName().equals(statusBarNotification.getPackageName())) {
            ((ype) ((ype) b.l().l(1, TimeUnit.MINUTES)).ai(5104)).u("package mismatch");
            return false;
        }
        Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 != null && (bundle = bundle2.getBundle("android.car.EXTENSIONS")) != null) {
            boolean z = bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
            bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 1);
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
                TimeUnit.MINUTES.getClass();
                return true;
            }
        }
        TimeUnit.MINUTES.getClass();
        return false;
    }

    @Override // defpackage.mcc
    public final boolean k(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null) {
            return false;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
        bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 1);
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

    @Override // defpackage.mcc
    public final boolean l(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        Bundle bundle2 = statusBarNotification.getNotification().extras;
        if (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null) {
            return true;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED");
        bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 1);
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

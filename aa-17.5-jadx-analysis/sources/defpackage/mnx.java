package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes.dex */
public final class mnx extends mcc {
    private static final yph a = yph.c("GH.SDKNotifConverter");

    private static final mnz b(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new mnw(intent);
    }

    @Override // defpackage.mnt
    public final /* synthetic */ moa a(Context context, Object obj) {
        int i;
        boolean z;
        int i2;
        Long l;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Bitmap bitmap;
        Intent intent;
        moc mocVar;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        Notification notification = statusBarNotification.getNotification();
        Notification notification2 = statusBarNotification.getNotification();
        Bundle bundle = notification2.extras == null ? null : notification2.extras.getBundle("android.car.EXTENSIONS");
        int i3 = 0;
        if (bundle != null) {
            bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0) == 1;
            l = (Long) bundle.getSerializable("content_id");
            charSequence = bundle.getCharSequence("android.title");
            charSequence2 = bundle.getCharSequence("subtitle");
            charSequence3 = bundle.getCharSequence("android.text");
            bitmap = (Bitmap) bundle.getParcelable("thumbnail");
            i2 = bundle.getInt("action_icon");
            intent = (Intent) bundle.getParcelable("content_intent");
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
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = notification.extras.getCharSequence("android.title");
        }
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence3 = notification.extras.getCharSequence("android.text");
        }
        if (bitmap == null) {
            Parcelable parcelable = notification.extras.getParcelable("android.largeIcon");
            if (parcelable instanceof Bitmap) {
                bitmap = (Bitmap) parcelable;
            } else {
                ((ype) ((ype) a.h()).ai((char) 5110)).u("No thumbnail and EXTRA_LARGE_ICON is not a bitmap");
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
            mob mobVar = new mob(null);
            mobVar.h = n(statusBarNotification);
            mobVar.j = yzr.NAV_NOTIFICATION_HERO;
            mobVar.i = statusBarNotification.getPackageName();
            mobVar.m = statusBarNotification.getPostTime();
            mobVar.s = charSequence;
            mobVar.t = charSequence2;
            mobVar.u = charSequence3;
            mobVar.v = i2;
            mobVar.y = notification.icon;
            mobVar.d(bitmap);
            mobVar.C = b(intent);
            mobVar.w = i;
            mobVar.x = i3;
            mocVar = new moc(mobVar);
        } else {
            mob mobVar2 = new mob();
            mobVar2.h = n(statusBarNotification);
            mobVar2.j = yzr.SDK_NOTIFICATION;
            mobVar2.i = statusBarNotification.getPackageName();
            mobVar2.m = statusBarNotification.getPostTime();
            mobVar2.r = mny.c;
            mobVar2.s = charSequence;
            if (true == TextUtils.isEmpty(charSequence2)) {
                charSequence2 = charSequence3;
            }
            mobVar2.t = charSequence2;
            mobVar2.v = i2;
            mobVar2.y = notification.icon;
            mobVar2.d(bitmap);
            mobVar2.w = i;
            mobVar2.x = i3;
            mobVar2.B = lxr.l().a(statusBarNotification);
            mobVar2.C = b(intent);
            mocVar = new moc(mobVar2);
        }
        mocVar.p = l;
        return mocVar;
    }

    @Override // defpackage.mcc
    public final boolean i(Context context, StatusBarNotification statusBarNotification) {
        boolean z;
        boolean z2;
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z2 = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0) == 1;
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
            return !z2 || (luk.a().i() && luk.a().e().a().getPackageName().equals(statusBarNotification.getPackageName()));
        }
        return false;
    }

    @Override // defpackage.mcc
    public final boolean k(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return false;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
        bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0);
        bundle.getCharSequence("android.title");
        bundle.getCharSequence("subtitle");
        bundle.getCharSequence("android.text");
        bundle.getInt("action_icon");
        bundle.getInt("app_color", 0);
        bundle.getInt("app_night_color", 0);
        bundle.getBoolean("stream_visibility", true);
        return bundle.getBoolean("heads_up_visibility");
    }

    @Override // defpackage.mcc
    public final boolean l(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return true;
        }
        bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
        bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0);
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

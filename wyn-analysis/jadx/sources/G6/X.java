package G6;

import D6.C0395s;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmq;
import com.google.android.gms.internal.ads.zzekz;

/* loaded from: classes3.dex */
public class X extends W {
    @Override // G6.b0
    public final zzbic.zzq a(Context context, TelephonyManager telephonyManager) {
        U u10 = C6.n.f1857D.f1863c;
        return U.c(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? zzbic.zzq.ENUM_TRUE : zzbic.zzq.ENUM_FALSE : zzbic.zzq.ENUM_FALSE;
    }

    @Override // G6.b0
    public final void b(Context context) {
        org.apache.tika.utils.a.C();
        NotificationChannel notificationChannelC = A0.h.c(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzjS)).intValue());
        notificationChannelC.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelC);
    }

    @Override // G6.b0
    public final boolean c(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // G6.b0
    public final Intent d(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // G6.V
    public final zzclm i(zzclx zzclxVar, zzbhw zzbhwVar, boolean z2, zzekz zzekzVar) {
        return new zzcmq(zzclxVar, zzbhwVar, z2, zzekzVar);
    }
}

package G6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public abstract class b0 {
    public zzbic.zzq a(Context context, TelephonyManager telephonyManager) {
        return zzbic.zzq.ENUM_UNKNOWN;
    }

    public boolean c(Context context) {
        return false;
    }

    public Intent d(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int f(AudioManager audioManager) {
        return 0;
    }

    public int g(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void b(Context context) {
    }

    public void e(Activity activity) {
    }
}

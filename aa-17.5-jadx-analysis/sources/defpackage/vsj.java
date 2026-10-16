package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class vsj {
    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
    }

    public vsj(Context context) throws Throwable {
        vqs.a();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}

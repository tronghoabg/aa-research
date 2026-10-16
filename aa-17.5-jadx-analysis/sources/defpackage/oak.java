package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class oak extends eqj {
    private final oaj a = new oaj(this, new Handler(Looper.getMainLooper()));

    public static final boolean a() {
        ContentResolver contentResolver = mki.a.c.getContentResolver();
        int i = Settings.System.getInt(contentResolver, "status_bar_show_battery_percent", -1);
        return !(i == -1 && (i = Settings.System.getInt(contentResolver, "display_battery_percentage", -1)) == -1) && i == 1;
    }

    @Override // defpackage.eqj
    protected final void c() {
        Context context = mki.a.c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriFor = Settings.System.getUriFor("status_bar_show_battery_percent");
        oaj oajVar = this.a;
        contentResolver.registerContentObserver(uriFor, false, oajVar);
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor("display_battery_percentage"), false, oajVar);
        m(Boolean.valueOf(a()));
    }

    @Override // defpackage.eqj
    protected final void d() {
        mki.a.c.getContentResolver().unregisterContentObserver(this.a);
    }
}

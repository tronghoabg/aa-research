package T9;

import Y0.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import l9.C3445a;
import l9.InterfaceC3447c;
import s8.C4026b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11812a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f11813b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3447c f11814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11815d;

    public a(Context context, String str, InterfaceC3447c interfaceC3447c) {
        context = Build.VERSION.SDK_INT >= 24 ? e.createDeviceProtectedStorageContext(context) : context;
        this.f11812a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f11813b = sharedPreferences;
        this.f11814c = interfaceC3447c;
        this.f11815d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f11812a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z2) {
        if (this.f11815d != z2) {
            this.f11815d = z2;
            this.f11814c.a(new C3445a(new C4026b(z2, 0)));
        }
    }
}

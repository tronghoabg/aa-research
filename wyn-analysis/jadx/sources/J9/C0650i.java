package J9;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: J9.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0650i {

    /* renamed from: a, reason: collision with root package name */
    public Y f5936a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f5937b;

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        Y y10 = this.f5936a;
        s8.g gVar = y10.f5908a;
        gVar.a();
        if (((Application) gVar.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init")) {
            s8.g gVar2 = y10.f5908a;
            gVar2.a();
            SharedPreferences sharedPreferences = ((Application) gVar2.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return sharedPreferences.getBoolean("auto_init", true);
            }
            return true;
        }
        s8.g gVar3 = y10.f5908a;
        gVar3.a();
        Application application = (Application) gVar3.f45328a;
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                if (bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                    s8.g gVar4 = y10.f5908a;
                    gVar4.a();
                    Application application2 = (Application) gVar4.f45328a;
                    try {
                        PackageManager packageManager2 = application2.getPackageManager();
                        if (packageManager2 != null && (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), 128)) != null && (bundle2 = applicationInfo2.metaData) != null && bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                            return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return this.f5937b.get();
    }
}

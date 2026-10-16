package G6;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public String f4560a;

    /* renamed from: b, reason: collision with root package name */
    public String f4561b;

    public S(String str, String str2) {
        this.f4560a = str;
        this.f4561b = str2;
    }

    public S(S3.s sVar) throws Resources.NotFoundException, IOException {
        int iD = R8.g.d((Context) sVar.f11009b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) sVar.f11009b;
        if (iD != 0) {
            this.f4560a = "Unity";
            String string = context.getResources().getString(iD);
            this.f4561b = string;
            String strF = R8.v.f("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strF, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f4560a = "Flutter";
                this.f4561b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f4560a = null;
        this.f4561b = null;
    }
}

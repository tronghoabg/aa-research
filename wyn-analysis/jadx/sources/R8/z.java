package R8;

import D6.c1;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f10543g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f10544h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final c1 f10545a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10547c;

    /* renamed from: d, reason: collision with root package name */
    public final P9.d f10548d;

    /* renamed from: e, reason: collision with root package name */
    public final R0.e f10549e;

    /* renamed from: f, reason: collision with root package name */
    public c f10550f;

    public z(Context context, String str, P9.d dVar, R0.e eVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f10546b = context;
        this.f10547c = str;
        this.f10548d = dVar;
        this.f10549e = eVar;
        this.f10545a = new c1();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f10543g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final y b(boolean z2) {
        String str;
        String str2 = null;
        if (!((Boolean) new S8.d(0, S8.f.f11033d, S8.e.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        P9.d dVar = this.f10548d;
        if (z2) {
            try {
                str = ((P9.a) Tasks.await(((P9.c) dVar).e(), 10000L, TimeUnit.MILLISECONDS)).f9265a;
            } catch (Exception e7) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e7);
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((P9.c) dVar).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new y(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f10550f;
        if (cVar != null && (cVar.f10448b != null || !this.f10549e.f())) {
            return this.f10550f;
        }
        O8.c cVar2 = O8.c.f8921a;
        cVar2.f("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f10546b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.f("Cached Firebase Installation ID: " + string);
        if (this.f10549e.f()) {
            y yVarB = b(false);
            cVar2.f("Fetched Firebase Installation ID: " + yVarB.f10541a);
            if (yVarB.f10541a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                yVarB = new y(str, null);
            }
            if (Objects.equals(yVarB.f10541a, string)) {
                this.f10550f = new c(sharedPreferences.getString("crashlytics.installation.id", null), yVarB.f10541a, yVarB.f10542b);
            } else {
                this.f10550f = new c(a(sharedPreferences, yVarB.f10541a), yVarB.f10541a, yVarB.f10542b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f10550f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f10550f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar2.f("Install IDs: " + this.f10550f);
        return this.f10550f;
    }

    public final String d() {
        String str;
        c1 c1Var = this.f10545a;
        Context context = this.f10546b;
        synchronized (c1Var) {
            try {
                if (c1Var.f2412a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c1Var.f2412a = installerPackageName;
                }
                str = "".equals(c1Var.f2412a) ? null : c1Var.f2412a;
            } finally {
            }
        }
        return str;
    }
}

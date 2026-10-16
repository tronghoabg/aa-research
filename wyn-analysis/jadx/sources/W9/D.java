package W9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15299a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15300b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static G7.a f15301c;

    public static void a(Context context) {
        if (f15301c == null) {
            G7.a aVar = new G7.a(context);
            f15301c = aVar;
            synchronized (aVar.f4652a) {
                aVar.f4658g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f15300b) {
            try {
                if (f15301c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f15301c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, G g9, Intent intent) {
        synchronized (f15300b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f15301c.a(f15299a);
                }
                g9.b(intent).addOnCompleteListener(new S8.b(intent, 13));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f15300b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f15301c.a(f15299a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

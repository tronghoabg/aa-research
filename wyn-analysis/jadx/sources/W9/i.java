package W9;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import n7.AbstractC3598c;
import x.C4412e;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15341c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static G f15342d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15343a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15344b;

    public i(ExecutorService executorService) {
        this.f15344b = new C4412e(0);
        this.f15343a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z2) {
        G g9;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f15341c) {
            try {
                if (f15342d == null) {
                    f15342d = new G(context);
                }
                g9 = f15342d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            return g9.b(intent).continueWith(new T0(1), new V1.c(8));
        }
        if (u.f().h(context)) {
            D.c(context, g9, intent);
        } else {
            g9.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zH = AbstractC3598c.h();
        Context context = (Context) this.f15343a;
        boolean z2 = zH && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z2 && !z10) {
            return a(context, intent, z10);
        }
        T0 t02 = (T0) this.f15344b;
        return Tasks.call(t02, new B8.c(6, context, intent)).continueWithTask(t02, new h(z10, context, intent));
    }

    public i(Context context) {
        this.f15343a = context;
        this.f15344b = new T0(1);
    }
}

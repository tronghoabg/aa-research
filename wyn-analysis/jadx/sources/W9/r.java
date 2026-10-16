package W9;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.applovin.impl.C1638g0;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import ff.AbstractC2641B;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15367d;

    public /* synthetic */ r(Object obj, boolean z2, Object obj2, int i5) {
        this.f15364a = i5;
        this.f15366c = obj;
        this.f15365b = z2;
        this.f15367d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15364a) {
            case 0:
                Context context = (Context) this.f15366c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15367d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = AbstractC2641B.w(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f15365b) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            case 1:
                ((C1638g0) this.f15366c).a(this.f15365b, (Runnable) this.f15367d);
                return;
            case 2:
                t2.a(this.f15365b, (MaxAdRequestListener) this.f15366c, (String) this.f15367d);
                return;
            default:
                t2.a(this.f15365b, (MaxAdRevenueListener) this.f15366c, (MaxAd) this.f15367d);
                return;
        }
    }

    public /* synthetic */ r(boolean z2, Object obj, Object obj2, int i5) {
        this.f15364a = i5;
        this.f15365b = z2;
        this.f15366c = obj;
        this.f15367d = obj2;
    }
}

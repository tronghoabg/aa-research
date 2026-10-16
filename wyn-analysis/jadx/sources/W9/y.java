package W9;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f15406d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15407a;

    /* renamed from: b, reason: collision with root package name */
    public C8.i f15408b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15409c;

    public y(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f15409c = scheduledThreadPoolExecutor;
        this.f15407a = sharedPreferences;
    }

    public final synchronized x a() {
        x xVar;
        String strV = this.f15408b.v();
        Pattern pattern = x.f15402d;
        xVar = null;
        if (!TextUtils.isEmpty(strV)) {
            String[] strArrSplit = strV.split("!", -1);
            if (strArrSplit.length == 2) {
                xVar = new x(strArrSplit[0], strArrSplit[1]);
            }
        }
        return xVar;
    }

    public final synchronized void b() {
        this.f15408b = C8.i.l(this.f15407a, this.f15409c);
    }

    public final synchronized void c(x xVar) {
        this.f15408b.w(xVar.f15405c);
    }
}

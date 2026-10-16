package Y8;

import S3.s;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q5.C3866a;
import q5.EnumC3870e;
import t5.C4122q;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f16722a;

    /* renamed from: b, reason: collision with root package name */
    public final double f16723b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16724c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16726e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f16727f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f16728g;

    /* renamed from: h, reason: collision with root package name */
    public final C4122q f16729h;

    /* renamed from: i, reason: collision with root package name */
    public final s f16730i;

    /* renamed from: j, reason: collision with root package name */
    public int f16731j;
    public long k;

    public c(C4122q c4122q, Z8.a aVar, s sVar) {
        double d3 = aVar.f17035d;
        this.f16722a = d3;
        this.f16723b = aVar.f17036e;
        this.f16724c = aVar.f17037f * 1000;
        this.f16729h = c4122q;
        this.f16730i = sVar;
        this.f16725d = SystemClock.elapsedRealtime();
        int i5 = (int) d3;
        this.f16726e = i5;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i5);
        this.f16727f = arrayBlockingQueue;
        this.f16728g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16731j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.f16724c);
        int iMin = this.f16727f.size() == this.f16726e ? Math.min(100, this.f16731j + iCurrentTimeMillis) : Math.max(0, this.f16731j - iCurrentTimeMillis);
        if (this.f16731j != iMin) {
            this.f16731j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(R8.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f10445b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.f16729h.a(new C3866a(bVar.f10444a, EnumC3870e.f44127c, null), new b(SystemClock.elapsedRealtime() - this.f16725d < 2000, this, taskCompletionSource, bVar));
    }
}

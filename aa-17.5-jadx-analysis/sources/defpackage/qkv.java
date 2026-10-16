package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class qkv {
    public static volatile qkv a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final spg d;

    public qkv(Context context) {
        this.d = new spg(context, new sou("ads_identifier:api"));
    }

    public final synchronized void a(int i, long j, long j2, int i2) {
        AtomicLong atomicLong = this.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, null, null, 0, i2)))).j(new qod(this, jElapsedRealtime, 1));
    }
}

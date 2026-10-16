package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class sue {
    public static volatile sue a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final spg d;

    public sue(Context context) {
        this.d = new spg(context, new sou("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3)))).j(new tgz(this, 1));
    }
}

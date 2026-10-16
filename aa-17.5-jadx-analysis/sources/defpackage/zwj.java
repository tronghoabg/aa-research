package defpackage;

import android.os.SystemClock;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zwj {
    public final long a;
    public final Object b;

    public zwj() {
        this.b = UUID.randomUUID();
        this.a = SystemClock.elapsedRealtime();
    }

    public final String a() {
        return SystemClock.elapsedRealtime() - this.a > 86400000 ? "over_ttl" : ((UUID) this.b).toString();
    }

    public zwj(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    public zwj(RuntimeException runtimeException) {
        this.a = System.currentTimeMillis();
        this.b = runtimeException;
    }
}

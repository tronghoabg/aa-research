package defpackage;

import android.os.SystemClock;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final class ofe {
    public final CarCall a;
    public final yfq b;
    public boolean c;
    private final long d;

    public ofe(CarCall carCall, yfq yfqVar, long j) {
        this.a = carCall;
        this.b = yfqVar;
        this.d = j;
    }

    public final long a() {
        oit.a();
        return SystemClock.elapsedRealtime() - this.d;
    }
}

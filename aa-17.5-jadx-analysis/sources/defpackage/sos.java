package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes.dex */
public final class sos {
    private static sos b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized sos a() {
        sos sosVar;
        sosVar = b;
        if (sosVar == null) {
            sosVar = new sos();
            b = sosVar;
        }
        return sosVar;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null) {
            if (rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
                return;
            }
        }
        this.a = rootTelemetryConfiguration;
    }
}

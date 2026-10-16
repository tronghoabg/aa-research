package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class spn {
    private static defpackage.spn b;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration c = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, false, false, 0, 0);
    public com.google.android.gms.common.internal.RootTelemetryConfiguration a;

    public static synchronized defpackage.spn a() {
        defpackage.spn spnVar;
        spnVar = b;
        if (spnVar == null) {
            spnVar = new defpackage.spn();
            b = spnVar;
        }
        return spnVar;
    }

    public final synchronized void b(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.a = c;
                return;
            }
            com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
            if (rootTelemetryConfiguration2 != null) {
                if (rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
                    return;
                }
            }
            this.a = rootTelemetryConfiguration;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}

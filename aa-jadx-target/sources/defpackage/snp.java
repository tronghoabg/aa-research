package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class snp implements defpackage.swq {
    private final defpackage.snf a;
    private final int b;
    private final defpackage.smo c;
    private final long d;
    private final long e;

    public snp(defpackage.snf snfVar, int i, defpackage.smo smoVar, long j, long j2) {
        this.a = snfVar;
        this.b = i;
        this.c = smoVar;
        this.d = j;
        this.e = j2;
    }

    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration b(defpackage.snb snbVar, defpackage.sok sokVar, int i) {
        int[] iArr;
        int[] iArr2;
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo = sokVar.n;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !defpackage.sqs.fE(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !defpackage.sqs.fE(iArr2, i))) || snbVar.k >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.swq
    public final void a(defpackage.swx swxVar) {
        defpackage.snb snbVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        defpackage.snf snfVar = this.a;
        if (snfVar.g()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.spn.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (snbVarB = snfVar.b(this.c)) != null) {
                java.lang.Object obj = snbVarB.b;
                if (obj instanceof defpackage.sok) {
                    long j3 = this.d;
                    boolean z = j3 > 0;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        defpackage.sok sokVar = (defpackage.sok) obj;
                        boolean zB = sokVar.B();
                        i = rootTelemetryConfiguration.d;
                        int i7 = rootTelemetryConfiguration.e;
                        int i8 = rootTelemetryConfiguration.a;
                        if (!zB || sokVar.q()) {
                            i2 = i8;
                            i3 = i7;
                        } else {
                            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(snbVarB, sokVar, this.b);
                            if (connectionTelemetryConfigurationB == null) {
                                return;
                            }
                            boolean z2 = connectionTelemetryConfigurationB.c && j3 > 0;
                            i2 = i8;
                            i3 = connectionTelemetryConfigurationB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (swxVar.g()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (((defpackage.sxc) swxVar).c) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        java.lang.Exception excD = swxVar.d();
                        if (excD instanceof defpackage.sls) {
                            com.google.android.gms.common.api.Status status = ((defpackage.sls) excD).a;
                            i4 = status.f;
                            com.google.android.gms.common.ConnectionResult connectionResult = status.i;
                            if (connectionResult != null) {
                                i5 = connectionResult.c;
                            }
                            i6 = i4;
                        } else {
                            i4 = 101;
                        }
                        i5 = -1;
                        i6 = i4;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        iElapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    int i9 = this.b;
                    int i10 = ((defpackage.sok) obj).i;
                    android.os.Handler handler = snfVar.q;
                    handler.sendMessage(handler.obtainMessage(18, new snq(new com.google.android.gms.common.internal.MethodInvocation(i9, i6, i5, j, j2, (java.lang.String) null, (java.lang.String) null, i10, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}

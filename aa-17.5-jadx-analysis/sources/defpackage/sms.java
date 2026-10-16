package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes.dex */
final class sms implements svs {
    private final smi a;
    private final int b;
    private final slr c;
    private final long d;
    private final long e;

    public sms(smi smiVar, int i, slr slrVar, long j, long j2) {
        this.a = smiVar;
        this.b = i;
        this.c = slrVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(sme smeVar, snp snpVar, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = snpVar.n;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !spu.f(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !spu.f(iArr2, i))) || smeVar.j >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.svs
    public final void a(svz svzVar) {
        sme smeVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        smi smiVar = this.a;
        if (smiVar.g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = sos.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (smeVarB = smiVar.b(this.c)) != null) {
                Object obj = smeVarB.b;
                if (obj instanceof snp) {
                    long j3 = this.d;
                    boolean z = j3 > 0;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        snp snpVar = (snp) obj;
                        boolean zB = snpVar.B();
                        i = rootTelemetryConfiguration.d;
                        int i7 = rootTelemetryConfiguration.e;
                        int i8 = rootTelemetryConfiguration.a;
                        if (!zB || snpVar.q()) {
                            i2 = i8;
                            i3 = i7;
                        } else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(smeVarB, snpVar, this.b);
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
                    if (svzVar.g()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (((swe) svzVar).c) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        Exception excD = svzVar.d();
                        if (excD instanceof skw) {
                            Status status = ((skw) excD).a;
                            i4 = status.f;
                            ConnectionResult connectionResult = status.i;
                            if (connectionResult != null) {
                                i5 = connectionResult.c;
                            }
                            i6 = i4;
                        } else {
                            i4 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                        }
                        i5 = -1;
                        i6 = i4;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    int i9 = this.b;
                    int i10 = ((snp) obj).i;
                    Handler handler = smiVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new smt(new MethodInvocation(i9, i6, i5, j, j2, null, null, i10, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}

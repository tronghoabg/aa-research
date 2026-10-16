package com.moloco.sdk.internal.services.init;

import E5.Q;
import Jd.AbstractC0669c;
import android.net.Uri;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.C1861b1;
import com.moloco.sdk.C1864c1;
import com.moloco.sdk.S0;
import com.moloco.sdk.T0;
import com.moloco.sdk.U0;
import com.moloco.sdk.V0;
import com.moloco.sdk.W0;
import com.moloco.sdk.X0;
import com.moloco.sdk.Y0;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c f29702a;

    public u(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c httpRequestClient) {
        AbstractC3340k.e(httpRequestClient, "httpRequestClient");
        this.f29702a = httpRequestClient;
    }

    public static byte[] b(n nVar, long j8) {
        U0 u02;
        C1861b1 c1861b1E = C1864c1.e();
        S0 s0D = Y0.d();
        if (nVar instanceof l) {
            T0 t0C = V0.c();
            switch (t.f29701a[((l) nVar).f29666a.ordinal()]) {
                case 1:
                    u02 = U0.UNKNOWN;
                    break;
                case 2:
                    u02 = U0.HTTP_REQUEST_TIMEOUT;
                    break;
                case 3:
                    u02 = U0.HTTP_UKNOWN_HOST;
                    break;
                case 4:
                    u02 = U0.HTTP_SOCKET;
                    break;
                case 5:
                    u02 = U0.HTTP_SSL_ERROR;
                    break;
                case 6:
                    u02 = U0.ANDROID_WORK_MANAGER_ISSUE;
                    break;
                default:
                    throw new Q((byte) 0, 9);
            }
            t0C.a(u02);
            s0D.a((V0) t0C.build());
        } else {
            if (!(nVar instanceof m)) {
                throw new Q((byte) 0, 9);
            }
            W0 w0C = X0.c();
            w0C.a(((m) nVar).f29667a);
            s0D.b((X0) w0C.build());
        }
        c1861b1E.a((Y0) s0D.build());
        c1861b1E.b(j8);
        byte[] byteArray = ((C1864c1) c1861b1E.build()).toByteArray();
        AbstractC3340k.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final void a(n nVar, long j8) {
        try {
            if (nVar instanceof l) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking client failure: " + ((l) nVar).f29666a, false, 4, null);
            } else {
                if (!(nVar instanceof m)) {
                    throw new Q((byte) 0, 9);
                }
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking server failure: " + ((m) nVar).f29667a, false, 4, null);
            }
            Uri uriBuild = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING).buildUpon().build();
            byte[] bArrB = b(nVar, j8);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c cVar = this.f29702a;
            String string = uriBuild.toString();
            AbstractC3340k.d(string, "toString(...)");
            cVar.a(string, bArrB, AbstractC0669c.f6048b, null);
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifyFailure post request", e7, false, 8, null);
        }
    }
}

package Cd;

import android.os.Build;
import ef.C2515C;

/* renamed from: Cd.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0357z implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2194b;

    public /* synthetic */ C0357z(boolean z2, int i5) {
        this.f2193a = i5;
        this.f2194b = z2;
    }

    @Override // tf.a
    public final Object invoke() {
        boolean z2 = this.f2194b;
        switch (this.f2193a) {
            case 0:
                return Boolean.valueOf(z2);
            default:
                if (!z2 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.f31039a.compareAndSet(false, true)) {
                    com.moloco.sdk.internal.services.F fA = com.moloco.sdk.service_locator.e.b().a();
                    com.moloco.sdk.acm.recorder.b.Companion.getClass();
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("software_rendering_detected");
                    hVar.a("manufacturer", fA.f29382a);
                    hVar.a("model", fA.f29383b);
                    hVar.a("os_version", Build.VERSION.RELEASE);
                    hVar.a("api_level", String.valueOf(fA.f29386e));
                    com.moloco.sdk.acm.f fVar = com.moloco.sdk.acm.f.f28407a;
                    com.moloco.sdk.acm.f.a(hVar);
                }
                return C2515C.f34653a;
        }
    }
}

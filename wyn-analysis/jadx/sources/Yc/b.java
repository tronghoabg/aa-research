package Yc;

import M.y;
import a2.v;
import android.content.res.AssetManager;
import android.util.Log;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.AbstractC3230e0;
import lc.C3458b;
import oc.C3665d;
import uc.C4281r;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16746a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16750e;

    public /* synthetic */ b(Dd.c cVar, C3665d c3665d, v vVar, long j8) {
        this.f16748c = cVar;
        this.f16749d = c3665d;
        this.f16750e = vVar;
        this.f16747b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16746a) {
            case 0:
                Dd.c cVar = (Dd.c) this.f16748c;
                cVar.getClass();
                String str = (String) ((y) ((C3665d) this.f16749d).f41476d).f7228c;
                AssetManager assets = AbstractC3230e0.f39408h.getAssets();
                if (!((AtomicBoolean) cVar.f2642b).get()) {
                    v vVar = (v) this.f16750e;
                    if (vVar != null) {
                        Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(vVar.z()));
                        cVar.f2644d = new C3458b(AbstractC3230e0.f39408h, vVar.z());
                    } else {
                        Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                        cVar.f2644d = new C3458b(AbstractC3230e0.f39408h, null);
                    }
                    FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f16747b);
                    if (flutterCallbackInformationLookupCallbackInformation != null) {
                        mc.b bVar = ((C3458b) cVar.f2644d).f40253c;
                        C4281r c4281r = new C4281r(bVar, "plugins.flutter.io/firebase_messaging_background");
                        cVar.f2643c = c4281r;
                        c4281r.b(cVar);
                        bVar.c(new G9.e(assets, str, flutterCallbackInformationLookupCallbackInformation, 29));
                        break;
                    } else {
                        Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                        break;
                    }
                }
                break;
            default:
                AnalyticsClient.b((Sdk.SDKMetric.SDKMetricType) this.f16748c, this.f16747b, (s) this.f16749d, (String) this.f16750e);
                break;
        }
    }

    public /* synthetic */ b(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j8, s sVar, String str) {
        this.f16748c = sDKMetricType;
        this.f16747b = j8;
        this.f16749d = sVar;
        this.f16750e = str;
    }
}

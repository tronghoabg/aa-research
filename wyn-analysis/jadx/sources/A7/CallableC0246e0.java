package A7;

import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzx;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: A7.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class CallableC0246e0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f855a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C0249f0 f856b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f857c;

    public /* synthetic */ CallableC0246e0(int i5) {
        this.f855a = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f855a) {
            case 0:
                C0257i c0257iF0 = this.f856b.f0();
                String str = this.f857c;
                E eC1 = c0257iF0.c1(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                map.put("gmp_version", 106000L);
                if (eC1 != null) {
                    String strH = eC1.h();
                    if (strH != null) {
                        map.put("app_version", strH);
                    }
                    map.put("app_version_int", Long.valueOf(eC1.y()));
                    map.put("dynamite_version", Long.valueOf(eC1.N()));
                }
                return map;
            case 1:
                CallableC0246e0 callableC0246e0 = new CallableC0246e0(0);
                callableC0246e0.f856b = this.f856b;
                callableC0246e0.f857c = this.f857c;
                return new zzx("internal.appMetadata", callableC0246e0);
            default:
                return new zzm("internal.remoteConfig", new C0258i0(this.f856b, this.f857c));
        }
    }
}

package ad;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ad.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1352F {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17499a;

    public C1352F(Map map) {
        this.f17499a = map;
    }

    public C1352F(InitializationStatus initializationStatus) {
        HashMap map = new HashMap();
        for (Map.Entry<String, AdapterStatus> entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            map.put(entry.getKey(), new C1380z(entry.getValue()));
        }
        this.f17499a = map;
    }
}

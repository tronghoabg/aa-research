package A7;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* renamed from: A7.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0258i0 implements zzo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0249f0 f900b;

    public C0258i0(C0249f0 c0249f0, String str) {
        this.f899a = str;
        this.f900b = c0249f0;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f900b.f858d.get(this.f899a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}

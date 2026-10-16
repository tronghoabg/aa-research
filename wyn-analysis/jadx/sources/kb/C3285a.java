package kb;

import Va.Za;
import a.AbstractC1304a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3285a extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public final Map f39443b;

    /* renamed from: c, reason: collision with root package name */
    public final Za f39444c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39445d;

    public C3285a(Map map, boolean z2) {
        super(19);
        this.f39444c = new Za();
        this.f39443b = map;
        this.f39445d = z2;
    }

    public final void n0(ArrayList arrayList) {
        if (this.f39445d) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Za za2 = this.f39444c;
        map2.put("code", (String) za2.f13916b);
        map2.put(PglCryptUtils.KEY_MESSAGE, (String) za2.f13917c);
        map2.put(JsonStorageKeyNames.DATA_KEY, (HashMap) za2.f13918d);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void o0(ArrayList arrayList) {
        if (this.f39445d) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f39444c.f13915a);
        arrayList.add(map);
    }

    @Override // a.AbstractC1304a
    public final Object q(String str) {
        return this.f39443b.get(str);
    }

    @Override // a.AbstractC1304a
    public final String s() {
        return (String) this.f39443b.get("method");
    }

    @Override // a.AbstractC1304a
    public final boolean t() {
        return this.f39445d;
    }

    @Override // a.AbstractC1304a
    public final InterfaceC3287c u() {
        return this.f39444c;
    }

    @Override // a.AbstractC1304a
    public final boolean z() {
        return this.f39443b.containsKey("transactionId");
    }
}

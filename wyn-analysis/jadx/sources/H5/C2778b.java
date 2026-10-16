package h5;

import Va.X7;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2778b extends AbstractC2777a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f36142a;

    /* renamed from: b, reason: collision with root package name */
    public final X7 f36143b = new X7();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36144c;

    public C2778b(Map map, boolean z2) {
        this.f36142a = map;
        this.f36144c = z2;
    }

    @Override // U8.v0
    public final Object H(String str) {
        return this.f36142a.get(str);
    }

    @Override // U8.v0
    public final boolean M() {
        return this.f36144c;
    }

    @Override // h5.AbstractC2777a
    public final InterfaceC2781e t0() {
        return this.f36143b;
    }

    public final void u0(ArrayList arrayList) {
        if (this.f36144c) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        X7 x72 = this.f36143b;
        map2.put("code", (String) x72.f13842b);
        map2.put(PglCryptUtils.KEY_MESSAGE, (String) x72.f13843c);
        map2.put(JsonStorageKeyNames.DATA_KEY, (HashMap) x72.f13844d);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void v0(ArrayList arrayList) {
        if (this.f36144c) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f36143b.f13841a);
        arrayList.add(map);
    }
}

package Va;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class N extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f13543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f13544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1169v f13545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f13546i;

    public N(V v2, String str, Context context, String str2, List list, LinkedHashMap linkedHashMap, C1169v c1169v) {
        this.f13546i = v2;
        this.f13540c = str;
        this.f13541d = context;
        this.f13542e = str2;
        this.f13543f = list;
        this.f13544g = linkedHashMap;
        this.f13545h = c1169v;
    }

    @Override // Va.Ba
    public final void c() throws JSONException {
        G gS = G.S();
        int i5 = V.f13769p + 99;
        V.f13770q = i5 % 128;
        int i10 = i5 % 2;
        V v2 = this.f13546i;
        if (i10 == 0) {
            String str = v2.k;
            throw null;
        }
        String str2 = v2.k;
        String str3 = this.f13540c;
        if (gS.V(str3, str2)) {
            M m10 = new M(this);
            int i11 = V.f13770q + 57;
            V.f13769p = i11 % 128;
            int i12 = i11 % 2;
            this.f13546i.q(this.f13541d, this.f13542e, this.f13540c, this.f13543f, m10);
            if (i12 != 0) {
                throw null;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int i13 = V.f13769p + 7;
        V.f13770q = i13 % 128;
        int i14 = i13 % 2;
        v2.s(str3, jSONObject);
        if (i14 == 0) {
            int i15 = 87 / 0;
        }
        V.f13769p = (V.f13770q + 27) % 128;
        V.h(v2).put(str3, jSONObject);
        M m11 = new M();
        m11.f13522d = this;
        Cb.a(m11, G.S().E());
    }
}

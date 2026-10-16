package ad;

import A7.B0;
import D6.P0;
import Va.M6;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.C4476g;

/* renamed from: ad.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1372q {

    /* renamed from: a, reason: collision with root package name */
    public final List f17601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17602b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f17603c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17604d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17605e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17606f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f17607g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17608h;

    /* renamed from: i, reason: collision with root package name */
    public final List f17609i;

    public C1372q(List list, String str, Boolean bool, List list2, Integer num, String str2, Map map, String str3, List list3) {
        this.f17601a = list;
        this.f17602b = str;
        this.f17603c = bool;
        this.f17604d = list2;
        this.f17605e = num;
        this.f17606f = str2;
        this.f17607g = map;
        this.f17608h = str3;
        this.f17609i = list3;
    }

    public final C4476g a() {
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder(14);
        b(adRequest$Builder);
        return new C4476g(adRequest$Builder);
    }

    public final void b(B0 b02) {
        List list = this.f17601a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b02.w((String) it.next());
            }
        }
        String str = this.f17602b;
        if (str != null) {
            b02.T(str);
        }
        HashMap map = new HashMap();
        List list2 = this.f17609i;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                throw M6.j(it2);
            }
        }
        Map map2 = this.f17607g;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map2.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.f17603c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            b02.x((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
        List list3 = this.f17604d;
        if (list3 != null) {
            b02.U(list3);
        }
        Integer num = this.f17605e;
        if (num != null) {
            ((P0) b02.f421a).f2356n = num.intValue();
        }
        b02.V(this.f17608h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1372q)) {
            return false;
        }
        C1372q c1372q = (C1372q) obj;
        return Objects.equals(this.f17601a, c1372q.f17601a) && Objects.equals(this.f17602b, c1372q.f17602b) && Objects.equals(this.f17603c, c1372q.f17603c) && Objects.equals(this.f17604d, c1372q.f17604d) && Objects.equals(this.f17605e, c1372q.f17605e) && Objects.equals(this.f17606f, c1372q.f17606f) && Objects.equals(this.f17607g, c1372q.f17607g) && Objects.equals(this.f17609i, c1372q.f17609i);
    }

    public int hashCode() {
        return Objects.hash(this.f17601a, this.f17602b, this.f17603c, this.f17604d, this.f17605e, this.f17606f, null, this.f17609i);
    }
}

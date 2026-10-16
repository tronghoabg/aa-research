package ad;

import D6.P0;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import y6.C4564a;

/* renamed from: ad.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1367l extends C1372q {

    /* renamed from: j, reason: collision with root package name */
    public final Map f17589j;
    public final Map k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17590l;

    public C1367l(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, Map map3, String str4, List list3) {
        super(list, str, bool, list2, num, str3, map3, str4, list3);
        this.f17589j = map;
        this.k = map2;
        this.f17590l = str2;
    }

    public final y6.b c() {
        C4564a c4564a = new C4564a(14);
        b(c4564a);
        Map map = this.f17589j;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c4564a.t((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map map2 = this.k;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                c4564a.u((String) entry2.getKey(), (List) entry2.getValue());
            }
        }
        String str = this.f17590l;
        if (str != null) {
            ((P0) c4564a.f421a).f2352i = str;
        }
        return new y6.b(c4564a);
    }

    @Override // ad.C1372q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1367l)) {
            return false;
        }
        C1367l c1367l = (C1367l) obj;
        if (super.equals(obj)) {
            if (Objects.equals(this.f17589j, c1367l.f17589j) && Objects.equals(this.k, c1367l.k)) {
                return true;
            }
        }
        return false;
    }

    @Override // ad.C1372q
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f17589j, this.k);
    }
}

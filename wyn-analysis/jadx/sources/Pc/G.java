package Pc;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public String f9323a;

    /* renamed from: b, reason: collision with root package name */
    public Long f9324b;

    /* renamed from: c, reason: collision with root package name */
    public Long f9325c;

    /* renamed from: d, reason: collision with root package name */
    public Long f9326d;

    /* renamed from: e, reason: collision with root package name */
    public String f9327e;

    /* renamed from: f, reason: collision with root package name */
    public Map f9328f;

    /* renamed from: g, reason: collision with root package name */
    public String f9329g;

    public static G a(ArrayList arrayList) {
        Long lValueOf;
        Long lValueOf2;
        G g9 = new G();
        g9.f9323a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long lValueOf3 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        g9.f9324b = lValueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 == null) {
            lValueOf2 = null;
        } else {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        g9.f9325c = lValueOf2;
        Object obj3 = arrayList.get(3);
        if (obj3 != null) {
            lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        g9.f9326d = lValueOf3;
        g9.f9327e = (String) arrayList.get(4);
        g9.f9328f = (Map) arrayList.get(5);
        g9.f9329g = (String) arrayList.get(6);
        return g9;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f9323a);
        arrayList.add(this.f9324b);
        arrayList.add(this.f9325c);
        arrayList.add(this.f9326d);
        arrayList.add(this.f9327e);
        arrayList.add(this.f9328f);
        arrayList.add(this.f9329g);
        return arrayList;
    }
}

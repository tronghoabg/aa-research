package Pc;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f9309a;

    /* renamed from: b, reason: collision with root package name */
    public String f9310b;

    /* renamed from: c, reason: collision with root package name */
    public String f9311c;

    /* renamed from: d, reason: collision with root package name */
    public String f9312d;

    /* renamed from: e, reason: collision with root package name */
    public Map f9313e;

    public static D a(ArrayList arrayList) {
        D d3 = new D();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
        }
        d3.f9309a = bool;
        d3.f9310b = (String) arrayList.get(1);
        d3.f9311c = (String) arrayList.get(2);
        d3.f9312d = (String) arrayList.get(3);
        d3.f9313e = (Map) arrayList.get(4);
        return d3;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f9309a);
        arrayList.add(this.f9310b);
        arrayList.add(this.f9311c);
        arrayList.add(this.f9312d);
        arrayList.add(this.f9313e);
        return arrayList;
    }
}

package Pc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public O f9349a;

    /* renamed from: b, reason: collision with root package name */
    public List f9350b;

    public static N a(ArrayList arrayList) {
        N n10 = new N();
        O o7 = (O) arrayList.get(0);
        if (o7 == null) {
            throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
        }
        n10.f9349a = o7;
        List list = (List) arrayList.get(1);
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }
        n10.f9350b = list;
        return n10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f9349a);
        arrayList.add(this.f9350b);
        return arrayList;
    }
}

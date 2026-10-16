package Pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public String f9338a;

    /* renamed from: b, reason: collision with root package name */
    public List f9339b;

    /* renamed from: c, reason: collision with root package name */
    public Map f9340c;

    public static K a(ArrayList arrayList) {
        K k = new K();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        k.f9338a = str;
        k.f9339b = (List) arrayList.get(1);
        k.f9340c = (Map) arrayList.get(2);
        return k;
    }
}

package D5;

import android.util.SparseArray;
import java.util.HashMap;
import ka.AbstractC3256n;
import q5.EnumC3870e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f2334a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2335b;

    static {
        HashMap map = new HashMap();
        f2335b = map;
        map.put(EnumC3870e.f44125a, 0);
        map.put(EnumC3870e.f44126b, 1);
        map.put(EnumC3870e.f44127c, 2);
        for (EnumC3870e enumC3870e : map.keySet()) {
            f2334a.append(((Integer) f2335b.get(enumC3870e)).intValue(), enumC3870e);
        }
    }

    public static int a(EnumC3870e enumC3870e) {
        Integer num = (Integer) f2335b.get(enumC3870e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC3870e);
    }

    public static EnumC3870e b(int i5) {
        EnumC3870e enumC3870e = (EnumC3870e) f2334a.get(i5);
        if (enumC3870e != null) {
            return enumC3870e;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Unknown Priority for value "));
    }
}

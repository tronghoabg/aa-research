package Va;

import java.util.HashMap;

/* renamed from: Va.t8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1152t8 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f14644a = new HashMap();

    public static String a(String str) {
        HashMap map = f14644a;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        map.put(str, str);
        return str;
    }
}

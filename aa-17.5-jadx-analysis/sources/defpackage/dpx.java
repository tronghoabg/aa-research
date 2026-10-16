package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dpx {
    public static final dpx a;
    public static final dpx b;
    public static final dpx c;
    public static final Map d;
    public static final Map e;
    private static final /* synthetic */ dpx[] f;

    static {
        dpx dpxVar = new dpx("SPREAD", 0);
        a = dpxVar;
        dpx dpxVar2 = new dpx("SPREAD_INSIDE", 1);
        b = dpxVar2;
        dpx dpxVar3 = new dpx("PACKED", 2);
        c = dpxVar3;
        f = new dpx[]{dpxVar, dpxVar2, dpxVar3};
        HashMap map = new HashMap();
        d = map;
        HashMap map2 = new HashMap();
        e = map2;
        map.put("packed", dpxVar3);
        map.put("spread_inside", dpxVar2);
        map.put("spread", dpxVar);
        map2.put("packed", 2);
        map2.put("spread_inside", 1);
        map2.put("spread", 0);
    }

    public static int a(String str) {
        Map map = e;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static dpx valueOf(String str) {
        return (dpx) Enum.valueOf(dpx.class, str);
    }

    public static dpx[] values() {
        return (dpx[]) f.clone();
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class ije {
    public static final Map a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new iha(0.694f, 7));
        map.put("x-small", new iha(0.833f, 7));
        map.put("small", new iha(10.0f, 7));
        map.put("medium", new iha(12.0f, 7));
        map.put("large", new iha(14.4f, 7));
        map.put("x-large", new iha(17.3f, 7));
        map.put("xx-large", new iha(20.7f, 7));
        map.put("smaller", new iha(83.33f, 9));
        map.put("larger", new iha(120.0f, 9));
    }
}

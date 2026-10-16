package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hio {
    public static final Map a;
    private final Map b = new LinkedHashMap();

    static {
        yip yipVar = new yip();
        yipVar.h();
        a = yipVar.e();
    }

    public final Object a(String str) {
        if (gur.g()) {
            return this.b.get(new hip(str));
        }
        return null;
    }

    public final void b(String str, Object obj) {
        if (gur.g()) {
            Map map = this.b;
            if (obj == null) {
                map.remove(new hip(str));
            } else {
                map.put(new hip(str), obj);
            }
        }
    }
}

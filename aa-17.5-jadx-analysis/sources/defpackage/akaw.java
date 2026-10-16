package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class akaw implements akba {
    private final Map a = new ConcurrentHashMap();

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.akba
    public final Object v(String str) {
        return this.a.get(str);
    }

    @Override // defpackage.akba
    public final void x(String str, Object obj) {
        Map map = this.a;
        if (obj != null) {
            map.put(str, obj);
        } else {
            map.remove(str);
        }
    }
}

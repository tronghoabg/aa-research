package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qlp extends qle {
    public final Map a = new HashMap(4);

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        ((qlp) qleVar).a.putAll(this.a);
    }

    public final String toString() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String strValueOf = String.valueOf(String.valueOf(entry.getKey()));
            map.put("dimension".concat(strValueOf), entry.getValue());
        }
        return qle.a(map, 0);
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qlq extends qle {
    public final Map a = new HashMap(4);

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        ((qlq) qleVar).a.putAll(this.a);
    }

    public final String toString() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String strValueOf = String.valueOf(String.valueOf(entry.getKey()));
            map.put("metric".concat(strValueOf), entry.getValue());
        }
        return qle.a(map, 0);
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class akar extends akaq implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.akas
    public Object a(String str) {
        return this.a.get(str);
    }

    @Override // defpackage.akas
    public void b(String str, Object obj) {
        if (str == null) {
            return;
        }
        Map map = this.a;
        if (obj != null) {
            map.put(str, obj);
        } else {
            map.remove(str);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        akar akarVar = (akar) super.clone();
        for (Map.Entry entry : this.a.entrySet()) {
            akarVar.b((String) entry.getKey(), entry.getValue());
        }
        return akarVar;
    }

    public final String toString() {
        return "[parameters=" + this.a.toString() + "]";
    }
}

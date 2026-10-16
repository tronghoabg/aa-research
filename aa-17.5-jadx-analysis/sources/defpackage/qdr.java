package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qdr {
    public final Object a = new Object();
    public boolean b = false;
    public final Map c = new HashMap();
    public final Set d = new HashSet();
    private final int e;
    private final qdm f;

    public qdr(int i, qdm qdmVar) {
        this.e = i;
        this.f = qdmVar;
        a();
    }

    public final void a() {
        HashMap map;
        synchronized (this.a) {
            Map map2 = this.c;
            if (map2.size() + this.d.size() >= this.e) {
                this.b = true;
                map = new HashMap(map2);
            } else {
                map = null;
            }
        }
        if (map != null) {
            this.f.a.o(map);
        }
    }

    public final void b(qdg qdgVar) {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            if (!this.c.containsKey(qdgVar)) {
                Set set = this.d;
                if (!set.contains(qdgVar)) {
                    set.add(qdgVar);
                    a();
                }
            }
        }
    }
}

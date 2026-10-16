package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ypw {
    private static final ypz e = new ypu();
    private static final ypy f = new ypv();
    public final ypz c;
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public ypy d = null;

    public ypw(ypz ypzVar) {
        this.c = ypzVar;
    }

    public final void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yos yosVar = (yos) it.next();
            yosVar.getClass();
            if (yosVar.b) {
                Map map = this.a;
                ypy ypyVar = f;
                map.remove(yosVar);
                this.b.put(yosVar, ypyVar);
            } else {
                Map map2 = this.b;
                ypz ypzVar = e;
                map2.remove(yosVar);
                this.a.put(yosVar, ypzVar);
            }
        }
    }
}

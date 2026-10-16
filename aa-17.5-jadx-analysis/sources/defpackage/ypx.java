package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ypx extends yqa {
    private final Map a;
    private final Map b;
    private final ypz c;
    private final ypy d;

    public ypx(ypw ypwVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(ypwVar.a);
        map2.putAll(ypwVar.b);
        this.c = ypwVar.c;
        this.d = ypwVar.d;
    }

    @Override // defpackage.yqa
    protected final void a(yos yosVar, Object obj, Object obj2) {
        ypz ypzVar = (ypz) this.a.get(yosVar);
        if (ypzVar != null) {
            ypzVar.a(yosVar, obj, obj2);
        } else {
            this.c.a(yosVar, obj, obj2);
        }
    }

    @Override // defpackage.yqa
    protected final void b(yos yosVar, Iterator it, Object obj) {
        ypy ypyVar = (ypy) this.b.get(yosVar);
        if (ypyVar != null) {
            ypyVar.a(yosVar, it, obj);
            return;
        }
        ypy ypyVar2 = this.d;
        if (ypyVar2 != null && !this.a.containsKey(yosVar)) {
            ypyVar2.a(yosVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(yosVar, it.next(), obj);
            }
        }
    }
}

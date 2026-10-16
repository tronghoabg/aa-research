package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qlr extends qle {
    public final Map a = new HashMap();

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qlr qlrVar = (qlr) qleVar;
        spu.aw(qlrVar);
        qlrVar.a.putAll(this.a);
    }

    public final String toString() {
        return qle.a(this.a, 0);
    }
}

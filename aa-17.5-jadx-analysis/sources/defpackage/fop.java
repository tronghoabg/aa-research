package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fop implements fon {
    public final ezc a;
    public final eyn b = new foo();

    public fop(ezc ezcVar) {
        this.a = ezcVar;
    }

    @Override // defpackage.fon
    public final List a(String str) {
        return (List) ckf.m(this.a, true, false, new fnv(str, 12, (int[][]) null));
    }

    @Override // defpackage.fon
    public final /* synthetic */ void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ckf.m(this.a, false, true, new fnv(this, new sx((String) it.next(), str), 13));
        }
    }
}

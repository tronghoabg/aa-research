package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class ymk extends yaq {
    final Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    public ymk(Set set, Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override // defpackage.yaq
    protected final Object a() {
        Set set;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it.next();
        } while (set.contains(next));
        return next;
    }
}

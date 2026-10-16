package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class hwm implements Iterable {
    public final List a;

    public hwm(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final hwm b() {
        return new hwm(new ArrayList(this.a));
    }

    final boolean c(iel ielVar) {
        return this.a.contains(new hwl(ielVar, ifq.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<hwl> iterator() {
        return this.a.iterator();
    }
}

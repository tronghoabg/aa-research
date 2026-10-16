package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class yki extends yno {
    final /* synthetic */ Iterator a;

    public yki(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        entry.getClass();
        return new ykh(entry);
    }
}

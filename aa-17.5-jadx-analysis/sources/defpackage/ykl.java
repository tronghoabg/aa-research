package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ykl extends ykk {
    final /* synthetic */ ykm a;

    public ykl(ykm ykmVar) {
        this.a = ykmVar;
    }

    @Override // defpackage.ykk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.a();
    }
}

package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class ygd extends yno {
    final yno a;
    final /* synthetic */ ygg b;

    public ygd(ygg yggVar) {
        this.b = yggVar;
        this.a = yggVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}

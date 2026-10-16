package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class yft extends yno {
    final /* synthetic */ yno a;

    public yft(yno ynoVar) {
        this.a = ynoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getKey();
    }
}

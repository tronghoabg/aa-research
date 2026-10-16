package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahqa implements Iterator {
    Iterator<String> iter;
    final /* synthetic */ ahqb this$0;

    public ahqa(ahqb ahqbVar) {
        this.this$0 = ahqbVar;
        this.iter = ahqbVar.list.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public String next() {
        return this.iter.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

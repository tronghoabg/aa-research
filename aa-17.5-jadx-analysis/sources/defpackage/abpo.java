package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class abpo implements Iterator {
    final /* synthetic */ abpq a;
    private int b = -1;

    public abpo(abpq abpqVar) {
        this.a = abpqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        abpq abpqVar = this.a;
        abpqVar.c();
        return this.b + 1 < abpqVar.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        abpq abpqVar = this.a;
        abpqVar.c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = abpqVar.a;
        int i = this.b + 1;
        this.b = i;
        return (abpn) objArr[i];
    }
}

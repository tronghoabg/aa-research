package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class afap extends afao implements ListIterator, afgc {
    final /* synthetic */ afar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afap(afar afarVar, int i) {
        super(afarVar);
        this.c = afarVar;
        a.aH(i, afarVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        afar afarVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return afarVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

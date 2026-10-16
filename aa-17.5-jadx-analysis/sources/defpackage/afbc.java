package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class afbc implements Iterator, afgc {
    public boolean a;
    private final int b;
    private int c;

    public afbc(char c, char c2) {
        this.b = c2;
        this.a = c <= c2;
        this.c = c > c2 ? c2 : c;
    }

    public final char a() {
        int i = this.c;
        if (i != this.b) {
            this.c = i + 1;
        } else {
            if (!this.a) {
                throw new NoSuchElementException();
            }
            this.a = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

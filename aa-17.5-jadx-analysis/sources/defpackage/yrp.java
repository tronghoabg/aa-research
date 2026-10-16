package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class yrp implements Iterator {
    final /* synthetic */ yrq a;
    private int b = 0;

    public yrp(yrq yrqVar) {
        this.a = yrqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        yrq yrqVar = this.a;
        if (i >= yrqVar.size()) {
            throw new NoSuchElementException();
        }
        yrr yrrVar = yrqVar.b;
        Object obj = yrrVar.b[yrqVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

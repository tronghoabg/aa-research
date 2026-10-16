package h.f;

import h.g.b.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f48093a;

    /* renamed from: b, reason: collision with root package name */
    private String f48094b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f48095c;

    n(o oVar) {
        this.f48093a = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.f48094b;
        if (line == null && !this.f48095c) {
            line = this.f48093a.f48096a.readLine();
            this.f48094b = line;
            if (line == null) {
                this.f48095c = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f48094b;
        this.f48094b = null;
        x.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

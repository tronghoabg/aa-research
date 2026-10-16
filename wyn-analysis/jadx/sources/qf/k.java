package qf;

import Af.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class k implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public String f44280a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f44282c;

    public k(o oVar) {
        this.f44282c = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f44280a == null && !this.f44281b) {
            String line = ((BufferedReader) this.f44282c.f1317b).readLine();
            this.f44280a = line;
            if (line == null) {
                this.f44281b = true;
            }
        }
        return this.f44280a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f44280a;
        this.f44280a = null;
        AbstractC3340k.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class akaf implements Iterator {
    protected final List a;
    protected int b = a(-1);
    protected int c = -1;
    protected final String d;

    public akaf(List list, String str) {
        this.a = list;
        this.d = str;
    }

    protected final int a(int i) {
        List list = this.a;
        int size = list.size() - 1;
        boolean zEqualsIgnoreCase = false;
        while (!zEqualsIgnoreCase) {
            if (i >= size) {
                return -1;
            }
            i++;
            String str = this.d;
            zEqualsIgnoreCase = str == null ? true : str.equalsIgnoreCase(((ajoy) list.get(i)).b());
        }
        return i;
    }

    public final ajoy b() throws NoSuchElementException {
        int i = this.b;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.c = i;
        this.b = a(i);
        return (ajoy) this.a.get(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        ahkp.b(this.c >= 0, "No header to remove");
        this.a.remove(this.c);
        this.c = -1;
        this.b--;
    }
}

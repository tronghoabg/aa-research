package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class airh implements Iterator, afgc {
    private int a;
    private final /* synthetic */ int b;
    private final Object c;

    public airh(airy airyVar, int i) {
        this.b = i;
        this.a = 2;
        this.c = new aisc((aisd) airyVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    private final void a() {
        while (this.a > 0) {
            ?? r0 = this.c;
            if (!r0.hasNext()) {
                return;
            }
            r0.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i != 0) {
            int i2 = this.a;
            return i != 1 ? i2 > 0 && this.c.hasNext() : i2 < ((Object[]) this.c).length;
        }
        a();
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 0) {
            a();
            return this.c.next();
        }
        if (i != 1) {
            int i2 = this.a;
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            this.a = i2 - 1;
            return this.c.next();
        }
        try {
            Object obj = this.c;
            int i3 = this.a;
            this.a = i3 + 1;
            return ((Object[]) obj)[i3];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public airh(airx airxVar, int i) {
        this.b = i;
        this.c = airxVar.a.a();
        this.a = airxVar.b;
    }

    public airh(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }
}

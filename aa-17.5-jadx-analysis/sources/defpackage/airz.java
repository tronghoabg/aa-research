package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class airz implements Iterator, afgc {
    final /* synthetic */ Object a;
    private final Iterator b;
    private int c = -1;
    private Object d;
    private final /* synthetic */ int e;

    public airz(airk airkVar, int i) {
        this.e = i;
        this.a = airkVar;
        this.b = airkVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [afec, java.lang.Object] */
    private final void a() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((aisb) this.a).b.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    private final void b() {
        int i;
        while (true) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            Object next = it.next();
            airk airkVar = (airk) this.a;
            if (((Boolean) airkVar.c.invoke(next)).booleanValue() == airkVar.b) {
                this.d = next;
                i = 1;
                break;
            }
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        int i2 = this.c;
        if (i != 0) {
            if (i2 == -1) {
                b();
            }
            return this.c == 1;
        }
        if (i2 == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        int i2 = this.c;
        if (i != 0) {
            if (i2 == -1) {
                b();
            }
            if (this.c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.d;
            this.d = null;
            this.c = -1;
            return obj;
        }
        if (i2 == -1) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.d;
        this.d = null;
        this.c = -1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public airz(aisb aisbVar, int i) {
        this.e = i;
        this.a = aisbVar;
        this.b = aisbVar.a.a();
    }
}

package Af;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class f implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1295a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f1296b;

    /* renamed from: c, reason: collision with root package name */
    public int f1297c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f1299e;

    public f(g gVar) {
        this.f1295a = 0;
        this.f1299e = gVar;
        this.f1296b = gVar.f1300a.iterator();
        this.f1297c = -1;
    }

    public void a() {
        Object next;
        g gVar;
        do {
            Iterator it = this.f1296b;
            if (!it.hasNext()) {
                this.f1297c = 0;
                return;
            } else {
                next = it.next();
                gVar = (g) this.f1299e;
            }
        } while (((Boolean) gVar.f1302c.invoke(next)).booleanValue() != gVar.f1301b);
        this.f1298d = next;
        this.f1297c = 1;
    }

    public void c() {
        Iterator it = this.f1296b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((tf.l) ((j) this.f1299e).f1312c).invoke(next)).booleanValue()) {
                this.f1297c = 1;
                this.f1298d = next;
                return;
            }
        }
        this.f1297c = 0;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f1298d;
        if (it2 != null && it2.hasNext()) {
            this.f1297c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f1296b;
            if (!it3.hasNext()) {
                this.f1297c = 2;
                this.f1298d = null;
                return false;
            }
            Object next = it3.next();
            h hVar = (h) this.f1299e;
            it = (Iterator) hVar.f1305c.invoke(hVar.f1304b.invoke(next));
        } while (!it.hasNext());
        this.f1298d = it;
        this.f1297c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1295a) {
            case 0:
                if (this.f1297c == -1) {
                    a();
                }
                return this.f1297c == 1;
            case 1:
                int i5 = this.f1297c;
                if (i5 == 1) {
                    return true;
                }
                if (i5 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f1297c == -1) {
                    c();
                }
                return this.f1297c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1295a) {
            case 0:
                if (this.f1297c == -1) {
                    a();
                }
                if (this.f1297c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f1298d;
                this.f1298d = null;
                this.f1297c = -1;
                return obj;
            case 1:
                int i5 = this.f1297c;
                if (i5 == 2) {
                    throw new NoSuchElementException();
                }
                if (i5 == 0 && !d()) {
                    throw new NoSuchElementException();
                }
                this.f1297c = 0;
                Iterator it = (Iterator) this.f1298d;
                AbstractC3340k.b(it);
                return it.next();
            default:
                if (this.f1297c == -1) {
                    c();
                }
                if (this.f1297c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f1298d;
                this.f1298d = null;
                this.f1297c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1295a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar) {
        this.f1295a = 1;
        this.f1299e = hVar;
        this.f1296b = hVar.f1303a.iterator();
    }

    public f(j jVar) {
        this.f1295a = 2;
        this.f1299e = jVar;
        this.f1296b = ((k) jVar.f1311b).iterator();
        this.f1297c = -1;
    }
}

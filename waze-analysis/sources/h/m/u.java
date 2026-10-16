package h.m;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f48207a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f48208b;

    /* renamed from: c, reason: collision with root package name */
    private int f48209c = -1;

    /* renamed from: d, reason: collision with root package name */
    private Object f48210d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f48211e;

    u(d dVar, int i2) {
        this.f48211e = i2;
        this.f48207a = dVar;
        this.f48208b = dVar.f48171a.iterator();
    }

    private final void a() {
        Iterator it = this.f48208b;
        if (it.hasNext()) {
            Object obj = this.f48207a;
            Object next = it.next();
            if (((Boolean) ((v) obj).f48214c.invoke(next)).booleanValue()) {
                this.f48209c = 1;
                this.f48210d = next;
                return;
            }
        }
        this.f48209c = 0;
    }

    private final void b() {
        int i2;
        while (true) {
            Iterator it = this.f48208b;
            if (!it.hasNext()) {
                i2 = 0;
                break;
            }
            Object obj = this.f48207a;
            Object next = it.next();
            d dVar = (d) obj;
            if (((Boolean) dVar.f48173c.invoke(next)).booleanValue() == dVar.f48172b) {
                this.f48210d = next;
                i2 = 1;
                break;
            }
        }
        this.f48209c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f48211e;
        int i3 = this.f48209c;
        if (i2 != 0) {
            if (i3 == -1) {
                b();
            }
            return this.f48209c == 1;
        }
        if (i3 == -1) {
            a();
        }
        return this.f48209c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f48211e;
        int i3 = this.f48209c;
        if (i2 != 0) {
            if (i3 == -1) {
                b();
            }
            if (this.f48209c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f48210d;
            this.f48210d = null;
            this.f48209c = -1;
            return obj;
        }
        if (i3 == -1) {
            a();
        }
        if (this.f48209c == 0) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.f48210d;
        this.f48210d = null;
        this.f48209c = -1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f48211e == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    u(v vVar, int i2) {
        this.f48211e = i2;
        this.f48207a = vVar;
        this.f48208b = vVar.f48213b.iterator();
    }
}

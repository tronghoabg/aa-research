package Te;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class m implements Oe.c {

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11886a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f11887b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f11888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11890e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11891f;

    public m(He.j jVar, Iterator it) {
        this.f11886a = jVar;
        this.f11887b = it;
    }

    @Override // Oe.d
    public final int c(int i5) {
        this.f11889d = true;
        return 1;
    }

    @Override // Oe.h
    public final void clear() {
        this.f11890e = true;
    }

    @Override // Je.b
    public final void dispose() {
        this.f11888c = true;
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f11890e;
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // Oe.h
    public final Object poll() {
        if (this.f11890e) {
            return null;
        }
        boolean z2 = this.f11891f;
        Iterator it = this.f11887b;
        if (!z2) {
            this.f11891f = true;
        } else if (!it.hasNext()) {
            this.f11890e = true;
            return null;
        }
        Object next = it.next();
        Ne.b.a(next, "The iterator returned a null value");
        return next;
    }
}

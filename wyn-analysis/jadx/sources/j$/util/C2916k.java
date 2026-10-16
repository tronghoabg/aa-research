package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2916k implements Iterator, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37917a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f37918b;

    public C2916k(C2917l c2917l) {
        this.f37918b = c2917l.f37923a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3058y
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f37917a) {
            case 0:
                S.q(this.f37918b, consumer);
                break;
            default:
                S.q(this.f37918b, new C2920o(consumer));
                break;
        }
    }

    public C2916k(r rVar) {
        this.f37918b = rVar.f37923a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f37917a) {
        }
        return this.f37918b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37917a) {
            case 0:
                return this.f37918b.next();
            default:
                return new C2921p((Map.Entry) this.f37918b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f37917a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}

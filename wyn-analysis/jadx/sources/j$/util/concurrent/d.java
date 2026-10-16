package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class d extends AbstractC2908a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f37842b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f37834b;
        Object obj2 = lVar.f37835c;
        this.f37813j = lVar;
        a();
        return new k(obj, obj2, this.f37812i);
    }
}

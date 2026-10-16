package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        k kVar = this.f50189b;
        if (kVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = kVar.f50181b;
        Object obj2 = kVar.f50182c;
        this.f50169j = kVar;
        a();
        return new j(obj, obj2, this.f50168i);
    }
}

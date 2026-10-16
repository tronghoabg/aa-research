package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class i extends AbstractC2908a implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l[] lVarArr, int i5, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(lVarArr, i5, i10, concurrentHashMap);
        this.k = i11;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                l lVar = this.f37842b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f37813j = lVar;
                a();
                return lVar.f37834b;
            default:
                l lVar2 = this.f37842b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f37835c;
                this.f37813j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
        }
        return next();
    }
}

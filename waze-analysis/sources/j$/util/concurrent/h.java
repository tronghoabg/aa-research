package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h extends a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f50174k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k[] kVarArr, int i2, int i3, ConcurrentHashMap concurrentHashMap, int i4) {
        super(kVarArr, i2, i3, concurrentHashMap);
        this.f50174k = i4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f50174k) {
            case 0:
                k kVar = this.f50189b;
                if (kVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = kVar.f50181b;
                this.f50169j = kVar;
                a();
                return obj;
            default:
                k kVar2 = this.f50189b;
                if (kVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = kVar2.f50182c;
                this.f50169j = kVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f50174k) {
        }
        return next();
    }
}

package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k implements Iterator, w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50268a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f50269b;

    public k(l lVar) {
        this.f50269b = lVar.f50272a.iterator();
    }

    @Override // java.util.Iterator, j$.util.w
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f50268a) {
            case 0:
                j$.com.android.tools.r8.a.B(this.f50269b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.B(this.f50269b, new j$.nio.file.r(consumer, 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f50268a) {
        }
        return this.f50269b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f50268a) {
            case 0:
                return this.f50269b.next();
            default:
                return new o((Map.Entry) this.f50269b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f50268a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public k(q qVar) {
        this.f50269b = qVar.f50272a.iterator();
    }
}

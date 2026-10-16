package h.k;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.au;
import h.g.b.x;
import java.lang.Comparable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g<T extends Comparable<? super T>> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f48147a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparable f48148b;

    public g(Comparable comparable, Comparable comparable2) {
        x.f(comparable, TtmlNode.START);
        x.f(comparable2, "endInclusive");
        this.f48147a = comparable;
        this.f48148b = comparable2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (au.i(this) && au.i((g) obj)) {
                return true;
            }
            g gVar = (g) obj;
            return x.n(this.f48147a, gVar.f48147a) && x.n(this.f48148b, gVar.f48148b);
        }
        return false;
    }

    @Override // h.k.f
    public final T getEndInclusive() {
        return (T) this.f48148b;
    }

    @Override // h.k.f
    public final T getStart() {
        return (T) this.f48147a;
    }

    public final int hashCode() {
        if (au.i(this)) {
            return -1;
        }
        return (this.f48147a.hashCode() * 31) + this.f48148b.hashCode();
    }

    @Override // h.k.f
    public final /* bridge */ boolean isEmpty() {
        return au.i(this);
    }

    public final String toString() {
        return this.f48147a + ".." + this.f48148b;
    }
}

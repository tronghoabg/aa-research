package h.a;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f<E> extends g<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final g f48005a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48006b;

    /* renamed from: c, reason: collision with root package name */
    private final int f48007c;

    public f(g gVar, int i2, int i3) {
        h.g.b.x.f(gVar, "list");
        this.f48005a = gVar;
        this.f48006b = i2;
        c.c(i2, i3, gVar.size());
        this.f48007c = i3 - i2;
    }

    @Override // h.a.g, java.util.List
    public final E get(int i2) {
        c.a(i2, this.f48007c);
        return (E) this.f48005a.get(this.f48006b + i2);
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f48007c;
    }

    @Override // h.a.g, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final List<E> subList(int i2, int i3) {
        c.c(i2, i3, this.f48007c);
        int i4 = this.f48006b;
        return new f(this.f48005a, i2 + i4, i4 + i3);
    }
}

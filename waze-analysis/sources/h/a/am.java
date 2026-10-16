package h.a;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am<E> extends g<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f47975a;

    /* renamed from: b, reason: collision with root package name */
    private int f47976b;

    /* renamed from: c, reason: collision with root package name */
    private int f47977c;

    public am(List list) {
        h.g.b.x.f(list, "list");
        this.f47975a = list;
    }

    public final void a(int i2, int i3) {
        c.c(i2, i3, this.f47975a.size());
        this.f47976b = i2;
        this.f47977c = i3 - i2;
    }

    @Override // h.a.g, java.util.List
    public final E get(int i2) {
        c.a(i2, this.f47977c);
        return (E) this.f47975a.get(this.f47976b + i2);
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f47977c;
    }
}

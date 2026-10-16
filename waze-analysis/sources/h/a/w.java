package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements Iterable, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f48021a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48022b;

    public w(Object obj, int i2) {
        this.f48022b = i2;
        this.f48021a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f48022b;
        if (i2 == 0) {
            return h.g.b.o.t((int[]) this.f48021a);
        }
        if (i2 == 1) {
            return h.g.b.o.v((Object[]) this.f48021a);
        }
        if (i2 == 2) {
            return h.g.b.o.u((long[]) this.f48021a);
        }
        Object obj = this.f48021a;
        return i2 != 3 ? h.g.b.o.r((double[]) obj) : h.g.b.o.s((float[]) obj);
    }
}

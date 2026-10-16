package h.m;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f48212a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f48213b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f48214c;

    public v(h.g.a.a aVar, h.g.a.l lVar, int i2) {
        this.f48212a = i2;
        x.f(aVar, "getInitialValue");
        x.f(lVar, "getNextValue");
        this.f48214c = aVar;
        this.f48213b = lVar;
    }

    @Override // h.m.h
    public final Iterator iterator() {
        int i2 = this.f48212a;
        return i2 != 0 ? i2 != 1 ? new w(this) : new g(this) : new u(this, 0);
    }

    public v(h hVar, h.g.a.l lVar, int i2) {
        this.f48212a = i2;
        x.f(hVar, "sequence");
        x.f(lVar, "predicate");
        this.f48213b = hVar;
        this.f48214c = lVar;
    }

    public v(h hVar, h.g.a.l lVar, int i2, byte[] bArr) {
        this.f48212a = i2;
        x.f(hVar, "sequence");
        x.f(lVar, "transformer");
        this.f48213b = hVar;
        this.f48214c = lVar;
    }
}

package kotlinx.b.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements Iterable, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f50936a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f50937b;

    public u(q qVar, int i2) {
        this.f50937b = i2;
        this.f50936a = qVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f50937b != 0 ? new t(this.f50936a, 1, null) : new t(this.f50936a, 0);
    }
}

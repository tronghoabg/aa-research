package kotlinx.coroutines.b;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e<T> extends kotlinx.coroutines.b.a.e<T> {

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.a.af f51676d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f51677e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.a f51678f;

    public e(kotlinx.coroutines.a.af afVar, boolean z, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(jVar, i2, aVar);
        this.f51676d = afVar;
        this.f51677e = z;
        this.f51678f = h.e.b.e(false);
    }

    private final void f() {
        if (this.f51677e && this.f51678f.d()) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final Object a(kotlinx.coroutines.a.ad adVar, h.c.e eVar) throws Throwable {
        Object objV = bl.v(new kotlinx.coroutines.b.a.af(adVar), this.f51676d, this.f51677e, eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final kotlinx.coroutines.b.a.e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new e(this.f51676d, this.f51677e, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final String c() {
        kotlinx.coroutines.a.af afVar = this.f51676d;
        Objects.toString(afVar);
        return "channel=".concat(String.valueOf(afVar));
    }

    @Override // kotlinx.coroutines.b.a.e, kotlinx.coroutines.b.k
    public final Object collect(l<? super T> lVar, h.c.e<? super h.ab> eVar) throws Throwable {
        if (this.f51405b == -3) {
            f();
            Object objV = bl.v(lVar, this.f51676d, this.f51677e, eVar);
            if (objV == h.c.a.a.f48038a) {
                return objV;
            }
        } else {
            Object objCollect = super.collect(lVar, eVar);
            if (objCollect == h.c.a.a.f48038a) {
                return objCollect;
            }
        }
        return h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.a.e
    public final kotlinx.coroutines.a.af d(kotlinx.coroutines.af afVar) {
        f();
        return this.f51405b == -3 ? this.f51676d : super.d(afVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    public final k e() {
        return new e(this.f51676d, this.f51677e);
    }

    public /* synthetic */ e(kotlinx.coroutines.a.af afVar, boolean z) {
        this(afVar, z, h.c.k.f48060a, -3, kotlinx.coroutines.a.a.f51271a);
    }
}

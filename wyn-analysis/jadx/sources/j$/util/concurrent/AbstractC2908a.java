package j$.util.concurrent;

/* renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2908a extends p {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f37812i;

    /* renamed from: j, reason: collision with root package name */
    l f37813j;

    AbstractC2908a(l[] lVarArr, int i5, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i5, 0, i10);
        this.f37812i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f37842b != null;
    }

    public final boolean hasMoreElements() {
        return this.f37842b != null;
    }

    public final void remove() {
        l lVar = this.f37813j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f37813j = null;
        this.f37812i.g(lVar.f37834b, null, null);
    }
}

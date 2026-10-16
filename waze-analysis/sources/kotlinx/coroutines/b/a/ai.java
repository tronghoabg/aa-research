package kotlinx.coroutines.b.a;

import kotlinx.coroutines.e.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai<T> implements kotlinx.coroutines.b.l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f51396a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f51397b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.p f51398c;

    public ai(kotlinx.coroutines.b.l lVar, h.c.j jVar) {
        this.f51396a = jVar;
        this.f51397b = ap.a(jVar);
        this.f51398c = new f(lVar, (h.c.e) null, 2);
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super h.ab> eVar) {
        Object objD = x.d(this.f51396a, t, this.f51397b, this.f51398c, eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }
}

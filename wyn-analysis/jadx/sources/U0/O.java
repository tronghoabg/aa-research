package u0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class O implements W.c {

    /* renamed from: a, reason: collision with root package name */
    public final P f46161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W.d f46162b;

    public O(W.d dVar, P p10) {
        this.f46161a = p10;
        this.f46162b = dVar;
    }

    @Override // W.c
    public final G9.e a(String key, tf.a aVar) {
        AbstractC3340k.e(key, "key");
        return this.f46162b.a(key, aVar);
    }

    @Override // W.c
    public final boolean b(Object obj) {
        return Q.c(obj);
    }

    @Override // W.c
    public final Object c(String key) {
        AbstractC3340k.e(key, "key");
        return this.f46162b.c(key);
    }
}

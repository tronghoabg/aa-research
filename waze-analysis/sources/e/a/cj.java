package e.a;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cj {

    /* renamed from: a, reason: collision with root package name */
    private final ce f46530a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f46531b;

    /* renamed from: c, reason: collision with root package name */
    private volatile byte[] f46532c;

    cj(ce ceVar, Object obj) {
        this.f46530a = ceVar;
        this.f46531b = obj;
    }

    static cj a(ch chVar, Object obj) {
        ce ceVarE = e(chVar);
        com.google.d.b.an.B(ceVarE);
        return new cj(ceVarE, obj);
    }

    private static ce e(ch chVar) {
        return (ce) chVar.d(ce.class);
    }

    final InputStream b() {
        return this.f46530a.a(this.f46531b);
    }

    final Object c(ch chVar) {
        ce ceVarE;
        return (!chVar.f() || (ceVarE = e(chVar)) == null) ? chVar.a(d()) : ceVarE.b(b());
    }

    final byte[] d() {
        if (this.f46532c == null) {
            synchronized (this) {
                if (this.f46532c == null) {
                    this.f46532c = cm.k(b());
                }
            }
        }
        return this.f46532c;
    }
}

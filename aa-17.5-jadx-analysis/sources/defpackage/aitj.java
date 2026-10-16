package defpackage;

/* loaded from: classes2.dex */
final class aitj extends aivk {
    public final aitg a;

    public aitj(aitg aitgVar) {
        this.a = aitgVar;
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        aitg aitgVar = this.a;
        Throwable thP = aitgVar.p(f());
        if (aitgVar.D()) {
            aisx aisxVar = ((ajca) aitgVar.a).f;
            while (true) {
                Object obj = aisxVar.a;
                ajcz ajczVar = ajcb.b;
                if (affa.f(obj, ajczVar)) {
                    if (aisxVar.d(ajczVar, thP)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (aisxVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        aitgVar.g(thP);
        aitgVar.y();
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return true;
    }
}

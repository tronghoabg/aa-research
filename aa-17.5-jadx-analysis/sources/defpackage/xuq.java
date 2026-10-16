package defpackage;

/* loaded from: classes3.dex */
public final class xuq implements xwx {
    final /* synthetic */ xuk a;
    final /* synthetic */ xwx b;

    public xuq(xuk xukVar, xwx xwxVar) {
        this.a = xukVar;
        this.b = xwxVar;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        xuk xukVarG = xts.g(xts.f(), this.a);
        try {
            return this.b.a(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

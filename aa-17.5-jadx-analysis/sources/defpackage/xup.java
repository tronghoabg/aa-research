package defpackage;

/* loaded from: classes.dex */
public final class xup implements zfk {
    final /* synthetic */ xuk a;
    final /* synthetic */ zfk b;

    public xup(xuk xukVar, zfk zfkVar) {
        this.a = xukVar;
        this.b = zfkVar;
    }

    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        nrd nrdVar = (nrd) xts.c.get();
        Object obj2 = nrdVar.b;
        xuk xukVarH = xts.h(nrdVar, this.a);
        try {
            zgp zgpVarA = this.b.a(obj);
            if (zgpVarA != null) {
                return zgpVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

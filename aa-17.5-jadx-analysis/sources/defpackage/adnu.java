package defpackage;

/* loaded from: classes.dex */
public final class adnu implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public adnu(adnw adnwVar, adnv adnvVar, Runnable runnable, int i) {
        this.d = i;
        this.a = adnvVar;
        this.b = runnable;
        this.c = adnwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, xuk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ((adnw) this.c).execute(this.a);
        } else {
            if (((xuu) ((affv) this.b).a) != null) {
                throw null;
            }
            ?? r0 = this.a;
            ?? r2 = this.c;
            xuk xukVarG = xts.g(xts.f(), r0);
            try {
                r2.run();
            } finally {
            }
        }
    }

    public final String toString() {
        if (this.d == 0) {
            return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
        }
        return "propagating=[" + this.c + "]";
    }

    public adnu(affv affvVar, xuk xukVar, Runnable runnable, int i) {
        this.d = i;
        this.b = affvVar;
        this.a = xukVar;
        this.c = runnable;
    }
}

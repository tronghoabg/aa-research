package defpackage;

/* loaded from: classes3.dex */
public final class xuo implements Runnable {
    final /* synthetic */ xul a;
    final /* synthetic */ Runnable b;

    public xuo(xul xulVar, Runnable runnable) {
        this.a = xulVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xuk, xul] */
    @Override // java.lang.Runnable
    public final void run() {
        xuk xukVarG = xts.g(xts.f(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnm implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.CharSequence a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.rng c;
    private final /* synthetic */ int d;

    public rnm(defpackage.rng rngVar, java.lang.CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.a = charSequence;
        this.b = i;
        this.c = rngVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        int i = this.d;
        int i2 = this.b;
        if (i != 0) {
            return java.lang.Boolean.valueOf(this.c.a.setComposingText(this.a, i2));
        }
        return java.lang.Boolean.valueOf(this.c.a.commitText(this.a, i2));
    }
}

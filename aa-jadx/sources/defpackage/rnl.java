package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnl implements java.util.concurrent.Callable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.rng c;
    private final /* synthetic */ int d;

    public rnl(defpackage.rng rngVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.b = i2;
        this.c = rngVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        int i = this.d;
        if (i == 0) {
            int i2 = this.b;
            return this.c.a.getTextBeforeCursor(this.a, i2);
        }
        if (i == 1) {
            int i3 = this.b;
            return java.lang.Boolean.valueOf(this.c.a.setSelection(this.a, i3));
        }
        if (i == 2) {
            int i4 = this.b;
            return this.c.a.getTextAfterCursor(this.a, i4);
        }
        int i5 = this.b;
        if (i != 3) {
            return java.lang.Boolean.valueOf(this.c.a.setComposingRegion(this.a, i5));
        }
        return java.lang.Boolean.valueOf(this.c.a.deleteSurroundingText(this.a, i5));
    }
}

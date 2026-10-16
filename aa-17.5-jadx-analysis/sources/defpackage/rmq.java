package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class rmq implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ rmk c;
    private final /* synthetic */ int d;

    public rmq(rmk rmkVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.b = i2;
        this.c = rmkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        int i = this.d;
        if (i == 0) {
            int i2 = this.b;
            return this.c.a.getTextBeforeCursor(this.a, i2);
        }
        if (i == 1) {
            int i3 = this.b;
            return Boolean.valueOf(this.c.a.setSelection(this.a, i3));
        }
        if (i == 2) {
            int i4 = this.b;
            return this.c.a.getTextAfterCursor(this.a, i4);
        }
        int i5 = this.b;
        if (i != 3) {
            return Boolean.valueOf(this.c.a.setComposingRegion(this.a, i5));
        }
        return Boolean.valueOf(this.c.a.deleteSurroundingText(this.a, i5));
    }
}

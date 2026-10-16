package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class rmr implements Callable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ int b;
    final /* synthetic */ rmk c;
    private final /* synthetic */ int d;

    public rmr(rmk rmkVar, CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.a = charSequence;
        this.b = i;
        this.c = rmkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        int i = this.d;
        int i2 = this.b;
        if (i != 0) {
            return Boolean.valueOf(this.c.a.setComposingText(this.a, i2));
        }
        return Boolean.valueOf(this.c.a.commitText(this.a, i2));
    }
}

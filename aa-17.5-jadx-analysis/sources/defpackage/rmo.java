package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class rmo implements Callable {
    final /* synthetic */ boolean a;
    final /* synthetic */ rmk b;

    public rmo(rmk rmkVar, boolean z) {
        this.a = z;
        this.b = rmkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf(this.b.a.reportFullscreenMode(this.a));
    }
}

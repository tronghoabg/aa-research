package defpackage;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class pln implements zge {
    final /* synthetic */ Consumer a;

    public pln(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ynz) ((ynz) ((ynz) plo.a.g()).p(th)).ai((char) 6780)).u("Failed to get the lazy BasicClearcutController");
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.accept((erb) obj);
    }
}

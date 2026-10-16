package defpackage;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class jnt implements zge {
    final /* synthetic */ Consumer a;
    final /* synthetic */ jnv b;

    public jnt(jnv jnvVar, Consumer consumer) {
        this.a = consumer;
        this.b = jnvVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ype) ((ype) ((ype) jnv.a.f()).p(th)).ai((char) 2426)).u("Ignoring callback for release of delegate that was never acquired.");
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        qup qupVar = (qup) obj;
        ((ype) ((ype) jnv.a.f()).ai((char) 2427)).y("Calling release callback on delegate %s", new zjd(zjc.a, qupVar));
        try {
            this.a.accept(qupVar);
        } finally {
        }
    }
}

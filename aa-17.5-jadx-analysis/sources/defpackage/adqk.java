package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class adqk extends adqs {
    public final AtomicReference a;
    private final ConcurrentLinkedQueue b;

    public adqk() {
        super(null, null);
        this.b = new ConcurrentLinkedQueue();
        this.a = new AtomicReference(null);
    }

    @Override // defpackage.adqs
    public final void b() {
        this.b.offer(new adqh(3));
        g();
    }

    @Override // defpackage.adqs
    public final void c() {
        this.b.offer(new adqh(0));
        g();
    }

    @Override // defpackage.adqs
    public final void d() {
        this.b.offer(new adqh(1));
        g();
    }

    @Override // defpackage.adqs
    public final void e(final Object obj) {
        this.b.offer(new adqj() { // from class: adqi
            @Override // defpackage.adqj
            public final void a(adqs adqsVar) {
                adqsVar.e(obj);
            }
        });
        g();
    }

    @Override // defpackage.adqs
    public final void f() {
        this.b.offer(new adqh(2));
        g();
    }

    public final void g() {
        adqs adqsVar = (adqs) this.a.get();
        if (adqsVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                adqj adqjVar = (adqj) this.b.poll();
                if (adqjVar != null) {
                    adqjVar.a(adqsVar);
                }
            }
        }
    }
}

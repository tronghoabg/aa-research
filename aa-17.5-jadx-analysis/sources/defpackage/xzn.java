package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class xzn implements yac {
    volatile yac a;
    final zhc b;
    final xya c;

    public xzn() {
        yac yacVar = yan.b;
        this.b = new zhc();
        this.c = new xya();
        this.a = yacVar;
    }

    @Override // defpackage.yac
    public final int a() {
        return 0;
    }

    @Override // defpackage.yac
    public final yao c() {
        return null;
    }

    @Override // defpackage.yac
    public final Object d() throws ExecutionException {
        return a.L(this.b);
    }

    @Override // defpackage.yac
    public final void e(Object obj) {
        if (obj != null) {
            h(obj);
        } else {
            this.a = yan.b;
        }
    }

    @Override // defpackage.yac
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yac
    public final boolean g() {
        return true;
    }

    @Override // defpackage.yac
    public final Object get() {
        return null;
    }

    public final boolean h(Object obj) {
        return this.b.o(obj);
    }

    public final void i() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.yac
    public final yac b(ReferenceQueue referenceQueue, Object obj, yao yaoVar) {
        return this;
    }
}

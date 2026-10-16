package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ajnj extends ajoe {
    public ajoe a;

    public ajnj(ajoe ajoeVar) {
        ajoeVar.getClass();
        this.a = ajoeVar;
    }

    @Override // defpackage.ajoe
    public final void f() throws IOException {
        this.a.f();
    }

    @Override // defpackage.ajoe
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.ajoe
    public final long h() {
        return this.a.h();
    }

    @Override // defpackage.ajoe
    public final ajoe i() {
        return this.a.i();
    }

    @Override // defpackage.ajoe
    public final ajoe j(long j) {
        return this.a.j(j);
    }

    @Override // defpackage.ajoe
    public final ajoe k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.k(10000L, timeUnit);
    }

    @Override // defpackage.ajoe
    public final ajoe l() {
        return this.a.l();
    }
}

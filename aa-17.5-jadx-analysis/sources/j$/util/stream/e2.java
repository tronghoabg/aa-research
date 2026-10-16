package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class e2 implements n2 {
    public boolean a;
    public Object b;
    public final /* synthetic */ j$.desugar.sun.nio.fs.h c;

    public e2(j$.desugar.sun.nio.fs.h hVar) {
        this.c = hVar;
    }

    @Override // j$.util.stream.n2
    public final void A(n2 n2Var) {
        e2 e2Var = (e2) n2Var;
        if (e2Var.a) {
            return;
        }
        accept(e2Var.b);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}

package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class o2 implements z2 {
    public Object a;

    public o2(z2 z2Var) {
        z2Var.getClass();
        this.a = z2Var;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public void end() {
        ((z2) this.a).end();
    }

    public Object get() {
        return this.a;
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
        ((z2) this.a).p(j);
    }

    @Override // j$.util.stream.z2
    public boolean s() {
        return ((z2) this.a).s();
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }
}

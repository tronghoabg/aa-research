package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class l implements u4 {
    public static final k c;
    public static final k d;
    public boolean a;
    public Object b;

    static {
        v3 v3Var = v3.REFERENCE;
        c = new k(true, v3Var, Optional.empty(), new i((byte) 3), new i((byte) 4));
        d = new k(false, v3Var, Optional.empty(), new i((byte) 3), new i((byte) 4));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return this.a;
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
    public final void p(long j) {
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}

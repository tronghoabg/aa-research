package j$.util.stream;

import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class t2 extends u {
    public final /* synthetic */ ToLongFunction l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var, int i, ToLongFunction toLongFunction) {
        super(w2Var, i);
        this.l = toLongFunction;
    }

    @Override // j$.util.stream.a
    public final boolean n() {
        return false;
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        return new h(z2Var, this.l, (byte) 5);
    }
}

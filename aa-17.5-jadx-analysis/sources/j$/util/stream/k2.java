package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class k2 extends a2 {
    public final /* synthetic */ IntBinaryOperator i;
    public final /* synthetic */ int j;

    public k2(v3 v3Var, IntBinaryOperator intBinaryOperator, int i) {
        super((byte) 8);
        this.i = intBinaryOperator;
        this.j = i;
    }

    @Override // j$.util.stream.a2
    public final n2 H() {
        return new j2(this.j, this.i);
    }
}

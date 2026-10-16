package j$.util.stream;

import java.util.function.Function;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class r2 extends v2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(w2 w2Var, int i, Function function, byte b) {
        super(w2Var, i, (byte) 1);
        this.m = b;
        this.n = function;
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        byte b = this.m;
        Function function = this.n;
        switch (b) {
            case 0:
                return new h(z2Var, function, (byte) 3);
            default:
                return new g(z2Var, function);
        }
    }
}

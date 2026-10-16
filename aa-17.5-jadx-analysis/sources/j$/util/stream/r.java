package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class r extends v2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w2 w2Var, Consumer consumer) {
        super(w2Var, 0, (byte) 1);
        this.m = (byte) 1;
        this.n = consumer;
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new q(z2Var, (IntFunction) obj);
            case 1:
                return new h(z2Var, (Consumer) obj, (byte) 1);
            default:
                return new h(z2Var, (Predicate) obj, (byte) 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, int i, Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.m = b;
        this.n = obj;
    }
}

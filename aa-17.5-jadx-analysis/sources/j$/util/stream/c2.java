package j$.util.stream;

import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class c2 extends a2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(v3 v3Var, Object obj, Object obj2, Object obj3, byte b) {
        super((byte) 8);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    @Override // j$.util.stream.a2
    public final n2 H() {
        byte b = this.i;
        Object obj = this.j;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                return new d2(obj3, (BinaryOperator) obj2, (BinaryOperator) obj);
            default:
                return new h2((i) obj3, (i) obj2, (i) obj);
        }
    }
}

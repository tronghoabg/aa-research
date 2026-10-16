package K;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class v extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6297i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.d f6298j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(V.d dVar, int i5, int i10) {
        super(2);
        this.f6297i = i10;
        this.f6298j = dVar;
        this.k = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6297i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    Fe.e.b(this.f6298j, c0740o, (this.k >> 9) & 14);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int i5 = this.k | 1;
                Fe.e.b(this.f6298j, (C0740o) obj, i5);
                break;
        }
        return C2515C.f34653a;
    }
}

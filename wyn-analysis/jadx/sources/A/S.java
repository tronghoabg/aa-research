package A;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class S extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f75j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f76l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(U u10, Object obj, int i5, int i10) {
        super(2);
        this.f74i = i10;
        this.f75j = u10;
        this.k = obj;
        this.f76l = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f74i;
        C0740o c0740o = (C0740o) obj;
        ((Number) obj2).intValue();
        switch (i5) {
            case 0:
                this.f75j.a(this.k, c0740o, this.f76l | 1);
                break;
            default:
                this.f75j.g(this.k, c0740o, this.f76l | 1);
                break;
        }
        return C2515C.f34653a;
    }
}

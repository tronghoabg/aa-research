package K;

import N.C0740o;
import ef.C2515C;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class r extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f6289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f6290j;
    public final /* synthetic */ Z.k k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC2765c abstractC2765c, String str, Z.k kVar, long j8, int i5) {
        super(2);
        this.f6289i = abstractC2765c;
        this.f6290j = str;
        this.k = kVar;
        this.f6291l = j8;
        this.f6292m = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f6292m | 1;
        Z.k kVar = this.k;
        t.a(this.f6289i, this.f6290j, kVar, this.f6291l, (C0740o) obj, i5);
        return C2515C.f34653a;
    }
}

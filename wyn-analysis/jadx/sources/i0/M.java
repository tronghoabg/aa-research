package i0;

import N.C0740o;
import ef.C2515C;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class M extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f36542i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f36543j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f36544l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(H h10, Map map, int i5, int i10) {
        super(2);
        this.f36542i = h10;
        this.f36543j = map;
        this.k = i5;
        this.f36544l = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.k | 1;
        Map map = this.f36543j;
        int i10 = this.f36544l;
        ic.d.b(this.f36542i, map, (C0740o) obj, i5, i10);
        return C2515C.f34653a;
    }
}

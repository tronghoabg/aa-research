package i0;

import N.C0740o;
import ef.C2515C;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class F extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f36498i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f36499j;
    public final /* synthetic */ float k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f36500l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f36501m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f36502n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f36503o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f36504p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f36505q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V.d f36506r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, V.d dVar, int i5) {
        super(2);
        this.f36498i = str;
        this.f36499j = f10;
        this.k = f11;
        this.f36500l = f12;
        this.f36501m = f13;
        this.f36502n = f14;
        this.f36503o = f15;
        this.f36504p = f16;
        this.f36505q = list;
        this.f36506r = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V.d dVar = this.f36506r;
        float f10 = this.f36503o;
        float f11 = this.f36504p;
        gc.b.a(this.f36498i, this.f36499j, this.k, this.f36500l, this.f36501m, this.f36502n, f10, f11, this.f36505q, dVar, (C0740o) obj, 939524097);
        return C2515C.f34653a;
    }
}

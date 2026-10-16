package K;

import B.C0317h;
import N.C0740o;
import e0.InterfaceC2442E;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class G extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tf.a f6174i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.k f6175j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f6176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6178n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0317h f6179o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f6180p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D.i f6181q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V.d f6182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6183s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(tf.a aVar, Z.k kVar, boolean z2, InterfaceC2442E interfaceC2442E, long j8, long j10, C0317h c0317h, float f10, D.i iVar, V.d dVar, int i5) {
        super(2);
        this.f6174i = aVar;
        this.f6175j = kVar;
        this.k = z2;
        this.f6176l = interfaceC2442E;
        this.f6177m = j8;
        this.f6178n = j10;
        this.f6179o = c0317h;
        this.f6180p = f10;
        this.f6181q = iVar;
        this.f6182r = dVar;
        this.f6183s = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f6183s | 1;
        V.d dVar = this.f6182r;
        C0317h c0317h = this.f6179o;
        float f10 = this.f6180p;
        Fe.g.f(this.f6174i, this.f6175j, this.k, this.f6176l, this.f6177m, this.f6178n, c0317h, f10, this.f6181q, dVar, (C0740o) obj, i5);
        return C2515C.f34653a;
    }
}

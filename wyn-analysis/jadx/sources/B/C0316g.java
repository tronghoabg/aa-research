package B;

import a.AbstractC1304a;
import ba.C1521a;
import com.vungle.ads.internal.protos.Sdk;
import d0.AbstractC2382a;
import e0.AbstractC2461m;
import e0.InterfaceC2463o;
import ef.C2515C;
import g0.C2661b;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: B.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316g extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1424i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC2461m f1425j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1426l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1428n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1429o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g0.g f1430p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316g(boolean z2, AbstractC2461m abstractC2461m, long j8, float f10, float f11, long j10, long j11, g0.g gVar) {
        super(1);
        this.f1424i = z2;
        this.f1425j = abstractC2461m;
        this.k = j8;
        this.f1426l = f10;
        this.f1427m = f11;
        this.f1428n = j10;
        this.f1429o = j11;
        this.f1430p = gVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        t0.v onDrawWithContent = (t0.v) obj;
        AbstractC3340k.e(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.a();
        boolean z2 = this.f1424i;
        AbstractC2461m abstractC2461m = this.f1425j;
        if (z2) {
            com.google.android.gms.internal.consent_sdk.a.h(onDrawWithContent, abstractC2461m, 0L, 0L, this.k, null, 246);
        } else {
            long j8 = this.k;
            float fB = AbstractC2382a.b(j8);
            float f10 = this.f1426l;
            if (fB < f10) {
                C2661b c2661b = onDrawWithContent.f45543a;
                float fD = d0.f.d(c2661b.f35484b.y());
                float f11 = this.f1427m;
                float fB2 = d0.f.b(c2661b.f35484b.y()) - f11;
                C1521a c1521a = c2661b.f35484b;
                long jY = c1521a.y();
                c1521a.v().m();
                InterfaceC2463o interfaceC2463oV = ((C1521a) ((ad.L) c1521a.f19414b).f17515b).v();
                float f12 = this.f1427m;
                interfaceC2463oV.e(f12, f12, fD - f11, fB2, 0);
                com.google.android.gms.internal.consent_sdk.a.h(onDrawWithContent, abstractC2461m, 0L, 0L, this.k, null, 246);
                c1521a.v().restore();
                c1521a.J(jY);
            } else {
                com.google.android.gms.internal.consent_sdk.a.h(onDrawWithContent, abstractC2461m, this.f1428n, this.f1429o, AbstractC1304a.K(j8, f10), this.f1430p, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
            }
        }
        return C2515C.f34653a;
    }
}

package E;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import t0.C4070r;

/* loaded from: classes.dex */
public final class H extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P.a f2685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.t[] f2686j;
    public final /* synthetic */ AbstractC3343n k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2687l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4070r f2688m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int[] f2689n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2690o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ic.d[] f2691p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f2692q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2693r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(P.a aVar, r0.t[] tVarArr, tf.s sVar, int i5, C4070r c4070r, int[] iArr, int i10, ic.d[] dVarArr, android.support.v4.media.session.b bVar, int i11, kotlin.jvm.internal.E e7) {
        super(1);
        this.f2685i = aVar;
        this.f2686j = tVarArr;
        this.k = (AbstractC3343n) sVar;
        this.f2687l = i5;
        this.f2688m = c4070r;
        this.f2689n = iArr;
        this.f2690o = i10;
        this.f2691p = dVarArr;
        this.f2692q = bVar;
        this.f2693r = i11;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.n, tf.s] */
    @Override // tf.l
    public final Object invoke(Object obj) {
        r0.t[] tVarArr;
        int i5;
        r0.s layout = (r0.s) obj;
        AbstractC3340k.e(layout, "$this$layout");
        int i10 = this.f2685i.f8964a.f8972c;
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            tVarArr = this.f2686j;
            i5 = this.f2690o;
            if (i12 >= i10) {
                break;
            }
            r0.t tVar = tVarArr[i12];
            AbstractC3340k.b(tVar);
            iArr[i12] = i5 == 1 ? tVar.f44307a : tVar.f44308b;
            i12++;
        }
        Integer numValueOf = Integer.valueOf(this.f2687l);
        C4070r c4070r = this.f2688m;
        L0.i iVar = c4070r.f45488a.f45525p;
        int[] iArr2 = this.f2689n;
        this.k.invoke(numValueOf, iArr, iVar, c4070r, iArr2);
        int length = tVarArr.length;
        int i13 = 0;
        while (i11 < length) {
            r0.t tVar2 = tVarArr[i11];
            int i14 = i13 + 1;
            AbstractC3340k.b(tVar2);
            ic.d dVar = this.f2691p[i13];
            int iJ = this.f2692q.J(this.f2693r - (i5 == 1 ? tVar2.f44308b : tVar2.f44307a), i5 == 1 ? L0.i.f6806a : this.f2688m.f45488a.f45525p, tVar2);
            if (i5 == 1) {
                r0.s.a(tVar2, iArr2[i13], iJ, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                r0.s.a(tVar2, iJ, iArr2[i13], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            i11++;
            i13 = i14;
        }
        return C2515C.f34653a;
    }
}

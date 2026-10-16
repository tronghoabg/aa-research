package E;

import A7.AbstractC0279p0;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3908m;
import r0.InterfaceC3909n;
import t0.C4070r;

/* loaded from: classes.dex */
public final class I implements InterfaceC3909n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3343n f2696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f2697d;

    /* JADX WARN: Multi-variable type inference failed */
    public I(float f10, int i5, android.support.v4.media.session.b bVar, tf.s sVar) {
        this.f2694a = i5;
        this.f2695b = f10;
        this.f2696c = (AbstractC3343n) sVar;
        this.f2697d = bVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.n, tf.s] */
    @Override // r0.InterfaceC3909n
    public final D0.b a(C4070r measure, P.a aVar, long j8) {
        P.a aVar2 = aVar;
        AbstractC3340k.e(measure, "$this$measure");
        int i5 = this.f2694a;
        int iG = i5 == 1 ? L0.a.g(j8) : L0.a.f(j8);
        int iE = i5 == 1 ? L0.a.e(j8) : L0.a.d(j8);
        int iF = i5 == 1 ? L0.a.f(j8) : L0.a.g(j8);
        int iD = i5 == 1 ? L0.a.d(j8) : L0.a.e(j8);
        int iA = AbstractC0279p0.a(measure, this.f2695b);
        P.d dVar = aVar2.f8964a;
        int i10 = dVar.f8972c;
        r0.t[] tVarArr = new r0.t[i10];
        ic.d[] dVarArr = new ic.d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            ((InterfaceC3908m) aVar2.get(i11)).a();
            dVarArr[i11] = null;
        }
        int i12 = dVar.f8972c;
        int i13 = 0;
        int i14 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i13 < i12) {
            InterfaceC3908m interfaceC3908m = (InterfaceC3908m) aVar2.get(i13);
            ic.d dVar2 = dVarArr[i13];
            int i15 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (iE != Integer.MAX_VALUE) {
                i15 = iE - i14;
            }
            AbstractC3256n.m(i5, AdUnitActivity.EXTRA_ORIENTATION);
            r0.t tVarE = interfaceC3908m.e(i5 == 1 ? xg.g.a(0, i15, 0, iD) : xg.g.a(0, iD, 0, i15));
            iMin = Math.min(iA, (iE - i14) - (i5 == 1 ? tVarE.f44307a : tVarE.f44308b));
            i14 = (i5 == 1 ? tVarE.f44307a : tVarE.f44308b) + iMin + i14;
            iMax = Math.max(iMax, i5 == 1 ? tVarE.f44308b : tVarE.f44307a);
            tVarArr[i13] = tVarE;
            i13++;
            aVar2 = aVar;
        }
        kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E();
        int iMax2 = Math.max(i14 - iMin, iG);
        int iMax3 = Math.max(iMax, Math.max(iF, e7.f39738a));
        int i16 = i5 == 1 ? iMax2 : iMax3;
        int i17 = i5 == 1 ? iMax3 : iMax2;
        int i18 = dVar.f8972c;
        int[] iArr = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            iArr[i19] = 0;
        }
        return pd.f.j(measure, i16, i17, new H(aVar, tVarArr, this.f2696c, iMax2, measure, iArr, this.f2694a, dVarArr, this.f2697d, iMax3, e7));
    }
}

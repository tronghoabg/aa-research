package M0;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3909n;
import t0.C4070r;
import t0.t;

/* loaded from: classes.dex */
public final class b implements InterfaceC3909n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f7234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f7235b;

    public b(o oVar, t tVar) {
        this.f7234a = oVar;
        this.f7235b = tVar;
    }

    @Override // r0.InterfaceC3909n
    public final D0.b a(C4070r measure, P.a aVar, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        int iG = L0.a.g(j8);
        o oVar = this.f7234a;
        if (iG != 0) {
            oVar.getChildAt(0).setMinimumWidth(L0.a.g(j8));
        }
        if (L0.a.f(j8) != 0) {
            oVar.getChildAt(0).setMinimumHeight(L0.a.f(j8));
        }
        int iG2 = L0.a.g(j8);
        int iE = L0.a.e(j8);
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        AbstractC3340k.b(layoutParams);
        int iG3 = i.g(oVar, iG2, iE, layoutParams.width);
        int iF = L0.a.f(j8);
        int iD = L0.a.d(j8);
        ViewGroup.LayoutParams layoutParams2 = oVar.getLayoutParams();
        AbstractC3340k.b(layoutParams2);
        oVar.measure(iG3, i.g(oVar, iF, iD, layoutParams2.height));
        return pd.f.j(measure, oVar.getMeasuredWidth(), oVar.getMeasuredHeight(), new a(oVar, this.f7235b, 0));
    }
}

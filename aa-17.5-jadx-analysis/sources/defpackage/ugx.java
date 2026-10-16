package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
final class ugx implements Runnable, Comparable {
    final /* synthetic */ ugy a;
    private final tox b;
    private final ukp c;
    private final uij d;
    private final uko e;
    private final boolean f;
    private final float g;
    private final wnq h;

    public ugx(ugy ugyVar, usy usyVar, tox toxVar, ukp ukpVar, uij uijVar, wnq wnqVar, uko ukoVar, boolean z) {
        this.a = ugyVar;
        this.b = toxVar;
        this.c = ukpVar;
        this.d = uijVar;
        this.h = wnqVar;
        this.e = ukoVar;
        this.f = z;
        if (usyVar == null) {
            this.g = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        too tooVarB = ukpVar.b();
        int iH = tooVarB.a - usyVar.h();
        float fI = tooVarB.b - usyVar.i();
        float f = iH;
        this.g = (f * f) + (fI * fI);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ugx ugxVar = (ugx) obj;
        yde ydeVar = yde.b;
        tox toxVar = this.b;
        boolean zT = ugy.t(toxVar);
        tox toxVar2 = ugxVar.b;
        return ydc.h(Boolean.compare(ugy.t(toxVar2), zT)).e(toxVar, toxVar2).b(this.g, ugxVar.g).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.x(this.c, this.d, this.h, this.e, this.f);
    }
}

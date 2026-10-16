package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class cgv implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cgv(float f, float f2, ckv ckvVar, int i) {
        this.d = i;
        this.a = f;
        this.b = f2;
        this.c = ckvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ckv, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.d != 0) {
            float f = this.a;
            float f2 = this.b;
            ((cun) obj).r((cuo) this.c, afgi.k(f), afgi.k(f2), BitmapDescriptorFactory.HUE_RED);
            return afak.a;
        }
        cks cksVar = (cks) obj;
        float fA = this.a * cksVar.a();
        float fA2 = this.b * cksVar.a();
        ckr ckrVar = null;
        if (fA > BitmapDescriptorFactory.HUE_RED && fA2 > BitmapDescriptorFactory.HUE_RED) {
            ckrVar = new ckr(fA, fA2);
        }
        ?? r5 = this.c;
        cksVar.v(ckrVar);
        cksVar.C(r5);
        cksVar.s(true);
        return afak.a;
    }

    public /* synthetic */ cgv(cuo cuoVar, float f, float f2, int i) {
        this.d = i;
        this.c = cuoVar;
        this.a = f;
        this.b = f2;
    }
}

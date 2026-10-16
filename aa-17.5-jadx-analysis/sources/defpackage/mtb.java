package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class mtb implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mtb(afeh afehVar, mss mssVar, bym bymVar, float f, boolean z, bym bymVar2, int i) {
        this.g = i;
        this.f = afehVar;
        this.c = mssVar;
        this.d = bymVar;
        this.a = f;
        this.b = z;
        this.e = bymVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        cfy cfyVarJ;
        float f;
        int i = 0;
        if (this.g != 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                cfy cfyVarD = das.d(cfy.e, "top_card_back");
                Object objG = buxVar.g();
                Object obj3 = buw.a;
                if (objG == obj3) {
                    objG = new mii(16);
                    buxVar.x(objG);
                }
                float f2 = this.a;
                ?? r4 = this.d;
                cfy cfyVarK = bxc.k(cfyVarD, (afec) objG);
                boolean zC = buxVar.C(r4) | buxVar.z(f2);
                Object objG2 = buxVar.g();
                if (zC || objG2 == obj3) {
                    objG2 = new msy(f2, (bym) r4, i);
                    buxVar.x(objG2);
                }
                this.f.invoke(new mst((mss) this.c, cjn.f(cfyVarK, (afec) objG2), this.b, ((Boolean) this.e.a()).booleanValue()), buxVar, 8);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            boolean z = this.b;
            float f3 = this.a;
            if (dlj.a(f3, BitmapDescriptorFactory.HUE_RED) < 0) {
                cfv cfvVar = cfy.e;
                if (z) {
                    f = (-f3) + BitmapDescriptorFactory.HUE_RED;
                    i = 1;
                } else {
                    f = 0.0f;
                }
                cfyVarJ = ebj.n(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, i != 0 ? 0.0f : (-f3) + BitmapDescriptorFactory.HUE_RED);
            } else {
                cfv cfvVar2 = cfy.e;
                float f4 = z ? f3 : 0.0f;
                if (true == z) {
                    f3 = 0.0f;
                }
                cfyVarJ = asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f3);
            }
            cfy cfyVar = cfyVarJ;
            Object obj4 = this.f;
            ca.L((afm) this.c, cfyVar, (acp) this.d, (acq) this.e, null, bxc.i(-1317508326, true, new kkw(obj4, 15), buxVar2), buxVar2, 196608, 16);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ mtb(afm afmVar, float f, boolean z, acp acpVar, acq acqVar, afeg afegVar, int i) {
        this.g = i;
        this.c = afmVar;
        this.a = f;
        this.b = z;
        this.d = acpVar;
        this.e = acqVar;
        this.f = afegVar;
    }
}

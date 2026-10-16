package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class obc implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ obc(affv affvVar, float f, adz adzVar, aed aedVar, afec afecVar, int i) {
        this.f = i;
        this.e = affvVar;
        this.a = f;
        this.b = adzVar;
        this.c = aedVar;
        this.d = afecVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cts, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [adz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.f != 0) {
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = ((affv) this.e).a;
            obj2.getClass();
            afp.g((aeb) obj2, jLongValue, this.a, this.b, (aed) this.c, this.d);
            return afak.a;
        }
        cun cunVar = (cun) obj;
        cunVar.getClass();
        ?? r0 = this.b;
        Object obj3 = this.e;
        float f = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        if (r0.p() == dlr.b) {
            aezu aezuVar = obj5 != null ? new aezu(Integer.valueOf(afgi.k(((cuo) obj5).a * 0.8f)), obj5) : obj4 != null ? new aezu(Integer.valueOf(((cuo) obj4).a + afgi.k(f)), obj4) : new aezu(0, null);
            int iIntValue = ((Number) aezuVar.a).intValue();
            cuo cuoVar = (cuo) aezuVar.b;
            cuo cuoVar2 = (cuo) obj3;
            cunVar.r(cuoVar2, iIntValue, 0, BitmapDescriptorFactory.HUE_RED);
            if (cuoVar != null) {
                obg.f(cunVar, cuoVar, cuoVar2.b, 0);
            }
        } else {
            cuo cuoVar3 = (cuo) obj3;
            cunVar.r(cuoVar3, 0, 0, BitmapDescriptorFactory.HUE_RED);
            aezu aezuVar2 = obj5 != null ? new aezu(Integer.valueOf(afgi.k(cuoVar3.a - (((cuo) obj5).a * 0.2f))), obj5) : obj4 != null ? new aezu(Integer.valueOf(cuoVar3.a + afgi.k(f)), obj4) : new aezu(0, null);
            int iIntValue2 = ((Number) aezuVar2.a).intValue();
            cuo cuoVar4 = (cuo) aezuVar2.b;
            if (cuoVar4 != null) {
                obg.f(cunVar, cuoVar4, cuoVar3.b, iIntValue2);
            }
        }
        return afak.a;
    }

    public /* synthetic */ obc(cts ctsVar, cuo cuoVar, cuo cuoVar2, float f, cuo cuoVar3, int i) {
        this.f = i;
        this.b = ctsVar;
        this.c = cuoVar;
        this.d = cuoVar2;
        this.a = f;
        this.e = cuoVar3;
    }
}

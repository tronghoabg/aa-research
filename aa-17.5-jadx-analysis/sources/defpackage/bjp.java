package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class bjp implements afeh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bjp(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.c == 0) {
            cfy cfyVar = (cfy) obj;
            bux buxVar = (bux) obj2;
            ((Integer) obj3).intValue();
            buxVar.v(-196777734);
            final long j = ((blu) buxVar.f(blw.a)).a;
            boolean zB = buxVar.B(j);
            final ?? r2 = this.b;
            boolean zC = zB | buxVar.C(r2);
            final boolean z = this.a;
            boolean zD = zC | buxVar.D(z);
            Object objG = buxVar.g();
            if (zD || objG == buw.a) {
                objG = new afec() { // from class: bjq
                    @Override // defpackage.afec
                    public final Object invoke(Object obj4) {
                        cgz cgzVar = (cgz) obj4;
                        return cgzVar.q(new bjr(r2, z, awx.E(cgzVar, Float.intBitsToFloat((int) (cgzVar.n() >> 32)) / 2.0f), new cjp(j, 5), 0));
                    }
                };
                buxVar.x(objG);
            }
            cfy cfyVarQ = bxc.q(cfyVar, (afec) objG);
            buxVar.o();
            return cfyVarQ;
        }
        bux buxVar2 = (bux) obj2;
        ((Integer) obj3).intValue();
        buxVar2.v(-2137546592);
        Object objF = buxVar2.f(dbc.i);
        Object obj4 = this.b;
        bfb bfbVar = (bfb) obj4;
        boolean z2 = bfbVar.c() == api.a || objF != dlr.b;
        boolean zC2 = buxVar2.C(obj4);
        Object objG2 = buxVar2.g();
        if (zC2 || objG2 == buw.a) {
            objG2 = new bbn(obj4, 20);
            buxVar2.x(objG2);
        }
        bym bymVarC = byx.c((afec) objG2, buxVar2);
        Object objG3 = buxVar2.g();
        Object obj5 = buw.a;
        if (objG3 == obj5) {
            anj anjVar = new anj(new acm(bymVarC, 16));
            buxVar2.x(anjVar);
            objG3 = anjVar;
        }
        aqf aqfVar = (aqf) objG3;
        boolean zC3 = buxVar2.C(aqfVar) | buxVar2.C(obj4);
        Object objG4 = buxVar2.g();
        if (zC3 || objG4 == obj5) {
            objG4 = new bfa(aqfVar, bfbVar);
            buxVar2.x(objG4);
        }
        apu apuVar = new apu((bfa) objG4, bfbVar.c(), this.a && bfbVar.a() != BitmapDescriptorFactory.HUE_RED, z2, null);
        buxVar2.o();
        return apuVar;
    }
}

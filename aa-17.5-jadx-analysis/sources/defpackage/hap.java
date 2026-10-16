package defpackage;

import androidx.car.app.model.Action;

/* loaded from: classes2.dex */
final class hap extends afde implements afeh {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ fwb c;
    final /* synthetic */ geu d;
    final /* synthetic */ ajab e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hap(fwb fwbVar, geu geuVar, ajab ajabVar, afck afckVar) {
        super(3, afckVar);
        this.c = fwbVar;
        this.d = geuVar;
        this.e = ajabVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        Object obj2 = this.a;
        if (this.b || obj2 == null) {
            return this.c;
        }
        fwb fwbVarE = fvr.e((Action) obj2, this.d, null);
        ajab ajabVar = this.e;
        ynz ynzVar = (ynz) haq.a.f().o(ypi.a, "CarApp.H.RowToIm").ai(95);
        gcs gcsVarC = fwbVarE.c();
        ynzVar.y("Offering smart action [%s]", gcsVarC != null ? gcsVarC.toString() : null);
        return fvr.f(fwbVarE, new fwc(ajabVar, fwbVarE, 15), 5);
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        hap hapVar = new hap(this.c, this.d, this.e, (afck) obj3);
        hapVar.a = (Action) obj;
        hapVar.b = zBooleanValue;
        return hapVar.hT(afak.a);
    }
}

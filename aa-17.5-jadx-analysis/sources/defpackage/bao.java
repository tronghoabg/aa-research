package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class bao implements cpt {
    private final bbt a;
    private final api b;
    private final dlr c;

    public bao(bbt bbtVar, api apiVar, dlr dlrVar) {
        this.a = bbtVar;
        this.b = apiVar;
        this.c = dlrVar;
    }

    private final float e(long j) {
        return Float.intBitsToFloat(this.b == api.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    @Override // defpackage.cpt
    public final long a(long j, long j2, int i) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == api.b ? j2 >> 32 : 4294967295L & j2)) == BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.cpt
    public final long b(long j, int i) {
        if (i != 1) {
            return 0L;
        }
        bbt bbtVar = this.a;
        if (Math.abs(bbtVar.c()) <= 1.0E-6d || Math.abs(e(j)) <= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        bbj bbjVarX = bbtVar.x();
        float fC = bbtVar.c() * bbtVar.k();
        int i2 = bbjVarX.b + bbjVarX.c;
        float f = -Math.signum(bbtVar.c());
        float fC2 = bbtVar.c();
        float fE = e(j);
        float f2 = (i2 * f) + fC;
        float f3 = fC2 > BitmapDescriptorFactory.HUE_RED ? fC : f2;
        if (fC2 > BitmapDescriptorFactory.HUE_RED) {
            fC = f2;
        }
        float fD = afpt.d(fE, fC, f3);
        api apiVar = this.b;
        api apiVar2 = api.b;
        float fA = (apiVar == apiVar2 && this.c == dlr.b) ? bbtVar.a(fD) : -bbtVar.a(-fD);
        float fIntBitsToFloat = apiVar == apiVar2 ? fA : Float.intBitsToFloat((int) (j >> 32));
        if (apiVar != api.a) {
            fA = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return a.ah(fIntBitsToFloat, fA);
    }

    @Override // defpackage.cpt
    public final Object c(long j, long j2, afck afckVar) {
        return new dlv(this.b == api.a ? dlv.e(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2) : dlv.e(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1));
    }

    @Override // defpackage.cpt
    public final /* synthetic */ Object d(long j, afck afckVar) {
        return new dlv(0L);
    }
}

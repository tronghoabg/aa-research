package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aru implements arg {
    private final /* synthetic */ int a;
    private final Object b;

    public aru(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [aec, java.lang.Object] */
    @Override // defpackage.arg
    public final /* synthetic */ Object a(apr aprVar, Object obj, Object obj2, afec afecVar, afck afckVar) throws Throwable {
        if (this.a != 0) {
            Object objAq = asl.aq(aprVar, ((Number) obj).floatValue(), ca.B(BitmapDescriptorFactory.HUE_RED, ((Number) obj2).floatValue()), (kwp) this.b, afecVar, afckVar);
            return objAq == afcr.a ? objAq : (bii) objAq;
        }
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        Object objL = asl.l(aprVar, Math.abs(fFloatValue) * Math.signum(fFloatValue2), fFloatValue, ca.B(BitmapDescriptorFactory.HUE_RED, fFloatValue2), this.b, afecVar, afckVar);
        return objL == afcr.a ? objL : (bii) objL;
    }
}

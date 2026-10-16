package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aqi extends afde implements afeg {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ aqk e;
    final /* synthetic */ affu f;
    final /* synthetic */ long g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(aqk aqkVar, affu affuVar, long j, afck afckVar) {
        super(2, afckVar);
        this.e = aqkVar;
        this.f = affuVar;
        this.g = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqi aqiVar = new aqi(this.e, this.f, this.g, afckVar);
        aqiVar.h = obj;
        return aqiVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        aqk aqkVar;
        long j;
        Object obj2;
        Object obj3;
        afcr afcrVar = afcr.a;
        if (this.d != 0) {
            j = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            aqkVar = (aqk) this.h;
            woy.dF(obj);
            obj3 = obj4;
            obj2 = obj5;
        } else {
            woy.dF(obj);
            izj izjVar = (izj) this.h;
            aqk aqkVar2 = this.e;
            aqh aqhVar = new aqh(aqkVar2, izjVar, 0);
            affu affuVar = this.f;
            long j2 = this.g;
            aom aomVar = aqkVar2.b;
            long j3 = affuVar.a;
            float fA = aqkVar2.a(aqkVar2.c == api.b ? Float.intBitsToFloat((int) (j2 >> 32)) : Float.intBitsToFloat((int) (j2 & 4294967295L)));
            this.h = aqkVar2;
            this.a = aqkVar2;
            this.b = affuVar;
            this.c = j3;
            this.d = 1;
            obj = aomVar.a(aqhVar, fA, this);
            if (obj == afcrVar) {
                return afcrVar;
            }
            aqkVar = aqkVar2;
            j = j3;
            obj3 = affuVar;
            obj2 = aqkVar2;
        }
        float fA2 = aqkVar.a(((Number) obj).floatValue());
        ((affu) obj3).a = ((aqk) obj2).c == api.b ? dlv.e(j, fA2, BitmapDescriptorFactory.HUE_RED, 2) : dlv.e(j, BitmapDescriptorFactory.HUE_RED, fA2, 1);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqi) b((izj) obj, (afck) obj2)).hT(afak.a);
    }
}

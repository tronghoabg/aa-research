package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gjb extends afde implements afeg {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjb(dcy dcyVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = dcyVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        Object obj2 = this.c;
        if (i != 0) {
            gjb gjbVar = new gjb((dcy) obj2, afckVar, 1);
            gjbVar.b = ((Number) obj).floatValue();
            return gjbVar;
        }
        gjb gjbVar2 = new gjb((gjc) obj2, afckVar, 0);
        gjbVar2.b = ((Number) obj).floatValue();
        return gjbVar2;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                float f = this.b;
                aqf aqfVar = ((gjc) this.c).a;
                this.a = 1;
                if (ca.aC(aqfVar, f, new aft(1.0f, 1500.0f, null), this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            float f2 = this.b;
            ddu dduVar = ((dcy) this.c).a;
            afeg afegVarC = vq.c(dduVar);
            if (afegVarC == null) {
                crt.a("Required value was null.");
                throw new aezp();
            }
            cja cjaVar = new cja((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            this.a = 1;
            obj = afegVarC.invoke(cjaVar, this);
            if (obj == afcrVar2) {
                return afcrVar2;
            }
        }
        return new Float(Float.intBitsToFloat((int) (((cja) obj).a & 4294967295L)));
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((gjb) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
        }
        return ((gjb) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjb(gjc gjcVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = gjcVar;
    }
}

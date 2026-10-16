package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class ark extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ arn c;
    final /* synthetic */ float d;
    final /* synthetic */ afec e;
    final /* synthetic */ apr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ark(arn arnVar, float f, afec afecVar, apr aprVar, afck afckVar) {
        super(2, afckVar);
        this.c = arnVar;
        this.d = f;
        this.e = afecVar;
        this.f = aprVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ark(this.c, this.d, this.e, this.f, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        ark arkVar;
        Object obj2;
        afcr afcrVar = afcr.a;
        int i = this.b;
        if (i == 0) {
            woy.dF(obj);
            arn arnVar = this.c;
            float f = this.d;
            float fA = arnVar.a.a(f, ca.aj(arnVar.c, f));
            if (Float.isNaN(fA)) {
                asl.d("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            affs affsVar = new affs();
            float fAbs = Math.abs(fA) * Math.signum(f);
            affsVar.a = fAbs;
            afec afecVar = this.e;
            afecVar.invoke(new Float(fAbs));
            apr aprVar = this.f;
            float f2 = affsVar.a;
            aju ajuVar = new aju(affsVar, afecVar, 6);
            this.a = affsVar;
            this.b = 1;
            arkVar = this;
            obj = arnVar.d(aprVar, f2, f, ajuVar, arkVar);
            if (obj != afcrVar) {
                obj2 = affsVar;
            }
        }
        if (i != 1) {
            woy.dF(obj);
            return obj;
        }
        obj2 = this.a;
        woy.dF(obj);
        arkVar = this;
        arn arnVar2 = arkVar.c;
        aed aedVar = (aed) obj;
        float fB = arnVar2.a.b(((Number) aedVar.b()).floatValue());
        if (Float.isNaN(fB)) {
            asl.d("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ((affs) obj2).a = fB;
        Object obj3 = obj2;
        apr aprVar2 = arkVar.f;
        aed aedVarC = ca.C(aedVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 30);
        aec aecVar = arnVar2.b;
        aju ajuVar2 = new aju(obj3, arkVar.e, 7);
        arkVar.a = null;
        arkVar.b = 2;
        Object objL = asl.l(aprVar2, fB, fB, aedVarC, aecVar, ajuVar2, arkVar);
        return objL == afcrVar ? afcrVar : objL;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ark) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ggz extends afde implements afeg {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ adu c;
    final /* synthetic */ bwq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggz(adu aduVar, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.c = aduVar;
        this.d = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        ggz ggzVar = new ggz(this.c, this.d, afckVar);
        ggzVar.b = ((Boolean) obj).booleanValue();
        return ggzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        boolean z;
        aivh aivhVarL;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            z = this.b;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            boolean z2 = this.b;
            adu aduVar = this.c;
            Float f = new Float(true != z2 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            this.b = z2;
            this.a = 1;
            if (aduVar.e(f, this) == afcrVar) {
                return afcrVar;
            }
            z = z2;
        }
        if (!z && (aivhVarL = fxa.l(this.d)) != null) {
            aivhVarL.s(null);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ggz) b(bool, (afck) obj2)).hT(afak.a);
    }
}

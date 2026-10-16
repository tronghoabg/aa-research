package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class ang extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ anh e;
    final /* synthetic */ apr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ang(float f, anh anhVar, apr aprVar, afck afckVar) {
        super(2, afckVar);
        this.d = f;
        this.e = anhVar;
        this.f = aprVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ang(this.d, this.e, this.f, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        float f;
        Object obj2;
        Object obj3;
        kwp kwpVar;
        afe afeVar;
        afcr afcrVar = afcr.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                woy.dF(obj);
            } catch (CancellationException unused) {
                ((affs) obj3).a = ((Number) ((aed) obj2).b()).floatValue();
                f = ((affs) obj3).a;
                return new Float(f);
            }
            f = ((affs) obj3).a;
        } else {
            woy.dF(obj);
            float f2 = this.d;
            if (Math.abs(f2) > 1.0f) {
                affs affsVar = new affs();
                affsVar.a = f2;
                affs affsVar2 = new affs();
                aed aedVarB = ca.B(BitmapDescriptorFactory.HUE_RED, f2);
                try {
                    anh anhVar = this.e;
                    kwpVar = anhVar.b;
                    afeVar = new afe(affsVar2, this.f, affsVar, anhVar, 2);
                    this.a = affsVar;
                    this.b = aedVarB;
                    this.c = 1;
                } catch (CancellationException unused2) {
                    obj2 = aedVarB;
                    obj3 = affsVar;
                    ((affs) obj3).a = ((Number) ((aed) obj2).b()).floatValue();
                    f = ((affs) obj3).a;
                    return new Float(f);
                }
                if (afp.ah(aedVarB, kwpVar, false, afeVar, this) == afcrVar) {
                    return afcrVar;
                }
                obj3 = affsVar;
                f = ((affs) obj3).a;
            } else {
                f = this.d;
            }
        }
        return new Float(f);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ang) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

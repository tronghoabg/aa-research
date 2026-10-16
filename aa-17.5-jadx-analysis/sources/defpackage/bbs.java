package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bbs extends afde implements afeg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbs(baa baaVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.c = baaVar;
        this.b = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        Object obj2 = this.c;
        if (i != 0) {
            return new bbs((baa) obj2, this.b, afckVar, 1);
        }
        return new bbs((bbt) obj2, this.b, afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                Object obj2 = this.c;
                int i2 = this.b;
                azy azyVar = ((baa) obj2).b;
                this.a = 1;
                if (azyVar.f(i2, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            Object obj3 = this.c;
            this.a = 1;
            if (((bbt) obj3).q(this) == afcrVar2) {
                return afcrVar2;
            }
        }
        bbt bbtVar = (bbt) this.c;
        bbtVar.u(bbtVar.f(this.b), BitmapDescriptorFactory.HUE_RED, true);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((bbs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bbs) b((apr) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbs(bbt bbtVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.c = bbtVar;
        this.b = i;
    }
}

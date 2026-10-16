package defpackage;

import android.view.View;

/* loaded from: classes.dex */
final class bhy extends afde implements afeg {
    int a;
    final /* synthetic */ afec b;
    final /* synthetic */ bia c;
    final /* synthetic */ dac d;
    final /* synthetic */ bik e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhy(dac dacVar, afec afecVar, bia biaVar, bik bikVar, afck afckVar) {
        super(2, afckVar);
        this.d = dacVar;
        this.b = afecVar;
        this.c = biaVar;
        this.e = bikVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bhy bhyVar = new bhy(this.d, this.b, this.c, this.e, afckVar);
        bhyVar.f = obj;
        return bhyVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        try {
            if (this.a == 0) {
                woy.dF(obj);
                aitx aitxVar = (aitx) this.f;
                dac dacVar = this.d;
                afec afecVar = bio.a;
                View view = dacVar.a;
                bii biiVar = (bii) afecVar.invoke(view);
                bip bipVar = new bip(view, new bhx(this.e), biiVar);
                if (bhv.a) {
                    ahnc.d(aitxVar, null, 0, new beh(this.c, biiVar, (afck) null, 2), 3);
                }
                afec afecVar2 = this.b;
                if (afecVar2 != null) {
                    afecVar2.invoke(bipVar);
                }
                this.c.a = bipVar;
                this.a = 1;
                if (dacVar.a(bipVar, this) == afcrVar) {
                    return afcrVar;
                }
            } else {
                woy.dF(obj);
            }
            throw new aezp();
        } catch (Throwable th) {
            this.c.a = null;
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bhy) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final /* synthetic */ class bdx implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bdx(bvk bvkVar, ccu ccuVar, aae aaeVar, int i, int i2) {
        this.e = i2;
        this.c = bvkVar;
        this.d = ccuVar;
        this.b = aaeVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [cts, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ((bac) this.b).i((epk) this.c, ((afft) this.d).a, this.a, ((Integer) obj).intValue());
                return afak.a;
            }
            if (obj == this.c) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof cev) {
                int i2 = this.a;
                aae aaeVar = (aae) this.b;
                aaeVar.g(obj, Math.min(((ccu) this.d).a - i2, aaeVar.b(obj, Alert.DURATION_SHOW_INDEFINITELY)));
            }
            return afak.a;
        }
        bdy bdyVar = (bdy) this.b;
        cun cunVar = (cun) obj;
        bff bffVar = (bff) bdyVar.d.invoke();
        dft dftVar = bffVar != null ? bffVar.a : null;
        djy djyVar = bdyVar.c;
        int i3 = bdyVar.b;
        int i4 = this.a;
        cuo cuoVar = (cuo) this.d;
        cjb cjbVarS = asl.S(cunVar, i3, djyVar, dftVar, this.c.p() == dlr.b, cuoVar.a);
        bfb bfbVar = bdyVar.a;
        bfbVar.e(api.b, cjbVarS, i4, cuoVar.a);
        cunVar.x(cuoVar, Math.round(-bfbVar.b()), 0);
        return afak.a;
    }

    public /* synthetic */ bdx(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }
}

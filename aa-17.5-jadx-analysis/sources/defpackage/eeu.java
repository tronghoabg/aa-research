package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class eeu extends afde implements afeg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeu(aixl aixlVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = aixlVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aixl, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            eeu eeuVar = new eeu((aixl) this.c, afckVar, 1);
            eeuVar.b = obj;
            return eeuVar;
        }
        eeu eeuVar2 = new eeu((List) this.c, afckVar, 0);
        eeuVar2.b = obj;
        return eeuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Throwable th;
        aivh aivhVar;
        if (this.d == 0) {
            efd efdVar = (efd) this.b;
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                ?? r8 = this.c;
                ebh ebhVar = eey.a;
                this.b = null;
                this.a = 1;
                if (ebhVar.f(r8, efdVar, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            aivhVar = (aivh) this.b;
            try {
                woy.dF(obj);
                aivhVar.s(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                aivhVar.s(null);
                throw th;
            }
        }
        woy.dF(obj);
        aivh aivhVarD = ahnc.d((aitx) this.b, null, 0, new apf(null), 3);
        try {
            ?? r3 = this.c;
            this.b = aivhVarD;
            this.a = 1;
            Object objD = r3.d(this);
            if (objD == afcrVar2) {
                return afcrVar2;
            }
            obj = objD;
            aivhVar = aivhVarD;
            aivhVar.s(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            aivhVar = aivhVarD;
            aivhVar.s(null);
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((eeu) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((eeu) b((efd) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeu(List list, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = list;
    }
}

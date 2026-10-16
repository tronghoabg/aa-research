package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class jye extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jye(afeg afegVar, dnw dnwVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = afegVar;
        this.c = dnwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            jye jyeVar = new jye((aiyk) this.b, afckVar, (lwb) this.c, 0);
            jyeVar.d = obj;
            return jyeVar;
        }
        if (i != 1) {
            jye jyeVar2 = new jye((aixy) this.b, this.c, afckVar, 2);
            jyeVar2.d = obj;
            return jyeVar2;
        }
        jye jyeVar3 = new jye((afeg) this.b, (dnw) this.c, afckVar, 1);
        jyeVar3.d = obj;
        return jyeVar3;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aixy, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object objDE;
        int i = this.e;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aiyl aiylVar = (aiyl) this.d;
                Object obj2 = this.b;
                hla hlaVar = new hla(aiylVar, (lwb) this.c, 5);
                this.a = 1;
                if (ajal.h((ajal) obj2, hlaVar, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i != 1) {
            afcr afcrVar2 = afcr.a;
            try {
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r7 = this.b;
                    Object obj3 = this.c;
                    this.a = 1;
                    if (r7.h(obj3, this) == afcrVar2) {
                        return afcrVar2;
                    }
                }
                objDE = afak.a;
            } catch (Throwable th) {
                objDE = woy.dE(th);
            }
            return new aixp(aezw.b(objDE) ? afak.a : new aixn(aezw.a(objDE)));
        }
        afcr afcrVar3 = afcr.a;
        try {
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aitx aitxVar = (aitx) this.d;
                ?? r2 = this.b;
                this.a = 1;
                obj = r2.invoke(aitxVar, this);
                if (obj == afcrVar3) {
                    return afcrVar3;
                }
            }
            ((dnw) this.c).b(obj);
        } catch (CancellationException unused) {
            ((dnw) this.c).c();
        } catch (Throwable th2) {
            ((dnw) this.c).d(th2);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((jye) b((aiyl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((jye) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((jye) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jye(aixy aixyVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = aixyVar;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jye(aiyk aiykVar, afck afckVar, lwb lwbVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = aiykVar;
        this.c = lwbVar;
    }
}

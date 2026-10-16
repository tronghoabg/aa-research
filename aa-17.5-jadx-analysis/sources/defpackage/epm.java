package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class epm extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = afecVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aiyk, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.d) {
            case 0:
                epm epmVar = new epm((aiyk) this.b, afckVar, 0);
                epmVar.c = obj;
                return epmVar;
            case 1:
                epm epmVar2 = new epm((afeg) this.b, afckVar, 1);
                epmVar2.c = obj;
                return epmVar2;
            case 2:
                epm epmVar3 = new epm((afeg) this.b, afckVar, 2, (byte[]) null);
                epmVar3.c = obj;
                return epmVar3;
            case 3:
                epm epmVar4 = new epm((afec) this.b, afckVar, 3);
                epmVar4.c = obj;
                return epmVar4;
            case 4:
                epm epmVar5 = new epm((aiyk) this.b, afckVar, 4, (byte[]) null);
                epmVar5.c = obj;
                return epmVar5;
            case 5:
                epm epmVar6 = new epm((ajal) this.b, afckVar, 5);
                epmVar6.c = obj;
                return epmVar6;
            case 6:
                epm epmVar7 = new epm((ajam) this.b, afckVar, 6);
                epmVar7.c = obj;
                return epmVar7;
            default:
                epm epmVar8 = new epm((aiyl) this.b, afckVar, 7);
                epmVar8.c = obj;
                return epmVar8;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    sx sxVar = (sx) this.c;
                    ?? r2 = this.b;
                    epl eplVar = new epl(sxVar, 2);
                    this.a = 1;
                    if (r2.hR(eplVar, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                return afak.a;
            case 1:
                eia eiaVar = (eia) this.c;
                afcr afcrVar2 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r6 = this.b;
                    this.c = null;
                    this.a = 1;
                    obj = r6.invoke(eiaVar, this);
                    if (obj == afcrVar2) {
                        return afcrVar2;
                    }
                }
                eia eiaVar2 = (eia) obj;
                eiaVar2.getClass();
                ((AtomicBoolean) eiaVar2.a.a).set(true);
                return eiaVar2;
            case 2:
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aitx aitxVar = (aitx) this.c;
                    ?? r22 = this.b;
                    this.a = 1;
                    if (r22.invoke(aitxVar, this) == afcrVar3) {
                        return afcrVar3;
                    }
                }
                return afak.a;
            case 3:
                afcr afcrVar4 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                if (((aitx) this.c).c().get(ezi.a) == null) {
                    throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                ?? r62 = this.b;
                this.a = 1;
                Object objInvoke = r62.invoke(this);
                return objInvoke == afcrVar4 ? afcrVar4 : objInvoke;
            case 4:
                afcr afcrVar5 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aixv aixvVar = (aixv) this.c;
                    ?? r23 = this.b;
                    jxy jxyVar = new jxy(aixvVar, 4);
                    this.a = 1;
                    if (r23.hR(jxyVar, this) == afcrVar5) {
                        return afcrVar5;
                    }
                }
                return afak.a;
            case 5:
                afcr afcrVar6 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aixv aixvVar2 = (aixv) this.c;
                    Object obj2 = this.b;
                    this.a = 1;
                    if (((ajal) obj2).b(aixvVar2, this) == afcrVar6) {
                        return afcrVar6;
                    }
                }
                return afak.a;
            case 6:
                afcr afcrVar7 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aiyl aiylVar = (aiyl) this.c;
                    Object obj3 = this.b;
                    this.a = 1;
                    if (((ajam) obj3).g(aiylVar, this) == afcrVar7) {
                        return afcrVar7;
                    }
                }
                return afak.a;
            default:
                afcr afcrVar8 = afcr.a;
                int i = this.a;
                woy.dF(obj);
                if (i == 0) {
                    Object obj4 = this.c;
                    ?? r24 = this.b;
                    this.a = 1;
                    if (r24.a(obj4, this) == afcrVar8) {
                        return afcrVar8;
                    }
                }
                return afak.a;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((epm) b((sx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((epm) b((eia) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((epm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((epm) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((epm) b((aixv) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((epm) b((aixv) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((epm) b((aiyl) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((epm) b(obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(afeg afegVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(aiyk aiykVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(aiyk aiykVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(aiyl aiylVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiylVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(ajal ajalVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = ajalVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(ajam ajamVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = ajamVar;
    }
}

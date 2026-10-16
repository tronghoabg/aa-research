package defpackage;

/* loaded from: classes2.dex */
public final class ajak extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajak(afeh afehVar, aiyl aiylVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = afehVar;
        this.c = aiylVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            ajak ajakVar = new ajak((aiyl) this.b, (ajal) this.c, afckVar, 0);
            ajakVar.d = obj;
            return ajakVar;
        }
        if (i == 1) {
            ajak ajakVar2 = new ajak((aitm) this.c, (afeg) this.b, afckVar, 1);
            ajakVar2.d = obj;
            return ajakVar2;
        }
        if (i != 2) {
            ajak ajakVar3 = new ajak((afeh) this.b, (aiyl) this.c, afckVar, 3);
            ajakVar3.d = obj;
            return ajakVar3;
        }
        ajak ajakVar4 = new ajak((ajaq) this.c, (aiyl) this.b, afckVar, 2);
        ajakVar4.d = obj;
        return ajakVar4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        int i = this.e;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aitx aitxVar = (aitx) this.d;
                ?? r2 = this.b;
                aixx aixxVarE = ((ajal) this.c).e(aitxVar);
                this.a = 1;
                if (aimi.a(r2, aixxVarE, true, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i != 1) {
            if (i != 2) {
                afcr afcrVar2 = afcr.a;
                int i2 = this.a;
                woy.dF(obj);
                if (i2 == 0) {
                    aitx aitxVar2 = (aitx) this.d;
                    ?? r22 = this.b;
                    Object obj3 = this.c;
                    this.a = 1;
                    if (r22.invoke(aitxVar2, obj3, this) == afcrVar2) {
                        return afcrVar2;
                    }
                }
                return afak.a;
            }
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aitx aitxVar3 = (aitx) this.d;
                affv affvVar = new affv();
                ajaq ajaqVar = (ajaq) this.c;
                ajap ajapVar = new ajap(affvVar, aitxVar3, ajaqVar, (aiyl) this.b, 0);
                this.a = 1;
                if (ajaqVar.d.hR(ajapVar, this) == afcrVar3) {
                    return afcrVar3;
                }
            }
            return afak.a;
        }
        afcr afcrVar4 = afcr.a;
        if (this.a != 0) {
            obj2 = (aitm) this.d;
            try {
                woy.dF(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = woy.dE(th);
                aiir.b((aitm) obj2, obj);
                return afak.a;
            }
        } else {
            woy.dF(obj);
            aitx aitxVar4 = (aitx) this.d;
            Object obj4 = this.c;
            ?? r3 = this.b;
            try {
                this.d = obj4;
                this.a = 1;
                obj = r3.invoke(aitxVar4, this);
                if (obj == afcrVar4) {
                    return afcrVar4;
                }
                obj2 = obj4;
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj4;
                obj = woy.dE(th);
                aiir.b((aitm) obj2, obj);
                return afak.a;
            }
        }
        aiir.b((aitm) obj2, obj);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((ajak) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((ajak) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((ajak) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((ajak) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajak(aitm aitmVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = aitmVar;
        this.b = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajak(aiyl aiylVar, ajal ajalVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = aiylVar;
        this.c = ajalVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajak(ajaq ajaqVar, aiyl aiylVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = ajaqVar;
        this.b = aiylVar;
    }
}

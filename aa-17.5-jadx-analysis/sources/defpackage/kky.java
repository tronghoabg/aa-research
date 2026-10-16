package defpackage;

/* loaded from: classes2.dex */
public final class kky extends afde implements afeg {
    int a;
    final /* synthetic */ qn b;
    final /* synthetic */ bym c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kky(kld kldVar, Number number, Number number2, kjz kjzVar, qn qnVar, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.h = i;
        this.d = kldVar;
        this.e = number;
        this.f = number2;
        this.g = kjzVar;
        this.b = qnVar;
        this.c = bymVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [afeh, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.h;
        if (i == 0) {
            ?? r3 = this.d;
            Object obj2 = this.e;
            Object obj3 = this.f;
            return new kky((kld) r3, (Number) obj2, (Number) obj3, (kjz) this.g, this.b, this.c, afckVar, 0);
        }
        if (i != 1) {
            Object obj4 = this.d;
            return new kky((tjp) obj4, (tif) this.g, this.b, this.c, (aitx) this.e, (afeh) this.f, afckVar, 2);
        }
        ?? r32 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f;
        return new kky(r32, (Number) obj5, (Number) obj6, (kjz) this.g, this.b, this.c, afckVar, 1, null);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kld] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        int i = this.h;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                obj2 = ((aezw) obj).a;
            } else {
                woy.dF(obj);
                ?? r3 = this.d;
                Number numberC = r3.c(r3.b(kkz.a(this.c), -1), (Number) this.e, (Number) this.f);
                Object obj4 = this.g;
                this.a = 1;
                Object objG = jul.g((kjz) obj4, numberC, this);
                if (objG == afcrVar) {
                    return afcrVar;
                }
                obj2 = objG;
            }
            kkz.t(obj2, this.b, (kjz) this.g);
            return afak.a;
        }
        if (i != 1) {
            Object obj5 = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            if (i2 == 0) {
                Object obj6 = this.d;
                tif tifVar = (tif) this.g;
                tjp tjpVar = (tjp) obj6;
                tid tidVar = new tid(tjpVar, tifVar, null);
                cct cctVar = new cct(-219075239, true, new gps(this.b, this.c, tifVar, (aitx) this.e, (afeh) this.f, 2));
                this.a = 1;
                bvf bvfVar = tii.a;
                Object objA = ahni.a(new tih(new ncp(wub.ak(4)), cctVar, tjpVar, tidVar, null), this);
                if (objA != obj5) {
                    objA = afak.a;
                }
                if (objA == obj5) {
                    return obj5;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
            obj3 = ((aezw) obj).a;
        } else {
            woy.dF(obj);
            ?? r32 = this.d;
            Number numberC2 = r32.c(r32.b(kkz.a(this.c), 1), (Number) this.e, (Number) this.f);
            Object obj7 = this.g;
            this.a = 1;
            Object objG2 = jul.g((kjz) obj7, numberC2, this);
            if (objG2 == afcrVar2) {
                return afcrVar2;
            }
            obj3 = objG2;
        }
        kkz.t(obj3, this.b, (kjz) this.g);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            return ((kky) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((kky) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((kky) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kky(kld kldVar, Number number, Number number2, kjz kjzVar, qn qnVar, bym bymVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.h = i;
        this.d = kldVar;
        this.e = number;
        this.f = number2;
        this.g = kjzVar;
        this.b = qnVar;
        this.c = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kky(tjp tjpVar, tif tifVar, qn qnVar, bym bymVar, aitx aitxVar, afeh afehVar, afck afckVar, int i) {
        super(2, afckVar);
        this.h = i;
        this.d = tjpVar;
        this.g = tifVar;
        this.b = qnVar;
        this.c = bymVar;
        this.e = aitxVar;
        this.f = afehVar;
    }
}

package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bdo extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdo(bca bcaVar, djv djvVar, bed bedVar, bff bffVar, djn djnVar, afck afckVar, int i) {
        super(2, afckVar);
        this.g = i;
        this.f = bcaVar;
        this.b = djvVar;
        this.c = bedVar;
        this.d = bffVar;
        this.e = djnVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [djn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.g;
        Object obj2 = this.f;
        if (i != 0) {
            ?? r3 = this.d;
            Object obj3 = this.b;
            return new bdo((bed) obj2, (bym) r3, (fbf) obj3, (blr) this.c, (dje) this.e, afckVar, 1);
        }
        Object obj4 = this.b;
        Object obj5 = this.c;
        return new bdo((bca) obj2, (djv) obj4, (bed) obj5, (bff) this.d, (djn) this.e, afckVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [djn, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.g != 0) {
            afcr afcrVar = afcr.a;
            try {
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aiyb aiybVar = new aiyb(new byl(new bap(this.d, 18), null));
                    bdm bdmVar = new bdm((bed) this.f, (fbf) this.b, (blr) this.c, (dje) this.e, 0);
                    this.a = 1;
                    if (aiybVar.hR(bdmVar, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                asl.al((bed) this.f);
                this = afak.a;
                return this;
            } catch (Throwable th) {
                asl.al((bed) this.f);
                throw th;
            }
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            Object obj2 = this.f;
            Object obj3 = this.b;
            Object obj4 = this.c;
            Object obj5 = this.d;
            ?? r5 = this.e;
            bem bemVar = ((bed) obj4).a;
            this.a = 1;
            long j = ((djv) obj3).b;
            long j2 = dfv.a;
            int iA = r5.a(Math.max((int) (j >> 32), (int) (j & 4294967295L)));
            dft dftVar = ((bff) obj5).a;
            Object objA = ((bca) obj2).a(iA < dftVar.a.a.a() ? dftVar.l(iA) : iA != 0 ? dftVar.l(iA - 1) : new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) (bep.a(bemVar.b, bemVar.e, bemVar.g) & 4294967295L)), this);
            if (objA != afcrVar2) {
                objA = afak.a;
            }
            if (objA == afcrVar2) {
                return afcrVar2;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((bdo) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bdo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdo(bed bedVar, bym bymVar, fbf fbfVar, blr blrVar, dje djeVar, afck afckVar, int i) {
        super(2, afckVar);
        this.g = i;
        this.f = bedVar;
        this.d = bymVar;
        this.b = fbfVar;
        this.c = blrVar;
        this.e = djeVar;
    }
}

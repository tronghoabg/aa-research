package defpackage;

/* loaded from: classes2.dex */
public final class nig extends afde implements afeg {
    final /* synthetic */ cqz a;
    final /* synthetic */ afec b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nig(cqz cqzVar, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.a = cqzVar;
        this.b = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            nig nigVar = new nig(this.a, this.b, afckVar, 1, null);
            nigVar.c = obj;
            return nigVar;
        }
        nig nigVar2 = new nig(this.a, this.b, afckVar, 0);
        nigVar2.c = obj;
        return nigVar2;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d != 0) {
            woy.dF(obj);
            ahnc.d((aitx) this.c, null, 0, new ksw(this.a, this.b, (afck) null, 18), 3);
            return afak.a;
        }
        woy.dF(obj);
        ahnc.d((aitx) this.c, null, 0, new ksw(this.a, this.b, (afck) null, 19, (byte[]) null), 3);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((nig) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nig) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nig(cqz cqzVar, afec afecVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.a = cqzVar;
        this.b = afecVar;
    }
}

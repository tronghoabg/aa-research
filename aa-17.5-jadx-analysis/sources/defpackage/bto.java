package defpackage;

/* loaded from: classes.dex */
public final class bto extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(apc apcVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = apcVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            bto btoVar = new bto((btp) this.b, afckVar, 0);
            btoVar.c = obj;
            return btoVar;
        }
        if (i == 1) {
            bto btoVar2 = new bto((apc) this.b, afckVar, 1);
            btoVar2.c = obj;
            return btoVar2;
        }
        Object obj2 = this.b;
        if (i != 2) {
            bto btoVar3 = new bto((byf) obj2, afckVar, 3);
            btoVar3.c = obj;
            return btoVar3;
        }
        bto btoVar4 = new bto((egd) obj2, afckVar, 2);
        btoVar4.c = obj;
        return btoVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2 A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #0 {all -> 0x008c, blocks: (B:35:0x0082, B:43:0x0096, B:46:0x00a2, B:48:0x00b0, B:38:0x0088), top: B:63:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:43:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bto.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((bto) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((bto) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((bto) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bto) b((wci) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(btp btpVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = btpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(byf byfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = byfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(egd egdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = egdVar;
    }
}

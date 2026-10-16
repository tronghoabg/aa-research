package defpackage;

/* loaded from: classes.dex */
public final class ezo extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezo(aiyk aiykVar, aizk aizkVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = aiykVar;
        this.d = aizkVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            ezv ezvVar = (ezv) obj2;
            ezo ezoVar = new ezo(ezvVar, (int[]) this.c, (String[]) this.d, afckVar, 0);
            ezoVar.e = obj;
            return ezoVar;
        }
        if (i != 1) {
            ezo ezoVar2 = new ezo((aiyk) this.c, (aizk) this.d, this.b, afckVar, 2);
            ezoVar2.e = obj;
            return ezoVar2;
        }
        ezo ezoVar3 = new ezo((ezc) this.b, (aitf) this.d, (afeg) this.c, afckVar, 1);
        ezoVar3.e = obj;
        return ezoVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (defpackage.ahnc.a((defpackage.afco) r5, r9, r22) != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r5.B(r6, r22) == r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183 A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:72:0x017c, B:74:0x0183, B:76:0x0195, B:77:0x0198, B:79:0x019d, B:81:0x01a1), top: B:90:0x017c }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [afck] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v19, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezo.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((ezo) b((aiyl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((ezo) b((aizs) obj, (afck) obj2)).hT(afak.a);
        }
        return ((ezo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezo(ezc ezcVar, aitf aitfVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = ezcVar;
        this.d = aitfVar;
        this.c = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezo(ezv ezvVar, int[] iArr, String[] strArr, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = ezvVar;
        this.c = iArr;
        this.d = strArr;
    }
}

package defpackage;

/* loaded from: classes.dex */
final class arc extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ affv c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(affv affvVar, aoe aoeVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = affvVar;
        this.d = aoeVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.f != 0) {
            arc arcVar = new arc(this.c, (aoe) this.d, afckVar, 1);
            arcVar.e = obj;
            return arcVar;
        }
        arc arcVar2 = new arc((ard) this.d, this.c, afckVar, 0);
        arcVar2.e = obj;
        return arcVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0049 -> B:22:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004f -> B:25:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a2 -> B:37:0x00a5). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arc.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((arc) b((afec) obj, (afck) obj2)).hT(afak.a);
        }
        return ((arc) b((izj) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(ard ardVar, affv affvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = ardVar;
        this.c = affvVar;
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class efi extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efi(ard ardVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = ardVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        Object obj2 = this.c;
        if (i != 0) {
            efi efiVar = new efi((ard) obj2, afckVar, 1);
            efiVar.d = obj;
            return efiVar;
        }
        efi efiVar2 = new efi((egd) obj2, afckVar, 0);
        efiVar2.d = obj;
        return efiVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        if (defpackage.aimr.c(r0, r12, r11) != r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x0013, B:16:0x002e, B:19:0x003a, B:21:0x004b, B:11:0x001d), top: B:66:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Type inference failed for: r7v2, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:16:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efi.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((efi) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((efi) b((aiyl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efi(egd egdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = egdVar;
    }
}

package defpackage;

/* loaded from: classes2.dex */
final class fad extends afde implements afec {
    final /* synthetic */ faf a;
    final /* synthetic */ String b;
    final /* synthetic */ afec c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fad(faf fafVar, String str, afec afecVar, afck afckVar) {
        super(1, afckVar);
        this.a = fafVar;
        this.b = str;
        this.c = afecVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Exception {
        woy.dF(obj);
        fca fcaVar = this.a.a;
        String str = this.b;
        afec afecVar = this.c;
        fbk fbkVarA = fcaVar.a(str);
        try {
            Object objInvoke = afecVar.invoke(fbkVarA);
            affa.m(fbkVarA, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fad(this.a, this.b, this.c, (afck) obj).hT(afak.a);
    }
}

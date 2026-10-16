package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aro implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ affs b;
    public final /* synthetic */ apr c;
    public final /* synthetic */ afec d;
    private final /* synthetic */ int e;

    public /* synthetic */ aro(float f, affs affsVar, apr aprVar, afec afecVar, int i) {
        this.e = i;
        this.a = f;
        this.b = affsVar;
        this.c = aprVar;
        this.d = afecVar;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.e == 0) {
            afec afecVar = this.d;
            apr aprVar = this.c;
            affs affsVar = this.b;
            return asl.m(this.a, affsVar, aprVar, afecVar, (aeb) obj);
        }
        aeb aebVar = (aeb) obj;
        float fAbs = Math.abs(((Number) aebVar.a()).floatValue());
        float f = this.a;
        afec afecVar2 = this.d;
        apr aprVar2 = this.c;
        affs affsVar2 = this.b;
        if (fAbs >= Math.abs(f)) {
            float fK = asl.k(((Number) aebVar.a()).floatValue(), f);
            asl.n(aebVar, aprVar2, afecVar2, fK - affsVar2.a);
            aebVar.b();
            affsVar2.a = fK;
        } else {
            asl.n(aebVar, aprVar2, afecVar2, ((Number) aebVar.a()).floatValue() - affsVar2.a);
            affsVar2.a = ((Number) aebVar.a()).floatValue();
        }
        return afak.a;
    }
}

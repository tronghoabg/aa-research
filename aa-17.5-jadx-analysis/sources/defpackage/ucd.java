package defpackage;

/* loaded from: classes3.dex */
public final class ucd {
    private static final too f = new too();
    private static final float[] g = new float[8];
    public int e = 1;
    public final too a = new too();
    public final tpf b = new tpf();
    public final tpf c = new tpf();
    public final tpf d = new tpf();

    public final void a() {
        this.e = 1;
    }

    final boolean b(usy usyVar, float f2, float f3, tpf tpfVar) {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            tpfVar.o(this.b);
            tpf tpfVar2 = this.c;
            tpfVar.f(tpfVar2.b * f2, tpfVar2.c * f2);
            tpf tpfVar3 = this.d;
            tpfVar.f(tpfVar3.b * f3, tpfVar3.c * f3);
            return true;
        }
        too tooVar = this.a;
        too tooVar2 = f;
        float f4 = tooVar.a;
        tpf tpfVar4 = this.c;
        float f5 = tpfVar4.b * f2;
        tpf tpfVar5 = this.d;
        tooVar2.r((int) (f4 + f5 + (tpfVar5.b * f3)), (int) (tooVar.b + (tpfVar4.c * f2) + (tpfVar5.c * f3)));
        return tsw.m(usyVar, tooVar2, tpfVar, g);
    }
}

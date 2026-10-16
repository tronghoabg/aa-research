package defpackage;

/* loaded from: classes3.dex */
final class uwp extends uwr {
    private final float[] d;

    public uwp(float[] fArr, int i, int i2) {
        super(fArr.length, 4, i, i2);
        this.d = fArr;
    }

    @Override // defpackage.uwr
    public final uue a(uud uudVar, String str) {
        uue uueVarQ = uudVar.Q();
        uudVar.g(uueVarQ);
        uudVar.F(this.d, this.a);
        uudVar.v();
        return uueVarQ;
    }

    @Override // defpackage.uwr
    public final uue b(uud uudVar, String str, utz utzVar, int i) {
        int i2 = this.a;
        uue uueVarD = ((uug) utzVar).d(i, uudVar, str, i2 * 4);
        int iF = uug.f(i);
        if (iF == 0) {
            throw null;
        }
        uudVar.H(iF, uueVarD.f, this.d, i2);
        return uueVarD;
    }
}

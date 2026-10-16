package defpackage;

import android.opengl.GLES20;

/* loaded from: classes3.dex */
final class uwq extends uwr {
    private final int[] d;

    public uwq(int[] iArr, int i, int i2) {
        super(iArr.length, 4, i, i2);
        this.d = iArr;
    }

    @Override // defpackage.uwr
    public final uue a(uud uudVar, String str) {
        uue uueVarQ = uudVar.Q();
        uudVar.g(uueVarQ);
        uudVar.M(this.d, this.a);
        uudVar.v();
        return uueVarQ;
    }

    @Override // defpackage.uwr
    public final uue b(uud uudVar, String str, utz utzVar, int i) {
        int i2 = this.a;
        int i3 = i2 * 4;
        uue uueVarD = ((uug) utzVar).d(i, uudVar, str, i3);
        int iF = uug.f(i);
        if (iF == 0) {
            throw null;
        }
        GLES20.glBufferSubData(iF, uueVarD.f, i3, uudVar.C(this.d, i2));
        return uueVarD;
    }
}

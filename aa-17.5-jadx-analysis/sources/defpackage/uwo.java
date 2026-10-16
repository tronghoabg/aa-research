package defpackage;

import android.opengl.GLES20;

/* loaded from: classes3.dex */
public final class uwo extends uwr {
    private final byte[] d;

    public uwo(byte[] bArr, int i, int i2) {
        super(bArr.length, 1, i, i2);
        this.d = bArr;
    }

    @Override // defpackage.uwr
    public final uue a(uud uudVar, String str) {
        uue uueVarQ = uudVar.Q();
        uudVar.g(uueVarQ);
        byte[] bArr = this.d;
        int i = this.a;
        uudVar.o(34962, i, uudVar.B(bArr, i), 35044);
        uudVar.v();
        return uueVarQ;
    }

    @Override // defpackage.uwr
    public final uue b(uud uudVar, String str, utz utzVar, int i) {
        int i2 = this.a;
        uue uueVarD = ((uug) utzVar).d(i, uudVar, str, i2);
        int iF = uug.f(i);
        if (iF == 0) {
            throw null;
        }
        GLES20.glBufferSubData(iF, uueVarD.f, i2, uudVar.B(this.d, i2));
        return uueVarD;
    }
}

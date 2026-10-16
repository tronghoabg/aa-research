package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class aaft {
    public static final /* synthetic */ int a = 0;
    private static final String b = "aaft";
    private final aafp c;
    private final aafp d;
    private final aafp e;
    private final int f;

    public aaft(float[] fArr, short[] sArr, float[] fArr2, int i) {
        aafs aafsVar = aafs.a;
        zkt.e(i != 0, "glShaderProgramHandle");
        this.f = i;
        this.c = aafs.k("vPosition", b(fArr), 3);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asShortBuffer();
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        zkt.n(shortBufferAsShortBuffer, "shortBuffer");
        int iG = aafs.g();
        GLES20.glBindBuffer(34962, iG);
        int iCapacity = shortBufferAsShortBuffer.capacity();
        GLES20.glBufferData(34962, iCapacity + iCapacity, shortBufferAsShortBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
        this.d = new aafp("indexBuffer", iG, 5123, 1);
        this.e = aafs.k("vColor", b(fArr2), 4);
    }

    private static final FloatBuffer b(float[] fArr) {
        FloatBuffer floatBufferH = aafs.h(fArr.length * 4);
        floatBufferH.put(fArr);
        floatBufferH.position(0);
        return floatBufferH;
    }

    public final void a(float[] fArr, String str) {
        String str2 = b;
        if (zrn.e(str2, 2)) {
            Log.v(str2, String.format("%s.gl20Draw(%s,%s)", str, 12, Integer.valueOf(this.f)));
        }
        int i = this.f;
        GLES20.glUseProgram(i);
        aafs.c(i, this.c);
        aafs.c(i, this.e);
        aafp aafpVar = this.d;
        GLES20.glBindBuffer(34963, aafpVar.b);
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i, "uMVPMatrix"), 1, false, fArr, 0);
        GLES20.glDrawElements(4, 12, aafpVar.c, 0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }
}

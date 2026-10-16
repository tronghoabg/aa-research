package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class rb {
    public final FloatBuffer a;
    public final float[] b;
    public final float[] c;
    public int d;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int e = -12345;
    public float o = 0.0f;

    public rb() {
        float[] fArr = new float[16];
        this.b = fArr;
        float[] fArr2 = new float[16];
        this.c = fArr2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = floatBufferAsFloatBuffer;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static int a(String str, String str2) {
        int iC = c(35633, str);
        int iC2 = c(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iC);
        GLES20.glAttachShader(iGlCreateProgram, iC2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        throw new RuntimeException(ad.g("link fail: ", GLES20.glGetProgramInfoLog(iGlCreateProgram)));
    }

    public static int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException(ad.g("compile fail: ", GLES20.glGetShaderInfoLog(iGlCreateShader)));
    }

    public final void b(SurfaceTexture surfaceTexture) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new RuntimeException(ad.b(iGlGetError, "onDrawFrame start: glError "));
        }
        float[] fArr = this.c;
        surfaceTexture.getTransformMatrix(fArr);
        if (this.o <= 0.0f) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
        GLES20.glUseProgram(this.d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.e);
        FloatBuffer floatBuffer = this.a;
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 20, (Buffer) this.a);
        GLES20.glEnableVertexAttribArray(this.h);
        GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 20, (Buffer) this.a);
        GLES20.glEnableVertexAttribArray(this.i);
        float[] fArr2 = this.b;
        Matrix.setIdentityM(fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, fArr, 0);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.d, "uMask");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.d, "uMaskR");
        if (iGlGetUniformLocation >= 0) {
            GLES20.glUniform4f(iGlGetUniformLocation, this.k, this.l, this.m, this.n);
        }
        if (iGlGetUniformLocation2 >= 0) {
            GLES20.glUniform1f(iGlGetUniformLocation2, this.o);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.h);
        GLES20.glDisableVertexAttribArray(this.i);
        GLES20.glFinish();
    }
}

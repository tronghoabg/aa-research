package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.geo.mapcore.renderer.TextureShaderState$TextureShaderProgram;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uwl extends uvx {
    public float a;
    private final float[] b;

    public uwl(Class cls) {
        super(cls);
        float[] fArr = new float[4];
        this.b = fArr;
        this.a = BitmapDescriptorFactory.HUE_RED;
        System.arraycopy(new float[]{1.0f, 1.0f, 1.0f, 1.0f}, 0, fArr, 0, 4);
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        TextureShaderState$TextureShaderProgram textureShaderState$TextureShaderProgram = (TextureShaderState$TextureShaderProgram) this.i;
        textureShaderState$TextureShaderProgram.getClass();
        GLES20.glUniform1i(textureShaderState$TextureShaderProgram.b, 0);
        GLES20.glUniform1f(textureShaderState$TextureShaderProgram.c, this.a);
        uwm uwmVarD = uthVar.d(0);
        if (uwmVarD != null) {
            GLES20.glUniformMatrix3fv(textureShaderState$TextureShaderProgram.a, 1, false, uwmVarD.e.a, 0);
        }
        GLES20.glVertexAttrib4fv(2, this.b, 0);
    }

    public final void b(float f) {
        if (d()) {
            uvr uvrVar = uvr.a;
        }
        float[] fArr = this.b;
        fArr[0] = 1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = f;
    }

    public final void f(float f, float f2, float f3, float f4) {
        if (d()) {
            uvr uvrVar = uvr.a;
        }
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    public uwl() {
        throw null;
    }
}

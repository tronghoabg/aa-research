package defpackage;

import android.opengl.GLES20;

/* loaded from: classes3.dex */
public class uvx {
    private int a = 0;
    protected uvw i;
    protected final Class j;

    protected uvx(Class cls) {
        this.j = cls;
    }

    protected void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        uvw uvwVar = this.i;
        if (uvwVar != null) {
            GLES20.glUniformMatrix4fv(uvwVar.x, 1, false, fArr3, 0);
        }
    }

    public final void c(uud uudVar) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            uvw uvwVarC = uudVar.c(this.j);
            this.i = uvwVarC;
            if (uvwVarC.w != 0) {
                return;
            }
            uvwVarC.w = uudVar.a(uvwVarC.b(), uvwVarC.a(), uvwVarC.c());
            int[] iArr = {0};
            GLES20.glGetIntegerv(35725, iArr, 0);
            uudVar.f(uvwVarC.w);
            uvwVarC.d(uvwVarC.w);
            uudVar.f(iArr[0]);
        }
    }

    public final boolean d() {
        return this.a > 0;
    }

    public final void e() {
        woy.Z(this.a > 0);
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.i = null;
        }
    }
}

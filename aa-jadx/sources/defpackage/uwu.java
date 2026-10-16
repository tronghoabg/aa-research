package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uwu {
    private int a = 0;
    protected defpackage.uwt i;
    protected final java.lang.Class j;

    protected uwu(java.lang.Class cls) {
        this.j = cls;
    }

    protected void a(defpackage.uuz uuzVar, defpackage.uud uudVar, defpackage.utu utuVar, float[] fArr, float[] fArr2, float[] fArr3) {
        defpackage.uwt uwtVar = this.i;
        if (uwtVar != null) {
            android.opengl.GLES20.glUniformMatrix4fv(uwtVar.x, 1, false, fArr3, 0);
        }
    }

    public final void c(defpackage.uuz uuzVar) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            defpackage.uwt uwtVarC = uuzVar.c(this.j);
            this.i = uwtVarC;
            if (uwtVarC.w != 0) {
                return;
            }
            uwtVarC.w = uuzVar.a(uwtVarC.b(), uwtVarC.a(), uwtVarC.c());
            int[] iArr = {0};
            android.opengl.GLES20.glGetIntegerv(35725, iArr, 0);
            uuzVar.f(uwtVarC.w);
            uwtVarC.d(uwtVarC.w);
            uuzVar.f(iArr[0]);
        }
    }

    public final boolean d() {
        return this.a > 0;
    }

    public final void e() {
        defpackage.ysr.bj(this.a > 0);
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.i = null;
        }
    }
}

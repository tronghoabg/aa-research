package com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable;

import android.opengl.GLES20;
import android.view.animation.AnimationUtils;
import defpackage.ajdr;
import defpackage.ohb;
import defpackage.qsb;
import defpackage.usy;
import defpackage.uth;
import defpackage.utl;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;
import defpackage.uwm;

/* loaded from: classes3.dex */
public final class GmmTextureStyleIdShaderState extends uvx {
    public int a;
    public final utl b;
    public final int[] c;

    public static class GmmTextureStyleIdShaderProgram extends uvw {
        public int a;
        public int b;
        public int c;
        public int d;
        private final String[] e;
        private final qsb f;

        public GmmTextureStyleIdShaderProgram() {
            qsb qsbVar = new qsb((int[]) null);
            this.f = qsbVar;
            ohb ohbVar = (ohb) qsbVar.b;
            this.e = new String[]{(String) ohbVar.a, "unused", "unused", (String) ohbVar.b, (String) ohbVar.c};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.f.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.f.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.e;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ajdr ajdrVar = (ajdr) this.f.c;
            this.x = uud.L(i, (String) ajdrVar.b);
            this.a = uud.L(i, (String) ajdrVar.c);
            this.b = uud.L(i, (String) ajdrVar.d);
            this.c = uud.L(i, (String) ajdrVar.e);
            this.d = uud.L(i, (String) ajdrVar.a);
        }
    }

    public GmmTextureStyleIdShaderState() {
        super(GmmTextureStyleIdShaderProgram.class);
        this.b = new utl(true);
        this.c = new int[8];
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        GmmTextureStyleIdShaderProgram gmmTextureStyleIdShaderProgram = (GmmTextureStyleIdShaderProgram) this.i;
        gmmTextureStyleIdShaderProgram.getClass();
        uwm uwmVarD = uthVar.d(0);
        if (uwmVarD != null) {
            GLES20.glUniformMatrix3fv(gmmTextureStyleIdShaderProgram.a, 1, false, uwmVarD.e.a, 0);
        }
        GLES20.glUniform2iv(gmmTextureStyleIdShaderProgram.b, this.a, this.c, 0);
        utl utlVar = this.b;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!utlVar.c(jCurrentAnimationTimeMillis)) {
            uudVar.k = true;
        }
        GLES20.glUniform1f(gmmTextureStyleIdShaderProgram.c, utlVar.a(jCurrentAnimationTimeMillis));
        GLES20.glUniform1i(gmmTextureStyleIdShaderProgram.d, 0);
    }
}

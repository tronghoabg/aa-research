package com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable;

import android.opengl.GLES20;
import defpackage.qsb;
import defpackage.roa;
import defpackage.usy;
import defpackage.uth;
import defpackage.uuc;
import defpackage.uud;
import defpackage.uuz;
import defpackage.uvw;
import defpackage.uvx;
import defpackage.uwm;

/* loaded from: classes3.dex */
public final class GmmStyleTextureShaderState extends uvx {
    public float a;

    public static class StyleTextureShaderProgram extends uvw {
        protected final boolean a;
        protected int b;
        protected int c;
        protected int d;
        private final String[] e;
        private final qsb f;

        public StyleTextureShaderProgram() {
            qsb qsbVar = new qsb((byte[]) null, (short[]) null);
            this.f = qsbVar;
            this.a = uuc.a().b();
            roa roaVar = (roa) qsbVar.b;
            this.e = new String[]{(String) roaVar.b, "unused", "unused", "unused", (String) roaVar.a};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (true != this.a ? "" : "#define VERTEX_TEXTURES\n").concat((String) this.f.a);
        }

        @Override // defpackage.uvw
        public final String b() {
            return (true != this.a ? "" : "#define VERTEX_TEXTURES\n").concat((String) this.f.d);
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.e;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            qsb qsbVar = (qsb) this.f.c;
            this.x = uud.L(i, (String) qsbVar.c);
            this.d = uud.L(i, (String) qsbVar.b);
            this.b = uud.L(i, (String) qsbVar.d);
            this.c = uud.L(i, (String) qsbVar.a);
        }
    }

    public GmmStyleTextureShaderState() {
        super(StyleTextureShaderProgram.class);
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        uuz uuzVar;
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        StyleTextureShaderProgram styleTextureShaderProgram = (StyleTextureShaderProgram) this.i;
        styleTextureShaderProgram.getClass();
        uwm uwmVarD = uthVar.d(0);
        if (uwmVarD != null && (uuzVar = uwmVarD.c) != null) {
            GLES20.glUniform2f(styleTextureShaderProgram.b, 1.0f / uuzVar.e, 1.0f / uuzVar.f);
        }
        GLES20.glUniform1f(styleTextureShaderProgram.d, this.a);
        GLES20.glUniform1i(styleTextureShaderProgram.c, 0);
    }
}

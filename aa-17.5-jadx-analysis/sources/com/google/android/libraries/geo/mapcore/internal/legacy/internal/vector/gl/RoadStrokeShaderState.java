package com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl;

import android.opengl.GLES20;
import defpackage.ajdr;
import defpackage.qsb;
import defpackage.ugn;
import defpackage.usy;
import defpackage.uth;
import defpackage.uuc;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;

/* loaded from: classes3.dex */
public final class RoadStrokeShaderState extends uvx {
    protected float a;
    public float b;
    public final float[] c;
    public float d;
    public final float e;
    public float f;
    public float g;

    public static class RoadShaderProgram extends uvw {
        protected final boolean a;
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        private final String[] i;
        private final String[] j;
        private final qsb k;

        public RoadShaderProgram() {
            qsb qsbVar = new qsb((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
            this.k = qsbVar;
            this.a = uuc.a().b();
            ajdr ajdrVar = (ajdr) qsbVar.b;
            String str = (String) ajdrVar.e;
            String str2 = (String) ajdrVar.a;
            String str3 = (String) ajdrVar.d;
            this.i = new String[]{str, "unused", "unused", "unused", str2, str3};
            this.j = new String[]{str, "unused", "unused", "unused", str2, str3, (String) ajdrVar.b, (String) ajdrVar.c};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (true != this.a ? "" : "#define VERTEX_TEXTURES\n").concat((String) this.k.a);
        }

        @Override // defpackage.uvw
        public final String b() {
            return (true != this.a ? "" : "#define VERTEX_TEXTURES\n").concat((String) this.k.d);
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.a ? this.i : this.j;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ugn ugnVar = (ugn) this.k.c;
            this.x = uud.L(i, (String) ugnVar.g);
            GLES20.glUniform1i(uud.L(i, (String) ugnVar.k), 1);
            if (this.a) {
                GLES20.glUniform1i(uud.L(i, (String) ugnVar.h), 0);
            }
            GLES20.glUniform1i(uud.L(i, (String) ugnVar.j), 0);
            this.b = uud.L(i, (String) ugnVar.f);
            this.d = uud.L(i, (String) ugnVar.e);
            this.e = uud.L(i, (String) ugnVar.d);
            this.f = uud.L(i, (String) ugnVar.i);
            this.c = uud.L(i, (String) ugnVar.c);
            this.g = uud.L(i, (String) ugnVar.b);
            this.h = uud.L(i, (String) ugnVar.a);
        }
    }

    public RoadStrokeShaderState(Class cls, float f) {
        super(cls);
        this.c = new float[4];
        this.d = 1.0f;
        this.f = 1.0f;
        this.e = f;
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        RoadShaderProgram roadShaderProgram = (RoadShaderProgram) this.i;
        roadShaderProgram.getClass();
        GLES20.glUniform1f(roadShaderProgram.b, this.a);
        GLES20.glUniform1f(roadShaderProgram.d, this.f);
        GLES20.glUniform1f(roadShaderProgram.e, 0.03125f);
        GLES20.glUniform4fv(roadShaderProgram.f, 1, this.c, 0);
        GLES20.glUniform1f(roadShaderProgram.c, this.d);
        GLES20.glUniform1f(roadShaderProgram.g, this.b);
        GLES20.glUniform1f(roadShaderProgram.h, this.g);
    }

    public final void b(int i) {
        this.a = i;
    }
}

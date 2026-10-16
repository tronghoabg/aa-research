package com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl;

import android.opengl.GLES20;
import defpackage.qsb;
import defpackage.rjs;
import defpackage.ugm;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;

/* loaded from: classes3.dex */
public final class RoadStrokePointSpriteShaderState extends uvx {
    public boolean a;

    public static class StrokeShaderProgram extends uvw {
        protected int a;
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        private final String[] h;
        private final qsb i;

        public StrokeShaderProgram() {
            qsb qsbVar = new qsb((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            this.i = qsbVar;
            rjs rjsVar = (rjs) qsbVar.b;
            this.h = new String[]{(String) rjsVar.a, "unused", "unused", (String) rjsVar.b, "unused", "unused"};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.i.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.i.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.h;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ugm ugmVar = (ugm) this.i.c;
            this.x = uud.L(i, (String) ugmVar.a);
            this.a = uud.L(i, (String) ugmVar.b);
            this.b = uud.L(i, (String) ugmVar.c);
            this.c = uud.L(i, (String) ugmVar.d);
            this.d = uud.L(i, (String) ugmVar.e);
            this.e = uud.L(i, (String) ugmVar.f);
            this.f = uud.L(i, (String) ugmVar.g);
            this.g = uud.L(i, (String) ugmVar.h);
            GLES20.glUniform1i(this.f, 3);
        }
    }

    public RoadStrokePointSpriteShaderState() {
        super(StrokeShaderProgram.class);
        this.a = false;
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        StrokeShaderProgram strokeShaderProgram = (StrokeShaderProgram) this.i;
        strokeShaderProgram.getClass();
        GLES20.glUniformMatrix4fv(strokeShaderProgram.a, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(strokeShaderProgram.b, 1, false, fArr2, 0);
        GLES20.glUniform1i(strokeShaderProgram.e, this.a ? 1 : 0);
        float f = fArr[0];
        GLES20.glUniform1f(strokeShaderProgram.c, 5.368709E8f * f);
        GLES20.glUniform1f(strokeShaderProgram.d, f * 1.0737418E9f);
        GLES20.glUniform1f(strokeShaderProgram.g, -3.4028235E38f);
    }
}

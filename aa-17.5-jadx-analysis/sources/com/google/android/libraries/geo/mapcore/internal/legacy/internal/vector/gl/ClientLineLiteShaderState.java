package com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl;

import android.graphics.Color;
import android.opengl.GLES20;
import defpackage.ohb;
import defpackage.qsb;
import defpackage.ugd;
import defpackage.uge;
import defpackage.ugg;
import defpackage.ulv;
import defpackage.ulw;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;

/* loaded from: classes3.dex */
public final class ClientLineLiteShaderState extends uge {
    private final float[] k;

    public static class ClientInjectedStrokeLiteShader extends uvw {
        protected int a;
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected int k;
        protected int l;
        protected int m;
        protected int n;
        private final String[] o;
        private final qsb p;

        public ClientInjectedStrokeLiteShader() {
            qsb qsbVar = new qsb();
            this.p = qsbVar;
            ohb ohbVar = (ohb) qsbVar.b;
            this.o = new String[]{(String) ohbVar.a, "unused", "unused", "unused", (String) ohbVar.c, (String) ohbVar.b};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.p.c;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.p.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.o;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ugd ugdVar = (ugd) this.p.a;
            this.a = uud.L(i, ugdVar.m);
            this.b = uud.L(i, ugdVar.n);
            this.c = uud.L(i, ugdVar.j);
            GLES20.glUniform1i(this.a, 1);
            GLES20.glUniform1i(this.b, 2);
            int i2 = this.c;
            double d = ugg.b;
            GLES20.glUniform2iv(i2, 7, ugg.a, 0);
            this.d = uud.L(i, ugdVar.a);
            this.e = uud.L(i, ugdVar.b);
            this.x = uud.L(i, ugdVar.c);
            this.f = uud.L(i, ugdVar.d);
            this.g = uud.L(i, ugdVar.e);
            this.h = uud.L(i, ugdVar.f);
            this.i = uud.L(i, ugdVar.g);
            this.j = uud.L(i, ugdVar.i);
            this.k = uud.L(i, ugdVar.h);
            this.l = uud.L(i, ugdVar.o);
            this.m = uud.L(i, ugdVar.k);
            this.n = uud.L(i, ugdVar.l);
        }
    }

    public ClientLineLiteShaderState(float f, ulw ulwVar) {
        super(ClientInjectedStrokeLiteShader.class, f, ulwVar);
        this.k = new float[16];
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        ulw ulwVar = this.e;
        super.a(uudVar, ulwVar, usyVar, fArr, fArr2, fArr3);
        ClientInjectedStrokeLiteShader clientInjectedStrokeLiteShader = (ClientInjectedStrokeLiteShader) this.i;
        clientInjectedStrokeLiteShader.getClass();
        GLES20.glUniformMatrix4fv(clientInjectedStrokeLiteShader.d, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(clientInjectedStrokeLiteShader.e, 1, false, fArr2, 0);
        ulv ulvVarC = ulwVar.c();
        int i = ulvVarC.e;
        GLES20.glUniform4f(clientInjectedStrokeLiteShader.m, Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
        int i2 = ulvVarC.f;
        GLES20.glUniform4f(clientInjectedStrokeLiteShader.n, Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, Color.alpha(i2) / 255.0f);
        for (int i3 = 0; i3 < 8; i3++) {
            float[] fArr4 = ulvVarC.b;
            if (i3 >= 8) {
                break;
            }
            this.k[i3 + i3] = fArr4[i3];
        }
        GLES20.glUniform2fv(clientInjectedStrokeLiteShader.f, 8, this.k, 0);
        GLES20.glUniform1f(clientInjectedStrokeLiteShader.g, this.b);
        float f = fArr[0];
        GLES20.glUniform1f(clientInjectedStrokeLiteShader.h, 5.368709E8f * f);
        GLES20.glUniform1f(clientInjectedStrokeLiteShader.i, f * 1.0737418E9f);
        GLES20.glUniform1f(clientInjectedStrokeLiteShader.k, 1.0f);
        GLES20.glUniform1i(clientInjectedStrokeLiteShader.j, this.h ? 1 : 0);
        GLES20.glUniform1f(clientInjectedStrokeLiteShader.l, this.g);
    }
}

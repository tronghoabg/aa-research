package com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl;

import android.opengl.GLES20;
import defpackage.ohb;
import defpackage.qsb;
import defpackage.uge;
import defpackage.ugf;
import defpackage.ugg;
import defpackage.ulv;
import defpackage.ulw;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uuz;
import defpackage.uvw;
import defpackage.uwm;

/* loaded from: classes3.dex */
public final class ClientLineStampShaderState extends uge {
    private final float[] k;

    public static class ClientInjectedStrokeShader extends uvw {
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
        protected int o;
        protected int p;
        protected int q;
        protected int r;
        protected int s;
        protected int t;
        protected int u;
        protected int v;
        private final String[] y;
        private final qsb z;

        public ClientInjectedStrokeShader() {
            qsb qsbVar = new qsb(null, null, null, null, null);
            this.z = qsbVar;
            ohb ohbVar = (ohb) qsbVar.b;
            this.y = new String[]{(String) ohbVar.a, "unused", "unused", "unused", (String) ohbVar.c, (String) ohbVar.b};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.z.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.z.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.y;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ugf ugfVar = (ugf) this.z.c;
            this.e = uud.L(i, ugfVar.o);
            this.a = uud.L(i, ugfVar.k);
            this.b = uud.L(i, ugfVar.l);
            this.c = uud.L(i, ugfVar.m);
            this.d = uud.L(i, ugfVar.n);
            this.f = uud.L(i, ugfVar.j);
            GLES20.glUniform1i(this.e, 5);
            GLES20.glUniform1i(this.a, 1);
            GLES20.glUniform1i(this.b, 2);
            GLES20.glUniform1i(this.c, 3);
            GLES20.glUniform1i(this.d, 4);
            int i2 = this.f;
            double d = ugg.b;
            GLES20.glUniform2iv(i2, 7, ugg.a, 0);
            this.g = uud.L(i, ugfVar.a);
            this.h = uud.L(i, ugfVar.b);
            this.x = uud.L(i, ugfVar.c);
            this.i = uud.L(i, ugfVar.d);
            this.j = uud.L(i, ugfVar.e);
            this.k = uud.L(i, ugfVar.f);
            this.l = uud.L(i, ugfVar.g);
            this.m = uud.L(i, ugfVar.i);
            this.n = uud.L(i, ugfVar.h);
            this.o = uud.L(i, ugfVar.w);
            this.p = uud.L(i, ugfVar.p);
            this.q = uud.L(i, ugfVar.q);
            this.r = uud.L(i, ugfVar.r);
            this.s = uud.L(i, ugfVar.s);
            this.t = uud.L(i, ugfVar.t);
            this.u = uud.L(i, ugfVar.u);
            this.v = uud.L(i, ugfVar.v);
        }
    }

    public ClientLineStampShaderState(float f, ulw ulwVar) {
        super(ClientInjectedStrokeShader.class, f, ulwVar);
        this.k = new float[16];
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        uuz uuzVar;
        int i;
        ulw ulwVar = this.e;
        super.a(uudVar, ulwVar, usyVar, fArr, fArr2, fArr3);
        ClientInjectedStrokeShader clientInjectedStrokeShader = (ClientInjectedStrokeShader) this.i;
        clientInjectedStrokeShader.getClass();
        GLES20.glUniformMatrix4fv(clientInjectedStrokeShader.g, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(clientInjectedStrokeShader.h, 1, false, fArr2, 0);
        GLES20.glUniform1f(clientInjectedStrokeShader.v, -3.4028235E38f);
        ulv ulvVarC = ulwVar.c();
        for (int i2 = 0; i2 < 8; i2++) {
            float[] fArr4 = ulvVarC.b;
            if (i2 >= 8) {
                break;
            }
            this.k[i2 + i2] = fArr4[i2];
        }
        GLES20.glUniform2fv(clientInjectedStrokeShader.i, 8, this.k, 0);
        GLES20.glUniform1f(clientInjectedStrokeShader.j, this.b);
        float f = fArr[0];
        GLES20.glUniform1f(clientInjectedStrokeShader.k, 5.368709E8f * f);
        GLES20.glUniform1f(clientInjectedStrokeShader.l, f * 1.0737418E9f);
        float f2 = 1.0f;
        GLES20.glUniform1f(clientInjectedStrokeShader.n, 1.0f);
        GLES20.glUniform1i(clientInjectedStrokeShader.m, this.h ? 1 : 0);
        GLES20.glUniform1i(clientInjectedStrokeShader.o, 0);
        GLES20.glUniform1f(clientInjectedStrokeShader.p, this.f);
        GLES20.glUniform1f(clientInjectedStrokeShader.q, this.g);
        int i3 = clientInjectedStrokeShader.r;
        uwm uwmVarD = ulwVar.d(3);
        if (uwmVarD != null && (uuzVar = uwmVarD.c) != null && (i = uuzVar.f) > 0) {
            f2 = uuzVar.e / i;
        }
        GLES20.glUniform1f(i3, f2);
        GLES20.glUniform1i(clientInjectedStrokeShader.s, ulwVar.b);
        GLES20.glUniform1f(clientInjectedStrokeShader.t, ulvVarC.c);
        GLES20.glUniform1f(clientInjectedStrokeShader.u, ulvVarC.d);
    }
}

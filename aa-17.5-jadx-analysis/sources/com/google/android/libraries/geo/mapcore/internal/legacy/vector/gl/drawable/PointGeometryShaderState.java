package com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable;

import android.opengl.GLES20;
import defpackage.qsb;
import defpackage.roa;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;

/* loaded from: classes3.dex */
public final class PointGeometryShaderState extends uvx {
    public float a;
    public float b;
    public float c;
    public float d;

    public static final class PointGeometryShaderProgram extends uvw {
        public int a;
        private final String[] b;
        private final qsb c;

        public PointGeometryShaderProgram() {
            qsb qsbVar = new qsb((byte[]) null, (char[]) null, (byte[]) null);
            this.c = qsbVar;
            qsb qsbVar2 = (qsb) qsbVar.b;
            this.b = new String[]{(String) qsbVar2.c, "unused", (String) qsbVar2.b, "unused", (String) qsbVar2.d, (String) qsbVar2.a};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.c.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.c.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.b;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            roa roaVar = (roa) this.c.c;
            this.x = uud.L(i, (String) roaVar.a);
            this.a = uud.L(i, (String) roaVar.b);
        }
    }

    public PointGeometryShaderState() {
        super(PointGeometryShaderProgram.class);
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        PointGeometryShaderProgram pointGeometryShaderProgram = (PointGeometryShaderProgram) this.i;
        pointGeometryShaderProgram.getClass();
        GLES20.glUniform4f(pointGeometryShaderProgram.a, this.a, this.d, this.b, this.c);
    }
}

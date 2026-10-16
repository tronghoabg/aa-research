package com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable;

import android.opengl.GLES20;
import defpackage.ohb;
import defpackage.qsb;
import defpackage.rjs;
import defpackage.uid;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;
import java.util.List;

/* loaded from: classes3.dex */
public final class GmmStyleIdShaderState extends uvx {
    private static final int[] b = new int[0];
    public float a;
    private int[] c;
    private int d;

    public static class GmmStyleIdShaderProgram extends uvw {
        protected int a;
        protected int b;
        private final String[] c;
        private final qsb d;

        public GmmStyleIdShaderProgram() {
            qsb qsbVar = new qsb((byte[]) null, (byte[]) null, (char[]) null);
            this.d = qsbVar;
            rjs rjsVar = (rjs) qsbVar.b;
            this.c = new String[]{(String) rjsVar.a, "unused", "unused", "unused", (String) rjsVar.b};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.d.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.d.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.c;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            ohb ohbVar = (ohb) this.d.c;
            this.x = uud.L(i, (String) ohbVar.b);
            this.a = uud.L(i, (String) ohbVar.c);
            this.b = uud.L(i, (String) ohbVar.a);
        }
    }

    public GmmStyleIdShaderState() {
        super(GmmStyleIdShaderProgram.class);
        this.c = b;
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        GmmStyleIdShaderProgram gmmStyleIdShaderProgram = (GmmStyleIdShaderProgram) this.i;
        gmmStyleIdShaderProgram.getClass();
        GLES20.glUniform4iv(gmmStyleIdShaderProgram.a, this.d, this.c, 0);
        GLES20.glUniform1f(gmmStyleIdShaderProgram.b, this.a);
    }

    public final void b(List list) {
        int i = this.d;
        int iMin = Math.min(list.size(), 64);
        this.d = iMin;
        if (iMin != i) {
            this.c = new int[iMin * 4];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d; i3++) {
            uid uidVar = (uid) list.get(i3);
            int i4 = uidVar.a;
            int i5 = uidVar.b;
            int[] iArr = this.c;
            iArr[i2] = i4 >>> 16;
            iArr[i2 + 1] = (char) i4;
            iArr[i2 + 2] = i5 >>> 16;
            iArr[i2 + 3] = (char) i5;
            i2 += 4;
        }
    }
}

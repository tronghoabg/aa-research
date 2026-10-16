package com.google.android.libraries.geo.mapcore.renderer;

import android.graphics.Color;
import android.opengl.GLES20;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;

/* loaded from: classes3.dex */
public final class DefaultShaderState extends uvx {
    private final float[] a;

    public static class DefaultShaderProgram extends uvw {
        private static final String[] a = {"aPosition", "unused", "aColor"};

        @Override // defpackage.uvw
        public final String a() {
            return "precision mediump float;\nvarying vec4 color;\nvoid main() {\n  gl_FragColor = color;\n}\n";
        }

        @Override // defpackage.uvw
        public final String b() {
            return "precision highp float;\nuniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec4 aColor;\nvarying vec4 color;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  color = aColor;\n}\n";
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return a;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            this.x = uud.L(i, "uMVPMatrix");
        }
    }

    public DefaultShaderState() {
        super(DefaultShaderProgram.class);
        this.a = new float[]{Color.red(-1) / 255.0f, Color.green(-1) / 255.0f, Color.blue(-1) / 255.0f, Color.alpha(-1) / 255.0f};
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        GLES20.glVertexAttrib4fv(2, this.a, 0);
    }
}

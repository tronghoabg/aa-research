package com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable;

import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.dlz;
import defpackage.qsb;
import defpackage.rjs;
import defpackage.uia;
import defpackage.uid;
import defpackage.ukp;
import defpackage.ukq;
import defpackage.usy;
import defpackage.uth;
import defpackage.uud;
import defpackage.uvw;
import defpackage.uvx;
import defpackage.uwg;
import java.util.List;

/* loaded from: classes3.dex */
public final class GmmConfigurableTextureStyleIdShaderState extends uvx {
    private static final int[] b = new int[0];
    public float a;
    private int[] c;
    private int[] d;
    private int e;
    private boolean f;
    private ukq g;
    private uwg h;

    public static class GmmConfigurableTextureStyleIdShaderProgram extends uvw {
        public int a;
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
        private final String[] l;
        private final qsb m;

        public GmmConfigurableTextureStyleIdShaderProgram() {
            qsb qsbVar = new qsb((short[]) null, (byte[]) null);
            this.m = qsbVar;
            rjs rjsVar = (rjs) qsbVar.b;
            this.l = new String[]{(String) rjsVar.a, "unused", "unused", "unused", (String) rjsVar.b};
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.m.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.m.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.l;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
            uia uiaVar = (uia) this.m.c;
            this.a = uud.L(i, (String) uiaVar.a);
            this.b = uud.L(i, (String) uiaVar.b);
            this.x = uud.L(i, (String) uiaVar.c);
            this.c = uud.L(i, (String) uiaVar.d);
            this.d = uud.L(i, (String) uiaVar.e);
            this.e = uud.L(i, (String) uiaVar.f);
            this.f = uud.L(i, (String) uiaVar.g);
            this.g = uud.L(i, (String) uiaVar.h);
            this.h = uud.L(i, (String) uiaVar.i);
            this.i = uud.L(i, (String) uiaVar.j);
            this.j = uud.L(i, (String) uiaVar.k);
            this.k = uud.L(i, (String) uiaVar.l);
        }
    }

    public GmmConfigurableTextureStyleIdShaderState() {
        super(GmmConfigurableTextureStyleIdShaderProgram.class);
        int[] iArr = b;
        this.c = iArr;
        this.d = iArr;
    }

    @Override // defpackage.uvx
    protected final void a(uud uudVar, uth uthVar, usy usyVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(uudVar, uthVar, usyVar, fArr, fArr2, fArr3);
        GmmConfigurableTextureStyleIdShaderProgram gmmConfigurableTextureStyleIdShaderProgram = (GmmConfigurableTextureStyleIdShaderProgram) this.i;
        gmmConfigurableTextureStyleIdShaderProgram.getClass();
        uwg uwgVar = this.h;
        if (!this.f || this.g == null || uwgVar == null) {
            GLES20.glUniform1i(gmmConfigurableTextureStyleIdShaderProgram.a, 0);
        } else {
            GLES20.glUniform1i(gmmConfigurableTextureStyleIdShaderProgram.a, 1);
            float fFloor = this.a - ((float) Math.floor(this.a));
            float fPow = (float) Math.pow(2.0d, fFloor);
            GLES20.glUniform1f(gmmConfigurableTextureStyleIdShaderProgram.h, fFloor);
            int i = gmmConfigurableTextureStyleIdShaderProgram.i;
            float fI = dlz.i(((-0.75f) + fFloor) * 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            GLES20.glUniform4f(i, fI, fPow, 1.0f - fI, 1.0f - fFloor);
            int iMax = 1 << Math.max(this.g.a(), 4);
            ukp ukpVar = this.g.a;
            GLES20.glUniform1f(gmmConfigurableTextureStyleIdShaderProgram.f, 1.0f / iMax);
            GLES20.glUniform2f(gmmConfigurableTextureStyleIdShaderProgram.e, ukpVar.b, ukpVar.c);
            GLES20.glUniform1f(gmmConfigurableTextureStyleIdShaderProgram.g, (float) Math.pow(2.0d, r12 - ukpVar.a));
            GLES20.glUniform2f(gmmConfigurableTextureStyleIdShaderProgram.k, 1.0f / uwgVar.d(), 1.0f / uwgVar.c());
            uudVar.x(7, uwgVar.e());
            GLES20.glUniform1i(gmmConfigurableTextureStyleIdShaderProgram.j, 6);
        }
        GLES20.glUniform4iv(gmmConfigurableTextureStyleIdShaderProgram.c, this.e, this.c, 0);
        int i2 = gmmConfigurableTextureStyleIdShaderProgram.d;
        int i3 = this.e;
        GLES20.glUniform4iv(i2, i3 + i3, this.d, 0);
        GLES20.glUniform1f(gmmConfigurableTextureStyleIdShaderProgram.b, this.a);
    }

    public final void b(List list, ukq ukqVar, uwg uwgVar) {
        this.f = false;
        this.g = ukqVar;
        this.h = uwgVar;
        int i = this.e;
        int iMin = Math.min(list.size(), 64);
        this.e = iMin;
        if (iMin != i) {
            this.c = new int[iMin * 4];
            this.d = new int[iMin * 8];
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.e; i4++) {
            uid uidVar = (uid) list.get(i4);
            int i5 = uidVar.a;
            int i6 = uidVar.b;
            int[] iArr = this.c;
            iArr[i2] = i5 >>> 16;
            iArr[i2 + 1] = (char) i5;
            iArr[i2 + 2] = i6 >>> 16;
            iArr[i2 + 3] = (char) i6;
            if (uidVar.d || uidVar.c) {
                this.f = true;
                int[] iArr2 = this.d;
                iArr2[i3] = uidVar.n;
                iArr2[i3 + 1] = uid.a(uidVar.l, uidVar.m);
                int[] iArr3 = this.d;
                iArr3[i3 + 2] = uidVar.j;
                iArr3[i3 + 3] = uidVar.k;
                iArr3[i3 + 4] = uidVar.i;
                iArr3[i3 + 5] = uid.a(uidVar.g, uidVar.h);
                int[] iArr4 = this.d;
                int i7 = i3 + 7;
                iArr4[i3 + 6] = uidVar.e;
                i3 += 8;
                iArr4[i7] = uidVar.f;
            } else {
                int i8 = 0;
                while (i8 < 8) {
                    this.d[i3] = 0;
                    i8++;
                    i3++;
                }
            }
            i2 += 4;
        }
    }
}

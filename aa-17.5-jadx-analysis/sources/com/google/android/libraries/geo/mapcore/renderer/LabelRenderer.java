package com.google.android.libraries.geo.mapcore.renderer;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.aacq;
import defpackage.ajlp;
import defpackage.kex;
import defpackage.qsb;
import defpackage.txa;
import defpackage.uta;
import defpackage.utf;
import defpackage.uud;
import defpackage.uvg;
import defpackage.uvw;
import defpackage.uwg;
import defpackage.uwi;
import defpackage.uwn;
import defpackage.ynz;

/* loaded from: classes3.dex */
public final class LabelRenderer {
    public final LayeredLabelRenderer a;
    public final uta b;
    public int c;
    public int d;

    public LabelRenderer(uvg uvgVar, uud uudVar) {
        LabelShaderProgram labelShaderProgram = new LabelShaderProgram(uudVar);
        LayeredLabelRenderer layeredLabelRenderer = null;
        if (LayeredLabelRenderer.a()) {
            try {
                layeredLabelRenderer = new LayeredLabelRenderer(uvgVar, uudVar);
            } catch (uwn e) {
                ((ynz) ((ynz) ((ynz) LayeredLabelRenderer.a.g()).p(e)).ai((char) 9675)).u("Non fatal exception - could not instantiate LayeredLabelRenderer");
            }
        }
        this.a = layeredLabelRenderer;
        this.b = new uta(4096, 5, new txa(9), uudVar, labelShaderProgram, uvgVar, "label");
    }

    public final void a(uwi uwiVar, utf utfVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        uta utaVar = this.b;
        ajlp ajlpVarE = utaVar.e(uwiVar.i, utfVar, 1);
        if (ajlpVarE != null) {
            float f12 = f5 * 0.5f;
            float f13 = 0.5f * f6;
            float f14 = f12 * f3;
            float f15 = f12 * f4;
            float f16 = f13 * f3;
            float f17 = f - f14;
            float f18 = f2 - f15;
            float f19 = f + f14;
            float f20 = f2 + f15;
            float f21 = f13 * (-f4);
            d(f17 + f21, f18 + f16, f17 - f21, f18 - f16, f19 - f21, f20 - f16, f19 + f21, f16 + f20, f7, f8, f9, f10, f11, ajlpVarE);
            utaVar.f(ajlpVarE);
        }
    }

    public final void b(uwi uwiVar, utf utfVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        uta utaVar = this.b;
        ajlp ajlpVarE = utaVar.e(uwiVar.i, utfVar, 1);
        if (ajlpVarE != null) {
            d(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, ajlpVarE);
            utaVar.f(ajlpVarE);
        }
    }

    public final ajlp c(uwg uwgVar, utf utfVar, int i) {
        return this.b.e(uwgVar, utfVar, i);
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, ajlp ajlpVar) {
        if (f >= BitmapDescriptorFactory.HUE_RED || f3 >= BitmapDescriptorFactory.HUE_RED || f5 >= BitmapDescriptorFactory.HUE_RED || f7 >= BitmapDescriptorFactory.HUE_RED) {
            if (f2 >= BitmapDescriptorFactory.HUE_RED || f4 >= BitmapDescriptorFactory.HUE_RED || f6 >= BitmapDescriptorFactory.HUE_RED || f8 >= BitmapDescriptorFactory.HUE_RED) {
                float f14 = this.c;
                if (f <= f14 || f3 <= f14 || f5 <= f14 || f7 <= f14) {
                    float f15 = this.d;
                    if (f2 <= f15 || f4 <= f15 || f6 <= f15 || f8 <= f15) {
                        Object obj = ajlpVar.b;
                        int i = ajlpVar.a;
                        int i2 = i + 1;
                        ajlpVar.a = i2;
                        float[] fArr = (float[]) obj;
                        fArr[i] = f;
                        int i3 = i + 2;
                        ajlpVar.a = i3;
                        fArr[i2] = f2;
                        int i4 = i + 3;
                        ajlpVar.a = i4;
                        fArr[i3] = f13;
                        int i5 = i + 4;
                        ajlpVar.a = i5;
                        fArr[i4] = f9;
                        int i6 = i + 5;
                        ajlpVar.a = i6;
                        float f16 = f10 + f12;
                        fArr[i5] = f16;
                        int i7 = i + 6;
                        ajlpVar.a = i7;
                        fArr[i6] = f3;
                        int i8 = i + 7;
                        ajlpVar.a = i8;
                        fArr[i7] = f4;
                        int i9 = i + 8;
                        ajlpVar.a = i9;
                        fArr[i8] = f13;
                        int i10 = i + 9;
                        ajlpVar.a = i10;
                        fArr[i9] = f9;
                        int i11 = i + 10;
                        ajlpVar.a = i11;
                        fArr[i10] = f10;
                        int i12 = i + 11;
                        ajlpVar.a = i12;
                        fArr[i11] = f5;
                        int i13 = i + 12;
                        ajlpVar.a = i13;
                        fArr[i12] = f6;
                        int i14 = i + 13;
                        ajlpVar.a = i14;
                        fArr[i13] = f13;
                        int i15 = i + 14;
                        ajlpVar.a = i15;
                        float f17 = f9 + f11;
                        fArr[i14] = f17;
                        int i16 = i + 15;
                        ajlpVar.a = i16;
                        fArr[i15] = f10;
                        int i17 = i + 16;
                        ajlpVar.a = i17;
                        fArr[i16] = f7;
                        int i18 = i + 17;
                        ajlpVar.a = i18;
                        fArr[i17] = f8;
                        int i19 = i + 18;
                        ajlpVar.a = i19;
                        fArr[i18] = f13;
                        int i20 = i + 19;
                        ajlpVar.a = i20;
                        fArr[i19] = f17;
                        ajlpVar.a = i + 20;
                        fArr[i20] = f16;
                    }
                }
            }
        }
    }

    public final void e(ajlp ajlpVar) {
        this.b.f(ajlpVar);
    }

    public static class LabelShaderProgram extends uvw {
        public final int a;
        public final int b;
        public final int c;
        private final String[] d;
        private final qsb e;

        public LabelShaderProgram(uud uudVar) {
            qsb qsbVar = new qsb((char[]) null, (byte[]) null, (char[]) null);
            this.e = qsbVar;
            aacq aacqVar = (aacq) qsbVar.b;
            String[] strArr = {(String) aacqVar.b, (String) aacqVar.a};
            this.d = strArr;
            int iA = uudVar.a((String) qsbVar.d, (String) qsbVar.a, strArr);
            this.w = iA;
            this.a = uud.L(iA, (String) ((kex) qsbVar.c).b);
            this.b = uud.L(this.w, (String) ((kex) qsbVar.c).c);
            this.c = uud.L(this.w, (String) ((kex) qsbVar.c).a);
        }

        @Override // defpackage.uvw
        public final String a() {
            return (String) this.e.a;
        }

        @Override // defpackage.uvw
        public final String b() {
            return (String) this.e.d;
        }

        @Override // defpackage.uvw
        public final String[] c() {
            return this.d;
        }

        @Override // defpackage.uvw
        protected final void d(int i) {
        }
    }
}

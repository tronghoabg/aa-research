package com.google.android.libraries.geo.mapcore.renderer;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.aabc;
import defpackage.ajlp;
import defpackage.kex;
import defpackage.qsb;
import defpackage.txa;
import defpackage.uta;
import defpackage.uuc;
import defpackage.uud;
import defpackage.uvb;
import defpackage.uvg;
import defpackage.uvw;
import defpackage.uwu;
import defpackage.yob;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class LayeredLabelRenderer {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/LayeredLabelRenderer");
    public static final float[] b = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    public static final float[] c = {Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f};
    static final int d = (int) Math.ceil(30.25d);
    public final uta e;
    public final List f = new ArrayList(6);
    public final uwu g = new uwu();

    public LayeredLabelRenderer(uvg uvgVar, uud uudVar) {
        this.e = new uta(256, 33, new txa(10), uudVar, new LayeredLabelShaderProgram(uudVar), uvgVar, "layered_label");
    }

    public static boolean a() {
        return uuc.a().f >= 14 && uuc.a().e >= d;
    }

    public static void b(float f, float f2, List list, int i, float f3, ajlp ajlpVar) {
        int i2 = ajlpVar.a;
        int i3 = i2 + 1;
        ajlpVar.a = i3;
        float[] fArr = (float[]) ajlpVar.b;
        fArr[i2] = f;
        int i4 = i2 + 2;
        ajlpVar.a = i4;
        fArr[i3] = f2;
        ajlpVar.a = i2 + 3;
        fArr[i4] = f3;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i6 = i + i;
            int i7 = i6 + 1;
            uvb uvbVar = (uvb) list.get(i5);
            int i8 = ajlpVar.a;
            int i9 = i8 + 1;
            ajlpVar.a = i9;
            float[] fArr2 = uvbVar.d;
            fArr[i8] = fArr2[i6];
            int i10 = i8 + 2;
            ajlpVar.a = i10;
            fArr[i9] = fArr2[i7];
            int i11 = i8 + 3;
            ajlpVar.a = i11;
            float[] fArr3 = uvbVar.e;
            fArr[i10] = fArr3[i6];
            int i12 = i8 + 4;
            ajlpVar.a = i12;
            fArr[i11] = fArr3[i7];
            ajlpVar.a = i8 + 5;
            fArr[i12] = uvbVar.a;
        }
        int size = 6 - list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = ajlpVar.a;
            int i15 = i14 + 1;
            ajlpVar.a = i15;
            fArr[i14] = -1.0f;
            int i16 = i14 + 2;
            ajlpVar.a = i16;
            fArr[i15] = -1.0f;
            int i17 = i14 + 3;
            ajlpVar.a = i17;
            fArr[i16] = 0.0f;
            int i18 = i14 + 4;
            ajlpVar.a = i18;
            fArr[i17] = 0.0f;
            ajlpVar.a = i14 + 5;
            fArr[i18] = 0.0f;
        }
    }

    public static class LayeredLabelShaderProgram extends uvw {
        public final int a;
        public final int b;
        public final int c;
        private final String[] d;
        private final qsb e;

        public LayeredLabelShaderProgram(uud uudVar) {
            qsb qsbVar = new qsb((byte[]) null, (char[]) null, (char[]) null);
            this.e = qsbVar;
            aabc aabcVar = (aabc) qsbVar.b;
            String[] strArr = {(String) aabcVar.k, (String) aabcVar.b, (String) aabcVar.m, (String) aabcVar.c, (String) aabcVar.g, (String) aabcVar.n, (String) aabcVar.h, (String) aabcVar.a, (String) aabcVar.f, (String) aabcVar.d, (String) aabcVar.l, (String) aabcVar.e, (String) aabcVar.j, (String) aabcVar.i};
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

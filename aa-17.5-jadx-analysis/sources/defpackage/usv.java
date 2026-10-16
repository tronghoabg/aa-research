package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class usv {
    public static final /* synthetic */ int m = 0;
    private static final float[] n = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
    private static final float[] o = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private static final float[] p = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
    public uud a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final qsb l = new qsb((char[]) null);

    public static void b(int[] iArr, int i, int i2, int i3, int i4, boolean z, aeiy aeiyVar, aeye aeyeVar) {
        int i5 = i * 3;
        float f = iArr[i5];
        float f2 = iArr[i5 + 1];
        float f3 = iArr[i5 + 2];
        int i6 = i2 * 3;
        float f4 = iArr[i6];
        float f5 = iArr[i6 + 1];
        float f6 = iArr[i6 + 2];
        int i7 = i3 * 3;
        float f7 = iArr[i7];
        float f8 = iArr[i7 + 1];
        float f9 = iArr[i7 + 2];
        float f10 = f7 - f4;
        float f11 = f8 - f5;
        float f12 = f9 - f6;
        float f13 = f2 - f5;
        float f14 = f - f4;
        float f15 = (f10 * f13) - (f11 * f14);
        float f16 = f3 - f6;
        float f17 = (f14 * f12) - (f10 * f16);
        float f18 = (f11 * f16) - (f12 * f13);
        float fSqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17) + (f15 * f15));
        float[] fArr = n;
        float[] fArr2 = o;
        float[] fArr3 = p;
        float f19 = f18 / fSqrt;
        float f20 = f17 / fSqrt;
        float f21 = f15 / fSqrt;
        int iMin = i4 | (((int) (Math.min((((Math.abs(((fArr[0] * f19) + (fArr[1] * f20)) + (fArr[2] * f21)) + (Math.abs(((fArr2[0] * f19) + (fArr2[1] * f20)) + (fArr2[2] * f21)) * 0.8f)) + (Math.abs(((fArr3[0] * f19) + (fArr3[1] * f20)) + (fArr3[2] * f21)) * 0.5f)) * 0.65f) + 0.35f, 1.0f) * 255.0f)) << 8);
        int i8 = aeiyVar.b / (true != z ? 3 : 4);
        if (z) {
            aeiyVar.c(Float.floatToIntBits(f));
            aeiyVar.c(Float.floatToIntBits(f2));
            aeiyVar.c(Float.floatToIntBits(f3));
            aeiyVar.c(iMin);
            aeiyVar.c(Float.floatToIntBits(f4));
            aeiyVar.c(Float.floatToIntBits(f5));
            aeiyVar.c(Float.floatToIntBits(f6));
            aeiyVar.c(iMin);
            aeiyVar.c(Float.floatToIntBits(f7));
            aeiyVar.c(Float.floatToIntBits(f8));
            aeiyVar.c(Float.floatToIntBits(f9));
            aeiyVar.c(iMin);
        } else {
            aeiyVar.c((((int) f2) << 16) | ((char) f));
            aeiyVar.c((char) f3);
            aeiyVar.c(iMin);
            aeiyVar.c((((int) f5) << 16) | ((char) f4));
            aeiyVar.c((char) f6);
            aeiyVar.c(iMin);
            aeiyVar.c((((int) f8) << 16) | ((char) f7));
            aeiyVar.c((char) f9);
            aeiyVar.c(iMin);
        }
        aeyeVar.i((short) i8);
        aeyeVar.i((short) (i8 + 1));
        aeyeVar.i((short) (i8 + 2));
    }

    public final void a(ArrayList arrayList, usy usyVar) {
        uud uudVar;
        int i;
        int i2;
        float f;
        int i3;
        usv usvVar = this;
        uud uudVar2 = usvVar.a;
        uudVar2.getClass();
        AtomicReference atomicReference = usyVar.a;
        int iH = usyVar.h();
        int i4 = usyVar.i();
        int i5 = ((usz) atomicReference.get()).j;
        float fG = usyVar.g();
        float fD = usyVar.d();
        int i6 = usvVar.d;
        int i7 = usvVar.e;
        int i8 = usvVar.g;
        int i9 = usvVar.f;
        int i10 = usvVar.h;
        int i11 = 2884;
        GLES20.glEnable(2884);
        GLES20.glCullFace(1029);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i11;
            usu usuVar = (usu) ((uth) arrayList.get(i12));
            float f2 = fD;
            if (usuVar.l) {
                int i14 = usuVar.c % 2;
                float f3 = i14 + i14 + (usuVar.b % 2);
                uudVar2.r(f3, f3);
                usx usxVar = usuVar.i;
                uudVar = uudVar2;
                if (usxVar.g && (usxVar.h || usxVar.i)) {
                    i = iH;
                    GLES20.glUniform1f(usvVar.j, usxVar.e);
                    GLES20.glUniform1f(usvVar.k, usxVar.f);
                    i2 = i5;
                    GLES20.glUniform4f(i6, ((((usuVar.f - i) + 536870912) & 1073741823) - 536870912) * f2, (usuVar.g - i4) * f2, (-i5) * f2, usuVar.h * usuVar.e * f2 * 2.4414062E-4f);
                    float f4 = usxVar.l;
                    boolean z = usuVar.j;
                    if (z) {
                        float f5 = (19.0f - fG) / 2.0f;
                        if (f5 < 0.1f) {
                            f5 = 0.1f;
                        }
                        f = f5 <= 1.0f ? f5 : 1.0f;
                        f = 0.001f;
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    GLES20.glUniform1f(i7, f);
                    GLES20.glUniform1f(i8, f);
                    GLES20.glUniform1f(i9, f4);
                    if (z) {
                        i3 = 0;
                        GLES20.glUniform4fv(i10, usxVar.d, usxVar.c, 0);
                    } else {
                        GLES20.glUniform4fv(i10, usxVar.b, usxVar.a, 0);
                        i3 = 0;
                    }
                    while (i3 < usuVar.o.size()) {
                        uue uueVar = (uue) usuVar.o.get(i3);
                        uue uueVar2 = (uue) usuVar.p.get(i3);
                        int iM = usuVar.q.m(i3);
                        if (uueVar.g && uueVar2.g) {
                            GLES20.glBindBuffer(34962, uueVar.d);
                            if (usuVar.k) {
                                GLES20.glVertexAttribPointer(0, 3, 5126, false, 16, 0);
                                GLES20.glVertexAttribPointer(1, 4, 5121, false, 16, 12);
                            } else {
                                GLES20.glVertexAttribPointer(0, 3, 5122, false, 12, 0);
                                GLES20.glVertexAttribPointer(1, 4, 5121, false, 12, 8);
                            }
                            GLES20.glBindBuffer(34963, uueVar2.d);
                            GLES20.glDrawElements(4, iM, 5123, 0);
                        }
                        i3++;
                    }
                }
                i12++;
                usvVar = this;
                i11 = i13;
                fD = f2;
                uudVar2 = uudVar;
                iH = i;
                i5 = i2;
            } else {
                uudVar = uudVar2;
            }
            i2 = i5;
            i = iH;
            i12++;
            usvVar = this;
            i11 = i13;
            fD = f2;
            uudVar2 = uudVar;
            iH = i;
            i5 = i2;
        }
        GLES20.glDisable(i11);
    }
}

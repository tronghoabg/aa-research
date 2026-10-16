package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uwa implements uth {
    private static final uwt a = new uwt(Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE);
    private final int b;
    private final int c;
    private final int d;
    private final utf e;
    private final int f;
    private int g = 0;
    private boolean h = false;
    private final uvg i;

    public uwa(uvg uvgVar, int i, int i2, int i3, utf utfVar) {
        this.i = uvgVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = utfVar;
        this.f = uwb.a(i, i2, i3);
    }

    @Override // defpackage.uth
    public final void A(boolean z) {
        this.h = z;
    }

    @Override // defpackage.uth
    public final boolean B() {
        return true;
    }

    @Override // defpackage.uth
    public final boolean C() {
        return this.g > 0;
    }

    @Override // defpackage.uth
    public final ute E() {
        return ute.a;
    }

    @Override // defpackage.uth
    public final uvp F() {
        return this.e.c();
    }

    @Override // defpackage.uth
    public final uwt G() {
        return a;
    }

    @Override // defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
        uwb uwbVar = this.i.y;
        if (uwbVar == null) {
            return;
        }
        if (!(uthVar instanceof uwa)) {
            uud uudVar = uwbVar.a;
            uudVar.f(uwbVar.c);
            uudVar.n(0, 1);
            uudVar.p(519);
            uudVar.r(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            uudVar.g(uwbVar.b);
            uudVar.k(0);
            int i = uuc.a().f;
            for (int i2 = 1; i2 < i; i2++) {
                uudVar.j(i2);
            }
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        }
        if (this.h) {
            int i3 = this.b;
            int i4 = this.c;
            int i5 = this.d;
            uwbVar.a.s(true, 519, this.f, 248);
            float[] fArr = uwbVar.e;
            too tooVar = uwbVar.f;
            float[] fArr2 = uwbVar.g;
            usz uszVar = (usz) usyVar.a.get();
            float f = uszVar.b;
            float f2 = uszVar.c;
            int i6 = uszVar.h;
            int i7 = uszVar.i;
            if (!usy.v(f / 2.0f, f2 / 2.0f, i6, i7, uszVar.k, uszVar.l, uszVar.m, uszVar.y, tooVar, fArr2)) {
                tooVar.r(i6, i7);
            }
            int i8 = 1073741824 >> i5;
            int i9 = tooVar.a;
            int i10 = (((i3 * i8) - 536870912) + (i8 >> 1)) - i9;
            int i11 = (-(((i4 + 1) * i8) - 536870912)) - i7;
            float f3 = uszVar.t;
            float f4 = i8 * f3;
            fArr[0] = f4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f4;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f4;
            fArr[11] = 0.0f;
            fArr[12] = (a.H(i10) + ((i9 - i6) - r10)) * f3;
            fArr[13] = i11 * f3;
            fArr[14] = 0.0f;
            fArr[15] = 1.0f;
            uxf.b(fArr, uszVar.w, fArr);
            GLES20.glUniformMatrix4fv(uwbVar.d, 1, false, fArr, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (uthVar2 instanceof uwa) {
            return;
        }
        uud uudVar2 = uwbVar.a;
        uudVar2.j(0);
        uudVar2.v();
    }

    @Override // defpackage.uth
    public final uwm d(int i) {
        throw null;
    }

    @Override // defpackage.uth
    public final void e(boolean z) {
        this.g--;
    }

    @Override // defpackage.uth
    public final int i() {
        return this.d;
    }

    @Override // defpackage.uth
    public final utf j() {
        return this.e;
    }

    @Override // defpackage.uth
    public final boolean o() {
        return true;
    }

    @Override // defpackage.uth
    public final umi p() {
        return null;
    }

    @Override // defpackage.uth
    public final void y(uud uudVar) {
        this.g++;
    }

    @Override // defpackage.uth
    public final void h() {
    }

    @Override // defpackage.uth
    public final void b(long j) {
    }
}

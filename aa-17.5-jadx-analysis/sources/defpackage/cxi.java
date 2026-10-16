package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cxi implements dlg {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    final /* synthetic */ cxk d;

    public cxi(cxk cxkVar) {
        this.d = cxkVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.d.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    public final cst n() {
        this.a = true;
        cxk cxkVar = this.d;
        cst cstVarJ = cxkVar.J();
        if (this.b == 9223372034707292159L) {
            this.b = dlf.s(cstVarJ.k(0L));
            this.c = cstVarJ.h();
        }
        cxkVar.L().w.f();
        return cstVarJ;
    }

    public final void o(cuu cuuVar, float f) {
        cxk cxkVar = this.d;
        cyt cytVar = cxkVar.o;
        if (cytVar == null) {
            cytVar = new cyt();
            cxkVar.o = cytVar;
        }
        int iCP = woy.cP(cytVar.b, cuuVar);
        if (iCP >= 0) {
            float[] fArr = cytVar.c;
            if (fArr[iCP] != f) {
                fArr[iCP] = f;
                cytVar.d[iCP] = 1;
                return;
            } else {
                byte[] bArr = cytVar.d;
                if (bArr[iCP] == 2) {
                    bArr[iCP] = 0;
                    return;
                }
                return;
            }
        }
        int i = cytVar.a;
        cuu[] cuuVarArr = cytVar.b;
        if (i == cuuVarArr.length) {
            int i2 = i + i;
            Object[] objArrCopyOf = Arrays.copyOf(cuuVarArr, i2);
            objArrCopyOf.getClass();
            cytVar.b = (cuu[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(cytVar.c, i2);
            fArrCopyOf.getClass();
            cytVar.c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(cytVar.d, i2);
            bArrCopyOf.getClass();
            cytVar.d = bArrCopyOf;
        }
        cytVar.b[i] = cuuVar;
        cytVar.d[i] = 3;
        cytVar.c[i] = f;
        cytVar.a++;
    }

    public final void p() {
        this.a = false;
    }
}

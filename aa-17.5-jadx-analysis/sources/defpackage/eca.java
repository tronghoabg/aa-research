package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class eca implements View.OnApplyWindowInsetsListener {
    final ebx a;
    private ecy b;

    public eca(View view, ebx ebxVar) {
        ecy ecyVarA;
        this.a = ebxVar;
        int[] iArr = ebm.a;
        ecy ecyVarA2 = ebf.a(view);
        if (ecyVarA2 != null) {
            ecyVarA = (Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVarA2) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVarA2) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVarA2) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVarA2) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVarA2) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVarA2) : new ecf(ecyVarA2)).a();
        } else {
            ecyVarA = null;
        }
        this.b = ecyVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = ecy.q(windowInsets, view);
            return ecb.a(view, windowInsets);
        }
        ecy ecyVarQ = ecy.q(windowInsets, view);
        ecy ecyVarA = this.b;
        if (ecyVarA == null) {
            int[] iArr = ebm.a;
            ecyVarA = ebf.a(view);
            this.b = ecyVarA;
        }
        if (ecyVarA == null) {
            this.b = ecyVarQ;
            return ecb.a(view, windowInsets);
        }
        ebx ebxVarB = ecb.b(view);
        if (ebxVarB != null && Objects.equals(ebxVarB.e, ecyVarQ)) {
            return ecb.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        ecy ecyVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            dve dveVarF = ecyVarQ.f(i);
            dve dveVarF2 = ecyVar.f(i);
            int i2 = dveVarF.b;
            int i3 = dveVarF2.b;
            boolean z = i2 > i3 || dveVarF.c > dveVarF2.c || dveVarF.d > dveVarF2.d || dveVarF.e > dveVarF2.e;
            if (z != (i2 < i3 || dveVarF.c < dveVarF2.c || dveVarF.d < dveVarF2.d || dveVarF.e < dveVarF2.e)) {
                if (z) {
                    iArr2[0] = iArr2[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
        }
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        int i6 = i4 | i5;
        if (i6 == 0) {
            this.b = ecyVarQ;
            return ecb.a(view, windowInsets);
        }
        ecy ecyVar2 = this.b;
        lds ldsVar = new lds(i6, (i4 & 8) != 0 ? ecb.a : (i5 & 8) != 0 ? ecb.b : (i4 & 519) != 0 ? ecb.c : (i5 & 519) != 0 ? ecb.d : null, (i6 & 8) != 0 ? 160L : 250L);
        ldsVar.W(BitmapDescriptorFactory.HUE_RED);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(ldsVar.U());
        dve dveVarF3 = ecyVarQ.f(i6);
        dve dveVarF4 = ecyVar2.f(i6);
        int i7 = dveVarF3.b;
        int i8 = dveVarF4.b;
        int i9 = dveVarF3.c;
        int i10 = dveVarF4.c;
        int i11 = dveVarF3.d;
        int i12 = dveVarF4.d;
        int i13 = dveVarF3.e;
        int i14 = dveVarF4.e;
        ebw ebwVar = new ebw(dve.e(Math.min(i7, i8), Math.min(i9, i10), Math.min(i11, i12), Math.min(i13, i14)), dve.e(Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        ecb.e(view, ldsVar, ecyVarQ, false);
        duration.addUpdateListener(new eby(ldsVar, ecyVarQ, ecyVar2, i6, view));
        duration.addListener(new ebz(ldsVar, view));
        eal.b(view, new xx(view, ldsVar, ebwVar, duration, 2));
        this.b = ecyVarQ;
        return ecb.a(view, windowInsets);
    }
}

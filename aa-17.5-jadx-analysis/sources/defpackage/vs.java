package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.autofill.AutofillValue;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class vs {
    public static final bmv a(bng bngVar) {
        bmv bmvVar = bngVar.Y;
        if (bmvVar != null) {
            return bmvVar;
        }
        bmv bmvVar2 = new bmv(bnh.e(bngVar, 39), bnh.a(bngVar, bnh.e(bngVar, 39)), cjn.l(cjv.h(bnh.e(bngVar, 44), 0.38f), bnh.e(bngVar, 39)), cjv.h(bnh.a(bngVar, bnh.e(bngVar, 39)), 0.38f));
        bngVar.Y = bmvVar2;
        return bmvVar2;
    }

    public static final bmv b(bux buxVar) {
        return a(czz.at(buxVar));
    }

    public static final bmv c(long j, long j2, bux buxVar, int i) {
        bux buxVar2;
        long jD;
        long jN = (i & 1) != 0 ? cjn.n() : j;
        if ((i & 2) != 0) {
            buxVar2 = buxVar;
            jD = bnh.d(jN, buxVar2);
        } else {
            buxVar2 = buxVar;
            jD = j2;
        }
        long jN2 = cjn.n();
        long jH = cjv.h(jD, 0.38f);
        bmv bmvVarA = a(czz.at(buxVar2));
        if (jN == 16) {
            jN = bmvVarA.a;
        }
        long j3 = jN;
        if (jD == 16) {
            jD = bmvVarA.b;
        }
        long j4 = jD;
        if (jN2 == 16) {
            jN2 = bmvVarA.c;
        }
        long j5 = jN2;
        if (jH == 16) {
            jH = bmvVarA.d;
        }
        return new bmv(j3, j4, j5, jH);
    }

    public static final bmw d(int i) {
        return new bmw(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (i & 8) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public static final CharSequence e(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? afyh.y(charSequence, 4999) : afyh.y(charSequence, 5000);
    }

    public static final AutofillValue f(String str) {
        return AutofillValue.forText(e(str));
    }

    public static final View g(cfx cfxVar) {
        View viewH = bzi.q(cfxVar.q).h();
        if (viewH != null) {
            return viewH;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final boolean h(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final void i(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static final dem j(boolean z) {
        return z ? dem.a : dem.b;
    }

    public static final boolean k(ddu dduVar) {
        return dduVar.g().f(ddx.C);
    }
}

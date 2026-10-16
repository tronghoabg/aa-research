package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class eee {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void d(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void e(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            d(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void f(ActionMode.Callback callback) {
        if (callback instanceof eei) {
            throw null;
        }
    }

    public static final void g(eqa eqaVar, ery eryVar, afec afecVar, bux buxVar, int i) {
        int i2;
        eqa eqaVar2;
        ery eryVar2;
        afec afecVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(912823238);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(eqaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(eryVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean zE = buxVarC.E(eryVar) | ((i2 & 896) == 256) | buxVarC.E(eqaVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                eqaVar2 = eqaVar;
                eryVar2 = eryVar;
                afecVar2 = afecVar;
                acg acgVar = new acg(eqaVar2, eryVar2, afecVar2, 16, (int[]) null);
                bvvVar.ad(acgVar);
                objS = acgVar;
            } else {
                eqaVar2 = eqaVar;
                eryVar2 = eryVar;
                afecVar2 = afecVar;
            }
            bvq.b(eqaVar2, eryVar2, (afec) objS, buxVarC);
        } else {
            eqaVar2 = eqaVar;
            eryVar2 = eryVar;
            afecVar2 = afecVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(eqaVar2, eryVar2, afecVar2, i, 3, (char[]) null);
        }
    }

    public static final void h(epr eprVar, eqa eqaVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-709389590);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.A(eprVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                eqaVar = (eqa) buxVarC.f(erz.a);
            } else {
                buxVarC.s();
            }
            buxVarC.l();
            if (eprVar == epr.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            bym bymVarC = byx.c(afdrVar, buxVarC);
            boolean zC = buxVarC.C(bymVarC) | ((i2 & 14) == 4) | buxVarC.E(eqaVar);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new cib(eqaVar, eprVar, bymVarC, i4);
                bvvVar.ad(objS);
            }
            bvq.c(eqaVar, (afec) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        eqa eqaVar2 = eqaVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(eprVar, eqaVar2, afdrVar, i, 5, (char[]) null);
        }
    }

    public static final void i(Object obj, eqa eqaVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1220373486);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                eqaVar = (eqa) buxVarC.f(erz.a);
            } else {
                buxVarC.s();
            }
            buxVarC.l();
            boolean zC = buxVarC.C(obj) | buxVarC.C(eqaVar);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new ery(eqaVar.getLifecycle());
                bvvVar.ad(objS);
            }
            g(eqaVar, (ery) objS, afecVar, buxVarC, i2 & 896);
        } else {
            buxVarC.s();
        }
        eqa eqaVar2 = eqaVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(obj, eqaVar2, afecVar, i, 4);
        }
    }

    public static final eru j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            eru eruVar = tag instanceof eru ? (eru) tag : null;
            if (eruVar != null) {
                return eruVar;
            }
            Object objH = ebe.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final void k(View view, eru eruVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, eruVar);
    }

    public static boolean l(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (bArr[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "AUDIO_FORMAT_48000_MONO" : "AUDIO_FORMAT_16000_MONO" : "AUDIO_FORMAT_48000_STEREO" : "AUDIO_FORMAT_UNSPECIFIED";
    }

    public static final boolean n(Context context) {
        context.getClass();
        if (!acuc.a.gu().b()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return context.getPackageManager().hasSystemFeature("android.software.activities_on_secondary_displays");
        }
        woy.ae(context.getPackageManager().hasSystemFeature("android.software.activities_on_secondary_displays"), "FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS is missing on Android U+ device", new Object[0]);
        return true;
    }
}

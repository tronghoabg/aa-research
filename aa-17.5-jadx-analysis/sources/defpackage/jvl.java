package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class jvl extends FrameLayout {
    final /* synthetic */ jvm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvl(View view, jvm jvmVar, Context context) {
        super(context);
        this.a = jvmVar;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        ecy ecyVarQ = ecy.q(windowInsets, this);
        dve dveVarF = ecyVarQ.f(527);
        ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVarQ) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVarQ) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVarQ) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVarQ) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVarQ) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVarQ) : new ecf(ecyVarQ);
        int i = dveVarF.b;
        int i2 = this.a.w;
        eclVar.g(527, dve.e(i + i2, dveVarF.c + i2, dveVarF.d + i2, dveVarF.e + i2));
        WindowInsets windowInsetsE = eclVar.a().e();
        if (windowInsetsE != null) {
            windowInsets = windowInsetsE;
        }
        WindowInsets windowInsetsDispatchApplyWindowInsets = super.dispatchApplyWindowInsets(windowInsets);
        windowInsetsDispatchApplyWindowInsets.getClass();
        return windowInsetsDispatchApplyWindowInsets;
    }
}

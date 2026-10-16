package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
final class ebd implements View.OnApplyWindowInsetsListener {
    ecy a = null;
    final /* synthetic */ View b;
    final /* synthetic */ eaj c;

    public ebd(View view, eaj eajVar) {
        this.b = view;
        this.c = eajVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ecy ecyVarQ = ecy.q(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            ebe.d(windowInsets, this.b);
            if (ecyVarQ.equals(this.a)) {
                return this.c.a(view, ecyVarQ).e();
            }
        }
        this.a = ecyVarQ;
        ecy ecyVarA = this.c.a(view, ecyVarQ);
        if (Build.VERSION.SDK_INT >= 30) {
            return ecyVarA.e();
        }
        int[] iArr = ebm.a;
        view.requestApplyInsets();
        return ecyVarA.e();
    }
}

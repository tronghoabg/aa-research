package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class dmb implements ctp {
    final /* synthetic */ dme a;
    final /* synthetic */ cxb b;

    public dmb(dme dmeVar, cxb cxbVar) {
        this.a = dmeVar;
        this.b = cxbVar;
    }

    private final int f(int i) {
        dme dmeVar = this.a;
        dmeVar.measure(dme.n(0, i, dmeVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return dmeVar.getMeasuredHeight();
    }

    private final int g(int i) {
        dme dmeVar = this.a;
        dmeVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), dme.n(0, i, dmeVar.getLayoutParams().height));
        return dmeVar.getMeasuredWidth();
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        dme dmeVar = this.a;
        if (dmeVar.getChildCount() == 0) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new cmj(18));
        }
        if (dle.d(j) != 0) {
            dmeVar.getChildAt(0).setMinimumWidth(dle.d(j));
        }
        if (dle.c(j) != 0) {
            dmeVar.getChildAt(0).setMinimumHeight(dle.c(j));
        }
        dmeVar.measure(dme.n(dle.d(j), dle.b(j), dmeVar.getLayoutParams().width), dme.n(dle.c(j), dle.a(j), dmeVar.getLayoutParams().height));
        return ctsVar.eK(dmeVar.getMeasuredWidth(), dmeVar.getMeasuredHeight(), afbf.a, new bpi(dmeVar, this.b, 9));
    }
}

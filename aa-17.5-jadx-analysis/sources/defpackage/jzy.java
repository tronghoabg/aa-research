package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* loaded from: classes2.dex */
public final /* synthetic */ class jzy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jzy(LinearLayout linearLayout, int i, int i2) {
        this.c = i2;
        this.b = linearLayout;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            ((StandardDialpadView) this.b).e(((oeb) StandardDialpadView.b.get(this.a)).a);
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.al).l());
            return;
        }
        if (i == 1) {
            ((MaterialStandardDialpadView) this.b).e(((oeb) MaterialStandardDialpadView.b.get(this.a)).a);
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.al).l());
            return;
        }
        if (i == 2) {
            ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.b).b(((oeb) com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView.b.get(this.a)).a);
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.al).l());
            return;
        }
        woa woaVar = ((wos) this.b).a;
        Month monthD = Month.d(this.a, woaVar.c.b);
        CalendarConstraints calendarConstraints = woaVar.b;
        Month month = calendarConstraints.a;
        if (monthD.compareTo(month) < 0) {
            monthD = month;
        } else {
            Month month2 = calendarConstraints.b;
            if (monthD.compareTo(month2) > 0) {
                monthD = month2;
            }
        }
        woaVar.c(monthD);
        woaVar.h(1);
        MaterialButton materialButton = woaVar.h;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public jzy(wos wosVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = wosVar;
    }
}

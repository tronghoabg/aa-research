package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wok extends mo {
    final TextView s;
    final MaterialCalendarGridView t;

    public wok(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.s = textView;
        ebm.p(textView, true);
        this.t = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}

package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xcp extends xcg {
    public static final yph a = yph.c("GH.FRX");

    @Override // defpackage.xcg
    protected final ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.frx_terms_of_services, viewGroup, false);
        Button button = (Button) view.findViewById(R.id.left_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tos_body);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.data_notice_header);
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.data_notice_body);
        button.setVisibility(0);
        button.setText(getString(R.string.frx_no_thanks));
        button.setOnClickListener(new xao(this, 17));
        if (((xcj) b().l).u()) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return viewGroup2;
    }

    @Override // defpackage.xcg
    protected final void d() {
        xcj xcjVar = (xcj) b().l;
        ono onoVar = new ono(xcjVar.c());
        onoVar.g("car_tos_main", 1);
        if (xcjVar.u()) {
            onoVar.g("car_tos_data", 2);
            b().f("EVENT_PROJECTED_MODE_TOS_ACCEPTED", null);
        } else {
            b().f("EVENT_VANAGON_MODE_TOS_ACCEPTED", null);
        }
        c(yzy.bH);
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xbu extends xcg {
    public static final yph a = yph.c("GH.FRX");
    public Drawable c;
    public Drawable d;

    private final void h(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R.id.data_notice_entry_body);
        textView.post(new uze((Object) this, (Object) textView, (Object) viewGroup, 5, (char[]) null));
    }

    @Override // defpackage.xcg
    protected final ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.frx_cakewalk_data_notice, viewGroup, false);
        ((ImageView) viewGroup2.findViewById(R.id.tos_icon)).setImageDrawable(getActivity().getDrawable(R.drawable.ic_car_24));
        ((TextView) viewGroup2.findViewById(R.id.tos_header)).setText(R.string.data_notice_title);
        Button button = (Button) view.findViewById(R.id.left_button);
        button.setVisibility(0);
        button.setText(getString(R.string.common_exit));
        button.setOnClickListener(new xao(this, 7, null));
        this.c = getActivity().getDrawable(2131233113);
        this.d = getActivity().getDrawable(2131233115);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.data_charges);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.phone_to_car);
        ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(R.id.car_to_phone);
        ((TextView) viewGroup3.findViewById(R.id.data_notice_entry_title)).setText(R.string.data_charges_title);
        ((ImageView) viewGroup3.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getActivity().getDrawable(2131233153));
        ((ImageView) viewGroup3.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.c);
        ((TextView) viewGroup3.findViewById(R.id.data_notice_entry_body)).setText(R.string.data_charges_body);
        ((TextView) viewGroup4.findViewById(R.id.data_notice_entry_title)).setText(R.string.phone_to_car_title);
        ((ImageView) viewGroup4.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getActivity().getDrawable(R.drawable.ic_car_24));
        ((ImageView) viewGroup4.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.c);
        ((TextView) viewGroup4.findViewById(R.id.data_notice_entry_body)).setText(R.string.phone_to_car_body);
        ((TextView) viewGroup5.findViewById(R.id.data_notice_entry_title)).setText(R.string.car_to_phone_title);
        ((ImageView) viewGroup5.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getActivity().getDrawable(R.drawable.quantum_ic_phone_android_vd_theme_24));
        ((ImageView) viewGroup5.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.c);
        ((TextView) viewGroup5.findViewById(R.id.data_notice_entry_body)).setText(R.string.car_to_phone_body);
        h(viewGroup3);
        h(viewGroup4);
        h(viewGroup5);
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

    @Override // defpackage.xcg
    protected final void e() {
        this.g.setText(getString(true != this.i ? R.string.frx_more : R.string.common_ok));
    }

    @Override // defpackage.xcg
    public final void f() {
        if (isAdded()) {
            this.i = this.e.getScrollY() + this.e.getHeight() >= this.e.getChildAt(0).getBottom();
            e();
        }
    }

    public final void g(View view) {
        ((TextView) view.findViewById(R.id.data_notice_entry_body)).setMaxLines(3);
        view.setOnClickListener(new xao(this, 9));
    }
}

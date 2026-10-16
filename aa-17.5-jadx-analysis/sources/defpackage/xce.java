package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

/* loaded from: classes3.dex */
public final class xce extends xcg {
    public static final yph a = yph.c("GH.FRX");
    private boolean c = true;

    @Override // defpackage.xcg
    protected final ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2;
        if (((xcj) b().l).x()) {
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.frx_cakewalk_preinstalled_apps_permissions, viewGroup, false);
            ((TextView) viewGroup2.findViewById(R.id.header_body)).setGravity(17);
        } else {
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.frx_preinstalled_apps_permissions, viewGroup, false);
        }
        if (dup.c(getActivity(), "android.permission.READ_CALENDAR") != 0) {
            viewGroup2.findViewById(R.id.calendar_icon).setVisibility(8);
            viewGroup2.findViewById(R.id.calendar_header).setVisibility(8);
            viewGroup2.findViewById(R.id.calendar_body).setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.findViewById(R.id.footer_icon).getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, R.id.contact_body);
            this.c = false;
        }
        Switch r8 = (Switch) viewGroup2.findViewById(R.id.location_allow_weather);
        r8.setChecked(onu.a().j());
        if (aczg.h()) {
            r8.setOnCheckedChangeListener(new mgy(this, r8, 2));
        } else {
            r8.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.findViewById(R.id.phone_icon).getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, R.id.location_body);
        }
        Button button = (Button) view.findViewById(R.id.left_button);
        button.setVisibility(0);
        button.setText(getString(R.string.frx_exit));
        button.setOnClickListener(new xao(this, 15, null));
        TextView textView = (TextView) viewGroup2.findViewById(R.id.footer_description);
        final SpannableString spannableString = new SpannableString(getString(R.string.frx_preinstalled_apps_permissions_footer_setting_link));
        spannableString.setSpan(new xcc(this), 0, spannableString.length(), 33);
        Formattable formattable = new Formattable() { // from class: xcb
            @Override // java.util.Formattable
            public final void formatTo(Formatter formatter, int i, int i2, int i3) throws IOException {
                yph yphVar = xce.a;
                try {
                    formatter.out().append(spannableString);
                } catch (IOException e) {
                    Log.e("GH.FRX", "IOException thrown by SpannableStringBuilder.append()", e);
                }
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        new Formatter(spannableStringBuilder).format(getString(R.string.frx_preinstalled_apps_permissions_footer_description), formattable);
        spannableStringBuilder.setSpan(new xcd(this), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return viewGroup2;
    }

    @Override // defpackage.xcg
    protected final void d() {
        if (this.c) {
            mdh.c();
            mdh.b();
        }
        roc.bp(getActivity()).edit().putBoolean("pref_preinstalled_permissions_acknowledged", true).apply();
        b().f("EVENT_ACCEPT_CLICKED", null);
        c(yzy.bH);
    }

    @Override // defpackage.xcg
    protected final void e() {
        int i = true != ((xcj) b().l).x() ? R.string.frx_yes_im_in : R.string.frx_yes_comma_im_in;
        Button button = this.g;
        if (true != this.i) {
            i = R.string.frx_more;
        }
        button.setText(getString(i));
    }
}

package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.auto.carservice.frx.phonescreen.AuthorizingCarConnectionDialog$1;
import com.google.android.projection.gearhead.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class jmo extends jms {
    public static final yph g = yph.c("GH.FrxPhAuth");
    Button h;
    Button i;
    private bc j;
    private View k;

    @Override // defpackage.jms
    protected final yzz h() {
        return yzz.FRX_PHONESCREEN_AUTHORIZE_CAR;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j = requireActivity();
        View viewInflate = layoutInflater.inflate(R.layout.authorizing_car_connection_dialog, viewGroup);
        this.k = viewInflate;
        this.h = (Button) viewInflate.findViewById(R.id.accept_button);
        this.i = (Button) this.k.findViewById(R.id.cancel_button);
        TextView textView = (TextView) this.k.findViewById(R.id.notification);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        int i = 1;
        Spanned spannedFromHtml = Html.fromHtml(getString(R.string.car_setup_authorizing_car_connection_message_2, "<a href=\"https://support.google.com/androidauto/topic/6106806\">" + this.j.getResources().getString(R.string.learn_more) + "</a>"));
        Spannable spannable = (Spannable) spannedFromHtml;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new AuthorizingCarConnectionDialog$1(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannedFromHtml, TextView.BufferType.SPANNABLE);
        this.h.setOnClickListener(new jmq(this, k(), i));
        this.i.setOnClickListener(new ie(this, 5, null));
        if (acvb.g() && acvb.b().b.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
            requireContext().getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        }
        return this.k;
    }
}

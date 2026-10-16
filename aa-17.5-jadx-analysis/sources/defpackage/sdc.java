package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.carsetup.frx.FrxUtil$1;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sdc extends sei {
    public static final ypf a = ols.R("CAR.SETUP");

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc bcVar = (bc) getContext();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_cakewalk_authorizing_car_connection, viewGroup, false);
        qrv.s(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        Drawable drawable = bcVar.getDrawable(R.drawable.ic_android_auto_gms);
        drawable.setTint(bcVar.getColor(R.color.car_frx_cakewalk_phone_accent));
        imageView.setImageDrawable(drawable);
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.bluetooth);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.notifications);
        Button button2 = (Button) viewInflate.findViewById(R.id.right_button);
        button2.setText(getString(R.string.common_next));
        button.setText(getString(R.string.common_exit));
        Resources resources = getContext().getResources();
        textView2.setCompoundDrawablesWithIntrinsicBounds(new sdz(resources, 2131233090), (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablesWithIntrinsicBounds(new sdz(resources, 2131233498), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(bcVar.getString(R.string.car_setup_cakewalk_authorizing_car_connection_title));
        button2.setOnClickListener(new onh(this, 15));
        button2.setVisibility(0);
        button.setVisibility(0);
        button.setOnClickListener(new onh(this, 16));
        textView2.setText(getString(R.string.car_setup_authorizing_car_connection_message_1));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spannable = (Spannable) Html.fromHtml(getString(R.string.car_setup_authorizing_car_connection_message_2, qrv.r(bcVar, "topic/6106806")));
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new FrxUtil$1(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        textView3.setText(spannable, TextView.BufferType.SPANNABLE);
        return viewInflate;
    }
}

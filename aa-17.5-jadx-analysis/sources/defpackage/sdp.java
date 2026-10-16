package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sdp extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        bc bcVar = (bc) getContext();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_incompatible, viewGroup, false);
        qrv.s(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.left_button);
        seb sebVar = (seb) b().l;
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        button2.setOnClickListener(new sdo((Object) this, 1));
        button.setOnClickListener(new sdo((Object) this, 0));
        button.setVisibility(0);
        textView.setText(R.string.car_frx_device_incompatible_title);
        imageView.setImageDrawable(bcVar.getDrawable(2131231116));
        if (sebVar.s()) {
            button.setText(R.string.common_ok);
            i = R.string.car_frx_device_incompatible_reopen_message;
        } else {
            button.setText(R.string.car_setup_download_app);
            button2.setVisibility(0);
            button2.setText(R.string.common_no_thanks);
            i = R.string.car_frx_device_incompatible_download_message;
        }
        textView2.setText(Html.fromHtml(getString(i, qrv.r(bcVar, "answer/6395843"))), TextView.BufferType.SPANNABLE);
        return viewInflate;
    }
}

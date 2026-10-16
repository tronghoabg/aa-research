package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sde extends sei {
    public static final ypf a = ols.R("CAR.SETUP");

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.CarFrxTheme_Error_New);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.car_frx_download_retry, viewGroup, false);
        qrv.s(layoutInflaterCloneInContext, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        imageView.setImageDrawable(contextThemeWrapper.getDrawable(R.drawable.car_download_apps_illustration));
        textView.setText(contextThemeWrapper.getString(R.string.common_something_went_wrong));
        textView2.setText(contextThemeWrapper.getString(R.string.car_setup_download_retry_message, sev.d(getContext(), ((seb) b().l).z())));
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.right_button);
        button.setVisibility(0);
        button.setText(getString(R.string.car_setup_exit));
        button.setOnClickListener(new onh(this, 18, null));
        button2.setVisibility(0);
        button2.setText(getString(R.string.common_accept));
        button2.setAllCaps(true);
        button2.setOnClickListener(new onh(this, 19, null));
        return viewInflate;
    }
}

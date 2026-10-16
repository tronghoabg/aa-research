package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xbz {
    public final String a;
    public final ImageView b;
    public final ProgressBar c;
    public final ImageView d;
    public final TextView e;
    public boolean f;
    public final /* synthetic */ sei g;
    private final TextView h;

    public xbz(sdr sdrVar, xby xbyVar, ViewGroup viewGroup) {
        this.g = sdrVar;
        this.a = xbyVar.b;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.app_icon);
        this.b = imageView;
        int i = xbyVar.d;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageResource(R.drawable.car_frx_generic_app);
            this.f = true;
        }
        this.d = (ImageView) viewGroup.findViewById(R.id.app_icon_overlay);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        this.h = textView;
        int i2 = xbyVar.c;
        if (i2 != 0) {
            textView.setText(i2);
        } else if (TextUtils.isEmpty(xbyVar.e)) {
            textView.setText(xbyVar.b);
        } else {
            textView.setText(xbyVar.e);
        }
        this.c = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.subtitle_2);
        this.e = textView2;
        textView2.setText("");
    }

    public xbz(xca xcaVar, xby xbyVar, ViewGroup viewGroup) {
        this.g = xcaVar;
        this.a = xbyVar.b;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.app_icon);
        this.b = imageView;
        int i = xbyVar.d;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageResource(R.drawable.car_frx_generic_app);
            this.f = true;
        }
        this.d = (ImageView) viewGroup.findViewById(R.id.app_icon_overlay);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        this.h = textView;
        int i2 = xbyVar.c;
        if (i2 != 0) {
            textView.setText(i2);
        } else if (!TextUtils.isEmpty(xbyVar.e)) {
            textView.setText(xbyVar.e);
        } else {
            textView.setText(xbyVar.b);
        }
        this.c = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.subtitle_2);
        this.e = textView2;
        textView2.setText("");
    }
}

package defpackage;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.maps.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zyy {
    public final RelativeLayout a;
    public final ImageView b;
    public final TextView c;
    public final boolean d;
    public final boolean e;
    private final gjt f;

    public zyy(gjt gjtVar, String str, boolean z, boolean z2) {
        RelativeLayout relativeLayout = new RelativeLayout(gjtVar.A());
        this.a = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f = gjtVar;
        this.d = z;
        this.e = z2;
        ImageView imageView = new ImageView(gjtVar.A());
        this.b = imageView;
        imageView.setImageDrawable(gjtVar.D(R.drawable.maps_watermark_color));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(12);
        int iW = gjtVar.w(com.google.android.projection.gearhead.R.dimen.maps_watermark_margin);
        layoutParams.setMargins(iW, iW, iW, iW);
        imageView.setLayoutParams(layoutParams);
        imageView.setTag("GoogleWatermark");
        imageView.setVisibility(true != z2 ? 8 : 0);
        relativeLayout.addView(imageView);
        TextView textView = new TextView(gjtVar.A());
        this.c = textView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.addRule(12);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(0, gjtVar.w(com.google.android.projection.gearhead.R.dimen.maps_dav_hud_copyright_fontsize));
        textView.setTextColor(-16777216);
        textView.setSingleLine(true);
        textView.setTag("GoogleCopyrights");
        textView.setVisibility(true == z ? 0 : 8);
        relativeLayout.addView(textView);
        String strConcat = addy.c() ? "".concat(String.valueOf(String.format("InternalOnly[%s%s%s]", str, str, str))) : "";
        if (addy.a.gu().d()) {
            strConcat = (strConcat.isEmpty() ? strConcat : strConcat.concat(String.valueOf(xxy.LINE_SEPARATOR.a()))).concat(String.valueOf(String.format(Locale.US, "[%s] Renderer version: %d", "CONFIDENTIAL", 0)));
        }
        if (strConcat.isEmpty()) {
            return;
        }
        TextView textView2 = new TextView(gjtVar.A());
        textView2.setClickable(false);
        textView2.setBackgroundColor(-1862270977);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(10.0f);
        textView2.setPadding(5, 0, 5, 0);
        textView2.setText(strConcat);
        textView2.setTag("MapViewDebugWatermark");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(12);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(10, 0, 10, 0);
        relativeLayout.addView(textView2, layoutParams3);
    }

    public final void a(boolean z) {
        this.b.setImageDrawable(this.f.D(true != z ? R.drawable.maps_watermark_color : R.drawable.maps_watermark_light));
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class zyz implements View.OnClickListener {
    public final ImageView a;
    public final ImageView b;
    public final LinearLayout c;
    public ajmd d;
    private boolean e = false;
    private final gjt f;

    public zyz(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, gjt gjtVar) {
        this.c = linearLayout;
        this.a = imageView;
        this.b = imageView2;
        this.f = gjtVar;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        boolean z = zkt.c;
        int i = true != z ? R.drawable.maps_btn_zoom_down : R.drawable.maps_btn_zoom_down_wear;
        int i2 = true != z ? R.drawable.maps_btn_zoom_up : R.drawable.maps_btn_zoom_up_wear;
        LinearLayout linearLayout = this.c;
        linearLayout.setOrientation(!z ? 1 : 0);
        ImageView imageView = this.a;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        gjt gjtVar = this.f;
        imageView.setImageDrawable(gjtVar.D(i2));
        imageView.setContentDescription(gjtVar.F(R.string.maps_ZOOM_IN_ALT_TEXT));
        imageView.setTag("GoogleMapZoomInButton");
        ImageView imageView2 = this.b;
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        imageView2.setImageDrawable(gjtVar.D(i));
        imageView2.setContentDescription(gjtVar.F(R.string.maps_ZOOM_OUT_ALT_TEXT));
        imageView2.setTag("GoogleMapZoomOutButton");
        if (z) {
            linearLayout.addView(imageView2);
            linearLayout.addView(imageView);
        } else {
            linearLayout.addView(imageView);
            linearLayout.addView(imageView2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajmd ajmdVar = this.d;
        if (ajmdVar == null) {
            return;
        }
        if (view == this.a) {
            zvf zvfVar = (zvf) ajmdVar.a;
            zys zysVar = zvfVar.f;
            zkt.m(zysVar);
            zysVar.b(aahu.ZOOM_IN_BUTTON_CLICK);
            ztt zttVar = zvfVar.a;
            zkt.m(zttVar);
            zttVar.w(1.0f);
            return;
        }
        if (view == this.b) {
            zvf zvfVar2 = (zvf) ajmdVar.a;
            zys zysVar2 = zvfVar2.f;
            zkt.m(zysVar2);
            zysVar2.b(aahu.ZOOM_OUT_BUTTON_CLICK);
            ztt zttVar2 = zvfVar2.a;
            zkt.m(zttVar2);
            zttVar2.w(-1.0f);
        }
    }
}

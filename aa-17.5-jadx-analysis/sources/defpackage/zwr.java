package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.projection.gearhead.R;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class zwr extends vey implements View.OnClickListener {
    public final LinearLayout a;
    public boolean b;
    public boolean c;
    public final boolean d;
    public zwv e;
    private final ImageView f;
    private final ImageView g;
    private final LinkedList h;
    private boolean i = false;
    private boolean j = false;
    private final zvc k;
    private boolean l;
    private CameraPosition m;
    private final int n;
    private final int o;
    private final int p;
    private final gjt q;

    public zwr(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, gjt gjtVar, zvc zvcVar, boolean z) {
        zkt.n(gjtVar, "contextManager");
        this.q = gjtVar;
        this.a = linearLayout;
        this.f = imageView;
        this.g = imageView2;
        this.k = zvcVar;
        this.d = z;
        this.n = gjtVar.w(R.dimen.maps_btn_map_toolbar_margin);
        this.o = gjtVar.w(R.dimen.maps_btn_map_toolbar_divider);
        this.p = gjtVar.w(R.dimen.maps_btn_map_toolbar_bottom_shadow);
        this.h = new LinkedList();
        if (addm.e()) {
            return;
        }
        g();
    }

    static void b(View view, boolean z) {
        TranslateAnimation translateAnimation;
        if (z == (view.getVisibility() == 0)) {
            return;
        }
        if (z) {
            translateAnimation = new TranslateAnimation(2, true != i(view) ? 0.8f : -0.2f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(300L);
        } else {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 2, true != i(view) ? 0.8f : -0.2f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation2.setInterpolator(new AccelerateInterpolator());
            translateAnimation2.setDuration(300L);
            translateAnimation = translateAnimation2;
        }
        view.startAnimation(translateAnimation);
    }

    private final void g() {
        if (this.i) {
            return;
        }
        this.i = true;
        LinearLayout linearLayout = this.a;
        linearLayout.setOrientation(0);
        linearLayout.setTag("GoogleMapToolbar");
        linearLayout.setVisibility(8);
        ImageView imageView = this.f;
        gjt gjtVar = this.q;
        imageView.setImageDrawable(gjtVar.D(com.google.android.libraries.maps.R.drawable.maps_icon_gmm));
        imageView.setContentDescription(gjtVar.F(R.string.maps_OPEN_GMM_ALT_TEXT));
        imageView.setTag("GoogleMapOpenGmmButton");
        ImageView imageView2 = this.g;
        imageView2.setImageDrawable(gjtVar.D(com.google.android.libraries.maps.R.drawable.maps_icon_direction));
        imageView2.setContentDescription(gjtVar.F(R.string.maps_DIRECTIONS_ALT_TEXT));
        imageView2.setTag("GoogleMapDirectionsButton");
        imageView2.setColorFilter(gjtVar.v(R.color.maps_qu_google_blue_500));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        linearLayout.addView(imageView2);
        linearLayout.addView(imageView);
    }

    private final void h(ImageView imageView, int i) {
        imageView.setBackground(this.q.D(i));
        Drawable background = imageView.getBackground();
        imageView.setLayoutParams(new LinearLayout.LayoutParams(background.getIntrinsicWidth(), background.getIntrinsicHeight()));
        if (i == R.drawable.maps_btn_right) {
            imageView.setPadding(this.o, 0, this.n, this.p);
        } else if (i == R.drawable.maps_btn_left) {
            imageView.setPadding(this.n, 0, this.o, this.p);
        } else {
            imageView.setPadding(0, 0, 0, this.p);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    private static boolean i(View view) {
        return view.getLayoutDirection() == 1;
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) {
        zwv zwvVar;
        this.m = cameraPosition;
        if (this.d || (zwvVar = this.e) == null) {
            return;
        }
        zwl zwlVar = zwvVar.b.m;
        Point pointA = zwlVar.e().e().a(zwvVar.getPosition());
        View viewA = zwlVar.a();
        if (pointA.x < 0 || pointA.x >= viewA.getWidth() || pointA.y < 0 || pointA.y >= viewA.getHeight()) {
            c();
        }
    }

    public final void c() {
        this.e = null;
        if (!this.d) {
            b(this.a, false);
        }
        this.j = false;
        this.a.setVisibility(8);
    }

    public final void d() {
        if (this.j && this.c && this.b) {
            if (!this.d) {
                b(this.a, true);
            }
            this.a.setVisibility(0);
        }
    }

    public final void f(boolean z, zwv zwvVar, boolean z2) {
        this.j = true;
        if (this.b) {
            if (addm.e()) {
                g();
            }
            ImageView imageView = this.g;
            imageView.setVisibility(true != z ? 8 : 0);
            ImageView imageView2 = this.f;
            imageView2.setVisibility(0);
            this.e = zwvVar;
            this.l = z2;
            LinkedList linkedList = this.h;
            linkedList.clear();
            if (z) {
                linkedList.add(imageView);
            }
            linkedList.add(imageView2);
            int size = linkedList.size();
            if (size == 1) {
                h((ImageView) linkedList.get(0), R.drawable.maps_btn_standalone);
            } else {
                for (int i = 0; i < size; i++) {
                    ImageView imageView3 = (ImageView) linkedList.get(i);
                    int i2 = R.drawable.maps_btn_left;
                    if (i == 0) {
                        if (true == i(this.a)) {
                            i2 = R.drawable.maps_btn_right;
                        }
                        h(imageView3, i2);
                    } else if (i == size - 1) {
                        if (true != i(this.a)) {
                            i2 = R.drawable.maps_btn_right;
                        }
                        h(imageView3, i2);
                    } else {
                        h(imageView3, R.drawable.maps_btn_middle);
                    }
                }
            }
            d();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            this.k.a(this.m, this.e, this.l);
            return;
        }
        if (view == this.g) {
            zvc zvcVar = this.k;
            zwv zwvVar = this.e;
            zvcVar.c();
            zvcVar.a.b(aahu.INTENT_DIRECTIONS);
            LatLng position = zwvVar == null ? null : zwvVar.getPosition();
            if (position == null) {
                return;
            }
            zvcVar.b("https://maps.google.com/maps?saddr=&daddr=" + position.latitude + "," + position.longitude);
        }
    }
}

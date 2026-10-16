package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class ztr {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public final RelativeLayout f;
    public final zyz g;
    public final zwr h;
    public final zul i;
    public final xa j;
    public final aacq k;

    static {
        int[] iArr = ebm.a;
        a = View.generateViewId();
        b = View.generateViewId();
        c = View.generateViewId();
        d = View.generateViewId();
        e = View.generateViewId();
    }

    public ztr(gjt gjtVar, zwr zwrVar) {
        RelativeLayout relativeLayout = new RelativeLayout(gjtVar.A());
        this.f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.h = zwrVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (zkt.c) {
            layoutParams.addRule(20);
            layoutParams.addRule(15);
        } else {
            layoutParams.addRule(21);
            layoutParams.addRule(10);
        }
        b(layoutParams, 0, gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_margin), 0);
        xa xaVar = new xa(new ImageView(gjtVar.A()), gjtVar);
        if (!addm.e()) {
            xaVar.d();
        }
        this.j = xaVar;
        Object obj = xaVar.b;
        int i = b;
        a((View) obj, i, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(21);
        int i2 = a;
        layoutParams2.addRule(2, i2);
        layoutParams2.addRule(3, i);
        b(layoutParams2, 0, gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_margin));
        zvs zvsVar = new zvs(gjtVar);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(gjtVar.w(R.dimen.maps_btn_width), -2);
        layoutParams3.addRule(15);
        zvsVar.setLayoutParams(layoutParams3);
        zvsVar.setCacheColorHint(0);
        zvsVar.setChoiceMode(1);
        zvsVar.setDivider(new ColorDrawable(0));
        zvsVar.setVerticalScrollBarEnabled(false);
        zvsVar.setScrollingCacheEnabled(true);
        zvsVar.setSmoothScrollbarEnabled(true);
        zvsVar.setVisibility(8);
        RelativeLayout relativeLayout2 = new RelativeLayout((Context) gjtVar.a);
        relativeLayout2.addView(zvsVar);
        relativeLayout2.setVisibility(8);
        aacq aacqVar = new aacq(zvsVar, relativeLayout2, (byte[]) null);
        ((zvs) aacqVar.a).setOnItemClickListener(new lcl(aacqVar, 4));
        this.k = aacqVar;
        a((View) aacqVar.b, c, layoutParams2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (zkt.c) {
            layoutParams4.addRule(14);
            layoutParams4.addRule(10);
        } else {
            layoutParams4.addRule(21);
            layoutParams4.addRule(12);
        }
        b(layoutParams4, 0, 0, gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_zoom_y_margin));
        Context contextA = gjtVar.A();
        LinearLayout linearLayout = new LinearLayout(contextA);
        ImageView imageView = new ImageView(contextA);
        ImageView imageView2 = new ImageView(contextA);
        zyz zyzVar = new zyz(linearLayout, imageView, imageView2, gjtVar);
        imageView.setOnClickListener(zyzVar);
        imageView2.setOnClickListener(zyzVar);
        if (!addm.e()) {
            zyzVar.a();
        }
        this.g = zyzVar;
        a(zyzVar.c, i2, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(16, i2);
        layoutParams5.alignWithParent = true;
        layoutParams5.addRule(12);
        b(layoutParams5, 0, 0, gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_zoom_y_margin));
        a(zwrVar.a, d, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        if (zkt.c) {
            layoutParams6.addRule(21);
            layoutParams6.addRule(15);
        } else {
            layoutParams6.addRule(20);
            layoutParams6.addRule(10);
        }
        b(layoutParams6, gjtVar.w(R.dimen.maps_btn_margin), gjtVar.w(R.dimen.maps_btn_margin), 0, 0);
        zul zulVar = new zul(gjtVar);
        this.i = zulVar;
        zulVar.setTag("GoogleMapCompass");
        zulVar.setContentDescription(gjtVar.F(R.string.maps_COMPASS_ALT_TEXT));
        a(zulVar, e, layoutParams6);
    }

    private final void a(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        view.setVisibility(8);
        view.setId(i);
        this.f.addView(view, layoutParams);
    }

    private static void b(RelativeLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setMargins(i, i2, i3, i4);
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i3);
    }
}

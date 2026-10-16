package com.google.android.apps.auto.components.metadataview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.projection.gearhead.R;
import defpackage.hrt;
import defpackage.hsq;
import defpackage.iek;
import defpackage.ifj;
import defpackage.leh;
import defpackage.lqj;
import defpackage.lyw;
import defpackage.lyx;
import defpackage.lyy;
import defpackage.ntn;
import defpackage.spu;
import defpackage.wtw;
import defpackage.wug;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MetadataView extends LinearLayout {
    public static final yph a = yph.c("GH.MetadataView");
    public LinearLayout b;
    public ShapeableImageView c;
    public LinearLayout d;
    public LinearLayout e;
    public lyy f;
    Drawable g;
    public final Handler h;
    public final Runnable i;
    public lyw j;
    private boolean k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private LinearLayout s;

    public MetadataView(Context context) {
        super(context);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new lqj(this, 12);
        this.j = lyw.a().a();
    }

    private final hsq j(lyw lywVar) {
        hsq hsqVar = (hsq) hrt.c(getContext()).b().A();
        ntn ntnVar = new ntn(lywVar.j);
        ntnVar.l(lywVar.i);
        hsq hsqVar2 = (hsq) hsqVar.h(ntnVar.k("buildRequestFor called with no image in provided model", new Object[0])).I(this.g);
        CharSequence charSequence = lywVar.l;
        return !TextUtils.isEmpty(charSequence) ? hsqVar2.n(iek.e(new ifj(charSequence))) : hsqVar2;
    }

    private final void k(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || this.k) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    private final void l(ViewGroup viewGroup, List list) {
        viewGroup.removeAllViews();
        if (list.isEmpty() || this.k) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.icon_view, viewGroup, false);
            imageView.setImageDrawable(drawable);
            leh.a();
            imageView.setColorFilter(spu.aL(getContext(), R.attr.colorOnSurfaceVariant));
            viewGroup.addView(imageView);
        }
    }

    private static boolean m(lyw lywVar) {
        return (lywVar.j == null && lywVar.i == null) ? false : true;
    }

    public final void a(boolean z) {
        if (z) {
            hrt.c(getContext()).h(this.c);
        }
        this.c.setImageDrawable(this.g);
    }

    public final void b() {
        e(lyw.a().a());
    }

    public final void c(int i) {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
    }

    public final void d(CharSequence charSequence) {
        TextView textView = this.p;
        if (textView == null) {
            return;
        }
        k(textView, charSequence);
    }

    public final void e(lyw lywVar) {
        lyw lywVar2 = this.j;
        this.j = lywVar;
        l(this.b, lywVar.g);
        ViewGroup viewGroup = this.d;
        yfq yfqVar = lywVar.h;
        l(viewGroup, yfqVar);
        this.s.setVisibility((yfqVar.isEmpty() && lywVar.c == null) ? 8 : 0);
        if (!m(lywVar)) {
            ((ype) a.l().ai((char) 4465)).u("No content image supplied. Clearing the image view.");
            a(true);
            g(lywVar);
            return;
        }
        hsq hsqVarA = j(lywVar).a(new lyx(this));
        if (m(lywVar2) && this.c.getDrawable() != null) {
            hsqVarA = hsqVarA.l(j(lywVar2));
        }
        long j = lywVar.k;
        if (j >= 0) {
            Handler handler = this.h;
            Runnable runnable = this.i;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, j);
        }
        hsqVarA.p(this.c);
        this.c.setVisibility(0);
    }

    public final void f(int i, int i2) {
        this.l.setTextColor(i);
        this.m.setTextColor(i2);
        this.n.setTextColor(i2);
        this.o.setTextColor(i2);
        this.p.setTextColor(i2);
        this.q.setTextColor(i2);
        this.r.setTextColor(i2);
    }

    public final void g(lyw lywVar) {
        CharSequence charSequence = lywVar.a;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.l;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.l.setVisibility(0);
            if (this.k) {
                setPadding(0, 0, 0, 0);
                setGravity(17);
            }
        }
        k(this.m, lywVar.b);
        TextView textView2 = this.n;
        if (textView2 != null) {
            k(textView2, lywVar.c);
        }
        k(this.o, lywVar.f);
        if (this.p == null || this.r == null || this.q == null) {
            return;
        }
        CharSequence charSequence2 = lywVar.d;
        if (!TextUtils.isEmpty(charSequence2)) {
            CharSequence charSequence3 = lywVar.e;
            if (!TextUtils.isEmpty(charSequence3)) {
                d(charSequence2);
                k(this.r, charSequence3);
                k(this.q, getResources().getString(R.string.time_duration_divider));
                return;
            }
        }
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.q.setVisibility(8);
    }

    public final void h(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).setColorFilter(i);
            }
        }
    }

    public final void i(int i) {
        int i2 = i - 1;
        ShapeableImageView shapeableImageView = this.c;
        if (i2 != 1) {
            wuj wujVar = new wuj();
            wujVar.f(new wtw(getResources().getDimensionPixelSize(R.dimen.metadata_content_image_corner_radius)));
            shapeableImageView.d(new wuk(wujVar));
        } else {
            wuj wujVar2 = new wuj();
            wujVar2.f(new wug(0.5f));
            shapeableImageView.d(new wuk(wujVar2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getResources().getDisplayMetrics().heightPixels < getResources().getDimensionPixelSize(R.dimen.metadata_min_screen_height)) {
            this.k = true;
        }
        TextView textView = (TextView) findViewById(R.id.metadata_title);
        textView.getClass();
        this.l = textView;
        TextView textView2 = (TextView) findViewById(R.id.metadata_subtitle);
        textView2.getClass();
        this.m = textView2;
        TextView textView3 = (TextView) findViewById(R.id.metadata_tertiary_text);
        textView3.getClass();
        this.n = textView3;
        TextView textView4 = (TextView) findViewById(R.id.metadata_extra_message);
        textView4.getClass();
        this.o = textView4;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.icon_holder);
        linearLayout.getClass();
        this.b = linearLayout;
        ShapeableImageView shapeableImageView = (ShapeableImageView) findViewById(R.id.content_image);
        shapeableImageView.getClass();
        this.c = shapeableImageView;
        TextView textView5 = (TextView) findViewById(R.id.metadata_elapsed_time);
        textView5.getClass();
        this.p = textView5;
        TextView textView6 = (TextView) findViewById(R.id.metadata_time_divider);
        textView6.getClass();
        this.q = textView6;
        TextView textView7 = (TextView) findViewById(R.id.metadata_total_time);
        textView7.getClass();
        this.r = textView7;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.icon_tertiary_holder);
        linearLayout2.getClass();
        this.d = linearLayout2;
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.tertiary_container);
        linearLayout3.getClass();
        this.s = linearLayout3;
        this.e = (LinearLayout) findViewById(R.id.media_seekbar);
        leh.a();
        this.g = new ColorDrawable(spu.aL(getContext(), R.attr.colorSurfaceVariant));
        leh.a();
        if (this.e == null) {
            this.m.setFontFeatureSettings("tnum");
        } else {
            this.p.setFontFeatureSettings("tnum");
            this.r.setFontFeatureSettings("tnum");
        }
    }

    public MetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new lqj(this, 12);
        this.j = lyw.a().a();
    }

    public MetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new lqj(this, 12);
        this.j = lyw.a().a();
    }

    public MetadataView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new lqj(this, 12);
        this.j = lyw.a().a();
    }
}

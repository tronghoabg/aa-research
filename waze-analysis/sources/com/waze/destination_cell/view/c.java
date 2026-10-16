package com.waze.destination_cell.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.eo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.content.ContextCompat;
import com.google.android.material.datepicker.ac;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;
import com.waze.sharedui.views.WazeTextView;
import com.waze.sharedui.views.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private d f23544a;

    /* renamed from: b, reason: collision with root package name */
    private final View f23545b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeTextView f23546c;

    /* renamed from: d, reason: collision with root package name */
    private final View f23547d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f23548e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f23549f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f23550g;

    /* renamed from: h, reason: collision with root package name */
    private final WazeTextView f23551h;

    /* renamed from: i, reason: collision with root package name */
    private final WazeTextView f23552i;

    /* renamed from: j, reason: collision with root package name */
    private final View f23553j;

    /* renamed from: k, reason: collision with root package name */
    private final ProgressAnimation f23554k;

    /* renamed from: l, reason: collision with root package name */
    private final View f23555l;
    private final ImageView m;
    private final View n;
    private final View o;
    private final WazeTextView p;
    private final ImageView q;
    private final WazeTextView r;
    private final WazeTextView s;
    private final View t;
    private final Flow u;
    private final ViewGroup v;
    private b w;

    private c(Context context) {
        super(context);
        com.waze.design_components.g.b.d(this);
        this.w = b.NONE;
        LayoutInflater.from(getContext()).inflate(R.layout.destination_cell, this);
        this.f23545b = findViewById(R.id.cellContainer);
        this.f23546c = (WazeTextView) findViewById(R.id.cellAdTag);
        this.f23547d = findViewById(R.id.cellLeadIconContainer);
        this.f23548e = (ImageView) findViewById(R.id.cellLeadIcon);
        this.f23549f = (ImageView) findViewById(R.id.leadIconDecoration);
        this.f23550g = (ImageView) findViewById(R.id.popularBadge);
        this.f23551h = (WazeTextView) findViewById(R.id.cellTitle);
        this.f23552i = (WazeTextView) findViewById(R.id.cellSubtitle);
        this.f23553j = findViewById(R.id.cellDetailsContainer);
        this.f23554k = (ProgressAnimation) findViewById(R.id.detailLoader);
        this.f23555l = findViewById(R.id.cellDealContainer);
        this.m = (ImageView) findViewById(R.id.campaignIndicator);
        this.n = findViewById(R.id.cellAccessoryTextContainer);
        this.o = findViewById(R.id.cellAccessoryIconContainer);
        this.q = (ImageView) findViewById(R.id.cellAccessoryIcon);
        this.p = (WazeTextView) findViewById(R.id.cellAccessoryIconDescription);
        this.r = (WazeTextView) findViewById(R.id.cellAccessoryTitle);
        this.s = (WazeTextView) findViewById(R.id.cellAccessoryDescription);
        this.t = findViewById(R.id.cellSeparator);
        this.v = (ViewGroup) findViewById(R.id.cellEVInfoContainer);
        this.u = (Flow) findViewById(R.id.cellEVInfoOverflow);
        setOnClickListener(new ac(this, 14));
        setOnTouchListener(new ab(this, 1));
    }

    public static c a(Context context) {
        c cVar = new c(context);
        cVar.setLayoutParams(new eo(-1, -2));
        return cVar;
    }

    public static /* synthetic */ void s(c cVar, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cVar.f23544a.o();
        }
    }

    private final Drawable y(int i2) {
        if (i2 == 0 || i2 == -1) {
            return null;
        }
        return ContextCompat.getDrawable(getContext(), i2);
    }

    private final void z(Drawable drawable, boolean z) {
        if (drawable == null) {
            this.f23547d.setVisibility(8);
            return;
        }
        int i2 = true != z ? R.dimen.destination_cell_lead_icon_size : R.dimen.destination_cell_lead_icon_frame_size;
        ImageView imageView = this.f23548e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(i2);
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        imageView.setLayoutParams(layoutParams);
        imageView.setColorFilter((ColorFilter) null);
        imageView.setImageDrawable(drawable);
        this.f23547d.setVisibility(0);
    }

    public final void b() {
        this.f23548e.setColorFilter((ColorFilter) null);
        this.f23546c.setVisibility(8);
        this.f23550g.setVisibility(8);
        this.f23547d.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.f23553j.setVisibility(8);
        this.f23554k.setVisibility(8);
        this.f23555l.setVisibility(8);
        this.v.setVisibility(8);
        this.u.setVisibility(8);
        this.w = b.NONE;
    }

    public final void c(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        WazeTextView wazeTextView = this.s;
        if (zIsEmpty) {
            wazeTextView.setVisibility(8);
        } else {
            wazeTextView.setText(str);
            wazeTextView.setVisibility(0);
        }
    }

    public final void d(b bVar) {
        this.w = bVar;
        Context context = getContext();
        this.f23544a.d();
        BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(ContextCompat.getColor(context, R.color.content_default), BlendMode.SRC_ATOP);
        ImageView imageView = this.q;
        imageView.setColorFilter(blendModeColorFilter);
        imageView.setImageResource(bVar.a());
        if (this.w == b.MORE_OPTION) {
            this.o.setOnClickListener(new ac(this, 11));
        } else {
            b bVar2 = b.AUTO_FILL;
            View view = this.o;
            if (bVar == bVar2) {
                view.setOnClickListener(new ac(this, 12));
            } else {
                view.setOnClickListener(new ac(this, 13));
            }
        }
        this.o.setVisibility(0);
    }

    public final void e(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        WazeTextView wazeTextView = this.r;
        if (zIsEmpty) {
            wazeTextView.setVisibility(8);
        } else {
            wazeTextView.setText(str);
            wazeTextView.setVisibility(0);
        }
    }

    public final void f(int i2) {
        this.f23545b.setBackgroundResource(i2);
    }

    public final void g(int i2) {
        if (i2 == 0 || i2 == -1) {
            this.f23545b.setContentDescription(null);
        } else {
            this.f23545b.setContentDescription(getResources().getString(i2));
        }
    }

    @Override // android.view.View
    public final Resources getResources() {
        return this.f23545b.getResources();
    }

    public final void h(Bitmap bitmap) {
        z(new BitmapDrawable(getResources(), bitmap), true);
    }

    public final void i(Drawable drawable) {
        z(drawable, true);
    }

    public final void j(boolean z) {
        int i2;
        this.f23549f.setVisibility(true != z ? 8 : 0);
        Context context = getContext();
        if (z) {
            i2 = R.color.on_primary;
        } else {
            this.f23544a.d();
            i2 = R.color.content_default;
        }
        this.f23548e.setColorFilter(new BlendModeColorFilter(ContextCompat.getColor(context, i2), BlendMode.SRC_ATOP));
    }

    public final void k(int i2) {
        if (i2 == com.waze.design_components.b.d.f23304e.h().intValue() || i2 == com.waze.design_components.b.d.f23309j.h().intValue()) {
            z(y(i2), false);
        } else {
            z(y(i2), false);
            Context context = getContext();
            this.f23544a.d();
            this.f23548e.setColorFilter(new BlendModeColorFilter(ContextCompat.getColor(context, R.color.content_default), BlendMode.SRC_ATOP));
        }
        this.f23548e.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void l(d dVar) {
        this.f23544a = dVar;
    }

    public final void m(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        WazeTextView wazeTextView = this.f23552i;
        if (zIsEmpty) {
            wazeTextView.setVisibility(8);
        } else {
            wazeTextView.setText(str);
            wazeTextView.setVisibility(0);
        }
    }

    public final void n(int i2) {
        this.f23552i.setTextColor(ContextCompat.getColor(getContext(), i2));
    }

    public final void o(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        WazeTextView wazeTextView = this.f23551h;
        if (zIsEmpty) {
            wazeTextView.setVisibility(8);
        } else {
            wazeTextView.setText(str);
            wazeTextView.setVisibility(0);
        }
    }

    public final void p(int i2) {
        this.f23551h.setMaxLines(i2);
    }

    public final void v() {
        this.f23552i.setMaxLines(3);
    }

    public final void w() {
        this.t.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.separator_default));
    }

    public final void x() {
        WazeTextView wazeTextView = this.r;
        if (wazeTextView.getText().length() > 3) {
            wazeTextView.g(getContext(), 7);
        } else {
            wazeTextView.g(getContext(), 5);
        }
        wazeTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p3));
        WazeTextView wazeTextView2 = this.s;
        wazeTextView2.g(getContext(), 32);
        wazeTextView2.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = (int) getResources().getDimension(R.dimen.destination_cell_components_margin);
        View view = this.n;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
    }
}

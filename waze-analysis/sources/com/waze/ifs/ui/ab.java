package com.waze.ifs.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    final CardView f24489a;

    /* renamed from: b, reason: collision with root package name */
    final View f24490b;

    /* renamed from: c, reason: collision with root package name */
    final ImageView f24491c;

    /* renamed from: d, reason: collision with root package name */
    final ImageView f24492d;

    /* renamed from: e, reason: collision with root package name */
    final View f24493e;

    /* renamed from: f, reason: collision with root package name */
    final WazeTextView f24494f;

    public ab(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.waze_big_card_option, this);
        this.f24491c = (ImageView) findViewById(R.id.image);
        this.f24492d = (ImageView) findViewById(R.id.imageSelected);
        this.f24493e = findViewById(R.id.selected_outline);
        this.f24494f = (WazeTextView) findViewById(R.id.title);
        this.f24489a = (CardView) findViewById(R.id.root);
        this.f24490b = findViewById(R.id.card_blue_bg);
    }

    public final void a(float f2, float f3) {
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f3).setDuration(300L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new aa(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        View view = this.f24493e;
        if (!z) {
            view.animate().alpha(0.0f);
            this.f24492d.animate().alpha(0.0f);
            return;
        }
        view.animate().alpha(1.0f);
        this.f24492d.animate().alpha(1.0f);
        View view2 = this.f24490b;
        view2.setAlpha(1.0f);
        view2.animate().alpha(0.0f).setDuration(200L);
    }
}

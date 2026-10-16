package com.waze.view.a;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.sharedui.d.a.d {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f44948a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.a.e f44949b;

    /* renamed from: c, reason: collision with root package name */
    private final View f44950c;

    public f(com.waze.sharedui.a.e eVar, String str, Bundle bundle) {
        super(eVar, R.style.ReportDialog);
        this.f44948a = null;
        this.f44949b = eVar;
        setContentView(R.layout.photo_dialog);
        getWindow().setLayout(-1, -1);
        findViewById(R.id.forMarginesOnly).setOnClickListener(new a(this));
        View viewFindViewById = findViewById(R.id.dialogPhotoFrme);
        this.f44950c = viewFindViewById;
        float f2 = eVar.getResources().getDisplayMetrics().density * 10.0f;
        int i2 = eVar.getResources().getDisplayMetrics().heightPixels - ((int) (eVar.getResources().getDisplayMetrics().density * 40.0f));
        int i3 = eVar.getResources().getDisplayMetrics().widthPixels - ((int) f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        if (i3 > i2) {
            layoutParams.height = i2;
            layoutParams.width = (i2 * 4) / 3;
        } else {
            layoutParams.width = i3;
            layoutParams.height = (i3 * 3) / 4;
        }
        viewFindViewById.setLayoutParams(layoutParams);
        com.bumptech.glide.c.f(eVar).c().g(str).m(new b(this, (ProgressAnimation) findViewById(R.id.dialogPhotoProgress), (ImageView) findViewById(R.id.dialogPhoto)));
        this.f44948a = bundle;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
        getOnBackPressedDispatcher().addCallback(this, new d(this));
    }

    static /* bridge */ /* synthetic */ void b(f fVar) {
        int i2 = fVar.f44948a.getInt(TtmlNode.LEFT);
        int i3 = fVar.f44948a.getInt("top");
        int i4 = fVar.f44948a.getInt("width");
        int i5 = fVar.f44948a.getInt("height");
        View view = fVar.f44950c;
        view.getLocationInWindow(new int[2]);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(i4 / view.getWidth(), 1.0f, i5 / view.getHeight(), 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        animationSet.addAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, (i2 + (i4 / 2)) - (r6[0] + (r10 / 2)), 1, 0.0f, 0, (i3 + (i5 / 2)) - (r6[1] + (r13 / 2)), 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(translateAnimation);
        view.startAnimation(animationSet);
    }

    static /* bridge */ /* synthetic */ void e(f fVar) {
        Bundle bundle = fVar.f44948a;
        if (bundle == null) {
            fVar.dismiss();
            return;
        }
        int i2 = bundle.getInt(TtmlNode.LEFT);
        int i3 = fVar.f44948a.getInt("top");
        int i4 = fVar.f44948a.getInt("width");
        int i5 = fVar.f44948a.getInt("height");
        View view = fVar.f44950c;
        view.getLocationInWindow(new int[2]);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, i4 / view.getWidth(), 1.0f, i5 / view.getHeight(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, (i2 + (i4 / 2)) - (r7[0] + (r11 / 2)), 1, 0.0f, 0, (i3 + (i5 / 2)) - (r7[1] + (r14 / 2)));
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new e(fVar));
        view.startAnimation(animationSet);
    }
}

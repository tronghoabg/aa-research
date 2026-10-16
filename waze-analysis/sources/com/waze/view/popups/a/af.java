package com.waze.view.popups.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.waze.MoodManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.map.bq;
import com.waze.ui.z.as;
import com.waze.user.UserData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af extends com.waze.view.popups.m {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f45160a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45161b;

    /* renamed from: c, reason: collision with root package name */
    private UserData f45162c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45163e;

    /* renamed from: f, reason: collision with root package name */
    private bq f45164f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45165g;

    /* renamed from: h, reason: collision with root package name */
    private int f45166h;

    /* renamed from: i, reason: collision with root package name */
    private int f45167i;

    /* renamed from: j, reason: collision with root package name */
    private ae f45168j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.messaging.l f45169k;

    public af(Activity activity, com.google.firebase.messaging.l lVar) {
        super(activity);
        this.f45160a = activity;
        this.f45169k = lVar;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.user_popup, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.UserPopUpMainLayout);
        com.google.android.material.k.p pVar = new com.google.android.material.k.p(materialCardView.b());
        pVar.j(new com.google.android.material.k.af(as.f(8)));
        materialCardView.e(pVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        int i2 = 0;
        this.f45161b = false;
        setVisibility(8);
        if (this.f45168j == null) {
            ae aeVar = new ae(this, i2);
            this.f45168j = aeVar;
            postDelayed(aeVar, 1000L);
        }
        this.f45165g = false;
        com.waze.map.g.t.b().d(com.waze.map.f.d.f28895e, com.waze.map.f.c.f28883b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        animate().translationX(this.f45166h - (getMeasuredWidth() / 2)).translationY(this.f45167i - getMeasuredHeight()).setDuration(0L).start();
    }

    public final void d(UserData userData, int i2, int i3) {
        if (this.f45161b || this.f45165g) {
            if (userData.getID() == this.f45162c.getID() && this.f45165g) {
                k();
                this.f45162c = null;
                return;
            }
            k();
        }
        this.f45162c = userData;
        this.f45166h = i2;
        this.f45167i = i3;
        ((TextView) findViewById(R.id.UserPopUpName)).setText(userData.mNickName);
        ImageView imageView = (ImageView) findViewById(R.id.userDetailsImage);
        Activity activity = this.f45160a;
        imageView.setImageDrawable(MoodManager.getBigMoodDrawble(activity, this.f45162c.mMood));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) findViewById(R.id.userDetailsImageAddon);
        String str = this.f45162c.mAddonName;
        if (str == null || str.length() <= 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(MoodManager.getBigMoodDrawble(activity, this.f45162c.mAddonName));
        }
        if (this.f45162c.getImage() != null) {
            imageView2.setVisibility(8);
            com.waze.utils.i.a().c(this.f45162c.getImage(), new ac(this));
        }
        TextView textView = (TextView) findViewById(R.id.PtsLabel);
        String strC = this.f45162c.mPtsStr;
        com.waze.shared_infra.o.a aVarD = com.waze.design_components.g.b.d(this);
        if (this.f45162c.mPtsStr == null) {
            strC = aVarD.c(R.string.POINTS_NA, new Object[0]);
        }
        textView.setText(strC);
        TextView textView2 = (TextView) findViewById(R.id.JoinedLabel);
        String str2 = this.f45162c.mJoinedStr;
        if (str2 == null || str2.isEmpty()) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f45162c.mJoinedStr);
        }
        ((TextView) findViewById(R.id.SpeedLabel)).setText(this.f45162c.mSpeedStr);
        ae aeVar = this.f45168j;
        if (aeVar != null) {
            aeVar.f45157a = true;
        }
        if (!this.f45163e) {
            bq bqVarE = com.waze.t.e();
            this.f45164f = bqVarE;
            if (bqVarE != null) {
                bqVarE.addView(this);
            }
            this.f45163e = true;
        }
        setVisibility(0);
        this.f45161b = true;
        NativeManager.getInstance().focusCanvasUser(getHeight() / 2);
        View viewFindViewById = findViewById(R.id.UserPopUpMainLayout);
        viewFindViewById.setOnClickListener(null);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ad(this, viewFindViewById, 0));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(250L);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, i2, 0, i3));
        animationSet.setInterpolator(new OvershootInterpolator());
        startAnimation(animationSet);
    }

    @Override // com.waze.view.popups.m
    public final void e() {
        if (this.f45165g) {
            k();
            return;
        }
        if (this.f45161b) {
            this.f45165g = true;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(250L);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, this.f45166h, 0, this.f45167i));
            animationSet.setInterpolator(new AnticipateInterpolator());
            startAnimation(animationSet);
            animationSet.setAnimationListener(new ab(this));
        }
    }

    @Override // com.waze.view.popups.m
    public final void f() {
        if (this.f45161b) {
            e();
        }
    }

    public final void g(int i2, int i3) {
        if (this.f45161b) {
            this.f45166h = i2;
            this.f45167i = i3;
            l();
        }
    }
}

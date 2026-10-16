package com.waze.reports;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.waze.R;
import com.waze.sharedui.views.AutoResizeTextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ec extends com.waze.sharedui.d.a.d {

    /* renamed from: a, reason: collision with root package name */
    final int f33902a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33903b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f33904c;

    public ec(Context context, int i2, boolean z, Runnable runnable, View.OnClickListener onClickListener, int i3, int i4, int i5, int i6, boolean z2) {
        super(context, R.style.PopInDialog);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        this.f33903b = aVarA;
        this.f33902a = i2;
        this.f33904c = runnable;
        setContentView(R.layout.place_thank_you);
        Window window = getWindow();
        window.setLayout(-2, -2);
        window.setGravity(17);
        int i7 = 8;
        if (i2 > 0) {
            ((TextView) findViewById(R.id.placeThankYouYouEarned)).setText(aVarA.c(R.string.YOU_EARNED, new Object[0]));
            TextView textView = (TextView) findViewById(R.id.placeThankYouOnes);
            StringBuilder sb = new StringBuilder();
            sb.append(i2 % 10);
            textView.setText(sb.toString());
            TextView textView2 = (TextView) findViewById(R.id.placeThankYouTens);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i2 / 10);
            textView2.setText(sb2.toString());
            View viewFindViewById = findViewById(R.id.placeThankYouCircle);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(150L);
            scaleAnimation.setFillBefore(true);
            scaleAnimation.setStartOffset(200L);
            viewFindViewById.startAnimation(scaleAnimation);
            View viewFindViewById2 = findViewById(R.id.placeThankYouTens);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(150L);
            scaleAnimation2.setFillBefore(true);
            scaleAnimation2.setStartOffset(350L);
            viewFindViewById2.startAnimation(scaleAnimation2);
            View viewFindViewById3 = findViewById(R.id.placeThankYouOnes);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(150L);
            scaleAnimation3.setFillBefore(true);
            scaleAnimation3.setStartOffset(500L);
            viewFindViewById3.startAnimation(scaleAnimation3);
            View viewFindViewById4 = findViewById(R.id.placeThankYouPoints);
            ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation4.setDuration(150L);
            scaleAnimation4.setFillBefore(true);
            scaleAnimation4.setStartOffset(650L);
            viewFindViewById4.startAnimation(scaleAnimation4);
        } else {
            findViewById(R.id.placeThankYouYouEarned).setVisibility(8);
            findViewById(R.id.placeThankYouCircle).setVisibility(8);
        }
        View viewFindViewById5 = findViewById(R.id.placeThankYouAddMore);
        if (z) {
            viewFindViewById5.setOnClickListener(onClickListener);
        } else {
            viewFindViewById5.setVisibility(8);
        }
        findViewById(R.id.placeThankYouMaybeLater).setOnClickListener(new com.waze.navigate.ai(this, i7));
        if (z) {
            ((TextView) findViewById(R.id.placeThankYouAddMoreText)).setText(aVarA.c(i5, new Object[0]));
            ((TextView) findViewById(R.id.placeThankYouMaybeLater)).setText(aVarA.c(i6, new Object[0]));
            ((TextView) findViewById(R.id.placeThankYouAddMorePoints)).setText("+30");
        } else {
            ((TextView) findViewById(R.id.placeThankYouMaybeLater)).setText(aVarA.c(i6, new Object[0]));
        }
        ((TextView) findViewById(R.id.placeThankYouText1)).setText((i3 != -1 ? "".concat(String.valueOf(aVarA.c(i3, new Object[0]))).concat("\n") : "").concat(String.valueOf(aVarA.c(i4, new Object[0]))));
        if (z2) {
            ((TextView) findViewById(R.id.placeThankYouPending)).setText(aVarA.c(R.string.PENDING_COMMUNITY_REVIEW, new Object[0]));
        } else {
            findViewById(R.id.placeThankYouPending).setVisibility(8);
        }
        ((AutoResizeTextView) findViewById(R.id.placeThankYouPoints)).setText(aVarA.c(R.string.POINTS, new Object[0]).toUpperCase());
    }

    public static /* synthetic */ void a(ec ecVar) {
        Runnable runnable = ecVar.f33904c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        Runnable runnable = this.f33904c;
        if (runnable != null) {
            runnable.run();
        }
    }
}

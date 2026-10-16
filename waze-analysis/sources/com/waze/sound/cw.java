package com.waze.sound;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cw extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f39718a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39719b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeButton f39720c;

    /* renamed from: d, reason: collision with root package name */
    private final WazeButton f39721d;

    /* renamed from: e, reason: collision with root package name */
    private final WazeButton f39722e;

    /* renamed from: f, reason: collision with root package name */
    private final LinearLayout f39723f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f39724g;

    /* renamed from: h, reason: collision with root package name */
    private final WazeButton f39725h;

    /* renamed from: i, reason: collision with root package name */
    private final WazeButton f39726i;

    /* renamed from: j, reason: collision with root package name */
    private final View f39727j;

    /* renamed from: k, reason: collision with root package name */
    private final View f39728k;

    /* renamed from: l, reason: collision with root package name */
    private PromptDefinition f39729l;
    private final ValueAnimator m;
    private int n;
    private final com.waze.shared_infra.o.a o;
    private boolean p;
    private com.waze.settings.q q;

    public cw(Context context) {
        super(context, null, 0);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        this.o = aVarA;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.recorder_popup, (ViewGroup) null);
        this.f39718a = (TextView) viewInflate.findViewById(R.id.lblInstructionName);
        this.f39719b = (TextView) viewInflate.findViewById(R.id.lblDuration);
        WazeButton wazeButton = (WazeButton) viewInflate.findViewById(R.id.btnRecord);
        this.f39720c = wazeButton;
        WazeButton wazeButton2 = (WazeButton) viewInflate.findViewById(R.id.btnPreview);
        this.f39721d = wazeButton2;
        this.f39722e = (WazeButton) viewInflate.findViewById(R.id.btnStop);
        this.f39723f = (LinearLayout) viewInflate.findViewById(R.id.buttonContainer);
        this.f39724g = (ProgressBar) viewInflate.findViewById(R.id.recordingProgress);
        WazeButton wazeButton3 = (WazeButton) viewInflate.findViewById(R.id.btnCancel);
        this.f39725h = wazeButton3;
        WazeButton wazeButton4 = (WazeButton) viewInflate.findViewById(R.id.btnSave);
        this.f39726i = wazeButton4;
        View viewFindViewById = viewInflate.findViewById(R.id.stopOverlay);
        this.f39727j = viewFindViewById;
        this.f39728k = viewInflate.findViewById(R.id.progressBarMarker);
        wazeButton.setOnClickListener(new ct(this, 1, (byte[]) null));
        wazeButton2.setOnClickListener(new ct(this, 0));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new cu(this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        viewFindViewById.setOnClickListener(new cv(this, 1, null));
        wazeButton3.setOnClickListener(new ct(this, 2, (char[]) null));
        wazeButton4.setOnClickListener(new ct(this, 3, (short[]) null));
        setOnClickListener(new ct(this, 4, (int[]) null));
        viewInflate.findViewById(R.id.popupContainer).setOnClickListener(new cv(this, 0));
        wazeButton4.d(false);
        wazeButton3.d(true);
        addView(viewInflate);
        wazeButton3.h(aVarA.c(R.string.CANCEL, new Object[0]));
        wazeButton4.h(aVarA.c(R.string.SAVE, new Object[0]));
    }

    static /* bridge */ /* synthetic */ void l(cw cwVar) {
        cwVar.postDelayed(new bc(cwVar, 3, (byte[]) null), 250L);
        bg.c().i(cwVar.f39729l, new cq(cwVar));
        cwVar.p();
    }

    public static cw o(Activity activity, PromptDefinition promptDefinition, com.waze.settings.q qVar) {
        cw cwVar = new cw(activity);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        cwVar.setLayoutParams(layoutParams);
        cwVar.q = qVar;
        cwVar.f39729l = promptDefinition;
        if (promptDefinition != null) {
            TextView textView = cwVar.f39718a;
            String displayText = promptDefinition.getDisplayText();
            textView.setText(String.format(Locale.US, "\"%s\"", displayText));
            if (displayText != null && displayText.length() > 15) {
                textView.setTextSize(1, 18.0f);
            }
            cwVar.f39719b.setText(String.format(Locale.US, cwVar.o.c(R.string.CUSTOM_PROMPTS_X_SECONDS_MAX, new Object[0]), Integer.valueOf(cwVar.f39729l.getMaxSeconds())));
            cwVar.f39724g.setProgress(0);
            cwVar.q();
        }
        cwVar.setAlpha(0.0f);
        com.waze.view.anim.g.d(cwVar).alpha(1.0f);
        activity.addContentView(cwVar, layoutParams);
        return cwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        boolean zW = bg.c().w(this.f39729l);
        View view = this.f39728k;
        if (zW) {
            view.setVisibility(8);
            LinearLayout linearLayout = this.f39723f;
            com.waze.view.anim.g.d(linearLayout).alpha(0.0f).setListener(com.waze.view.anim.g.c(linearLayout));
            com.waze.view.anim.g.d(this.f39720c).translationX((linearLayout.getWidth() / 2) - (r1.getMeasuredWidth() / 2));
            com.waze.view.anim.g.d(this.f39721d).translationX(((-linearLayout.getWidth()) / 2) + (r1.getMeasuredWidth() / 2));
            this.f39726i.d(false);
            this.f39725h.d(false);
            this.f39722e.setVisibility(0);
            return;
        }
        ProgressBar progressBar = this.f39724g;
        view.setTranslationX((progressBar.getProgress() / 1000.0f) * progressBar.getMeasuredWidth());
        view.setVisibility(0);
        LinearLayout linearLayout2 = this.f39723f;
        linearLayout2.setVisibility(0);
        com.waze.view.anim.g.d(linearLayout2).alpha(1.0f).setListener(null);
        com.waze.view.anim.g.d(this.f39720c).translationX(0.0f);
        com.waze.view.anim.g.d(this.f39721d).translationX(0.0f);
        this.f39726i.d(true);
        this.f39725h.d(true);
        this.f39722e.setVisibility(8);
        this.m.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.f39721d.d(bg.c().t(this.f39729l.getId(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(float f2, long j2) {
        this.f39724g.setProgress(0);
        this.n = (int) (1000.0f * f2);
        ValueAnimator valueAnimator = this.m;
        valueAnimator.setDuration((int) (j2 / f2));
        valueAnimator.start();
    }

    public final void m() {
        if (this.p) {
            return;
        }
        this.p = true;
        if (bg.c().w(this.f39729l)) {
            bg.c().q(true);
        } else {
            bg.c().m(this.f39729l.getId(), true);
        }
        com.waze.view.anim.g.d(this).alpha(0.0f).setListener(com.waze.view.anim.g.a(new bc(this, 2)));
    }
}

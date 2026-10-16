package com.waze.reports;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.waze.MainActivity;
import com.waze.R;
import com.waze.lm;
import com.waze.strings.DisplayStrings;
import com.waze.view.pages.LinePageIndicator;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cm extends com.waze.sharedui.d.a.d implements com.waze.sharedui.f {

    /* renamed from: a, reason: collision with root package name */
    private final LinePageIndicator f33781a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.sharedui.g.t f33782b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33783c;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout f33784d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewPager f33785e;

    /* renamed from: f, reason: collision with root package name */
    private final PagerAdapter f33786f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f33787g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f33788h;

    /* renamed from: i, reason: collision with root package name */
    private cl f33789i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33790j;

    public cm(Context context, ArrayList arrayList, int i2, Bundle bundle) throws Resources.NotFoundException {
        super(context, R.style.ReportDialog);
        this.f33783c = true;
        this.f33788h = null;
        this.f33790j = com.waze.shared_infra.o.b.a();
        this.f33787g = arrayList;
        setContentView(R.layout.place_photo_gallery);
        Window window = getWindow();
        com.waze.shared_infra.g.e.f(window);
        window.setLayout(-1, -1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.galleryMainLayout);
        this.f33784d = relativeLayout;
        com.waze.shared_infra.g.e.c(relativeLayout);
        relativeLayout.setOnClickListener(new b(this, 16));
        ViewPager viewPager = (ViewPager) relativeLayout.findViewById(R.id.galleryPager);
        this.f33785e = viewPager;
        if (this.f33786f != null) {
            viewPager.setAdapter(null);
        }
        this.f33781a = (LinePageIndicator) relativeLayout.findViewById(R.id.galleryIndicator);
        cg cgVar = new cg(this);
        this.f33786f = cgVar;
        viewPager.setAdapter(cgVar);
        w();
        cgVar.notifyDataSetChanged();
        viewPager.setCurrentItem(i2);
        this.f33788h = bundle;
        viewPager.getViewTreeObserver().addOnGlobalLayoutListener(new ch(this));
        viewPager.setOnPageChangeListener(new ci(this));
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC != null) {
            mainActivityC.w(this);
        }
        getOnBackPressedDispatcher().addCallback(new cj(this));
    }

    public static /* synthetic */ void i(cm cmVar, int i2, boolean z) {
        if (z) {
            cmVar.f33789i.a(i2);
        }
    }

    static /* bridge */ /* synthetic */ void j(cm cmVar) {
        int i2 = cmVar.f33788h.getInt(TtmlNode.LEFT);
        int i3 = cmVar.f33788h.getInt("top");
        int i4 = cmVar.f33788h.getInt("width");
        int i5 = cmVar.f33788h.getInt("height");
        ViewPager viewPager = cmVar.f33785e;
        viewPager.getLocationInWindow(new int[2]);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(i4 / viewPager.getWidth(), 1.0f, i5 / viewPager.getHeight(), 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        animationSet.addAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, (i2 + (i4 / 2)) - (r6[0] + (r10 / 2)), 1, 0.0f, 0, (i3 + (i5 / 2)) - (r6[1] + (r13 / 2)), 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(translateAnimation);
        viewPager.startAnimation(animationSet);
    }

    static /* bridge */ /* synthetic */ void k(cm cmVar) {
        Bundle bundle = cmVar.f33788h;
        if (bundle == null) {
            cmVar.dismiss();
            return;
        }
        int i2 = bundle.getInt(TtmlNode.LEFT);
        int i3 = cmVar.f33788h.getInt("top");
        int i4 = cmVar.f33788h.getInt("width");
        int i5 = cmVar.f33788h.getInt("height");
        ViewPager viewPager = cmVar.f33785e;
        viewPager.getLocationInWindow(new int[2]);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, i4 / viewPager.getWidth(), 1.0f, i5 / viewPager.getHeight(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, (i2 + (i4 / 2)) - (r7[0] + (r11 / 2)), 1, 0.0f, 0, (i3 + (i5 / 2)) - (r7[1] + (r14 / 2)));
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new db(cmVar, 1));
        viewPager.startAnimation(animationSet);
    }

    static /* bridge */ /* synthetic */ void l(final cm cmVar, final int i2) {
        com.waze.ab.q qVar = new com.waze.ab.q() { // from class: com.waze.reports.ca
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                cm.i(this.f33759a, i2, z);
            }
        };
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = cmVar.f33790j;
        oVar.Q(aVar.c(R.string.DELETE_PICTURE, new Object[0]));
        oVar.P(aVar.c(R.string.ARE_YOU_SURE_YOU_WANT_TO_DELETE_PICTURE, new Object[0]));
        oVar.f13808a = qVar;
        oVar.M(aVar.c(R.string.DELETE, new Object[0]));
        oVar.N(aVar.c(R.string.CANCEL, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    static /* bridge */ /* synthetic */ void m(cm cmVar, View view, bx bxVar) {
        float height;
        int height2;
        int width;
        int i2;
        int i3;
        if (bxVar.f33746i != null) {
            height = bxVar.f33746i.getHeight() / r0.getWidth();
        } else {
            height = 0.75f;
        }
        View viewFindViewById = view.findViewById(R.id.placePhotoFrame);
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(cmVar.getContext(), WindowManager.class);
        if (windowManager != null) {
            width = windowManager.getDefaultDisplay().getWidth();
            height2 = windowManager.getDefaultDisplay().getHeight();
        } else {
            height2 = 500;
            width = DisplayStrings.DS_OGOTTA_DRIVE_PDP_PS_TO_ACCESS_OTHER_MOODSU;
        }
        int paddingLeft = (width - viewFindViewById.getPaddingLeft()) - viewFindViewById.getPaddingRight();
        double d2 = height;
        double paddingLeft2 = ((height2 - viewFindViewById.getPaddingLeft()) - viewFindViewById.getPaddingRight()) - com.waze.ui.z.as.f(25);
        double d3 = paddingLeft;
        double d4 = paddingLeft2 / d2;
        if (d3 < d4) {
            i3 = (int) d3;
            i2 = (int) (d2 * d3);
        } else {
            i2 = (int) paddingLeft2;
            i3 = (int) d4;
        }
        bxVar.f33744g = i3;
        bxVar.f33745h = i2;
    }

    static /* bridge */ /* synthetic */ void n(cm cmVar, int i2) {
        Drawable drawableX = cmVar.x(R.drawable.list_icon_places_flag_unrelated);
        Drawable drawableX2 = cmVar.x(R.drawable.list_icon_places_flag_inappropriate);
        Drawable drawableX3 = cmVar.x(R.drawable.list_icon_places_flag_bad_quality);
        com.waze.shared_infra.o.a aVar = cmVar.f33790j;
        com.waze.sharedui.g.t tVar = new com.waze.sharedui.g.t(cmVar.getContext(), com.waze.sharedui.g.f.COLUMN_TEXT_ICON, aVar.c(R.string.WHATS_WRONG_WITH_THIS_PHOTOQ, new Object[0]), new com.waze.sharedui.g.s[]{new com.waze.sharedui.g.s(8, aVar.c(R.string.IT_HAS_NOTHING_TO_DO_WITH_THIS_PLACE, new Object[0]), drawableX), new com.waze.sharedui.g.s(5, aVar.c(R.string.IT_IS_INAPPROPRIATE, new Object[0]), drawableX2), new com.waze.sharedui.g.s(7, aVar.c(R.string.IT_IS_IN_LOW_QUALITY, new Object[0]), drawableX3)}, new ck(cmVar, i2));
        cmVar.f33782b = tVar;
        tVar.show();
    }

    private final void w() {
        int size = this.f33787g.size();
        LinePageIndicator linePageIndicator = this.f33781a;
        if (size <= 1) {
            linePageIndicator.setVisibility(8);
        } else {
            linePageIndicator.setVisibility(0);
            linePageIndicator.a(this.f33785e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable x(int i2) {
        Resources resources = getContext().getResources();
        Drawable drawable = ResourcesCompat.getDrawable(resources, i2, null);
        drawable.setTint(ResourcesCompat.getColor(resources, R.color.content_default, null));
        return drawable;
    }

    @Override // com.waze.sharedui.d.a.d, android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC != null) {
            mainActivityC.A(this);
        }
        super.dismiss();
    }

    final void o(cl clVar) {
        this.f33789i = clVar;
    }

    public final void p(View.OnClickListener onClickListener) {
        RelativeLayout relativeLayout = this.f33784d;
        View viewFindViewById = relativeLayout.findViewById(R.id.galleryAddPhotoButton);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(onClickListener);
        ((TextView) relativeLayout.findViewById(R.id.galleryAddPhotoButtonText)).setText(this.f33790j.c(R.string.NEARING_DEST_TAKE_PHOTO, new Object[0]));
    }

    public final void q(ArrayList arrayList) {
        this.f33787g = arrayList;
        w();
        this.f33786f.notifyDataSetChanged();
    }

    @Override // com.waze.sharedui.f
    public final void u() throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.f33786f;
        pagerAdapter.notifyDataSetChanged();
        ViewPager viewPager = this.f33785e;
        int currentItem = viewPager.getCurrentItem();
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(currentItem);
    }

    public final void v() {
        this.f33783c = false;
    }
}

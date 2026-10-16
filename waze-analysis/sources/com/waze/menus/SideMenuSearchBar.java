package com.waze.menus;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.waze.R;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.ui.z.as;
import com.waze.view.text.WazeEditText;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class SideMenuSearchBar extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private WazeEditText f29625a;

    /* renamed from: b, reason: collision with root package name */
    private View f29626b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f29627c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f29628d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f29629e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout f29630f;

    /* renamed from: g, reason: collision with root package name */
    private ac f29631g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29632h;

    /* renamed from: i, reason: collision with root package name */
    private TextWatcher f29633i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29634j;

    /* renamed from: k, reason: collision with root package name */
    private View f29635k;

    /* renamed from: l, reason: collision with root package name */
    private w f29636l;
    private long m;

    public SideMenuSearchBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29636l = new aa(0);
        if (isInEditMode()) {
            as.j(getResources());
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.side_menu_search_bar, (ViewGroup) null);
        this.f29630f = (FrameLayout) viewInflate.findViewById(R.id.speechButtonContainer);
        this.f29625a = (WazeEditText) viewInflate.findViewById(R.id.searchBox);
        this.f29626b = viewInflate.findViewById(R.id.btnCancelSearch);
        this.f29627c = (RelativeLayout) viewInflate.findViewById(R.id.searchBoxContainer);
        this.f29628d = (ImageView) viewInflate.findViewById(R.id.btnClearSearch);
        this.f29629e = (ImageView) viewInflate.findViewById(R.id.imgMagGlass);
        this.f29625a.setContentDescription(getResources().getString(R.string.contentDescription_sideMenuSearchBox));
        this.f29630f.setOnClickListener(new com.waze.feedback.b(this, 19));
        this.f29626b.setOnClickListener(new com.waze.feedback.b(this, 20));
        this.f29628d.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 1));
        this.f29625a.setOnEditorActionListener(new com.waze.favorites.s(this, 2));
        this.f29633i = new ab(this);
        this.f29634j = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f29635k = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f29635k.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        addView(this.f29635k);
        View view = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, as.f(1));
        layoutParams.gravity = 80;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.separator_default));
        ((FrameLayout) this.f29635k).addView(view);
        ImageViewCompat.setImageTintList(this.f29629e, ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.content_default)));
        ImageViewCompat.setImageTintMode(this.f29629e, PorterDuff.Mode.SRC_IN);
        addView(viewInflate);
        setPadding(0, 0, 0, 0);
    }

    public static /* synthetic */ void d(SideMenuSearchBar sideMenuSearchBar, ValueAnimator valueAnimator) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) sideMenuSearchBar.f29627c.getLayoutParams();
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        sideMenuSearchBar.f29627c.setLayoutParams(layoutParams);
    }

    static /* bridge */ /* synthetic */ void f(SideMenuSearchBar sideMenuSearchBar) {
        if (sideMenuSearchBar.f29628d.getVisibility() == 0) {
            return;
        }
        sideMenuSearchBar.f29628d.setVisibility(0);
        sideMenuSearchBar.f29628d.setAlpha(0.0f);
        com.waze.view.anim.g.d(sideMenuSearchBar.f29628d).alpha(1.0f).setListener(null);
        if (sideMenuSearchBar.f29634j) {
            com.waze.view.anim.g.d(sideMenuSearchBar.f29630f).alpha(0.0f).setListener(com.waze.view.anim.g.b(sideMenuSearchBar.f29630f));
        }
    }

    public static /* synthetic */ void m(SideMenuSearchBar sideMenuSearchBar, int i2, KeyEvent keyEvent) {
        if (i2 == 3 || (keyEvent != null && keyEvent.getAction() == 1)) {
            sideMenuSearchBar.f29631g.b();
            com.waze.search.d.a.b.f().d(com.waze.search.stats.c.f36019h, null, null, sideMenuSearchBar.f29625a.getText() != null ? Long.valueOf(sideMenuSearchBar.f29625a.getText().toString().trim().length()) : null, null, null, null, null, null, null, null, bjz.MOBILE_ANDROID);
        }
    }

    public static /* synthetic */ void n(SideMenuSearchBar sideMenuSearchBar) {
        com.waze.search.d.a.b.f().n(com.waze.search.stats.k.f36058a, null, null, null, null, null, bjz.MOBILE_ANDROID);
        ac acVar = sideMenuSearchBar.f29631g;
        if (acVar != null) {
            acVar.a();
        }
    }

    public static /* synthetic */ void o(SideMenuSearchBar sideMenuSearchBar) {
        sideMenuSearchBar.f29625a.setText("");
        sideMenuSearchBar.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f29634j) {
            this.f29630f.setVisibility(0);
            this.f29630f.setAlpha(0.0f);
            com.waze.view.anim.g.d(this.f29630f).alpha(1.0f).setListener(null);
        }
        com.waze.view.anim.g.d(this.f29628d).alpha(0.0f).setListener(com.waze.view.anim.g.c(this.f29628d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        h();
        com.waze.search.d.a.b.f().n(com.waze.search.stats.k.f36059b, null, null, null, null, null, bjz.MOBILE_ANDROID);
        this.f29636l.a(SpeechRecognizerActivity.m(getContext(), Integer.valueOf(R.string.DICTATION_BOTTOM_SHEET_START_LISTENING_NON_SEARCH)), 1);
    }

    public final void g() {
        this.f29632h = false;
        if (isInEditMode()) {
            return;
        }
        this.f29625a.addTextChangedListener(this.f29633i);
        this.f29629e.setVisibility(8);
        this.f29625a.setPadding(as.f(16), this.f29625a.getPaddingTop(), this.f29625a.getPaddingRight(), this.f29625a.getPaddingBottom());
        this.f29625a.setFocusableInTouchMode(true);
        this.f29625a.setFocusable(true);
        this.f29625a.requestFocus();
        com.waze.ui.x.u.l(getContext(), this.f29625a);
    }

    public final void h() {
        if (isInEditMode()) {
            return;
        }
        com.waze.ui.x.u.j(getContext(), this.f29625a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f29625a.hasFocus();
    }

    public final void i(w wVar) {
        this.f29636l = wVar;
    }

    public final void j(String str) {
        this.f29625a.post(new com.google.firebase.appcheck.debug.a.a(this, str, 4, null));
    }

    public final void k(ac acVar) {
        this.f29631g = acVar;
    }

    public final void l(String str) {
        this.f29625a.setText("");
        this.f29625a.append(str);
        ac acVar = this.f29631g;
        if (acVar != null) {
            acVar.c(str);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f29632h) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.m = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29632h && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.m <= 300) {
            Rect rect = new Rect();
            this.m = 0L;
            this.f29630f.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                t();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q() {
        this.f29632h = true;
        this.f29625a.clearFocus();
        this.f29625a.setFocusable(false);
        this.f29629e.setVisibility(0);
        this.f29625a.setPadding(as.f(48), this.f29625a.getPaddingTop(), this.f29625a.getPaddingRight(), this.f29625a.getPaddingBottom());
        h();
    }

    public final void r() {
        if (this.f29626b.getVisibility() == 0 && this.f29626b.getTranslationX() == 0.0f) {
            return;
        }
        int iF = as.f(56);
        this.f29626b.setVisibility(0);
        this.f29626b.setTranslationX(-iF);
        com.waze.view.anim.g.f(this.f29626b, 0L, null).translationX(0.0f).setListener(null);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iF);
        valueAnimatorOfInt.addUpdateListener(new com.waze.design_components.button.timer.b(this, 3));
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.setDuration(0L);
        valueAnimatorOfInt.start();
    }

    public SideMenuSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideMenuSearchBar(Context context) {
        this(context, null);
    }
}

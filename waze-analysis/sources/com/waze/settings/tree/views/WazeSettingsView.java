package com.waze.settings.tree.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.search.h.ay;
import com.waze.sharedui.views.CheckBoxView;
import com.waze.sharedui.views.ProgressAnimation;
import com.waze.sharedui.views.WazeTextView;
import com.waze.sharedui.views.ae;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeSettingsView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f37597a;

    /* renamed from: b, reason: collision with root package name */
    private View f37598b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f37599c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f37600d;

    /* renamed from: e, reason: collision with root package name */
    private SwitchCompat f37601e;

    /* renamed from: f, reason: collision with root package name */
    private ae f37602f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f37603g;

    /* renamed from: h, reason: collision with root package name */
    private SeekBar f37604h;

    /* renamed from: i, reason: collision with root package name */
    private CheckBoxView f37605i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f37606j;

    /* renamed from: k, reason: collision with root package name */
    private WazeTextView f37607k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f37608l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private float q;
    private int r;
    private int s;
    private final com.waze.shared_infra.o.a t;
    private com.waze.sharedui.views.x u;

    public WazeSettingsView(Context context, AttributeSet attributeSet) {
        int attributeResourceValue;
        String strC;
        super(context, attributeSet);
        this.f37597a = -1;
        this.o = 0;
        this.p = false;
        this.s = 0;
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        this.t = aVarA;
        this.u = new v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SettingsView);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.SettingsView_icon);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(3, 0);
        String string = typedArrayObtainStyledAttributes.getString(1);
        String str = (string == null || (attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "key", 0)) == 0 || (strC = aVarA.c(attributeResourceValue, new Object[0])) == null || strC.isEmpty()) ? string : strC;
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.s = typedArrayObtainStyledAttributes.getColor(5, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        a(context, z, integer, drawable, integer2, str, string2);
    }

    private final void a(Context context, boolean z, int i2, Drawable drawable, int i3, String str, String str2) {
        b(context);
        p(drawable);
        u(i2);
        if (this.p != z) {
            this.f37598b.setLayoutParams((ConstraintLayout.LayoutParams) this.f37598b.getLayoutParams());
            this.p = z;
        }
        B(i3);
        if (str != null) {
            N(str);
        }
        P(str2);
    }

    private final void b(Context context) {
        inflate(context, R.layout.waze_settings_view_common, this);
        setBackground(new RippleDrawable(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.background_variant)), new ColorDrawable(ContextCompat.getColor(getContext(), R.color.background_default)), null));
        this.f37598b = findViewById(R.id.settingsViewSeparator);
        this.f37599c = (FrameLayout) findViewById(R.id.settingsViewRightDecor);
        this.f37606j = (ImageView) findViewById(R.id.settingsViewIcon);
        this.f37607k = (WazeTextView) findViewById(R.id.settingsViewKey);
        this.f37608l = (TextView) findViewById(R.id.settingsViewValue);
        this.m = ContextCompat.getColor(getContext(), R.color.content_default);
        this.n = ContextCompat.getColor(getContext(), R.color.content_p2);
        this.q = getContext().getResources().getDisplayMetrics().density;
    }

    private final void c() {
        this.f37599c.removeAllViews();
        this.f37600d = null;
        this.f37601e = null;
        this.f37602f = null;
        this.f37604h = null;
        this.f37605i = null;
        this.f37603g = null;
        if (isClickable()) {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(boolean z) {
        if (this.f37608l.getText().length() > 0) {
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, this.r));
        animationSet.setDuration(true != z ? 200L : 0L);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f37607k.startAnimation(animationSet);
    }

    public final void A(String str) {
        N(str);
        P(null);
    }

    public final void B(int i2) {
        if (this.f37597a == i2) {
            return;
        }
        this.f37597a = i2;
        if (i2 == 0) {
            c();
            return;
        }
        if (i2 == 1) {
            c();
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.settingsViewRightDecor);
            viewGroup.setVisibility(0);
            layoutInflater.inflate(R.layout.waze_settings_selector, viewGroup);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.settingsViewSelectorDecoration);
            this.f37600d = imageView;
            imageView.setImageResource(R.drawable.small_arrow_common);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37600d.getLayoutParams();
            layoutParams.rightMargin = (int) (this.q * 15.0f);
            layoutParams.height = -2;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((View) this.f37600d.getParent()).getLayoutParams();
            layoutParams2.gravity = 17;
            ((View) this.f37600d.getParent()).setLayoutParams(layoutParams2);
            this.f37600d.setLayoutParams(layoutParams);
            return;
        }
        if (i2 == 2) {
            c();
            com.waze.design_components.f.a aVar = new com.waze.design_components.f.a(getContext());
            this.f37601e = aVar;
            this.f37599c.addView(aVar);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f37601e.getLayoutParams();
            layoutParams3.rightMargin = (int) (this.q * 16.0f);
            layoutParams3.height = (int) (this.q * 80.0f);
            layoutParams3.gravity = 17;
            this.f37601e.setLayoutParams(layoutParams3);
            this.f37601e.setClickable(false);
            setOnClickListener(new w(this, 1, (byte[]) null));
            return;
        }
        if (i2 == 3) {
            c();
            ae aeVar = new ae(getContext());
            this.f37602f = aeVar;
            this.f37599c.addView(aeVar);
            ((FrameLayout.LayoutParams) this.f37602f.getLayoutParams()).rightMargin = (int) (this.q * 16.0f);
            setOnClickListener(new w(this, 0));
            return;
        }
        if (i2 == 8) {
            c();
            ImageView imageView2 = new ImageView(getContext());
            this.f37603g = imageView2;
            imageView2.setImageResource(R.drawable.settings_selected_icon);
            this.f37603g.setPadding(Math.round(this.q * 16.0f), 0, Math.round(this.q * 16.0f), 0);
            x(this.f37603g);
            return;
        }
        if (i2 == 4) {
            c();
            SeekBar seekBar = (SeekBar) ((ViewGroup) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.waze_settings_seekbar, this.f37599c)).getChildAt(0);
            this.f37604h = seekBar;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) seekBar.getLayoutParams();
            layoutParams4.rightMargin = (int) (this.q * (-4.0f));
            layoutParams4.width = (int) (this.q * 200.0f);
            layoutParams4.gravity = 16;
            this.f37604h.setLayoutParams(layoutParams4);
            return;
        }
        if (i2 == 5) {
            c();
            CheckBoxView checkBoxView = new CheckBoxView(getContext());
            this.f37605i = checkBoxView;
            this.f37599c.addView(checkBoxView);
            ((FrameLayout.LayoutParams) this.f37605i.getLayoutParams()).rightMargin = (int) (this.q * 15.0f);
            setOnClickListener(new w(this, 2, (char[]) null));
            return;
        }
        if (i2 != 6) {
            if (i2 == 7) {
                c();
                ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.waze_settings_right_lines, this.f37599c);
                return;
            }
            return;
        }
        c();
        this.f37607k.setVisibility(8);
        this.f37608l.setVisibility(8);
        LayoutInflater layoutInflater2 = (LayoutInflater) getContext().getSystemService("layout_inflater");
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.settingsViewRightDecor);
        viewGroup2.setVisibility(0);
        layoutInflater2.inflate(R.layout.waze_settings_edit_text, viewGroup2);
        this.f37607k = (WazeTextView) viewGroup2.findViewById(R.id.settingsViewEditKey);
        this.f37608l = (TextView) viewGroup2.findViewById(R.id.settingsViewEditValue);
        viewGroup2.findViewById(R.id.settingsViewEditDelete).setOnClickListener(new w(this, 3, (short[]) null));
        this.f37607k.getViewTreeObserver().addOnGlobalLayoutListener(new x(this));
        n(true);
        this.f37608l.setOnFocusChangeListener(new y(this));
    }

    public final void C(com.waze.sharedui.views.x xVar) {
        this.u = xVar;
    }

    public final void D(boolean z) {
        int i2 = this.f37597a;
        if (i2 == 2) {
            this.f37601e.setChecked(z);
            return;
        }
        if (i2 == 3) {
            this.f37602f.b(z);
        } else {
            if (i2 == 5) {
                this.f37605i.c(z);
                return;
            }
            if (i2 != 8) {
                throw new IllegalStateException();
            }
            this.f37603g.setVisibility(true == z ? 0 : 8);
        }
    }

    public final void E(int i2) {
        this.n = i2;
        this.f37608l.setTextColor(i2);
    }

    public final void F(boolean z) {
        int color = ContextCompat.getColor(getContext(), R.color.disabled_text);
        int i2 = z ? this.m : color;
        int i3 = z ? this.n : color;
        if (this.f37597a == 6) {
            float f2 = true == z ? 1.0f : 0.5f;
            this.f37608l.setEnabled(z);
            setAlpha(f2);
            return;
        }
        this.f37607k.setTextColor(i2);
        this.f37608l.setTextColor(i3);
        int i4 = this.f37597a;
        if (i4 != 1) {
            if (i4 == 2) {
                this.f37599c.setAlpha(true == z ? 1.0f : 0.5f);
            }
        } else {
            TextView textView = this.f37608l;
            if (z) {
                color = this.n;
            }
            textView.setTextColor(color);
        }
    }

    public final void G() {
        ProgressAnimation progressAnimation = new ProgressAnimation(getContext());
        this.f37599c.removeAllViews();
        this.f37599c.addView(progressAnimation);
        int iRound = Math.round(this.q * 8.0f);
        int i2 = iRound + iRound;
        progressAnimation.setPadding(0, i2, iRound, i2);
        progressAnimation.a();
        super.setEnabled(false);
    }

    public final boolean H() {
        int i2 = this.f37597a;
        if (i2 == 2) {
            return this.f37601e.isChecked();
        }
        if (i2 == 3) {
            return this.f37602f.isSelected();
        }
        if (i2 == 5) {
            return this.f37605i.e();
        }
        if (i2 == 8) {
            return this.f37603g.getVisibility() == 0;
        }
        throw new IllegalStateException();
    }

    public final int J() {
        return (int) TypedValue.applyDimension(1, 28.0f, getResources().getDisplayMetrics());
    }

    public final void K(int i2) {
        ImageView imageView = this.f37606j;
        if (i2 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f37606j.setImageResource(i2);
        }
    }

    public final void L(Drawable drawable) {
        this.f37606j.setVisibility(0);
        this.f37606j.setImageDrawable(drawable);
    }

    public final void M() {
        this.f37598b.setVisibility(8);
    }

    public final void N(String str) {
        this.f37607k.setText(str);
    }

    public final void O() {
        this.f37600d.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.content_default)));
    }

    public final void P(String str) {
        TextView textView = this.f37608l;
        if (str == null) {
            textView.setVisibility(8);
            return;
        }
        CharSequence text = textView.getText();
        if (text.length() == 0) {
            text = this.f37608l.getHint();
        }
        this.f37608l.setText(str);
        this.f37608l.setVisibility(0);
        if (this.f37597a == 6) {
            if (str.isEmpty() && !this.f37608l.hasFocus() && TextUtils.isEmpty(this.f37608l.getHint())) {
                d(true);
            } else if (text == null || text.length() == 0) {
                n(true);
            }
        }
    }

    public final void Q(int i2) {
        o(i2);
        this.f37608l.setContentDescription(getResources().getString(R.string.contentDescription_generalSettingsLanguageValue));
    }

    public final String k() {
        return this.f37607k.getText().toString();
    }

    public final void m() {
        this.f37599c.removeAllViews();
        super.setEnabled(true);
    }

    public final void n(boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, this.r, 0.0f));
        animationSet.setDuration(true != z ? 200L : 0L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f37607k.startAnimation(animationSet);
    }

    public final void o(int i2) {
        this.f37607k.setContentDescription(getResources().getString(i2));
    }

    public final void p(Drawable drawable) {
        ImageView imageView = this.f37606j;
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f37606j.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
        int i2 = this.s;
        if (i2 != 0) {
            this.f37606j.setImageTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void q(int i2) {
        this.m = i2;
        this.f37607k.setTextColor(i2);
    }

    public final void r(int i2) {
        this.f37607k.setTextColor(i2);
    }

    public final void s(final com.waze.sharedui.views.w wVar) {
        int i2 = this.f37597a;
        if (i2 == 2) {
            this.f37601e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.waze.settings.tree.views.u
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    com.waze.sharedui.views.w wVar2 = wVar;
                    if (wVar2 != null) {
                        wVar2.a(z);
                    }
                }
            });
        } else if (i2 == 3) {
            this.f37602f.a(wVar);
        } else {
            if (i2 != 5) {
                throw new IllegalStateException();
            }
            this.f37605i.g(new ay(wVar));
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        F(z);
    }

    public final void t(z zVar) {
        this.f37604h.setOnSeekBarChangeListener(zVar);
    }

    public final void u(int i2) {
        if (this.o == i2) {
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.f37598b.setVisibility(8);
        } else {
            this.f37598b.setVisibility(0);
        }
        this.o = i2;
    }

    public final void v(Integer num) {
        this.f37604h.setProgress(num.intValue());
    }

    public final void w(boolean z, boolean z2) {
        if (this.f37597a != 3) {
            return;
        }
        ae aeVar = this.f37602f;
        if (z2) {
            aeVar.c(z);
        } else {
            aeVar.b(z);
        }
    }

    public final void x(View view) {
        this.f37599c.removeAllViews();
        if (view != null) {
            this.f37599c.addView(view);
        }
    }

    public final void y(int i2) {
        if (this.f37597a != 1) {
            throw new IllegalStateException();
        }
        this.f37600d.setImageResource(i2);
    }

    public final void z() {
        this.f37606j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f37606j.getLayoutParams().width = J();
        this.f37606j.getLayoutParams().height = J();
    }

    public WazeSettingsView(Context context) {
        super(context);
        this.f37597a = -1;
        this.o = 0;
        this.p = false;
        this.s = 0;
        this.t = com.waze.shared_infra.o.b.a();
        this.u = new v();
        b(context);
    }

    public WazeSettingsView(Context context, boolean z, int i2, Drawable drawable, int i3) {
        super(context);
        this.f37597a = -1;
        this.o = 0;
        this.p = false;
        this.s = 0;
        this.t = com.waze.shared_infra.o.b.a();
        this.u = new v();
        a(context, z, i2, drawable, i3, null, null);
    }
}

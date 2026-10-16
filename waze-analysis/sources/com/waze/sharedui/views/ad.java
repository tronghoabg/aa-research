package com.waze.sharedui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ad extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    protected int f39187a;

    /* renamed from: b, reason: collision with root package name */
    protected int f39188b;

    /* renamed from: c, reason: collision with root package name */
    protected float f39189c;

    /* renamed from: d, reason: collision with root package name */
    private ac f39190d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f39191e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39192f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f39193g;

    /* renamed from: h, reason: collision with root package name */
    private WazeEditTextBase f39194h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f39195i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f39196j;

    /* renamed from: k, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f39197k;

    /* renamed from: l, reason: collision with root package name */
    private View.OnClickListener f39198l;
    private View.OnClickListener m;
    private p n;

    public ad(Context context) {
        super(context);
        this.f39190d = ac.EMPTY;
        this.f39189c = -1.0f;
        this.f39198l = new com.waze.profile.m(this, 14);
        this.m = null;
        a(context);
    }

    private final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.waze_settings_textfield, this);
        this.f39191e = (ImageView) findViewById(R.id.background);
        this.f39192f = (ImageView) findViewById(R.id.icon);
        this.f39193g = (ImageView) findViewById(R.id.right_icon);
        this.f39194h = (WazeEditTextBase) findViewById(R.id.input);
        this.f39187a = ContextCompat.getColor(getContext(), R.color.alarming);
        this.f39188b = ContextCompat.getColor(getContext(), R.color.on_primary);
        s(R.drawable.close_outline_24px, R.drawable.list_icon_form_error);
        r(this.f39198l, this.m);
        this.f39193g.setVisibility(8);
        this.f39191e.setOnClickListener(new com.waze.profile.m(this, 15));
    }

    public static /* synthetic */ void j(ad adVar) {
        p pVar = adVar.n;
        if (pVar != null) {
            pVar.b(adVar.f39193g);
        }
    }

    public static /* synthetic */ void y(ad adVar) {
        if (adVar.f39190d == ac.DISABLED) {
            return;
        }
        adVar.f39194h.setText("");
        adVar.f39194h.requestFocus();
        adVar.t(ac.EMPTY);
    }

    public final ImageView e() {
        return this.f39191e;
    }

    public final ImageView f() {
        return this.f39193g;
    }

    public final WazeEditTextBase g() {
        return this.f39194h;
    }

    public final ac h() {
        return this.f39190d;
    }

    public final String i() {
        return this.f39194h.getText().toString();
    }

    public final void k(boolean z) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.a(z);
            this.n = null;
        }
    }

    public final void l() {
        this.f39194h.requestFocus();
        WazeEditTextBase wazeEditTextBase = this.f39194h;
        wazeEditTextBase.setSelection(wazeEditTextBase.getText().length());
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f39194h, 1);
    }

    protected final void m(ac acVar) {
        int iOrdinal = acVar.ordinal();
        ImageView imageView = this.f39193g;
        if (iOrdinal != 3) {
            imageView.setOnClickListener(this.f39198l);
        } else {
            imageView.setOnClickListener(this.m);
        }
    }

    final void n() {
        int iOrdinal = this.f39190d.ordinal();
        Drawable drawable = iOrdinal != 0 ? iOrdinal != 3 ? this.f39195i : this.f39196j : null;
        this.f39193g.setVisibility(drawable != null ? 0 : 8);
        this.f39193g.setImageDrawable(drawable);
    }

    public final void o(String str) {
        this.f39194h.setHint(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39197k = new com.waze.planned_drive.histogram.c(this, 1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f39197k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f39197k);
        k(false);
    }

    public final void p(int i2) {
        ImageView imageView = this.f39192f;
        if (i2 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i2);
            this.f39192f.setVisibility(0);
        }
    }

    public final void q(TextView.OnEditorActionListener onEditorActionListener) {
        this.f39194h.setOnEditorActionListener(onEditorActionListener);
    }

    protected final void r(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f39198l = onClickListener;
        this.m = onClickListener2;
        m(this.f39190d);
    }

    protected final void s(int i2, int i3) {
        if (i2 != 0) {
            this.f39195i = android.support.a.i.d(getContext(), i2);
            this.f39195i.setTint(ContextCompat.getColor(getContext(), R.color.content_p2));
        } else {
            this.f39195i = null;
        }
        this.f39196j = android.support.a.i.d(getContext(), i3);
    }

    public void t(ac acVar) {
        this.f39190d = acVar;
        this.f39191e.setBackgroundResource(acVar.a());
        n();
        ac acVar2 = ac.DISABLED;
        int color = ContextCompat.getColor(getContext(), R.color.disabled_text);
        int color2 = ContextCompat.getColor(getContext(), R.color.hint_text);
        int color3 = ContextCompat.getColor(getContext(), R.color.content_default);
        this.f39194h.setEnabled(acVar != acVar2);
        if (acVar == acVar2) {
            color2 = color;
        }
        this.f39194h.setHintTextColor(color2);
        if (acVar != acVar2) {
            color = color3;
        }
        this.f39194h.setTextColor(color);
        m(acVar);
    }

    public final void u(String str) {
        this.f39194h.setText(str);
        this.f39194h.setSelection(str.length());
    }

    public final void v(TransformationMethod transformationMethod) {
        this.f39194h.setTransformationMethod(transformationMethod);
    }

    public final void w(String str) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.e(str);
            return;
        }
        p pVar2 = new p(getContext(), str);
        this.n = pVar2;
        pVar2.c(this.f39187a);
        this.n.f(this.f39188b);
        this.n.h();
        float f2 = this.f39189c;
        if (f2 >= 0.0f) {
            this.n.g(f2);
        }
        p pVar3 = this.n;
        ab abVar = new ab(this, 0);
        pVar3.f39261b.setTouchable(true);
        pVar3.f39263d.setOnTouchListener(abVar);
        this.n.d(this.f39193g);
    }

    public final boolean x() {
        return this.n == null;
    }

    public ad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39190d = ac.EMPTY;
        this.f39189c = -1.0f;
        this.f39198l = new com.waze.profile.m(this, 14);
        this.m = null;
        a(context);
    }

    public ad(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39190d = ac.EMPTY;
        this.f39189c = -1.0f;
        this.f39198l = new com.waze.profile.m(this, 14);
        this.m = null;
        a(context);
    }
}

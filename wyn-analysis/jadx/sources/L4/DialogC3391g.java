package l4;

import a2.v;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.os.IBinder;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.google.android.gms.ads.nativead.l;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import f8.w;
import ff.AbstractC2641B;
import hc.C2816b;
import vf.AbstractC4345a;

/* renamed from: l4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC3391g extends Dialog implements View.OnClickListener, DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final MDRootLayout f39986a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnShowListener f39987b;

    /* renamed from: c, reason: collision with root package name */
    public final C3389e f39988c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f39989d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39990e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f39991f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f39992g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f39993h;

    /* renamed from: i, reason: collision with root package name */
    public final View f39994i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f39995j;
    public final TextView k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckBox f39996l;

    /* renamed from: m, reason: collision with root package name */
    public final MDButton f39997m;

    /* renamed from: n, reason: collision with root package name */
    public final MDButton f39998n;

    /* renamed from: o, reason: collision with root package name */
    public final MDButton f39999o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40000p;

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC3391g(C3389e c3389e) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, SecurityException, IllegalArgumentException {
        int i5;
        int i10 = 1;
        boolean z2 = c3389e.f39960E == 2;
        Context context = c3389e.f39961a;
        boolean zC = AbstractC4345a.C(context, R.attr.md_dark_theme, z2);
        c3389e.f39960E = zC ? 2 : 1;
        super(context, zC ? R.style.MD_Dark : R.style.MD_Light);
        new Handler();
        this.f39988c = c3389e;
        MDRootLayout mDRootLayout = (MDRootLayout) LayoutInflater.from(context).inflate(c3389e.f39972m != null ? R.layout.md_dialog_custom : c3389e.f39984y != null ? c3389e.f39958C != null ? R.layout.md_dialog_list_check : R.layout.md_dialog_list : c3389e.f39958C != null ? R.layout.md_dialog_basic_check : R.layout.md_dialog_basic, (ViewGroup) null);
        this.f39986a = mDRootLayout;
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        if (c3389e.f39956A == 0) {
            c3389e.f39956A = AbstractC4345a.D(context, R.attr.md_background_color, AbstractC4345a.D(getContext(), R.attr.colorBackgroundFloating, 0));
        }
        if (c3389e.f39956A != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.md_bg_corner_radius));
            gradientDrawable.setColor(c3389e.f39956A);
            getWindow().setBackgroundDrawable(gradientDrawable);
        }
        c3389e.f39974o = AbstractC4345a.B(context, R.attr.md_positive_color, c3389e.f39974o);
        c3389e.f39976q = AbstractC4345a.B(context, R.attr.md_neutral_color, c3389e.f39976q);
        c3389e.f39975p = AbstractC4345a.B(context, R.attr.md_negative_color, c3389e.f39975p);
        c3389e.f39973n = AbstractC4345a.D(context, R.attr.md_widget_color, c3389e.f39973n);
        c3389e.f39969i = AbstractC4345a.D(context, R.attr.md_title_color, AbstractC4345a.D(getContext(), android.R.attr.textColorPrimary, 0));
        int iD = AbstractC4345a.D(context, R.attr.md_content_color, AbstractC4345a.D(getContext(), android.R.attr.textColorSecondary, 0));
        c3389e.f39970j = iD;
        c3389e.f39957B = AbstractC4345a.D(context, R.attr.md_item_color, iD);
        this.f39990e = (TextView) mDRootLayout.findViewById(R.id.md_title);
        this.f39989d = (ImageView) mDRootLayout.findViewById(R.id.md_icon);
        this.f39994i = mDRootLayout.findViewById(R.id.md_titleFrame);
        this.f39991f = (TextView) mDRootLayout.findViewById(R.id.md_content);
        this.f39993h = (RecyclerView) mDRootLayout.findViewById(R.id.md_contentRecyclerView);
        this.f39996l = (CheckBox) mDRootLayout.findViewById(R.id.md_promptCheckbox);
        this.f39997m = (MDButton) mDRootLayout.findViewById(R.id.md_buttonDefaultPositive);
        this.f39998n = (MDButton) mDRootLayout.findViewById(R.id.md_buttonDefaultNeutral);
        this.f39999o = (MDButton) mDRootLayout.findViewById(R.id.md_buttonDefaultNegative);
        this.f39997m.setVisibility(c3389e.k != null ? 0 : 8);
        this.f39998n.setVisibility(8);
        this.f39999o.setVisibility(c3389e.f39971l != null ? 0 : 8);
        this.f39997m.setFocusable(true);
        this.f39998n.setFocusable(true);
        this.f39999o.setFocusable(true);
        if (c3389e.f39983x != null) {
            this.f39989d.setVisibility(0);
            this.f39989d.setImageDrawable(c3389e.f39983x);
        } else {
            Drawable drawableE = AbstractC4345a.E(context, R.attr.md_icon);
            if (drawableE != null) {
                this.f39989d.setVisibility(0);
                this.f39989d.setImageDrawable(drawableE);
            } else {
                this.f39989d.setVisibility(8);
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.md_icon_max_size});
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            int dimensionPixelSize2 = AbstractC4345a.C(context, R.attr.md_icon_limit_icon_to_default_size, false) ? context.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size) : dimensionPixelSize;
            if (dimensionPixelSize2 > -1) {
                this.f39989d.setAdjustViewBounds(true);
                this.f39989d.setMaxHeight(dimensionPixelSize2);
                this.f39989d.setMaxWidth(dimensionPixelSize2);
                this.f39989d.requestLayout();
            }
            mDRootLayout.setDividerColor(AbstractC4345a.D(context, R.attr.md_divider_color, AbstractC4345a.D(getContext(), R.attr.md_divider, 0)));
            TextView textView = this.f39990e;
            if (textView != null) {
                d(textView, c3389e.f39982w);
                this.f39990e.setTextColor(c3389e.f39969i);
                this.f39990e.setGravity(c3389e.f39963c.a());
                TextView textView2 = this.f39990e;
                int iOrdinal = c3389e.f39963c.ordinal();
                textView2.setTextAlignment(iOrdinal != 1 ? iOrdinal != 2 ? 5 : 6 : 4);
                CharSequence charSequence = c3389e.f39962b;
                if (charSequence == null) {
                    this.f39994i.setVisibility(8);
                } else {
                    this.f39990e.setText(charSequence);
                    this.f39994i.setVisibility(0);
                }
            }
            TextView textView3 = this.f39991f;
            if (textView3 != null) {
                textView3.setMovementMethod(new LinkMovementMethod());
                d(this.f39991f, c3389e.f39981v);
                this.f39991f.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f);
                ColorStateList colorStateList = c3389e.f39977r;
                if (colorStateList == null) {
                    this.f39991f.setLinkTextColor(AbstractC4345a.D(getContext(), android.R.attr.textColorPrimary, 0));
                } else {
                    this.f39991f.setLinkTextColor(colorStateList);
                }
                this.f39991f.setTextColor(c3389e.f39970j);
                this.f39991f.setGravity(c3389e.f39964d.a());
                TextView textView4 = this.f39991f;
                int iOrdinal2 = c3389e.f39964d.ordinal();
                textView4.setTextAlignment(iOrdinal2 != 1 ? iOrdinal2 != 2 ? 5 : 6 : 4);
                this.f39991f.setVisibility(8);
            }
            CheckBox checkBox = this.f39996l;
            if (checkBox != null) {
                checkBox.setText(c3389e.f39958C);
                this.f39996l.setChecked(false);
                this.f39996l.setOnCheckedChangeListener(c3389e.f39959D);
                d(this.f39996l, c3389e.f39981v);
                this.f39996l.setTextColor(c3389e.f39970j);
                CheckBox checkBox2 = this.f39996l;
                int i11 = c3389e.f39973n;
                i5 = 2;
                int iH = AbstractC4345a.h(0.3f, AbstractC4345a.y(AbstractC4345a.D(checkBox2.getContext(), android.R.attr.textColorPrimary, 0)) ? -16777216 : -1);
                checkBox2.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled, -16842912}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, android.R.attr.state_checked}}, new int[]{AbstractC4345a.D(checkBox2.getContext(), R.attr.colorControlNormal, 0), i11, iH, iH}));
            } else {
                i5 = 2;
            }
            mDRootLayout.setButtonGravity(c3389e.f39967g);
            mDRootLayout.setButtonStackedGravity(c3389e.f39965e);
            mDRootLayout.setStackingBehavior(null);
            boolean zC2 = AbstractC4345a.C(context, android.R.attr.textAllCaps, true);
            zC2 = zC2 ? AbstractC4345a.C(context, R.attr.textAllCaps, true) : zC2;
            MDButton mDButton = this.f39997m;
            d(mDButton, c3389e.f39982w);
            mDButton.setAllCapsCompat(zC2);
            mDButton.setText(c3389e.k);
            mDButton.setTextColor(c3389e.f39974o);
            MDButton mDButton2 = this.f39997m;
            EnumC3387c enumC3387c = EnumC3387c.f39948a;
            mDButton2.setStackedSelector(a(enumC3387c, true));
            this.f39997m.setDefaultSelector(a(enumC3387c, false));
            this.f39997m.setTag(enumC3387c);
            this.f39997m.setOnClickListener(this);
            MDButton mDButton3 = this.f39999o;
            d(mDButton3, c3389e.f39982w);
            mDButton3.setAllCapsCompat(zC2);
            mDButton3.setText(c3389e.f39971l);
            mDButton3.setTextColor(c3389e.f39975p);
            MDButton mDButton4 = this.f39999o;
            EnumC3387c enumC3387c2 = EnumC3387c.f39950c;
            mDButton4.setStackedSelector(a(enumC3387c2, true));
            this.f39999o.setDefaultSelector(a(enumC3387c2, false));
            this.f39999o.setTag(enumC3387c2);
            this.f39999o.setOnClickListener(this);
            MDButton mDButton5 = this.f39998n;
            d(mDButton5, c3389e.f39982w);
            mDButton5.setAllCapsCompat(zC2);
            mDButton5.setText((CharSequence) null);
            mDButton5.setTextColor(c3389e.f39976q);
            MDButton mDButton6 = this.f39998n;
            EnumC3387c enumC3387c3 = EnumC3387c.f39949b;
            mDButton6.setStackedSelector(a(enumC3387c3, true));
            this.f39998n.setDefaultSelector(a(enumC3387c3, false));
            this.f39998n.setTag(enumC3387c3);
            this.f39998n.setOnClickListener(this);
            if (this.f39993h != null && c3389e.f39984y == null) {
                this.f40000p = 1;
                c3389e.f39984y = new C3386b(this, R.layout.md_listitem);
            }
            EditText editText = (EditText) mDRootLayout.findViewById(android.R.id.input);
            this.f39992g = editText;
            if (editText != null) {
                d(editText, c3389e.f39981v);
                EditText editText2 = this.f39992g;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new w(this, i10));
                }
                this.f39992g.setHint((CharSequence) null);
                this.f39992g.setSingleLine();
                this.f39992g.setTextColor(c3389e.f39970j);
                this.f39992g.setHintTextColor(AbstractC4345a.h(0.3f, c3389e.f39970j));
                gc.b.I(this.f39992g, c3389e.f39973n);
                TextView textView5 = (TextView) mDRootLayout.findViewById(R.id.md_minMax);
                this.k = textView5;
                textView5.setVisibility(8);
                this.k = null;
            }
            if (c3389e.f39972m != null) {
                ((MDRootLayout) mDRootLayout.findViewById(R.id.md_root)).k = true;
                FrameLayout frameLayout = (FrameLayout) mDRootLayout.findViewById(R.id.md_customViewFrame);
                this.f39995j = frameLayout;
                View view = c3389e.f39972m;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
            }
            super.setOnShowListener(this);
            if (this.f39993h != null && c3389e.f39984y != null) {
                if (c3389e.f39985z == null) {
                    getContext();
                    c3389e.f39985z = new LinearLayoutManager();
                }
                if (this.f39993h.getLayoutManager() == null) {
                    this.f39993h.setLayoutManager(c3389e.f39985z);
                }
                this.f39993h.setAdapter(c3389e.f39984y);
                if (this.f40000p != 0) {
                    c3389e.f39984y.k = this;
                }
            }
            super.setContentView(mDRootLayout);
            RecyclerView recyclerView = this.f39993h;
            if (recyclerView != null) {
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new E9.d(this, i5));
            }
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i12 = point.x;
            int i13 = point.y;
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_vertical_margin);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin);
            mDRootLayout.setMaxHeight(i13 - (dimensionPixelSize3 * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(getWindow().getAttributes());
            layoutParams.width = Math.min(context.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width), i12 - (dimensionPixelSize4 * 2));
            getWindow().setAttributes(layoutParams);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void d(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    public final Drawable a(EnumC3387c enumC3387c, boolean z2) {
        C3389e c3389e = this.f39988c;
        if (z2) {
            c3389e.getClass();
            Drawable drawableE = AbstractC4345a.E(c3389e.f39961a, R.attr.md_btn_stacked_selector);
            return drawableE != null ? drawableE : AbstractC4345a.E(getContext(), R.attr.md_btn_stacked_selector);
        }
        int iOrdinal = enumC3387c.ordinal();
        if (iOrdinal == 1) {
            c3389e.getClass();
            Drawable drawableE2 = AbstractC4345a.E(c3389e.f39961a, R.attr.md_btn_neutral_selector);
            if (drawableE2 != null) {
                return drawableE2;
            }
            Drawable drawableE3 = AbstractC4345a.E(getContext(), R.attr.md_btn_neutral_selector);
            int i5 = c3389e.f39968h;
            if (drawableE3 instanceof RippleDrawable) {
                ((RippleDrawable) drawableE3).setColor(ColorStateList.valueOf(i5));
            }
            return drawableE3;
        }
        if (iOrdinal != 2) {
            c3389e.getClass();
            Drawable drawableE4 = AbstractC4345a.E(c3389e.f39961a, R.attr.md_btn_positive_selector);
            if (drawableE4 != null) {
                return drawableE4;
            }
            Drawable drawableE5 = AbstractC4345a.E(getContext(), R.attr.md_btn_positive_selector);
            int i10 = c3389e.f39968h;
            if (drawableE5 instanceof RippleDrawable) {
                ((RippleDrawable) drawableE5).setColor(ColorStateList.valueOf(i10));
            }
            return drawableE5;
        }
        c3389e.getClass();
        Drawable drawableE6 = AbstractC4345a.E(c3389e.f39961a, R.attr.md_btn_negative_selector);
        if (drawableE6 != null) {
            return drawableE6;
        }
        Drawable drawableE7 = AbstractC4345a.E(getContext(), R.attr.md_btn_negative_selector);
        int i11 = c3389e.f39968h;
        if (drawableE7 instanceof RippleDrawable) {
            ((RippleDrawable) drawableE7).setColor(ColorStateList.valueOf(i11));
        }
        return drawableE7;
    }

    public final boolean b(View view, int i5, boolean z2) {
        if (!view.isEnabled()) {
            return false;
        }
        int i10 = this.f40000p;
        C3389e c3389e = this.f39988c;
        if (i10 == 0 || i10 == 1) {
            c3389e.getClass();
            dismiss();
            return true;
        }
        if (i10 == 3) {
            if (((CheckBox) view.findViewById(R.id.md_control)).isEnabled()) {
                throw null;
            }
            return false;
        }
        if (i10 == 2) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            int i11 = c3389e.f39980u;
            if (c3389e.k == null) {
                dismiss();
                c3389e.f39980u = i5;
                c3389e.getClass();
                return true;
            }
            c3389e.f39980u = i5;
            radioButton.setChecked(true);
            c3389e.f39984y.notifyItemChanged(i11);
            c3389e.f39984y.notifyItemChanged(i5);
        }
        return true;
    }

    public final void c(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f39987b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        EditText editText = this.f39992g;
        if (editText != null && editText != null && (inputMethodManager = (InputMethodManager) this.f39988c.f39961a.getSystemService("input_method")) != null) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else {
                MDRootLayout mDRootLayout = this.f39986a;
                windowToken = mDRootLayout != null ? mDRootLayout.getWindowToken() : null;
            }
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i5) {
        return this.f39986a.findViewById(i5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        Lb.h hVar;
        int iOrdinal = ((EnumC3387c) view.getTag()).ordinal();
        C3389e c3389e = this.f39988c;
        if (iOrdinal == 0) {
            c3389e.getClass();
            v vVar = c3389e.f39978s;
            if (vVar != null) {
                C2816b c2816b = (C2816b) vVar.f17322b;
                Context context = c2816b.f36382a;
                try {
                    Intent intentT = gc.b.t(context, c2816b.f36383b);
                    if (intentT != null && AbstractC2641B.B(context, intentT)) {
                        context.startActivity(intentT);
                    }
                } catch (Exception e7) {
                    Log.e(gc.b.class.getName(), e7.getMessage());
                }
                Lb.h hVar2 = c2816b.f36389h;
                if (hVar2 != null) {
                    hVar2.onClick(this.f39986a);
                }
            }
            c3389e.getClass();
            c3389e.getClass();
            dismiss();
        } else if (iOrdinal == 1) {
            c3389e.getClass();
            dismiss();
        } else if (iOrdinal == 2) {
            c3389e.getClass();
            l lVar = c3389e.f39979t;
            if (lVar != null && (hVar = ((C2816b) lVar.f26356b).f36390i) != null) {
                hVar.onClick(this.f39986a);
            }
            cancel();
        }
        c3389e.getClass();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.f39992g;
        if (editText != null) {
            editText.post(new L7.b(20, this, this.f39988c));
            if (this.f39992g.getText().length() > 0) {
                EditText editText2 = this.f39992g;
                editText2.setSelection(editText2.getText().length());
            }
        }
        c(dialogInterface);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i5) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f39987b = onShowListener;
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f39990e.setText(charSequence);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new C3390f("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setTitle(int i5) {
        setTitle(this.f39988c.f39961a.getString(i5));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}

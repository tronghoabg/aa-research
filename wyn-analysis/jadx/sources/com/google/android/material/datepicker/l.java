package com.google.android.material.datepicker;

import U8.v0;
import a.AbstractC1304a;
import ad.L;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t;
import b1.AbstractC1492a;
import c8.C1583g;
import com.google.android.material.internal.CheckableImageButton;
import com.moloco.sdk.internal.publisher.H;
import com.wynauto.wyn.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import k1.w0;
import k1.x0;
import k1.y0;

/* loaded from: classes4.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC1430t {

    /* renamed from: A, reason: collision with root package name */
    public int f26926A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f26927B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f26928C;

    /* renamed from: D, reason: collision with root package name */
    public CheckableImageButton f26929D;

    /* renamed from: E, reason: collision with root package name */
    public C1583g f26930E;

    /* renamed from: F, reason: collision with root package name */
    public Button f26931F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f26932G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f26933H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f26934I;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f26935o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f26936p;

    /* renamed from: q, reason: collision with root package name */
    public int f26937q;

    /* renamed from: r, reason: collision with root package name */
    public s f26938r;

    /* renamed from: s, reason: collision with root package name */
    public b f26939s;

    /* renamed from: t, reason: collision with root package name */
    public k f26940t;

    /* renamed from: u, reason: collision with root package name */
    public int f26941u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f26942v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26943w;

    /* renamed from: x, reason: collision with root package name */
    public int f26944x;

    /* renamed from: y, reason: collision with root package name */
    public int f26945y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f26946z;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f26935o = new LinkedHashSet();
        this.f26936p = new LinkedHashSet();
    }

    public static int I(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = v.b();
        calendarB.set(5, 1);
        Calendar calendarA = v.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A6.h.L(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i5});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t
    public final Dialog G() {
        Context contextRequireContext = requireContext();
        requireContext();
        int i5 = this.f26937q;
        if (i5 == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i5);
        Context context = dialog.getContext();
        this.f26943w = J(context, android.R.attr.windowFullscreen);
        int i10 = A6.h.L(context, R.attr.colorSurface, l.class.getCanonicalName()).data;
        C1583g c1583g = new C1583g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f26930E = c1583g;
        c1583g.h(context);
        this.f26930E.j(ColorStateList.valueOf(i10));
        C1583g c1583g2 = this.f26930E;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = S.f38779a;
        c1583g2.i(J.e(decorView));
        return dialog;
    }

    public final void H() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f26935o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, androidx.fragment.app.F
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26937q = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f26939s = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f26941u = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f26942v = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f26944x = bundle.getInt("INPUT_MODE_KEY");
        this.f26945y = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26946z = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f26926A = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26927B = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f26942v;
        if (text == null) {
            text = requireContext().getResources().getText(this.f26941u);
        }
        this.f26933H = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f26934I = text;
    }

    @Override // androidx.fragment.app.F
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f26943w ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f26943w) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = S.f38779a;
        textView.setAccessibilityLiveRegion(1);
        this.f26929D = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f26928C = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f26929D.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f26929D;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, Fe.g.B(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], Fe.g.B(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f26929D.setChecked(this.f26944x != 0);
        S.m(this.f26929D, null);
        CheckableImageButton checkableImageButton2 = this.f26929D;
        this.f26929D.setContentDescription(checkableImageButton2.f26973d ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f26929D.setOnClickListener(new F6.f(this, 2));
        this.f26931F = (Button) viewInflate.findViewById(R.id.confirm_button);
        H();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f26936p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f26937q);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f26939s;
        a aVar = new a();
        int i5 = a.f26890b;
        int i10 = a.f26890b;
        long j8 = bVar.f26892a.f26954f;
        long j10 = bVar.f26893b.f26954f;
        aVar.f26891a = Long.valueOf(bVar.f26895d.f26954f);
        k kVar = this.f26940t;
        n nVar = kVar == null ? null : kVar.f26918d;
        if (nVar != null) {
            aVar.f26891a = Long.valueOf(nVar.f26954f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f26894c);
        n nVarE = n.e(j8);
        n nVarE2 = n.e(j10);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f26891a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(nVarE, nVarE2, dVar, l10 == null ? null : n.e(l10.longValue()), bVar.f26896e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f26941u);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f26942v);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f26945y);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f26946z);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f26926A);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f26927B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.fragment.app.F, com.google.android.material.datepicker.m] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, androidx.fragment.app.F
    public final void onStart() throws Resources.NotFoundException {
        H x0Var;
        super.onStart();
        Dialog dialog = this.f18544j;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f26943w) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f26930E);
            if (!this.f26932G) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i5 = Build.VERSION.SDK_INT;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iJ = v0.J(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iJ);
                }
                AbstractC1304a.I(window, false);
                window.getContext();
                int iD = i5 < 27 ? AbstractC1492a.d(v0.J(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z10 = v0.Q(0) || v0.Q(numValueOf.intValue());
                L l10 = new L(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new y0(window, l10, 1) : i10 >= 30 ? new w0(window, l10, 1) : i10 >= 26 ? new x0(window, l10, 0) : new w0(window, l10, 0)).r0(z10);
                boolean z11 = v0.Q(iD) || (iD == 0 && v0.Q(iJ));
                L l11 = new L(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    x0Var = new y0(window, l11, 1);
                } else if (i11 >= 30) {
                    x0Var = new w0(window, l11, 1);
                } else {
                    x0Var = i11 >= 26 ? new x0(window, l11, 0) : new w0(window, l11, 0);
                }
                x0Var.q0(z11);
                K7.b bVar = new K7.b(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = S.f38779a;
                J.l(viewFindViewById, bVar);
                this.f26932G = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f26930E, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f18544j;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new T7.a(dialog2, rect));
        }
        requireContext();
        int i12 = this.f26937q;
        if (i12 == 0) {
            H();
            throw null;
        }
        H();
        b bVar2 = this.f26939s;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar2.f26895d);
        kVar.setArguments(bundle);
        this.f26940t = kVar;
        boolean z12 = this.f26929D.f26973d;
        if (z12) {
            H();
            b bVar3 = this.f26939s;
            ?? mVar = new m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar3);
            mVar.setArguments(bundle2);
            kVar = mVar;
        }
        this.f26938r = kVar;
        this.f26928C.setText((z12 && getResources().getConfiguration().orientation == 2) ? this.f26934I : this.f26933H);
        H();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, androidx.fragment.app.F
    public final void onStop() {
        this.f26938r.f26967a.clear();
        super.onStop();
    }
}

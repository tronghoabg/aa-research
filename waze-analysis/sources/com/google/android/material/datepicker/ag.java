package com.google.android.material.datepicker;

import android.R;
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
import android.os.Bundle;
import android.support.v4.app.ch;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.waze.mg$$ExternalSyntheticApiModelOutline1;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag extends android.support.v4.app.ab {
    private boolean A;
    private CharSequence B;
    private CharSequence C;
    private at D;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f6382a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f6383b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f6384c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f6385d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private int f6386e;

    /* renamed from: f, reason: collision with root package name */
    private aq f6387f;

    /* renamed from: g, reason: collision with root package name */
    private c f6388g;

    /* renamed from: h, reason: collision with root package name */
    private l f6389h;

    /* renamed from: i, reason: collision with root package name */
    private z f6390i;

    /* renamed from: j, reason: collision with root package name */
    private int f6391j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f6392k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6393l;
    private int m;
    private int n;
    private CharSequence o;
    private int p;
    private CharSequence q;
    private int r;
    private CharSequence s;
    private int t;
    private CharSequence u;
    private TextView v;
    private TextView w;
    private CheckableImageButton x;
    private com.google.android.material.k.k y;
    private Button z;

    static boolean e(Context context) {
        return f(context, R.attr.windowFullscreen);
    }

    static boolean f(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.internal.t.f(context, com.waze.R.attr.materialCalendarStyle, z.class.getCanonicalName()), new int[]{i2});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static /* synthetic */ void h(ag agVar) {
        agVar.z.setEnabled(agVar.q().k());
        agVar.x.toggle();
        agVar.m = agVar.m == 1 ? 0 : 1;
        agVar.o(agVar.x);
        agVar.p(agVar.x);
        agVar.n();
    }

    private static int l(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.waze.R.dimen.mtrl_calendar_content_padding);
        int i2 = aj.i().f6400c;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(com.waze.R.dimen.mtrl_calendar_day_width) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(com.waze.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int m(Context context) {
        int i2 = this.f6386e;
        if (i2 != 0) {
            return i2;
        }
        q();
        return com.google.android.material.internal.t.f(context, com.waze.R.attr.materialCalendarTheme, ag.class.getCanonicalName());
    }

    private final void n() {
        int iM = m(requireContext());
        String str = this.m == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        android.support.v4.app.ar arVarH = getChildFragmentManager().h(str);
        aq aqVar = arVarH instanceof aq ? (aq) arVarH : null;
        if (aqVar == null) {
            if (this.m == 1) {
                at atVarQ = q();
                c cVar = this.f6388g;
                ai aiVar = new ai();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iM);
                bundle.putParcelable("DATE_SELECTOR_KEY", atVarQ);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
                aiVar.setArguments(bundle);
                aqVar = aiVar;
            } else {
                at atVarQ2 = q();
                c cVar2 = this.f6388g;
                l lVar = this.f6389h;
                z zVar = new z();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iM);
                bundle2.putParcelable("GRID_SELECTOR_KEY", atVarQ2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", lVar);
                bundle2.putParcelable("CURRENT_MONTH_KEY", cVar2.l());
                zVar.setArguments(bundle2);
                this.f6390i = zVar;
                aqVar = zVar;
            }
        }
        this.f6387f = aqVar;
        aqVar.t(new ae(this));
        this.v.setText((this.m == 1 && getResources().getConfiguration().orientation == 2) ? this.C : this.B);
        d(b());
        ch chVarU = getChildFragmentManager().u();
        chVarU.x(com.waze.R.id.mtrl_calendar_frame, this.f6387f, str);
        chVarU.f();
    }

    private final void o(CheckableImageButton checkableImageButton) {
        this.x.setContentDescription(this.m == 1 ? checkableImageButton.getContext().getString(com.waze.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.waze.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    private final void p(CheckableImageButton checkableImageButton) {
        this.x.setTooltipText(this.m == 1 ? checkableImageButton.getContext().getString(com.waze.R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(com.waze.R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final at q() {
        at atVar = this.D;
        if (atVar != null) {
            return atVar;
        }
        at atVar2 = (at) getArguments().getParcelable("DATE_SELECTOR_KEY");
        this.D = atVar2;
        return atVar2;
    }

    public final String b() {
        return q().d(getContext());
    }

    public final void c(View view) {
        Iterator it = this.f6383b.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    final void d(String str) {
        this.w.setContentDescription(q().c(requireContext()));
        this.w.setText(str);
    }

    public final void i(View.OnClickListener onClickListener) {
        this.f6383b.add(onClickListener);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.l, java.lang.Object] */
    public final void j() {
        Iterator it = this.f6382a.iterator();
        while (it.hasNext()) {
            com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) it.next();
            lVar.f10212a.invoke(q().b());
        }
        dismiss();
    }

    public final void k(com.google.firebase.messaging.l lVar) {
        this.f6382a.add(lVar);
    }

    @Override // android.support.v4.app.ab, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6384c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.ab, android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) throws Resources.NotFoundException {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6386e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.D = (at) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6388g = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6389h = (l) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f6391j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f6392k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.m = bundle.getInt("INPUT_MODE_KEY");
        this.n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.p = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.q = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.t = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.u = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f6392k;
        if (text == null) {
            text = requireContext().getResources().getText(this.f6391j);
        }
        this.B = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(text.toString(), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.C = text;
    }

    @Override // android.support.v4.app.ab
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m(requireContext()));
        Context context = dialog.getContext();
        this.f6393l = e(context);
        this.y = new com.google.android.material.k.k(context, null, com.waze.R.attr.materialCalendarStyle, com.waze.R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ar.f6428a, com.waze.R.attr.materialCalendarStyle, com.waze.R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.y.r(context);
        this.y.v(ColorStateList.valueOf(color));
        this.y.u(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 1;
        View viewInflate = layoutInflater.inflate(true != this.f6393l ? com.waze.R.layout.mtrl_picker_dialog : com.waze.R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f6389h != null) {
            throw null;
        }
        if (this.f6393l) {
            viewInflate.findViewById(com.waze.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(l(context), -2));
        } else {
            viewInflate.findViewById(com.waze.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(l(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(com.waze.R.id.mtrl_picker_header_selection_text);
        this.w = textView;
        textView.setAccessibilityLiveRegion(1);
        this.x = (CheckableImageButton) viewInflate.findViewById(com.waze.R.id.mtrl_picker_header_toggle);
        this.v = (TextView) viewInflate.findViewById(com.waze.R.id.mtrl_picker_title_text);
        this.x.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.x;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, android.support.a.i.d(context, com.waze.R.drawable.material_ic_calendar_black_24dp));
        int i3 = 0;
        stateListDrawable.addState(new int[0], android.support.a.i.d(context, com.waze.R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.x.setChecked(this.m != 0);
        ViewCompat.setAccessibilityDelegate(this.x, null);
        o(this.x);
        p(this.x);
        this.x.setOnClickListener(new ac(this, i2));
        this.z = (Button) viewInflate.findViewById(com.waze.R.id.confirm_button);
        boolean zK = q().k();
        Button button = this.z;
        if (zK) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.z.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            this.z.setText(charSequence);
        } else {
            int i4 = this.n;
            if (i4 != 0) {
                this.z.setText(i4);
            }
        }
        CharSequence charSequence2 = this.q;
        if (charSequence2 != null) {
            this.z.setContentDescription(charSequence2);
        } else if (this.p != 0) {
            this.z.setContentDescription(getContext().getResources().getText(this.p));
        }
        this.z.setOnClickListener(new ac(this, i3));
        Button button2 = (Button) viewInflate.findViewById(com.waze.R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.s;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.r;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.u;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.t != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.t));
        }
        button2.setOnClickListener(new ac(this, 2));
        return viewInflate;
    }

    @Override // android.support.v4.app.ab, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6385d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.support.v4.app.ab, android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        super.m47x22bc4f96(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6386e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.D);
        a aVar = new a(this.f6388g);
        z zVar = this.f6390i;
        aj ajVarL = zVar == null ? null : zVar.l();
        if (ajVarL != null) {
            aVar.b(ajVarL.f6402e);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f6389h);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6391j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f6392k);
        bundle.putInt("INPUT_MODE_KEY", this.m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.o);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.p);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.s);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.t);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.u);
    }

    @Override // android.support.v4.app.ab, android.support.v4.app.ar
    public final void onStart() throws Resources.NotFoundException {
        ag agVar;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f6393l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.y);
            if (this.A) {
                agVar = this;
            } else {
                View viewFindViewById = requireView().findViewById(com.waze.R.id.fullscreen_header);
                Drawable background = viewFindViewById.getBackground();
                ColorStateList colorStateListValueOf = background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : mg$$ExternalSyntheticApiModelOutline1.m28528m((Object) background) ? mg$$ExternalSyntheticApiModelOutline1.m((Object) background).getColorStateList() : null;
                com.google.android.material.d.c.c(window, colorStateListValueOf != null ? Integer.valueOf(colorStateListValueOf.getDefaultColor()) : null);
                agVar = this;
                ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new ad(agVar, viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight()));
                agVar.A = true;
            }
        } else {
            agVar = this;
            window.setLayout(-2, -2);
            int dimensionPixelOffset = agVar.getResources().getDimensionPixelOffset(com.waze.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) agVar.y, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new com.google.android.material.c.a(agVar.requireDialog(), rect));
        }
        agVar.n();
    }

    @Override // android.support.v4.app.ab, android.support.v4.app.ar
    public final void onStop() {
        this.f6387f.f6427a.clear();
        super.onStop();
    }
}

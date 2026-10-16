package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class wod extends ao {
    private int A;
    private CharSequence B;
    private int C;
    private CharSequence D;
    private TextView E;
    private TextView F;
    private wue G;
    private boolean H;
    private CharSequence I;
    private CharSequence J;
    public int g;
    public CheckableImageButton h;
    public Button i;
    private final LinkedHashSet j = new LinkedHashSet();
    private final LinkedHashSet k = new LinkedHashSet();
    private final LinkedHashSet l = new LinkedHashSet();
    private final LinkedHashSet m = new LinkedHashSet();
    private int n;
    private DateSelector o;
    private wom p;
    private CalendarConstraints q;
    private DayViewDecorator r;
    private woa s;
    private int t;
    private CharSequence u;
    private boolean v;
    private int w;
    private CharSequence x;
    private int y;
    private CharSequence z;

    public static boolean o(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(woy.B(context, woa.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    private static int q(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = new Month(woq.d()).d;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int r() {
        int i = this.n;
        return i != 0 ? i : h().d();
    }

    @Override // defpackage.ao
    public final Dialog gn(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        Dialog dialog = new Dialog(contextRequireContext, r());
        Context context = dialog.getContext();
        this.v = o(context, android.R.attr.windowFullscreen);
        this.G = new wue(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, won.a, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.G.K(context);
        this.G.O(ColorStateList.valueOf(color));
        this.G.N(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final DateSelector h() {
        DateSelector dateSelector = this.o;
        if (dateSelector != null) {
            return dateSelector;
        }
        DateSelector dateSelector2 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        this.o = dateSelector2;
        return dateSelector2;
    }

    public final String i() {
        return h().f();
    }

    public final void j(View view) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        super.g(false, false);
    }

    public final void k() {
        requireContext();
        int iR = r();
        String str = this.g == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        Fragment fragmentF = getChildFragmentManager().f(str);
        wom womVar = fragmentF instanceof wom ? (wom) fragmentF : null;
        if (womVar == null) {
            if (this.g == 1) {
                DateSelector dateSelectorH = h();
                CalendarConstraints calendarConstraints = this.q;
                wof wofVar = new wof();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iR);
                bundle.putParcelable("DATE_SELECTOR_KEY", dateSelectorH);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                wofVar.setArguments(bundle);
                womVar = wofVar;
            } else {
                DateSelector dateSelectorH2 = h();
                CalendarConstraints calendarConstraints2 = this.q;
                DayViewDecorator dayViewDecorator = this.r;
                woa woaVar = new woa();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iR);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dateSelectorH2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.d);
                woaVar.setArguments(bundle2);
                this.s = woaVar;
                womVar = woaVar;
            }
        }
        this.p = womVar;
        womVar.k.add(new ykd(this, null));
        this.E.setText((this.g == 1 && getResources().getConfiguration().orientation == 2) ? this.J : this.I);
        l(i());
        w wVar = new w(getChildFragmentManager());
        wVar.q(R.id.mtrl_calendar_frame, this.p, str);
        wVar.c();
    }

    final void l(String str) {
        TextView textView = this.F;
        DateSelector dateSelectorH = h();
        requireContext();
        textView.setContentDescription(dateSelectorH.e());
        this.F.setText(str);
    }

    public final void m(CheckableImageButton checkableImageButton) {
        this.h.setContentDescription(this.g == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void n(CheckableImageButton checkableImageButton) {
        this.h.setTooltipText(this.g == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) throws Resources.NotFoundException {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.n = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.o = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.q = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.r = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.t = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.u = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.g = bundle.getInt("INPUT_MODE_KEY");
        this.w = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.x = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.y = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.z = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.A = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.B = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.C = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.D = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.u;
        if (text == null) {
            text = requireContext().getResources().getText(this.t);
        }
        this.I = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(text.toString(), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.J = text;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != this.v ? R.layout.mtrl_picker_dialog : R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = viewInflate.getContext();
        if (this.r != null) {
            throw null;
        }
        if (this.v) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.F = textView;
        textView.setAccessibilityLiveRegion(1);
        this.h = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.E = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.h.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, ca.e(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], ca.e(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.h.setChecked(this.g != 0);
        ebm.o(this.h, null);
        m(this.h);
        n(this.h);
        this.h.setOnClickListener(new sdo((Object) this, 15));
        this.i = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean zC = h().c();
        Button button = this.i;
        if (zC) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.i.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.x;
        if (charSequence != null) {
            this.i.setText(charSequence);
        } else {
            int i = this.w;
            if (i != 0) {
                this.i.setText(i);
            }
        }
        CharSequence charSequence2 = this.z;
        if (charSequence2 != null) {
            this.i.setContentDescription(charSequence2);
        } else if (this.y != 0) {
            this.i.setContentDescription(getContext().getResources().getText(this.y));
        }
        this.i.setOnClickListener(new sdo((Object) this, 16));
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.B;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i2 = this.A;
            if (i2 != 0) {
                button2.setText(i2);
            }
        }
        CharSequence charSequence4 = this.D;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.C != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.C));
        }
        button2.setOnClickListener(new sdo((Object) this, 17));
        return viewInflate;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.o);
        int i = wnp.a;
        CalendarConstraints calendarConstraints = this.q;
        long j = calendarConstraints.a.f;
        long j2 = calendarConstraints.b.f;
        Long lValueOf = Long.valueOf(calendarConstraints.d.f);
        int i2 = calendarConstraints.e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.c;
        woa woaVar = this.s;
        Month month = woaVar == null ? null : woaVar.c;
        if (month != null) {
            lValueOf = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(Month.c(j), Month.c(j2), (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), Month.c(lValueOf.longValue()), i2));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.r);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.t);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.u);
        bundle.putInt("INPUT_MODE_KEY", this.g);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.w);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.x);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.y);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.z);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.A);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.B);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.C);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.D);
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = b().getWindow();
        if (this.v) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.G);
            if (!this.H) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numH = woy.H(viewFindViewById);
                boolean z = numH == null || numH.intValue() == 0;
                int iN = woy.n(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numH = Integer.valueOf(iN);
                }
                Integer numValueOf = Integer.valueOf(iN);
                ebh.d(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                ecw.c(woy.L(woy.r(numH.intValue())), Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(window.getDecorView())));
                numValueOf.getClass();
                ecw.b(woy.L(woy.r(iN)), Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(window.getDecorView())));
                wei weiVar = new wei(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), 2);
                int[] iArr = ebm.a;
                ebe.e(viewFindViewById, weiVar);
                this.H = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.G, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new wot(b(), rect));
        }
        k();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStop() {
        this.p.k.clear();
        super.onStop();
    }

    public final void p() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            woe woeVar = (woe) it.next();
            h().i();
            woeVar.a();
        }
        super.g(false, false);
    }
}

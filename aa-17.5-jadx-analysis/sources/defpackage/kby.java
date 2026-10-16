package defpackage;

import android.animation.AnimatorSet;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.signin.InputSignInMethod;
import androidx.car.app.model.signin.PinSignInMethod;
import androidx.car.app.model.signin.ProviderSignInMethod;
import androidx.car.app.model.signin.QRCodeSignInMethod;
import androidx.car.app.model.signin.SignInTemplate;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ClickableSpanTextContainer;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.HeaderView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.InputSignInView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.PinSignInView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.QRCodeSignInView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ScrollableContentView;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.projection.gearhead.R;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class kby extends hlf {
    private static final yph r = yph.c("CarApp.H.Tem");
    private static final hlv s;
    private static final hlv t;
    private final QRCodeSignInView A;
    private final ClickableSpanTextContainer B;
    private final ActionButtonListView C;
    private final ScrollableContentView D;
    private final ProgressBar E;
    private final String F;
    private final Handler G;
    private boolean H;
    public final gku a;
    public final ViewGroup b;
    public final TextView c;
    public final InputSignInView d;
    public boolean e;
    public AnimatorSet f;
    public boolean g;
    public final int h;
    public final int p;
    public boolean q;
    private final ViewGroup u;
    private final HeaderView v;
    private final ActionStripView w;
    private final LinearLayout x;
    private final ActionButtonView y;
    private final PinSignInView z;

    static {
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.a = ghv.b;
        s = hluVar.a();
        hlu hluVar2 = new hlu();
        hluVar2.b = true;
        t = hluVar2.a();
    }

    public kby(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.g = true;
        this.G = new Handler(Looper.getMainLooper(), new gly(this, 5));
        this.q = false;
        this.H = false;
        this.a = geuVar.j();
        this.F = geuVar.getString(R.string.search_hint_disabled);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.sign_in_template_layout, (ViewGroup) null);
        this.b = viewGroup;
        ScrollableContentView scrollableContentView = (ScrollableContentView) viewGroup.findViewById(R.id.scrollable_content_view);
        this.D = scrollableContentView;
        scrollableContentView.b((ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.sign_in_template_content, (ViewGroup) null));
        this.x = (LinearLayout) viewGroup.findViewById(R.id.sign_in_container);
        this.c = (TextView) viewGroup.findViewById(R.id.instruction_text);
        this.y = (ActionButtonView) viewGroup.findViewById(R.id.provider_sign_in_button);
        this.d = (InputSignInView) viewGroup.findViewById(R.id.input_sign_in_view);
        this.z = (PinSignInView) viewGroup.findViewById(R.id.pin_sign_in_view);
        this.A = (QRCodeSignInView) viewGroup.findViewById(R.id.qr_code_sign_in_view);
        this.B = (ClickableSpanTextContainer) viewGroup.findViewById(R.id.additional_text);
        this.v = (HeaderView) viewGroup.findViewById(R.id.header_view);
        this.w = (ActionStripView) viewGroup.findViewById(R.id.action_strip);
        this.u = (ViewGroup) viewGroup.findViewById(R.id.header_container);
        this.C = (ActionButtonListView) viewGroup.findViewById(R.id.action_button_list_view);
        this.E = (ProgressBar) viewGroup.findViewById(R.id.sign_in_progress_bar);
        ((ContentModerationWrapperLayout) viewGroup.findViewById(R.id.park_only_container)).a(geuVar, this.k);
        TypedArray typedArrayObtainStyledAttributes = geuVar.obtainStyledAttributes(new int[]{R.attr.templateKeyboardHeight, R.attr.templateBottomRailHeight});
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void A() {
        gku gkuVar = this.a;
        if (gkuVar.c()) {
            gkuVar.b();
        }
        this.H = false;
        this.G.removeMessages(1);
        super.A();
    }

    @Override // defpackage.hlf
    protected final View a() {
        ActionButtonView actionButtonView = this.y;
        if (actionButtonView.getVisibility() == 0) {
            return actionButtonView;
        }
        InputSignInView inputSignInView = this.d;
        if (inputSignInView.getVisibility() == 0) {
            return inputSignInView;
        }
        QRCodeSignInView qRCodeSignInView = this.A;
        if (qRCodeSignInView.getVisibility() == 0) {
            TextView textView = this.c;
            return textView.getVisibility() == 0 ? textView : qRCodeSignInView;
        }
        ActionButtonListView actionButtonListView = this.C;
        if (actionButtonListView.getVisibility() == 0) {
            return actionButtonListView;
        }
        HeaderView headerView = this.v;
        return headerView.getVisibility() == 0 ? headerView : this.b;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        geu geuVar = this.i;
        gjv gjvVarB = geuVar.B();
        gjvVarB.b(this, 5, new kbs(this, 4));
        gjvVarB.b(this, 6, new kbs(this, 5));
        geuVar.w();
        boolean zB = jwl.b();
        this.q = zB;
        h(!zB);
    }

    @Override // defpackage.hlf
    public final void d() throws kdb {
        m();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.b;
    }

    public final void f() {
        boolean z = this.g;
        AnimatorSet animatorSet = this.f;
        if (z) {
            animatorSet.start();
        } else {
            animatorSet.reverse();
        }
        this.g = !this.g;
    }

    public final void h(boolean z) {
        Handler handler = this.G;
        handler.removeMessages(1);
        InputSignInView inputSignInView = this.d;
        if (z) {
            inputSignInView.a(true);
            if (this.H) {
                inputSignInView.requestFocus();
                this.a.a(inputSignInView);
            }
            this.H = false;
            return;
        }
        hlf.J(yfq.q(inputSignInView), yfq.r(this.C, this.v), false);
        inputSignInView.a(false);
        if (this.a.c()) {
            this.H = true;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 19) {
            if (hlf.J(yfq.q(this.D), yfq.q(this.v), false)) {
                return true;
            }
        } else if (i == 20) {
            if (hlf.J(yfq.r(this.v, this.w), yfq.q(this.D), false)) {
                return true;
            }
        }
        return false;
    }

    public final void m() throws kdb {
        SignInTemplate signInTemplate = (SignInTemplate) C();
        CarText title = signInTemplate.getTitle();
        Action headerAction = signInTemplate.getHeaderAction();
        boolean zIsNullOrEmpty = CarText.isNullOrEmpty(title);
        final geu geuVar = this.i;
        byte[] bArr = null;
        if (zIsNullOrEmpty && headerAction == null) {
            this.u.setVisibility(8);
        } else {
            this.u.setVisibility(0);
            this.v.a(geuVar, title, headerAction, null);
        }
        this.w.b(geuVar, signInTemplate.getActionStrip(), ghu.a, false, false);
        boolean zIsLoading = signInTemplate.isLoading();
        ProgressBar progressBar = this.E;
        if (zIsLoading) {
            progressBar.setVisibility(0);
            this.x.setVisibility(8);
        } else {
            progressBar.setVisibility(8);
            this.x.setVisibility(0);
        }
        CarText instructions = signInTemplate.getInstructions();
        boolean zIsNullOrEmpty2 = CarText.isNullOrEmpty(instructions);
        TextView textView = this.c;
        if (zIsNullOrEmpty2) {
            textView.setVisibility(8);
        } else {
            textView.setText(hlb.e(geuVar, instructions, s, -1));
            textView.setVisibility(0);
        }
        ActionButtonView actionButtonView = this.y;
        actionButtonView.setVisibility(8);
        final InputSignInView inputSignInView = this.d;
        inputSignInView.setVisibility(8);
        PinSignInView pinSignInView = this.z;
        pinSignInView.setVisibility(8);
        QRCodeSignInView qRCodeSignInView = this.A;
        qRCodeSignInView.setVisibility(8);
        wp signInMethod = signInTemplate.getSignInMethod();
        if (signInMethod instanceof ProviderSignInMethod) {
            actionButtonView.a(geuVar, fvr.b(((ProviderSignInMethod) signInMethod).getAction(), geuVar, null), new hls(true, false, false));
            actionButtonView.setVisibility(0);
        } else if (signInMethod instanceof InputSignInMethod) {
            final InputSignInMethod inputSignInMethod = (InputSignInMethod) signInMethod;
            final gku gkuVar = this.a;
            String str = this.F;
            boolean zIsRefresh = this.k.isRefresh();
            inputSignInView.b.setOnClickListener(null);
            inputSignInView.b.setOnEditorActionListener(null);
            TextWatcher textWatcher = inputSignInView.i;
            if (textWatcher != null) {
                inputSignInView.b.removeTextChangedListener(textWatcher);
                inputSignInView.i = null;
            }
            inputSignInView.d = hlb.d(geuVar, inputSignInMethod.getHint());
            inputSignInView.e = str;
            inputSignInView.b(inputSignInView.b.isEnabled());
            CarText errorMessage = inputSignInMethod.getErrorMessage();
            if (CarText.isNullOrEmpty(errorMessage)) {
                inputSignInView.c.setVisibility(8);
                inputSignInView.b.setBackground(inputSignInView.h);
            } else {
                inputSignInView.c.setText(hlb.d(geuVar, errorMessage));
                inputSignInView.c.setVisibility(0);
                inputSignInView.b.setBackgroundResource(R.drawable.input_error_background);
            }
            int keyboardType = inputSignInMethod.getKeyboardType();
            int i = keyboardType != 2 ? keyboardType != 3 ? keyboardType != 4 ? inputSignInMethod.getInputType() == 2 ? 129 : 1 : inputSignInMethod.getInputType() == 2 ? 18 : 2 : 3 : 33;
            Typeface typeface = inputSignInView.b.getTypeface();
            inputSignInView.b.setInputType(i);
            inputSignInView.b.setTypeface(typeface);
            CarText defaultValue = inputSignInMethod.getDefaultValue();
            Editable text = inputSignInView.b.getText();
            if (!zIsRefresh || text == null || text.length() == 0) {
                inputSignInView.b.setText(hlb.d(geuVar, defaultValue));
                CarRestrictedEditText carRestrictedEditText = inputSignInView.b;
                carRestrictedEditText.setSelection(carRestrictedEditText.getText().length());
            }
            inputSignInView.f = this;
            inputSignInView.g = gkuVar;
            inputSignInView.b.setOnClickListener(new jmq(inputSignInView, gkuVar, 6, bArr));
            inputSignInView.b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kdq
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                    gkuVar.b();
                    String strTrim = inputSignInView.b.getText().toString().trim();
                    if (TextUtils.isEmpty(strTrim)) {
                        return false;
                    }
                    InputSignInMethod inputSignInMethod2 = inputSignInMethod;
                    geu geuVar2 = geuVar;
                    geuVar2.t().j(inputSignInMethod2.getInputCallbackDelegate(), strTrim);
                    return true;
                }
            });
            inputSignInView.i = new kdr(geuVar, inputSignInMethod);
            inputSignInView.b.addTextChangedListener(inputSignInView.i);
            if (inputSignInMethod.isShowKeyboardByDefault() && geuVar.w().b) {
                Handler handler = inputSignInView.a;
                handler.removeMessages(2);
                handler.sendMessageDelayed(handler.obtainMessage(2), 100L);
            }
            inputSignInView.getViewTreeObserver().addOnWindowFocusChangeListener(new kbx(this, geuVar, 0));
            inputSignInView.setVisibility(0);
        } else if (signInMethod instanceof PinSignInMethod) {
            pinSignInView.a.setText(hlb.d(geuVar, ((PinSignInMethod) signInMethod).getPinCode()));
            pinSignInView.setVisibility(0);
        } else if (!(signInMethod instanceof QRCodeSignInMethod)) {
            ((ype) ((ype) r.h()).ai((char) 2907)).y("Unknown sign in method: %s", signInMethod);
        } else if (geuVar.i().c() > 3) {
            try {
                qRCodeSignInView.a.setImageDrawable(gux.b(((QRCodeSignInMethod) signInMethod).getUri().toString()));
            } catch (Exception e) {
                geb gebVarF = geuVar.f();
                gdp gdpVar = new gdp();
                gdpVar.a = e;
                gebVarF.a(new gdq(gdpVar));
            }
            this.A.setVisibility(0);
        } else {
            geb gebVarF2 = geuVar.f();
            gdp gdpVar2 = new gdp();
            gdpVar2.e = 3;
            gebVarF2.a(new gdq(gdpVar2));
        }
        CarText additionalText = signInTemplate.getAdditionalText();
        boolean zIsNullOrEmpty3 = CarText.isNullOrEmpty(additionalText);
        ClickableSpanTextContainer clickableSpanTextContainer = this.B;
        if (zIsNullOrEmpty3) {
            clickableSpanTextContainer.setVisibility(8);
        } else {
            CharSequence charSequenceE = hlb.e(geuVar, additionalText, t, -1);
            clickableSpanTextContainer.b.setText(charSequenceE);
            List list = clickableSpanTextContainer.a;
            list.clear();
            if (charSequenceE instanceof Spannable) {
                Collections.addAll(list, (ClickableSpan[]) ((Spannable) charSequenceE).getSpans(0, charSequenceE.length(), ClickableSpan.class));
            }
            clickableSpanTextContainer.setVisibility(0);
        }
        List<Action> actions = signInTemplate.getActions();
        boolean zIsEmpty = actions.isEmpty();
        ActionButtonListView actionButtonListView = this.C;
        if (zIsEmpty) {
            actionButtonListView.setVisibility(8);
        } else {
            actionButtonListView.a(geuVar, actions, 2);
            actionButtonListView.setVisibility(0);
        }
        if (this.k.isRefresh()) {
            return;
        }
        this.D.a();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        gjv gjvVarB = this.i.B();
        gjvVarB.c(this, 5);
        gjvVarB.c(this, 6);
        super.n();
    }
}

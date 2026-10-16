package com.waze.reports;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.speech.SpeechRecognizer;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.fw;
import com.waze.lm;
import com.waze.reports_v2.c.Cdo;
import com.waze.sharedui.utils.RequestPermissionActivity;
import com.waze.sharedui.views.OvalButton;
import com.waze.view.anim.SelectorBg;
import com.waze.view.button.ReportMenuButton;
import com.waze.view.text.WazeEditText;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class di extends dm {
    public static final /* synthetic */ int v = 0;
    private final com.waze.camera.a A;
    private final Cdo B;
    private int C;
    private OvalButton D;

    /* renamed from: a, reason: collision with root package name */
    protected final com.waze.shared_infra.o.a f33841a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f33842b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f33843c;

    /* renamed from: d, reason: collision with root package name */
    protected NativeManager f33844d;

    /* renamed from: e, reason: collision with root package name */
    protected final dr f33845e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f33846f;

    /* renamed from: g, reason: collision with root package name */
    protected int f33847g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33848h;

    /* renamed from: i, reason: collision with root package name */
    protected int f33849i;

    /* renamed from: j, reason: collision with root package name */
    protected int f33850j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f33851k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f33852l;
    protected boolean m;
    protected boolean n;
    protected int o;
    protected final int p;
    CharSequence q;
    protected View[] r;
    protected WazeEditText s;
    protected TextView t;
    boolean u;
    private Bitmap x;
    private View y;
    private TextWatcher z;

    protected di(Context context, dr drVar, int i2) {
        super(context);
        this.f33841a = com.waze.shared_infra.o.b.a();
        this.f33842b = new int[]{R.string.UNKNOWN, R.string.LESS_THANN_AN_HOUR, R.string.SEVERAL_HOURS, R.string.ALL_DAY, R.string.SEVERAL_DAYS, R.string.LONG_TERM};
        this.f33843c = new int[]{0, 1, 2, 3, 4, 5};
        this.f33847g = -1;
        this.f33848h = true;
        this.f33849i = -1;
        this.f33850j = -1;
        this.f33851k = true;
        this.f33852l = false;
        this.m = true;
        this.n = true;
        this.o = 3;
        this.C = -1;
        this.u = false;
        this.f33845e = drVar;
        this.p = i2;
        this.A = (com.waze.camera.a) com.waze.web.r.l(com.waze.camera.a.class, new com.waze.native_managers.n(20));
        this.B = (Cdo) com.waze.web.r.h(Cdo.class);
    }

    public static /* synthetic */ void Q(di diVar, com.waze.reports_v2.d.j jVar) {
        jVar.P(com.waze.reports_v2.d.e.f34573g, diVar.a(), diVar.h(), null);
        diVar.L();
        dj djVar = diVar.w;
        if (djVar != null) {
            djVar.b(diVar.l(diVar.getContext()));
            return;
        }
        Context context = diVar.getContext();
        int i2 = lm.f25154a;
        Activity activityS = com.waze.shared_infra.i.h.s(context);
        if (activityS == null) {
            return;
        }
        activityS.startActivityForResult(diVar.l(activityS), 32770);
    }

    private final void T(Bitmap bitmap) {
        ImageView imageView = (ImageView) findViewById(R.id.reportPictureImage);
        if (imageView == null) {
            return;
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.clearColorFilter();
        } else {
            imageView.setImageResource(R.drawable.icon_reports_addphoto);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setColorFilter(ContextCompat.getColor(getContext(), R.color.content_default));
        }
    }

    private final Intent l(Context context) {
        com.waze.sharedui.utils.m mVarB = this.A.b(context);
        Intent intent = new Intent(getContext(), (Class<?>) RequestPermissionActivity.class);
        intent.putExtra("needed_permissions", new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        com.waze.shared_infra.i.h.j("ReportForm: takePicture: Requesting permission CAMERA and/or WRITE_EXTERNAL_STORAGE");
        intent.putExtra("on_granted", mVarB);
        return intent;
    }

    private final File q() {
        return this.A.c(getContext());
    }

    public static /* synthetic */ void x(di diVar, com.waze.shared_infra.s.d dVar) {
        diVar.T(diVar.x);
        dVar.a();
    }

    public static /* synthetic */ void y(di diVar, int i2, Intent intent, com.waze.shared_infra.s.d dVar) {
        int iR = com.waze.shared_infra.i.h.r(40);
        diVar.x = diVar.A.a(diVar.getContext(), i2, intent, iR, iR);
        com.google.firebase.appcheck.debug.a.a aVar = new com.google.firebase.appcheck.debug.a.a(diVar, dVar, 11, null);
        h.g.b.x.f(aVar, "runnable");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new dl(aVar, null), 3);
    }

    public static /* synthetic */ void z(di diVar, TextView textView, DialogInterface dialogInterface, int i2) {
        diVar.C = diVar.f33843c[i2];
        if (textView != null) {
            textView.setText(diVar.f33841a.c(diVar.f33842b[i2], new Object[0]));
        }
        dialogInterface.dismiss();
    }

    public void A() {
        TextView textView = (TextView) findViewById(R.id.reportGenericAddDetailsText);
        CharSequence charSequence = this.q;
        if (charSequence != null) {
            this.s.setText(charSequence);
            if (textView != null) {
                textView.setText(this.q);
            }
        } else if (textView != null) {
            textView.setText(this.f33841a.c(R.string.ADD_A_COMMENT, new Object[0]));
        }
        View viewFindViewById = findViewById(R.id.reportEditTextVoice);
        if (viewFindViewById != null) {
            if (getResources().getConfiguration().orientation == 1) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        T(this.x);
    }

    protected final void B() {
        int[] iArrF = f();
        int[] iArrE = e();
        this.r = new View[this.o];
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportButtons);
        viewGroup.removeAllViews();
        for (int i2 = 0; i2 < this.o; i2++) {
            View[] viewArr = this.r;
            int i3 = iArrF[i2];
            int i4 = iArrE[i2];
            View viewInflate = this.f33846f.inflate(R.layout.report_generic_button, viewGroup, false);
            ((TextView) viewInflate.findViewById(R.id.reportGenericButtonText)).setText(this.f33841a.c(i3, new Object[0]));
            ((ImageView) viewInflate.findViewById(R.id.reportGenericButtonImage)).setImageResource(i4);
            viewGroup.addView(viewInflate);
            viewArr[i2] = viewInflate;
            this.r[i2].setOnClickListener(new dh(this, i2));
        }
    }

    protected void C() {
        L();
        WazeEditText wazeEditText = this.s;
        wazeEditText.setInputType(wazeEditText.getInputType() | 1);
        setOutAnimation(getContext(), R.anim.main_slide_out_left);
        setInAnimation(getContext(), R.anim.main_slide_in_right);
        showNext();
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null && eVarE.getWindow() != null) {
            eVarE.getWindow().setSoftInputMode(16);
        }
        this.s.requestFocus();
        com.waze.ui.x.u.l(lm.d().c(), this.s);
    }

    public final void D(int i2, Intent intent) {
        com.waze.app_nav.hub.b.c cVarC = com.waze.app_nav.hub.b.m.c();
        h.g.b.x.f(cVarC, "<this>");
        h.g.b.x.f("building bitmap from camera intent", "tag");
        fw fwVar = new fw(this, i2, intent, com.waze.sharedui.api.i.a(cVarC, "building bitmap from camera intent", R.string.PLEASE_WAIT___), 3);
        h.g.b.x.f(fwVar, "runnable");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), kotlinx.coroutines.av.a(), null, new dk(fwVar, null), 2);
    }

    public final void E(int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra.size() > 0) {
                this.s.append(stringArrayListExtra.get(0));
            }
        }
        this.s.requestFocus();
        com.waze.ui.x.u.l(lm.d().e(), this.s);
    }

    protected void F() {
        findViewById(R.id.reportGenericAddDetails).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.reportGenericAddDetailsText);
        com.waze.shared_infra.o.a aVar = this.f33841a;
        textView.setText(aVar.c(R.string.ADD_A_COMMENT, new Object[0]));
        View view = this.y;
        if (view != null) {
            removeView(view);
        }
        this.y = this.f33846f.inflate(R.layout.report_edit_text, this);
        this.s = (WazeEditText) findViewById(R.id.reportEditTextEditText);
        this.t = (TextView) findViewById(R.id.reportEditTextCounter);
        this.s.setHint(aVar.c(R.string.SHARE_DETAILS_HERE___, new Object[0]));
        this.s.g(new cx(this));
        this.s.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.waze.reports.cy
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getAction() != 0) {
                    return true;
                }
                this.f33819a.d();
                return true;
            }
        });
        this.s.setOnKeyListener(new cz());
        this.s.setText(this.q);
        int iS = s();
        int i2 = 1;
        if (iS > 0) {
            this.s.setFilters(new InputFilter[]{new InputFilter.LengthFilter(iS)});
            this.t.setVisibility(0);
            if (this.z == null) {
                dc dcVar = new dc(this, iS);
                this.z = dcVar;
                dcVar.afterTextChanged(this.s.getText());
            }
            this.s.addTextChangedListener(this.z);
        }
        findViewById(R.id.reportGenericAddDetails).setOnClickListener(new cv(this, i2));
        View viewFindViewById = findViewById(R.id.reportEditTextVoice);
        if (viewFindViewById != null) {
            if (!SpeechRecognizer.isRecognitionAvailable(getContext())) {
                viewFindViewById.setVisibility(8);
            } else if (getResources().getConfiguration().orientation != 1) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(new com.waze.mywaze.f(this, 14));
            }
        }
    }

    protected final void G() {
        this.f33844d = NativeManager.getInstance();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f33846f = layoutInflater;
        layoutInflater.inflate(R.layout.report_generic, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportGenericLayout);
        viewGroup.setClickable(true);
        com.waze.shared_infra.o.a aVar = this.f33841a;
        int i2 = this.p;
        View viewFindViewById = findViewById(R.id.reportGenericAddDetails);
        View viewFindViewById2 = findViewById(R.id.reportGenericDetailsAreaSeperator);
        int i3 = 0;
        ((TextView) findViewById(R.id.reportTitle)).setText(aVar.c(i2, new Object[0]));
        this.D = (OvalButton) findViewById(R.id.reportLater);
        int i4 = 2;
        if (this.f33847g >= 0) {
            if (getContext().getResources().getConfiguration().orientation == 2) {
                viewGroup = (ViewGroup) viewGroup.findViewById(R.id.reportGenericLandscapeContent);
            }
            viewGroup.removeView(findViewById(R.id.reportGenericSelectorArea));
            viewGroup.removeView(findViewById(R.id.reportGenericDetailsArea));
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.reportGenericExtArea);
            viewGroup2.setVisibility(0);
            this.f33846f.inflate(this.f33847g, viewGroup2);
        } else {
            B();
        }
        String strC = aVar.c(R.string.SEND, new Object[0]);
        TextView textView = (TextView) findViewById(R.id.reportSendText);
        if (textView != null) {
            textView.setText(strC);
        }
        String strC2 = aVar.c(R.string.LATER_CAPITAL, new Object[0]);
        TextView textView2 = (TextView) findViewById(R.id.reportLaterText);
        if (textView2 != null) {
            textView2.setText(strC2);
        }
        if (!this.n && !this.m && !this.f33852l && !this.f33851k) {
            findViewById(R.id.reportGenericDetailsArea).setVisibility(8);
        }
        if (this.n) {
            F();
        } else if (this.f33852l) {
            String strC3 = aVar.c(R.string.DURATION, new Object[0]);
            TextView textView3 = (TextView) findViewById(R.id.reportGenericAddDetailsText);
            if (textView3 != null) {
                textView3.setText(strC3);
            }
            ImageView imageView = (ImageView) findViewById(R.id.reportGenericAddDetailsImage);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.icon_reports_add_duration);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new cu(this, textView3, i3));
            }
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
        }
        com.waze.reports_v2.d.j jVarA = com.waze.reports_v2.d.j.f34595a.a();
        findViewById(R.id.reportCloseAll).setOnClickListener(new cu(this, jVarA, i4));
        View viewFindViewById3 = findViewById(R.id.reportCloseButton);
        viewFindViewById3.setOnClickListener(new cv(this, i3));
        if (viewFindViewById3 instanceof ReportMenuButton) {
            ((ReportMenuButton) viewFindViewById3).i();
        }
        View viewFindViewById4 = findViewById(R.id.reportLater);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new com.waze.mywaze.f(this, 15));
            com.waze.shared_infra.i.h.y(viewFindViewById4);
        }
        View viewFindViewById5 = findViewById(R.id.reportSend);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new com.waze.mywaze.f(this, 16));
            com.waze.shared_infra.i.h.y(viewFindViewById5);
        }
        byte[] bArr = null;
        if (this.m) {
            View viewFindViewById6 = findViewById(R.id.reportGenericAddPhoto);
            if (viewFindViewById6 != null) {
                viewFindViewById6.setOnClickListener(new com.waze.a.y(this, jVarA, 12, bArr));
            }
            TextView textView4 = (TextView) findViewById(R.id.reportGenericAddPhotoText);
            if (textView4 != null) {
                textView4.setText(aVar.c(R.string.ADD_A_PHOTO, new Object[0]));
            }
        } else {
            View viewFindViewById7 = findViewById(R.id.reportGenericAddPhoto);
            if (viewFindViewById7 != null) {
                viewFindViewById7.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
        }
        T(null);
    }

    public final void H() {
        com.waze.reports_v2.b.ad adVarB = b();
        com.waze.reports_v2.b.ae aeVarC = c();
        this.B.b(adVarB == null ? null : new com.waze.reports_v2.c.ck(adVarB), aeVarC != null ? new com.waze.reports_v2.c.cl(aeVarC) : null);
        L();
        this.f33845e.v((ReportMenuButton) findViewById(R.id.reportCloseButton));
    }

    public final void I(int i2, int i3) {
        ReportMenuButton reportMenuButton = (ReportMenuButton) findViewById(R.id.reportCloseButton);
        reportMenuButton.setBackgroundColor(i3);
        reportMenuButton.f(i2);
        reportMenuButton.h();
    }

    protected final void J(int i2, String[] strArr, int[] iArr, int[] iArr2) {
        this.f33850j = -1;
        com.waze.sharedui.g.s[] sVarArr = new com.waze.sharedui.g.s[strArr.length];
        int i3 = 0;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            sVarArr[i4] = new com.waze.sharedui.g.s(iArr2[i4], strArr[i4], getContext().getResources().getDrawable(iArr[i4]));
        }
        df dfVar = new df(this, getContext(), this.f33841a.c(i2, new Object[0]), sVarArr, new cs(this, i3));
        dfVar.l(new DialogInterface.OnCancelListener() { // from class: com.waze.reports.ct
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f33809a.n();
            }
        });
        dfVar.show();
    }

    public final void K() {
        if (P()) {
            this.D.z(10000L);
        }
    }

    public final void L() {
        this.D.A();
        this.u = true;
    }

    public final void M(com.waze.reports_v2.presentation.a.at atVar) {
        WazeEditText wazeEditText;
        int i2;
        Integer numG = atVar.g();
        if (numG != null) {
            this.f33850j = numG.intValue();
        }
        Integer numF = atVar.f();
        if (this.f33852l && numF != null) {
            this.C = numF.intValue();
            TextView textView = (TextView) findViewById(R.id.reportGenericAddDetailsText);
            if (textView != null && (i2 = this.C) != -1) {
                textView.setText(this.f33841a.c(this.f33842b[i2], new Object[0]));
            }
        }
        String strH = atVar.h();
        if (strH != null && (wazeEditText = this.s) != null) {
            this.q = strH;
            wazeEditText.setText(strH);
            A();
        }
        Bitmap bitmapC = atVar.c();
        if (bitmapC != null && this.m) {
            this.x = bitmapC;
            T(bitmapC);
        }
        com.waze.reports_v2.b.ae aeVarE = atVar.e();
        if (aeVarE != null) {
            j(aeVarE);
        }
    }

    protected boolean N(int i2) {
        return false;
    }

    protected final boolean O() {
        return q().exists() && q().length() > 0;
    }

    protected boolean P() {
        return !this.u;
    }

    public final void R(int i2, int i3, ReportMenuButton reportMenuButton) {
        List listW = w();
        float f2 = getContext().getResources().getDisplayMetrics().density;
        boolean z = true;
        int i4 = reportMenuButton != null ? 1 : 0;
        int i5 = i3 >> 2;
        int i6 = i2 + i5;
        while (true) {
            int i7 = i6 + i5;
            if (i4 >= listW.size()) {
                break;
            }
            View view = (View) listW.get(i4);
            AnimationSet animationSet = new AnimationSet(z);
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, f2 * 50.0f, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.setDuration(i3);
            animationSet.setStartOffset(i6);
            animationSet.setFillBefore(true);
            animationSet.setInterpolator(new DecelerateInterpolator());
            view.startAnimation(animationSet);
            i4++;
            i6 = i7;
            listW = listW;
            z = true;
        }
        ReportMenuButton reportMenuButton2 = (ReportMenuButton) findViewById(R.id.reportCloseButton);
        reportMenuButton2.setVisibility(0);
        reportMenuButton2.setAlpha(1.0f);
        reportMenuButton2.h();
        if (reportMenuButton != null) {
            reportMenuButton2.setBackgroundColor(reportMenuButton.a());
            reportMenuButton2.f(reportMenuButton.b());
            reportMenuButton2.getViewTreeObserver().addOnGlobalLayoutListener(new de(this, reportMenuButton2, reportMenuButton, i2));
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(i3);
            alphaAnimation.setStartOffset(i2);
            alphaAnimation.setFillBefore(true);
            findViewById(R.id.reportTitle).startAnimation(alphaAnimation);
        }
    }

    public final void S(Animation.AnimationListener animationListener) {
        List listW = w();
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = 0;
        for (int size = listW.size() - 1; size >= 0; size--) {
            View view = (View) listW.get(size);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, 50.0f * f2));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(150L);
            animationSet.setStartOffset(i2);
            animationSet.setFillAfter(true);
            animationSet.setInterpolator(new AccelerateInterpolator());
            if (size == 0) {
                animationSet.setAnimationListener(animationListener);
            }
            view.startAnimation(animationSet);
            i2 += 37;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        findViewById(R.id.reportTitle).startAnimation(alphaAnimation);
    }

    protected abstract int a();

    protected com.waze.reports_v2.b.ad b() {
        throw null;
    }

    public com.waze.reports_v2.b.ae c() {
        throw null;
    }

    protected void d() {
        lm.d().e().getWindow().setSoftInputMode(32);
        String strTrim = this.s.getText().toString().trim();
        TextView textView = (TextView) findViewById(R.id.reportGenericAddDetailsText);
        if (textView != null) {
            if (strTrim.isEmpty()) {
                textView.setText(this.f33841a.c(R.string.ADD_A_COMMENT, new Object[0]));
            } else {
                textView.setText(strTrim);
            }
        }
        setOutAnimation(getContext(), R.anim.main_slide_out_right);
        setInAnimation(getContext(), R.anim.main_slide_in_left);
        com.waze.ui.x.u.j(lm.d().c(), this.s);
        postDelayed(new com.waze.g.f(this, 8), 100L);
        TextWatcher textWatcher = this.z;
        if (textWatcher != null) {
            this.s.removeTextChangedListener(textWatcher);
            this.z = null;
        }
    }

    protected abstract int[] e();

    protected abstract int[] f();

    protected abstract int[] g();

    protected int h() {
        if (this.f33849i < 0) {
            return -1;
        }
        return g()[this.f33849i];
    }

    protected void i(int i2) {
        L();
    }

    public void j(com.waze.reports_v2.b.ae aeVar) {
    }

    protected void k() {
        L();
    }

    protected void m() {
        ((TextView) this.r[this.f33849i].findViewById(R.id.reportGenericButtonText)).setText(this.f33841a.c(f()[this.f33849i], new Object[0]));
        ((ImageView) this.r[this.f33849i].findViewById(R.id.reportGenericButtonImage)).setImageResource(e()[this.f33849i]);
        this.r[this.f33849i].setSelected(false);
        ((SelectorBg) this.r[this.f33849i].findViewById(R.id.reportGenericButtonSelector)).b();
        this.f33849i = -1;
        this.f33850j = -1;
    }

    protected void n() {
    }

    public void o() {
        com.waze.reports_v2.b.ad adVarB = b();
        com.waze.reports_v2.b.ae aeVarC = c();
        this.B.K(adVarB == null ? null : new com.waze.reports_v2.c.ck(adVarB), aeVarC == null ? null : new com.waze.reports_v2.c.cl(aeVarC), false);
        L();
        final String absolutePath = O() ? q().getParentFile().getAbsolutePath() : null;
        final String name = O() ? q().getName() : null;
        WazeEditText wazeEditText = this.s;
        final String strTrim = wazeEditText != null ? wazeEditText.getText().toString().trim() : null;
        final int i2 = true != this.f33848h ? 2 : 1;
        final int iA = a();
        final int iH = h();
        final int i3 = this.C;
        NativeManager.Post(new Runnable() { // from class: com.waze.reports.cr
            @Override // java.lang.Runnable
            public final void run() {
                this.f33799a.f33844d.sendAlertRequest(absolutePath, name, strTrim, i2, iA, iH, i3, com.waze.rtalerts.y.f35166a);
            }
        });
        S(null);
        ((View) w().get(0)).clearAnimation();
        ReportMenuButton reportMenuButton = (ReportMenuButton) findViewById(R.id.reportCloseButton);
        reportMenuButton.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 4.0f);
        translateAnimation.setStartOffset(100L);
        translateAnimation.setDuration(400L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new AnticipateInterpolator(0.8f));
        translateAnimation.setAnimationListener(new db(this, 0));
        reportMenuButton.startAnimation(translateAnimation);
    }

    protected void p() {
    }

    public final int r() {
        return this.C;
    }

    protected int s() {
        return 0;
    }

    public final int t() {
        return this.f33850j;
    }

    public final Bitmap u() {
        return this.x;
    }

    public final CharSequence v() {
        WazeEditText wazeEditText = this.s;
        if (wazeEditText != null) {
            return wazeEditText.getText();
        }
        return null;
    }

    protected final List w() {
        ArrayList arrayList = new ArrayList(5);
        View viewFindViewById = findViewById(R.id.reportGenericTopArea);
        if (viewFindViewById != null) {
            arrayList.add(viewFindViewById);
        }
        if (this.f33847g < 0) {
            View viewFindViewById2 = findViewById(R.id.reportGenericSelectorArea);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
            View viewFindViewById3 = findViewById(R.id.reportGenericDetailsArea);
            if (viewFindViewById3 != null) {
                arrayList.add(viewFindViewById3);
            }
        } else {
            View viewFindViewById4 = findViewById(R.id.reportGenericExtArea);
            if (viewFindViewById4 != null) {
                arrayList.add(viewFindViewById4);
            }
        }
        View viewFindViewById5 = findViewById(R.id.reportGenericButtonsArea);
        if (viewFindViewById5 != null) {
            arrayList.add(viewFindViewById5);
        }
        return arrayList;
    }
}

package com.google.android.apps.auto.components.apphost.telecom.dialpad;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.acob;
import defpackage.dvd;
import defpackage.ebf;
import defpackage.fwe;
import defpackage.fwf;
import defpackage.fwh;
import defpackage.gec;
import defpackage.geu;
import defpackage.hls;
import defpackage.ie;
import defpackage.joo;
import defpackage.jri;
import defpackage.jzq;
import defpackage.jzr;
import defpackage.jzs;
import defpackage.jzt;
import defpackage.jzv;
import defpackage.jzx;
import defpackage.jzy;
import defpackage.lbh;
import defpackage.liq;
import defpackage.odj;
import defpackage.odn;
import defpackage.oeb;
import defpackage.oll;
import defpackage.olm;
import defpackage.sw;
import defpackage.tj;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MaterialStandardDialpadView extends LinearLayout implements jzq, liq {
    private static final oeb C;
    private static final oeb D;
    public static final SparseArray b;
    private final View.OnKeyListener A;
    private final View.OnTouchListener B;
    public final Handler c;
    public final AudioManager d;
    public ToneGenerator e;
    public StringBuilder f;
    public View g;
    public geu h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private TextView o;
    private int p;
    private View q;
    private View r;
    private MaterialActionButtonView s;
    private List t;
    private View u;
    private final List v;
    private final Resources w;
    private boolean x;
    private final Runnable y;
    private final Runnable z;
    public static final yph a = yph.c("GH.MStandardDialpadView");
    private static final int n = ViewConfiguration.getLongPressTimeout();

    static {
        oeb oebVar = new oeb('0', 0);
        C = oebVar;
        oeb oebVar2 = new oeb('1', 1);
        D = oebVar2;
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(R.id.zero, oebVar);
        sparseArray.put(R.id.one, oebVar2);
        sparseArray.put(R.id.two, new oeb('2', 2));
        sparseArray.put(R.id.three, new oeb('3', 3));
        sparseArray.put(R.id.four, new oeb('4', 4));
        sparseArray.put(R.id.five, new oeb('5', 5));
        sparseArray.put(R.id.six, new oeb('6', 6));
        sparseArray.put(R.id.seven, new oeb('7', 7));
        sparseArray.put(R.id.eight, new oeb('8', 8));
        sparseArray.put(R.id.nine, new oeb('9', 9));
        sparseArray.put(R.id.star, new oeb('*', 10));
        sparseArray.put(R.id.pound, new oeb('#', 11));
    }

    public MaterialStandardDialpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Handler(Looper.getMainLooper());
        this.v = new ArrayList();
        this.y = new joo(this, 15);
        this.z = new joo(this, 16);
        this.A = new jzs(this, 0);
        this.B = new jzt(this, 0);
        this.p = -1;
        this.d = (AudioManager) context.getSystemService("audio");
        this.f = new StringBuilder(20);
        this.w = context.getResources();
        olm.a();
        new oll(context, new jzv(this, 1));
    }

    private final ToneGenerator l() {
        ToneGenerator toneGenerator = this.e;
        if (toneGenerator != null) {
            return toneGenerator;
        }
        ToneGenerator toneGenerator2 = new ToneGenerator(3, 80);
        this.e = toneGenerator2;
        return toneGenerator2;
    }

    @Override // defpackage.liq
    public final void a(boolean z) throws Resources.NotFoundException {
        int i;
        if (this.h.x().b()) {
            boolean z2 = z || this.x;
            Iterator it = this.v.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i = R.dimen.dialpad_disabled_alpha;
                if (!zHasNext) {
                    break;
                }
                View view = (View) it.next();
                view.setEnabled(z2);
                view.setFocusable(z2);
                if (true == z2) {
                    i = R.dimen.dialpad_enabled_alpha;
                }
                TypedValue typedValue = new TypedValue();
                this.w.getValue(i, typedValue, true);
                view.setAlpha(typedValue.getFloat());
            }
            this.u.setVisibility(true != z2 ? 0 : 8);
            boolean z3 = this.x || z || this.f.length() > 0;
            this.s.setEnabled(z3);
            if (!acob.H()) {
                this.s.setFocusable(z3);
            }
            if (true == z3) {
                i = R.dimen.dialpad_enabled_alpha;
            }
            TypedValue typedValue2 = new TypedValue();
            this.w.getValue(i, typedValue2, true);
            this.o.setAlpha(typedValue2.getFloat());
        }
    }

    @Override // defpackage.jzq
    public final String b() {
        return this.f.toString();
    }

    @Override // defpackage.jzq
    public final void c(List list) {
        this.t = list;
        f();
    }

    @Override // defpackage.jzq
    public final void d(String str) {
        StringBuilder sb = new StringBuilder(20);
        this.f = sb;
        sb.append(str);
        h();
    }

    public final void e(char c) {
        if (this.f.length() >= 20) {
            return;
        }
        this.f.append(c);
        h();
    }

    public final void f() {
        List list = this.t;
        if (list == null || list.isEmpty()) {
            if (this.h == null) {
                return;
            }
            this.x = false;
            this.o.setHint(R.string.dial_a_number);
            h();
            MaterialActionButtonView materialActionButtonView = this.s;
            geu geuVar = this.h;
            sw swVar = new sw();
            swVar.c(new CarIcon(new tj(IconCompat.m(geuVar, R.drawable.gs_call_vd_theme_24))));
            swVar.d(new gec(this, 9));
            materialActionButtonView.o(geuVar, swVar.a(), fwh.d, fwf.d, new hls(false, false, false), fwe.a(Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.l), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.l), Integer.valueOf(dvd.e(this.m, 31)), Integer.valueOf(dvd.e(this.m, 97))), true);
            return;
        }
        List list2 = this.t;
        if (this.h != null) {
            this.x = true;
            this.f.setLength(0);
            this.o.setHint("");
            h();
            MaterialActionButtonView materialActionButtonView2 = this.s;
            geu geuVar2 = this.h;
            sw swVar2 = new sw();
            swVar2.c(new CarIcon(new tj(IconCompat.m(geuVar2, R.drawable.gs_call_end_vd_theme_24))));
            swVar2.d(new gec(list2, 10));
            materialActionButtonView2.o(geuVar2, swVar2.a(), fwh.d, fwf.d, new hls(false, false, false), fwe.a(Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.j), Integer.valueOf(dvd.e(this.m, 31)), Integer.valueOf(dvd.e(this.m, 97))), true);
        }
    }

    public final void g() {
        if (this.p == -1) {
            return;
        }
        ebf.A().v();
        this.p = -1;
        l().stopTone();
        this.c.postDelayed(this.y, 250L);
    }

    public final void h() {
        this.o.setText(this.x ? this.f.toString() : odn.a().r(getContext(), this.f.toString()));
        int length = this.f.length();
        View view = this.q;
        if (length > 0) {
            view.setVisibility(0);
            this.r.setVisibility(0);
        } else {
            view.setVisibility(8);
            this.r.setVisibility(8);
            a(lbh.c().q());
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean i(View view) {
        this.c.removeCallbacks(this.z);
        boolean zIsPressed = view.isPressed();
        view.setPressed(false);
        g();
        return zIsPressed;
    }

    public final void j(View view, oeb oebVar) {
        ype ypeVar = (ype) a.l().ai(2871);
        char c = oebVar.a;
        ypeVar.v("onDialpadDown %c", c);
        view.setPressed(true);
        if (this.p == -1) {
            ebf.A().r(c);
            int i = oebVar.b;
            this.p = i;
            if (this.d.requestAudioFocus(null, 3, 3) == 1) {
                this.c.removeCallbacks(this.y);
                l().startTone(i);
            }
        }
        if (C.a == c || D.a == c) {
            this.g = view;
            this.c.postDelayed(this.z, n);
        }
    }

    public final boolean k(View view, oeb oebVar) {
        ((ype) a.l().ai(2872)).v("onDialpadUp %c", oebVar.a);
        return i(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (jri.a()) {
            setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            return windowInsets.consumeSystemWindowInsets();
        }
        setPadding(getLeft(), windowInsets.getSystemWindowInsetTop(), getPaddingRight(), getPaddingBottom());
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        MaterialActionButtonView materialActionButtonView = (MaterialActionButtonView) findViewById(R.id.call);
        materialActionButtonView.getClass();
        this.s = materialActionButtonView;
        TextView textView = (TextView) findViewById(R.id.number);
        textView.getClass();
        this.o = textView;
        View viewFindViewById = findViewById(R.id.imageButton);
        viewFindViewById.getClass();
        this.q = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.delete);
        viewFindViewById2.getClass();
        this.r = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.standard_keypad_locked_overlay);
        viewFindViewById3.getClass();
        this.u = viewFindViewById3;
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = b;
            if (i2 >= sparseArray.size()) {
                this.q.setOnClickListener(new ie(this, 12, null));
                this.q.setOnLongClickListener(new jzr(this, i));
                return;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            MaterialDialpadKey materialDialpadKey = (MaterialDialpadKey) findViewById(iKeyAt);
            materialDialpadKey.getClass();
            this.v.add(materialDialpadKey);
            int i3 = 1;
            if (iKeyAt == R.id.zero) {
                materialDialpadKey.setOnLongClickListener(new jzr(this, i3));
            } else if (iKeyAt == R.id.one) {
                odj odjVarA = ebf.A();
                if (odjVarA.A()) {
                    materialDialpadKey.setOnLongClickListener(new jzx((LinearLayout) this, odjVarA, i3));
                } else {
                    materialDialpadKey.findViewById(R.id.secondary_image_view).setVisibility(4);
                }
                iKeyAt = R.id.one;
            }
            materialDialpadKey.setOnClickListener(new jzy(this, iKeyAt, i3));
            materialDialpadKey.setOnTouchListener(this.B);
            materialDialpadKey.setOnKeyListener(this.A);
            i2++;
        }
    }
}

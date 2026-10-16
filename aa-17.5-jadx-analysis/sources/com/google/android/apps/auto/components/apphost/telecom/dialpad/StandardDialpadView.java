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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.ebf;
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
import defpackage.nrd;
import defpackage.odj;
import defpackage.odn;
import defpackage.oeb;
import defpackage.oll;
import defpackage.olm;
import defpackage.oxc;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class StandardDialpadView extends LinearLayout implements jzq, liq {
    public static final SparseArray b;
    private static final oeb u;
    private static final oeb v;
    public final AudioManager c;
    protected ToneGenerator d;
    public StringBuilder e;
    public View f;
    private final Handler h;
    private TextView i;
    private int j;
    private View k;
    private ImageButton l;
    private View m;
    private final List n;
    private final Resources o;
    private oxc p;
    private final Runnable q;
    private final Runnable r;
    private final View.OnKeyListener s;
    private final View.OnTouchListener t;
    public static final yph a = yph.c("GH.StandardDialpadView");
    private static final int g = ViewConfiguration.getLongPressTimeout();

    static {
        oeb oebVar = new oeb('0', 0);
        u = oebVar;
        oeb oebVar2 = new oeb('1', 1);
        v = oebVar2;
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

    public StandardDialpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Handler(Looper.getMainLooper());
        this.n = new ArrayList();
        this.q = new joo(this, 17);
        this.r = new joo(this, 18);
        this.s = new jzs(this, 2);
        this.t = new jzt(this, 2);
        this.j = -1;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = new StringBuilder(20);
        this.o = context.getResources();
        olm.a();
        new oll(context, new jzv(this, 2));
    }

    private final ToneGenerator k() {
        ToneGenerator toneGenerator = this.d;
        if (toneGenerator != null) {
            return toneGenerator;
        }
        ToneGenerator toneGenerator2 = new ToneGenerator(3, 80);
        this.d = toneGenerator2;
        return toneGenerator2;
    }

    @Override // defpackage.liq
    public final void a(boolean z) throws Resources.NotFoundException {
        int i;
        if (nrd.a().f()) {
            Iterator it = this.n.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i = R.dimen.dialpad_disabled_alpha;
                if (!zHasNext) {
                    break;
                }
                View view = (View) it.next();
                view.setEnabled(z);
                view.setFocusable(z);
                if (true == z) {
                    i = R.dimen.dialpad_enabled_alpha;
                }
                TypedValue typedValue = new TypedValue();
                this.o.getValue(i, typedValue, true);
                view.setAlpha(typedValue.getFloat());
            }
            this.m.setVisibility(true != z ? 0 : 8);
            boolean z2 = z || this.e.length() > 0;
            this.l.setEnabled(z2);
            this.l.setFocusable(z2);
            if (true == z2) {
                i = R.dimen.dialpad_enabled_alpha;
            }
            TypedValue typedValue2 = new TypedValue();
            this.o.getValue(i, typedValue2, true);
            this.l.setAlpha(typedValue2.getFloat());
            this.i.setAlpha(typedValue2.getFloat());
        }
    }

    @Override // defpackage.jzq
    public final String b() {
        throw null;
    }

    @Override // defpackage.jzq
    public final void c(List list) {
        throw null;
    }

    @Override // defpackage.jzq
    public final void d(String str) {
        throw null;
    }

    public final void e(char c) {
        if (this.e.length() >= 20) {
            return;
        }
        this.e.append(c);
        g();
    }

    public final void f() {
        if (this.j == -1) {
            return;
        }
        ebf.A().v();
        this.j = -1;
        k().stopTone();
        this.h.postDelayed(this.q, 250L);
    }

    public final void g() {
        this.i.setText(odn.a().r(getContext(), this.e.toString()));
        int length = this.e.length();
        View view = this.k;
        if (length > 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
            a(lbh.c().q());
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean h(View view) {
        this.h.removeCallbacks(this.r);
        boolean zIsPressed = view.isPressed();
        view.setPressed(false);
        f();
        return zIsPressed;
    }

    public final void i(View view, oeb oebVar) {
        ype ypeVar = (ype) a.l().ai(2886);
        char c = oebVar.a;
        ypeVar.v("onDialpadDown %c", c);
        view.setPressed(true);
        if (this.j == -1) {
            ebf.A().r(c);
            int i = oebVar.b;
            this.j = i;
            if (this.c.requestAudioFocus(null, 3, 3) == 1) {
                this.h.removeCallbacks(this.q);
                k().startTone(i);
            }
        }
        if (u.a == c || v.a == c) {
            this.f = view;
            this.h.postDelayed(this.r, g);
        }
    }

    public final boolean j(View view, oeb oebVar) {
        ((ype) a.l().ai(2887)).v("onDialpadUp %c", oebVar.a);
        return h(view);
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
        ImageButton imageButton = (ImageButton) findViewById(R.id.call);
        imageButton.getClass();
        this.l = imageButton;
        TextView textView = (TextView) findViewById(R.id.number);
        textView.getClass();
        this.i = textView;
        View viewFindViewById = findViewById(R.id.delete);
        viewFindViewById.getClass();
        this.k = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.standard_keypad_locked_overlay);
        viewFindViewById2.getClass();
        this.m = viewFindViewById2;
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            View viewFindViewById3 = findViewById(iKeyAt);
            viewFindViewById3.getClass();
            this.n.add(viewFindViewById3);
            if (iKeyAt == R.id.zero) {
                viewFindViewById3.setOnLongClickListener(new jzr(this, 2));
            } else if (iKeyAt == R.id.one) {
                odj odjVarA = ebf.A();
                if (odjVarA.A()) {
                    viewFindViewById3.setOnLongClickListener(new jzx((LinearLayout) this, odjVarA, i));
                } else {
                    ((ImageButton) viewFindViewById3).setImageDrawable(getResources().getDrawable(true != jri.a() ? R.drawable.dialpad_1_no_voicemail_in_call_deprecated : R.drawable.gearhead_dialpad_1_no_voicemail_in_call));
                }
                iKeyAt = R.id.one;
            }
            viewFindViewById3.setOnClickListener(new jzy(this, iKeyAt, i));
            viewFindViewById3.setOnTouchListener(this.t);
            viewFindViewById3.setOnKeyListener(this.s);
            i2++;
        }
        byte[] bArr = null;
        this.k.setOnClickListener(new ie(this, 14, bArr));
        this.k.setOnLongClickListener(new jzr(this, 3));
        this.i.setHint(R.string.dial_a_number);
        g();
        if (this.p == null) {
            oxc oxcVar = new oxc(getContext());
            this.p = oxcVar;
            oxcVar.b(getContext().getResources().getColor(R.color.gearhead_sdk_call_answer));
        }
        this.l.setBackground(this.p);
        this.l.setImageResource(R.drawable.ic_call);
        this.l.setOnClickListener(new ie(this, 13, bArr));
    }
}

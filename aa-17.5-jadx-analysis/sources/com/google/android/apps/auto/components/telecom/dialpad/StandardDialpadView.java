package com.google.android.apps.auto.components.telecom.dialpad;

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
import defpackage.jri;
import defpackage.jzr;
import defpackage.jzs;
import defpackage.jzt;
import defpackage.jzv;
import defpackage.jzx;
import defpackage.jzy;
import defpackage.lbh;
import defpackage.liq;
import defpackage.nmp;
import defpackage.nqw;
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
public class StandardDialpadView extends LinearLayout implements liq {
    public static final SparseArray b;
    private static final oeb h;
    private static final oeb i;
    public final AudioManager c;
    protected ToneGenerator d;
    public StringBuilder e;
    public View f;
    private final Handler j;
    private TextView k;
    private int l;
    private View m;
    private ImageButton n;
    private View o;
    private final List p;
    private final Resources q;
    private oxc r;
    private final Runnable s;
    private final Runnable t;
    private final View.OnKeyListener u;
    private final View.OnTouchListener v;
    public static final yph a = yph.c("GH.StandardDialpadView");
    private static final int g = ViewConfiguration.getLongPressTimeout();

    static {
        oeb oebVar = new oeb('0', 0);
        h = oebVar;
        oeb oebVar2 = new oeb('1', 1);
        i = oebVar2;
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
        this.j = new Handler(Looper.getMainLooper());
        this.p = new ArrayList();
        this.s = new nqw(this, 18);
        this.t = new nqw(this, 19);
        this.u = new jzs(this, 3);
        this.v = new jzt(this, 9);
        this.l = -1;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = new StringBuilder(20);
        this.q = context.getResources();
        olm.a();
        new oll(context, new jzv(this, 6));
    }

    private final ToneGenerator h() {
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
        int i2;
        if (nrd.a().f()) {
            Iterator it = this.p.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i2 = R.dimen.dialpad_disabled_alpha;
                if (!zHasNext) {
                    break;
                }
                View view = (View) it.next();
                view.setEnabled(z);
                view.setFocusable(z);
                if (true == z) {
                    i2 = R.dimen.dialpad_enabled_alpha;
                }
                TypedValue typedValue = new TypedValue();
                this.q.getValue(i2, typedValue, true);
                view.setAlpha(typedValue.getFloat());
            }
            this.o.setVisibility(true != z ? 0 : 8);
            boolean z2 = z || this.e.length() > 0;
            this.n.setEnabled(z2);
            this.n.setFocusable(z2);
            if (true == z2) {
                i2 = R.dimen.dialpad_enabled_alpha;
            }
            TypedValue typedValue2 = new TypedValue();
            this.q.getValue(i2, typedValue2, true);
            this.n.setAlpha(typedValue2.getFloat());
            this.k.setAlpha(typedValue2.getFloat());
        }
    }

    public final void b(char c) {
        if (this.e.length() >= 20) {
            return;
        }
        this.e.append(c);
        e();
    }

    public final void c(View view, oeb oebVar) {
        ype ypeVar = (ype) a.l().ai(5596);
        char c = oebVar.a;
        ypeVar.v("onDialpadDown %c", c);
        view.setPressed(true);
        if (this.l == -1) {
            ebf.A().r(c);
            int i2 = oebVar.b;
            this.l = i2;
            if (this.c.requestAudioFocus(null, 3, 3) == 1) {
                this.j.removeCallbacks(this.s);
                h().startTone(i2);
            }
        }
        if (h.a == c || i.a == c) {
            this.f = view;
            this.j.postDelayed(this.t, g);
        }
    }

    public final void d() {
        if (this.l == -1) {
            return;
        }
        ebf.A().v();
        this.l = -1;
        h().stopTone();
        this.j.postDelayed(this.s, 250L);
    }

    public final void e() {
        this.k.setText(odn.a().r(getContext(), this.e.toString()));
        int length = this.e.length();
        View view = this.m;
        if (length > 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
            a(lbh.c().q());
        }
    }

    public final boolean f(View view, oeb oebVar) {
        ((ype) a.l().ai(5597)).v("onDialpadUp %c", oebVar.a);
        return g(view);
    }

    @ResultIgnorabilityUnspecified
    public final boolean g(View view) {
        this.j.removeCallbacks(this.t);
        boolean zIsPressed = view.isPressed();
        view.setPressed(false);
        d();
        return zIsPressed;
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
        this.n = imageButton;
        TextView textView = (TextView) findViewById(R.id.number);
        textView.getClass();
        this.k = textView;
        View viewFindViewById = findViewById(R.id.delete);
        viewFindViewById.getClass();
        this.m = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.standard_keypad_locked_overlay);
        viewFindViewById2.getClass();
        this.o = viewFindViewById2;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            View viewFindViewById3 = findViewById(iKeyAt);
            viewFindViewById3.getClass();
            this.p.add(viewFindViewById3);
            int i3 = 2;
            if (iKeyAt == R.id.zero) {
                viewFindViewById3.setOnLongClickListener(new jzr(this, 7));
            } else if (iKeyAt == R.id.one) {
                odj odjVarA = ebf.A();
                if (odjVarA.A()) {
                    viewFindViewById3.setOnLongClickListener(new jzx((Object) this, (Object) odjVarA, i3));
                } else {
                    ((ImageButton) viewFindViewById3).setImageDrawable(getResources().getDrawable(true != jri.a() ? R.drawable.dialpad_1_no_voicemail_in_call_deprecated : R.drawable.gearhead_dialpad_1_no_voicemail_in_call));
                }
                iKeyAt = R.id.one;
            }
            viewFindViewById3.setOnClickListener(new jzy(this, iKeyAt, i3));
            viewFindViewById3.setOnTouchListener(this.v);
            viewFindViewById3.setOnKeyListener(this.u);
            i2++;
        }
        this.m.setOnClickListener(new nmp(this, 12));
        this.m.setOnLongClickListener(new jzr(this, 8));
        this.k.setHint(R.string.dial_a_number);
        e();
        if (this.r == null) {
            oxc oxcVar = new oxc(getContext());
            this.r = oxcVar;
            oxcVar.b(getContext().getResources().getColor(R.color.gearhead_sdk_call_answer));
        }
        this.n.setBackground(this.r);
        this.n.setImageResource(R.drawable.ic_call);
        this.n.setOnClickListener(new nmp(this, 13));
    }
}

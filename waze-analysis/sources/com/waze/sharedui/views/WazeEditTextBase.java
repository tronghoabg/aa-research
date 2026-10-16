package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.waze.reports.cx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeEditTextBase extends EditText {

    /* renamed from: h, reason: collision with root package name */
    private static com.waze.view.popups.b.b f39153h;

    /* renamed from: a, reason: collision with root package name */
    int f39154a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39155b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f39156c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f39157d;

    /* renamed from: e, reason: collision with root package name */
    private int f39158e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39159f;

    /* renamed from: g, reason: collision with root package name */
    private cx f39160g;

    public WazeEditTextBase(Context context) {
        super(context);
        this.f39154a = 0;
        this.f39156c = new Handler();
        this.f39157d = new aa(this, 1, null);
        this.f39160g = null;
        this.f39159f = (getImeOptions() & 268435456) != 268435456;
        i();
        f(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if ((this.f39158e == 2 && this.f39159f) || f39153h == null) {
            return;
        }
        com.waze.view.popups.b.b.e();
    }

    public static void k(com.waze.view.popups.b.b bVar) {
        f39153h = bVar;
    }

    protected final void f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39068f);
            this.f39154a = typedArrayObtainStyledAttributes.getInteger(3, 1);
            i();
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f39158e = context.getResources().getConfiguration().orientation;
        addTextChangedListener(new ah(this, 1));
        post(new aa(this, 0));
    }

    public final void g(cx cxVar) {
        this.f39160g = cxVar;
    }

    protected final void i() {
        int i2;
        if (getTypeface() != null) {
            boolean zIsBold = getTypeface().isBold();
            getTypeface().isItalic();
            i2 = zIsBold;
        } else {
            i2 = 0;
        }
        Typeface typeface = getTypeface();
        if (!isInEditMode()) {
            typeface = WazeTextView.d(getContext(), this.f39154a);
        }
        setTypeface(typeface, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f39158e = configuration.orientation;
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i2) {
        super.onEditorAction(i2);
        if ((i2 == 6 || i2 == 4) && f39153h != null) {
            com.waze.view.popups.b.b.d();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (f39153h != null) {
            if (z) {
                a();
            } else {
                com.waze.view.popups.b.b.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (f39153h != null) {
                com.waze.view.popups.b.b.d();
            }
            if (this.f39160g != null && keyEvent.getAction() == 0) {
                this.f39160g.a();
                return true;
            }
            i2 = 4;
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39155b = false;
            this.f39156c.postDelayed(this.f39157d, ViewConfiguration.getLongPressTimeout());
        } else if (motionEvent.getAction() == 1) {
            this.f39156c.removeCallbacks(this.f39157d);
            if (!this.f39155b && f39153h != null && isFocused()) {
                a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setInputType(int i2) {
        super.setInputType(i2);
        getContext();
        i();
    }

    public WazeEditTextBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39154a = 0;
        this.f39156c = new Handler();
        this.f39157d = new aa(this, 1, null);
        this.f39160g = null;
        this.f39159f = (getImeOptions() & 268435456) != 268435456;
        f(context, attributeSet);
    }

    public WazeEditTextBase(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39154a = 0;
        this.f39156c = new Handler();
        this.f39157d = new aa(this, 1, null);
        this.f39160g = null;
        this.f39159f = (getImeOptions() & 268435456) != 268435456;
        f(context, attributeSet);
    }
}

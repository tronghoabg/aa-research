package com.waze.view.text;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.widget.w;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.waze.car_lib.be;
import com.waze.view.navbar.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class InstantAutoComplete extends w {

    /* renamed from: g, reason: collision with root package name */
    private static com.waze.view.popups.b.b f45366g;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f45367a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f45368b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45369c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45370d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45371e;

    /* renamed from: f, reason: collision with root package name */
    private int f45372f;

    public InstantAutoComplete(Context context) {
        super(context, null);
        this.f45367a = new Handler();
        this.f45368b = new a(this);
        this.f45369c = (getImeOptions() & 268435456) != 268435456;
        this.f45371e = false;
        e();
    }

    public static void d(com.waze.view.popups.b.b bVar) {
        f45366g = bVar;
    }

    private final void e() {
        this.f45372f = getResources().getConfiguration().orientation;
    }

    private final void f() {
        if ((this.f45372f == 2 && this.f45369c) || f45366g == null) {
            return;
        }
        com.waze.view.popups.b.b.e();
    }

    public final void a() {
        if (getAdapter() != null) {
            performFiltering(getText(), 0);
        }
    }

    public final void b() {
        setCursorVisible(false);
        postDelayed(new be(this, 14), 350L);
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f45372f = configuration.orientation;
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i2) {
        super.onEditorAction(i2);
        if (i2 != 6 || f45366g == null) {
            return;
        }
        com.waze.view.popups.b.b.d();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.f45370d || f45366g == null) {
            if (!z || getAdapter() == null) {
                return;
            }
            a();
            return;
        }
        if (!z) {
            com.waze.view.popups.b.b.d();
        } else if (p.t()) {
            a();
        } else {
            f();
            b();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (f45366g != null) {
                if ((getImeOptions() & 268435456) != 268435456) {
                    setFocusable(false);
                    setFocusableInTouchMode(false);
                    setFocusable(true);
                    setFocusableInTouchMode(true);
                    this.f45370d = true;
                    requestFocus();
                    this.f45370d = false;
                }
                com.waze.view.popups.b.b.d();
            }
            i2 = 4;
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f45371e = false;
            this.f45367a.postDelayed(this.f45368b, ViewConfiguration.getLongPressTimeout());
        } else if (motionEvent.getAction() == 1) {
            this.f45367a.removeCallbacks(this.f45368b);
            if (!this.f45371e && f45366g != null && !p.t()) {
                f();
                b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public InstantAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45367a = new Handler();
        this.f45368b = new a(this);
        this.f45369c = (getImeOptions() & 268435456) != 268435456;
        this.f45371e = false;
        e();
    }

    public InstantAutoComplete(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45367a = new Handler();
        this.f45368b = new a(this);
        this.f45369c = (getImeOptions() & 268435456) != 268435456;
        this.f45371e = false;
        e();
    }
}

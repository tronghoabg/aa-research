package com.google.android.apps.auto.components.ui.media;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.ebf;
import defpackage.krj;
import defpackage.leh;
import defpackage.mlq;
import defpackage.obt;
import defpackage.oez;
import defpackage.omy;
import defpackage.rrc;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class SeekableLinearProgressIndicator extends FrameLayout {
    public static final yph a = yph.c("GH.SeekProgInd");
    ImageView b;
    public LinearProgressIndicator c;
    public View d;
    public int e;
    public int f;
    public ajmd g;
    public ajmd h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private final View.OnLayoutChangeListener n;
    private final View.OnFocusChangeListener o;
    private final View.OnGenericMotionListener p;
    private final Runnable q;

    public SeekableLinearProgressIndicator(Context context) {
        super(context);
        this.n = new obt(this, 2);
        this.o = new krj((View) this, 6);
        this.p = new omy(this, 0);
        this.q = new oez(this, 6);
    }

    private final double g(MotionEvent motionEvent) {
        getLocationOnScreen(new int[2]);
        int iRound = Math.round(motionEvent.getRawX() - r0[0]);
        int iRound2 = Math.round(motionEvent.getRawY() - r0[1]);
        if (iRound2 >= getHeight() || iRound2 < 0 || iRound >= getWidth() || iRound < 0) {
            return -1.0d;
        }
        if (iRound < getPaddingLeft() + (getWidth() * 0.02f)) {
            return 0.0d;
        }
        if (iRound > getWidth() - getPaddingRight()) {
            return 1.0d;
        }
        return (iRound - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    private final void h() {
        this.f = 1;
        removeCallbacks(this.q);
    }

    private final void i(MotionEvent motionEvent) {
        double dG = g(motionEvent);
        if (dG >= 0.0d) {
            c((int) Math.round((this.c.getMax() - this.c.getMin()) * dG));
        }
    }

    private final void j(float f) {
        this.d.getLocationOnScreen(new int[2]);
        int iRound = Math.round(f - r0[0]);
        this.d.getForeground().setHotspotBounds(iRound, 0, iRound, this.d.getHeight());
    }

    private final void k(int i) {
        this.c.j(i);
        this.b.setColorFilter(i);
    }

    public final float a() {
        int max = this.c.getMax() - this.c.getMin();
        return max > 0 ? (this.c.getProgress() - r0) / max : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r2
  0x002a: PHI (r2v7 double) = (r2v1 double), (r2v2 double) binds: [B:12:0x0028, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r5) {
        /*
            r4 = this;
            ajmd r0 = r4.h
            if (r0 == 0) goto L54
            com.google.android.material.progressindicator.LinearProgressIndicator r0 = r4.c
            boolean r0 = r0.isIndeterminate()
            if (r0 == 0) goto Ld
            goto L54
        Ld:
            r0 = 3
            r4.f = r0
            r0 = 1
            if (r0 == r5) goto L17
            r5 = -1130113270(0xffffffffbca3d70a, float:-0.02)
            goto L1a
        L17:
            r5 = 1017370378(0x3ca3d70a, float:0.02)
        L1a:
            float r0 = r4.a()
            double r0 = (double) r0
            double r2 = (double) r5
            double r0 = r0 + r2
            r2 = 4607002274986721280(0x3fef5c2900000000, double:0.9800000190734863)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2c
        L2a:
            r0 = r2
            goto L33
        L2c:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L33
            goto L2a
        L33:
            com.google.android.material.progressindicator.LinearProgressIndicator r5 = r4.c
            int r5 = r5.getMax()
            com.google.android.material.progressindicator.LinearProgressIndicator r2 = r4.c
            int r2 = r2.getMin()
            int r5 = r5 - r2
            double r2 = (double) r5
            double r2 = r2 * r0
            long r0 = java.lang.Math.round(r2)
            int r5 = (int) r0
            r4.c(r5)
            java.lang.Runnable r5 = r4.q
            r4.removeCallbacks(r5)
            r0 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r5, r0)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator.b(boolean):void");
    }

    public final void c(int i) {
        this.c.setProgress(i);
        e();
    }

    public final void d(boolean z) {
        if (z) {
            this.f = 2;
            k(this.m);
            return;
        }
        int i = this.f;
        if (i == 4 || i == 3) {
            h();
            this.q.run();
        }
        this.f = 1;
        k(this.l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.d.isFocused()) {
            if (keyCode != 23) {
                if (keyCode == 66) {
                    keyCode = 66;
                }
            }
            this.d.getForeground().setHotspotBounds(0, 0, this.d.getWidth(), this.d.getHeight());
            if (keyEvent.getAction() == 0) {
                onKeyDown(keyCode, keyEvent);
            } else if (keyEvent.getAction() == 1) {
                d(!mlq.J(this.f));
                onKeyUp(keyCode, keyEvent);
            }
            return true;
        }
        if (!mlq.J(this.f) || keyEvent.getSource() != 1048584) {
            return false;
        }
        if (keyCode != 22 && keyCode != 21) {
            return false;
        }
        b(keyCode == 22);
        return true;
    }

    public final void e() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int width2 = this.b.getWidth();
        if (width == 0 || width2 == 0) {
            return;
        }
        float fA = a() * (width - width2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (layoutParams != null) {
            int i = (int) (fA + 0.5f);
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = width2 + i;
            this.b.setLayoutParams(layoutParams);
        }
    }

    public final void f() {
        if (!this.i || this.c.isIndeterminate()) {
            this.b.setVisibility(4);
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // android.view.View
    public final boolean isClickable() {
        return this.j;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.i;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearProgressIndicator) findViewById(R.id.progress_indicator);
        this.g = new ajmd(this, null);
        this.l = this.c.h()[0];
        this.m = getContext().getColor(R.color.gearhead_focus_blue);
        leh.a();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.gearheadFocusAccentColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.m = color;
        this.b = (ImageView) findViewById(R.id.indicator_thumb);
        f();
        addOnLayoutChangeListener(this.n);
        View viewFindViewById = findViewById(R.id.focus_layer);
        this.d = viewFindViewById;
        viewFindViewById.setOnFocusChangeListener(this.o);
        this.d.setOnGenericMotionListener(this.p);
        this.f = 1;
        this.e = 1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.i || !this.j) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = 2;
            this.k = this.c.getProgress();
            j(-motionEvent.getRawX());
            i(motionEvent);
        } else if (action == 1) {
            if (this.e != 1) {
                j(motionEvent.getRawX());
                double dG = g(motionEvent);
                if (dG < 0.0d) {
                    c(this.k);
                } else if (this.h != null) {
                    h();
                    this.h.l(dG);
                    if (this.e == 3) {
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gY).l());
                    }
                }
            }
            this.e = 1;
        } else if (action == 2) {
            int i = this.e;
            if (i == 2) {
                this.e = 3;
            } else if (i == 3) {
            }
            i(motionEvent);
        } else {
            if (action != 3) {
                motionEvent.getAction();
                return false;
            }
            c(this.k);
            this.e = 1;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        if (!z || this.i) {
            this.j = z;
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        setClickable(z);
        this.d.setFocusable(z);
        if (!this.i) {
            if (this.e != 1) {
                c(this.k);
            }
            this.e = 1;
            h();
        }
        f();
    }

    public SeekableLinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new obt(this, 2);
        this.o = new krj((View) this, 6);
        this.p = new omy(this, 0);
        this.q = new oez(this, 6);
    }

    public SeekableLinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new obt(this, 2);
        this.o = new krj((View) this, 6);
        this.p = new omy(this, 0);
        this.q = new oez(this, 6);
    }

    public SeekableLinearProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = new obt(this, 2);
        this.o = new krj((View) this, 6);
        this.p = new omy(this, 0);
        this.q = new oez(this, 6);
    }
}

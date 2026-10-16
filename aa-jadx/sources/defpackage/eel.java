package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eel implements android.view.View.OnTouchListener {
    private static final int g = android.view.ViewConfiguration.getTapTimeout();
    public final defpackage.eek a;
    public final android.view.View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final android.widget.ListView f;
    private final android.view.animation.Interpolator h;
    private java.lang.Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    public eel(android.widget.ListView listView) {
        defpackage.eek eekVar = new defpackage.eek();
        this.a = eekVar;
        this.h = new android.view.animation.AccelerateInterpolator();
        float[] fArr = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED};
        this.m = fArr3;
        float[] fArr4 = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED};
        this.n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.o = fArr5;
        this.b = listView;
        android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density * 1575.0f;
        float f2 = displayMetrics.density * 315.0f;
        float f3 = ((int) (f + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.l = g;
        eekVar.a = 500;
        eekVar.b = 500;
        this.f = listView;
    }

    static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    private final float d(int i, float f, float f2, float f3) {
        float fA;
        float interpolation;
        float fA2 = a(this.j[i] * f2, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.k[i]);
        float fE = e(f2 - f, fA2) - e(f, fA2);
        if (fE >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            if (fE > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                interpolation = this.h.getInterpolation(fE);
            } else {
                fA = 0.0f;
            }
            if (fA == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = this.m[i];
            float f5 = this.n[i];
            float f6 = this.o[i];
            float f7 = f4 * f3;
            return fA > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? a(fA * f7, f5, f6) : -a((-fA) * f7, f5, f6);
        }
        interpolation = -this.h.getInterpolation(-fE);
        fA = a(interpolation, -1.0f, 1.0f);
        if (fA == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        float f8 = this.m[i];
        float f9 = this.n[i];
        float f10 = this.o[i];
        float f11 = f8 * f3;
        if (fA > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
        }
    }

    private final float e(float f, float f2) {
        if (f2 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f < f2) {
            if (f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return 1.0f - (f / f2);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    private final void f() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        defpackage.eek eekVar = this.a;
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - eekVar.e);
        int i3 = eekVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        eekVar.i = i;
        eekVar.h = eekVar.a(jCurrentAnimationTimeMillis);
        eekVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean b() {
        android.widget.ListView listView;
        int count;
        defpackage.eek eekVar = this.a;
        float f = eekVar.d;
        float fAbs = f / java.lang.Math.abs(f);
        float f2 = eekVar.c;
        int i = (int) fAbs;
        if (i != 0 && (count = (listView = this.f).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (i > 0) {
                if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (i < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z) {
        if (this.q && !z) {
            f();
        }
        this.q = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i;
        if (this.q) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.d = true;
                this.p = false;
            } else if (actionMasked == 1) {
                f();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    f();
                }
            }
            float x = motionEvent.getX();
            float width = view.getWidth();
            android.view.View view2 = this.b;
            float fD = d(0, x, width, view2.getWidth());
            float fD2 = d(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
            defpackage.eek eekVar = this.a;
            eekVar.c = fD;
            eekVar.d = fD2;
            if (!this.e && b()) {
                if (this.i == null) {
                    this.i = new defpackage.eaw(this, 3, null);
                }
                this.e = true;
                this.c = true;
                if (this.p || (i = this.l) <= 0) {
                    this.i.run();
                } else {
                    java.lang.Runnable runnable = this.i;
                    int[] iArr = defpackage.ebt.a;
                    view2.postOnAnimationDelayed(runnable, i);
                }
                this.p = true;
            }
        }
        return false;
    }
}

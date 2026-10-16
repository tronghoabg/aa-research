package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wte extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final android.util.Property a = new defpackage.wtd(java.lang.Float.class);
    private android.animation.ValueAnimator b;
    private android.animation.ValueAnimator c;
    private float e;
    final android.content.Context i;
    final defpackage.wsm j;
    public java.util.List k;
    public boolean l;
    public int n;
    private final float d = -1.0f;
    final android.graphics.Paint m = new android.graphics.Paint();
    final android.graphics.Rect o = new android.graphics.Rect();
    final defpackage.wpu p = new defpackage.wpu();

    public wte(android.content.Context context, defpackage.wsm wsmVar) {
        this.i = context;
        this.j = wsmVar;
        setAlpha(255);
    }

    private final void a(android.animation.ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        valueAnimatorArr[0].end();
        this.l = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        if (this.b == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wte, java.lang.Float>) a, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.b = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.b.setInterpolator(defpackage.wlm.b);
            android.animation.ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new java.lang.IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator;
            valueAnimator.addListener(new defpackage.wtb(this));
        }
        if (this.c == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wte, java.lang.Float>) a, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            this.c = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.c.setInterpolator(defpackage.wlm.b);
            android.animation.ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new java.lang.IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator2;
            valueAnimator2.addListener(new defpackage.wtc(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        android.animation.ValueAnimator valueAnimator3 = z ? this.b : this.c;
        android.animation.ValueAnimator valueAnimator4 = z ? this.c : this.b;
        if (!z3) {
            if (valueAnimator4.isRunning()) {
                boolean z4 = this.l;
                this.l = true;
                valueAnimator4.cancel();
                this.l = z4;
            }
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                a(valueAnimator3);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator3.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        defpackage.wsm wsmVar = this.j;
        if (!(z ? wsmVar.e() : wsmVar.d())) {
            a(valueAnimator3);
            return z5;
        }
        if (z2 || !valueAnimator3.isPaused()) {
            valueAnimator3.start();
            return z5;
        }
        valueAnimator3.resume();
        return z5;
    }

    final float f() {
        defpackage.wsm wsmVar = this.j;
        if (wsmVar.e() || wsmVar.d()) {
            return this.e;
        }
        return 1.0f;
    }

    final float g() {
        int i;
        float f = this.d;
        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return f;
        }
        defpackage.wsm wsmVar = this.j;
        boolean z = this instanceof defpackage.wta;
        if (wsmVar.c(z) && (i = wsmVar.m) != 0) {
            float fJ = defpackage.wpu.j(this.i.getContentResolver());
            if (fJ > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                int i2 = (int) ((((z ? wsmVar.j : wsmVar.k) * 1000.0f) / i) * fJ);
                float fUptimeMillis = (android.os.SystemClock.uptimeMillis() % ((long) i2)) / i2;
                return fUptimeMillis < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(defpackage.fhn fhnVar) {
        if (this.k == null) {
            this.k = new java.util.ArrayList();
        }
        if (this.k.contains(fhnVar)) {
            return;
        }
        this.k.add(fhnVar);
    }

    final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k() || j();
    }

    public final boolean j() {
        android.animation.ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean k() {
        android.animation.ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float fJ = defpackage.wpu.j(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && fJ > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n(defpackage.fhn fhnVar) {
        java.util.List list = this.k;
        if (list == null || !list.contains(fhnVar)) {
            return;
        }
        this.k.remove(fhnVar);
        if (this.k.isEmpty()) {
            this.k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}

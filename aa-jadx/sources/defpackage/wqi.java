package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wqi {
    static final android.animation.TimeInterpolator a = defpackage.wlm.c;
    public static final int b = com.google.android.projection.gearhead.R.attr.motionDurationLong2;
    public static final int c = com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = com.google.android.projection.gearhead.R.attr.motionDurationMedium1;
    public static final int e = com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public final com.google.android.material.floatingactionbutton.FloatingActionButton B;
    final defpackage.xei C;
    private android.animation.StateListAnimator D;
    public defpackage.wvi l;
    public defpackage.wvd m;
    public android.graphics.drawable.Drawable n;
    public defpackage.wpy o;
    public android.graphics.drawable.Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public android.animation.Animator v;
    public defpackage.wlp w;
    public defpackage.wlp x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final android.graphics.Rect E = new android.graphics.Rect();
    private final android.graphics.RectF F = new android.graphics.RectF();
    private final android.graphics.RectF G = new android.graphics.RectF();
    private final android.graphics.Matrix H = new android.graphics.Matrix();

    public wqi(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, defpackage.xei xeiVar) {
        this.B = floatingActionButton;
        this.C = xeiVar;
    }

    private final android.animation.Animator m(float f2, float f3) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        animatorSet.play(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L)).with(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final int a() {
        if (this.q) {
            return java.lang.Math.max((this.u - this.B.b()) / 2, 0);
        }
        return 0;
    }

    public final android.animation.AnimatorSet b(defpackage.wlp wlpVar, float f2, float f3, float f4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Property property = android.view.View.ALPHA;
        float[] fArr = {f2};
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) property, fArr);
        wlpVar.b("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_X, f3);
        wlpVar.b("scale").b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_Y, f3);
        wlpVar.b("scale").b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        android.graphics.Matrix matrix = this.H;
        d(f4, matrix);
        android.animation.ObjectAnimator objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(floatingActionButton, new defpackage.wln(), new defpackage.wqg(this), new android.graphics.Matrix(matrix));
        wlpVar.b("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        defpackage.wpu.n(animatorSet, arrayList);
        return animatorSet;
    }

    public final android.animation.AnimatorSet c(final float f2, final float f3, final float f4, int i2, int i3) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f5 = this.y;
        final android.graphics.Matrix matrix = new android.graphics.Matrix(this.H);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: wqd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                float fA = defpackage.wlm.a(alpha, f2, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue);
                defpackage.wqi wqiVar = this.a;
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton2 = wqiVar.B;
                floatingActionButton2.setAlpha(fA);
                float f6 = f3;
                float f7 = scaleX;
                floatingActionButton2.setScaleX(f7 + ((f6 - f7) * fFloatValue));
                float f8 = scaleY;
                floatingActionButton2.setScaleY(f8 + ((f6 - f8) * fFloatValue));
                float f9 = f4;
                float f10 = f5;
                float f11 = f10 + (fFloatValue * (f9 - f10));
                wqiVar.y = f11;
                android.graphics.Matrix matrix2 = matrix;
                wqiVar.d(f11, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        defpackage.wpu.n(animatorSet, arrayList);
        animatorSet.setDuration(defpackage.sqs.bm(floatingActionButton.getContext(), i2, floatingActionButton.getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(defpackage.wqn.c(floatingActionButton.getContext(), i3, defpackage.wlm.b));
        return animatorSet;
    }

    public final void d(float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        android.graphics.drawable.Drawable drawable = this.B.getDrawable();
        if (drawable == null || this.z == 0) {
            return;
        }
        android.graphics.RectF rectF = this.F;
        android.graphics.RectF rectF2 = this.G;
        rectF.set(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f3, f3);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(float f2, float f3, float f4) {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        if (floatingActionButton.getStateListAnimator() == this.D) {
            android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
            stateListAnimator.addState(f, m(f2, f4));
            stateListAnimator.addState(g, m(f2, f3));
            stateListAnimator.addState(h, m(f2, f3));
            stateListAnimator.addState(i, m(f2, f3));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Z, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(100L));
            animatorSet.playSequentially((android.animation.Animator[]) arrayList.toArray(new android.animation.Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, m(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
            this.D = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (k()) {
            i();
        }
    }

    public final void f(float f2) {
        this.y = f2;
        android.graphics.Matrix matrix = this.H;
        d(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void g(defpackage.wvi wviVar) {
        this.l = wviVar;
        defpackage.wvd wvdVar = this.m;
        if (wvdVar != null) {
            wvdVar.d(wviVar);
        }
        defpackage.wpy wpyVar = this.o;
        if (wpyVar != null) {
            wpyVar.h = wviVar;
            wpyVar.invalidateSelf();
        }
    }

    public final void h() {
        f(this.y);
    }

    public final void i() {
        android.graphics.Rect rect = this.E;
        defpackage.xei xeiVar = this.C;
        if (xeiVar.h()) {
            int iA = a();
            float elevation = this.B.getElevation() + this.t;
            int iMax = java.lang.Math.max(iA, (int) java.lang.Math.ceil(elevation));
            int iMax2 = java.lang.Math.max(iA, (int) java.lang.Math.ceil(elevation * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
        } else if (j()) {
            int iB = (this.u - this.B.b()) / 2;
            rect.set(iB, iB, iB, iB);
        } else {
            rect.set(0, 0, 0, 0);
        }
        defpackage.ebl.r(this.p, "Didn't initialize content background");
        if (k()) {
            xeiVar.g(new android.graphics.drawable.InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            xeiVar.g(this.p);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) xeiVar.a;
        floatingActionButton.c.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    final boolean j() {
        return this.q && this.B.b() < this.u;
    }

    final boolean k() {
        return this.C.h() || j();
    }

    public final boolean l() {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        return floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
    }
}

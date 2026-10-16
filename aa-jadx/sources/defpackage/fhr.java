package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fhr extends defpackage.fhs implements android.graphics.drawable.Animatable {
    public final defpackage.fhp a;
    public android.animation.Animator.AnimatorListener b;
    public java.util.ArrayList c;
    final android.graphics.drawable.Drawable.Callback d;
    private final android.content.Context f;

    public fhr(android.content.Context context) {
        this.b = null;
        this.c = null;
        this.d = new defpackage.ijr(this, 1);
        this.f = context;
        this.a = new defpackage.fhp();
    }

    public static defpackage.fhr a(android.content.Context context, int i) {
        defpackage.fhr fhrVar = new defpackage.fhr(context);
        android.content.res.Resources resources = context.getResources();
        android.content.res.Resources.Theme theme = context.getTheme();
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i, theme);
        drawable.setCallback(fhrVar.d);
        new defpackage.fhq(drawable.getConstantState());
        fhrVar.e = drawable;
        return fhrVar;
    }

    @Override // defpackage.fhs, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        defpackage.fhp fhpVar = this.a;
        fhpVar.b.draw(canvas);
        if (fhpVar.c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.a.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.a.a;
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.a.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return new defpackage.fhq(drawable.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.a.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.a.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getOpacity() : this.a.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    android.content.res.TypedArray typedArrayO = defpackage.dmh.o(resources, theme, attributeSet, defpackage.fhl.e);
                    int resourceId = typedArrayO.getResourceId(0, 0);
                    if (resourceId != 0) {
                        defpackage.fia fiaVarB = defpackage.fia.b(resources, resourceId, theme);
                        fiaVarB.c = false;
                        fiaVarB.setCallback(this.d);
                        defpackage.fhp fhpVar = this.a;
                        defpackage.fia fiaVar = fhpVar.b;
                        if (fiaVar != null) {
                            fiaVar.setCallback(null);
                        }
                        fhpVar.b = fiaVarB;
                    }
                    typedArrayO.recycle();
                } else if ("target".equals(name)) {
                    android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, defpackage.fhl.f);
                    java.lang.String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                        android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, resourceId2);
                        defpackage.fhp fhpVar2 = this.a;
                        animatorLoadAnimator.setTarget(fhpVar2.b.b.b.l.get(string));
                        if (fhpVar2.d == null) {
                            fhpVar2.d = new java.util.ArrayList();
                            fhpVar2.e = new defpackage.zd();
                        }
                        fhpVar2.d.add(animatorLoadAnimator);
                        fhpVar2.e.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        defpackage.fhp fhpVar3 = this.a;
        if (fhpVar3.c == null) {
            fhpVar3.c = new android.animation.AnimatorSet();
        }
        fhpVar3.c.playTogether(fhpVar3.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.a.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? ((android.graphics.drawable.AnimatedVectorDrawable) drawable).isRunning() : this.a.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isStateful() : this.a.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // defpackage.fhs, android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.a.b.setBounds(rect);
        }
    }

    @Override // defpackage.fhs, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setLevel(i) : this.a.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setState(iArr) : this.a.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.a.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.a.b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.a.b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.a.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.a.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.a.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.a.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).start();
            return;
        }
        defpackage.fhp fhpVar = this.a;
        if (fhpVar.c.isStarted()) {
            return;
        }
        fhpVar.c.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).stop();
        } else {
            this.a.c.end();
        }
    }

    public fhr() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

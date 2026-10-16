package u3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4242d extends AbstractC4245g implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f46578g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f46580c;

    /* renamed from: d, reason: collision with root package name */
    public D9.o f46581d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f46582e = null;

    /* renamed from: f, reason: collision with root package name */
    public final l.f f46583f = new l.f(this, 2);

    /* renamed from: b, reason: collision with root package name */
    public final C4241c f46579b = new C4241c();

    public C4242d(Context context) {
        this.f46580c = context;
    }

    @Override // u3.AbstractC4245g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C4241c c4241c = this.f46579b;
        c4241c.f46574a.draw(canvas);
        if (c4241c.f46575b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getAlpha() : this.f46579b.f46574a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f46579b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getColorFilter() : this.f46579b.f46574a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f46586a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new P4.b(this.f46586a.getConstantState(), 1);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f46579b.f46574a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f46579b.f46574a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getOpacity() : this.f46579b.f46574a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (r8.f46575b != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r8.f46575b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        r8.f46575b.playTogether(r8.f46576c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C4242d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.isAutoMirrored() : this.f46579b.f46574a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f46586a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f46579b.f46575b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.isStateful() : this.f46579b.f46574a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f46579b.f46574a.setBounds(rect);
        }
    }

    @Override // u3.AbstractC4245g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.setLevel(i5) : this.f46579b.f46574a.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.setState(iArr) : this.f46579b.f46574a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else {
            this.f46579b.f46574a.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f46579b.f46574a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f46579b.f46574a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            Fe.b.Q(drawable, i5);
        } else {
            this.f46579b.f46574a.setTint(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f46579b.f46574a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f46579b.f46574a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.setVisible(z2, z10);
        }
        this.f46579b.f46574a.setVisible(z2, z10);
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C4241c c4241c = this.f46579b;
        if (c4241c.f46575b.isStarted()) {
            return;
        }
        c4241c.f46575b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f46579b.f46575b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

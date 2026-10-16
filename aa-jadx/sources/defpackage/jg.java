package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jg extends android.widget.ImageView {
    private final defpackage.ix a;
    private boolean b;
    private final defpackage.imz c;

    public jg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        defpackage.ne.d(this, getContext());
        defpackage.ix ixVar = new defpackage.ix(this);
        this.a = ixVar;
        ixVar.b(attributeSet, i);
        defpackage.imz imzVar = new defpackage.imz(this);
        this.c = imzVar;
        imzVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.a();
        }
        defpackage.imz imzVar = this.c;
        if (imzVar != null) {
            imzVar.c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.g() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        defpackage.imz imzVar = this.c;
        if (imzVar != null) {
            imzVar.c();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.imz imzVar = this.c;
        if (imzVar != null && drawable != null && !this.b) {
            imzVar.e(drawable);
        }
        super.setImageDrawable(drawable);
        if (imzVar != null) {
            imzVar.c();
            if (this.b) {
                return;
            }
            imzVar.b();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        defpackage.imz imzVar = this.c;
        if (imzVar != null) {
            imzVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        defpackage.imz imzVar = this.c;
        if (imzVar != null) {
            imzVar.c();
        }
    }

    public jg(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jg(android.content.Context context) {
        this(context, null);
    }
}

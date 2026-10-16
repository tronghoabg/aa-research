package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class fhs extends Drawable.ConstantState {
    int a;
    fhr b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public fhs(fhs fhsVar) {
        this.c = null;
        this.d = fhu.a;
        if (fhsVar != null) {
            this.a = fhsVar.a;
            this.b = new fhr(fhsVar.b);
            Paint paint = fhsVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = fhsVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = fhsVar.c;
            this.d = fhsVar.d;
            this.e = fhsVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        fhr fhrVar = this.b;
        fhrVar.a(fhrVar.d, fhr.a, canvas, i, i2);
    }

    public final boolean b() {
        fhr fhrVar = this.b;
        if (fhrVar.k == null) {
            fhrVar.k = Boolean.valueOf(fhrVar.d.b());
        }
        return fhrVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new fhu(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new fhu(this);
    }

    public fhs() {
        this.c = null;
        this.d = fhu.a;
        this.b = new fhr();
    }
}

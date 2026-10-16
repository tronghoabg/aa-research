package u3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f46625a;

    /* renamed from: b, reason: collision with root package name */
    public m f46626b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f46627c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f46628d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46629e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f46630f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f46631g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f46632h;

    /* renamed from: i, reason: collision with root package name */
    public int f46633i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f46634j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f46635l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f46625a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}

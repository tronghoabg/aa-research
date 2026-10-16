package M;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class A extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7140a;

    /* renamed from: b, reason: collision with root package name */
    public C2465q f7141b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7142c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7143d;

    public A(boolean z2) {
        super(ColorStateList.valueOf(-16777216), null, z2 ? new ColorDrawable(-1) : null);
        this.f7140a = z2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f7140a) {
            this.f7143d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        AbstractC3340k.d(dirtyBounds, "super.getDirtyBounds()");
        this.f7143d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f7143d;
    }
}

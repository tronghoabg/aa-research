package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ci extends android.support.v7.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1238a;

    ci(Drawable drawable) {
        super(drawable);
        this.f1238a = true;
    }

    final void a(boolean z) {
        this.f1238a = z;
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1238a) {
            super.draw(canvas);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        if (this.f1238a) {
            super.setHotspot(f2, f3);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f1238a) {
            super.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f1238a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f1238a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}

package Z3;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f16968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16969b;

    public f(BitmapDrawable bitmapDrawable, boolean z2) {
        this.f16968a = bitmapDrawable;
        this.f16969b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16968a.equals(fVar.f16968a) && this.f16969b == fVar.f16969b;
    }

    public final int hashCode() {
        return (this.f16968a.hashCode() * 31) + (this.f16969b ? 1231 : 1237);
    }
}

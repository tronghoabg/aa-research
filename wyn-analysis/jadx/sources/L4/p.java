package L4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class p implements B4.k {

    /* renamed from: b, reason: collision with root package name */
    public final K4.a f6919b;

    public p(K4.a aVar) {
        this.f6919b = aVar;
    }

    @Override // B4.k
    public final E4.B a(Context context, E4.B b5, int i5, int i10) {
        F4.a aVar = com.bumptech.glide.b.b(context).f24210a;
        Drawable drawable = (Drawable) b5.get();
        c cVarA = o.a(aVar, drawable, i5, i10);
        if (cVarA == null) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        this.f6919b.getClass();
        if (!cVarA.equals(cVarA)) {
            return new c(context.getResources(), cVarA);
        }
        cVarA.a();
        return b5;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        this.f6919b.getClass();
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6919b.equals(((p) obj).f6919b);
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        return this.f6919b.hashCode();
    }
}

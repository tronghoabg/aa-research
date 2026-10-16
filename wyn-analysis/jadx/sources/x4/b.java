package X4;

import B4.d;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final Object f16119b;

    public b(Object obj) {
        gc.b.k(obj, "Argument must not be null");
        this.f16119b = obj;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f16119b.toString().getBytes(d.f1583a));
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f16119b.equals(((b) obj).f16119b);
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        return this.f16119b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f16119b + '}';
    }
}

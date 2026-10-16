package E4;

import java.security.MessageDigest;

/* renamed from: E4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437f implements B4.d {

    /* renamed from: b, reason: collision with root package name */
    public final B4.d f2877b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.d f2878c;

    public C0437f(B4.d dVar, B4.d dVar2) {
        this.f2877b = dVar;
        this.f2878c = dVar2;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        this.f2877b.b(messageDigest);
        this.f2878c.b(messageDigest);
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof C0437f) {
            C0437f c0437f = (C0437f) obj;
            if (this.f2877b.equals(c0437f.f2877b) && this.f2878c.equals(c0437f.f2878c)) {
                return true;
            }
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        return this.f2878c.hashCode() + (this.f2877b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f2877b + ", signature=" + this.f2878c + '}';
    }
}

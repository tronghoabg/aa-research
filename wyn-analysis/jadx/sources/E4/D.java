package E4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class D implements B4.d {

    /* renamed from: j, reason: collision with root package name */
    public static final W1.r f2841j = new W1.r(50);

    /* renamed from: b, reason: collision with root package name */
    public final F4.f f2842b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.d f2843c;

    /* renamed from: d, reason: collision with root package name */
    public final B4.d f2844d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2846f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2847g;

    /* renamed from: h, reason: collision with root package name */
    public final B4.g f2848h;

    /* renamed from: i, reason: collision with root package name */
    public final B4.k f2849i;

    public D(F4.f fVar, B4.d dVar, B4.d dVar2, int i5, int i10, B4.k kVar, Class cls, B4.g gVar) {
        this.f2842b = fVar;
        this.f2843c = dVar;
        this.f2844d = dVar2;
        this.f2845e = i5;
        this.f2846f = i10;
        this.f2849i = kVar;
        this.f2847g = cls;
        this.f2848h = gVar;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        Object objG;
        F4.f fVar = this.f2842b;
        synchronized (fVar) {
            F4.e eVar = (F4.e) fVar.f3848d;
            F4.h hVarE0 = (F4.h) ((ArrayDeque) eVar.f421a).poll();
            if (hVarE0 == null) {
                hVarE0 = eVar.e0();
            }
            F4.d dVar = (F4.d) hVarE0;
            dVar.f3842b = 8;
            dVar.f3843c = byte[].class;
            objG = fVar.g(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objG;
        ByteBuffer.wrap(bArr).putInt(this.f2845e).putInt(this.f2846f).array();
        this.f2844d.b(messageDigest);
        this.f2843c.b(messageDigest);
        messageDigest.update(bArr);
        B4.k kVar = this.f2849i;
        if (kVar != null) {
            kVar.b(messageDigest);
        }
        this.f2848h.b(messageDigest);
        W1.r rVar = f2841j;
        Class cls = this.f2847g;
        byte[] bytes = (byte[]) rVar.b(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(B4.d.f1583a);
            rVar.e(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f2842b.i(bArr);
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            D d3 = (D) obj;
            if (this.f2846f == d3.f2846f && this.f2845e == d3.f2845e && Y4.m.a(this.f2849i, d3.f2849i) && this.f2847g.equals(d3.f2847g) && this.f2843c.equals(d3.f2843c) && this.f2844d.equals(d3.f2844d) && this.f2848h.equals(d3.f2848h)) {
                return true;
            }
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        int iHashCode = ((((this.f2844d.hashCode() + (this.f2843c.hashCode() * 31)) * 31) + this.f2845e) * 31) + this.f2846f;
        B4.k kVar = this.f2849i;
        if (kVar != null) {
            iHashCode = (iHashCode * 31) + kVar.hashCode();
        }
        return this.f2848h.f1589b.hashCode() + ((this.f2847g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2843c + ", signature=" + this.f2844d + ", width=" + this.f2845e + ", height=" + this.f2846f + ", decodedResourceClass=" + this.f2847g + ", transformation='" + this.f2849i + "', options=" + this.f2848h + '}';
    }
}

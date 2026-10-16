package E4;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t implements B4.d {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2978d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f2979e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2980f;

    /* renamed from: g, reason: collision with root package name */
    public final B4.d f2981g;

    /* renamed from: h, reason: collision with root package name */
    public final Y4.d f2982h;

    /* renamed from: i, reason: collision with root package name */
    public final B4.g f2983i;

    /* renamed from: j, reason: collision with root package name */
    public int f2984j;

    public t(Object obj, B4.d dVar, int i5, int i10, Y4.d dVar2, Class cls, Class cls2, B4.g gVar) {
        gc.b.k(obj, "Argument must not be null");
        this.f2976b = obj;
        this.f2981g = dVar;
        this.f2977c = i5;
        this.f2978d = i10;
        gc.b.k(dVar2, "Argument must not be null");
        this.f2982h = dVar2;
        gc.b.k(cls, "Resource class must not be null");
        this.f2979e = cls;
        gc.b.k(cls2, "Transcode class must not be null");
        this.f2980f = cls2;
        gc.b.k(gVar, "Argument must not be null");
        this.f2983i = gVar;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2976b.equals(tVar.f2976b) && this.f2981g.equals(tVar.f2981g) && this.f2978d == tVar.f2978d && this.f2977c == tVar.f2977c && this.f2982h.equals(tVar.f2982h) && this.f2979e.equals(tVar.f2979e) && this.f2980f.equals(tVar.f2980f) && this.f2983i.equals(tVar.f2983i);
    }

    @Override // B4.d
    public final int hashCode() {
        if (this.f2984j == 0) {
            int iHashCode = this.f2976b.hashCode();
            this.f2984j = iHashCode;
            int iHashCode2 = ((((this.f2981g.hashCode() + (iHashCode * 31)) * 31) + this.f2977c) * 31) + this.f2978d;
            this.f2984j = iHashCode2;
            int iHashCode3 = this.f2982h.hashCode() + (iHashCode2 * 31);
            this.f2984j = iHashCode3;
            int iHashCode4 = this.f2979e.hashCode() + (iHashCode3 * 31);
            this.f2984j = iHashCode4;
            int iHashCode5 = this.f2980f.hashCode() + (iHashCode4 * 31);
            this.f2984j = iHashCode5;
            this.f2984j = this.f2983i.f1589b.hashCode() + (iHashCode5 * 31);
        }
        return this.f2984j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f2976b + ", width=" + this.f2977c + ", height=" + this.f2978d + ", resourceClass=" + this.f2979e + ", transcodeClass=" + this.f2980f + ", signature=" + this.f2981g + ", hashCode=" + this.f2984j + ", transformations=" + this.f2982h + ", options=" + this.f2983i + '}';
    }
}

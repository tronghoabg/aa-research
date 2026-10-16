package com.bumptech.glide.load.a;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am implements com.bumptech.glide.load.o {

    /* renamed from: b, reason: collision with root package name */
    private final Object f3020b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3021c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3022d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f3023e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f3024f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3025g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f3026h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.s f3027i;

    /* renamed from: j, reason: collision with root package name */
    private int f3028j;

    am(Object obj, com.bumptech.glide.load.o oVar, int i2, int i3, Map map, Class cls, Class cls2, com.bumptech.glide.load.s sVar) {
        com.bumptech.glide.g.p.f(obj);
        this.f3020b = obj;
        com.bumptech.glide.g.p.e(oVar, "Signature must not be null");
        this.f3025g = oVar;
        this.f3021c = i2;
        this.f3022d = i3;
        com.bumptech.glide.g.p.f(map);
        this.f3026h = map;
        com.bumptech.glide.g.p.e(cls, "Resource class must not be null");
        this.f3023e = cls;
        com.bumptech.glide.g.p.e(cls2, "Transcode class must not be null");
        this.f3024f = cls2;
        com.bumptech.glide.g.p.f(sVar);
        this.f3027i = sVar;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof am) {
            am amVar = (am) obj;
            if (this.f3020b.equals(amVar.f3020b) && this.f3025g.equals(amVar.f3025g) && this.f3022d == amVar.f3022d && this.f3021c == amVar.f3021c && this.f3026h.equals(amVar.f3026h) && this.f3023e.equals(amVar.f3023e) && this.f3024f.equals(amVar.f3024f) && this.f3027i.equals(amVar.f3027i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        int i2 = this.f3028j;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f3020b.hashCode();
        this.f3028j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.f3025g.hashCode()) * 31) + this.f3021c) * 31) + this.f3022d;
        this.f3028j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.f3026h.hashCode();
        this.f3028j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.f3023e.hashCode();
        this.f3028j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f3024f.hashCode();
        this.f3028j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.f3027i.hashCode();
        this.f3028j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        com.bumptech.glide.load.s sVar = this.f3027i;
        Map map = this.f3026h;
        com.bumptech.glide.load.o oVar = this.f3025g;
        Class cls = this.f3024f;
        Class cls2 = this.f3023e;
        return "EngineKey{model=" + this.f3020b.toString() + ", width=" + this.f3021c + ", height=" + this.f3022d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + oVar.toString() + ", hashCode=" + this.f3028j + ", transformations=" + map.toString() + ", options=" + sVar.toString() + "}";
    }
}

package com.bumptech.glide.load.a;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ay implements com.bumptech.glide.load.o {

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.g.m f3062b = new com.bumptech.glide.g.m(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3063c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3064d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3065e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3066f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f3067g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.s f3068h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.w f3069i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3070j;

    ay(com.bumptech.glide.load.a.a.j jVar, com.bumptech.glide.load.o oVar, com.bumptech.glide.load.o oVar2, int i2, int i3, com.bumptech.glide.load.w wVar, Class cls, com.bumptech.glide.load.s sVar) {
        this.f3070j = jVar;
        this.f3063c = oVar;
        this.f3064d = oVar2;
        this.f3065e = i2;
        this.f3066f = i3;
        this.f3069i = wVar;
        this.f3067g = cls;
        this.f3068h = sVar;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        com.bumptech.glide.load.a.a.j jVar = this.f3070j;
        byte[] bArr = (byte[]) jVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3065e).putInt(this.f3066f).array();
        this.f3064d.a(messageDigest);
        this.f3063c.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.w wVar = this.f3069i;
        if (wVar != null) {
            wVar.a(messageDigest);
        }
        this.f3068h.a(messageDigest);
        Class cls = this.f3067g;
        com.bumptech.glide.g.m mVar = f3062b;
        byte[] bytes = (byte[]) mVar.i(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(f3507a);
            mVar.j(cls, bytes);
        }
        messageDigest.update(bytes);
        jVar.c(bArr);
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof ay) {
            ay ayVar = (ay) obj;
            if (this.f3066f == ayVar.f3066f && this.f3065e == ayVar.f3065e && com.bumptech.glide.g.r.k(this.f3069i, ayVar.f3069i) && this.f3067g.equals(ayVar.f3067g) && this.f3063c.equals(ayVar.f3063c) && this.f3064d.equals(ayVar.f3064d) && this.f3068h.equals(ayVar.f3068h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        int iHashCode = (this.f3063c.hashCode() * 31) + this.f3064d.hashCode();
        com.bumptech.glide.load.w wVar = this.f3069i;
        int iHashCode2 = (((iHashCode * 31) + this.f3065e) * 31) + this.f3066f;
        if (wVar != null) {
            iHashCode2 = (iHashCode2 * 31) + wVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.f3067g.hashCode()) * 31) + this.f3068h.hashCode();
    }

    public final String toString() {
        com.bumptech.glide.load.s sVar = this.f3068h;
        com.bumptech.glide.load.w wVar = this.f3069i;
        Class cls = this.f3067g;
        com.bumptech.glide.load.o oVar = this.f3064d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.f3063c) + ", signature=" + String.valueOf(oVar) + ", width=" + this.f3065e + ", height=" + this.f3066f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(wVar) + "', options=" + String.valueOf(sVar) + "}";
    }
}

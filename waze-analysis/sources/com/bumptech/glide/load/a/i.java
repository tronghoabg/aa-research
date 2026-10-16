package com.bumptech.glide.load.a;

import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements com.bumptech.glide.load.o {

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3135b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3136c;

    i(com.bumptech.glide.load.o oVar, com.bumptech.glide.load.o oVar2) {
        this.f3135b = oVar;
        this.f3136c = oVar2;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        this.f3135b.a(messageDigest);
        this.f3136c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3135b.equals(iVar.f3135b) && this.f3136c.equals(iVar.f3136c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return (this.f3135b.hashCode() * 31) + this.f3136c.hashCode();
    }

    public final String toString() {
        com.bumptech.glide.load.o oVar = this.f3136c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.f3135b) + ", signature=" + String.valueOf(oVar) + "}";
    }
}

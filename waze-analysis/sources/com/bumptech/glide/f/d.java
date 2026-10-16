package com.bumptech.glide.f;

import com.bumptech.glide.g.p;
import com.bumptech.glide.load.o;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements o {

    /* renamed from: b, reason: collision with root package name */
    private final Object f2882b;

    public d(Object obj) {
        p.f(obj);
        this.f2882b = obj;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f2882b.toString().getBytes(f3507a));
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2882b.equals(((d) obj).f2882b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return this.f2882b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f2882b.toString() + "}";
    }
}

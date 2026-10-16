package com.bumptech.glide;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ad implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.manager.e f2752a = com.bumptech.glide.e.b.a.a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ad clone() {
        try {
            return (ad) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    final com.bumptech.glide.manager.e b() {
        return this.f2752a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ad) {
            return com.bumptech.glide.g.r.k(this.f2752a, ((ad) obj).f2752a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2752a.hashCode();
    }
}

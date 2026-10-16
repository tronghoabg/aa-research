package com.bumptech.glide.load.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x implements v {

    /* renamed from: a, reason: collision with root package name */
    private final String f3284a;

    x(String str) {
        this.f3284a = str;
    }

    @Override // com.bumptech.glide.load.b.v
    public final String a() {
        return this.f3284a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f3284a.equals(((x) obj).f3284a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3284a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.f3284a + "'}";
    }
}

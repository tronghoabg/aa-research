package com.bumptech.glide.load.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    int f2948a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2949b;

    /* renamed from: c, reason: collision with root package name */
    private Class f2950c;

    h(i iVar) {
        this.f2949b = iVar;
    }

    final void a(int i2, Class cls) {
        this.f2948a = i2;
        this.f2950c = cls;
    }

    @Override // com.bumptech.glide.load.a.a.m
    public final void b() {
        this.f2949b.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f2948a == hVar.f2948a && this.f2950c == hVar.f2950c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f2948a * 31;
        Class cls = this.f2950c;
        return i2 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f2948a + "array=" + String.valueOf(this.f2950c) + "}";
    }
}

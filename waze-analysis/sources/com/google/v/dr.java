package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dr implements dg<dr> {

    /* renamed from: a, reason: collision with root package name */
    final eh f12870a;

    /* renamed from: b, reason: collision with root package name */
    final int f12871b;

    /* renamed from: c, reason: collision with root package name */
    final gm f12872c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f12873d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f12874e;

    dr(eh ehVar, int i2, gm gmVar, boolean z, boolean z2) {
        this.f12870a = ehVar;
        this.f12871b = i2;
        this.f12872c = gmVar;
        this.f12873d = z;
        this.f12874e = z2;
    }

    @Override // com.google.v.dg
    public final int a() {
        return this.f12871b;
    }

    @Override // com.google.v.dg
    public final gm b() {
        return this.f12872c;
    }

    @Override // com.google.v.dg
    public final gn c() {
        return this.f12872c.b();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f12871b - ((dr) obj).f12871b;
    }

    @Override // com.google.v.dg
    public final void d(Object obj, Object obj2) {
        ((dm) obj).mergeFrom((dm) obj2);
    }

    @Override // com.google.v.dg
    public final boolean e(Object obj) {
        return obj instanceof fi;
    }

    @Override // com.google.v.dg
    public final boolean f() {
        return this.f12874e;
    }

    @Override // com.google.v.dg
    public final boolean g() {
        return this.f12873d;
    }
}

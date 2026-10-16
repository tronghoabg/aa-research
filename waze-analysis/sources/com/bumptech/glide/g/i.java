package com.bumptech.glide.g;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f2904a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f2905b;

    i(j jVar) {
        this.f2904a = jVar;
    }

    @Override // com.bumptech.glide.g.j
    public final Object a() {
        if (this.f2905b == null) {
            synchronized (this) {
                if (this.f2905b == null) {
                    Object objA = this.f2904a.a();
                    p.f(objA);
                    this.f2905b = objA;
                }
            }
        }
        return this.f2905b;
    }
}

package com.google.l.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12361a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f12362b;

    d(Object obj, int i2) {
        this.f12361a = i2;
        this.f12362b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.l.f, java.lang.Object] */
    @Override // com.google.l.b.w
    public final Object a() {
        int i2 = this.f12361a;
        ?? r1 = this.f12362b;
        if (i2 != 0) {
            return r1.a();
        }
        throw new com.google.l.j((String) r1);
    }
}

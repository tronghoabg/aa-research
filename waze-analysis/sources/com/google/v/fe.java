package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fe<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final fd f12953a;

    private fe(gm gmVar, Object obj, gm gmVar2, Object obj2) {
        this.f12953a = new fd(gmVar, obj, gmVar2, obj2);
    }

    static int b(fd fdVar, Object obj, Object obj2) {
        return dh.a(fdVar.f12949a, 1, obj) + dh.a(fdVar.f12951c, 2, obj2);
    }

    public static fe d(gm gmVar, Object obj, gm gmVar2, Object obj2) {
        return new fe(gmVar, obj, gmVar2, obj2);
    }

    static void e(ae aeVar, fd fdVar, Object obj, Object obj2) {
        dh.p(aeVar, fdVar.f12949a, 1, obj);
        dh.p(aeVar, fdVar.f12951c, 2, obj2);
    }

    public final int a(int i2, Object obj, Object obj2) {
        return ae.U(i2) + ae.L(b(this.f12953a, obj, obj2));
    }

    final fd c() {
        return this.f12953a;
    }
}

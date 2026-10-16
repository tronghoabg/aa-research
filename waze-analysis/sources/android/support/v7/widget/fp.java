package android.support.v7.widget;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1500a;

    public fp(byte[] bArr) {
        this.f1500a = h.g.a(new android.support.v4.a.a.c(4));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.widget.fq, java.lang.Object] */
    public final fq a() {
        return this.f1500a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final android.support.v4.a.a.e b(android.support.v4.a.a.b bVar) {
        h.g.b.x.f(bVar, "ki");
        bVar.a();
        return ((Set) this.f1500a.getValue()).contains(bVar.a()) ? android.support.v4.a.a.e.f83b : android.support.v4.a.a.e.f85d;
    }

    public fp() {
        this.f1500a = new fo();
    }
}

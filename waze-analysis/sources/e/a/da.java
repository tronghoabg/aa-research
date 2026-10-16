package e.a;

import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private c f47318a;

    /* renamed from: b, reason: collision with root package name */
    private Object f47319b;

    /* renamed from: c, reason: collision with root package name */
    private Object f47320c;

    da() {
        this.f47319b = eg.c(Collections.EMPTY_LIST);
        this.f47318a = c.f46513a;
    }

    public final db a() {
        return new db((eg) this.f47319b, this.f47318a, (cy) this.f47320c);
    }

    public final void b(eg egVar) {
        this.f47319b = egVar;
    }

    public final void c(c cVar) {
        this.f47318a = cVar;
    }

    public final void d(cy cyVar) {
        this.f47320c = cyVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final bp e() {
        return new bp(this.f47319b, this.f47318a, this.f47320c);
    }

    public final void f(List list) {
        this.f47319b = list;
    }

    public final void g(c cVar) {
        this.f47318a = cVar;
    }

    public final void h(Object obj) {
        this.f47320c = obj;
    }

    da(byte[] bArr) {
        this.f47318a = c.f46513a;
    }
}

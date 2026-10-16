package c.b;

import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1718a;

    private d(Object obj) {
        this.f1718a = obj;
    }

    public static c a(Object obj) {
        r.f(obj, "instance cannot be null");
        return new d(obj);
    }

    @Override // g.a.a, f.a.a
    public final T get() {
        return (T) this.f1718a;
    }
}

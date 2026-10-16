package okhttp3.internal.c;

import h.g.b.x;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Object obj) {
        super(jVar);
        x.f(jVar, "referent");
        this.f56017a = obj;
    }

    public final Object a() {
        return this.f56017a;
    }
}

package e.a;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final t f47846a = new t(new q(1, null), q.f47844a);

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f47847b = new ConcurrentHashMap();

    t(s... sVarArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            s sVar = sVarArr[i2];
            this.f47847b.put(sVar.c(), sVar);
        }
    }

    public static t b() {
        return f47846a;
    }

    public final s a(String str) {
        return (s) this.f47847b.get(str);
    }
}

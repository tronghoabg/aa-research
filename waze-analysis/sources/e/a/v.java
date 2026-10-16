package e.a;

import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static v f47848a;

    /* renamed from: b, reason: collision with root package name */
    private final List f47849b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private int f47850c = 0;

    v() {
    }

    public static synchronized v a() {
        v vVar;
        vVar = f47848a;
        if (vVar == null) {
            vVar = new v();
            f47848a = vVar;
        }
        return vVar;
    }

    public final synchronized List b() {
        this.f47850c++;
        return this.f47849b;
    }

    public final synchronized void c() {
    }
}

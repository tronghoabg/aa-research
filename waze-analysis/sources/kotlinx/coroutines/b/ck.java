package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51660a = new kotlinx.coroutines.e.ak("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51661b = new kotlinx.coroutines.e.ak("PENDING");

    public static final k a(ch chVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        int i3 = kotlinx.coroutines.ai.f51347a;
        return ((i2 < 0 && i2 != -2) || aVar != kotlinx.coroutines.a.a.f51272b) ? bu.b(chVar, jVar, i2, aVar) : chVar;
    }

    public static final bn b(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.b.a.ab.f51383a;
        }
        return new cj(obj);
    }
}

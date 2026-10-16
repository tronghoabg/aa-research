package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cg {

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51802b = new kotlinx.coroutines.e.ak("COMPLETING_ALREADY");

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.e.ak f51801a = new kotlinx.coroutines.e.ak("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51803c = new kotlinx.coroutines.e.ak("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51804d = new kotlinx.coroutines.e.ak("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51805e = new kotlinx.coroutines.e.ak("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final az f51806f = new az(false);

    /* renamed from: g, reason: collision with root package name */
    private static final az f51807g = new az(true);

    public static final Object a(Object obj) {
        return obj instanceof bl ? new bm((bl) obj) : obj;
    }

    public static final Object b(Object obj) {
        bl blVar;
        bm bmVar = obj instanceof bm ? (bm) obj : null;
        return (bmVar == null || (blVar = bmVar.f51760a) == null) ? obj : blVar;
    }
}

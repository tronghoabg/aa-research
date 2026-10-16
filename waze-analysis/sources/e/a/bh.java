package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private final String f46485a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f46486b;

    private bh(String str, Object obj) {
        this.f46485a = str;
        this.f46486b = obj;
    }

    public static bh b() {
        return new bh("internal:health-check-consumer-listener", null);
    }

    public static bh c(Object obj) {
        return new bh("internal:disable-subchannel-reconnect", obj);
    }

    public final String toString() {
        return this.f46485a;
    }
}

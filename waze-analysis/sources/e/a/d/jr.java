package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jr implements gr {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47245a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47246b;

    private jr(jp jpVar, int i2) {
        this.f47245a = i2;
        this.f47246b = jpVar;
    }

    public static jr c(jp jpVar) {
        return new jr(jpVar, 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e.a.d.jp, java.lang.Object] */
    @Override // e.a.d.gr
    public final Object a() {
        int i2 = this.f47245a;
        ?? r1 = this.f47246b;
        return i2 != 0 ? r1 : jq.a(r1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e.a.d.jp, java.lang.Object] */
    @Override // e.a.d.gr
    public final void b(Object obj) {
        if (this.f47245a != 0) {
            return;
        }
        jq.f(this.f47246b, obj);
    }

    public jr(Object obj, int i2) {
        this.f47245a = i2;
        this.f47246b = obj;
    }
}

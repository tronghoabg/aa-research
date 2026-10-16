package h.a;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f48008a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48009b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f48009b = i2;
        this.f48008a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f48009b != 0) {
            return a.toString$lambda$0((a) this.f48008a, obj);
        }
        return m.toString$lambda$0((m) this.f48008a, (Map.Entry) obj);
    }
}

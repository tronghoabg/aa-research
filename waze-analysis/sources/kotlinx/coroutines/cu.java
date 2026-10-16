package kotlinx.coroutines;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cu implements h.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f51818a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f51819b;

    cu(int i2, List list) {
        this.f51818a = i2;
        this.f51819b = list;
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        return aj.R(this.f51819b, this.f51818a + 1);
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return (StackTraceElement) this.f51819b.get(this.f51818a);
    }
}

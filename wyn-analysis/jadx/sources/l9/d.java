package L9;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class d implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7044a;

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f7045b;

    public /* synthetic */ d(int i5, G9.e eVar) {
        this.f7044a = i5;
        this.f7045b = eVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f7044a) {
            case 0:
                Executor executor = (Executor) this.f7045b.f4685b;
                Fe.b.l(executor);
                return executor;
            case 1:
                Executor executor2 = (Executor) this.f7045b.f4686c;
                Fe.b.l(executor2);
                return executor2;
            default:
                Executor executor3 = (Executor) this.f7045b.f4687d;
                Fe.b.l(executor3);
                return executor3;
        }
    }
}

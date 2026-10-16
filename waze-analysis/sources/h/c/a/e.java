package h.c.a;

import h.c.j;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f48049a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f48050b;

    /* renamed from: c, reason: collision with root package name */
    private int f48051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h.c.e eVar, j jVar, p pVar, Object obj) {
        super(eVar, jVar);
        this.f48049a = pVar;
        this.f48050b = obj;
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        int i2 = this.f48051c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f48051c = 2;
            e.b.c.b(obj);
            return obj;
        }
        this.f48051c = 1;
        e.b.c.b(obj);
        e eVar = this;
        p pVar = this.f48049a;
        x.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        au.h(pVar, 2);
        return pVar.invoke(this.f48050b, eVar);
    }
}

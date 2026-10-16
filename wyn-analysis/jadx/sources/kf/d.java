package kf;

import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import lf.AbstractC3464c;
import tf.p;

/* loaded from: classes5.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public int f39720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f39721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3103c f39722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h, p pVar, InterfaceC3103c interfaceC3103c2) {
        super(interfaceC3103c, interfaceC3108h);
        this.f39721b = pVar;
        this.f39722c = interfaceC3103c2;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f39720a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f39720a = 2;
            Fe.e.U(obj);
            return obj;
        }
        this.f39720a = 1;
        Fe.e.U(obj);
        p pVar = this.f39721b;
        AbstractC3340k.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        K.e(2, pVar);
        return pVar.invoke(this.f39722c, this);
    }
}
